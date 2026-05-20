import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*
import FluentErrReason.*

def renderFieldStub(field: Field, msg: FluentErr)(using
    NamingPolicy,
    RenderingContext
) =
  renderComment(field.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.getMessage}\")")
  line(s"private def ${camelify(field.name)}__ = ???")


def renderRecord(
    ns: AugmentedNamespace,
    record: AugmentedRecord
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
)(using reporter: ClassReporter): WithEffects[Unit] =
  WithEffects.collect: coll =>
    val cType = record.cType
    coll.add(
      Effect.RequiresImport(
        namingPolicy.namespaceToInternalPackage(ns.name.get),
        cType
      )
    )

    val data = s"(raw: Ptr[${cType}])"

    val classHeader =
      s"class ${record.name} private[gnome] $data"

    val classHasAnyMembers =
      record.methods.nonEmpty

    val structContext = globalKnowledge.targetTypes
      .inStruct(cType)
      .getOrElse(raise(StructTargetTypesMissing(cType)))

    renderComment(record.doc)
    block(
      classHeader + ":",
      s"end ${record.name}"
    ):
      emptyLine()
      line(
        s"def getUnsafeRawPointer(): Ptr[${cType}] = this.raw"
      )

      val opts = TypeRenderingOptions.default.copy(useRuntimeZone = false)

      def givenParams(eff: List[Effect]) =
        val zone = Option
          .when(eff.contains(Effect.RequiresZone))("Zone")
        val runtime = Option
          .when(eff.contains(Effect.RequiresRuntime))("Runtime")

        val all = zone.toSeq ++ runtime.toSeq

        if all.isEmpty then "" else s"(using ${all.mkString(", ")})"
      end givenParams

      record.fields.foreach: field =>
        val fieldErr = transact[FluentErr]:
          inContext(s"field ${field.name}"):
            val targetType = structContext
              .getParamType(field.name)
              .getOrElse(raiseOther(s"Field ${field.name} has no target types"))

            emptyLine()

            val scalaGetterName = escape(camelify(field.name))
            val scalaSetterName = camelify(field.name) + "_="

            val readable = field.readable.contains(
              Number1Value13
            ) || field.readable.isEmpty
            val writable = field.writable.contains(Number1Value12)
            val isPrivate = field.privateValue.contains(Number1Value14)

            if !isPrivate then
              if readable then
                val returnType = renderType(
                  field.tpe.getOrElse(raiseOther("Field is missing <type>")),
                  position = TypePosition.ReturnType,
                  opts = opts
                )
                coll.addAll(returnType.effects)
                val returnExpr =
                  s"(!raw).${escape(field.name)}.asInstanceOf[$targetType]"
                renderComment(field.doc)
                line(
                  s"def ${scalaGetterName}${givenParams(returnType.effects)}: ${returnType.scalaRepr} = $returnExpr"
                )
              end if

              if writable then
                val pType = renderType(
                  field.tpe.getOrElse(raiseOther("Field is missing <type>")),
                  position = TypePosition.ParameterType,
                  opts = opts
                ).withMassageIntoUnsafe(Massage.Cast(targetType))

                coll.addAll(pType.effects)
                val expr = pType.intoUnsafeForm("value")
                renderComment(field.doc)
                line(
                  s"def ${scalaSetterName}(value: ${pType.scalaRepr})${{
                      givenParams(pType.effects)
                    }} : Unit = (!raw).${field.name}_=($expr)"
                )
              end if
            end if
        end fieldErr

        fieldErr.foreach: err =>
          renderFieldStub(field, err)

      val toRender = coll.observe(getRenderableMethods(record))

      toRender
        .foreach: (meth, opts) =>
          transact[FluentErr]:
            inContext(s"method ${meth.name}"):
              filterDefinitions(
                namespace = Some(ns),
                record = Some(record),
                method = Some(meth)
              )
              coll.observe(
                renderClassMethod(
                  MethodLocation.Record(record),
                  meth,
                  opts
                )
              )
              reporter.recordMethod(meth.name, ReportResult.Success)
          .foreach: err =>
            renderMethodStub(meth, err)
            reporter.recordMethod(
              meth.name,
              ReportResult.Failure(err.getMessage)
            )

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

    handleExceptions:
      emptyLine()
      coll.observe(renderRecordCompanionObject(ns, record))

def renderRecordCompanionObject(
    ns: AugmentedNamespace,
    record: AugmentedRecord
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
)(using reporter: ClassReporter): WithEffects[Unit] =
  WithEffects.collect: coll =>
    val cType = record.cType
    // coll.add(
    //   Effect.RequiresImport(
    //     namingPolicy.namespaceToInternalPackage(ns.name.get),
    //     cType
    //   )
    // )

    val data = s"(raw: Ptr[${cType}])"

    block(s"object ${record.name}:", s"end ${record.name}"):
      line(
        s"def fromRaw(ptr: Ptr[${cType}]): ${record.name} = new ${record.name}(ptr)"
      )

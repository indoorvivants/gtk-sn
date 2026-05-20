import rendition.*
import scala.scalanative.unsafe.name

def renderNamespace(
    r: RenderingStreams,
    namespace: AugmentedNamespace,
    global: GlobalKnowledge,
    policy: NamingPolicy,
    filters: Filters
)(using report: NamespaceReporter) =

  given GlobalKnowledge = global
  given NamingPolicy = policy

  val fluentPackageName = policy.namespaceToFluentPackage(namespace.name.get)
  val internalPackageName =
    policy.namespaceToInternalPackage(namespace.name.get)

  namespace.enumerations
    .filter(filters.shouldRenderEnum)
    .foreach: _enum =>
      val enumer = Renames(_enum)
      r.in(enumer.name + ".scala"):
        val newLB = LineBuilder()
        var error = Option.empty[FluentErr]
        val effects = WithEffects.collect: coll =>
          newLB.use:
            error = transact[FluentErr]:
              filterDefinitions(
                namespace = Some(namespace),
                enumer = Some(enumer)
              )
              coll.observe:
                inContext(s"${enumer.name}"):
                  renderEnumeration(enumer)

        error match
          case None =>

            line(s"package $fluentPackageName")
            emptyLine()
            line(s"import _root_.$internalPackageName.${enumer.typeValue}")
            emptyLine()

            renderEffects(effects.effects)

            emptyLine()

            append(newLB)

            report.recordEnum(_enum.name, ReportResult.Success)

          case Some(msg) =>
            msg.log(s"Failed to render enumeration ${enumer.name}")
            report.recordEnum(
              enumer.name,
              ReportResult.Failure(msg.getMessage())
            )
        end match

  namespace.bitfields
    .filter(filters.shouldRenderBitfield)
    .foreach: bitfield =>
      r.in(bitfield.name + ".scala"):
        val newLB = LineBuilder()
        var error = Option.empty[FluentErr]

        val effects = WithEffects.collect: coll =>
          newLB.use:
            error = transact[FluentErr]:
              filterDefinitions(
                namespace = Some(namespace),
                bitfield = Some(bitfield)
              )
              coll.observe:
                inContext(s"${bitfield.name}"):
                  renderBitfield(bitfield)

        error match
          case None =>
            line(s"package $fluentPackageName")
            emptyLine()
            line(s"import _root_.$internalPackageName.${bitfield.typeValue}")
            emptyLine()

            renderEffects(effects.effects)

            emptyLine()

            append(newLB)

            report.recordBitfield(bitfield.name, ReportResult.Success)

          case Some(msg) =>
            msg.log(s"Failed to render bitfield ${bitfield.name}")
            report.recordBitfield(
              bitfield.name,
              ReportResult.Failure(msg.getMessage())
            )
        end match

  namespace.interfaces
    .filter(filters.shouldRenderIface)
    .foreach: iface =>
      r.in(iface.name + ".scala"):
        val newLB = LineBuilder()
        var error = Option.empty[FluentErr]

        val effects = WithEffects.collect: coll =>
          newLB.use:
            error = transact[FluentErr]:
              inContext(iface.name):
                filterDefinitions(
                  namespace = Some(namespace),
                  iface = Some(iface)
                )
                report.inInterface(iface.name):
                  coll.observe(renderTrait(namespace, iface))

        error match
          case None =>
            line(s"package $fluentPackageName")
            emptyLine()
            line(s"import _root_.$internalPackageName.*")
            emptyLine()
            line(s"import _root_.scala.scalanative.unsafe.*")
            emptyLine()

            renderEffects(effects.effects)

            emptyLine()

            append(newLB)

          case Some(msg) =>
            msg.log(s"Failed to render interface ${iface.name}")
            report.recordInterface(
              iface.name,
              ReportResult.Failure(msg.getMessage())
            )
        end match

  namespace.classes
    .filter(filters.shouldRenderClass)
    .foreach: cls =>
      r.in(cls.name + ".scala"):
        val newLB = LineBuilder()
        var error = Option.empty[FluentErr]

        val effects = WithEffects.collect: coll =>
          newLB.use:
            error = transact[FluentErr]:
              inContext(cls.name):
                filterDefinitions(namespace = Some(namespace), cls = Some(cls))
                report.inClass(cls.name):
                  coll.observe(renderClass(namespace, cls))

        error match
          case None =>
            line(s"package $fluentPackageName")
            emptyLine()
            line(s"import _root_.$internalPackageName.*")
            emptyLine()
            line(s"import _root_.scala.scalanative.unsafe.*")
            emptyLine()

            renderEffects(effects.effects)

            emptyLine()

            append(newLB)

          case Some(msg) =>
            report.recordClass(cls.name, ReportResult.Failure(msg.getMessage()))
            scribe.warn(s"Failed to render class ${cls.name}: `$msg`")
        end match

  namespace.records
    .filter(filters.shouldRenderRecord)
    .foreach: cls =>
      r.in(cls.name + ".scala"):
        val newLB = LineBuilder()
        var error = Option.empty[FluentErr]

        val effects = WithEffects.collect: coll =>
          newLB.use:
            error = transact[FluentErr]:
              inContext(cls.name):
                filterDefinitions(
                  namespace = Some(namespace),
                  record = Some(cls)
                )
                report.inClass(cls.name):
                  coll.observe(renderRecord(namespace, cls))

        error match
          case None =>
            line(s"package $fluentPackageName")
            emptyLine()
            line(s"import _root_.$internalPackageName.*")
            emptyLine()
            line(s"import _root_.scala.scalanative.unsafe.*")
            emptyLine()

            renderEffects(effects.effects)

            emptyLine()

            append(newLB)

          case Some(msg) =>
            report.recordClass(cls.name, ReportResult.Failure(msg.getMessage()))
            msg.log(s"Failed to render record ${cls.name}")
        end match

  namespace.name.foreach: nsName =>
    r.in(nsName + ".scala"):
      val newLB = LineBuilder()
      var error = Option.empty[FluentErr]

      val effects = WithEffects.collect: coll =>
        newLB.use:
          error = transact[FluentErr]:
            coll.observe(renderNamespaceCompanion(namespace))

      error match
        case None =>
          line(s"package $fluentPackageName")
          emptyLine()
          line(s"import _root_.$internalPackageName.*")
          emptyLine()
          line(s"import _root_.scala.scalanative.unsafe.*")
          emptyLine()

          renderEffects(effects.effects)

          emptyLine()

          append(newLB)

        case Some(msg) =>
          scribe.warn(s"Failed to render namespace companion ${nsName}: `$msg`")
      end match

end renderNamespace

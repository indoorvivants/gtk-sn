import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderClassCompanionObject(
    ns: AugmentedNamespace,
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
)(using reporter: ClassReporter) =
  WithEffects.collect: coll =>
    val objectHeader = s"object ${cls.name}"
    emptyLine()
    block(objectHeader + ":", s"end ${cls.name}"):
      coll.add(Effect.needsGobjectRuntime)
      renderComment(
        "Creates or retrieves the wrapper object associated with the given pointer"
      )
      line(
        s"def applyUnsafe(ptr: Ptr[${cls.cType}])(using Runtime) = summon[Runtime].getOrCreate[${cls.name}](ptr.asInstanceOf[Ptr[Byte]], p => new ${cls.name}(ptr))"
      )
      emptyLine()
      cls.constructors.foreach: constructor =>
        transact[FluentErr]:
          inContext(s"constructor ${constructor.name}"):
            filterDefinitions(
              namespace = Some(ns),
              cls = Some(cls),
              constructor = Some(constructor)
            )
            coll.observe(renderClassConstructor(cls, constructor))
            reporter.recordConstructor(constructor.name, ReportResult.Success)
        .foreach: err =>
          renderConstructorStub(constructor, err)
          reporter.recordConstructor(constructor.name, ReportResult(err))

      cls.functions.foreach: function =>
        transact[FluentErr]:
          inContext(s"function ${function.name}"):
            filterDefinitions(
              namespace = Some(ns),
              cls = Some(cls),
              function = Some(function)
            )
            coll.observe(
              renderStaticMethod(StaticMethodLocation.Klass(cls), function)
            )
            reporter.recordFunction(function.name, ReportResult.Success)
        .foreach: err =>
          renderFunctionStub(function, err)
          reporter.recordFunction(function.name, ReportResult(err))

      cls.constants
        .foreach: constant =>
          transact[FluentErr]:
            inContext(s"${constant.name}:"):
              filterDefinitions(
                namespace = Some(ns),
                constant = Some(constant)
              )
              coll.observe(renderConstant(constant))
              reporter.recordConstant(constant.name, ReportResult.Success)
          .foreach: err =>
            renderConstantStub(constant, err)
            reporter.recordConstant(constant.name, ReportResult(err))

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

end renderClassCompanionObject

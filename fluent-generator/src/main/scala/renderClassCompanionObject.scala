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
) =
  WithEffects.collect: coll =>
    val objectHeader = s"object ${cls.name}"
    emptyLine()
    block(objectHeader + ":", s"end ${cls.name}"):
      coll.add(Effect.needsGobjectRuntime)
      line(
        s"def applyUnsafe(ptr: Ptr[${cls.cType}])(using Runtime) = summon[Runtime].getOrCreate[${cls.name}](ptr.asInstanceOf[Ptr[Byte]], p => new ${cls.name}(ptr))"
      )
      emptyLine()
      cls.constructors.foreach: constructor =>
        transact[FluentErr]:
          filterDefinitions(
            namespace = Some(ns),
            cls = Some(cls),
            constructor = Some(constructor)
          )
          handleExceptions(
            coll.observe(renderClassConstructor(cls, constructor))
          )
        .foreach(renderConstructorStub(constructor, _))

      cls.functions.foreach: function =>
        transact[FluentErr]:
          filterDefinitions(
            namespace = Some(ns),
            cls = Some(cls),
            function = Some(function)
          )
          handleExceptions(
            coll.observe(renderStaticMethod(function))
          )
        .foreach(renderFunctionStub(function, _))

      cls.constants
        .foreach: constant =>
          transact[FluentErr]:
            inContext(s"${constant.name}:"):
              filterDefinitions(
                namespace = Some(ns),
                constant = Some(constant)
              )
              coll.observe(renderConstant(constant))
          .foreach(renderConstantStub(constant, _))

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

end renderClassCompanionObject

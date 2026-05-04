import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderClassCompanionObject(
    ns: AugmentedNamespace,
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy
) =
  WithEffects.collect: coll =>
    val objectHeader = s"object ${cls.name}"
    val objectHasAnyMembers =
      cls.constructors.nonEmpty || cls.functions.nonEmpty

    if objectHasAnyMembers then
      emptyLine()
      block(objectHeader + ":", s"end ${cls.name}"):
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

        coll
          .effectsSoFar()
          .distinct
          .collect:
            case Effect.RequiresDefinition(df) =>
              emptyLine()
              df()

    end if

end renderClassCompanionObject

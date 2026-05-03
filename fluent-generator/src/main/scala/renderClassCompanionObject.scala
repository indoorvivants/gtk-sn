import rendition.*
import util.boundary.*

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
    val objectHasAnyMembers = cls.constructors.nonEmpty || cls.functions.nonEmpty

    if objectHasAnyMembers then
      emptyLine()
      block(objectHeader + ":", s"end ${cls.name}"):
        cls.constructors.foreach: constructor =>
          filterDefinitions(
            namespace = Some(ns),
            cls = Some(cls),
            constructor = Some(constructor)
          ) match
            case None =>
              val result =
                transact[FluentErr]:
                  handleExceptions(
                    coll.observe(renderClassConstructor(cls, constructor))
                  )

              result.foreach: msg =>
                scribe.warn(
                  s"Failed to render constructor for class ${cls.name}, ${constructor.name}: `$msg`"
                )

            case Some(value) =>
              renderComment(constructor.doc)
              line(s"@annotation.compileTimeOnly(\"$value\")")
              line(s"def ${safeConstructorName(constructor.name)}() = ???")
              emptyLine()

        cls.functions.foreach: function =>
          filterDefinitions(
            namespace = Some(ns),
            cls = Some(cls),
            function = Some(function)
          ) match
            case None =>
              val result =
                transact[FluentErr]:
                  handleExceptions(
                    coll.observe(renderStaticMethod(cls, function))
                  )

              result.foreach: msg =>
                scribe.warn(
                  s"Failed to render static method for class ${cls.name}, ${function.name}: `$msg`"
                )

            case Some(value) =>
              renderComment(function.doc)
              line(s"@annotation.compileTimeOnly(\"$value\")")
              line(s"def ${function.name}() = ???")
              emptyLine()


        coll
          .effectsSoFar()
          .distinct
          .collect:
            case Effect.RequiresDefinition(df) =>
              emptyLine()
              df()

    end if

end renderClassCompanionObject

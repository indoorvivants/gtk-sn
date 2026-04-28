import rendition.*
import util.boundary.*

def renderClassCompanionObject(
    ns: AugmentedNamespace,
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[String]
) =
  WithEffects.collect: coll =>
    val objectHeader = s"object ${cls.name}"
    val objectHasAnyMembers = cls.constructors.nonEmpty

    if objectHasAnyMembers then
      transact["no constructors"]:
        emptyLine()
        block(objectHeader + ":", s"end ${cls.name}"):
          var atLeastOneConstructor = false
          cls.constructors.foreach: constructor =>
            filterDefinitions(
              namespace = Some(ns),
              cls = Some(cls),
              constructor = Some(constructor)
            ) match
              case None =>
                val result =
                  transact[String]:
                    handleExceptions(coll.observe(renderClassConstructor(cls, constructor)))

                result.foreach: msg =>
                  scribe.warn(
                    s"Failed to render constructor for class ${cls.name}, ${constructor.name}: `$msg`"
                  )

                atLeastOneConstructor = atLeastOneConstructor || result.isEmpty
              case Some(value) =>
                line("// " + value)
                emptyLine()
          // roll back whole rendering of companion object if it's empty
          if !atLeastOneConstructor then break("no constructors")

          coll
            .effectsSoFar()
            .distinct
            .collect:
              case Effect.RequiresDefinition(df) =>
                emptyLine()
                df()

    end if

end renderClassCompanionObject

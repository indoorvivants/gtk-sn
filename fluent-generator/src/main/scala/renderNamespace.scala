import rendition.*

def renderNamespace(
    r: RenderingStreams,
    namespace: AugmentedNamespace,
    global: GlobalKnowledge,
    policy: NamingPolicy
) =

  given GlobalKnowledge = global
  given NamingPolicy = policy

  val fluentPackageName = policy.namespaceToFluentPackage(namespace.name.get)
  val internalPackageName = policy.namespaceToInternalPackage(namespace.name.get)

  val filteredInterfaces =
    namespace.interfaces.flatMap: iface =>
      filterDefinitions(namespace = Some(namespace), iface = Some(iface)) match
        case None => Some(iface)
        case Some(value) =>
          scribe.warn(s"Filtering out interface ${iface.name}: $value")
          None

  filteredInterfaces.map: iface =>
    r.in(iface.name + ".scala"):
      val newLB = LineBuilder()
      var error = Option.empty[FluentErr]

      val effects = WithEffects.collect: coll =>
        newLB.use:
          error = transact[FluentErr]:
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
          msg.log(s"Failed to render class ${iface.name}")
      end match

  val filteredClasses =
    namespace.classes.flatMap: cls =>
      filterDefinitions(namespace = Some(namespace), cls = Some(cls)) match
        case None => Some(cls)
        case Some(value) =>
          scribe.warn(s"Filtering out class ${cls.name}: $value")
          None

  filteredClasses.map: cls =>
    r.in(cls.name + ".scala"):
      val newLB = LineBuilder()
      var error = Option.empty[FluentErr]

      val effects = WithEffects.collect: coll =>
        newLB.use:
          error = transact[FluentErr]:
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
          scribe.warn(s"Failed to render class ${cls.name}: `$msg`")
      end match

end renderNamespace

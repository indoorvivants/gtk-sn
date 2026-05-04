import rendition.*
import scala.scalanative.unsafe.name

def renderNamespace(
    r: RenderingStreams,
    namespace: AugmentedNamespace,
    global: GlobalKnowledge,
    policy: NamingPolicy
) =

  given GlobalKnowledge = global
  given NamingPolicy = policy

  val fluentPackageName = policy.namespaceToFluentPackage(namespace.name.get)
  val internalPackageName =
    policy.namespaceToInternalPackage(namespace.name.get)

  namespace.enumerations.foreach: _enum =>
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
            coll.observe(renderEnumeration(enumer))

      error match
        case None =>
          line(s"package $fluentPackageName")
          emptyLine()
          line(s"import _root_.$internalPackageName.${enumer.typeValue}")
          emptyLine()

          renderEffects(effects.effects)

          emptyLine()

          append(newLB)

        case Some(msg) =>
          msg.log(s"Failed to render enumeration ${enumer.name}")
      end match

  namespace.bitfields.foreach: bitfield =>
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
            coll.observe(renderBitfield(bitfield))

      error match
        case None =>
          line(s"package $fluentPackageName")
          emptyLine()
          line(s"import _root_.$internalPackageName.${bitfield.typeValue}")
          emptyLine()

          renderEffects(effects.effects)

          emptyLine()

          append(newLB)

        case Some(msg) =>
          msg.log(s"Failed to render bitfield ${bitfield.name}")
      end match

  namespace.interfaces.foreach: iface =>
    r.in(iface.name + ".scala"):
      val newLB = LineBuilder()
      var error = Option.empty[FluentErr]

      val effects = WithEffects.collect: coll =>
        newLB.use:
          error = transact[FluentErr]:
            filterDefinitions(namespace = Some(namespace), iface = Some(iface))
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

  namespace.classes.foreach: cls =>
    r.in(cls.name + ".scala"):
      val newLB = LineBuilder()
      var error = Option.empty[FluentErr]

      val effects = WithEffects.collect: coll =>
        newLB.use:
          error = transact[FluentErr]:
            filterDefinitions(namespace = Some(namespace), cls = Some(cls))
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

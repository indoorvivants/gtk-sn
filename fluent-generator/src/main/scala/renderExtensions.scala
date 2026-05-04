import com.indoorvivants.gnome.gir_schema.*

import rendition.*
import util.boundary.* 

import FluentErrReason.*

def renderClassExtensions(
    selfName: String,
    parent: Option[String],
    impl: Seq[Implements]
)(using
    Label[FluentErr],
    GlobalKnowledge
): WithEffects[String] =
  WithEffects.collect: coll =>
    val parentExt = parent.map: name =>
      summon[GlobalKnowledge].names.get(name) match
        case None        => raise(NoGlobalNameFor(name))
        case Some(value) =>
          value.tpe match
            case NameType.Class =>
              if selfName != value.short then
                coll.addAll(value.effects)
                s"${value.short}(raw.asInstanceOf)"
              else
                val newEffects = value.effects.map:
                  case r @ Effect.RequiresImport(ns, deff)
                      if deff == selfName =>
                    Effect.RequiresRenamedImport(ns, deff, "_" + deff)

                  case other => other

                coll.addAll(newEffects)

                s"_${value.short}(raw.asInstanceOf)"

            case other =>
              raise(UnexpectedClassParent(selfName, value))

    val ext = parentExt.toSeq ++ impl
      .map(_.name)
      .map: name =>
        val gname = summon[GlobalKnowledge].names
          .get(name)
          .getOrElse(raise(NoGlobalNameFor(name)))
        coll.addAll(gname.effects)
        gname.short

    if ext.nonEmpty then " extends " + ext.mkString(", ")
    else ""

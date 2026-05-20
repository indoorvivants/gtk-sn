package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkTreeModelFlags

/** These flags indicate various properties of a `GtkTreeModel`.
  *
  * They are returned by [method@Gtk.TreeModel.get_flags], and must be static
  * for the lifetime of the object. A more complete description of
  * %GTK_TREE_MODEL_ITERS_PERSIST can be found in the overview of this section.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeModelFlags private (val raw: GtkTreeModelFlags):
  def is(kv: TreeModelFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[TreeModelFlags.KnownValue]
    TreeModelFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TreeModelFlags(${sb.result().mkString(", ")})"
end TreeModelFlags

object TreeModelFlags:
  export KnownValue.*

  def fromRaw(raw: GtkTreeModelFlags) = new TreeModelFlags(raw)

  extension (af: TreeModelFlags)
    def &(other: TreeModelFlags) =
      TreeModelFlags(af.raw & other.raw)
    def |(other: TreeModelFlags) =
      TreeModelFlags(af.raw | other.raw)

  /** These flags indicate various properties of a `GtkTreeModel`.
    *
    * They are returned by [method@Gtk.TreeModel.get_flags], and must be static
    * for the lifetime of the object. A more complete description of
    * %GTK_TREE_MODEL_ITERS_PERSIST can be found in the overview of this
    * section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GtkTreeModelFlags,
      name: scala.Predef.String
  ) extends TreeModelFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** iterators survive all signals emitted by the tree
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ITERS_PERSIST
        extends KnownValue(
          GtkTreeModelFlags.GTK_TREE_MODEL_ITERS_PERSIST,
          "ITERS_PERSIST"
        )

    /** the model is a list only, and never has children
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LIST_ONLY
        extends KnownValue(
          GtkTreeModelFlags.GTK_TREE_MODEL_LIST_ONLY,
          "LIST_ONLY"
        )
  end KnownValue
end TreeModelFlags

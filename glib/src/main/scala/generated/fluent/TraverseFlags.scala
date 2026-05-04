package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTraverseFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies which nodes are visited during several of the tree functions,
  * including g_node_traverse() and g_node_find().
  */
class TraverseFlags private (val raw: GTraverseFlags):
  def is(kv: TraverseFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TraverseFlags.KnownValue]
    TraverseFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TraverseFlags(${sb.result().mkString(", ")})"
end TraverseFlags

object TraverseFlags:
  export KnownValue.*

  def fromRaw(raw: GTraverseFlags) = new TraverseFlags(raw)

  extension (af: TraverseFlags)
    def &(other: TraverseFlags) =
      TraverseFlags(af.raw & other.raw)
    def |(other: TraverseFlags) =
      TraverseFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies which nodes are visited during several of the tree functions,
    * including g_node_traverse() and g_node_find().
    */
  enum KnownValue(override val raw: GTraverseFlags, name: String)
      extends TraverseFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * only leaf nodes should be visited. This name has been introduced in 2.6,
      * for older version use %G_TRAVERSE_LEAFS.
      */
    case LEAVES extends KnownValue(GTraverseFlags.G_TRAVERSE_LEAVES, "LEAVES")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * only non-leaf nodes should be visited. This name has been introduced in
      * 2.6, for older version use %G_TRAVERSE_NON_LEAFS.
      */
    case NON_LEAVES
        extends KnownValue(GTraverseFlags.G_TRAVERSE_NON_LEAVES, "NON_LEAVES")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * all nodes should be visited.
      */
    case ALL extends KnownValue(GTraverseFlags.G_TRAVERSE_ALL, "ALL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * a mask of all traverse flags.
      */
    case MASK extends KnownValue(GTraverseFlags.G_TRAVERSE_MASK, "MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * identical to %G_TRAVERSE_LEAVES.
      */
    case LEAFS extends KnownValue(GTraverseFlags.G_TRAVERSE_LEAFS, "LEAFS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * identical to %G_TRAVERSE_NON_LEAVES.
      */
    case NON_LEAFS
        extends KnownValue(GTraverseFlags.G_TRAVERSE_NON_LEAFS, "NON_LEAFS")
  end KnownValue
end TraverseFlags

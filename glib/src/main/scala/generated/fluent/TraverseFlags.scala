package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTraverseFlags

/** Specifies which nodes are visited during several of the tree functions,
  * including g_node_traverse() and g_node_find().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Specifies which nodes are visited during several of the tree functions,
    * including g_node_traverse() and g_node_find().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GTraverseFlags, name: String)
      extends TraverseFlags(raw):
    override def toString(): String = this.name

    /** only leaf nodes should be visited. This name has been introduced in 2.6,
      * for older version use %G_TRAVERSE_LEAFS.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEAVES extends KnownValue(GTraverseFlags.G_TRAVERSE_LEAVES, "LEAVES")

    /** only non-leaf nodes should be visited. This name has been introduced in
      * 2.6, for older version use %G_TRAVERSE_NON_LEAFS.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NON_LEAVES
        extends KnownValue(GTraverseFlags.G_TRAVERSE_NON_LEAVES, "NON_LEAVES")

    /** all nodes should be visited.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ALL extends KnownValue(GTraverseFlags.G_TRAVERSE_ALL, "ALL")

    /** a mask of all traverse flags.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MASK extends KnownValue(GTraverseFlags.G_TRAVERSE_MASK, "MASK")

    /** identical to %G_TRAVERSE_LEAVES.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEAFS extends KnownValue(GTraverseFlags.G_TRAVERSE_LEAFS, "LEAFS")

    /** identical to %G_TRAVERSE_NON_LEAVES.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NON_LEAFS
        extends KnownValue(GTraverseFlags.G_TRAVERSE_NON_LEAFS, "NON_LEAFS")
  end KnownValue
end TraverseFlags

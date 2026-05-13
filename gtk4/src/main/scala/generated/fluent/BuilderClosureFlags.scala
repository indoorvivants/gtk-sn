package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkBuilderClosureFlags

/** The list of flags that can be passed to gtk_builder_create_closure().
  *
  * New values may be added in the future for new features, so external
  * implementations of [iface@Gtk.BuilderScope] should test the flags for
  * unknown values and raise a %GTK_BUILDER_ERROR_INVALID_ATTRIBUTE error when
  * they encounter one.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BuilderClosureFlags private (val raw: GtkBuilderClosureFlags):
  def is(kv: BuilderClosureFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[BuilderClosureFlags.KnownValue]
    BuilderClosureFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"BuilderClosureFlags(${sb.result().mkString(", ")})"
end BuilderClosureFlags

object BuilderClosureFlags:
  export KnownValue.*

  def fromRaw(raw: GtkBuilderClosureFlags) = new BuilderClosureFlags(raw)

  extension (af: BuilderClosureFlags)
    def &(other: BuilderClosureFlags) =
      BuilderClosureFlags(af.raw & other.raw)
    def |(other: BuilderClosureFlags) =
      BuilderClosureFlags(af.raw | other.raw)

  /** The list of flags that can be passed to gtk_builder_create_closure().
    *
    * New values may be added in the future for new features, so external
    * implementations of [iface@Gtk.BuilderScope] should test the flags for
    * unknown values and raise a %GTK_BUILDER_ERROR_INVALID_ATTRIBUTE error when
    * they encounter one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkBuilderClosureFlags, name: String)
      extends BuilderClosureFlags(raw):
    override def toString(): String = this.name

    /** The closure should be created swapped. See g_cclosure_new_swap() for
      * details.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SWAPPED
        extends KnownValue(
          GtkBuilderClosureFlags.GTK_BUILDER_CLOSURE_SWAPPED,
          "SWAPPED"
        )
  end KnownValue
end BuilderClosureFlags

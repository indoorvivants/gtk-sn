package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkIconLookupFlags

/** Used to specify options for gtk_icon_theme_lookup_icon().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IconLookupFlags private (val raw: GtkIconLookupFlags):
  def is(kv: IconLookupFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[IconLookupFlags.KnownValue]
    IconLookupFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"IconLookupFlags(${sb.result().mkString(", ")})"
end IconLookupFlags

object IconLookupFlags:
  export KnownValue.*

  def fromRaw(raw: GtkIconLookupFlags) = new IconLookupFlags(raw)

  extension (af: IconLookupFlags)
    def &(other: IconLookupFlags) =
      IconLookupFlags(af.raw & other.raw)
    def |(other: IconLookupFlags) =
      IconLookupFlags(af.raw | other.raw)

  /** Used to specify options for gtk_icon_theme_lookup_icon().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkIconLookupFlags, name: String)
      extends IconLookupFlags(raw):
    override def toString(): String = this.name

    /** Try to always load regular icons, even when symbolic icon names are
      * given
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FORCE_REGULAR
        extends KnownValue(
          GtkIconLookupFlags.GTK_ICON_LOOKUP_FORCE_REGULAR,
          "FORCE_REGULAR"
        )

    /** Try to always load symbolic icons, even when regular icon names are
      * given
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FORCE_SYMBOLIC
        extends KnownValue(
          GtkIconLookupFlags.GTK_ICON_LOOKUP_FORCE_SYMBOLIC,
          "FORCE_SYMBOLIC"
        )

    /** Starts loading the texture in the background so it is ready when later
      * needed.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRELOAD
        extends KnownValue(
          GtkIconLookupFlags.GTK_ICON_LOOKUP_PRELOAD,
          "PRELOAD"
        )
  end KnownValue
end IconLookupFlags

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkStyleContextPrintFlags

/** Flags that modify the behavior of gtk_style_context_to_string().
  *
  * New values may be added to this enumeration.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StyleContextPrintFlags private (val raw: GtkStyleContextPrintFlags):
  def is(kv: StyleContextPrintFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[StyleContextPrintFlags.KnownValue]
    StyleContextPrintFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"StyleContextPrintFlags(${sb.result().mkString(", ")})"
end StyleContextPrintFlags

object StyleContextPrintFlags:
  export KnownValue.*

  def fromRaw(raw: GtkStyleContextPrintFlags) = new StyleContextPrintFlags(raw)

  extension (af: StyleContextPrintFlags)
    def &(other: StyleContextPrintFlags) =
      StyleContextPrintFlags(af.raw & other.raw)
    def |(other: StyleContextPrintFlags) =
      StyleContextPrintFlags(af.raw | other.raw)

  /** Flags that modify the behavior of gtk_style_context_to_string().
    *
    * New values may be added to this enumeration.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkStyleContextPrintFlags, name: String)
      extends StyleContextPrintFlags(raw):
    override def toString(): String = this.name

    /** Default value.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GtkStyleContextPrintFlags.GTK_STYLE_CONTEXT_PRINT_NONE,
          "NONE"
        )

    /** Print the entire tree of CSS nodes starting at the style context's node
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RECURSE
        extends KnownValue(
          GtkStyleContextPrintFlags.GTK_STYLE_CONTEXT_PRINT_RECURSE,
          "RECURSE"
        )

    /** Show the values of the CSS properties for each node
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SHOW_STYLE
        extends KnownValue(
          GtkStyleContextPrintFlags.GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE,
          "SHOW_STYLE"
        )

    /** Show information about what changes affect the styles
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SHOW_CHANGE
        extends KnownValue(
          GtkStyleContextPrintFlags.GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE,
          "SHOW_CHANGE"
        )
  end KnownValue
end StyleContextPrintFlags

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkDialogFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used to influence dialog construction.
  */
class DialogFlags private (val raw: GtkDialogFlags):
  def is(kv: DialogFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DialogFlags.KnownValue]
    DialogFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DialogFlags(${sb.result().mkString(", ")})"
end DialogFlags

object DialogFlags:
  export KnownValue.*

  def fromRaw(raw: GtkDialogFlags) = new DialogFlags(raw)

  extension (af: DialogFlags)
    def &(other: DialogFlags) =
      DialogFlags(af.raw & other.raw)
    def |(other: DialogFlags) =
      DialogFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used to influence dialog construction.
    */
  enum KnownValue(override val raw: GtkDialogFlags, name: String)
      extends DialogFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Make the constructed dialog modal
      */
    case MODAL extends KnownValue(GtkDialogFlags.GTK_DIALOG_MODAL, "MODAL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Destroy the dialog when its parent is destroyed
      */
    case DESTROY_WITH_PARENT
        extends KnownValue(
          GtkDialogFlags.GTK_DIALOG_DESTROY_WITH_PARENT,
          "DESTROY_WITH_PARENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Create dialog with actions in header bar instead of action area
      */
    case USE_HEADER_BAR
        extends KnownValue(
          GtkDialogFlags.GTK_DIALOG_USE_HEADER_BAR,
          "USE_HEADER_BAR"
        )
  end KnownValue
end DialogFlags

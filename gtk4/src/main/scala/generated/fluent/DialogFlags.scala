package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkDialogFlags

/** Flags used to influence dialog construction.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags used to influence dialog construction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkDialogFlags, name: String)
      extends DialogFlags(raw):
    override def toString(): String = this.name

    /** Make the constructed dialog modal
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MODAL extends KnownValue(GtkDialogFlags.GTK_DIALOG_MODAL, "MODAL")

    /** Destroy the dialog when its parent is destroyed
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DESTROY_WITH_PARENT
        extends KnownValue(
          GtkDialogFlags.GTK_DIALOG_DESTROY_WITH_PARENT,
          "DESTROY_WITH_PARENT"
        )

    /** Create dialog with actions in header bar instead of action area
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case USE_HEADER_BAR
        extends KnownValue(
          GtkDialogFlags.GTK_DIALOG_USE_HEADER_BAR,
          "USE_HEADER_BAR"
        )
  end KnownValue
end DialogFlags

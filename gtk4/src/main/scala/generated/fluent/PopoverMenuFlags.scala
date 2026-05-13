package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPopoverMenuFlags

/** Flags that affect how [class@Gtk.PopoverMenu] widgets built from a
  * [class@Gio.MenuModel] are created and displayed.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PopoverMenuFlags private (val raw: GtkPopoverMenuFlags):
  def is(kv: PopoverMenuFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[PopoverMenuFlags.KnownValue]
    PopoverMenuFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"PopoverMenuFlags(${sb.result().mkString(", ")})"
end PopoverMenuFlags

object PopoverMenuFlags:
  export KnownValue.*

  def fromRaw(raw: GtkPopoverMenuFlags) = new PopoverMenuFlags(raw)

  extension (af: PopoverMenuFlags)
    def &(other: PopoverMenuFlags) =
      PopoverMenuFlags(af.raw & other.raw)
    def |(other: PopoverMenuFlags) =
      PopoverMenuFlags(af.raw | other.raw)

  /** Flags that affect how [class@Gtk.PopoverMenu] widgets built from a
    * [class@Gio.MenuModel] are created and displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkPopoverMenuFlags, name: String)
      extends PopoverMenuFlags(raw):
    override def toString(): String = this.name

    /** Create submenus as nested popovers. Without this flag, submenus are
      * created as sliding pages that replace the main menu.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NESTED
        extends KnownValue(
          GtkPopoverMenuFlags.GTK_POPOVER_MENU_NESTED,
          "NESTED"
        )
  end KnownValue
end PopoverMenuFlags

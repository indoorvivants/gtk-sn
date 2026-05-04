package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPopoverMenuFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags that affect how [class@Gtk.PopoverMenu] widgets built from a
  * [class@Gio.MenuModel] are created and displayed.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags that affect how [class@Gtk.PopoverMenu] widgets built from a
    * [class@Gio.MenuModel] are created and displayed.
    */
  enum KnownValue(override val raw: GtkPopoverMenuFlags, name: String)
      extends PopoverMenuFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Create submenus as nested popovers. Without this flag, submenus are
      * created as sliding pages that replace the main menu.
      */
    case NESTED
        extends KnownValue(
          GtkPopoverMenuFlags.GTK_POPOVER_MENU_NESTED,
          "NESTED"
        )
  end KnownValue
end PopoverMenuFlags

package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Action
import sn.gnome.gio.internal.GPropertyAction
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class PropertyAction(raw: Ptr[GPropertyAction])
    extends Object(raw.asInstanceOf),
      Action:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end PropertyAction

object PropertyAction:
  def apply(
      name: String | CString,
      `object`: Object,
      property_name: String | CString
  )(using Zone): PropertyAction = new PropertyAction(
    g_property_action_new(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      gpointer(
        `object`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PropertyAction

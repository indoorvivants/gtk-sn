package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Action
import sn.gnome.gio.internal.GSimpleAction
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.GVariantType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class SimpleAction(raw: Ptr[GSimpleAction])
    extends Object(raw.asInstanceOf),
      Action:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setEnabled(enabled: Boolean): Unit = g_simple_action_set_enabled(
    this.raw.asInstanceOf,
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  def setState(value: Ptr[GVariant]): Unit =
    g_simple_action_set_state(this.raw.asInstanceOf, value)

  def setStateHint(state_hint: Ptr[GVariant]): Unit =
    g_simple_action_set_state_hint(this.raw.asInstanceOf, state_hint)

end SimpleAction

object SimpleAction:
  def apply(name: String | CString, parameter_type: Ptr[GVariantType])(using
      Zone
  ): SimpleAction = new SimpleAction(
    g_simple_action_new(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      parameter_type
    ).asInstanceOf
  )
  def stateful(
      name: String | CString,
      parameter_type: Ptr[GVariantType],
      state: Ptr[GVariant]
  )(using Zone): SimpleAction = new SimpleAction(
    g_simple_action_new_stateful(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      parameter_type,
      state
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
end SimpleAction

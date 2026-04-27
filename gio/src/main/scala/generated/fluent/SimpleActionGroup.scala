package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Action
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ActionMap
import sn.gnome.gio.internal.GSimpleActionGroup
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class SimpleActionGroup(raw: Ptr[GSimpleActionGroup])
    extends Object(raw.asInstanceOf),
      ActionGroup,
      ActionMap:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method add_entries contains an array parameter, which is not supported yet

  def insert(action: Action): Unit = g_simple_action_group_insert(
    this.raw.asInstanceOf,
    action.getUnsafeRawPointer().asInstanceOf
  )

  def lookup(action_name: String | CString)(using Zone): Action =
    new Action.Abstract(
      g_simple_action_group_lookup(
        this.raw.asInstanceOf,
        __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  def remove(action_name: String | CString)(using Zone): Unit =
    g_simple_action_group_remove(
      this.raw.asInstanceOf,
      __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]]
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SimpleActionGroup

object SimpleActionGroup:
  def apply(): SimpleActionGroup = new SimpleActionGroup(
    g_simple_action_group_new().asInstanceOf
  )
end SimpleActionGroup

package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Action
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ActionMap
import sn.gnome.gio.internal.GActionEntry
import sn.gnome.gio.internal.GSimpleActionGroup
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GSimpleActionGroup is a hash table filled with #GAction objects,
  * implementing the #GActionGroup and #GActionMap interfaces.
  */
class SimpleActionGroup(raw: Ptr[GSimpleActionGroup])
    extends Object(raw.asInstanceOf),
      ActionGroup,
      ActionMap:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience function for creating multiple #GSimpleAction instances and
    * adding them to the action group.
    */
  def addEntries(
      entries: Ptr[GActionEntry /* None */ ] /* Some(Ptr[GActionEntry]) */,
      n_entries: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_simple_action_group_add_entries(
    this.raw.asInstanceOf[Ptr[GSimpleActionGroup]],
    entries,
    gint(n_entries),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds an action to the action group.
    *
    * If the action group already contains an action with the same name as
    * @action
    *   then the old action is dropped from the group.
    *
    * The action group takes its own reference on @action.
    */
  def insert(action: Action /* Some(Ptr[GAction]) */ ): Unit /* None */ =
    g_simple_action_group_insert(
      this.raw.asInstanceOf[Ptr[GSimpleActionGroup]],
      action.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the action with the name @action_name in the group.
    *
    * If no such action exists, returns %NULL.
    */
  def lookup(
      action_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Action /* None */ = new Action.Abstract(
    g_simple_action_group_lookup(
      this.raw.asInstanceOf[Ptr[GSimpleActionGroup]],
      __sn_extract_string(action_name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the named action from the action group.
    *
    * If no action of this name is in the group then nothing happens.
    */
  def remove(
      action_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_simple_action_group_remove(
    this.raw.asInstanceOf[Ptr[GSimpleActionGroup]],
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new, empty, #GSimpleActionGroup.
    */
  def apply(): SimpleActionGroup = new SimpleActionGroup(
    g_simple_action_group_new().asInstanceOf
  )
end SimpleActionGroup

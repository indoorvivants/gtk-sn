package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.Action
import sn.gnome.glib.internal.gchar

trait ActionMap:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Adds an action to the @action_map.
    *
    * If the action map already contains an action with the same name as @action
    * then the old action is dropped from the action map.
    *
    * The action map takes its own reference on @action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addAction(action: Action /* Some(Ptr[GAction]) */ ): Unit /* None */ =
    g_action_map_add_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionMap]],
      action.getUnsafeRawPointer().asInstanceOf
    )
  end addAction

  /**  A convenience function for creating multiple #GSimpleAction instances
    *  and adding them to a #GActionMap.
    *
    *  Each action is constructed as per one #GActionEntry.
    *
    *  |[<!-- language="C" -->
    *  static void
    *  activate_quit (GSimpleAction *simple,
    *                 GVariant      *parameter,
    *                 gpointer       user_data)
    *  {
    *    exit (0);
    *  }
    *
    *  static void
    *  activate_print_string (GSimpleAction *simple,
    *                         GVariant      *parameter,
    *                         gpointer       user_data)
    *  {
    *    g_print ("%s\n", g_variant_get_string (parameter, NULL));
    *  }
    *
    *  static GActionGroup *
    *  create_action_group (void)
    *  {
    *    const GActionEntry entries[] = {
    *      { "quit",         activate_quit              },
    *      { "print-string", activate_print_string, "s" }
    *    };
    *    GSimpleActionGroup *group;
    *
    *    group = g_simple_action_group_new ();
    *    g_action_map_add_action_entries (G_ACTION_MAP (group), entries, G_N_ELEMENTS (entries), NULL);
    *
    *    return G_ACTION_GROUP (group);
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_action_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GActionEntry*)))"
  )
  private def addActionEntries__ = ???

  /** Looks up the action with the name @action_name in @action_map.
    *
    * If no such action exists, returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupAction(
      action_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Action /* None */ =
    new Action.Abstract(
      g_action_map_lookup_action(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionMap]],
        toCString(action_name).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end lookupAction

  /** Removes the named action from the action map.
    *
    * If no action of this name is in the map then nothing happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAction(
      action_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_action_map_remove_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionMap]],
      toCString(action_name).asInstanceOf[Ptr[gchar]]
    )
  end removeAction

  /**  Remove actions from a #GActionMap. This is meant as the reverse of
    *  g_action_map_add_action_entries().
    *
    *  |[<!-- language="C" -->
    *  static const GActionEntry entries[] = {
    *      { "quit",         activate_quit              },
    *      { "print-string", activate_print_string, "s" }
    *  };
    *
    *  void
    *  add_actions (GActionMap *map)
    *  {
    *    g_action_map_add_action_entries (map, entries, G_N_ELEMENTS (entries), NULL);
    *  }
    *
    *  void
    *  remove_actions (GActionMap *map)
    *  {
    *    g_action_map_remove_action_entries (map, entries, G_N_ELEMENTS (entries));
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method remove_action_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GActionEntry*)))"
  )
  private def removeActionEntries__ = ???

end ActionMap

object ActionMap:
  class Abstract(raw: Ptr[Byte]) extends ActionMap:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ActionMap

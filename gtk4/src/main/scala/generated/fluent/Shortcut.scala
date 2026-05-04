package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{ShortcutAction, ShortcutTrigger}
import sn.gnome.gtk4.internal.GtkShortcut

/** A `GtkShortcut` describes a keyboard shortcut.
  *
  * It contains a description of how to trigger the shortcut via a
  * [class@Gtk.ShortcutTrigger] and a way to activate the shortcut on a widget
  * via a [class@Gtk.ShortcutAction].
  *
  * The actual work is usually done via [class@Gtk.ShortcutController], which
  * decides if and when to activate a shortcut. Using that controller directly
  * however is rarely necessary as various higher level convenience APIs exist
  * on `GtkWidget`s that make it easier to use shortcuts in GTK.
  *
  * `GtkShortcut` does provide functionality to make it easy for users to work
  * with shortcuts, either by providing informational strings for display
  * purposes or by allowing shortcuts to be configured.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Shortcut(raw: Ptr[GtkShortcut]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the action that is activated by this shortcut.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAction(): ShortcutAction /* None */ = new ShortcutAction(
    gtk_shortcut_get_action(
      this.raw.asInstanceOf[Ptr[GtkShortcut]]
    ).asInstanceOf
  )

  /** Gets the arguments that are passed when activating the shortcut.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_arguments/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getArguments__ = ???

  /** Gets the trigger used to trigger @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTrigger(): ShortcutTrigger /* None */ = new ShortcutTrigger(
    gtk_shortcut_get_trigger(
      this.raw.asInstanceOf[Ptr[GtkShortcut]]
    ).asInstanceOf
  )

  /** Sets the new action for @self to be @action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAction(
      action: Option[ShortcutAction /* Some(Ptr[GtkShortcutAction]) */ ]
  ): Unit /* None */ = gtk_shortcut_set_action(
    this.raw.asInstanceOf[Ptr[GtkShortcut]],
    action
      .map[Ptr[GtkShortcutAction]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkShortcutAction]])
  )

  /** Sets the arguments to pass when activating the shortcut.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_arguments/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setArguments__ = ???

  /** Sets the new trigger for @self to be @trigger.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTrigger(
      trigger: Option[ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */ ]
  ): Unit /* None */ = gtk_shortcut_set_trigger(
    this.raw.asInstanceOf[Ptr[GtkShortcut]],
    trigger
      .map[Ptr[GtkShortcutTrigger]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkShortcutTrigger]])
  )

end Shortcut

object Shortcut:
  /** Creates a new `GtkShortcut` that is triggered by
    * @trigger
    *   and then activates @action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      trigger: Option[ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */ ],
      action: Option[ShortcutAction /* Some(Ptr[GtkShortcutAction]) */ ]
  ): Shortcut = new Shortcut(
    gtk_shortcut_new(
      trigger
        .map[Ptr[GtkShortcutTrigger]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutTrigger]]),
      action
        .map[Ptr[GtkShortcutAction]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutAction]])
    ).asInstanceOf
  )

  /** Creates a new `GtkShortcut` that is triggered by @trigger and then
    * activates
    * @action
    *   with arguments given by @format_string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def withArguments(
      trigger: Option[ShortcutTrigger /* Some(Ptr[GtkShortcutTrigger]) */ ],
      action: Option[ShortcutAction /* Some(Ptr[GtkShortcutAction]) */ ],
      format_string: Option[String | CString /* Some(CString) */ ],
      args: Any*
  )(using Zone): Shortcut = new Shortcut(
    gtk_shortcut_new_with_arguments(
      trigger
        .map[Ptr[GtkShortcutTrigger]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutTrigger]]),
      action
        .map[Ptr[GtkShortcutAction]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutAction]]),
      format_string
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
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
end Shortcut

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.ModifierType
import sn.gnome.gio.fluent.ListModel
import sn.gnome.gtk4.fluent.{
  Buildable,
  EventController,
  Shortcut,
  ShortcutScope
}
import sn.gnome.gtk4.internal.GtkShortcutController

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkShortcutController` is an event controller that manages shortcuts.
  *
  * Most common shortcuts are using this controller implicitly, e.g. by adding a
  * mnemonic underline to a [class@Gtk.Label], or by installing a key binding
  * using [method@Gtk.WidgetClass.add_binding], or by adding accelerators to
  * global actions using [method@Gtk.Application.set_accels_for_action].
  *
  * But it is possible to create your own shortcut controller, and add shortcuts
  * to it.
  *
  * `GtkShortcutController` implements [iface@Gio.ListModel] for querying the
  * shortcuts that have been added to it.
  *
  * # GtkShortcutController as GtkBuildable
  *
  * `GtkShortcutController`s can be created in [class@Gtk.Builder] ui files, to
  * set up shortcuts in the same place as the widgets.
  *
  * An example of a UI definition fragment with `GtkShortcutController`:
  * ```xml
  *   <object class='GtkButton'>
  *     <child>
  *       <object class='GtkShortcutController'>
  *         <property name='scope'>managed</property>
  *         <child>
  *           <object class='GtkShortcut'>
  *             <property name='trigger'>&lt;Control&gt;k</property>
  *             <property name='action'>activate</property>
  *           </object>
  *         </child>
  *       </object>
  *     </child>
  *   </object>
  * ```
  *
  * This example creates a [class@Gtk.ActivateAction] for triggering the
  * `activate` signal of the [class@Gtk.Button]. See
  * [ctor@Gtk.ShortcutAction.parse_string] for the syntax for other kinds of
  * [class@Gtk.ShortcutAction]. See [ctor@Gtk.ShortcutTrigger.parse_string] to
  * learn more about the syntax for triggers.
  */
class ShortcutController(raw: Ptr[GtkShortcutController])
    extends EventController(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @shortcut to the list of shortcuts handled by @self.
    *
    * If this controller uses an external shortcut list, this function does
    * nothing.
    */
  def addShortcut(
      shortcut: Shortcut /* Some(Ptr[GtkShortcut]) */
  ): Unit /* None */ = gtk_shortcut_controller_add_shortcut(
    this.raw.asInstanceOf[Ptr[GtkShortcutController]],
    shortcut.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the mnemonics modifiers for when this controller activates its
    * shortcuts.
    */
  def getMnemonicsModifiers(): ModifierType /* None */ = ModifierType.fromRaw(
    gtk_shortcut_controller_get_mnemonics_modifiers(
      this.raw.asInstanceOf[Ptr[GtkShortcutController]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the scope for when this controller activates its shortcuts.
    *
    * See [method@Gtk.ShortcutController.set_scope] for details.
    */
  def getScope(): ShortcutScope /* None */ = ShortcutScope.fromRaw(
    gtk_shortcut_controller_get_scope(
      this.raw.asInstanceOf[Ptr[GtkShortcutController]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @shortcut from the list of shortcuts handled by @self.
    *
    * If @shortcut had not been added to @controller or this controller uses an
    * external shortcut list, this function does nothing.
    */
  def removeShortcut(
      shortcut: Shortcut /* Some(Ptr[GtkShortcut]) */
  ): Unit /* None */ = gtk_shortcut_controller_remove_shortcut(
    this.raw.asInstanceOf[Ptr[GtkShortcutController]],
    shortcut.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the controller to use the given modifier for mnemonics.
    *
    * The mnemonics modifiers determines which modifiers need to be pressed to
    * allow activation of shortcuts with mnemonics triggers.
    *
    * GTK normally uses the Alt modifier for mnemonics, except in
    * `GtkPopoverMenu`s, where mnemonics can be triggered without any modifiers.
    * It should be very rarely necessary to change this, and doing so is likely
    * to interfere with other shortcuts.
    *
    * This value is only relevant for local shortcut controllers. Global and
    * managed shortcut controllers will have their shortcuts activated from
    * other places which have their own modifiers for activating mnemonics.
    */
  def setMnemonicsModifiers(
      modifiers: ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  ): Unit /* None */ = gtk_shortcut_controller_set_mnemonics_modifiers(
    this.raw.asInstanceOf[Ptr[GtkShortcutController]],
    modifiers.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the controller to have the given @scope.
    *
    * The scope allows shortcuts to be activated outside of the normal event
    * propagation. In particular, it allows installing global keyboard shortcuts
    * that can be activated even when a widget does not have focus.
    *
    * With %GTK_SHORTCUT_SCOPE_LOCAL, shortcuts will only be activated when the
    * widget has focus.
    */
  def setScope(
      scope: ShortcutScope /* Some(GtkShortcutScope) */
  ): Unit /* None */ = gtk_shortcut_controller_set_scope(
    this.raw.asInstanceOf[Ptr[GtkShortcutController]],
    scope.raw
  )

end ShortcutController

object ShortcutController:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new shortcut controller.
    */
  def apply(): ShortcutController = new ShortcutController(
    gtk_shortcut_controller_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new shortcut controller that takes its shortcuts from the given
    * list model.
    *
    * A controller created by this function does not let you add or remove
    * individual shortcuts using the shortcut controller api, but you can change
    * the contents of the model.
    */
  def forModel(
      model: ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
  ): ShortcutController = new ShortcutController(
    gtk_shortcut_controller_new_for_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ShortcutController

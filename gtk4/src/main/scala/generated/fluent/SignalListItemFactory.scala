package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.internal.GtkSignalListItemFactory

/** `GtkSignalListItemFactory` is a `GtkListItemFactory` that emits signals to
  * manage listitems.
  *
  * Signals are emitted for every listitem in the same order:
  *
  *   1. [signal@Gtk.SignalListItemFactory::setup] is emitted to set up
  *      permanent things on the listitem. This usually means constructing the
  *      widgets used in the row and adding them to the listitem.
  *   2. [signal@Gtk.SignalListItemFactory::bind] is emitted to bind the item
  *      passed via [property@Gtk.ListItem:item] to the widgets that have been
  *      created in step 1 or to add item-specific widgets. Signals are
  *      connected to listen to changes - both to changes in the item to update
  *      the widgets or to changes in the widgets to update the item. After this
  *      signal has been called, the listitem may be shown in a list widget.
  *   3. [signal@Gtk.SignalListItemFactory::unbind] is emitted to undo
  *      everything done in step 2. Usually this means disconnecting signal
  *      handlers. Once this signal has been called, the listitem will no longer
  *      be used in a list widget.
  *   4. [signal@Gtk.SignalListItemFactory::bind] and
  *      [signal@Gtk.SignalListItemFactory::unbind] may be emitted multiple
  *      times again to bind the listitem for use with new items. By reusing
  *      listitems, potentially costly setup can be avoided. However, it means
  *      code needs to make sure to properly clean up the listitem in step 3 so
  *      that no information from the previous use leaks into the next use.
  *
  *   5. [signal@Gtk.SignalListItemFactory::teardown] is emitted to allow
  *      undoing the effects of [signal@Gtk.SignalListItemFactory::setup]. After
  *      this signal was emitted on a listitem, the listitem will be destroyed
  *      and not be used again.
  *
  * Note that during the signal emissions, changing properties on the listitems
  * passed will not trigger notify signals as the listitem's notifications are
  * frozen. See g_object_freeze_notify() for details.
  *
  * For tracking changes in other properties in the listitem, the ::notify
  * signal is recommended. The signal can be connected in the
  * [signal@Gtk.SignalListItemFactory::setup] signal and removed again during
  * [signal@Gtk.SignalListItemFactory::teardown].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SignalListItemFactory(raw: Ptr[GtkSignalListItemFactory])
    extends ListItemFactory(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emitted when an object has been bound, for example when a new
    * [property@Gtk.ListItem:item] has been set on a listitem and should be
    * bound for use.
    *
    * After this signal was emitted, the object might be shown in a
    * [class@Gtk.ListView] or other widget.
    *
    * The [signal@Gtk.SignalListItemFactory::unbind] signal is the opposite of
    * this signal and can be used to undo everything done in this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal bind]: Type Type(List(),ListMap(@name -> DataRecord(GObject.Object))) has no @type attribute"
  )
  private def onBind = ???

  /** Emitted when a new listitem has been created and needs to be setup for
    * use.
    *
    * It is the first signal emitted for every listitem.
    *
    * The [signal@Gtk.SignalListItemFactory::teardown] signal is the opposite of
    * this signal and can be used to undo everything done in this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal setup]: Type Type(List(),ListMap(@name -> DataRecord(GObject.Object))) has no @type attribute"
  )
  private def onSetup = ???

  /** Emitted when an object is about to be destroyed.
    *
    * It is the last signal ever emitted for this @object.
    *
    * This signal is the opposite of the
    * [signal@Gtk.SignalListItemFactory::setup] signal and should be used to
    * undo everything done in that signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal teardown]: Type Type(List(),ListMap(@name -> DataRecord(GObject.Object))) has no @type attribute"
  )
  private def onTeardown = ???

  /** Emitted when an object has been unbound from its item, for example when a
    * listitem was removed from use in a list widget and its
    * [property@Gtk.ListItem:item] is about to be unset.
    *
    * This signal is the opposite of the
    * [signal@Gtk.SignalListItemFactory::bind] signal and should be used to undo
    * everything done in that signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal unbind]: Type Type(List(),ListMap(@name -> DataRecord(GObject.Object))) has no @type attribute"
  )
  private def onUnbind = ???

end SignalListItemFactory

object SignalListItemFactory:
  /** Creates a new `GtkSignalListItemFactory`.
    *
    * You need to connect signal handlers before you use it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): SignalListItemFactory = new SignalListItemFactory(
    gtk_signal_list_item_factory_new().asInstanceOf
  )
end SignalListItemFactory

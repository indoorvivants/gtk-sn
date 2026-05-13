package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Box,
  Buildable,
  ConstraintTarget,
  Orientable,
  ShortcutsGroup
}
import sn.gnome.gtk4.internal.GtkShortcutsSection
import sn.gnome.runtime.*

/** A `GtkShortcutsSection` collects all the keyboard shortcuts and gestures for
  * a major application mode.
  *
  * If your application needs multiple sections, you should give each section a
  * unique [property@Gtk.ShortcutsSection:section-name] and a
  * [property@Gtk.ShortcutsSection:title] that can be shown in the section
  * selector of the [class@Gtk.ShortcutsWindow].
  *
  * The [property@Gtk.ShortcutsSection:max-height] property can be used to
  * influence how the groups in the section are distributed over pages and
  * columns.
  *
  * This widget is only meant to be used with [class@Gtk.ShortcutsWindow].
  *
  * The recommended way to construct a `GtkShortcutsSection` is with
  * [class@Gtk.Builder], by using the `<child>` tag to populate a
  * `GtkShortcutsSection` with one or more [class@Gtk.ShortcutsGroup] instances,
  * which in turn contain one or more [class@Gtk.ShortcutsShortcut] objects.
  *
  * If you need to add a group programmatically, use
  * [method@Gtk.ShortcutsSection.add_group].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutsSection private[gnome] (raw: Ptr[GtkShortcutsSection])
    extends Box(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a group to the shortcuts section.
    *
    * This is the programmatic equivalent to using [class@Gtk.Builder] and a
    * `<child>` tag to add the child.
    *
    * Adding children with the `GtkBox` API is not appropriate, as
    * `GtkShortcutsSection` manages its children internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addGroup(
      group: sn.gnome.gtk4.ShortcutsGroup /* Some(Ptr[GtkShortcutsGroup]) */
  )(using Runtime): Unit /* None */ =
    gtk_shortcuts_section_add_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutsSection]],
      group.getUnsafeRawPointer().asInstanceOf
    )
  end addGroup

  def onChangeCurrentPage(handler: ((`object`: Int)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType = SignalRegistration[this.type, (`object`: Int), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkShortcutsSection],
          `object`: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`object` = `object`))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"change-current-page"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onChangeCurrentPage
end ShortcutsSection

object ShortcutsSection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkShortcutsSection])(using Runtime) =
    summon[Runtime].getOrCreate[ShortcutsSection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ShortcutsSection(ptr)
    )

end ShortcutsSection

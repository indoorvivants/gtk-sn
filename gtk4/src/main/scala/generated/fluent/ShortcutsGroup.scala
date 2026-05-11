package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Box,
  Buildable,
  ConstraintTarget,
  Orientable,
  ShortcutsShortcut
}
import sn.gnome.gtk4.internal.GtkShortcutsGroup

/** A `GtkShortcutsGroup` represents a group of related keyboard shortcuts or
  * gestures.
  *
  * The group has a title. It may optionally be associated with a view of the
  * application, which can be used to show only relevant shortcuts depending on
  * the application context.
  *
  * This widget is only meant to be used with [class@Gtk.ShortcutsWindow].
  *
  * The recommended way to construct a `GtkShortcutsGroup` is with
  * [class@Gtk.Builder], by using the `<child>` tag to populate a
  * `GtkShortcutsGroup` with one or more [class@Gtk.ShortcutsShortcut]
  * instances.
  *
  * If you need to add a shortcut programmatically, use
  * [method@Gtk.ShortcutsGroup.add_shortcut].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutsGroup private[gnome] (raw: Ptr[GtkShortcutsGroup])
    extends Box(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a shortcut to the shortcuts group.
    *
    * This is the programmatic equivalent to using [class@Gtk.Builder] and a
    * `<child>` tag to add the child. Adding children with other API is not
    * appropriate as `GtkShortcutsGroup` manages its children internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addShortcut(
      shortcut: sn.gnome.gtk4.fluent.ShortcutsShortcut /* Some(Ptr[GtkShortcutsShortcut]) */
  )(using Runtime): Unit /* None */ =
    gtk_shortcuts_group_add_shortcut(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkShortcutsGroup]],
      shortcut.getUnsafeRawPointer().asInstanceOf
    )
  end addShortcut

end ShortcutsGroup

object ShortcutsGroup:
  def applyUnsafe(ptr: Ptr[GtkShortcutsGroup])(using Runtime) =
    summon[Runtime].getOrCreate[ShortcutsGroup](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ShortcutsGroup(ptr)
    )

end ShortcutsGroup

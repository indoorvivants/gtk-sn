package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{
  Accessible,
  Box,
  Buildable,
  ConstraintTarget,
  Orientable,
  ShortcutsGroup
}
import sn.gnome.gtk4.internal.GtkShortcutsSection

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
class ShortcutsSection(raw: Ptr[GtkShortcutsSection])
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
      group: ShortcutsGroup /* Some(Ptr[GtkShortcutsGroup]) */
  ): Unit /* None */ = gtk_shortcuts_section_add_group(
    this.raw.asInstanceOf[Ptr[GtkShortcutsSection]],
    group.getUnsafeRawPointer().asInstanceOf
  )

end ShortcutsSection

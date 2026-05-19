package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkFixed

/** `GtkFixed` places its child widgets at fixed positions and with fixed sizes.
  *
  * `GtkFixed` performs no automatic layout management.
  *
  * For most applications, you should not use this container! It keeps you from
  * having to learn about the other GTK containers, but it results in broken
  * applications. With `GtkFixed`, the following things will result in truncated
  * text, overlapping widgets, and other display bugs:
  *
  *   - Themes, which may change widget sizes.
  *   - Fonts other than the one you used to write the app will of course change
  *     the size of widgets containing text; keep in mind that users may use a
  *     larger font because of difficulty reading the default, or they may be
  *     using a different OS that provides different fonts.
  *   - Translation of text into other languages changes its size. Also, display
  *     of non-English text will use a different font in many cases.
  *
  * In addition, `GtkFixed` does not pay attention to text direction and thus
  * may produce unwanted results if your app is run under right-to-left
  * languages such as Hebrew or Arabic. That is: normally GTK will order
  * containers appropriately for the text direction, e.g. to put labels to the
  * right of the thing they label when using an RTL language, but it can’t do
  * that with `GtkFixed`. So if you need to reorder widgets depending on the
  * text direction, you would need to manually detect it and adjust child
  * positions accordingly.
  *
  * Finally, fixed positioning makes it kind of annoying to add/remove UI
  * elements, since you have to reposition all the other elements. This is a
  * long-term maintenance problem for your application.
  *
  * If you know none of these things are an issue for your application, and
  * prefer the simplicity of `GtkFixed`, by all means use the widget. But you
  * should be aware of the tradeoffs.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Fixed private[gnome] (raw: Ptr[GtkFixed])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the translation transformation of the given child `GtkWidget` in
    * the `GtkFixed`.
    *
    * See also: [method@Gtk.Fixed.get_child_transform].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_child_position]: Method get_child_position contains an OUT parameter, which is not supported yet"
  )
  private def getChildPosition__ = ???

  /** Retrieves the transformation for @widget set using
    * gtk_fixed_set_child_transform().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_child_transform/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def getChildTransform__ = ???

  /** Sets a translation transformation to the given @x and @y coordinates to
    * the child @widget of the `GtkFixed`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def move(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */
  )(using Runtime): Unit /* None */ =
    gtk_fixed_move(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFixed]],
      widget.getUnsafeRawPointer().asInstanceOf,
      x,
      y
    )
  end move

  /** Adds a widget to a `GtkFixed` at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def put(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */
  )(using Runtime): Unit /* None */ =
    gtk_fixed_put(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFixed]],
      widget.getUnsafeRawPointer().asInstanceOf,
      x,
      y
    )
  end put

  /** Removes a child from @fixed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_fixed_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFixed]],
      widget.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Sets the transformation for @widget.
    *
    * This is a convenience function that retrieves the
    * [class@Gtk.FixedLayoutChild] instance associated to
    * @widget
    *   and calls [method@Gtk.FixedLayoutChild.set_transform].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_child_transform/<method parameters>/transform]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def setChildTransform__ = ???

end Fixed

object Fixed:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFixed])(using Runtime) = summon[Runtime]
    .getOrCreate[Fixed](ptr.asInstanceOf[Ptr[Byte]], p => new Fixed(ptr))

  /** Creates a new `GtkFixed`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Fixed =
    val raw: Ptr[Byte] = gtk_fixed_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Fixed](raw, r => Fixed.applyUnsafe(r.asInstanceOf))
  end apply
end Fixed

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Adjustment,
  Buildable,
  ConstraintTarget,
  Scrollable,
  Widget
}
import sn.gnome.gtk4.internal.GtkViewport

/** `GtkViewport` implements scrollability for widgets that lack their own
  * scrolling capabilities.
  *
  * Use `GtkViewport` to scroll child widgets such as `GtkGrid`, `GtkBox`, and
  * so on.
  *
  * The `GtkViewport` will start scrolling content only if allocated less than
  * the child widget’s minimum size in a given orientation.
  *
  * # CSS nodes
  *
  * `GtkViewport` has a single CSS node with name `viewport`.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkViewport` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkViewport` uses the `GTK_ACCESSIBLE_ROLE_GENERIC`
  * role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Viewport private[gnome] (raw: Ptr[GtkViewport])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget of @viewport.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_viewport_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkViewport]]
      ).asInstanceOf
    )
  end getChild

  /** Gets whether the viewport is scrolling to keep the focused child in view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScrollToFocus(): Boolean /* None */ =
    gtk_viewport_get_scroll_to_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkViewport]]
    ).value.!=(0)
  end getScrollToFocus

  /** Scrolls a descendant of the viewport into view.
    *
    * The viewport and the descendant must be visible and mapped for this
    * function to work, otherwise no scrolling will be performed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method scroll_to/<method parameters>/scroll]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ScrollInfo), @type -> DataRecord(GtkScrollInfo*)))"
  )
  private def scrollTo__ = ???

  /** Sets the child widget of @viewport.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_viewport_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkViewport]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets whether the viewport should automatically scroll to keep the focused
    * child in view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setScrollToFocus(
      scroll_to_focus: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_viewport_set_scroll_to_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkViewport]],
      gboolean(gint((if scroll_to_focus == true then 1 else 0)))
    )
  end setScrollToFocus

end Viewport

object Viewport:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkViewport])(using Runtime) = summon[Runtime]
    .getOrCreate[Viewport](ptr.asInstanceOf[Ptr[Byte]], p => new Viewport(ptr))

  /** Creates a new `GtkViewport`.
    *
    * The new viewport uses the given adjustments, or default adjustments if
    * none are given.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      hadjustment: Option[
        sn.gnome.gtk4.Adjustment /* Some(Ptr[GtkAdjustment]) */
      ],
      vadjustment: Option[
        sn.gnome.gtk4.Adjustment /* Some(Ptr[GtkAdjustment]) */
      ]
  )(using Runtime): Viewport =
    val raw: Ptr[Byte] = gtk_viewport_new(
      hadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]]),
      vadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Viewport](raw, r => Viewport.applyUnsafe(r.asInstanceOf))
  end apply
end Viewport

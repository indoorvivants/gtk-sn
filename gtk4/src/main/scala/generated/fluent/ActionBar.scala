package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkActionBar

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkActionBar` is designed to present contextual actions.
  *
  * ![An example GtkActionBar](action-bar.png)
  *
  * It is expected to be displayed below the content and expand horizontally to
  * fill the area.
  *
  * It allows placing children at the start or the end. In addition, it contains
  * an internal centered box which is centered with respect to the full width of
  * the box, even if the children at either side take up different amounts of
  * space.
  *
  * # GtkActionBar as GtkBuildable
  *
  * The `GtkActionBar` implementation of the `GtkBuildable` interface supports
  * adding children at the start or end sides by specifying “start” or “end” as
  * the “type” attribute of a `<child>` element, or setting the center widget by
  * specifying “center” value.
  *
  * # CSS nodes
  *
  * ```
  * actionbar
  * ╰── revealer
  *     ╰── box
  *         ├── box.start
  *         │   ╰── [start children]
  *         ├── [center widget]
  *         ╰── box.end
  *             ╰── [end children]
  * ```
  *
  * A `GtkActionBar`'s CSS node is called `actionbar`. It contains a `revealer`
  * subnode, which contains a `box` subnode, which contains two `box` subnodes
  * at the start and end of the action bar, with `start` and `end style classes
  * respectively, as well as a center node that represents the center child.
  *
  * Each of the boxes contains children packed for that side.
  */
class ActionBar(raw: Ptr[GtkActionBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the center bar widget of the bar.
    */
  def getCenterWidget(): Widget /* None */ = new Widget(
    gtk_action_bar_get_center_widget(
      this.raw.asInstanceOf[Ptr[GtkActionBar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the contents of the action bar are revealed.
    */
  def getRevealed(): Boolean /* None */ = gtk_action_bar_get_revealed(
    this.raw.asInstanceOf[Ptr[GtkActionBar]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @child to @action_bar, packed with reference to the end of the @action_bar.
    */
  def packEnd(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_action_bar_pack_end(
      this.raw.asInstanceOf[Ptr[GtkActionBar]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @child to @action_bar, packed with reference to the start of the @action_bar.
    */
  def packStart(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_action_bar_pack_start(
      this.raw.asInstanceOf[Ptr[GtkActionBar]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a child from @action_bar.
    */
  def remove(child: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_action_bar_remove(
      this.raw.asInstanceOf[Ptr[GtkActionBar]],
      child.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the center widget for the `GtkActionBar`.
    */
  def setCenterWidget(
      center_widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_action_bar_set_center_widget(
    this.raw.asInstanceOf[Ptr[GtkActionBar]],
    center_widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reveals or conceals the content of the action bar.
    *
    * Note: this does not show or hide @action_bar in the
    * [property@Gtk.Widget:visible] sense, so revealing has no effect if the
    * action bar is hidden.
    */
  def setRevealed(
      revealed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_action_bar_set_revealed(
    this.raw.asInstanceOf[Ptr[GtkActionBar]],
    gboolean(gint((if revealed == true then 1 else 0)))
  )

end ActionBar

object ActionBar:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkActionBar` widget.
    */
  def apply(): ActionBar = new ActionBar(gtk_action_bar_new().asInstanceOf)
end ActionBar

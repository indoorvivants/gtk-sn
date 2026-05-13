package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkActionBar

/** `GtkActionBar` is designed to present contextual actions.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActionBar private[gnome] (raw: Ptr[GtkActionBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the center bar widget of the bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCenterWidget()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_action_bar_get_center_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionBar]]
      ).asInstanceOf
    )
  end getCenterWidget

  /** Gets whether the contents of the action bar are revealed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRevealed(): Boolean /* None */ =
    gtk_action_bar_get_revealed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionBar]]
    ).value.!=(0)
  end getRevealed

  /** Adds @child to @action_bar, packed with reference to the end of the @action_bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def packEnd(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_action_bar_pack_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionBar]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end packEnd

  /** Adds @child to @action_bar, packed with reference to the start of the @action_bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def packStart(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_action_bar_pack_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionBar]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end packStart

  /** Removes a child from @action_bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_action_bar_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionBar]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Sets the center widget for the `GtkActionBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCenterWidget(
      center_widget: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_action_bar_set_center_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionBar]],
      center_widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setCenterWidget

  /** Reveals or conceals the content of the action bar.
    *
    * Note: this does not show or hide @action_bar in the
    * [property@Gtk.Widget:visible] sense, so revealing has no effect if the
    * action bar is hidden.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRevealed(
      revealed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_action_bar_set_revealed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkActionBar]],
      gboolean(gint((if revealed == true then 1 else 0)))
    )
  end setRevealed

end ActionBar

object ActionBar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkActionBar])(using Runtime) =
    summon[Runtime].getOrCreate[ActionBar](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ActionBar(ptr)
    )

  /** Creates a new `GtkActionBar` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ActionBar =
    val raw: Ptr[Byte] = gtk_action_bar_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[ActionBar](raw, r => ActionBar.applyUnsafe(r.asInstanceOf))
  end apply
end ActionBar

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{BaselinePosition, LayoutManager, Orientable, Orientation}
import sn.gnome.gtk4.internal.GtkBoxLayout

/** `GtkBoxLayout` is a layout manager that arranges children in a single row or
  * column.
  *
  * Whether it is a row or column depends on the value of its
  * [property@Gtk.Orientable:orientation] property. Within the other dimension
  * all children all allocated the same size. The `GtkBoxLayout` will respect
  * the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties
  * of each child widget.
  *
  * If you want all children to be assigned the same size, you can use the
  * [property@Gtk.BoxLayout:homogeneous] property.
  *
  * If you want to specify the amount of space placed between each child, you
  * can use the [property@Gtk.BoxLayout:spacing] property.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BoxLayout private[gnome] (raw: Ptr[GtkBoxLayout])
    extends LayoutManager(raw.asInstanceOf),
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the value set by gtk_box_layout_set_baseline_child().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaselineChild(): Int /* None */ =
    gtk_box_layout_get_baseline_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]]
    )
  end getBaselineChild

  /** Gets the value set by gtk_box_layout_set_baseline_position().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaselinePosition(): BaselinePosition /* None */ =
    BaselinePosition.fromRaw(
      gtk_box_layout_get_baseline_position(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]]
      )
    )
  end getBaselinePosition

  /** Returns whether the layout is set to be homogeneous.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHomogeneous(): Boolean /* None */ =
    gtk_box_layout_get_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]]
    ).value.!=(0)
  end getHomogeneous

  /** Returns the space that @box_layout puts between children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpacing(): UInt /* None */ =
    gtk_box_layout_get_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]]
    ).value
  end getSpacing

  /** Sets the index of the child that determines the baseline in vertical
    * layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaselineChild(child: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_box_layout_set_baseline_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]],
      child
    )
  end setBaselineChild

  /** Sets the baseline position of a box layout.
    *
    * The baseline position affects only horizontal boxes with at least one
    * baseline aligned child. If there is more vertical space available than
    * requested, and the baseline is not allocated by the parent then the given @position
    * is used to allocate the baseline within the extra space available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaselinePosition(
      position: BaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ =
    gtk_box_layout_set_baseline_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]],
      position.raw
    )
  end setBaselinePosition

  /** Sets whether the box layout will allocate the same size to all children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_box_layout_set_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]],
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )
  end setHomogeneous

  /** Sets how much spacing to put between children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_box_layout_set_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBoxLayout]],
      guint(spacing)
    )
  end setSpacing

end BoxLayout

object BoxLayout:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkBoxLayout])(using Runtime) =
    summon[Runtime].getOrCreate[BoxLayout](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BoxLayout(ptr)
    )

  /** Creates a new `GtkBoxLayout`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(orientation: Orientation /* Some(GtkOrientation) */ )(using
      Runtime
  ): BoxLayout =
    val raw: Ptr[Byte] = gtk_box_layout_new(orientation.raw).asInstanceOf
    summon[Runtime]
      .getOrCreate[BoxLayout](raw, r => BoxLayout.applyUnsafe(r.asInstanceOf))
  end apply
end BoxLayout

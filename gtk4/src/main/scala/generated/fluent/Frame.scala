package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkFrame

/** `GtkFrame` is a widget that surrounds its child with a decorative frame and
  * an optional label.
  *
  * ![An example GtkFrame](frame.png)
  *
  * If present, the label is drawn inside the top edge of the frame. The
  * horizontal position of the label can be controlled with
  * [method@Gtk.Frame.set_label_align].
  *
  * `GtkFrame` clips its child. You can use this to add rounded corners to
  * widgets, but be aware that it also cuts off shadows.
  *
  * # GtkFrame as GtkBuildable
  *
  * The `GtkFrame` implementation of the `GtkBuildable` interface supports
  * placing a child in the label position by specifying “label” as the “type”
  * attribute of a `<child>` element. A normal content child can be specified
  * without specifying a `<child>` type attribute.
  *
  * An example of a UI definition fragment with GtkFrame:
  * ```xml
  * <object class="GtkFrame">
  *   <child type="label">
  *     <object class="GtkLabel" id="frame_label"/>
  *   </child>
  *   <child>
  *     <object class="GtkEntry" id="frame_content"/>
  *   </child>
  * </object>
  * ```
  *
  * # CSS nodes
  *
  * ```
  * frame
  * ├── <label widget>
  * ╰── <child>
  * ```
  *
  * `GtkFrame` has a main CSS node with name “frame”, which is used to draw the
  * visible border. You can set the appearance of the border using CSS
  * properties like “border-style” on this node.
  *
  * # Accessibility
  *
  * `GtkFrame` uses the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Frame private[gnome] (raw: Ptr[GtkFrame])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget of @frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_frame_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]]
      ).asInstanceOf
    )
  end getChild

  /** Returns the frame labels text.
    *
    * If the frame's label widget is not a `GtkLabel`, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabel()(using Zone): String /* None */ =
    fromCString(
      gtk_frame_get_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]]
      ).asInstanceOf
    )
  end getLabel

  /** Retrieves the X alignment of the frame’s label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabelAlign(): Float /* None */ =
    gtk_frame_get_label_align(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]]
    )
  end getLabelAlign

  /** Retrieves the label widget for the frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabelWidget()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_frame_get_label_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]]
      ).asInstanceOf
    )
  end getLabelWidget

  /** Sets the child widget of @frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_frame_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Creates a new `GtkLabel` with the @label and sets it as the frame's label
    * widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      label: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_frame_set_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]],
      label
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setLabel

  /** Sets the X alignment of the frame widget’s label.
    *
    * The default value for a newly created frame is 0.0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabelAlign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_frame_set_label_align(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]],
      xalign.asInstanceOf
    )
  end setLabelAlign

  /** Sets the label widget for the frame.
    *
    * This is the widget that will appear embedded in the top edge of the frame
    * as a title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabelWidget(
      label_widget: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_frame_set_label_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFrame]],
      label_widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setLabelWidget

end Frame

object Frame:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFrame])(using Runtime) = summon[Runtime]
    .getOrCreate[Frame](ptr.asInstanceOf[Ptr[Byte]], p => new Frame(ptr))

  /** Creates a new `GtkFrame`, with optional label @label.
    *
    * If @label is %NULL, the label is omitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      label: Option[String /* Some(CString) */ ]
  )(using Zone, Runtime): Frame =
    val raw: Ptr[Byte] = gtk_frame_new(
      label
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Frame](raw, r => Frame.applyUnsafe(r.asInstanceOf))
  end apply
end Frame

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
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
class Frame(raw: Ptr[GtkFrame])
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
  def getChild(): Widget /* None */ = new Widget(
    gtk_frame_get_child(this.raw.asInstanceOf[Ptr[GtkFrame]]).asInstanceOf
  )

  /** Returns the frame labels text.
    *
    * If the frame's label widget is not a `GtkLabel`, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_frame_get_label(this.raw.asInstanceOf[Ptr[GtkFrame]]).asInstanceOf
  )

  /** Retrieves the X alignment of the frame’s label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabelAlign(): Float /* None */ = gtk_frame_get_label_align(
    this.raw.asInstanceOf[Ptr[GtkFrame]]
  )

  /** Retrieves the label widget for the frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabelWidget(): Widget /* None */ = new Widget(
    gtk_frame_get_label_widget(
      this.raw.asInstanceOf[Ptr[GtkFrame]]
    ).asInstanceOf
  )

  /** Sets the child widget of @frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_frame_set_child(
    this.raw.asInstanceOf[Ptr[GtkFrame]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Creates a new `GtkLabel` with the @label and sets it as the frame's label
    * widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_frame_set_label(
    this.raw.asInstanceOf[Ptr[GtkFrame]],
    label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the X alignment of the frame widget’s label.
    *
    * The default value for a newly created frame is 0.0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabelAlign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_frame_set_label_align(
      this.raw.asInstanceOf[Ptr[GtkFrame]],
      xalign.asInstanceOf
    )

  /** Sets the label widget for the frame.
    *
    * This is the widget that will appear embedded in the top edge of the frame
    * as a title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabelWidget(
      label_widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_frame_set_label_widget(
    this.raw.asInstanceOf[Ptr[GtkFrame]],
    label_widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Frame

object Frame:
  /** Creates a new `GtkFrame`, with optional label @label.
    *
    * If @label is %NULL, the label is omitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(label: Option[String | CString /* Some(CString) */ ])(using
      Zone
  )(using Runtime): Frame =
    val raw: Ptr[Byte] = gtk_frame_new(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime].getOrCreate[Frame](raw, r => new Frame(r.asInstanceOf))
  end apply

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Frame

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFrame

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkFrame` is a widget that surrounds its child with a decorative frame and
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
  */
class Frame(raw: Ptr[GtkFrame])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @frame.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_frame_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the frame labels text.
    *
    * If the frame's label widget is not a `GtkLabel`, %NULL is returned.
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_frame_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the X alignment of the frame’s label.
    */
  def getLabelAlign(): Float /* None */ = gtk_frame_get_label_align(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the label widget for the frame.
    */
  def getLabelWidget(): Widget /* None */ = new Widget(
    gtk_frame_get_label_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @frame.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_frame_set_child(
    this.raw.asInstanceOf,
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkLabel` with the @label and sets it as the frame's label
    * widget.
    */
  def setLabel(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_frame_set_label(
    this.raw.asInstanceOf,
    label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the X alignment of the frame widget’s label.
    *
    * The default value for a newly created frame is 0.0.
    */
  def setLabelAlign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_frame_set_label_align(this.raw.asInstanceOf, xalign.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the label widget for the frame.
    *
    * This is the widget that will appear embedded in the top edge of the frame
    * as a title.
    */
  def setLabelWidget(
      label_widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_frame_set_label_widget(
    this.raw.asInstanceOf,
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFrame`, with optional label @label.
    *
    * If @label is %NULL, the label is omitted.
    */
  def apply(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Frame = new Frame(
    gtk_frame_new(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
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

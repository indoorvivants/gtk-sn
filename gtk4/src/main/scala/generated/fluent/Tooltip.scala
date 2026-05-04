package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gio.fluent.Icon
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkTooltip

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkTooltip` is an object representing a widget tooltip.
  *
  * Basic tooltips can be realized simply by using
  * [method@Gtk.Widget.set_tooltip_text] or
  * [method@Gtk.Widget.set_tooltip_markup] without any explicit tooltip object.
  *
  * When you need a tooltip with a little more fancy contents, like adding an
  * image, or you want the tooltip to have different contents per `GtkTreeView`
  * row or cell, you will have to do a little more work:
  *
  *   - Set the [property@Gtk.Widget:has-tooltip] property to %TRUE. This will
  *     make GTK monitor the widget for motion and related events which are
  *     needed to determine when and where to show a tooltip.
  *   - Connect to the [signal@Gtk.Widget::query-tooltip] signal. This signal
  *     will be emitted when a tooltip is supposed to be shown. One of the
  *     arguments passed to the signal handler is a `GtkTooltip` object. This is
  *     the object that we are about to display as a tooltip, and can be
  *     manipulated in your callback using functions like
  *     [method@Gtk.Tooltip.set_icon]. There are functions for setting the
  *     tooltip’s markup, setting an image from a named icon, or even putting in
  *     a custom widget.
  *   - Return %TRUE from your ::query-tooltip handler. This causes the tooltip
  *     to be show. If you return %FALSE, it will not be shown.
  */
class Tooltip(raw: Ptr[GtkTooltip]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Replaces the widget packed into the tooltip with
    *  @custom_widget. @custom_widget does not get destroyed when the tooltip goes
    *  away.
    *  By default a box with a `GtkImage` and `GtkLabel` is embedded in
    *  the tooltip, which can be configured using gtk_tooltip_set_markup()
    *  and gtk_tooltip_set_icon().
    */
  def setCustom(
      custom_widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_tooltip_set_custom(
    this.raw.asInstanceOf[Ptr[GtkTooltip]],
    custom_widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon of the tooltip (which is in front of the text) to be
    * @paintable.
    *   If @paintable is %NULL, the image will be hidden.
    */
  def setIcon(
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Unit /* None */ = gtk_tooltip_set_icon(
    this.raw.asInstanceOf[Ptr[GtkTooltip]],
    paintable
      .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon of the tooltip (which is in front of the text) to be the
    * icon indicated by @gicon with the size indicated by @size. If @gicon is
    * %NULL, the image will be hidden.
    */
  def setIconFromGicon(
      gicon: Option[Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */ ]
  ): Unit /* None */ = gtk_tooltip_set_icon_from_gicon(
    this.raw.asInstanceOf[Ptr[GtkTooltip]],
    gicon
      .map[Ptr[_root_.sn.gnome.gio.internal.GIcon]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GIcon]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon of the tooltip (which is in front of the text) to be the
    * icon indicated by @icon_name with the size indicated by @size. If @icon_name
    * is %NULL, the image will be hidden.
    */
  def setIconFromIconName(
      icon_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_tooltip_set_icon_from_icon_name(
    this.raw.asInstanceOf[Ptr[GtkTooltip]],
    icon_name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text of the tooltip to be @markup.
    *
    * The string must be marked up with Pango markup. If @markup is %NULL, the
    * label will be hidden.
    */
  def setMarkup(
      markup: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_tooltip_set_markup(
    this.raw.asInstanceOf[Ptr[GtkTooltip]],
    markup
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text of the tooltip to be @text.
    *
    * If @text is %NULL, the label will be hidden. See also
    * [method@Gtk.Tooltip.set_markup].
    */
  def setText(
      text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_tooltip_set_text(
    this.raw.asInstanceOf[Ptr[GtkTooltip]],
    text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the area of the widget, where the contents of this tooltip apply, to
    * be @rect (in widget coordinates). This is especially useful for properly
    * setting tooltips on `GtkTreeView` rows and cells, `GtkIconViews`, etc.
    *
    * For setting tooltips on `GtkTreeView`, please refer to the convenience
    * functions for this: gtk_tree_view_set_tooltip_row() and
    * gtk_tree_view_set_tooltip_cell().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))"
  )
  def setTipArea__ = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Tooltip

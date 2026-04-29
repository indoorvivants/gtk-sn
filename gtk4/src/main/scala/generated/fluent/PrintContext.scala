package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_t
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.PageSetup
import sn.gnome.gtk4.internal.GtkPrintContext
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.fluent.Layout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkPrintContext` encapsulates context information that is required when
  * drawing pages for printing.
  *
  * This includes the cairo context and important parameters like page size and
  * resolution. It also lets you easily create [class@Pango.Layout] and
  * [class@Pango.Context] objects that match the font metrics of the cairo
  * surface.
  *
  * `GtkPrintContext` objects get passed to the
  * [signal@Gtk.PrintOperation::begin-print],
  * [signal@Gtk.PrintOperation::end-print],
  * [signal@Gtk.PrintOperation::request-page-setup] and
  * [signal@Gtk.PrintOperation::draw-page] signals on the
  * [class@Gtk.PrintOperation] object.
  *
  * ## Using GtkPrintContext in a ::draw-page callback
  *
  * ```c
  * static void
  * draw_page (GtkPrintOperation *operation,
  *            GtkPrintContext   *context,
  *            int                page_nr)
  * {
  *   cairo_t *cr;
  *   PangoLayout *layout;
  *   PangoFontDescription *desc;
  *
  *   cr = gtk_print_context_get_cairo_context (context);
  *
  *   // Draw a red rectangle, as wide as the paper (inside the margins)
  *   cairo_set_source_rgb (cr, 1.0, 0, 0);
  *   cairo_rectangle (cr, 0, 0, gtk_print_context_get_width (context), 50);
  *
  *   cairo_fill (cr);
  *
  *   // Draw some lines
  *   cairo_move_to (cr, 20, 10);
  *   cairo_line_to (cr, 40, 20);
  *   cairo_arc (cr, 60, 60, 20, 0, M_PI);
  *   cairo_line_to (cr, 80, 20);
  *
  *   cairo_set_source_rgb (cr, 0, 0, 0);
  *   cairo_set_line_width (cr, 5);
  *   cairo_set_line_cap (cr, CAIRO_LINE_CAP_ROUND);
  *   cairo_set_line_join (cr, CAIRO_LINE_JOIN_ROUND);
  *
  *   cairo_stroke (cr);
  *
  *   // Draw some text
  *   layout = gtk_print_context_create_pango_layout (context);
  *   pango_layout_set_text (layout, "Hello World! Printing is easy", -1);
  *   desc = pango_font_description_from_string ("sans 28");
  *   pango_layout_set_font_description (layout, desc);
  *   pango_font_description_free (desc);
  *
  *   cairo_move_to (cr, 30, 20);
  *   pango_cairo_layout_path (cr, layout);
  *
  *   // Font Outline
  *   cairo_set_source_rgb (cr, 0.93, 1.0, 0.47);
  *   cairo_set_line_width (cr, 0.5);
  *   cairo_stroke_preserve (cr);
  *
  *   // Font Fill
  *   cairo_set_source_rgb (cr, 0, 0.0, 1.0);
  *   cairo_fill (cr);
  *
  *   g_object_unref (layout);
  * }
  * ```
  */
class PrintContext(raw: Ptr[GtkPrintContext]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `PangoContext` that can be used with the `GtkPrintContext`.
    */
  def createPangoContext(): Context = new Context(
    gtk_print_context_create_pango_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `PangoLayout` that is suitable for use with the
    * `GtkPrintContext`.
    */
  def createPangoLayout(): Layout = new Layout(
    gtk_print_context_create_pango_layout(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the cairo context that is associated with the `GtkPrintContext`.
    */
  def getCairoContext(): Ptr[cairo_t] = gtk_print_context_get_cairo_context(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the horizontal resolution of the `GtkPrintContext`, in dots per
    * inch.
    */
  def getDpiX(): Double = gtk_print_context_get_dpi_x(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the vertical resolution of the `GtkPrintContext`, in dots per
    * inch.
    */
  def getDpiY(): Double = gtk_print_context_get_dpi_y(this.raw.asInstanceOf)

  @annotation.compileTimeOnly(
    "Method get_hard_margins contains an OUT parameter, which is not supported yet"
  )
  def getHardMargins() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the height of the `GtkPrintContext`, in pixels.
    */
  def getHeight(): Double = gtk_print_context_get_height(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the `GtkPageSetup` that determines the page dimensions of the
    * `GtkPrintContext`.
    */
  def getPageSetup(): PageSetup = new PageSetup(
    gtk_print_context_get_page_setup(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a `PangoFontMap` that is suitable for use with the
    * `GtkPrintContext`.
    */
  def getPangoFontmap(): FontMap = new FontMap(
    gtk_print_context_get_pango_fontmap(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the width of the `GtkPrintContext`, in pixels.
    */
  def getWidth(): Double = gtk_print_context_get_width(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a new cairo context on a print context.
    *
    * This function is intended to be used when implementing an internal print
    * preview, it is not needed for printing, since GTK itself creates a
    * suitable cairo context in that case.
    */
  def setCairoContext(cr: Ptr[cairo_t], dpi_x: Double, dpi_y: Double): Unit =
    gtk_print_context_set_cairo_context(this.raw.asInstanceOf, cr, dpi_x, dpi_y)

end PrintContext

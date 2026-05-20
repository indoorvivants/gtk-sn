package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.Context
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.PageSetup
import sn.gnome.gtk4.internal.GtkPrintContext
import sn.gnome.pango.{Context, FontMap, Layout}

/** A `GtkPrintContext` encapsulates context information that is required when
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PrintContext private[gnome] (raw: Ptr[GtkPrintContext])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Creates a new `PangoContext` that can be used with the `GtkPrintContext`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createPangoContext()(using Runtime): sn.gnome.pango.Context /* None */ =
    sn.gnome.pango.Context.applyUnsafe(
      gtk_print_context_create_pango_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
      ).asInstanceOf
    )
  end createPangoContext

  /** Creates a new `PangoLayout` that is suitable for use with the
    * `GtkPrintContext`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createPangoLayout()(using Runtime): sn.gnome.pango.Layout /* None */ =
    sn.gnome.pango.Layout.applyUnsafe(
      gtk_print_context_create_pango_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
      ).asInstanceOf
    )
  end createPangoLayout

  /** Obtains the cairo context that is associated with the `GtkPrintContext`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCairoContext(): sn.gnome.cairo.Context /* None */ =
    sn.gnome.cairo.Context.fromRaw(
      gtk_print_context_get_cairo_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
      )
    )
  end getCairoContext

  /** Obtains the horizontal resolution of the `GtkPrintContext`, in dots per
    * inch.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDpiX(): Double /* None */ =
    gtk_print_context_get_dpi_x(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
    )
  end getDpiX

  /** Obtains the vertical resolution of the `GtkPrintContext`, in dots per
    * inch.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDpiY(): Double /* None */ =
    gtk_print_context_get_dpi_y(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
    )
  end getDpiY

  /** Obtains the hardware printer margins of the `GtkPrintContext`, in units.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_hard_margins]: Method get_hard_margins contains an OUT parameter, which is not supported yet"
  )
  private def getHardMargins__ = ???

  /** Obtains the height of the `GtkPrintContext`, in pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Double /* None */ =
    gtk_print_context_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
    )
  end getHeight

  /** Obtains the `GtkPageSetup` that determines the page dimensions of the
    * `GtkPrintContext`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageSetup()(using Runtime): sn.gnome.gtk4.PageSetup /* None */ =
    sn.gnome.gtk4.PageSetup.applyUnsafe(
      gtk_print_context_get_page_setup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
      ).asInstanceOf
    )
  end getPageSetup

  /** Returns a `PangoFontMap` that is suitable for use with the
    * `GtkPrintContext`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPangoFontmap()(using Runtime): sn.gnome.pango.FontMap /* None */ =
    sn.gnome.pango.FontMap.applyUnsafe(
      gtk_print_context_get_pango_fontmap(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
      ).asInstanceOf
    )
  end getPangoFontmap

  /** Obtains the width of the `GtkPrintContext`, in pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Double /* None */ =
    gtk_print_context_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]]
    )
  end getWidth

  /** Sets a new cairo context on a print context.
    *
    * This function is intended to be used when implementing an internal print
    * preview, it is not needed for printing, since GTK itself creates a
    * suitable cairo context in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCairoContext(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      dpi_x: Double /* Some(Double) */,
      dpi_y: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_print_context_set_cairo_context(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintContext]],
      cr.getUnsafeRawPointer().asInstanceOf,
      dpi_x,
      dpi_y
    )
  end setCairoContext

end PrintContext

object PrintContext:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkPrintContext])(using Runtime) =
    summon[Runtime].getOrCreate[PrintContext](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PrintContext(ptr)
    )

end PrintContext

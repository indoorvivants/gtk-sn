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

class PrintContext(raw: Ptr[GtkPrintContext]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def createPangoContext(): Context = new Context(
    gtk_print_context_create_pango_context(this.raw.asInstanceOf).asInstanceOf
  )

  def createPangoLayout(): Layout = new Layout(
    gtk_print_context_create_pango_layout(this.raw.asInstanceOf).asInstanceOf
  )

  def getCairoContext(): Ptr[cairo_t] = gtk_print_context_get_cairo_context(
    this.raw.asInstanceOf
  )

  def getDpiX(): Double = gtk_print_context_get_dpi_x(this.raw.asInstanceOf)

  def getDpiY(): Double = gtk_print_context_get_dpi_y(this.raw.asInstanceOf)

  // Method get_hard_margins contains an OUT parameter, which is not supported yet

  def getHeight(): Double = gtk_print_context_get_height(this.raw.asInstanceOf)

  def getPageSetup(): PageSetup = new PageSetup(
    gtk_print_context_get_page_setup(this.raw.asInstanceOf).asInstanceOf
  )

  def getPangoFontmap(): FontMap = new FontMap(
    gtk_print_context_get_pango_fontmap(this.raw.asInstanceOf).asInstanceOf
  )

  def getWidth(): Double = gtk_print_context_get_width(this.raw.asInstanceOf)

  def setCairoContext(cr: Ptr[cairo_t], dpi_x: Double, dpi_y: Double): Unit =
    gtk_print_context_set_cairo_context(this.raw.asInstanceOf, cr, dpi_x, dpi_y)

end PrintContext

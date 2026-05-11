package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}

trait ColorChooser:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Adds a palette to the color chooser.
    *
    * If @orientation is horizontal, the colors are grouped in rows, with @colors_per_line
    * colors in each row. If @horizontal is %FALSE, the colors are grouped in
    * columns instead.
    *
    * The default color palette of [class@Gtk.ColorChooserWidget] has 45 colors,
    * organized in columns of 5 colors (this includes some grays).
    *
    * The layout of the color chooser widget works best when the palettes have
    * 9-10 columns.
    *
    * Calling this function for the first time has the side effect of removing
    * the default color palette from the color chooser.
    *
    * If @colors is %NULL, removes all previously added palettes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_palette/<method parameters>/colors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(GdkRGBA)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(GdkRGBA*)))"
  )
  private def addPalette__ = ???

  /** Gets the currently-selected color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_rgba]: Method get_rgba contains an OUT parameter, which is not supported yet"
  )
  private def getRgba__ = ???

  /** Returns whether the color chooser shows the alpha channel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseAlpha(): Boolean /* None */ =
    gtk_color_chooser_get_use_alpha(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorChooser]]
    ).value.!=(0)
  end getUseAlpha

  /** Sets the color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_rgba/<method parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def setRgba__ = ???

  /** Sets whether or not the color chooser should use the alpha channel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseAlpha(
      use_alpha: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_color_chooser_set_use_alpha(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorChooser]],
      gboolean(gint((if use_alpha == true then 1 else 0)))
    )
  end setUseAlpha

end ColorChooser

object ColorChooser:
  class Abstract(raw: Ptr[Byte]) extends ColorChooser:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ColorChooser

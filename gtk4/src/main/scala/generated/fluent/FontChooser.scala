package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.FontChooserLevel
import sn.gnome.pango.{FontFace, FontFamily, FontMap}

trait FontChooser:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the currently-selected font name.
    *
    * Note that this can be a different string than what you set with
    * [method@Gtk.FontChooser.set_font], as the font chooser widget may
    * normalize font names and thus return a string with a different structure.
    * For example, “Helvetica Italic Bold 12” could be normalized to “Helvetica
    * Bold Italic 12”.
    *
    * Use [method@Pango.FontDescription.equal] if you want to compare two font
    * descriptions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFont()(using Zone): String /* None */ =
    fromCString(
      gtk_font_chooser_get_font(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getFont

  /** Gets the currently-selected font.
    *
    * Note that this can be a different string than what you set with
    * [method@Gtk.FontChooser.set_font], as the font chooser widget may
    * normalize font names and thus return a string with a different structure.
    * For example, “Helvetica Italic Bold 12” could be normalized to “Helvetica
    * Bold Italic 12”.
    *
    * Use [method@Pango.FontDescription.equal] if you want to compare two font
    * descriptions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_font_desc/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  private def getFontDesc__ = ???

  /** Gets the `PangoFontFace` representing the selected font group details
    * (i.e. family, slant, weight, width, etc).
    *
    * If the selected font is not installed, returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontFace()(using Runtime): sn.gnome.pango.FontFace /* None */ =
    sn.gnome.pango.FontFace.applyUnsafe(
      gtk_font_chooser_get_font_face(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getFontFace

  /** Gets the `PangoFontFamily` representing the selected font family.
    *
    * Font families are a collection of font faces.
    *
    * If the selected font is not installed, returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontFamily()(using Runtime): sn.gnome.pango.FontFamily /* None */ =
    sn.gnome.pango.FontFamily.applyUnsafe(
      gtk_font_chooser_get_font_family(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getFontFamily

  /** Gets the currently-selected font features.
    *
    * The format of the returned string is compatible with the [CSS
    * font-feature-settings
    * property](https://www.w3.org/TR/css-fonts-4/#font-rend-desc). It can be
    * passed to [func@Pango.AttrFontFeatures.new].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontFeatures()(using Zone): String /* None */ =
    fromCString(
      gtk_font_chooser_get_font_features(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getFontFeatures

  /** Gets the custom font map of this font chooser widget, or %NULL if it does
    * not have one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontMap()(using Runtime): sn.gnome.pango.FontMap /* None */ =
    sn.gnome.pango.FontMap.applyUnsafe(
      gtk_font_chooser_get_font_map(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getFontMap

  /** The selected font size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontSize(): Int /* None */ =
    gtk_font_chooser_get_font_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
    )
  end getFontSize

  /** Gets the language that is used for font features.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLanguage()(using Zone): String /* None */ =
    fromCString(
      gtk_font_chooser_get_language(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getLanguage

  /** Returns the current level of granularity for selecting fonts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLevel(): FontChooserLevel /* None */ =
    FontChooserLevel.fromRaw(
      gtk_font_chooser_get_level(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      )
    )
  end getLevel

  /** Gets the text displayed in the preview area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPreviewText()(using Zone): String /* None */ =
    fromCString(
      gtk_font_chooser_get_preview_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
      ).asInstanceOf
    )
  end getPreviewText

  /** Returns whether the preview entry is shown or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowPreviewEntry(): Boolean /* None */ =
    gtk_font_chooser_get_show_preview_entry(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]]
    ).value.!=(0)
  end getShowPreviewEntry

  /** Adds a filter function that decides which fonts to display in the font
    * chooser.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_filter_func/<method parameters>/filter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontFilterFunc), @type -> DataRecord(GtkFontFilterFunc)))"
  )
  private def setFilterFunc__ = ???

  /** Sets the currently-selected font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFont(
      fontname: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_font_chooser_set_font(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]],
      toCString(fontname)
    )
  end setFont

  /** Sets the currently-selected font from @font_desc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_font_desc/<method parameters>/font_desc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  private def setFontDesc__ = ???

  /** Sets a custom font map to use for this font chooser widget.
    *
    * A custom font map can be used to present application-specific fonts
    * instead of or in addition to the normal system fonts.
    *
    * ```c
    * FcConfig *config;
    * PangoFontMap *fontmap;
    *
    * config = FcInitLoadConfigAndFonts ();
    * FcConfigAppFontAddFile (config, my_app_font_file);
    *
    * fontmap = pango_cairo_font_map_new_for_font_type (CAIRO_FONT_TYPE_FT);
    * pango_fc_font_map_set_config (PANGO_FC_FONT_MAP (fontmap), config);
    *
    * gtk_font_chooser_set_font_map (font_chooser, fontmap);
    * ```
    *
    * Note that other GTK widgets will only be able to use the
    * application-specific font if it is present in the font map they use:
    *
    * ```c
    * context = gtk_widget_get_pango_context (label);
    * pango_context_set_font_map (context, fontmap);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFontMap(
      fontmap: Option[
        sn.gnome.pango.FontMap /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_font_chooser_set_font_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]],
      fontmap
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]
        )
    )
  end setFontMap

  /** Sets the language to use for font features.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLanguage(
      language: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_font_chooser_set_language(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]],
      toCString(language)
    )
  end setLanguage

  /** Sets the desired level of granularity for selecting fonts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLevel(
      level: FontChooserLevel /* Some(GtkFontChooserLevel) */
  ): Unit /* None */ =
    gtk_font_chooser_set_level(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]],
      level.raw
    )
  end setLevel

  /** Sets the text displayed in the preview area.
    *
    * The @text is used to show how the selected font looks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPreviewText(
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_font_chooser_set_preview_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]],
      toCString(text)
    )
  end setPreviewText

  /** Shows or hides the editable preview entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowPreviewEntry(
      show_preview_entry: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_font_chooser_set_show_preview_entry(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFontChooser]],
      gboolean(gint((if show_preview_entry == true then 1 else 0)))
    )
  end setShowPreviewEntry

end FontChooser

object FontChooser:
  class Abstract(raw: Ptr[Byte]) extends FontChooser:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end FontChooser

package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{
  Direction,
  Font,
  FontDescription,
  FontMap,
  FontMetrics,
  Fontset,
  Gravity,
  GravityHint,
  Language,
  Matrix
}
import sn.gnome.pango.internal.PangoContext

/** A `PangoContext` stores global information used to control the itemization
  * process.
  *
  * The information stored by `PangoContext` includes the fontmap used to look
  * up fonts, and default values such as the default language, default gravity,
  * or default font.
  *
  * To obtain a `PangoContext`, use [method@Pango.FontMap.create_context].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Context private[gnome] (raw: Ptr[PangoContext])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Forces a change in the context, which will cause any `PangoLayout` using
    * this context to re-layout.
    *
    * This function is only useful when implementing a new backend for Pango,
    * something applications won't do. Backends should call this function if
    * they have attached extra data to the context and such data is changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def changed(): Unit /* None */ =
    pango_context_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
    )
  end changed

  /** Retrieves the base direction for the context.
    *
    * See [method@Pango.Context.set_base_dir].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseDir(): sn.gnome.pango.Direction /* None */ =
    sn.gnome.pango.Direction.fromRaw(
      pango_context_get_base_dir(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      )
    )
  end getBaseDir

  /** Retrieves the base gravity for the context.
    *
    * See [method@Pango.Context.set_base_gravity].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseGravity(): sn.gnome.pango.Gravity /* None */ =
    sn.gnome.pango.Gravity.fromRaw(
      pango_context_get_base_gravity(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      )
    )
  end getBaseGravity

  /** Retrieve the default font description for the context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontDescription(): sn.gnome.pango.FontDescription /* None */ =
    sn.gnome.pango.FontDescription.fromRaw(
      pango_context_get_font_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      )
    )
  end getFontDescription

  /** Gets the `PangoFontMap` used to look up fonts for this context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontMap()(using Runtime): sn.gnome.pango.FontMap /* None */ =
    sn.gnome.pango.FontMap.applyUnsafe(
      pango_context_get_font_map(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      ).asInstanceOf
    )
  end getFontMap

  /** Retrieves the gravity for the context.
    *
    * This is similar to [method@Pango.Context.get_base_gravity], except for
    * when the base gravity is %PANGO_GRAVITY_AUTO for which
    * [func@Pango.Gravity.get_for_matrix] is used to return the gravity from the
    * current context matrix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGravity(): sn.gnome.pango.Gravity /* None */ =
    sn.gnome.pango.Gravity.fromRaw(
      pango_context_get_gravity(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      )
    )
  end getGravity

  /** Retrieves the gravity hint for the context.
    *
    * See [method@Pango.Context.set_gravity_hint] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGravityHint(): sn.gnome.pango.GravityHint /* None */ =
    sn.gnome.pango.GravityHint.fromRaw(
      pango_context_get_gravity_hint(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      )
    )
  end getGravityHint

  /** Retrieves the global language tag for the context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLanguage(): sn.gnome.pango.Language /* None */ =
    sn.gnome.pango.Language.fromRaw(
      pango_context_get_language(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      )
    )
  end getLanguage

  /** Gets the transformation matrix that will be applied when rendering with
    * this context.
    *
    * See [method@Pango.Context.set_matrix].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMatrix(): sn.gnome.pango.Matrix /* None */ =
    sn.gnome.pango.Matrix.fromRaw(
      pango_context_get_matrix(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
      )
    )
  end getMatrix

  /** Get overall metric information for a particular font description.
    *
    * Since the metrics may be substantially different for different scripts, a
    * language tag can be provided to indicate that the metrics should be
    * retrieved that correspond to the script(s) used by that language.
    *
    * The `PangoFontDescription` is interpreted in the same way as by
    * [func@itemize], and the family name may be a comma separated list of
    * names. If characters from multiple of these families would be used to
    * render the string, then the returned fonts would be a composite of the
    * metrics for the fonts loaded for the individual families.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMetrics(
      desc: Option[
        sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
      ],
      language: Option[sn.gnome.pango.Language /* Some(Ptr[PangoLanguage]) */ ]
  ): sn.gnome.pango.FontMetrics /* None */ =
    sn.gnome.pango.FontMetrics.fromRaw(
      pango_context_get_metrics(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
        desc
          .map[Ptr[PangoFontDescription]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(null.asInstanceOf[Ptr[PangoFontDescription]]),
        language
          .map[Ptr[PangoLanguage]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[PangoLanguage]])
      )
    )
  end getMetrics

  /** Returns whether font rendering with this context should round glyph
    * positions and widths.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRoundGlyphPositions(): Boolean /* None */ =
    pango_context_get_round_glyph_positions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
    ).value.!=(0)
  end getRoundGlyphPositions

  /** Returns the current serial number of @context.
    *
    * The serial number is initialized to an small number larger than zero when
    * a new context is created and is increased whenever the context is changed
    * using any of the setter functions, or the `PangoFontMap` it uses to find
    * fonts has changed. The serial may wrap, but will never have the value 0.
    * Since it can wrap, never compare it with "less than", always use "not
    * equals".
    *
    * This can be used to automatically detect changes to a `PangoContext`, and
    * is only useful when implementing objects that need update when their
    * `PangoContext` changes, like `PangoLayout`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSerial(): UInt /* None */ =
    pango_context_get_serial(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]]
    ).value
  end getSerial

  /** List all families for a context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_families]: Method list_families contains an OUT parameter, which is not supported yet"
  )
  private def listFamilies__ = ???

  /** Loads the font in one of the fontmaps in the context that is the closest
    * match for @desc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFont(
      desc: sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
  )(using Runtime): sn.gnome.pango.Font /* None */ =
    sn.gnome.pango.Font.applyUnsafe(
      pango_context_load_font(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
        desc.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end loadFont

  /** Load a set of fonts in the context that can be used to render a font
    * matching @desc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFontset(
      desc: sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */,
      language: sn.gnome.pango.Language /* Some(Ptr[PangoLanguage]) */
  )(using Runtime): sn.gnome.pango.Fontset /* None */ =
    sn.gnome.pango.Fontset.applyUnsafe(
      pango_context_load_fontset(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
        desc.getUnsafeRawPointer().asInstanceOf,
        language.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end loadFontset

  /** Sets the base direction for the context.
    *
    * The base direction is used in applying the Unicode bidirectional
    * algorithm; if the @direction is %PANGO_DIRECTION_LTR or
    * %PANGO_DIRECTION_RTL, then the value will be used as the paragraph
    * direction in the Unicode bidirectional algorithm. A value of
    * %PANGO_DIRECTION_WEAK_LTR or %PANGO_DIRECTION_WEAK_RTL is used only for
    * paragraphs that do not contain any strong characters themselves.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaseDir(
      direction: sn.gnome.pango.Direction /* Some(PangoDirection) */
  ): Unit /* None */ =
    pango_context_set_base_dir(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      direction.raw
    )
  end setBaseDir

  /** Sets the base gravity for the context.
    *
    * The base gravity is used in laying vertical text out.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaseGravity(
      gravity: sn.gnome.pango.Gravity /* Some(PangoGravity) */
  ): Unit /* None */ =
    pango_context_set_base_gravity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      gravity.raw
    )
  end setBaseGravity

  /** Set the default font description for the context
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFontDescription(
      desc: Option[
        sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
      ]
  ): Unit /* None */ =
    pango_context_set_font_description(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      desc
        .map[Ptr[PangoFontDescription]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[PangoFontDescription]])
    )
  end setFontDescription

  /** Sets the font map to be searched when fonts are looked-up in this context.
    *
    * This is only for internal use by Pango backends, a `PangoContext` obtained
    * via one of the recommended methods should already have a suitable font
    * map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFontMap(
      font_map: Option[sn.gnome.pango.FontMap /* Some(Ptr[PangoFontMap]) */ ]
  )(using Runtime): Unit /* None */ =
    pango_context_set_font_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      font_map
        .map[Ptr[PangoFontMap]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[PangoFontMap]])
    )
  end setFontMap

  /** Sets the gravity hint for the context.
    *
    * The gravity hint is used in laying vertical text out, and is only relevant
    * if gravity of the context as returned by
    * [method@Pango.Context.get_gravity] is set to %PANGO_GRAVITY_EAST or
    * %PANGO_GRAVITY_WEST.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setGravityHint(
      hint: sn.gnome.pango.GravityHint /* Some(PangoGravityHint) */
  ): Unit /* None */ =
    pango_context_set_gravity_hint(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      hint.raw
    )
  end setGravityHint

  /** Sets the global language tag for the context.
    *
    * The default language for the locale of the running process can be found
    * using [func@Pango.Language.get_default].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLanguage(
      language: Option[sn.gnome.pango.Language /* Some(Ptr[PangoLanguage]) */ ]
  ): Unit /* None */ =
    pango_context_set_language(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      language
        .map[Ptr[PangoLanguage]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[PangoLanguage]])
    )
  end setLanguage

  /** Sets the transformation matrix that will be applied when rendering with
    * this context.
    *
    * Note that reported metrics are in the user space coordinates before the
    * application of the matrix, not device-space coordinates after the
    * application of the matrix. So, they don't scale with the matrix, though
    * they may change slightly for different matrices, depending on how the text
    * is fit to the pixel grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMatrix(
      matrix: Option[sn.gnome.pango.Matrix /* Some(Ptr[PangoMatrix]) */ ]
  ): Unit /* None */ =
    pango_context_set_matrix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      matrix
        .map[Ptr[PangoMatrix]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[PangoMatrix]])
    )
  end setMatrix

  /** Sets whether font rendering with this context should round glyph positions
    * and widths to integral positions, in device units.
    *
    * This is useful when the renderer can't handle subpixel positioning of
    * glyphs.
    *
    * The default value is to round glyph positions, to remain compatible with
    * previous Pango behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRoundGlyphPositions(
      round_positions: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_context_set_round_glyph_positions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoContext]],
      gboolean(gint((if round_positions == true then 1 else 0)))
    )
  end setRoundGlyphPositions

end Context

object Context:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[PangoContext])(using Runtime) = summon[Runtime]
    .getOrCreate[Context](ptr.asInstanceOf[Ptr[Byte]], p => new Context(ptr))

  /** Creates a new `PangoContext` initialized to default values.
    *
    * This function is not particularly useful as it should always be followed
    * by a [method@Pango.Context.set_font_map] call, and the function
    * [method@Pango.FontMap.create_context] does these two steps together and
    * hence users are recommended to use that.
    *
    * If you are using Pango as part of a higher-level system, that system may
    * have it's own way of create a `PangoContext`. For instance, the GTK
    * toolkit has, among others, `gtk_widget_get_pango_context()`. Use those
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Context =
    val raw: Ptr[Byte] = pango_context_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Context](raw, r => Context.applyUnsafe(r.asInstanceOf))
  end apply
end Context

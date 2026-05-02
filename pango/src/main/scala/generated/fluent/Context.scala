package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.fluent.Fontset
import sn.gnome.pango.internal.PangoContext
import sn.gnome.pango.internal.PangoDirection
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontMetrics
import sn.gnome.pango.internal.PangoGravity
import sn.gnome.pango.internal.PangoGravityHint
import sn.gnome.pango.internal.PangoLanguage
import sn.gnome.pango.internal.PangoMatrix

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoContext` stores global information used to control the itemization
  * process.
  *
  * The information stored by `PangoContext` includes the fontmap used to look
  * up fonts, and default values such as the default language, default gravity,
  * or default font.
  *
  * To obtain a `PangoContext`, use [method@Pango.FontMap.create_context].
  */
class Context(raw: Ptr[PangoContext]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forces a change in the context, which will cause any `PangoLayout` using
    * this context to re-layout.
    *
    * This function is only useful when implementing a new backend for Pango,
    * something applications won't do. Backends should call this function if
    * they have attached extra data to the context and such data is changed.
    */
  def changed(): Unit /* None */ = pango_context_changed(
    this.raw.asInstanceOf[Ptr[PangoContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the base direction for the context.
    *
    * See [method@Pango.Context.set_base_dir].
    */
  def getBaseDir(): PangoDirection /* None */ = pango_context_get_base_dir(
    this.raw.asInstanceOf[Ptr[PangoContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the base gravity for the context.
    *
    * See [method@Pango.Context.set_base_gravity].
    */
  def getBaseGravity(): PangoGravity /* None */ =
    pango_context_get_base_gravity(this.raw.asInstanceOf[Ptr[PangoContext]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieve the default font description for the context.
    */
  def getFontDescription(): Ptr[PangoFontDescription] /* None */ =
    pango_context_get_font_description(this.raw.asInstanceOf[Ptr[PangoContext]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoFontMap` used to look up fonts for this context.
    */
  def getFontMap(): FontMap /* None */ = new FontMap(
    pango_context_get_font_map(
      this.raw.asInstanceOf[Ptr[PangoContext]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the gravity for the context.
    *
    * This is similar to [method@Pango.Context.get_base_gravity], except for
    * when the base gravity is %PANGO_GRAVITY_AUTO for which
    * [func@Pango.Gravity.get_for_matrix] is used to return the gravity from the
    * current context matrix.
    */
  def getGravity(): PangoGravity /* None */ = pango_context_get_gravity(
    this.raw.asInstanceOf[Ptr[PangoContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the gravity hint for the context.
    *
    * See [method@Pango.Context.set_gravity_hint] for details.
    */
  def getGravityHint(): PangoGravityHint /* None */ =
    pango_context_get_gravity_hint(this.raw.asInstanceOf[Ptr[PangoContext]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the global language tag for the context.
    */
  def getLanguage(): Ptr[PangoLanguage] /* None */ = pango_context_get_language(
    this.raw.asInstanceOf[Ptr[PangoContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the transformation matrix that will be applied when rendering with
    * this context.
    *
    * See [method@Pango.Context.set_matrix].
    */
  def getMatrix(): Ptr[PangoMatrix] /* None */ = pango_context_get_matrix(
    this.raw.asInstanceOf[Ptr[PangoContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get overall metric information for a particular font description.
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
    */
  def getMetrics(
      desc: Option[
        Ptr[PangoFontDescription] /* Some(Ptr[PangoFontDescription]) */
      ],
      language: Option[Ptr[PangoLanguage] /* Some(Ptr[PangoLanguage]) */ ]
  ): Ptr[PangoFontMetrics] /* None */ = pango_context_get_metrics(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    desc
      .map[Ptr[PangoFontDescription]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[PangoFontDescription]]),
    language
      .map[Ptr[PangoLanguage]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[PangoLanguage]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether font rendering with this context should round glyph
    * positions and widths.
    */
  def getRoundGlyphPositions(): Boolean /* None */ =
    pango_context_get_round_glyph_positions(
      this.raw.asInstanceOf[Ptr[PangoContext]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current serial number of @context.
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
    */
  def getSerial(): UInt /* None */ = pango_context_get_serial(
    this.raw.asInstanceOf[Ptr[PangoContext]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * List all families for a context.
    */
  @annotation.compileTimeOnly(
    "Method list_families contains an OUT parameter, which is not supported yet"
  )
  private def listFamilies__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Loads the font in one of the fontmaps in the context that is the closest
    * match for @desc.
    */
  def loadFont(
      desc: Ptr[PangoFontDescription] /* Some(Ptr[PangoFontDescription]) */
  ): Font /* None */ = new Font(
    pango_context_load_font(
      this.raw.asInstanceOf[Ptr[PangoContext]],
      desc
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Load a set of fonts in the context that can be used to render a font
    * matching @desc.
    */
  def loadFontset(
      desc: Ptr[PangoFontDescription] /* Some(Ptr[PangoFontDescription]) */,
      language: Ptr[PangoLanguage] /* Some(Ptr[PangoLanguage]) */
  ): Fontset /* None */ = new Fontset(
    pango_context_load_fontset(
      this.raw.asInstanceOf[Ptr[PangoContext]],
      desc,
      language
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the base direction for the context.
    *
    * The base direction is used in applying the Unicode bidirectional
    * algorithm; if the @direction is %PANGO_DIRECTION_LTR or
    * %PANGO_DIRECTION_RTL, then the value will be used as the paragraph
    * direction in the Unicode bidirectional algorithm. A value of
    * %PANGO_DIRECTION_WEAK_LTR or %PANGO_DIRECTION_WEAK_RTL is used only for
    * paragraphs that do not contain any strong characters themselves.
    */
  def setBaseDir(
      direction: PangoDirection /* Some(PangoDirection) */
  ): Unit /* None */ = pango_context_set_base_dir(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    direction
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the base gravity for the context.
    *
    * The base gravity is used in laying vertical text out.
    */
  def setBaseGravity(
      gravity: PangoGravity /* Some(PangoGravity) */
  ): Unit /* None */ = pango_context_set_base_gravity(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    gravity
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the default font description for the context
    */
  def setFontDescription(
      desc: Option[
        Ptr[PangoFontDescription] /* Some(Ptr[PangoFontDescription]) */
      ]
  ): Unit /* None */ = pango_context_set_font_description(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    desc
      .map[Ptr[PangoFontDescription]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[PangoFontDescription]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the font map to be searched when fonts are looked-up in this context.
    *
    * This is only for internal use by Pango backends, a `PangoContext` obtained
    * via one of the recommended methods should already have a suitable font
    * map.
    */
  def setFontMap(
      font_map: Option[FontMap /* Some(Ptr[PangoFontMap]) */ ]
  ): Unit /* None */ = pango_context_set_font_map(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    font_map
      .map[Ptr[PangoFontMap]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[PangoFontMap]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the gravity hint for the context.
    *
    * The gravity hint is used in laying vertical text out, and is only relevant
    * if gravity of the context as returned by
    * [method@Pango.Context.get_gravity] is set to %PANGO_GRAVITY_EAST or
    * %PANGO_GRAVITY_WEST.
    */
  def setGravityHint(
      hint: PangoGravityHint /* Some(PangoGravityHint) */
  ): Unit /* None */ = pango_context_set_gravity_hint(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    hint
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the global language tag for the context.
    *
    * The default language for the locale of the running process can be found
    * using [func@Pango.Language.get_default].
    */
  def setLanguage(
      language: Option[Ptr[PangoLanguage] /* Some(Ptr[PangoLanguage]) */ ]
  ): Unit /* None */ = pango_context_set_language(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    language
      .map[Ptr[PangoLanguage]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[PangoLanguage]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the transformation matrix that will be applied when rendering with
    * this context.
    *
    * Note that reported metrics are in the user space coordinates before the
    * application of the matrix, not device-space coordinates after the
    * application of the matrix. So, they don't scale with the matrix, though
    * they may change slightly for different matrices, depending on how the text
    * is fit to the pixel grid.
    */
  def setMatrix(
      matrix: Option[Ptr[PangoMatrix] /* Some(Ptr[PangoMatrix]) */ ]
  ): Unit /* None */ = pango_context_set_matrix(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    matrix
      .map[Ptr[PangoMatrix]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[PangoMatrix]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether font rendering with this context should round glyph positions
    * and widths to integral positions, in device units.
    *
    * This is useful when the renderer can't handle subpixel positioning of
    * glyphs.
    *
    * The default value is to round glyph positions, to remain compatible with
    * previous Pango behavior.
    */
  def setRoundGlyphPositions(
      round_positions: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = pango_context_set_round_glyph_positions(
    this.raw.asInstanceOf[Ptr[PangoContext]],
    gboolean(gint((if round_positions == true then 1 else 0)))
  )

end Context

object Context:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `PangoContext` initialized to default values.
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
    */
  def apply(): Context = new Context(pango_context_new().asInstanceOf)
end Context

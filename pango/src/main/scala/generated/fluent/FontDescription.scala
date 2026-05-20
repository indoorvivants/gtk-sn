package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.pango.{
  FontDescription,
  FontMask,
  Gravity,
  Stretch,
  Style,
  Variant,
  Weight
}
import sn.gnome.pango.internal.PangoFontDescription

/** A `PangoFontDescription` describes a font in an implementation-independent
  * manner.
  *
  * `PangoFontDescription` structures are used both to list what fonts are
  * available on the system and also for specifying the characteristics of a
  * font to load.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontDescription private[gnome] (raw: Ptr[PangoFontDescription]):

  def getUnsafeRawPointer(): Ptr[PangoFontDescription] = this.raw

  /** Determines if the style attributes of @new_match are a closer match for @desc
    * than those of @old_match are, or if @old_match is %NULL, determines if @new_match
    * is a match at all.
    *
    * Approximate matching is done for weight and style; other style attributes
    * must match exactly. Style attributes are all attributes other than family
    * and size-related attributes. Approximate matching for style considers
    * %PANGO_STYLE_OBLIQUE and %PANGO_STYLE_ITALIC as matches, but not as good a
    * match as when the styles are equal.
    *
    * Note that @old_match must match @desc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def betterMatch(
      old_match: Option[
        sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
      ],
      new_match: sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
  ): Boolean /* None */ =
    pango_font_description_better_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      old_match
        .map[Ptr[PangoFontDescription]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[PangoFontDescription]]),
      new_match.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end betterMatch

  /** Make a copy of a `PangoFontDescription`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.FontDescription /* None */ =
    sn.gnome.pango.FontDescription.fromRaw(
      pango_font_description_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end copy

  /** Make a copy of a `PangoFontDescription`, but don't duplicate allocated
    * fields.
    *
    * This is like [method@Pango.FontDescription.copy], but only a shallow copy
    * is made of the family name and other allocated fields. The result can only
    * be used until @desc is modified or freed. This is meant to be used when
    * the copy is only needed temporarily.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyStatic(): sn.gnome.pango.FontDescription /* None */ =
    sn.gnome.pango.FontDescription.fromRaw(
      pango_font_description_copy_static(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end copyStatic

  /** Compares two font descriptions for equality.
    *
    * Two font descriptions are considered equal if the fonts they describe are
    * provably identical. This means that their masks do not have to match, as
    * long as other fields are all the same. (Two font descriptions may result
    * in identical fonts being loaded, but still compare %FALSE.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      desc2: sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
  ): Boolean /* None */ =
    pango_font_description_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      desc2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Frees a font description.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_font_description_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
    )
  end free

  /** Gets the family name field of a font description.
    *
    * See [method@Pango.FontDescription.set_family].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(): scala.Predef.String /* None */ =
    fromCString(
      pango_font_description_get_family(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      ).asInstanceOf
    )
  end getFamily

  /** Gets the gravity field of a font description.
    *
    * See [method@Pango.FontDescription.set_gravity].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGravity(): sn.gnome.pango.Gravity /* None */ =
    sn.gnome.pango.Gravity.fromRaw(
      pango_font_description_get_gravity(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end getGravity

  /** Determines which fields in a font description have been set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSetFields(): sn.gnome.pango.FontMask /* None */ =
    sn.gnome.pango.FontMask.fromRaw(
      pango_font_description_get_set_fields(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end getSetFields

  /** Gets the size field of a font description.
    *
    * See [method@Pango.FontDescription.set_size].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): Int /* None */ =
    pango_font_description_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
    ).value
  end getSize

  /** Determines whether the size of the font is in points (not absolute) or
    * device units (absolute).
    *
    * See [method@Pango.FontDescription.set_size] and
    * [method@Pango.FontDescription.set_absolute_size].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSizeIsAbsolute(): Boolean /* None */ =
    pango_font_description_get_size_is_absolute(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
    ).value.!=(0)
  end getSizeIsAbsolute

  /** Gets the stretch field of a font description.
    *
    * See [method@Pango.FontDescription.set_stretch].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStretch(): sn.gnome.pango.Stretch /* None */ =
    sn.gnome.pango.Stretch.fromRaw(
      pango_font_description_get_stretch(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end getStretch

  /** Gets the style field of a `PangoFontDescription`.
    *
    * See [method@Pango.FontDescription.set_style].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStyle(): sn.gnome.pango.Style /* None */ =
    sn.gnome.pango.Style.fromRaw(
      pango_font_description_get_style(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end getStyle

  /** Gets the variant field of a `PangoFontDescription`.
    *
    * See [method@Pango.FontDescription.set_variant].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVariant(): sn.gnome.pango.Variant /* None */ =
    sn.gnome.pango.Variant.fromRaw(
      pango_font_description_get_variant(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end getVariant

  /** Gets the variations field of a font description.
    *
    * See [method@Pango.FontDescription.set_variations].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVariations(): scala.Predef.String /* None */ =
    fromCString(
      pango_font_description_get_variations(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      ).asInstanceOf
    )
  end getVariations

  /** Gets the weight field of a font description.
    *
    * See [method@Pango.FontDescription.set_weight].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWeight(): sn.gnome.pango.Weight /* None */ =
    sn.gnome.pango.Weight.fromRaw(
      pango_font_description_get_weight(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      )
    )
  end getWeight

  /** Computes a hash of a `PangoFontDescription` structure.
    *
    * This is suitable to be used, for example, as an argument to
    * g_hash_table_new(). The hash value is independent of @desc->mask.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    pango_font_description_hash(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
    ).value
  end hash

  /** Merges the fields that are set in @desc_to_merge into the fields in
    * @desc.
    *
    * If @replace_existing is %FALSE, only fields in @desc that are not already
    * set are affected. If %TRUE, then fields that are already set will be
    * replaced as well.
    *
    * If @desc_to_merge is %NULL, this function performs nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def merge(
      desc_to_merge: Option[
        sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */
      ],
      replace_existing: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_font_description_merge(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      desc_to_merge
        .map[Ptr[PangoFontDescription]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[PangoFontDescription]]),
      gboolean(gint((if replace_existing == true then 1 else 0)))
    )
  end merge

  /** Merges the fields that are set in @desc_to_merge into the fields in
    * @desc,
    *   without copying allocated fields.
    *
    * This is like [method@Pango.FontDescription.merge], but only a shallow copy
    * is made of the family name and other allocated fields. @desc can only be
    * used until @desc_to_merge is modified or freed. This is meant to be used
    * when the merged font description is only needed temporarily.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mergeStatic(
      desc_to_merge: sn.gnome.pango.FontDescription /* Some(Ptr[PangoFontDescription]) */,
      replace_existing: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_font_description_merge_static(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      desc_to_merge.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if replace_existing == true then 1 else 0)))
    )
  end mergeStatic

  /** Sets the size field of a font description, in device units.
    *
    * This is mutually exclusive with [method@Pango.FontDescription.set_size]
    * which sets the font size in points.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAbsoluteSize(size: Double /* Some(Double) */ ): Unit /* None */ =
    pango_font_description_set_absolute_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      size
    )
  end setAbsoluteSize

  /** Sets the family name field of a font description.
    *
    * The family name represents a family of related font styles, and will
    * resolve to a particular `PangoFontFamily`. In some uses of
    * `PangoFontDescription`, it is also possible to use a comma separated list
    * of family names for this field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFamily(
      family: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    pango_font_description_set_family(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      toCString(family)
    )
  end setFamily

  /** Sets the family name field of a font description, without copying the
    * string.
    *
    * This is like [method@Pango.FontDescription.set_family], except that no
    * copy of @family is made. The caller must make sure that the string passed
    * in stays around until @desc has been freed or the name is set again. This
    * function can be used if @family is a static string such as a C string
    * literal, or if @desc is only needed temporarily.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFamilyStatic(
      family: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    pango_font_description_set_family_static(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      toCString(family)
    )
  end setFamilyStatic

  /** Sets the gravity field of a font description.
    *
    * The gravity field specifies how the glyphs should be rotated. If @gravity
    * is %PANGO_GRAVITY_AUTO, this actually unsets the gravity mask on the font
    * description.
    *
    * This function is seldom useful to the user. Gravity should normally be set
    * on a `PangoContext`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setGravity(
      gravity: sn.gnome.pango.Gravity /* Some(PangoGravity) */
  ): Unit /* None */ =
    pango_font_description_set_gravity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      gravity.raw
    )
  end setGravity

  /** Sets the size field of a font description in fractional points.
    *
    * This is mutually exclusive with
    * [method@Pango.FontDescription.set_absolute_size].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      size: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    pango_font_description_set_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      gint(size)
    )
  end setSize

  /** Sets the stretch field of a font description.
    *
    * The [enum@Pango.Stretch] field specifies how narrow or wide the font
    * should be.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStretch(
      stretch: sn.gnome.pango.Stretch /* Some(PangoStretch) */
  ): Unit /* None */ =
    pango_font_description_set_stretch(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      stretch.raw
    )
  end setStretch

  /** Sets the style field of a `PangoFontDescription`.
    *
    * The [enum@Pango.Style] enumeration describes whether the font is slanted
    * and the manner in which it is slanted; it can be either
    * %PANGO_STYLE_NORMAL, %PANGO_STYLE_ITALIC, or %PANGO_STYLE_OBLIQUE.
    *
    * Most fonts will either have a italic style or an oblique style, but not
    * both, and font matching in Pango will match italic specifications with
    * oblique fonts and vice-versa if an exact match is not found.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStyle(
      style: sn.gnome.pango.Style /* Some(PangoStyle) */
  ): Unit /* None */ =
    pango_font_description_set_style(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      style.raw
    )
  end setStyle

  /** Sets the variant field of a font description.
    *
    * The [enum@Pango.Variant] can either be %PANGO_VARIANT_NORMAL or
    * %PANGO_VARIANT_SMALL_CAPS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVariant(
      variant: sn.gnome.pango.Variant /* Some(PangoVariant) */
  ): Unit /* None */ =
    pango_font_description_set_variant(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      variant.raw
    )
  end setVariant

  /** Sets the variations field of a font description.
    *
    * OpenType font variations allow to select a font instance by specifying
    * values for a number of axes, such as width or weight.
    *
    * The format of the variations string is
    *
    * AXIS1=VALUE,AXIS2=VALUE...
    *
    * with each AXIS a 4 character tag that identifies a font axis, and each
    * VALUE a floating point number. Unknown axes are ignored, and values are
    * clamped to their allowed range.
    *
    * Pango does not currently have a way to find supported axes of a font. Both
    * harfbuzz and freetype have API for this. See for example
    * [hb_ot_var_get_axis_infos](https://harfbuzz.github.io/harfbuzz-hb-ot-var.html#hb-ot-var-get-axis-infos).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVariations(
      variations: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    pango_font_description_set_variations(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      variations
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setVariations

  /** Sets the variations field of a font description.
    *
    * This is like [method@Pango.FontDescription.set_variations], except that no
    * copy of @variations is made. The caller must make sure that the string
    * passed in stays around until @desc has been freed or the name is set
    * again. This function can be used if
    * @variations
    *   is a static string such as a C string literal, or if @desc is only
    *   needed temporarily.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVariationsStatic(
      variations: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    pango_font_description_set_variations_static(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      toCString(variations)
    )
  end setVariationsStatic

  /** Sets the weight field of a font description.
    *
    * The weight field specifies how bold or light the font should be. In
    * addition to the values of the [enum@Pango.Weight] enumeration, other
    * intermediate numeric values are possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWeight(
      weight: sn.gnome.pango.Weight /* Some(PangoWeight) */
  ): Unit /* None */ =
    pango_font_description_set_weight(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      weight.raw
    )
  end setWeight

  /** Creates a filename representation of a font description.
    *
    * The filename is identical to the result from calling
    * [method@Pango.FontDescription.to_string], but with underscores instead of
    * characters that are untypical in filenames, and in lower case only.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toFilename(): scala.Predef.String /* None */ =
    fromCString(
      pango_font_description_to_filename(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      ).asInstanceOf
    )
  end toFilename

  /** Creates a string representation of a font description.
    *
    * See [func@Pango.FontDescription.from_string] for a description of the
    * format of the string representation. The family list in the string
    * description will only have a terminating comma if the last word of the
    * list is a valid style option.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      pango_font_description_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]]
      ).asInstanceOf
    )
  end _toString

  /** Unsets some of the fields in a `PangoFontDescription`.
    *
    * The unset fields will get back to their default values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetFields(
      to_unset: sn.gnome.pango.FontMask /* Some(PangoFontMask) */
  ): Unit /* None */ =
    pango_font_description_unset_fields(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontDescription]],
      to_unset.raw
    )
  end unsetFields

end FontDescription

object FontDescription:
  def fromRaw(ptr: Ptr[PangoFontDescription]): FontDescription =
    new FontDescription(ptr)
end FontDescription

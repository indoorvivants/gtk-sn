package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.PatternSpec
import sn.gnome.glib.internal.{GPatternSpec, gboolean, gchar, gint, gsize}

/** A GPatternSpec struct is the 'compiled' form of a pattern. This structure is
  * opaque and its fields cannot be accessed directly.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PatternSpec private[gnome] (raw: Ptr[GPatternSpec]):

  def getUnsafeRawPointer(): Ptr[GPatternSpec] = this.raw

  /** Copies @pspec in a new #GPatternSpec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.PatternSpec /* None */ =
    sn.gnome.glib.PatternSpec.fromRaw(
      g_pattern_spec_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GPatternSpec]]
      )
    )
  end copy

  /** Compares two compiled pattern specs and returns whether they will match
    * the same set of strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      pspec2: sn.gnome.glib.PatternSpec /* Some(Ptr[GPatternSpec]) */
  ): Boolean /* None */ =
    g_pattern_spec_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPatternSpec]],
      pspec2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Frees the memory allocated for the #GPatternSpec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_pattern_spec_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPatternSpec]]
    )
  end free

  /** Matches a string against a compiled pattern. Passing the correct length of
    * the string given is mandatory. The reversed string can be omitted by
    * passing %NULL, this is more efficient if the reversed version of the
    * string to be matched is not at hand, as g_pattern_match() will only
    * construct it if the compiled pattern requires reverse matches.
    *
    * Note that, if the user code will (possibly) match a string against a
    * multitude of patterns containing wildcards, chances are high that some
    * patterns will require a reversed string. In this case, it's more efficient
    * to provide the reversed string to avoid multiple constructions thereof in
    * the various calls to g_pattern_match().
    *
    * Note also that the reverse of a UTF-8 encoded string can in general not be
    * obtained by g_strreverse(). This works only if the string does not contain
    * any multibyte characters. GLib offers the g_utf8_strreverse() function to
    * reverse UTF-8 encoded strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `match`(
      string_length: CUnsignedLongInt /* Some(gsize) */,
      string: scala.Predef.String /* Some(Ptr[gchar]) */,
      string_reversed: Option[scala.Predef.String /* Some(Ptr[gchar]) */ ]
  )(using Zone): Boolean /* None */ =
    g_pattern_spec_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPatternSpec]],
      gsize(string_length),
      toCString(string).asInstanceOf[Ptr[gchar]],
      string_reversed
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).value.!=(0)
  end `match`

  /** Matches a string against a compiled pattern. If the string is to be
    * matched against more than one pattern, consider using g_pattern_match()
    * instead while supplying the reversed string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matchString(
      string: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* None */ =
    g_pattern_spec_match_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPatternSpec]],
      toCString(string).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end matchString

end PatternSpec

object PatternSpec:
  def fromRaw(ptr: Ptr[GPatternSpec]): PatternSpec = new PatternSpec(ptr)
end PatternSpec

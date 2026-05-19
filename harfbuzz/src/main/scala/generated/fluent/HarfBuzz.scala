package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.harfbuzz.{Buffer_serialize_format_t, Direction_t, Script_t}
import sn.gnome.runtime.*

object HarfBuzz:
  /** Fetches the name identifier of the specified feature type in the face's
    * `name` table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[aat_layout_feature_type_get_name_id:]: Method hb_aat_layout_feature_type_get_name_id has no target types"
  )
  private def aatLayoutFeatureTypeGetNameId() = ???

  /** Fetches a list of the selectors available for the specified feature in the
    * given face.
    *
    * If upon return, @default_index is set to #HB_AAT_LAYOUT_NO_SELECTOR_INDEX,
    * then the feature type is non-exclusive. Otherwise, @default_index is the
    * index of the selector that is selected by default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[aat_layout_feature_type_get_selector_infos:]: Function aat_layout_feature_type_get_selector_infos contains an OUT parameter, which is not supported yet"
  )
  private def aatLayoutFeatureTypeGetSelectorInfos() = ???

  /** Fetches a list of the AAT feature types included in the specified face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[aat_layout_get_feature_types:]: Function aat_layout_get_feature_types contains an OUT parameter, which is not supported yet"
  )
  private def aatLayoutGetFeatureTypes() = ???

  /** Tests whether the specified face includes any positioning information in
    * the `kerx` table.
    *
    * <note>Note: does not examine the `GPOS` table.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[aat_layout_has_positioning:]: Method hb_aat_layout_has_positioning has no target types"
  )
  private def aatLayoutHasPositioning() = ???

  /** Tests whether the specified face includes any substitutions in the `morx`
    * or `mort` tables.
    *
    * <note>Note: does not examine the `GSUB` table.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[aat_layout_has_substitution:]: Method hb_aat_layout_has_substitution has no target types"
  )
  private def aatLayoutHasSubstitution() = ???

  /** Tests whether the specified face includes any tracking information in the
    * `trak` table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[aat_layout_has_tracking:]: Method hb_aat_layout_has_tracking has no target types"
  )
  private def aatLayoutHasTracking() = ???

  /** Makes a writable copy of @blob.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_copy_writable_or_fail:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobCopyWritableOrFail() = ???

  /** Creates a new "blob" object wrapping @data. The @mode parameter is used to
    * negotiate ownership and lifecycle of @data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_create:/<function parameters>/length]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  private def blobCreate() = ???

  /** Creates a new blob containing the data from the specified binary font
    * file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_create_from_file:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobCreateFromFile() = ???

  /** Creates a new blob containing the data from the specified binary font
    * file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_create_from_file_or_fail:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobCreateFromFileOrFail() = ???

  /** Creates a new "blob" object wrapping @data. The @mode parameter is used to
    * negotiate ownership and lifecycle of @data.
    *
    * Note that this function returns a freshly-allocated empty blob even if @length
    * is zero. This is in contrast to hb_blob_create(), which returns the
    * singleton empty blob (as returned by hb_blob_get_empty()) if @length is
    * zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_create_or_fail:/<function parameters>/length]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  private def blobCreateOrFail() = ???

  /** Returns a blob that represents a range of bytes in @parent. The new blob
    * is always created with #HB_MEMORY_MODE_READONLY, meaning that it will
    * never modify data in the parent blob. The parent data is not expected to
    * be modified, and will result in undefined behavior if it is.
    *
    * Makes @parent immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_create_sub_blob:/<function parameters>/parent]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobCreateSubBlob() = ???

  /** Decreases the reference count on @blob, and if it reaches zero, destroys
    * @blob,
    *   freeing all memory, possibly calling the destroy-callback the blob was
    *   created for if it has not been called already.
    *
    * See TODO:link object types for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_destroy:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobDestroy() = ???

  /** Fetches the data from a blob.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_get_data:]: Function blob_get_data contains an OUT parameter, which is not supported yet"
  )
  private def blobGetData() = ???

  /** Tries to make blob data writable (possibly copying it) and return pointer
    * to data.
    *
    * Fails if blob has been made immutable, or if memory allocation fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_get_data_writable:]: Function blob_get_data_writable contains an OUT parameter, which is not supported yet"
  )
  private def blobGetDataWritable() = ???

  /** Returns the singleton empty blob.
    *
    * See TODO:link object types for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobGetEmpty() = ???

  /** Fetches the length of a blob's data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_get_length:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobGetLength() = ???

  /** Fetches the user data associated with the specified key, attached to the
    * specified font-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_get_user_data:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(const hb_blob_t*)))"
  )
  private def blobGetUserData() = ???

  /** Tests whether a blob is immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_is_immutable:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobIsImmutable() = ???

  /** Makes a blob immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_make_immutable:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobMakeImmutable() = ???

  /** Increases the reference count on @blob.
    *
    * See TODO:link object types for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_reference:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobReference() = ???

  /** Attaches a user-data key/data pair to the specified blob.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob_set_user_data:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def blobSetUserData() = ???

  /** Appends a character with the Unicode value of @codepoint to @buffer, and
    * gives it the initial cluster value of @cluster. Clusters can be any thing
    * the client wants, they are usually used to refer to the index of the
    * character in the input text stream and are output in
    * #hb_glyph_info_t.cluster field.
    *
    * This function does not check the validity of @codepoint, it is up to the
    * caller to ensure it is a valid Unicode code point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_add:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAdd() = ???

  /** Appends characters from @text array to @buffer. The @item_offset is the
    * position of the first character from @text that will be appended, and
    * @item_length
    *   is the number of character. When shaping part of a larger text (e.g. a
    *   run of text from a paragraph), instead of passing just the substring
    *   corresponding to the run, it is preferable to pass the whole paragraph
    *   and specify the run start and length as @item_offset and
    * @item_length,
    *   respectively, to give HarfBuzz the full context to be able, for example,
    *   to do cross-run Arabic shaping or properly handle combining marks at
    *   stat of run.
    *
    * This function does not check the validity of @text, it is up to the caller
    * to ensure it contains a valid Unicode scalar values. In contrast,
    * hb_buffer_add_utf32() can be used that takes similar input but performs
    * sanity-check on the input.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_add_codepoints:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAddCodepoints() = ???

  /** Similar to hb_buffer_add_codepoints(), but allows only access to first 256
    * Unicode code points that can fit in 8-bit strings.
    *
    * <note>Has nothing to do with non-Unicode Latin-1 encoding.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_add_latin1:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAddLatin1() = ???

  /** See hb_buffer_add_codepoints().
    *
    * Replaces invalid UTF-16 characters with the @buffer replacement code
    * point, see hb_buffer_set_replacement_codepoint().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_add_utf16:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAddUtf16() = ???

  /** See hb_buffer_add_codepoints().
    *
    * Replaces invalid UTF-32 characters with the @buffer replacement code
    * point, see hb_buffer_set_replacement_codepoint().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_add_utf32:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAddUtf32() = ???

  /** See hb_buffer_add_codepoints().
    *
    * Replaces invalid UTF-8 characters with the @buffer replacement code point,
    * see hb_buffer_set_replacement_codepoint().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_add_utf8:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAddUtf8() = ???

  /** Check if allocating memory for the buffer succeeded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_allocation_successful:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAllocationSuccessful() = ???

  /** Append (part of) contents of another buffer to this buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_append:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferAppend() = ???

  /** Similar to hb_buffer_reset(), but does not clear the Unicode functions and
    * the replacement code point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_clear_contents:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferClearContents() = ???

  /** Creates a new #hb_buffer_t with all properties to defaults.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_create:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferCreate() = ???

  /** Creates a new #hb_buffer_t, similar to hb_buffer_create(). The only
    * difference is that the buffer is configured similarly to @src.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_create_similar:/<function parameters>/src]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferCreateSimilar() = ???

  /** Deserializes glyphs @buffer from textual representation in the format
    * produced by hb_buffer_serialize_glyphs().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_deserialize_glyphs:]: Function buffer_deserialize_glyphs contains an OUT parameter, which is not supported yet"
  )
  private def bufferDeserializeGlyphs() = ???

  /** Deserializes Unicode @buffer from textual representation in the format
    * produced by hb_buffer_serialize_unicode().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_deserialize_unicode:]: Function buffer_deserialize_unicode contains an OUT parameter, which is not supported yet"
  )
  private def bufferDeserializeUnicode() = ???

  /** Deallocate the @buffer. Decreases the reference count on @buffer by one.
    * If the result is zero, then
    * @buffer
    *   and all associated resources are freed. See hb_buffer_reference().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_destroy:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferDestroy() = ???

  /** If dottedcircle_glyph is (hb_codepoint_t) -1 then
    * #HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT and
    * #HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT are never returned. This should be
    * used by most callers if just comparing two buffers is needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_diff:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferDiff() = ???

  /** Fetches the cluster level of a buffer. The #hb_buffer_cluster_level_t
    * dictates one aspect of how HarfBuzz will treat non-base characters during
    * shaping.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_cluster_level:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetClusterLevel() = ???

  /** Fetches the type of @buffer contents. Buffers are either empty, contain
    * characters (before shaping), or contain glyphs (the result of shaping).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_content_type:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetContentType() = ???

  /** See hb_buffer_set_direction()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_direction:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetDirection() = ???

  /** Fetches an empty #hb_buffer_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferGetEmpty() = ???

  /** Fetches the #hb_buffer_flags_t of @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_flags:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetFlags() = ???

  /** Returns @buffer glyph information array. Returned pointer is valid as long
    * as @buffer contents are not modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_glyph_infos:]: Function buffer_get_glyph_infos contains an OUT parameter, which is not supported yet"
  )
  private def bufferGetGlyphInfos() = ???

  /** Returns @buffer glyph position array. Returned pointer is valid as long as @buffer
    * contents are not modified.
    *
    * If buffer did not have positions before, the positions will be initialized
    * to zeros, unless this function is called from within a buffer message
    * callback (see hb_buffer_set_message_func()), in which case `NULL` is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_glyph_positions:]: Function buffer_get_glyph_positions contains an OUT parameter, which is not supported yet"
  )
  private def bufferGetGlyphPositions() = ???

  /** See hb_buffer_set_invisible_glyph().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_invisible_glyph:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetInvisibleGlyph() = ???

  /** See hb_buffer_set_language().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_language:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetLanguage() = ???

  /** Returns the number of items in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_length:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetLength() = ???

  /** See hb_buffer_set_not_found_glyph().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_not_found_glyph:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetNotFoundGlyph() = ???

  /** Fetches the #hb_codepoint_t that replaces invalid entries for a given
    * encoding when adding text to @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_replacement_codepoint:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetReplacementCodepoint() = ???

  /** Fetches the script of @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_script:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetScript() = ???

  /** Sets @props to the #hb_segment_properties_t of @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_segment_properties:]: Function buffer_get_segment_properties contains an OUT parameter, which is not supported yet"
  )
  private def bufferGetSegmentProperties() = ???

  /** Fetches the Unicode-functions structure of a buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_unicode_funcs:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetUnicodeFuncs() = ???

  /** Fetches the user data associated with the specified key, attached to the
    * specified buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_get_user_data:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  private def bufferGetUserData() = ???

  /** Sets unset buffer segment properties based on buffer Unicode contents. If
    * buffer is not empty, it must have content type
    * #HB_BUFFER_CONTENT_TYPE_UNICODE.
    *
    * If buffer script is not set (ie. is #HB_SCRIPT_INVALID), it will be set to
    * the Unicode script of the first character in the buffer that has a script
    * other than #HB_SCRIPT_COMMON, #HB_SCRIPT_INHERITED, and
    * #HB_SCRIPT_UNKNOWN.
    *
    * Next, if buffer direction is not set (ie. is #HB_DIRECTION_INVALID), it
    * will be set to the natural horizontal direction of the buffer script as
    * returned by hb_script_get_horizontal_direction(). If
    * hb_script_get_horizontal_direction() returns #HB_DIRECTION_INVALID, then
    * #HB_DIRECTION_LTR is used.
    *
    * Finally, if buffer language is not set (ie. is #HB_LANGUAGE_INVALID), it
    * will be set to the process's default language as returned by
    * hb_language_get_default(). This may change in the future by taking buffer
    * script into consideration when choosing a language. Note that
    * hb_language_get_default() is NOT threadsafe the first time it is called.
    * See documentation for that function for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_guess_segment_properties:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferGuessSegmentProperties() = ???

  /** Returns whether @buffer has glyph position data. A buffer gains position
    * data when hb_buffer_get_glyph_positions() is called on it, and cleared of
    * position data when hb_buffer_clear_contents() is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_has_positions:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferHasPositions() = ???

  /** Reorders a glyph buffer to have canonical in-cluster glyph order /
    * position. The resulting clusters should behave identical to pre-reordering
    * clusters.
    *
    * <note>This has nothing to do with Unicode normalization.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_normalize_glyphs:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferNormalizeGlyphs() = ???

  /** Pre allocates memory for @buffer to fit at least @size number of items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_pre_allocate:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferPreAllocate() = ???

  /** Increases the reference count on @buffer by one. This prevents @buffer
    * from being destroyed until a matching call to hb_buffer_destroy() is made.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_reference:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferReference() = ???

  /** Resets the buffer to its initial status, as if it was just newly created
    * with hb_buffer_create().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_reset:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferReset() = ???

  /** Reverses buffer contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_reverse:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferReverse() = ???

  /** Reverses buffer clusters. That is, the buffer contents are reversed, then
    * each cluster (consecutive items having the same cluster number) are
    * reversed again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_reverse_clusters:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferReverseClusters() = ???

  /** Reverses buffer contents between @start and @end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_reverse_range:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferReverseRange() = ???

  /** Serializes @buffer into a textual representation of its content, whether
    * Unicode codepoints or glyph identifiers and positioning information. This
    * is useful for showing the contents of the buffer, for example during
    * debugging. See the documentation of hb_buffer_serialize_unicode() and
    * hb_buffer_serialize_glyphs() for a description of the output format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_serialize:]: Function buffer_serialize contains an OUT parameter, which is not supported yet"
  )
  private def bufferSerialize() = ???

  /** Parses a string into an #hb_buffer_serialize_format_t. Does not check if
    * @str
    *   is a valid buffer serialization format, use
    *   hb_buffer_serialize_list_formats() to get the list of supported formats.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_serialize_format_from_string:/<function parameters>/str]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  private def bufferSerializeFormatFromString() = ???

  /** Converts @format to the string corresponding it, or `NULL` if it is not a
    * valid #hb_buffer_serialize_format_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bufferSerializeFormatToString(
      format: Buffer_serialize_format_t /* Some(hb_buffer_serialize_format_t) */
  ): String /* Some(CString) */ = fromCString(
    hb_buffer_serialize_format_to_string(format.raw).asInstanceOf
  )

  /** Serializes @buffer into a textual representation of its glyph content,
    * useful for showing the contents of the buffer, for example during
    * debugging. There are currently two supported serialization formats:
    *
    * ## text A human-readable, plain text format. The serialized glyphs will
    * look something like:
    *
    * ```
    * [uni0651=0@518,0+0|uni0628=0+1897]
    * ```
    *
    *   - The serialized glyphs are delimited with `[` and `]`.
    *   - Glyphs are separated with `|`
    *   - Each glyph starts with glyph name, or glyph index if
    *     #HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES flag is set. Then,
    *     - If #HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS is not set, `=` then
    *       #hb_glyph_info_t.cluster.
    *     - If #HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS is not set, the
    *       #hb_glyph_position_t in the format:
    *       - If both #hb_glyph_position_t.x_offset and
    *         #hb_glyph_position_t.y_offset are not 0, `@x_offset,y_offset`.
    *         Then,
    *       - `+x_advance`, then `,y_advance` if #hb_glyph_position_t.y_advance
    *         is not 0. Then,
    *     - If #HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS is set, the
    *       #hb_glyph_extents_t in the format
    *       `<x_bearing,y_bearing,width,height>`
    *
    * ## json A machine-readable, structured format. The serialized glyphs will
    * look something like:
    *
    * ```
    * [{"g":"uni0651","cl":0,"dx":518,"dy":0,"ax":0,"ay":0},
    * {"g":"uni0628","cl":0,"dx":0,"dy":0,"ax":1897,"ay":0}]
    * ```
    *
    * Each glyph is a JSON object, with the following properties:
    *   - `g`: the glyph name or glyph index if
    *     #HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES flag is set.
    *   - `cl`: #hb_glyph_info_t.cluster if
    *     #HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS is not set.
    *   - `dx`,`dy`,`ax`,`ay`: #hb_glyph_position_t.x_offset,
    *     #hb_glyph_position_t.y_offset, #hb_glyph_position_t.x_advance and
    *     #hb_glyph_position_t.y_advance respectively, if
    *     #HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS is not set.
    *   - `xb`,`yb`,`w`,`h`: #hb_glyph_extents_t.x_bearing,
    *     #hb_glyph_extents_t.y_bearing, #hb_glyph_extents_t.width and
    *     #hb_glyph_extents_t.height respectively if
    *     #HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_serialize_glyphs:]: Function buffer_serialize_glyphs contains an OUT parameter, which is not supported yet"
  )
  private def bufferSerializeGlyphs() = ???

  /** Returns a list of supported buffer serialization formats.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bufferSerializeListFormats(): Array[String] /* Some(Ptr[CString]) */ =
    MemoryRead
      .nullTerminatedPointerArray(hb_buffer_serialize_list_formats())
      .map(fromCString(_))

  /** Serializes @buffer into a textual representation of its content, when the
    * buffer contains Unicode codepoints (i.e., before shaping). This is useful
    * for showing the contents of the buffer, for example during debugging.
    * There are currently two supported serialization formats:
    *
    * ## text A human-readable, plain text format. The serialized codepoints
    * will look something like:
    *
    * ```
    *  <U+0651=0|U+0628=1>
    * ```
    *
    *   - Glyphs are separated with `|`
    *   - Unicode codepoints are expressed as zero-padded four (or more) digit
    *     hexadecimal numbers preceded by `U+`
    *   - If #HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS is not set, the cluster will
    *     be indicated with a `=` then #hb_glyph_info_t.cluster.
    *
    * ## json A machine-readable, structured format. The serialized codepoints
    * will be a list of objects with the following properties:
    *   - `u`: the Unicode codepoint as a decimal integer
    *   - `cl`: #hb_glyph_info_t.cluster if
    *     #HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS is not set.
    *
    * For example:
    *
    * ```
    * [{u:1617,cl:0},{u:1576,cl:1}]
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_serialize_unicode:]: Function buffer_serialize_unicode contains an OUT parameter, which is not supported yet"
  )
  private def bufferSerializeUnicode() = ???

  /** Sets the cluster level of a buffer. The #hb_buffer_cluster_level_t
    * dictates one aspect of how HarfBuzz will treat non-base characters during
    * shaping.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_cluster_level:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetClusterLevel() = ???

  /** Sets the type of @buffer contents. Buffers are either empty, contain
    * characters (before shaping), or contain glyphs (the result of shaping).
    *
    * You rarely need to call this function, since a number of other functions
    * transition the content type for you. Namely:
    *
    *   - A newly created buffer starts with content type
    *     %HB_BUFFER_CONTENT_TYPE_INVALID. Calling hb_buffer_reset(),
    *     hb_buffer_clear_contents(), as well as calling hb_buffer_set_length()
    *     with an argument of zero all set the buffer content type to invalid as
    *     well.
    *   - Calling hb_buffer_add_utf8(), hb_buffer_add_utf16(),
    *     hb_buffer_add_utf32(), hb_buffer_add_codepoints() and
    *     hb_buffer_add_latin1() expect that buffer is either empty and have a
    *     content type of invalid, or that buffer content type is
    *     %HB_BUFFER_CONTENT_TYPE_UNICODE, and they also set the content type to
    *     Unicode if they added anything to an empty buffer.
    *   - Finally hb_shape() and hb_shape_full() expect that the buffer is
    *     either empty and have content type of invalid, or that buffer content
    *     type is %HB_BUFFER_CONTENT_TYPE_UNICODE, and upon success they set the
    *     buffer content type to %HB_BUFFER_CONTENT_TYPE_GLYPHS.
    *
    * The above transitions are designed such that one can use a buffer in a
    * loop of "reset : add-text : shape" without needing to ever modify the
    * content type manually.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_content_type:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetContentType() = ???

  /** Set the text flow direction of the buffer. No shaping can happen without
    * setting @buffer direction, and it controls the visual direction for the
    * output glyphs; for RTL direction the glyphs will be reversed. Many layout
    * features depend on the proper setting of the direction, for example,
    * reversing RTL text before shaping, then shaping with LTR direction is not
    * the same as keeping the text in logical order and shaping with RTL
    * direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_direction:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetDirection() = ???

  /** Sets @buffer flags to @flags. See #hb_buffer_flags_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_flags:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetFlags() = ???

  /** Sets the #hb_codepoint_t that replaces invisible characters in the shaping
    * result. If set to zero (default), the glyph for the U+0020 SPACE character
    * is used. Otherwise, this value is used verbatim.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_invisible_glyph:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetInvisibleGlyph() = ???

  /** Sets the language of @buffer to @language.
    *
    * Languages are crucial for selecting which OpenType feature to apply to the
    * buffer which can result in applying language-specific behaviour. Languages
    * are orthogonal to the scripts, and though they are related, they are
    * different concepts and should not be confused with each other.
    *
    * Use hb_language_from_string() to convert from BCP 47 language tags to
    * #hb_language_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_language:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetLanguage() = ???

  /** Similar to hb_buffer_pre_allocate(), but clears any new items added at the
    * end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_length:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetLength() = ???

  /** Sets the implementation function for #hb_buffer_message_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_message_func:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetMessageFunc() = ???

  /** Sets the #hb_codepoint_t that replaces characters not found in the font
    * during shaping.
    *
    * The not-found glyph defaults to zero, sometimes knows as the ".notdef"
    * glyph. This API allows for differentiating the two.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_not_found_glyph:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetNotFoundGlyph() = ???

  /** Sets the #hb_codepoint_t that replaces invalid entries for a given
    * encoding when adding text to @buffer.
    *
    * Default is #HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_replacement_codepoint:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetReplacementCodepoint() = ???

  /** Sets the script of @buffer to @script.
    *
    * Script is crucial for choosing the proper shaping behaviour for scripts
    * that require it (e.g. Arabic) and the which OpenType features defined in
    * the font to be applied.
    *
    * You can pass one of the predefined #hb_script_t values, or use
    * hb_script_from_string() or hb_script_from_iso15924_tag() to get the
    * corresponding script from an ISO 15924 script tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_script:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetScript() = ???

  /** Sets the segment properties of the buffer, a shortcut for calling
    * hb_buffer_set_direction(), hb_buffer_set_script() and
    * hb_buffer_set_language() individually.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_segment_properties:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetSegmentProperties() = ???

  /** Sets the Unicode-functions structure of a buffer to
    * @unicode_funcs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_unicode_funcs:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetUnicodeFuncs() = ???

  /** Attaches a user-data key/data pair to the specified buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[buffer_set_user_data:/<function parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  private def bufferSetUserData() = ???

  /** Fetches the alpha channel of the given @color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[color_get_alpha:/<function parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  private def colorGetAlpha() = ???

  /** Fetches the blue channel of the given @color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[color_get_blue:/<function parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  private def colorGetBlue() = ???

  /** Fetches the green channel of the given @color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[color_get_green:/<function parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  private def colorGetGreen() = ???

  /** Fetches the red channel of the given @color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[color_get_red:/<function parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  private def colorGetRed() = ???

  /** Fetches a list of color stops from the given color line object.
    *
    * Note that due to variations being applied, the returned color stops may be
    * out of order. It is the callers responsibility to ensure that color stops
    * are sorted by their offset before they are used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[color_line_get_color_stops:]: Function color_line_get_color_stops contains an OUT parameter, which is not supported yet"
  )
  private def colorLineGetColorStops() = ???

  /** Fetches the extend mode of the color line object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[color_line_get_extend:/<function parameters>/color_line]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(color_line_t), @type -> DataRecord(hb_color_line_t*)))"
  )
  private def colorLineGetExtend() = ???

  /** Converts a string to an #hb_direction_t.
    *
    * Matching is loose and applies only to the first letter. For examples,
    * "LTR" and "left-to-right" will both return #HB_DIRECTION_LTR.
    *
    * Unmatched strings will return #HB_DIRECTION_INVALID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[direction_from_string:/<function parameters>/str]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  private def directionFromString() = ???

  /** Converts an #hb_direction_t to a string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def directionToString(
      direction: Direction_t /* Some(hb_direction_t) */
  ): String /* Some(CString) */ = fromCString(
    hb_direction_to_string(direction.raw).asInstanceOf
  )

  /** Perform a "close-path" draw operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_close_path:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawClosePath() = ???

  /** Perform a "cubic-to" draw operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_cubic_to:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawCubicTo() = ???

  /** Creates a new draw callbacks object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_create:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsCreate() = ???

  /** Deallocate the @dfuncs. Decreases the reference count on @dfuncs by one.
    * If the result is zero, then
    * @dfuncs
    *   and all associated resources are freed. See hb_draw_funcs_reference().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_destroy:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsDestroy() = ???

  /** Fetches the singleton empty draw-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsGetEmpty() = ???

  /** Fetches the user-data associated with the specified key, attached to the
    * specified draw-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_get_user_data:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(const hb_draw_funcs_t*)))"
  )
  private def drawFuncsGetUserData() = ???

  /** Checks whether @dfuncs is immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_is_immutable:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsIsImmutable() = ???

  /** Makes @dfuncs object immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_make_immutable:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsMakeImmutable() = ???

  /** Increases the reference count on @dfuncs by one.
    *
    * This prevents @dfuncs from being destroyed until a matching call to
    * hb_draw_funcs_destroy() is made.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_reference:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsReference() = ???

  /** Sets close-path callback to the draw functions object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_set_close_path_func:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsSetClosePathFunc() = ???

  /** Sets cubic-to callback to the draw functions object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_set_cubic_to_func:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsSetCubicToFunc() = ???

  /** Sets line-to callback to the draw functions object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_set_line_to_func:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsSetLineToFunc() = ???

  /** Sets move-to callback to the draw functions object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_set_move_to_func:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsSetMoveToFunc() = ???

  /** Sets quadratic-to callback to the draw functions object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_set_quadratic_to_func:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsSetQuadraticToFunc() = ???

  /** Attaches a user-data key/data pair to the specified draw-functions
    * structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_funcs_set_user_data:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawFuncsSetUserData() = ???

  /** Perform a "line-to" draw operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_line_to:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawLineTo() = ???

  /** Perform a "move-to" draw operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_move_to:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawMoveTo() = ???

  /** Perform a "quadratic-to" draw operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[draw_quadratic_to:/<function parameters>/dfuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  private def drawQuadraticTo() = ???

  /** Add table for @tag with data provided by @blob to the face. @face must be
    * created using hb_face_builder_create().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_builder_add_table:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceBuilderAddTable() = ???

  /** Creates a #hb_face_t that can be used with hb_face_builder_add_table().
    * After tables are added to the face, it can be compiled to a binary font
    * file by calling hb_face_reference_blob().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_builder_create:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceBuilderCreate() = ???

  /** Set the ordering of tables for serialization. Any tables not specified in
    * the tags list will be ordered after the tables in tags, ordered by the
    * default sort ordering.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_builder_sort_tables:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceBuilderSortTables() = ???

  /** Collects the mapping from Unicode characters to nominal glyphs of the @face,
    * and optionally all of the Unicode characters covered by @face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_collect_nominal_glyph_mapping:]: Function face_collect_nominal_glyph_mapping contains an OUT parameter, which is not supported yet"
  )
  private def faceCollectNominalGlyphMapping() = ???

  /** Collects all of the Unicode characters covered by @face and adds them to
    * the #hb_set_t set @out.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_collect_unicodes:]: Function face_collect_unicodes contains an OUT parameter, which is not supported yet"
  )
  private def faceCollectUnicodes() = ???

  /** Collects all Unicode "Variation Selector" characters covered by @face and
    * adds them to the #hb_set_t set @out.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_collect_variation_selectors:]: Function face_collect_variation_selectors contains an OUT parameter, which is not supported yet"
  )
  private def faceCollectVariationSelectors() = ???

  /** Collects all Unicode characters for @variation_selector covered by @face
    * and adds them to the #hb_set_t set @out.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_collect_variation_unicodes:]: Function face_collect_variation_unicodes contains an OUT parameter, which is not supported yet"
  )
  private def faceCollectVariationUnicodes() = ???

  /** Fetches the number of faces in a blob.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_count:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def faceCount() = ???

  /** Constructs a new face object from the specified blob and a face index into
    * that blob.
    *
    * The face index is used for blobs of file formats such as TTC and DFont
    * that can contain more than one face. Face indices within such collections
    * are zero-based.
    *
    * <note>Note: If the blob font format is not a collection, @index is
    * ignored. Otherwise, only the lower 16-bits of @index are used. The
    * unmodified @index can be accessed via hb_face_get_index().</note>
    *
    * <note>Note: The high 16-bits of @index, if non-zero, are used by
    * hb_font_create() to load named-instances in variable fonts. See
    * hb_font_create() for details.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_create:/<function parameters>/blob]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  private def faceCreate() = ???

  /** Variant of hb_face_create(), built for those cases where it is more
    * convenient to provide data for individual tables instead of the whole font
    * data. With the caveat that hb_face_get_table_tags() does not currently
    * work with faces created this way.
    *
    * Creates a new face object from the specified @user_data and @reference_table_func,
    * with the @destroy callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_create_for_tables:/<function parameters>/reference_table_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(reference_table_func_t), @type -> DataRecord(hb_reference_table_func_t)))"
  )
  private def faceCreateForTables() = ???

  /** Decreases the reference count on a face object. When the reference count
    * reaches zero, the face is destroyed, freeing all memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_destroy:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceDestroy() = ???

  /** Fetches the singleton empty face object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceGetEmpty() = ???

  /** Fetches the glyph-count value of the specified face object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_get_glyph_count:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  private def faceGetGlyphCount() = ???

  /** Fetches the face-index corresponding to the given face.
    *
    * <note>Note: face indices within a collection are zero-based.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_get_index:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  private def faceGetIndex() = ???

  /** Fetches a list of all table tags for a face, if possible. The list
    * returned will begin at the offset provided
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_get_table_tags:]: Function face_get_table_tags contains an OUT parameter, which is not supported yet"
  )
  private def faceGetTableTags() = ???

  /** Fetches the units-per-em (UPEM) value of the specified face object.
    *
    * Typical UPEM values for fonts are 1000, or 2048, but any value in between
    * 16 and 16,384 is allowed for OpenType fonts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_get_upem:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  private def faceGetUpem() = ???

  /** Fetches the user data associated with the specified key, attached to the
    * specified face object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_get_user_data:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  private def faceGetUserData() = ???

  /** Tests whether the given face object is immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_is_immutable:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  private def faceIsImmutable() = ???

  /** Makes the given face object immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_make_immutable:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceMakeImmutable() = ???

  /** Increases the reference count on a face object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_reference:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceReference() = ???

  /** Fetches a pointer to the binary blob that contains the specified face.
    * Returns an empty blob if referencing face data is not possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_reference_blob:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceReferenceBlob() = ???

  /** Fetches a reference to the specified table within the specified face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_reference_table:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  private def faceReferenceTable() = ???

  /** Sets the glyph count for a face object to the specified value.
    *
    * This API is used in rare circumstances.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_set_glyph_count:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceSetGlyphCount() = ???

  /** Assigns the specified face-index to @face. Fails if the face is immutable.
    *
    * <note>Note: changing the index has no effect on the face itself This only
    * changes the value returned by hb_face_get_index().</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_set_index:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceSetIndex() = ???

  /** Sets the units-per-em (upem) for a face object to the specified value.
    *
    * This API is used in rare circumstances.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_set_upem:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceSetUpem() = ???

  /** Attaches a user-data key/data pair to the given face object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[face_set_user_data:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def faceSetUserData() = ???

  /** Parses a string into a #hb_feature_t.
    *
    * The format for specifying feature strings follows. All valid CSS
    * font-feature-settings values other than 'normal' and the global values are
    * also accepted, though not documented below. CSS string escapes are not
    * supported.
    *
    * The range indices refer to the positions between Unicode characters. The
    * position before the first character is always 0.
    *
    * The format is Python-esque. Here is how it all works:
    *
    * <informaltable pgwide='1' align='left' frame='none'> <tgroup cols='5'>
    * <thead> <row><entry>Syntax</entry> <entry>Value</entry>
    * <entry>Start</entry> <entry>End</entry></row> </thead> <tbody>
    * <row><entry>Setting value:</entry></row> <row><entry>kern</entry>
    * <entry>1</entry> <entry>0</entry> <entry>∞</entry> <entry>Turn feature
    * on</entry></row> <row><entry>+kern</entry> <entry>1</entry>
    * <entry>0</entry> <entry>∞</entry> <entry>Turn feature on</entry></row>
    * <row><entry>-kern</entry> <entry>0</entry> <entry>0</entry>
    * <entry>∞</entry> <entry>Turn feature off</entry></row>
    * <row><entry>kern=0</entry> <entry>0</entry> <entry>0</entry>
    * <entry>∞</entry> <entry>Turn feature off</entry></row>
    * <row><entry>kern=1</entry> <entry>1</entry> <entry>0</entry>
    * <entry>∞</entry> <entry>Turn feature on</entry></row>
    * <row><entry>aalt=2</entry> <entry>2</entry> <entry>0</entry>
    * <entry>∞</entry> <entry>Choose 2nd alternate</entry></row>
    * <row><entry>Setting index:</entry></row> <row><entry>kern[]</entry>
    * <entry>1</entry> <entry>0</entry> <entry>∞</entry> <entry>Turn feature
    * on</entry></row> <row><entry>kern[:]</entry> <entry>1</entry>
    * <entry>0</entry> <entry>∞</entry> <entry>Turn feature on</entry></row>
    * <row><entry>kern[5:]</entry> <entry>1</entry> <entry>5</entry>
    * <entry>∞</entry> <entry>Turn feature on, partial</entry></row>
    * <row><entry>kern[:5]</entry> <entry>1</entry> <entry>0</entry>
    * <entry>5</entry> <entry>Turn feature on, partial</entry></row>
    * <row><entry>kern[3:5]</entry> <entry>1</entry> <entry>3</entry>
    * <entry>5</entry> <entry>Turn feature on, range</entry></row>
    * <row><entry>kern[3]</entry> <entry>1</entry> <entry>3</entry>
    * <entry>3+1</entry> <entry>Turn feature on, single char</entry></row>
    * <row><entry>Mixing it all:</entry></row> <row><entry>aalt[3:5]=2</entry>
    * <entry>2</entry> <entry>3</entry> <entry>5</entry> <entry>Turn 2nd
    * alternate on for range</entry></row> </tbody> </tgroup> </informaltable>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[feature_from_string:]: Function feature_from_string contains an OUT parameter, which is not supported yet"
  )
  private def featureFromString() = ???

  /** Converts a #hb_feature_t into a `NULL`-terminated string in the format
    * understood by hb_feature_from_string(). The client in responsible for
    * allocating big enough size for @buf, 128 bytes is more than enough.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[feature_to_string:]: Function feature_to_string contains an OUT parameter, which is not supported yet"
  )
  private def featureToString() = ???

  /** Adds the origin coordinates to an (X,Y) point coordinate, in the specified
    * glyph ID in the specified font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_add_glyph_origin_for_direction:]: Function font_add_glyph_origin_for_direction contains an INOUT parameter, which is not supported yet"
  )
  private def fontAddGlyphOriginForDirection() = ???

  /** Notifies the @font that underlying font data has changed. This has the
    * effect of increasing the serial as returned by hb_font_get_serial(), which
    * invalidates internal caches.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_changed:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontChanged() = ???

  /** Constructs a new font object from the specified face.
    *
    * <note>Note: If @face's index value (as passed to hb_face_create() has
    * non-zero top 16-bits, those bits minus one are passed to
    * hb_font_set_var_named_instance(), effectively loading a named-instance of
    * a variable font, instead of the default-instance. This allows specifying
    * which named-instance to load by default when creating the face.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_create:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def fontCreate() = ???

  /** Constructs a sub-font font object from the specified @parent font,
    * replicating the parent's properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_create_sub_font:/<function parameters>/parent]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontCreateSubFont() = ???

  /** Decreases the reference count on the given font object. When the reference
    * count reaches zero, the font is destroyed, freeing all memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_destroy:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontDestroy() = ???

  /** Draws the outline that corresponds to a glyph in the specified @font.
    *
    * The outline is returned by way of calls to the callbacks of the @dfuncs
    * objects, with @draw_data passed to them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_draw_glyph:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontDrawGlyph() = ???

  /** Creates a new #hb_font_funcs_t structure of font functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_create:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsCreate() = ???

  /** Decreases the reference count on a font-functions structure. When the
    * reference count reaches zero, the font-functions structure is destroyed,
    * freeing all memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_destroy:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsDestroy() = ???

  /** Fetches an empty font-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsGetEmpty() = ???

  /** Fetches the user data associated with the specified key, attached to the
    * specified font-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_get_user_data:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(const hb_font_funcs_t*)))"
  )
  private def fontFuncsGetUserData() = ???

  /** Tests whether a font-functions structure is immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_is_immutable:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsIsImmutable() = ???

  /** Makes a font-functions structure immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_make_immutable:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsMakeImmutable() = ???

  /** Increases the reference count on a font-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_reference:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsReference() = ???

  /** Sets the implementation function for #hb_font_draw_glyph_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_draw_glyph_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetDrawGlyphFunc() = ???

  /** Sets the implementation function for #hb_font_get_font_h_extents_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_font_h_extents_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetFontHExtentsFunc() = ???

  /** Sets the implementation function for #hb_font_get_font_v_extents_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_font_v_extents_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetFontVExtentsFunc() = ???

  /** Sets the implementation function for
    * #hb_font_get_glyph_contour_point_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_contour_point_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphContourPointFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_extents_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_extents_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphExtentsFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_from_name_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_from_name_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphFromNameFunc() = ???

  /** Deprecated. Use hb_font_funcs_set_nominal_glyph_func() and
    * hb_font_funcs_set_variation_glyph_func() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_h_advance_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_h_advance_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphHAdvanceFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_h_advances_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_h_advances_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphHAdvancesFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_h_kerning_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_h_kerning_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphHKerningFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_h_origin_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_h_origin_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphHOriginFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_name_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_name_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphNameFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_shape_func_t,
    * which is the same as #hb_font_draw_glyph_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_shape_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphShapeFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_v_advance_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_v_advance_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphVAdvanceFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_v_advances_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_v_advances_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphVAdvancesFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_v_kerning_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_v_kerning_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphVKerningFunc() = ???

  /** Sets the implementation function for #hb_font_get_glyph_v_origin_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_glyph_v_origin_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetGlyphVOriginFunc() = ???

  /** Sets the implementation function for #hb_font_get_nominal_glyph_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_nominal_glyph_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetNominalGlyphFunc() = ???

  /** Sets the implementation function for #hb_font_get_nominal_glyphs_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_nominal_glyphs_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetNominalGlyphsFunc() = ???

  /** Sets the implementation function for #hb_font_paint_glyph_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_paint_glyph_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetPaintGlyphFunc() = ???

  /** Attaches a user-data key/data pair to the specified font-functions
    * structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_user_data:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetUserData() = ???

  /** Sets the implementation function for #hb_font_get_variation_glyph_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_funcs_set_variation_glyph_func:/<function parameters>/ffuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  private def fontFuncsSetVariationGlyphFunc() = ???

  /** Fetches the empty font object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetEmpty() = ???

  /** Fetches the extents for a font in a text segment of the specified
    * direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_extents_for_direction:]: Function font_get_extents_for_direction contains an OUT parameter, which is not supported yet"
  )
  private def fontGetExtentsForDirection() = ???

  /** Fetches the face associated with the specified font object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_face:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetFace() = ???

  /** Fetches the glyph ID for a Unicode code point in the specified font, with
    * an optional variation selector.
    *
    * If @variation_selector is 0, calls hb_font_get_nominal_glyph(); otherwise
    * calls hb_font_get_variation_glyph().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph:]: Function font_get_glyph contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyph() = ???

  /** Fetches the advance for a glyph ID from the specified font, in a text
    * segment of the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_advance_for_direction:]: Function font_get_glyph_advance_for_direction contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphAdvanceForDirection() = ???

  /** Fetches the advances for a sequence of glyph IDs in the specified font, in
    * a text segment of the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_advances_for_direction:]: Function font_get_glyph_advances_for_direction contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphAdvancesForDirection() = ???

  /** Fetches the (x,y) coordinates of a specified contour-point index in the
    * specified glyph, within the specified font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_contour_point:]: Function font_get_glyph_contour_point contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphContourPoint() = ???

  /** Fetches the (X,Y) coordinates of a specified contour-point index in the
    * specified glyph ID in the specified font, with respect to the origin in a
    * text segment in the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_contour_point_for_origin:]: Function font_get_glyph_contour_point_for_origin contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphContourPointForOrigin() = ???

  /** Fetches the #hb_glyph_extents_t data for a glyph ID in the specified font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_extents:]: Function font_get_glyph_extents contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphExtents() = ???

  /** Fetches the #hb_glyph_extents_t data for a glyph ID in the specified font,
    * with respect to the origin in a text segment in the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_extents_for_origin:]: Function font_get_glyph_extents_for_origin contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphExtentsForOrigin() = ???

  /** Fetches the glyph ID that corresponds to a name string in the specified @font.
    *
    * <note>Note: @len == -1 means the name string is null-terminated.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_from_name:]: Function font_get_glyph_from_name contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphFromName() = ???

  /** Fetches the advance for a glyph ID in the specified font, for horizontal
    * text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_h_advance:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetGlyphHAdvance() = ???

  /** Fetches the advances for a sequence of glyph IDs in the specified font,
    * for horizontal text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_h_advances:]: Function font_get_glyph_h_advances contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphHAdvances() = ???

  /** Fetches the kerning-adjustment value for a glyph-pair in the specified
    * font, for horizontal text segments.
    *
    * <note>It handles legacy kerning only (as returned by the corresponding
    * #hb_font_funcs_t function).</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_h_kerning:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetGlyphHKerning() = ???

  /** Fetches the (X,Y) coordinates of the origin for a glyph ID in the
    * specified font, for horizontal text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_h_origin:]: Function font_get_glyph_h_origin contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphHOrigin() = ???

  /** Fetches the kerning-adjustment value for a glyph-pair in the specified
    * font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_kerning_for_direction:]: Function font_get_glyph_kerning_for_direction contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphKerningForDirection() = ???

  /** Fetches the glyph-name string for a glyph ID in the specified @font.
    *
    * According to the OpenType specification, glyph names are limited to 63
    * characters and can only contain (a subset of) ASCII.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_name:]: Function font_get_glyph_name contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphName() = ???

  /** Fetches the (X,Y) coordinates of the origin for a glyph in the specified
    * font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_origin_for_direction:]: Function font_get_glyph_origin_for_direction contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphOriginForDirection() = ???

  /** Fetches the glyph shape that corresponds to a glyph in the specified @font.
    * The shape is returned by way of calls to the callbacks of the @dfuncs
    * objects, with @draw_data passed to them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_shape:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetGlyphShape() = ???

  /** Fetches the advance for a glyph ID in the specified font, for vertical
    * text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_v_advance:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetGlyphVAdvance() = ???

  /** Fetches the advances for a sequence of glyph IDs in the specified font,
    * for vertical text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_v_advances:]: Function font_get_glyph_v_advances contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphVAdvances() = ???

  /** Fetches the kerning-adjustment value for a glyph-pair in the specified
    * font, for vertical text segments.
    *
    * <note>It handles legacy kerning only (as returned by the corresponding
    * #hb_font_funcs_t function).</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_v_kerning:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetGlyphVKerning() = ???

  /** Fetches the (X,Y) coordinates of the origin for a glyph ID in the
    * specified font, for vertical text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_glyph_v_origin:]: Function font_get_glyph_v_origin contains an OUT parameter, which is not supported yet"
  )
  private def fontGetGlyphVOrigin() = ???

  /** Fetches the extents for a specified font, for horizontal text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_h_extents:]: Function font_get_h_extents contains an OUT parameter, which is not supported yet"
  )
  private def fontGetHExtents() = ???

  /** Fetches the nominal glyph ID for a Unicode code point in the specified
    * font.
    *
    * This version of the function should not be used to fetch glyph IDs for
    * code points modified by variation selectors. For variation-selector
    * support, user hb_font_get_variation_glyph() or use hb_font_get_glyph().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_nominal_glyph:]: Function font_get_nominal_glyph contains an OUT parameter, which is not supported yet"
  )
  private def fontGetNominalGlyph() = ???

  /** Fetches the nominal glyph IDs for a sequence of Unicode code points. Glyph
    * IDs must be returned in a #hb_codepoint_t output parameter. Stopes at the
    * first unsupported glyph ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_nominal_glyphs:]: Function font_get_nominal_glyphs contains an OUT parameter, which is not supported yet"
  )
  private def fontGetNominalGlyphs() = ???

  /** Fetches the parent font of @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_parent:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetParent() = ???

  /** Fetches the horizontal and vertical points-per-em (ppem) of a font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_ppem:]: Function font_get_ppem contains an OUT parameter, which is not supported yet"
  )
  private def fontGetPpem() = ???

  /** Fetches the "point size" of a font. Used in CoreText to implement optical
    * sizing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_ptem:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetPtem() = ???

  /** Fetches the horizontal and vertical scale of a font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_scale:]: Function font_get_scale contains an OUT parameter, which is not supported yet"
  )
  private def fontGetScale() = ???

  /** Returns the internal serial number of the font. The serial number is
    * increased every time a setting on the font is changed, using a setter
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_serial:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetSerial() = ???

  /** Fetches the "synthetic boldness" parameters of a font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_synthetic_bold:]: Function font_get_synthetic_bold contains an OUT parameter, which is not supported yet"
  )
  private def fontGetSyntheticBold() = ???

  /** Fetches the "synthetic slant" of a font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_synthetic_slant:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetSyntheticSlant() = ???

  /** Fetches the user-data object associated with the specified key, attached
    * to the specified font object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_user_data:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(const hb_font_t*)))"
  )
  private def fontGetUserData() = ???

  /** Fetches the extents for a specified font, for vertical text segments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_v_extents:]: Function font_get_v_extents contains an OUT parameter, which is not supported yet"
  )
  private def fontGetVExtents() = ???

  /** Fetches the list of variation coordinates (in design-space units)
    * currently set on a font.
    *
    * Note that this returned array may only contain values for some (or none)
    * of the axes; omitted axes effectively have their default values.
    *
    * Return value is valid as long as variation coordinates of the font are not
    * modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_var_coords_design:]: Function font_get_var_coords_design contains an OUT parameter, which is not supported yet"
  )
  private def fontGetVarCoordsDesign() = ???

  /** Fetches the list of normalized variation coordinates currently set on a
    * font.
    *
    * Note that this returned array may only contain values for some (or none)
    * of the axes; omitted axes effectively have zero values.
    *
    * Return value is valid as long as variation coordinates of the font are not
    * modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_var_coords_normalized:]: Function font_get_var_coords_normalized contains an OUT parameter, which is not supported yet"
  )
  private def fontGetVarCoordsNormalized() = ???

  /** Returns the currently-set named-instance index of the font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_var_named_instance:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontGetVarNamedInstance() = ???

  /** Fetches the glyph ID for a Unicode code point when followed by by the
    * specified variation-selector code point, in the specified font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_get_variation_glyph:]: Function font_get_variation_glyph contains an OUT parameter, which is not supported yet"
  )
  private def fontGetVariationGlyph() = ???

  /** Fetches the glyph ID from @font that matches the specified string. Strings
    * of the format `gidDDD` or `uniUUUU` are parsed automatically.
    *
    * <note>Note: @len == -1 means the string is null-terminated.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_glyph_from_string:]: Function font_glyph_from_string contains an OUT parameter, which is not supported yet"
  )
  private def fontGlyphFromString() = ???

  /** Fetches the name of the specified glyph ID in @font and returns it in
    * string @s.
    *
    * If the glyph ID has no name in @font, a string of the form `gidDDD` is
    * generated, with `DDD` being the glyph ID.
    *
    * According to the OpenType specification, glyph names are limited to 63
    * characters and can only contain (a subset of) ASCII.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_glyph_to_string:]: Function font_glyph_to_string contains an OUT parameter, which is not supported yet"
  )
  private def fontGlyphToString() = ???

  /** Tests whether a font object is immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_is_immutable:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontIsImmutable() = ???

  /** Makes @font immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_make_immutable:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontMakeImmutable() = ???

  /** Paints the glyph.
    *
    * The painting instructions are returned by way of calls to the callbacks of
    * the @funcs object, with @paint_data passed to them.
    *
    * If the font has color palettes (see hb_ot_color_has_palettes()), then @palette_index
    * selects the palette to use. If the font only has one palette, this will be 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_paint_glyph:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontPaintGlyph() = ???

  /** Increases the reference count on the given font object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_reference:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontReference() = ???

  /** Sets @face as the font-face value of @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_face:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetFace() = ???

  /** Replaces the font-functions structure attached to a font, updating the
    * font's user-data with @font-data and the @destroy callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_funcs:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetFuncs() = ???

  /** Replaces the user data attached to a font, updating the font's
    * @destroy
    *   callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_funcs_data:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetFuncsData() = ???

  /** Sets the parent font of @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_parent:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetParent() = ???

  /** Sets the horizontal and vertical pixels-per-em (PPEM) of a font.
    *
    * These values are used for pixel-size-specific adjustment to shaping and
    * draw results, though for the most part they are unused and can be left
    * unset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_ppem:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetPpem() = ???

  /** Sets the "point size" of a font. Set to zero to unset. Used in CoreText to
    * implement optical sizing.
    *
    * <note>Note: There are 72 points in an inch.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_ptem:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetPtem() = ???

  /** Sets the horizontal and vertical scale of a font.
    *
    * The font scale is a number related to, but not the same as, font size.
    * Typically the client establishes a scale factor to be used between the
    * two. For example, 64, or 256, which would be the fractional-precision part
    * of the font scale. This is necessary because #hb_position_t values are
    * integer types and you need to leave room for fractional values in there.
    *
    * For example, to set the font size to 20, with 64 levels of fractional
    * precision you would call `hb_font_set_scale(font, 20 * 64, 20 * 64)`.
    *
    * In the example above, even what font size 20 means is up to you. It might
    * be 20 pixels, or 20 points, or 20 millimeters. HarfBuzz does not care
    * about that. You can set the point size of the font using
    * hb_font_set_ptem(), and the pixel size using hb_font_set_ppem().
    *
    * The choice of scale is yours but needs to be consistent between what you
    * set here, and what you expect out of #hb_position_t as well has draw /
    * paint API output values.
    *
    * Fonts default to a scale equal to the UPEM value of their face. A font
    * with this setting is sometimes called an "unscaled" font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_scale:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetScale() = ???

  /** Sets the "synthetic boldness" of a font.
    *
    * Positive values for @x_embolden / @y_embolden make a font bolder, negative
    * values thinner. Typical values are in the 0.01 to 0.05 range. The default
    * value is zero.
    *
    * Synthetic boldness is applied by offsetting the contour points of the
    * glyph shape.
    *
    * Synthetic boldness is applied when rendering a glyph via
    * hb_font_draw_glyph().
    *
    * If @in_place is `false`, then glyph advance-widths are also adjusted,
    * otherwise they are not. The in-place mode is useful for simulating [font
    * grading](https://fonts.google.com/knowledge/glossary/grade).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_synthetic_bold:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetSyntheticBold() = ???

  /** Sets the "synthetic slant" of a font. By default is zero. Synthetic slant
    * is the graphical skew applied to the font at rendering time.
    *
    * HarfBuzz needs to know this value to adjust shaping results, metrics, and
    * style values to match the slanted rendering.
    *
    * <note>Note: The glyph shape fetched via the hb_font_draw_glyph() function
    * is slanted to reflect this value as well.</note>
    *
    * <note>Note: The slant value is a ratio. For example, a 20% slant would be
    * represented as a 0.2 value.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_synthetic_slant:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetSyntheticSlant() = ???

  /** Attaches a user-data key/data pair to the specified font object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_user_data:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetUserData() = ???

  /** Applies a list of variation coordinates (in design-space units) to a font.
    *
    * Note that this overrides all existing variations set on @font. Axes not
    * included in @coords will be effectively set to their default values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_var_coords_design:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetVarCoordsDesign() = ???

  /** Applies a list of variation coordinates (in normalized units) to a font.
    *
    * Note that this overrides all existing variations set on @font. Axes not
    * included in @coords will be effectively set to their default values.
    *
    * <note>Note: Coordinates should be normalized to 2.14.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_var_coords_normalized:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetVarCoordsNormalized() = ???

  /** Sets design coords of a font from a named-instance index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_var_named_instance:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetVarNamedInstance() = ???

  /** Change the value of one variation axis on the font.
    *
    * Note: This function is expensive to be called repeatedly. If you want to
    * set multiple variation axes at the same time, use hb_font_set_variations()
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_variation:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetVariation() = ???

  /** Applies a list of font-variation settings to a font.
    *
    * Note that this overrides all existing variations set on @font. Axes not
    * included in @variations will be effectively set to their default values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_set_variations:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def fontSetVariations() = ???

  /** Subtracts the origin coordinates from an (X,Y) point coordinate, in the
    * specified glyph ID in the specified font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[font_subtract_glyph_origin_for_direction:]: Function font_subtract_glyph_origin_for_direction contains an INOUT parameter, which is not supported yet"
  )
  private def fontSubtractGlyphOriginForDirection() = ???

  /** Refreshes the state of @font when the underlying FT_Face has changed. This
    * function should be called after changing the size or variation-axis
    * settings on the FT_Face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ft_font_changed:]: Method hb_ft_font_changed has no target types"
  )
  private def ftFontChanged() = ???

  /** Fetches the FT_Load_Glyph load flags of the specified #hb_font_t.
    *
    * For more information, see
    * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
    *
    * This function works with #hb_font_t objects created by hb_ft_font_create()
    * or hb_ft_font_create_referenced().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ft_font_get_load_flags:]: Method hb_ft_font_get_load_flags has no target types"
  )
  private def ftFontGetLoadFlags() = ???

  /** Configures the font-functions structure of the specified #hb_font_t font
    * object to use FreeType font functions.
    *
    * In particular, you can use this function to configure an existing
    * #hb_face_t face object for use with FreeType font functions even if that
    * #hb_face_t face object was initially created with hb_face_create(), and
    * therefore was not initially configured to use FreeType font functions.
    *
    * An #hb_font_t object created with hb_ft_font_create() is preconfigured for
    * FreeType font functions and does not require this function to be used.
    *
    * Note that if you modify the underlying #hb_font_t after calling this
    * function, you need to call hb_ft_hb_font_changed() to update the
    * underlying FT_Face.
    *
    * <note>Note: Internally, this function creates an FT_Face. </note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ft_font_set_funcs:]: Method hb_ft_font_set_funcs has no target types"
  )
  private def ftFontSetFuncs() = ???

  /** Sets the FT_Load_Glyph load flags for the specified #hb_font_t.
    *
    * For more information, see
    * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
    *
    * This function works with #hb_font_t objects created by hb_ft_font_create()
    * or hb_ft_font_create_referenced().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ft_font_set_load_flags:]: Method hb_ft_font_set_load_flags has no target types"
  )
  private def ftFontSetLoadFlags() = ???

  /** Releases an FT_Face previously obtained with hb_ft_font_lock_face().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ft_font_unlock_face:]: Method hb_ft_font_unlock_face has no target types"
  )
  private def ftFontUnlockFace() = ???

  /** Refreshes the state of the underlying FT_Face of @font when the hb_font_t
    * @font
    *   has changed. This function should be called after changing the size or
    *   variation-axis settings on the @font. This call is fast if nothing has
    *   changed on @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ft_hb_font_changed:]: Method hb_ft_hb_font_changed has no target types"
  )
  private def ftHbFontChanged() = ???

  /** Creates an #hb_blob_t blob from the specified GBytes data structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[glib_blob_create:]: Method hb_glib_blob_create has no target types"
  )
  private def glibBlobCreate() = ???

  /** Fetches a Unicode-functions structure that is populated with the
    * appropriate GLib function for each method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[glib_get_unicode_funcs:]: Method hb_glib_get_unicode_funcs has no target types"
  )
  private def glibGetUnicodeFuncs() = ???

  /** Fetches the GUnicodeScript identifier that corresponds to the specified
    * #hb_script_t script.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[glib_script_from_script:]: Method hb_glib_script_from_script has no target types"
  )
  private def glibScriptFromScript() = ???

  /** Fetches the #hb_script_t script that corresponds to the specified
    * GUnicodeScript identifier.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[glib_script_to_script:]: Method hb_glib_script_to_script has no target types"
  )
  private def glibScriptToScript() = ???

  /** Returns glyph flags encoded within a #hb_glyph_info_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[glyph_info_get_glyph_flags:/<function parameters>/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(glyph_info_t), @type -> DataRecord(const hb_glyph_info_t*)))"
  )
  private def glyphInfoGetGlyphFlags() = ???

  /** Converts @str representing a BCP 47 language tag to the corresponding
    * #hb_language_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[language_from_string:/<function parameters>/str]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  private def languageFromString() = ???

  /** Fetch the default language from current locale.
    *
    * <note>Note that the first time this function is called, it calls
    * "setlocale (LC_CTYPE, nullptr)" to fetch current locale. The underlying
    * setlocale function is, in many implementations, NOT threadsafe. To avoid
    * problems, call this function once before multiple threads can call it.
    * This function is only used from hb_buffer_guess_segment_properties() by
    * HarfBuzz itself.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[language_get_default:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t)))"
  )
  private def languageGetDefault() = ???

  /** Check whether a second language tag is the same or a more specific version
    * of the provided language tag. For example, "fa_IR.utf8" is a more specific
    * tag for "fa" or for "fa_IR".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[language_matches:/<function parameters>/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t)))"
  )
  private def languageMatches() = ???

  /** Converts an #hb_language_t to a string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[language_to_string:/<function parameters>/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t)))"
  )
  private def languageToString() = ???

  /** Tests whether memory allocation for a set was successful.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_allocation_successful:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapAllocationSuccessful() = ???

  /** Clears out the contents of @map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_clear:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapClear() = ???

  /** Allocate a copy of @map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_copy:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapCopy() = ???

  /** Creates a new, initially empty map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_create:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapCreate() = ???

  /** Removes @key and its stored value from @map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_del:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapDel() = ???

  /** Decreases the reference count on a map. When the reference count reaches
    * zero, the map is destroyed, freeing all memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_destroy:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapDestroy() = ???

  /** Fetches the value stored for @key in @map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_get:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapGet() = ???

  /** Fetches the singleton empty #hb_map_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapGetEmpty() = ???

  /** Returns the number of key-value pairs in the map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_get_population:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapGetPopulation() = ???

  /** Fetches the user data associated with the specified key, attached to the
    * specified map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_get_user_data:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapGetUserData() = ???

  /** Tests whether @key is an element of @map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_has:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapHas() = ???

  /** Creates a hash representing @map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_hash:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapHash() = ???

  /** Tests whether @map is empty (contains no elements).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_is_empty:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapIsEmpty() = ???

  /** Tests whether @map and @other are equal (contain the same elements).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_is_equal:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapIsEqual() = ???

  /** Add the keys of @map to @keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_keys:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapKeys() = ???

  /** Fetches the next key/value paire in @map.
    *
    * Set @idx to -1 to get started.
    *
    * If the map is modified during iteration, the behavior is undefined.
    *
    * The order in which the key/values are returned is undefined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_next:]: Function map_next contains an OUT parameter, which is not supported yet"
  )
  private def mapNext() = ???

  /** Increases the reference count on a map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_reference:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapReference() = ???

  /** Stores @key:@value in the map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_set:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapSet() = ???

  /** Attaches a user-data key/data pair to the specified map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_set_user_data:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapSetUserData() = ???

  /** Add the contents of @other to @map.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_update:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  private def mapUpdate() = ???

  /** Add the values of @map to @values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[map_values:/<function parameters>/map]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  private def mapValues() = ???

  /** Fetches a list of all color layers for the specified glyph index in the
    * specified face. The list returned will begin at the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_glyph_get_layers:]: Function ot_color_glyph_get_layers contains an OUT parameter, which is not supported yet"
  )
  private def otColorGlyphGetLayers() = ???

  /** Tests where a face includes COLRv1 paint data for @glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_glyph_has_paint:]: Method hb_ot_color_glyph_has_paint has no target types"
  )
  private def otColorGlyphHasPaint() = ???

  /** Fetches the PNG image for a glyph. This function takes a font object, not
    * a face object, as input. To get an optimally sized PNG blob, the PPEM
    * values must be set on the @font object. If PPEM is unset, the blob
    * returned will be the largest PNG available.
    *
    * If the glyph has no PNG image, the singleton empty blob is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_glyph_reference_png:]: Method hb_ot_color_glyph_reference_png has no target types"
  )
  private def otColorGlyphReferencePng() = ???

  /** Fetches the SVG document for a glyph. The blob may be either plain text or
    * gzip-encoded.
    *
    * If the glyph has no SVG document, the singleton empty blob is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_glyph_reference_svg:]: Method hb_ot_color_glyph_reference_svg has no target types"
  )
  private def otColorGlyphReferenceSvg() = ???

  /** Tests whether a face includes a `COLR` table with data according to
    * COLRv0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_has_layers:]: Method hb_ot_color_has_layers has no target types"
  )
  private def otColorHasLayers() = ???

  /** Tests where a face includes a `COLR` table with data according to COLRv1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_has_paint:]: Method hb_ot_color_has_paint has no target types"
  )
  private def otColorHasPaint() = ???

  /** Tests whether a face includes a `CPAL` color-palette table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_has_palettes:]: Method hb_ot_color_has_palettes has no target types"
  )
  private def otColorHasPalettes() = ???

  /** Tests whether a face has PNG glyph images (either in `CBDT` or `sbix`
    * tables).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_has_png:]: Method hb_ot_color_has_png has no target types"
  )
  private def otColorHasPng() = ???

  /** Tests whether a face includes any `SVG` glyph images.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_has_svg:]: Method hb_ot_color_has_svg has no target types"
  )
  private def otColorHasSvg() = ???

  /** Fetches the `name` table Name ID that provides display names for the
    * specified color in a face's `CPAL` color palette.
    *
    * Display names can be generic (e.g., "Background") or specific (e.g., "Eye
    * color").
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_palette_color_get_name_id:]: Method hb_ot_color_palette_color_get_name_id has no target types"
  )
  private def otColorPaletteColorGetNameId() = ???

  /** Fetches a list of the colors in a color palette.
    *
    * After calling this function, @colors will be filled with the palette
    * colors. If @colors is NULL, the function will just return the number of
    * total colors without storing any actual colors; this can be used for
    * allocating a buffer of suitable size before calling
    * hb_ot_color_palette_get_colors() a second time.
    *
    * The RGBA values in the palette are unpremultiplied. See the OpenType spec
    * [CPAL](https://learn.microsoft.com/en-us/typography/opentype/spec/cpal)
    * section for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_palette_get_colors:]: Function ot_color_palette_get_colors contains an OUT parameter, which is not supported yet"
  )
  private def otColorPaletteGetColors() = ???

  /** Fetches the number of color palettes in a face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_palette_get_count:]: Method hb_ot_color_palette_get_count has no target types"
  )
  private def otColorPaletteGetCount() = ???

  /** Fetches the flags defined for a color palette.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_palette_get_flags:]: Method hb_ot_color_palette_get_flags has no target types"
  )
  private def otColorPaletteGetFlags() = ???

  /** Fetches the `name` table Name ID that provides display names for a `CPAL`
    * color palette.
    *
    * Palette display names can be generic (e.g., "Default") or provide
    * specific, themed names (e.g., "Spring", "Summer", "Fall", and "Winter").
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_color_palette_get_name_id:]: Method hb_ot_color_palette_get_name_id has no target types"
  )
  private def otColorPaletteGetNameId() = ???

  /** Sets the font functions to use when working with @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_font_set_funcs:]: Method hb_ot_font_set_funcs has no target types"
  )
  private def otFontSetFuncs() = ???

  /** Fetches a list of all feature indexes in the specified face's GSUB table
    * or GPOS table, underneath the specified scripts, languages, and features.
    * If no list of scripts is provided, all scripts will be queried. If no list
    * of languages is provided, all languages will be queried. If no list of
    * features is provided, all features will be queried.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_collect_features:]: Function ot_layout_collect_features contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutCollectFeatures() = ???

  /** Fetches the mapping from feature tags to feature indexes for the specified
    * script and language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_collect_features_map:]: Function ot_layout_collect_features_map contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutCollectFeaturesMap() = ???

  /** Fetches a list of all feature-lookup indexes in the specified face's GSUB
    * table or GPOS table, underneath the specified scripts, languages, and
    * features. If no list of scripts is provided, all scripts will be queried.
    * If no list of languages is provided, all languages will be queried. If no
    * list of features is provided, all features will be queried.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_collect_lookups:]: Function ot_layout_collect_lookups contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutCollectLookups() = ???

  /** Fetches a list of the characters defined as having a variant under the
    * specified "Character Variant" ("cvXX") feature tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_feature_get_characters:]: Function ot_layout_feature_get_characters contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutFeatureGetCharacters() = ???

  /** Fetches a list of all lookups enumerated for the specified feature, in the
    * specified face's GSUB table or GPOS table. The list returned will begin at
    * the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_feature_get_lookups:]: Function ot_layout_feature_get_lookups contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutFeatureGetLookups() = ???

  /** Fetches name indices from feature parameters for "Stylistic Set" ('ssXX')
    * or "Character Variant" ('cvXX') features.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_feature_get_name_ids:]: Function ot_layout_feature_get_name_ids contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutFeatureGetNameIds() = ???

  /** Fetches a list of all lookups enumerated for the specified feature, in the
    * specified face's GSUB table or GPOS table, enabled at the specified
    * variations index. The list returned will begin at the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_feature_with_variations_get_lookups:]: Function ot_layout_feature_with_variations_get_lookups contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutFeatureWithVariationsGetLookups() = ???

  /** Fetches a list of all attachment points for the specified glyph in the
    * GDEF table of the face. The list returned will begin at the offset
    * provided.
    *
    * Useful if the client program wishes to cache the list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_attach_points:]: Function ot_layout_get_attach_points contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetAttachPoints() = ???

  /** Fetches a baseline value from the face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_baseline:]: Function ot_layout_get_baseline contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetBaseline() = ???

  /** Fetches a baseline value from the face.
    *
    * This function is like hb_ot_layout_get_baseline() but takes #hb_script_t
    * and #hb_language_t instead of OpenType #hb_tag_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_baseline2:]: Function ot_layout_get_baseline2 contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetBaseline2() = ???

  /** Fetches a baseline value from the face, and synthesizes it if the font
    * does not have it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_baseline_with_fallback:]: Function ot_layout_get_baseline_with_fallback contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetBaselineWithFallback() = ???

  /** Fetches a baseline value from the face, and synthesizes it if the font
    * does not have it.
    *
    * This function is like hb_ot_layout_get_baseline_with_fallback() but takes
    * #hb_script_t and #hb_language_t instead of OpenType #hb_tag_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_baseline_with_fallback2:]: Function ot_layout_get_baseline_with_fallback2 contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetBaselineWithFallback2() = ???

  /** Fetches script/language-specific font extents. These values are looked up
    * in the `BASE` table's `MinMax` records.
    *
    * If no such extents are found, the default extents for the font are
    * fetched. As such, the return value of this function can for the most part
    * be ignored. Note that the per-script/language extents do not have a
    * line-gap value, and the line-gap is set to zero in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_font_extents:]: Function ot_layout_get_font_extents contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetFontExtents() = ???

  /** Fetches script/language-specific font extents. These values are looked up
    * in the `BASE` table's `MinMax` records.
    *
    * If no such extents are found, the default extents for the font are
    * fetched. As such, the return value of this function can for the most part
    * be ignored. Note that the per-script/language extents do not have a
    * line-gap value, and the line-gap is set to zero in that case.
    *
    * This function is like hb_ot_layout_get_font_extents() but takes
    * #hb_script_t and #hb_language_t instead of OpenType #hb_tag_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_font_extents2:]: Function ot_layout_get_font_extents2 contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetFontExtents2() = ???

  /** Fetches the GDEF class of the requested glyph in the specified face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_glyph_class:]: Method hb_ot_layout_get_glyph_class has no target types"
  )
  private def otLayoutGetGlyphClass() = ???

  /** Retrieves the set of all glyphs from the face that belong to the requested
    * glyph class in the face's GDEF table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_glyphs_in_class:]: Function ot_layout_get_glyphs_in_class contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetGlyphsInClass() = ???

  /** Fetches the dominant horizontal baseline tag used by @script.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_horizontal_baseline_tag_for_script:]: Method hb_ot_layout_get_horizontal_baseline_tag_for_script has no target types"
  )
  private def otLayoutGetHorizontalBaselineTagForScript() = ???

  /** Fetches a list of the caret positions defined for a ligature glyph in the
    * GDEF table of the font. The list returned will begin at the offset
    * provided.
    *
    * Note that a ligature that is formed from n characters will have n-1 caret
    * positions. The first character is not represented in the array, since its
    * caret position is the glyph position.
    *
    * The positions returned by this function are 'unshaped', and will have to
    * be fixed up for kerning that may be applied to the ligature glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_ligature_carets:]: Function ot_layout_get_ligature_carets contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetLigatureCarets() = ???

  /** Fetches optical-size feature data (i.e., the `size` feature from GPOS).
    * Note that the subfamily_id and the subfamily name string (accessible via
    * the subfamily_name_id) as used here are defined as pertaining only to
    * fonts within a font family that differ specifically in their respective
    * size ranges; other ways to differentiate fonts within a subfamily are not
    * covered by the `size` feature.
    *
    * For more information on this distinction, see the [`size` feature
    * documentation](
    * https://docs.microsoft.com/en-us/typography/opentype/spec/features_pt#tag-size).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_get_size_params:]: Function ot_layout_get_size_params contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutGetSizeParams() = ???

  /** Tests whether a face has any glyph classes defined in its GDEF table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_has_glyph_classes:]: Method hb_ot_layout_has_glyph_classes has no target types"
  )
  private def otLayoutHasGlyphClasses() = ???

  /** Tests whether the specified face includes any GPOS positioning.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_has_positioning:]: Method hb_ot_layout_has_positioning has no target types"
  )
  private def otLayoutHasPositioning() = ???

  /** Tests whether the specified face includes any GSUB substitutions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_has_substitution:]: Method hb_ot_layout_has_substitution has no target types"
  )
  private def otLayoutHasSubstitution() = ???

  /** Fetches the index of a given feature tag in the specified face's GSUB
    * table or GPOS table, underneath the specified script and language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_language_find_feature:]: Function ot_layout_language_find_feature contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLanguageFindFeature() = ???

  /** Fetches a list of all features in the specified face's GSUB table or GPOS
    * table, underneath the specified script and language. The list returned
    * will begin at the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_language_get_feature_indexes:]: Function ot_layout_language_get_feature_indexes contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLanguageGetFeatureIndexes() = ???

  /** Fetches a list of all features in the specified face's GSUB table or GPOS
    * table, underneath the specified script and language. The list returned
    * will begin at the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_language_get_feature_tags:]: Function ot_layout_language_get_feature_tags contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLanguageGetFeatureTags() = ???

  /** Fetches the tag of a requested feature index in the given face's GSUB or
    * GPOS table, underneath the specified script and language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_language_get_required_feature:]: Function ot_layout_language_get_required_feature contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLanguageGetRequiredFeature() = ???

  /** Fetches the index of a requested feature in the given face's GSUB or GPOS
    * table, underneath the specified script and language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_language_get_required_feature_index:]: Function ot_layout_language_get_required_feature_index contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLanguageGetRequiredFeatureIndex() = ???

  /** Fetches a list of all glyphs affected by the specified lookup in the
    * specified face's GSUB table or GPOS table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_lookup_collect_glyphs:]: Function ot_layout_lookup_collect_glyphs contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLookupCollectGlyphs() = ???

  /** Fetches alternates of a glyph from a given GSUB lookup index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_lookup_get_glyph_alternates:]: Function ot_layout_lookup_get_glyph_alternates contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLookupGetGlyphAlternates() = ???

  /** Fetches the optical bound of a glyph positioned at the margin of text. The
    * direction identifies which edge of the glyph to query.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_lookup_get_optical_bound:]: Method hb_ot_layout_lookup_get_optical_bound has no target types"
  )
  private def otLayoutLookupGetOpticalBound() = ???

  /** Compute the transitive closure of glyphs needed for a specified lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_lookup_substitute_closure:]: Function ot_layout_lookup_substitute_closure contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLookupSubstituteClosure() = ???

  /** Tests whether a specified lookup in the specified face would trigger a
    * substitution on the given glyph sequence.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_lookup_would_substitute:]: Method hb_ot_layout_lookup_would_substitute has no target types"
  )
  private def otLayoutLookupWouldSubstitute() = ???

  /** Compute the transitive closure of glyphs needed for all of the provided
    * lookups.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_lookups_substitute_closure:]: Function ot_layout_lookups_substitute_closure contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutLookupsSubstituteClosure() = ???

  /** Fetches the index of a given language tag in the specified face's GSUB
    * table or GPOS table, underneath the specified script tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_script_find_language:]: Method hb_ot_layout_script_find_language has no target types"
  )
  private def otLayoutScriptFindLanguage() = ???

  /** Fetches a list of language tags in the given face's GSUB or GPOS table,
    * underneath the specified script index. The list returned will begin at the
    * offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_script_get_language_tags:]: Function ot_layout_script_get_language_tags contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutScriptGetLanguageTags() = ???

  /** Fetches the index of the first language tag fom @language_tags that is
    * present in the specified face's GSUB or GPOS table, underneath the
    * specified script index.
    *
    * If none of the given language tags is found, `false` is returned and
    * @language_index
    *   is set to the default language index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_script_select_language:]: Function ot_layout_script_select_language contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutScriptSelectLanguage() = ???

  /** Fetches the index of the first language tag fom @language_tags that is
    * present in the specified face's GSUB or GPOS table, underneath the
    * specified script index.
    *
    * If none of the given language tags is found, `false` is returned and
    * @language_index
    *   is set to #HB_OT_LAYOUT_DEFAULT_LANGUAGE_INDEX and
    * @chosen_language
    *   is set to #HB_TAG_NONE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_script_select_language2:]: Function ot_layout_script_select_language2 contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutScriptSelectLanguage2() = ???

  /** Deprecated since 2.0.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_table_choose_script:]: Function ot_layout_table_choose_script contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutTableChooseScript() = ???

  /** Fetches a list of feature variations in the specified face's GSUB table or
    * GPOS table, at the specified variation coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_table_find_feature_variations:]: Function ot_layout_table_find_feature_variations contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutTableFindFeatureVariations() = ???

  /** Fetches the index if a given script tag in the specified face's GSUB table
    * or GPOS table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_table_find_script:]: Function ot_layout_table_find_script contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutTableFindScript() = ???

  /** Fetches a list of all feature tags in the given face's GSUB or GPOS table.
    * Note that there might be duplicate feature tags, belonging to different
    * script/language-system pairs of the table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_table_get_feature_tags:]: Function ot_layout_table_get_feature_tags contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutTableGetFeatureTags() = ???

  /** Fetches the total number of lookups enumerated in the specified face's
    * GSUB table or GPOS table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_table_get_lookup_count:]: Method hb_ot_layout_table_get_lookup_count has no target types"
  )
  private def otLayoutTableGetLookupCount() = ???

  /** Fetches a list of all scripts enumerated in the specified face's GSUB
    * table or GPOS table. The list returned will begin at the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_table_get_script_tags:]: Function ot_layout_table_get_script_tags contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutTableGetScriptTags() = ???

  /** Selects an OpenType script for @table_tag from the @script_tags array.
    *
    * If the table does not have any of the requested scripts, then `DFLT`,
    * `dflt`, and `latn` tags are tried in that order. If the table still does
    * not have any of these scripts, @script_index is set to
    * #HB_OT_LAYOUT_NO_SCRIPT_INDEX and @chosen_script is set to #HB_TAG_NONE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_layout_table_select_script:]: Function ot_layout_table_select_script contains an OUT parameter, which is not supported yet"
  )
  private def otLayoutTableSelectScript() = ???

  /** Fetches the specified math constant. For most constants, the value
    * returned is an #hb_position_t.
    *
    * However, if the requested constant is
    * #HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN,
    * #HB_OT_MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN or
    * #HB_OT_MATH_CONSTANT_RADICAL_DEGREE_BOTTOM_RAISE_PERCENT, then the return
    * value is an integer between 0 and 100 representing that percentage.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_constant:]: Method hb_ot_math_get_constant has no target types"
  )
  private def otMathGetConstant() = ???

  /** Fetches the GlyphAssembly for the specified font, glyph index, and
    * direction. Returned are a list of #hb_ot_math_glyph_part_t glyph parts
    * that can be used to draw the glyph and an italics-correction value (if one
    * is defined in the font).
    *
    * <note>The @direction parameter is only used to select between horizontal
    * or vertical directions for the construction. Even though all
    * #hb_direction_t values are accepted, only the result of
    * #HB_DIRECTION_IS_HORIZONTAL is considered.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_glyph_assembly:]: Function ot_math_get_glyph_assembly contains an OUT parameter, which is not supported yet"
  )
  private def otMathGetGlyphAssembly() = ???

  /** Fetches an italics-correction value (if one exists) for the specified
    * glyph index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_glyph_italics_correction:]: Method hb_ot_math_get_glyph_italics_correction has no target types"
  )
  private def otMathGetGlyphItalicsCorrection() = ???

  /** Fetches the math kerning (cut-ins) value for the specified font, glyph
    * index, and
    * @kern.
    *
    * If the MathKern table is found, the function examines it to find a height
    * value that is greater or equal to @correction_height. If such a height
    * value is found, corresponding kerning value from the table is returned. If
    * no such height value is found, the last kerning value is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_glyph_kerning:]: Method hb_ot_math_get_glyph_kerning has no target types"
  )
  private def otMathGetGlyphKerning() = ???

  /** Fetches the raw MathKern (cut-in) data for the specified font, glyph
    * index, and @kern. The corresponding list of kern values and correction
    * heights is returned as a list of #hb_ot_math_kern_entry_t structs.
    *
    * See also #hb_ot_math_get_glyph_kerning, which handles selecting the
    * appropriate kern value for a given correction height.
    *
    * <note>For a glyph with @n defined kern values (where @n > 0), there are
    * only
    * @n−1
    *   defined correction heights, as each correction height defines a boundary
    *   past which the next kern value should be selected. Therefore, only the
    *   #hb_ot_math_kern_entry_t.kern_value of the uppermost
    *   #hb_ot_math_kern_entry_t actually comes from the font; its corresponding
    *   #hb_ot_math_kern_entry_t.max_correction_height is always set to
    *   <code>INT32_MAX</code>.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_glyph_kernings:]: Function ot_math_get_glyph_kernings contains an OUT parameter, which is not supported yet"
  )
  private def otMathGetGlyphKernings() = ???

  /** Fetches a top-accent-attachment value (if one exists) for the specified
    * glyph index.
    *
    * For any glyph that does not have a top-accent-attachment value - that is,
    * a glyph not covered by the `MathTopAccentAttachment` table (or, when
    * @font
    *   has no `MathTopAccentAttachment` table or no `MATH` table, any glyph) -
    *   the function synthesizes a value, returning the position at one-half the
    *   glyph's advance width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_glyph_top_accent_attachment:]: Method hb_ot_math_get_glyph_top_accent_attachment has no target types"
  )
  private def otMathGetGlyphTopAccentAttachment() = ???

  /** Fetches the MathGlyphConstruction for the specified font, glyph index, and
    * direction. The corresponding list of size variants is returned as a list
    * of #hb_ot_math_glyph_variant_t structs.
    *
    * <note>The @direction parameter is only used to select between horizontal
    * or vertical directions for the construction. Even though all
    * #hb_direction_t values are accepted, only the result of
    * #HB_DIRECTION_IS_HORIZONTAL is considered.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_glyph_variants:]: Function ot_math_get_glyph_variants contains an OUT parameter, which is not supported yet"
  )
  private def otMathGetGlyphVariants() = ???

  /** Fetches the MathVariants table for the specified font and returns the
    * minimum overlap of connecting glyphs that are required to draw a glyph
    * assembly in the specified direction.
    *
    * <note>The @direction parameter is only used to select between horizontal
    * or vertical directions for the construction. Even though all
    * #hb_direction_t values are accepted, only the result of
    * #HB_DIRECTION_IS_HORIZONTAL is considered.</note>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_get_min_connector_overlap:]: Method hb_ot_math_get_min_connector_overlap has no target types"
  )
  private def otMathGetMinConnectorOverlap() = ???

  /** Tests whether a face has a `MATH` table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_has_data:]: Method hb_ot_math_has_data has no target types"
  )
  private def otMathHasData() = ???

  /** Tests whether the given glyph index is an extended shape in the face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_math_is_glyph_extended_shape:]: Method hb_ot_math_is_glyph_extended_shape has no target types"
  )
  private def otMathIsGlyphExtendedShape() = ???

  /** Fetches all available feature types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_meta_get_entry_tags:]: Function ot_meta_get_entry_tags contains an OUT parameter, which is not supported yet"
  )
  private def otMetaGetEntryTags() = ???

  /** It fetches metadata entry of a given tag from a font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_meta_reference_entry:]: Method hb_ot_meta_reference_entry has no target types"
  )
  private def otMetaReferenceEntry() = ???

  /** Fetches metrics value corresponding to @metrics_tag from @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_metrics_get_position:]: Function ot_metrics_get_position contains an OUT parameter, which is not supported yet"
  )
  private def otMetricsGetPosition() = ???

  /** Fetches metrics value corresponding to @metrics_tag from @font, and
    * synthesizes a value if it the value is missing in the font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_metrics_get_position_with_fallback:]: Function ot_metrics_get_position_with_fallback contains an OUT parameter, which is not supported yet"
  )
  private def otMetricsGetPositionWithFallback() = ???

  /** Fetches metrics value corresponding to @metrics_tag from @font with the
    * current font variation settings applied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_metrics_get_variation:]: Method hb_ot_metrics_get_variation has no target types"
  )
  private def otMetricsGetVariation() = ???

  /** Fetches horizontal metrics value corresponding to @metrics_tag from @font
    * with the current font variation settings applied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_metrics_get_x_variation:]: Method hb_ot_metrics_get_x_variation has no target types"
  )
  private def otMetricsGetXVariation() = ???

  /** Fetches vertical metrics value corresponding to @metrics_tag from @font
    * with the current font variation settings applied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_metrics_get_y_variation:]: Method hb_ot_metrics_get_y_variation has no target types"
  )
  private def otMetricsGetYVariation() = ???

  /** Fetches a font name from the OpenType 'name' table. If @language is
    * #HB_LANGUAGE_INVALID, English ("en") is assumed. Returns string in UTF-16
    * encoding. A NUL terminator is always written for convenience, and isn't
    * included in the output @text_size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_name_get_utf16:]: Function ot_name_get_utf16 contains an OUT parameter, which is not supported yet"
  )
  private def otNameGetUtf16() = ???

  /** Fetches a font name from the OpenType 'name' table. If @language is
    * #HB_LANGUAGE_INVALID, English ("en") is assumed. Returns string in UTF-32
    * encoding. A NUL terminator is always written for convenience, and isn't
    * included in the output @text_size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_name_get_utf32:]: Function ot_name_get_utf32 contains an OUT parameter, which is not supported yet"
  )
  private def otNameGetUtf32() = ???

  /** Fetches a font name from the OpenType 'name' table. If @language is
    * #HB_LANGUAGE_INVALID, English ("en") is assumed. Returns string in UTF-8
    * encoding. A NUL terminator is always written for convenience, and isn't
    * included in the output @text_size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_name_get_utf8:]: Function ot_name_get_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def otNameGetUtf8() = ???

  /** Enumerates all available name IDs and language combinations. Returned
    * array is owned by the @face and should not be modified. It can be used as
    * long as @face is alive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_name_list_names:]: Function ot_name_list_names contains an OUT parameter, which is not supported yet"
  )
  private def otNameListNames() = ???

  /** Computes the transitive closure of glyphs needed for a specified input
    * buffer under the given font and feature list. The closure is computed as a
    * set, not as a list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_shape_glyphs_closure:]: Function ot_shape_glyphs_closure contains an OUT parameter, which is not supported yet"
  )
  private def otShapeGlyphsClosure() = ???

  /** Computes the complete set of GSUB or GPOS lookups that are applicable
    * under a given @shape_plan.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_shape_plan_collect_lookups:]: Function ot_shape_plan_collect_lookups contains an OUT parameter, which is not supported yet"
  )
  private def otShapePlanCollectLookups() = ???

  /** Converts an #hb_language_t to an #hb_tag_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_tag_from_language:]: Method hb_ot_tag_from_language has no target types"
  )
  private def otTagFromLanguage() = ???

  /** Converts a language tag to an #hb_language_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_tag_to_language:]: Method hb_ot_tag_to_language has no target types"
  )
  private def otTagToLanguage() = ???

  /** Converts a script tag to an #hb_script_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_tag_to_script:]: Method hb_ot_tag_to_script has no target types"
  )
  private def otTagToScript() = ???

  /** Converts an #hb_script_t to script tags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_tags_from_script:]: Function ot_tags_from_script contains an OUT parameter, which is not supported yet"
  )
  private def otTagsFromScript() = ???

  /** Converts an #hb_script_t and an #hb_language_t to script and language
    * tags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_tags_from_script_and_language:]: Function ot_tags_from_script_and_language contains an OUT parameter, which is not supported yet"
  )
  private def otTagsFromScriptAndLanguage() = ???

  /** Converts a script tag and a language tag to an #hb_script_t and an
    * #hb_language_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_tags_to_script_and_language:]: Function ot_tags_to_script_and_language contains an OUT parameter, which is not supported yet"
  )
  private def otTagsToScriptAndLanguage() = ???

  /** Fetches the variation-axis information corresponding to the specified axis
    * tag in the specified face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_find_axis:]: Function ot_var_find_axis contains an OUT parameter, which is not supported yet"
  )
  private def otVarFindAxis() = ???

  /** Fetches the variation-axis information corresponding to the specified axis
    * tag in the specified face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_find_axis_info:]: Function ot_var_find_axis_info contains an OUT parameter, which is not supported yet"
  )
  private def otVarFindAxisInfo() = ???

  /** Fetches a list of all variation axes in the specified face. The list
    * returned will begin at the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_get_axes:]: Function ot_var_get_axes contains an OUT parameter, which is not supported yet"
  )
  private def otVarGetAxes() = ???

  /** Fetches the number of OpenType variation axes included in the face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_get_axis_count:]: Method hb_ot_var_get_axis_count has no target types"
  )
  private def otVarGetAxisCount() = ???

  /** Fetches a list of all variation axes in the specified face. The list
    * returned will begin at the offset provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_get_axis_infos:]: Function ot_var_get_axis_infos contains an OUT parameter, which is not supported yet"
  )
  private def otVarGetAxisInfos() = ???

  /** Fetches the number of named instances included in the face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_get_named_instance_count:]: Method hb_ot_var_get_named_instance_count has no target types"
  )
  private def otVarGetNamedInstanceCount() = ???

  /** Tests whether a face includes any OpenType variation data in the `fvar`
    * table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_has_data:]: Method hb_ot_var_has_data has no target types"
  )
  private def otVarHasData() = ???

  /** Fetches the design-space coordinates corresponding to the given named
    * instance in the face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_named_instance_get_design_coords:]: Function ot_var_named_instance_get_design_coords contains an OUT parameter, which is not supported yet"
  )
  private def otVarNamedInstanceGetDesignCoords() = ???

  /** Fetches the `name` table Name ID that provides display names for the
    * "PostScript name" defined for the given named instance in the face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_named_instance_get_postscript_name_id:]: Method hb_ot_var_named_instance_get_postscript_name_id has no target types"
  )
  private def otVarNamedInstanceGetPostscriptNameId() = ???

  /** Fetches the `name` table Name ID that provides display names for the
    * "Subfamily name" defined for the given named instance in the face.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_named_instance_get_subfamily_name_id:]: Method hb_ot_var_named_instance_get_subfamily_name_id has no target types"
  )
  private def otVarNamedInstanceGetSubfamilyNameId() = ???

  /** Normalizes the given design-space coordinates. The minimum and maximum
    * values for the axis are mapped to the interval [-1,1], with the default
    * axis value mapped to 0.
    *
    * The normalized values have 14 bits of fixed-point sub-integer precision as
    * per OpenType specification.
    *
    * Any additional scaling defined in the face's `avar` table is also applied,
    * as described at
    * https://docs.microsoft.com/en-us/typography/opentype/spec/avar
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_normalize_coords:]: Function ot_var_normalize_coords contains an OUT parameter, which is not supported yet"
  )
  private def otVarNormalizeCoords() = ???

  /** Normalizes all of the coordinates in the given list of variation axes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ot_var_normalize_variations:]: Function ot_var_normalize_variations contains an OUT parameter, which is not supported yet"
  )
  private def otVarNormalizeVariations() = ???

  /** Perform a "color" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_color:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintColor() = ???

  /** Gets the custom palette color for @color_index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_custom_palette_color:]: Function paint_custom_palette_color contains an OUT parameter, which is not supported yet"
  )
  private def paintCustomPaletteColor() = ???

  /** Creates a new #hb_paint_funcs_t structure of paint functions.
    *
    * The initial reference count of 1 should be released with
    * hb_paint_funcs_destroy() when you are done using the #hb_paint_funcs_t.
    * This function never returns `NULL`. If memory cannot be allocated, a
    * special singleton #hb_paint_funcs_t object will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_create:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsCreate() = ???

  /** Decreases the reference count on a paint-functions structure.
    *
    * When the reference count reaches zero, the structure is destroyed, freeing
    * all memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_destroy:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsDestroy() = ???

  /** Fetches the singleton empty paint-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsGetEmpty() = ???

  /** Fetches the user-data associated with the specified key, attached to the
    * specified paint-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_get_user_data:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(const hb_paint_funcs_t*)))"
  )
  private def paintFuncsGetUserData() = ???

  /** Tests whether a paint-functions structure is immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_is_immutable:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsIsImmutable() = ???

  /** Makes a paint-functions structure immutable.
    *
    * After this call, all attempts to set one of the callbacks on @funcs will
    * fail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_make_immutable:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsMakeImmutable() = ???

  /** Increases the reference count on a paint-functions structure.
    *
    * This prevents @funcs from being destroyed until a matching call to
    * hb_paint_funcs_destroy() is made.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_reference:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsReference() = ???

  /** Sets the paint-color callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_color_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetColorFunc() = ???

  /** Sets the custom-palette-color callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_custom_palette_color_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetCustomPaletteColorFunc() = ???

  /** Sets the paint-image callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_image_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetImageFunc() = ???

  /** Sets the linear-gradient callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_linear_gradient_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetLinearGradientFunc() = ???

  /** Sets the pop-clip callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_pop_clip_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetPopClipFunc() = ???

  /** Sets the pop-group callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_pop_group_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetPopGroupFunc() = ???

  /** Sets the pop-transform callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_pop_transform_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetPopTransformFunc() = ???

  /** Sets the push-clip-glyph callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_push_clip_glyph_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetPushClipGlyphFunc() = ???

  /** Sets the push-clip-rect callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_push_clip_rectangle_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetPushClipRectangleFunc() = ???

  /** Sets the push-group callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_push_group_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetPushGroupFunc() = ???

  /** Sets the push-transform callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_push_transform_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetPushTransformFunc() = ???

  /** Sets the radial-gradient callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_radial_gradient_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetRadialGradientFunc() = ???

  /** Sets the sweep-gradient callback on the paint functions struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_sweep_gradient_func:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetSweepGradientFunc() = ???

  /** Attaches a user-data key/data pair to the specified paint-functions
    * structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_funcs_set_user_data:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintFuncsSetUserData() = ???

  /** Perform a "image" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_image:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintImage() = ???

  /** Perform a "linear-gradient" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_linear_gradient:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintLinearGradient() = ???

  /** Perform a "pop-clip" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_pop_clip:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintPopClip() = ???

  /** Perform a "pop-group" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_pop_group:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintPopGroup() = ???

  /** Perform a "pop-transform" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_pop_transform:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintPopTransform() = ???

  /** Perform a "push-clip-glyph" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_push_clip_glyph:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintPushClipGlyph() = ???

  /** Perform a "push-clip-rect" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_push_clip_rectangle:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintPushClipRectangle() = ???

  /** Perform a "push-group" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_push_group:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintPushGroup() = ???

  /** Perform a "push-transform" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_push_transform:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintPushTransform() = ???

  /** Perform a "radial-gradient" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_radial_gradient:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintRadialGradient() = ???

  /** Perform a "sweep-gradient" paint operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[paint_sweep_gradient:/<function parameters>/funcs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  private def paintSweepGradient() = ???

  /** Converts an ISO 15924 script tag to a corresponding #hb_script_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[script_from_iso15924_tag:/<function parameters>/tag]: Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  private def scriptFromIso15924Tag() = ???

  /** Converts a string @str representing an ISO 15924 script tag to a
    * corresponding #hb_script_t. Shorthand for hb_tag_from_string() then
    * hb_script_from_iso15924_tag().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[script_from_string:/<function parameters>/str]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  private def scriptFromString() = ???

  /** Fetches the #hb_direction_t of a script when it is set horizontally. All
    * right-to-left scripts will return #HB_DIRECTION_RTL. All left-to-right
    * scripts will return #HB_DIRECTION_LTR. Scripts that can be written either
    * horizontally or vertically will return #HB_DIRECTION_INVALID. Unknown
    * scripts will return #HB_DIRECTION_LTR.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scriptGetHorizontalDirection(
      script: Script_t /* Some(hb_script_t) */
  ): Direction_t /* Some(hb_direction_t) */ =
    Direction_t.fromRaw(hb_script_get_horizontal_direction(script.raw))

  /** Converts an #hb_script_t to a corresponding ISO 15924 script tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[script_to_iso15924_tag:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  private def scriptToIso15924Tag() = ???

  /** Checks the equality of two #hb_segment_properties_t's.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[segment_properties_equal:/<function parameters>/a]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(segment_properties_t), @type -> DataRecord(const hb_segment_properties_t*)))"
  )
  private def segmentPropertiesEqual() = ???

  /** Creates a hash representing @p.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[segment_properties_hash:/<function parameters>/p]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(segment_properties_t), @type -> DataRecord(const hb_segment_properties_t*)))"
  )
  private def segmentPropertiesHash() = ???

  /** Fills in missing fields of @p from @src in a considered manner.
    *
    * First, if @p does not have direction set, direction is copied from @src.
    *
    * Next, if @p and @src have the same direction (which can be unset), if @p
    * does not have script set, script is copied from @src.
    *
    * Finally, if @p and @src have the same direction and script (which either
    * can be unset), if @p does not have language set, language is copied from
    * @src.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[segment_properties_overlay:/<function parameters>/p]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(segment_properties_t), @type -> DataRecord(hb_segment_properties_t*)))"
  )
  private def segmentPropertiesOverlay() = ???

  /** Adds @codepoint to @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_add:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setAdd() = ???

  /** Adds all of the elements from @first to @last (inclusive) to @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_add_range:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setAddRange() = ???

  /** Adds @num_codepoints codepoints to a set at once. The codepoints array
    * must be in increasing order, with size at least @num_codepoints.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_add_sorted_array:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setAddSortedArray() = ???

  /** Tests whether memory allocation for a set was successful.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_allocation_successful:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setAllocationSuccessful() = ???

  /** Clears out the contents of a set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_clear:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setClear() = ???

  /** Allocate a copy of @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_copy:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setCopy() = ???

  /** Creates a new, initially empty set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_create:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setCreate() = ???

  /** Removes @codepoint from @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_del:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setDel() = ???

  /** Removes all of the elements from @first to @last (inclusive) from @set.
    *
    * If @last is #HB_SET_VALUE_INVALID, then all values greater than or equal
    * to @first are removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_del_range:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setDelRange() = ???

  /** Decreases the reference count on a set. When the reference count reaches
    * zero, the set is destroyed, freeing all memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_destroy:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setDestroy() = ???

  /** Fetches the singleton empty #hb_set_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setGetEmpty() = ???

  /** Finds the largest element in the set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_get_max:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setGetMax() = ???

  /** Finds the smallest element in the set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_get_min:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setGetMin() = ???

  /** Returns the number of elements in the set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_get_population:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setGetPopulation() = ???

  /** Fetches the user data associated with the specified key, attached to the
    * specified set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_get_user_data:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setGetUserData() = ???

  /** Tests whether @codepoint belongs to @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_has:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setHas() = ???

  /** Creates a hash representing @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_hash:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setHash() = ???

  /** Makes @set the intersection of @set and @other.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_intersect:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setIntersect() = ???

  /** Inverts the contents of @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_invert:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setInvert() = ???

  /** Tests whether a set is empty (contains no elements).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_is_empty:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setIsEmpty() = ???

  /** Tests whether @set and @other are equal (contain the same elements).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_is_equal:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setIsEqual() = ???

  /** Returns whether the set is inverted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_is_inverted:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setIsInverted() = ???

  /** Tests whether @set is a subset of @larger_set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_is_subset:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setIsSubset() = ???

  /** Fetches the next element in @set that is greater than current value of @codepoint.
    *
    * Set @codepoint to #HB_SET_VALUE_INVALID to get started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_next:]: Function set_next contains an INOUT parameter, which is not supported yet"
  )
  private def setNext() = ???

  /** Finds the next element in @set that is greater than @codepoint. Writes out
    * codepoints to @out, until either the set runs out of elements, or @size
    * codepoints are written, whichever comes first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_next_many:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  private def setNextMany() = ???

  /** Fetches the next consecutive range of elements in @set that are greater
    * than current value of @last.
    *
    * Set @last to #HB_SET_VALUE_INVALID to get started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_next_range:]: Function set_next_range contains an OUT parameter, which is not supported yet"
  )
  private def setNextRange() = ???

  /** Fetches the previous element in @set that is lower than current value of @codepoint.
    *
    * Set @codepoint to #HB_SET_VALUE_INVALID to get started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_previous:]: Function set_previous contains an INOUT parameter, which is not supported yet"
  )
  private def setPrevious() = ???

  /** Fetches the previous consecutive range of elements in @set that are
    * greater than current value of @last.
    *
    * Set @first to #HB_SET_VALUE_INVALID to get started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_previous_range:]: Function set_previous_range contains an OUT parameter, which is not supported yet"
  )
  private def setPreviousRange() = ???

  /** Increases the reference count on a set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_reference:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setReference() = ???

  /** Makes the contents of @set equal to the contents of @other.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_set:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setSet() = ???

  /** Attaches a user-data key/data pair to the specified set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_set_user_data:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setSetUserData() = ???

  /** Subtracts the contents of @other from @set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_subtract:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setSubtract() = ???

  /** Makes @set the symmetric difference of @set and @other.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_symmetric_difference:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setSymmetricDifference() = ???

  /** Makes @set the union of @set and @other.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_union:/<function parameters>/set]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  private def setUnion() = ???

  /** Shapes @buffer using @font turning its Unicode characters content to
    * positioned glyphs. If @features is not `NULL`, it will be used to control
    * the features applied during shaping. If two @features have the same tag
    * but overlapping ranges the value of the feature with the higher index
    * takes precedence.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def shape() = ???

  /** See hb_shape() for details. If @shaper_list is not `NULL`, the specified
    * shapers will be used in the given order, otherwise the default shapers
    * list will be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_full:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def shapeFull() = ???

  /** See hb_shape_full() for basic details. If @shaper_list is not `NULL`, the
    * specified shapers will be used in the given order, otherwise the default
    * shapers list will be used.
    *
    * In addition, justify the shaping results such that the shaping results
    * reach the target advance width/height, depending on the buffer direction.
    *
    * If the advance of the buffer shaped with hb_shape_full() is already known,
    * put that in *advance. Otherwise set *advance to zero.
    *
    * This API is currently experimental and will probably change in the future.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_justify:]: Function shape_justify contains an OUT parameter, which is not supported yet"
  )
  private def shapeJustify() = ???

  /** Retrieves the list of shapers supported by HarfBuzz.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shapeListShapers(): Array[String] /* Some(Ptr[CString]) */ = MemoryRead
    .nullTerminatedPointerArray(hb_shape_list_shapers())
    .map(fromCString(_))

  /** Constructs a shaping plan for a combination of @face, @user_features, @props,
    * and @shaper_list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_create:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def shapePlanCreate() = ???

  /** The variable-font version of #hb_shape_plan_create. Constructs a shaping
    * plan for a combination of @face, @user_features, @props, and @shaper_list,
    * plus the variation-space coordinates @coords.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_create2:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def shapePlanCreate2() = ???

  /** Creates a cached shaping plan suitable for reuse, for a combination of @face, @user_features, @props,
    * and @shaper_list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_create_cached:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def shapePlanCreateCached() = ???

  /** The variable-font version of #hb_shape_plan_create_cached. Creates a
    * cached shaping plan suitable for reuse, for a combination of @face, @user_features, @props,
    * and @shaper_list, plus the variation-space coordinates @coords.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_create_cached2:/<function parameters>/face]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  private def shapePlanCreateCached2() = ???

  /** Decreases the reference count on the given shaping plan. When the
    * reference count reaches zero, the shaping plan is destroyed, freeing all
    * memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_destroy:/<function parameters>/shape_plan]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  private def shapePlanDestroy() = ???

  /** Executes the given shaping plan on the specified buffer, using the given @font
    * and @features.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_execute:/<function parameters>/shape_plan]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  private def shapePlanExecute() = ???

  /** Fetches the singleton empty shaping plan.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  private def shapePlanGetEmpty() = ???

  /** Fetches the shaper from a given shaping plan.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_get_shaper:/<function parameters>/shape_plan]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  private def shapePlanGetShaper() = ???

  /** Fetches the user data associated with the specified key, attached to the
    * specified shaping plan.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_get_user_data:/<function parameters>/shape_plan]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(const hb_shape_plan_t*)))"
  )
  private def shapePlanGetUserData() = ???

  /** Increases the reference count on the given shaping plan.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_reference:/<function parameters>/shape_plan]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  private def shapePlanReference() = ???

  /** Attaches a user-data key/data pair to the given shaping plan.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shape_plan_set_user_data:/<function parameters>/shape_plan]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  private def shapePlanSetUserData() = ???

  /** Searches variation axes of a #hb_font_t object for a specific axis first,
    * if not set, then tries to get default style values from different tables
    * of the font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[style_get_value:/<function parameters>/font]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  private def styleGetValue() = ???

  /** Converts a string into an #hb_tag_t. Valid tags are four characters.
    * Shorter input strings will be padded with spaces. Longer input strings
    * will be truncated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[tag_from_string:/<function parameters>/str]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  private def tagFromString() = ???

  /** Converts an #hb_tag_t to a string and returns it in @buf. Strings will be
    * four characters long.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[tag_to_string:]: Function tag_to_string contains an OUT parameter, which is not supported yet"
  )
  private def tagToString() = ???

  /** Retrieves the Canonical Combining Class (ccc) property of code point @unicode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_combining_class:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeCombiningClass() = ???

  /** Fetches the composition of a sequence of two Unicode code points.
    *
    * Calls the composition function of the specified Unicode-functions
    * structure @ufuncs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_compose:]: Function unicode_compose contains an OUT parameter, which is not supported yet"
  )
  private def unicodeCompose() = ???

  /** Fetches the decomposition of a Unicode code point.
    *
    * Calls the decomposition function of the specified Unicode-functions
    * structure @ufuncs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_decompose:]: Function unicode_decompose contains an OUT parameter, which is not supported yet"
  )
  private def unicodeDecompose() = ???

  /** Fetches the compatibility decomposition of a Unicode code point.
    * Deprecated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_decompose_compatibility:]: Function unicode_decompose_compatibility contains an OUT parameter, which is not supported yet"
  )
  private def unicodeDecomposeCompatibility() = ???

  /** Don't use. Not used by HarfBuzz.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_eastasian_width:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeEastasianWidth() = ???

  /** Creates a new #hb_unicode_funcs_t structure of Unicode functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_create:/<function parameters>/parent]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsCreate() = ???

  /** Decreases the reference count on a Unicode-functions structure. When the
    * reference count reaches zero, the Unicode-functions structure is
    * destroyed, freeing all memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_destroy:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsDestroy() = ???

  /** Fetches a pointer to the default Unicode-functions structure that is used
    * when no functions are explicitly set on #hb_buffer_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_get_default:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsGetDefault() = ???

  /** Fetches the singleton empty Unicode-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_get_empty:/<return type>]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsGetEmpty() = ???

  /** Fetches the parent of the Unicode-functions structure
    * @ufuncs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_get_parent:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsGetParent() = ???

  /** Fetches the user-data associated with the specified key, attached to the
    * specified Unicode-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_get_user_data:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(const hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsGetUserData() = ???

  /** Tests whether the specified Unicode-functions structure is immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_is_immutable:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsIsImmutable() = ???

  /** Makes the specified Unicode-functions structure immutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_make_immutable:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsMakeImmutable() = ???

  /** Increases the reference count on a Unicode-functions structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_reference:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsReference() = ???

  /** Sets the implementation function for #hb_unicode_combining_class_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_combining_class_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetCombiningClassFunc() = ???

  /** Sets the implementation function for #hb_unicode_compose_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_compose_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetComposeFunc() = ???

  /** Sets the implementation function for
    * #hb_unicode_decompose_compatibility_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_decompose_compatibility_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetDecomposeCompatibilityFunc() = ???

  /** Sets the implementation function for #hb_unicode_decompose_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_decompose_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetDecomposeFunc() = ???

  /** Sets the implementation function for #hb_unicode_eastasian_width_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_eastasian_width_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetEastasianWidthFunc() = ???

  /** Sets the implementation function for #hb_unicode_general_category_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_general_category_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetGeneralCategoryFunc() = ???

  /** Sets the implementation function for #hb_unicode_mirroring_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_mirroring_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetMirroringFunc() = ???

  /** Sets the implementation function for #hb_unicode_script_func_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_script_func:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetScriptFunc() = ???

  /** Attaches a user-data key/data pair to the specified Unicode-functions
    * structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_funcs_set_user_data:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeFuncsSetUserData() = ???

  /** Retrieves the General Category (gc) property of code point @unicode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_general_category:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeGeneralCategory() = ???

  /** Retrieves the Bi-directional Mirroring Glyph code point defined for code
    * point @unicode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_mirroring:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeMirroring() = ???

  /** Retrieves the #hb_script_t script to which code point @unicode belongs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_script:/<function parameters>/ufuncs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  private def unicodeScript() = ???

  /** Parses a string into a #hb_variation_t.
    *
    * The format for specifying variation settings follows. All valid CSS
    * font-variation-settings values other than 'normal' and 'inherited' are
    * also accepted, though, not documented below.
    *
    * The format is a tag, optionally followed by an equals sign, followed by a
    * number. For example `wght=500`, or `slnt=-7.5`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variation_from_string:]: Function variation_from_string contains an OUT parameter, which is not supported yet"
  )
  private def variationFromString() = ???

  /** Converts an #hb_variation_t into a `NULL`-terminated string in the format
    * understood by hb_variation_from_string(). The client in responsible for
    * allocating big enough size for @buf, 128 bytes is more than enough.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variation_to_string:]: Function variation_to_string contains an OUT parameter, which is not supported yet"
  )
  private def variationToString() = ???

  /** Returns library version as three integer components.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[version:]: Function version contains an OUT parameter, which is not supported yet"
  )
  private def version() = ???

  /** Tests the library version against a minimum value, as three integer
    * components.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[version_atleast:/<function parameters>/major]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  private def versionAtleast() = ???

  /** Returns library version as a string with three components.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def versionString(): String /* Some(CString) */ = fromCString(
    hb_version_string().asInstanceOf
  )

  /** Used when getting or setting AAT feature selectors. Indicates that there
    * is no selector index corresponding to the selector of interest.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val AAT_LAYOUT_NO_SELECTOR_INDEX: Int = 65535

  /** The default code point for replacing invalid characters in a given
    * encoding. Set to U+FFFD REPLACEMENT CHARACTER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val BUFFER_REPLACEMENT_CODEPOINT_DEFAULT: Int = 65533

  /** Unused #hb_codepoint_t value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[CODEPOINT_INVALID:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(codepoint_t), @type -> DataRecord(hb_codepoint_t))) with raw value `4294967295`"
  )
  private def CODEPOINT_INVALID() = ???

  /** Special setting for #hb_feature_t.start to apply the feature from the
    * start of the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val FEATURE_GLOBAL_START: Int = 0

  /** Constant signifying that a font does not have any named-instance index
    * set. This is the default of a font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val FONT_NO_VAR_NAMED_INSTANCE: UInt = 4294967295L.toUInt

  /** An unset #hb_language_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[LANGUAGE_INVALID:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t))) with raw value `0`"
  )
  private def LANGUAGE_INVALID() = ???

  /** Special value for language index indicating default or unsupported
    * language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OT_LAYOUT_DEFAULT_LANGUAGE_INDEX: Int = 65535

  /** Special value for feature index indicating unsupported feature.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OT_LAYOUT_NO_FEATURE_INDEX: Int = 65535

  /** Special value for script index indicating unsupported script.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OT_LAYOUT_NO_SCRIPT_INDEX: Int = 65535

  /** Special value for variations index indicating unsupported variation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OT_LAYOUT_NO_VARIATIONS_INDEX: UInt = 4294967295L.toUInt

  /** Maximum number of OpenType tags that can correspond to a give
    * #hb_language_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OT_MAX_TAGS_PER_LANGUAGE: Int = 3

  /** Maximum number of OpenType tags that can correspond to a give
    * #hb_script_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OT_MAX_TAGS_PER_SCRIPT: Int = 3

  /** Do not use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OT_VAR_NO_AXIS_INDEX: UInt = 4294967295L.toUInt

  /** [Tibetan]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val UNICODE_COMBINING_CLASS_CCC133: Int = 133

  /** Maximum valid Unicode code point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val UNICODE_MAX: Int = 1114111

  /** See Unicode 6.1 for details on the maximum decomposition length.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val UNICODE_MAX_DECOMPOSITION_LEN: Int = 19

  /** The major component of the library version available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_MAJOR: Int = 8

  /** The micro component of the library version available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_MICRO: Int = 1

  /** The minor component of the library version available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_MINOR: Int = 1

  /** A string literal containing the library version available at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_STRING: String = "8.1.1"
end HarfBuzz

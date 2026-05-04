package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.fluent.{
  Buffer_serialize_format_t,
  Direction_t,
  Script_t
}

object HarfBuzz:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the name identifier of the specified feature type in the face's
    * `name` table.
    */
  @annotation.compileTimeOnly(
    "Method hb_aat_layout_feature_type_get_name_id has no target types"
  )
  def aatLayoutFeatureTypeGetNameId() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of the selectors available for the specified feature in the
    * given face.
    *
    * If upon return, @default_index is set to #HB_AAT_LAYOUT_NO_SELECTOR_INDEX,
    * then the feature type is non-exclusive. Otherwise, @default_index is the
    * index of the selector that is selected by default.
    */
  @annotation.compileTimeOnly(
    "Function aat_layout_feature_type_get_selector_infos contains an OUT parameter, which is not supported yet"
  )
  def aatLayoutFeatureTypeGetSelectorInfos() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of the AAT feature types included in the specified face.
    */
  @annotation.compileTimeOnly(
    "Function aat_layout_get_feature_types contains an OUT parameter, which is not supported yet"
  )
  def aatLayoutGetFeatureTypes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the specified face includes any positioning information in
    * the `kerx` table.
    *
    * <note>Note: does not examine the `GPOS` table.</note>
    */
  @annotation.compileTimeOnly(
    "Method hb_aat_layout_has_positioning has no target types"
  )
  def aatLayoutHasPositioning() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the specified face includes any substitutions in the `morx`
    * or `mort` tables.
    *
    * <note>Note: does not examine the `GSUB` table.</note>
    */
  @annotation.compileTimeOnly(
    "Method hb_aat_layout_has_substitution has no target types"
  )
  def aatLayoutHasSubstitution() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the specified face includes any tracking information in the
    * `trak` table.
    */
  @annotation.compileTimeOnly(
    "Method hb_aat_layout_has_tracking has no target types"
  )
  def aatLayoutHasTracking() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes a writable copy of @blob.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobCopyWritableOrFail() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new "blob" object wrapping @data. The @mode parameter is used to
    * negotiate ownership and lifecycle of @data.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  def blobCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new blob containing the data from the specified binary font
    * file.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobCreateFromFile() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new blob containing the data from the specified binary font
    * file.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobCreateFromFileOrFail() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new "blob" object wrapping @data. The @mode parameter is used to
    * negotiate ownership and lifecycle of @data.
    *
    * Note that this function returns a freshly-allocated empty blob even if @length
    * is zero. This is in contrast to hb_blob_create(), which returns the
    * singleton empty blob (as returned by hb_blob_get_empty()) if @length is
    * zero.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  def blobCreateOrFail() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a blob that represents a range of bytes in @parent. The new blob
    * is always created with #HB_MEMORY_MODE_READONLY, meaning that it will
    * never modify data in the parent blob. The parent data is not expected to
    * be modified, and will result in undefined behavior if it is.
    *
    * Makes @parent immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobCreateSubBlob() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on @blob, and if it reaches zero, destroys
    * @blob,
    *   freeing all memory, possibly calling the destroy-callback the blob was
    *   created for if it has not been called already.
    *
    * See TODO:link object types for more information.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the data from a blob.
    */
  @annotation.compileTimeOnly(
    "Function blob_get_data contains an OUT parameter, which is not supported yet"
  )
  def blobGetData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to make blob data writable (possibly copying it) and return pointer
    * to data.
    *
    * Fails if blob has been made immutable, or if memory allocation fails.
    */
  @annotation.compileTimeOnly(
    "Function blob_get_data_writable contains an OUT parameter, which is not supported yet"
  )
  def blobGetDataWritable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the singleton empty blob.
    *
    * See TODO:link object types for more information.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the length of a blob's data.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobGetLength() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user data associated with the specified key, attached to the
    * specified font-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(const hb_blob_t*)))"
  )
  def blobGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a blob is immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobIsImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes a blob immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobMakeImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on @blob.
    *
    * See TODO:link object types for more information.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified blob.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def blobSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a character with the Unicode value of @codepoint to @buffer, and
    * gives it the initial cluster value of @cluster. Clusters can be any thing
    * the client wants, they are usually used to refer to the index of the
    * character in the input text stream and are output in
    * #hb_glyph_info_t.cluster field.
    *
    * This function does not check the validity of @codepoint, it is up to the
    * caller to ensure it is a valid Unicode code point.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAdd() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends characters from @text array to @buffer. The @item_offset is the
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAddCodepoints() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Similar to hb_buffer_add_codepoints(), but allows only access to first 256
    * Unicode code points that can fit in 8-bit strings.
    *
    * <note>Has nothing to do with non-Unicode Latin-1 encoding.</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAddLatin1() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_buffer_add_codepoints().
    *
    * Replaces invalid UTF-16 characters with the @buffer replacement code
    * point, see hb_buffer_set_replacement_codepoint().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAddUtf16() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_buffer_add_codepoints().
    *
    * Replaces invalid UTF-32 characters with the @buffer replacement code
    * point, see hb_buffer_set_replacement_codepoint().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAddUtf32() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_buffer_add_codepoints().
    *
    * Replaces invalid UTF-8 characters with the @buffer replacement code point,
    * see hb_buffer_set_replacement_codepoint().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAddUtf8() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check if allocating memory for the buffer succeeded.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAllocationSuccessful() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Append (part of) contents of another buffer to this buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferAppend() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Similar to hb_buffer_reset(), but does not clear the Unicode functions and
    * the replacement code point.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferClearContents() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #hb_buffer_t with all properties to defaults.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #hb_buffer_t, similar to hb_buffer_create(). The only
    * difference is that the buffer is configured similarly to @src.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferCreateSimilar() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deserializes glyphs @buffer from textual representation in the format
    * produced by hb_buffer_serialize_glyphs().
    */
  @annotation.compileTimeOnly(
    "Function buffer_deserialize_glyphs contains an OUT parameter, which is not supported yet"
  )
  def bufferDeserializeGlyphs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deserializes Unicode @buffer from textual representation in the format
    * produced by hb_buffer_serialize_unicode().
    */
  @annotation.compileTimeOnly(
    "Function buffer_deserialize_unicode contains an OUT parameter, which is not supported yet"
  )
  def bufferDeserializeUnicode() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deallocate the @buffer. Decreases the reference count on @buffer by one.
    * If the result is zero, then
    * @buffer
    *   and all associated resources are freed. See hb_buffer_reference().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If dottedcircle_glyph is (hb_codepoint_t) -1 then
    * #HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT and
    * #HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT are never returned. This should be
    * used by most callers if just comparing two buffers is needed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferDiff() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the cluster level of a buffer. The #hb_buffer_cluster_level_t
    * dictates one aspect of how HarfBuzz will treat non-base characters during
    * shaping.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetClusterLevel() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the type of @buffer contents. Buffers are either empty, contain
    * characters (before shaping), or contain glyphs (the result of shaping).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetContentType() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_buffer_set_direction()
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches an empty #hb_buffer_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the #hb_buffer_flags_t of @buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetFlags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns @buffer glyph information array. Returned pointer is valid as long
    * as @buffer contents are not modified.
    */
  @annotation.compileTimeOnly(
    "Function buffer_get_glyph_infos contains an OUT parameter, which is not supported yet"
  )
  def bufferGetGlyphInfos() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns @buffer glyph position array. Returned pointer is valid as long as @buffer
    * contents are not modified.
    *
    * If buffer did not have positions before, the positions will be initialized
    * to zeros, unless this function is called from within a buffer message
    * callback (see hb_buffer_set_message_func()), in which case `NULL` is
    * returned.
    */
  @annotation.compileTimeOnly(
    "Function buffer_get_glyph_positions contains an OUT parameter, which is not supported yet"
  )
  def bufferGetGlyphPositions() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_buffer_set_invisible_glyph().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetInvisibleGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_buffer_set_language().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of items in the buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetLength() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_buffer_set_not_found_glyph().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetNotFoundGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the #hb_codepoint_t that replaces invalid entries for a given
    * encoding when adding text to @buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetReplacementCodepoint() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the script of @buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @props to the #hb_segment_properties_t of @buffer.
    */
  @annotation.compileTimeOnly(
    "Function buffer_get_segment_properties contains an OUT parameter, which is not supported yet"
  )
  def bufferGetSegmentProperties() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the Unicode-functions structure of a buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetUnicodeFuncs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user data associated with the specified key, attached to the
    * specified buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(const hb_buffer_t*)))"
  )
  def bufferGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets unset buffer segment properties based on buffer Unicode contents. If
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferGuessSegmentProperties() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @buffer has glyph position data. A buffer gains position
    * data when hb_buffer_get_glyph_positions() is called on it, and cleared of
    * position data when hb_buffer_clear_contents() is called.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferHasPositions() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reorders a glyph buffer to have canonical in-cluster glyph order /
    * position. The resulting clusters should behave identical to pre-reordering
    * clusters.
    *
    * <note>This has nothing to do with Unicode normalization.</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferNormalizeGlyphs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pre allocates memory for @buffer to fit at least @size number of items.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferPreAllocate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on @buffer by one. This prevents @buffer
    * from being destroyed until a matching call to hb_buffer_destroy() is made.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Resets the buffer to its initial status, as if it was just newly created
    * with hb_buffer_create().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferReset() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reverses buffer contents.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferReverse() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reverses buffer clusters. That is, the buffer contents are reversed, then
    * each cluster (consecutive items having the same cluster number) are
    * reversed again.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferReverseClusters() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reverses buffer contents between @start and @end.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferReverseRange() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serializes @buffer into a textual representation of its content, whether
    * Unicode codepoints or glyph identifiers and positioning information. This
    * is useful for showing the contents of the buffer, for example during
    * debugging. See the documentation of hb_buffer_serialize_unicode() and
    * hb_buffer_serialize_glyphs() for a description of the output format.
    */
  @annotation.compileTimeOnly(
    "Function buffer_serialize contains an OUT parameter, which is not supported yet"
  )
  def bufferSerialize() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a string into an #hb_buffer_serialize_format_t. Does not check if
    * @str
    *   is a valid buffer serialization format, use
    *   hb_buffer_serialize_list_formats() to get the list of supported formats.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  def bufferSerializeFormatFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts @format to the string corresponding it, or `NULL` if it is not a
    * valid #hb_buffer_serialize_format_t.
    */
  def bufferSerializeFormatToString(
      format: Buffer_serialize_format_t /* Some(hb_buffer_serialize_format_t) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    hb_buffer_serialize_format_to_string(format.raw).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serializes @buffer into a textual representation of its glyph content,
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
    */
  @annotation.compileTimeOnly(
    "Function buffer_serialize_glyphs contains an OUT parameter, which is not supported yet"
  )
  def bufferSerializeGlyphs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a list of supported buffer serialization formats.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char**)))"
  )
  def bufferSerializeListFormats() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serializes @buffer into a textual representation of its content, when the
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
    */
  @annotation.compileTimeOnly(
    "Function buffer_serialize_unicode contains an OUT parameter, which is not supported yet"
  )
  def bufferSerializeUnicode() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the cluster level of a buffer. The #hb_buffer_cluster_level_t
    * dictates one aspect of how HarfBuzz will treat non-base characters during
    * shaping.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetClusterLevel() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the type of @buffer contents. Buffers are either empty, contain
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetContentType() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the text flow direction of the buffer. No shaping can happen without
    * setting @buffer direction, and it controls the visual direction for the
    * output glyphs; for RTL direction the glyphs will be reversed. Many layout
    * features depend on the proper setting of the direction, for example,
    * reversing RTL text before shaping, then shaping with LTR direction is not
    * the same as keeping the text in logical order and shaping with RTL
    * direction.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @buffer flags to @flags. See #hb_buffer_flags_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetFlags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the #hb_codepoint_t that replaces invisible characters in the shaping
    * result. If set to zero (default), the glyph for the U+0020 SPACE character
    * is used. Otherwise, this value is used verbatim.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetInvisibleGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the language of @buffer to @language.
    *
    * Languages are crucial for selecting which OpenType feature to apply to the
    * buffer which can result in applying language-specific behaviour. Languages
    * are orthogonal to the scripts, and though they are related, they are
    * different concepts and should not be confused with each other.
    *
    * Use hb_language_from_string() to convert from BCP 47 language tags to
    * #hb_language_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Similar to hb_buffer_pre_allocate(), but clears any new items added at the
    * end.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetLength() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_buffer_message_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetMessageFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the #hb_codepoint_t that replaces characters not found in the font
    * during shaping.
    *
    * The not-found glyph defaults to zero, sometimes knows as the ".notdef"
    * glyph. This API allows for differentiating the two.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetNotFoundGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the #hb_codepoint_t that replaces invalid entries for a given
    * encoding when adding text to @buffer.
    *
    * Default is #HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetReplacementCodepoint() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the script of @buffer to @script.
    *
    * Script is crucial for choosing the proper shaping behaviour for scripts
    * that require it (e.g. Arabic) and the which OpenType features defined in
    * the font to be applied.
    *
    * You can pass one of the predefined #hb_script_t values, or use
    * hb_script_from_string() or hb_script_from_iso15924_tag() to get the
    * corresponding script from an ISO 15924 script tag.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the segment properties of the buffer, a shortcut for calling
    * hb_buffer_set_direction(), hb_buffer_set_script() and
    * hb_buffer_set_language() individually.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetSegmentProperties() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the Unicode-functions structure of a buffer to
    * @unicode_funcs.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetUnicodeFuncs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified buffer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(buffer_t), @type -> DataRecord(hb_buffer_t*)))"
  )
  def bufferSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the alpha channel of the given @color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  def colorGetAlpha() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the blue channel of the given @color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  def colorGetBlue() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the green channel of the given @color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  def colorGetGreen() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the red channel of the given @color.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  def colorGetRed() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of color stops from the given color line object.
    *
    * Note that due to variations being applied, the returned color stops may be
    * out of order. It is the callers responsibility to ensure that color stops
    * are sorted by their offset before they are used.
    */
  @annotation.compileTimeOnly(
    "Function color_line_get_color_stops contains an OUT parameter, which is not supported yet"
  )
  def colorLineGetColorStops() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the extend mode of the color line object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(color_line_t), @type -> DataRecord(hb_color_line_t*)))"
  )
  def colorLineGetExtend() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a string to an #hb_direction_t.
    *
    * Matching is loose and applies only to the first letter. For examples,
    * "LTR" and "left-to-right" will both return #HB_DIRECTION_LTR.
    *
    * Unmatched strings will return #HB_DIRECTION_INVALID.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  def directionFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_direction_t to a string.
    */
  def directionToString(
      direction: Direction_t /* Some(hb_direction_t) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    hb_direction_to_string(direction.raw).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "close-path" draw operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawClosePath() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "cubic-to" draw operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawCubicTo() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new draw callbacks object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deallocate the @dfuncs. Decreases the reference count on @dfuncs by one.
    * If the result is zero, then
    * @dfuncs
    *   and all associated resources are freed. See hb_draw_funcs_reference().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the singleton empty draw-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user-data associated with the specified key, attached to the
    * specified draw-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(const hb_draw_funcs_t*)))"
  )
  def drawFuncsGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether @dfuncs is immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsIsImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @dfuncs object immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsMakeImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on @dfuncs by one.
    *
    * This prevents @dfuncs from being destroyed until a matching call to
    * hb_draw_funcs_destroy() is made.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets close-path callback to the draw functions object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsSetClosePathFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets cubic-to callback to the draw functions object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsSetCubicToFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets line-to callback to the draw functions object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsSetLineToFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets move-to callback to the draw functions object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsSetMoveToFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets quadratic-to callback to the draw functions object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsSetQuadraticToFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified draw-functions
    * structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawFuncsSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "line-to" draw operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawLineTo() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "move-to" draw operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawMoveTo() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "quadratic-to" draw operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(draw_funcs_t), @type -> DataRecord(hb_draw_funcs_t*)))"
  )
  def drawQuadraticTo() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add table for @tag with data provided by @blob to the face. @face must be
    * created using hb_face_builder_create().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceBuilderAddTable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #hb_face_t that can be used with hb_face_builder_add_table().
    * After tables are added to the face, it can be compiled to a binary font
    * file by calling hb_face_reference_blob().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceBuilderCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the ordering of tables for serialization. Any tables not specified in
    * the tags list will be ordered after the tables in tags, ordered by the
    * default sort ordering.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceBuilderSortTables() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Collects the mapping from Unicode characters to nominal glyphs of the @face,
    * and optionally all of the Unicode characters covered by @face.
    */
  @annotation.compileTimeOnly(
    "Function face_collect_nominal_glyph_mapping contains an OUT parameter, which is not supported yet"
  )
  def faceCollectNominalGlyphMapping() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Collects all of the Unicode characters covered by @face and adds them to
    * the #hb_set_t set @out.
    */
  @annotation.compileTimeOnly(
    "Function face_collect_unicodes contains an OUT parameter, which is not supported yet"
  )
  def faceCollectUnicodes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Collects all Unicode "Variation Selector" characters covered by @face and
    * adds them to the #hb_set_t set @out.
    */
  @annotation.compileTimeOnly(
    "Function face_collect_variation_selectors contains an OUT parameter, which is not supported yet"
  )
  def faceCollectVariationSelectors() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Collects all Unicode characters for @variation_selector covered by @face
    * and adds them to the #hb_set_t set @out.
    */
  @annotation.compileTimeOnly(
    "Function face_collect_variation_unicodes contains an OUT parameter, which is not supported yet"
  )
  def faceCollectVariationUnicodes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the number of faces in a blob.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def faceCount() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Constructs a new face object from the specified blob and a face index into
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(blob_t), @type -> DataRecord(hb_blob_t*)))"
  )
  def faceCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Variant of hb_face_create(), built for those cases where it is more
    * convenient to provide data for individual tables instead of the whole font
    * data. With the caveat that hb_face_get_table_tags() does not currently
    * work with faces created this way.
    *
    * Creates a new face object from the specified @user_data and @reference_table_func,
    * with the @destroy callback.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(reference_table_func_t), @type -> DataRecord(hb_reference_table_func_t)))"
  )
  def faceCreateForTables() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on a face object. When the reference count
    * reaches zero, the face is destroyed, freeing all memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the singleton empty face object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the glyph-count value of the specified face object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  def faceGetGlyphCount() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the face-index corresponding to the given face.
    *
    * <note>Note: face indices within a collection are zero-based.</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  def faceGetIndex() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all table tags for a face, if possible. The list
    * returned will begin at the offset provided
    */
  @annotation.compileTimeOnly(
    "Function face_get_table_tags contains an OUT parameter, which is not supported yet"
  )
  def faceGetTableTags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the units-per-em (UPEM) value of the specified face object.
    *
    * Typical UPEM values for fonts are 1000, or 2048, but any value in between
    * 16 and 16,384 is allowed for OpenType fonts.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  def faceGetUpem() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user data associated with the specified key, attached to the
    * specified face object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  def faceGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the given face object is immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  def faceIsImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes the given face object immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceMakeImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on a face object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a pointer to the binary blob that contains the specified face.
    * Returns an empty blob if referencing face data is not possible.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceReferenceBlob() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a reference to the specified table within the specified face.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(const hb_face_t*)))"
  )
  def faceReferenceTable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the glyph count for a face object to the specified value.
    *
    * This API is used in rare circumstances.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceSetGlyphCount() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Assigns the specified face-index to @face. Fails if the face is immutable.
    *
    * <note>Note: changing the index has no effect on the face itself This only
    * changes the value returned by hb_face_get_index().</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceSetIndex() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the units-per-em (upem) for a face object to the specified value.
    *
    * This API is used in rare circumstances.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceSetUpem() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the given face object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def faceSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a string into a #hb_feature_t.
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
    */
  @annotation.compileTimeOnly(
    "Function feature_from_string contains an OUT parameter, which is not supported yet"
  )
  def featureFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a #hb_feature_t into a `NULL`-terminated string in the format
    * understood by hb_feature_from_string(). The client in responsible for
    * allocating big enough size for @buf, 128 bytes is more than enough.
    */
  @annotation.compileTimeOnly(
    "Function feature_to_string contains an OUT parameter, which is not supported yet"
  )
  def featureToString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds the origin coordinates to an (X,Y) point coordinate, in the specified
    * glyph ID in the specified font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_add_glyph_origin_for_direction contains an INOUT parameter, which is not supported yet"
  )
  def fontAddGlyphOriginForDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notifies the @font that underlying font data has changed. This has the
    * effect of increasing the serial as returned by hb_font_get_serial(), which
    * invalidates internal caches.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontChanged() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Constructs a new font object from the specified face.
    *
    * <note>Note: If @face's index value (as passed to hb_face_create() has
    * non-zero top 16-bits, those bits minus one are passed to
    * hb_font_set_var_named_instance(), effectively loading a named-instance of
    * a variable font, instead of the default-instance. This allows specifying
    * which named-instance to load by default when creating the face.</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def fontCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Constructs a sub-font font object from the specified @parent font,
    * replicating the parent's properties.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontCreateSubFont() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on the given font object. When the reference
    * count reaches zero, the font is destroyed, freeing all memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws the outline that corresponds to a glyph in the specified @font.
    *
    * The outline is returned by way of calls to the callbacks of the @dfuncs
    * objects, with @draw_data passed to them.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontDrawGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #hb_font_funcs_t structure of font functions.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on a font-functions structure. When the
    * reference count reaches zero, the font-functions structure is destroyed,
    * freeing all memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches an empty font-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user data associated with the specified key, attached to the
    * specified font-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(const hb_font_funcs_t*)))"
  )
  def fontFuncsGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a font-functions structure is immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsIsImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes a font-functions structure immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsMakeImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on a font-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_draw_glyph_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetDrawGlyphFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_font_h_extents_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetFontHExtentsFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_font_v_extents_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetFontVExtentsFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for
    * #hb_font_get_glyph_contour_point_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphContourPointFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_extents_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphExtentsFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_from_name_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphFromNameFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deprecated. Use hb_font_funcs_set_nominal_glyph_func() and
    * hb_font_funcs_set_variation_glyph_func() instead.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_h_advance_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphHAdvanceFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_h_advances_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphHAdvancesFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_h_kerning_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphHKerningFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_h_origin_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphHOriginFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_name_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphNameFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_shape_func_t,
    * which is the same as #hb_font_draw_glyph_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphShapeFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_v_advance_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphVAdvanceFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_v_advances_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphVAdvancesFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_v_kerning_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphVKerningFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_glyph_v_origin_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetGlyphVOriginFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_nominal_glyph_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetNominalGlyphFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_nominal_glyphs_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetNominalGlyphsFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_paint_glyph_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetPaintGlyphFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified font-functions
    * structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_font_get_variation_glyph_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_funcs_t), @type -> DataRecord(hb_font_funcs_t*)))"
  )
  def fontFuncsSetVariationGlyphFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the empty font object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the extents for a font in a text segment of the specified
    * direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_get_extents_for_direction contains an OUT parameter, which is not supported yet"
  )
  def fontGetExtentsForDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the face associated with the specified font object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetFace() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the glyph ID for a Unicode code point in the specified font, with
    * an optional variation selector.
    *
    * If @variation_selector is 0, calls hb_font_get_nominal_glyph(); otherwise
    * calls hb_font_get_variation_glyph().
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the advance for a glyph ID from the specified font, in a text
    * segment of the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_advance_for_direction contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphAdvanceForDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the advances for a sequence of glyph IDs in the specified font, in
    * a text segment of the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_advances_for_direction contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphAdvancesForDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the (x,y) coordinates of a specified contour-point index in the
    * specified glyph, within the specified font.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_contour_point contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphContourPoint() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the (X,Y) coordinates of a specified contour-point index in the
    * specified glyph ID in the specified font, with respect to the origin in a
    * text segment in the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_contour_point_for_origin contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphContourPointForOrigin() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the #hb_glyph_extents_t data for a glyph ID in the specified font.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_extents contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphExtents() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the #hb_glyph_extents_t data for a glyph ID in the specified font,
    * with respect to the origin in a text segment in the specified direction.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_extents_for_origin contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphExtentsForOrigin() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the glyph ID that corresponds to a name string in the specified @font.
    *
    * <note>Note: @len == -1 means the name string is null-terminated.</note>
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_from_name contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphFromName() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the advance for a glyph ID in the specified font, for horizontal
    * text segments.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetGlyphHAdvance() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the advances for a sequence of glyph IDs in the specified font,
    * for horizontal text segments.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_h_advances contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphHAdvances() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the kerning-adjustment value for a glyph-pair in the specified
    * font, for horizontal text segments.
    *
    * <note>It handles legacy kerning only (as returned by the corresponding
    * #hb_font_funcs_t function).</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetGlyphHKerning() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the (X,Y) coordinates of the origin for a glyph ID in the
    * specified font, for horizontal text segments.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_h_origin contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphHOrigin() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the kerning-adjustment value for a glyph-pair in the specified
    * font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_kerning_for_direction contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphKerningForDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the glyph-name string for a glyph ID in the specified @font.
    *
    * According to the OpenType specification, glyph names are limited to 63
    * characters and can only contain (a subset of) ASCII.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_name contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphName() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the (X,Y) coordinates of the origin for a glyph in the specified
    * font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_origin_for_direction contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphOriginForDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the glyph shape that corresponds to a glyph in the specified @font.
    * The shape is returned by way of calls to the callbacks of the @dfuncs
    * objects, with @draw_data passed to them.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetGlyphShape() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the advance for a glyph ID in the specified font, for vertical
    * text segments.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetGlyphVAdvance() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the advances for a sequence of glyph IDs in the specified font,
    * for vertical text segments.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_v_advances contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphVAdvances() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the kerning-adjustment value for a glyph-pair in the specified
    * font, for vertical text segments.
    *
    * <note>It handles legacy kerning only (as returned by the corresponding
    * #hb_font_funcs_t function).</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetGlyphVKerning() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the (X,Y) coordinates of the origin for a glyph ID in the
    * specified font, for vertical text segments.
    */
  @annotation.compileTimeOnly(
    "Function font_get_glyph_v_origin contains an OUT parameter, which is not supported yet"
  )
  def fontGetGlyphVOrigin() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the extents for a specified font, for horizontal text segments.
    */
  @annotation.compileTimeOnly(
    "Function font_get_h_extents contains an OUT parameter, which is not supported yet"
  )
  def fontGetHExtents() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the nominal glyph ID for a Unicode code point in the specified
    * font.
    *
    * This version of the function should not be used to fetch glyph IDs for
    * code points modified by variation selectors. For variation-selector
    * support, user hb_font_get_variation_glyph() or use hb_font_get_glyph().
    */
  @annotation.compileTimeOnly(
    "Function font_get_nominal_glyph contains an OUT parameter, which is not supported yet"
  )
  def fontGetNominalGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the nominal glyph IDs for a sequence of Unicode code points. Glyph
    * IDs must be returned in a #hb_codepoint_t output parameter. Stopes at the
    * first unsupported glyph ID.
    */
  @annotation.compileTimeOnly(
    "Function font_get_nominal_glyphs contains an OUT parameter, which is not supported yet"
  )
  def fontGetNominalGlyphs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the parent font of @font.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetParent() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the horizontal and vertical points-per-em (ppem) of a font.
    */
  @annotation.compileTimeOnly(
    "Function font_get_ppem contains an OUT parameter, which is not supported yet"
  )
  def fontGetPpem() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the "point size" of a font. Used in CoreText to implement optical
    * sizing.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetPtem() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the horizontal and vertical scale of a font.
    */
  @annotation.compileTimeOnly(
    "Function font_get_scale contains an OUT parameter, which is not supported yet"
  )
  def fontGetScale() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the internal serial number of the font. The serial number is
    * increased every time a setting on the font is changed, using a setter
    * function.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetSerial() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the "synthetic boldness" parameters of a font.
    */
  @annotation.compileTimeOnly(
    "Function font_get_synthetic_bold contains an OUT parameter, which is not supported yet"
  )
  def fontGetSyntheticBold() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the "synthetic slant" of a font.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetSyntheticSlant() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user-data object associated with the specified key, attached
    * to the specified font object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(const hb_font_t*)))"
  )
  def fontGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the extents for a specified font, for vertical text segments.
    */
  @annotation.compileTimeOnly(
    "Function font_get_v_extents contains an OUT parameter, which is not supported yet"
  )
  def fontGetVExtents() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the list of variation coordinates (in design-space units)
    * currently set on a font.
    *
    * Note that this returned array may only contain values for some (or none)
    * of the axes; omitted axes effectively have their default values.
    *
    * Return value is valid as long as variation coordinates of the font are not
    * modified.
    */
  @annotation.compileTimeOnly(
    "Function font_get_var_coords_design contains an OUT parameter, which is not supported yet"
  )
  def fontGetVarCoordsDesign() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the list of normalized variation coordinates currently set on a
    * font.
    *
    * Note that this returned array may only contain values for some (or none)
    * of the axes; omitted axes effectively have zero values.
    *
    * Return value is valid as long as variation coordinates of the font are not
    * modified.
    */
  @annotation.compileTimeOnly(
    "Function font_get_var_coords_normalized contains an OUT parameter, which is not supported yet"
  )
  def fontGetVarCoordsNormalized() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the currently-set named-instance index of the font.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontGetVarNamedInstance() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the glyph ID for a Unicode code point when followed by by the
    * specified variation-selector code point, in the specified font.
    */
  @annotation.compileTimeOnly(
    "Function font_get_variation_glyph contains an OUT parameter, which is not supported yet"
  )
  def fontGetVariationGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the glyph ID from @font that matches the specified string. Strings
    * of the format `gidDDD` or `uniUUUU` are parsed automatically.
    *
    * <note>Note: @len == -1 means the string is null-terminated.</note>
    */
  @annotation.compileTimeOnly(
    "Function font_glyph_from_string contains an OUT parameter, which is not supported yet"
  )
  def fontGlyphFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the name of the specified glyph ID in @font and returns it in
    * string @s.
    *
    * If the glyph ID has no name in @font, a string of the form `gidDDD` is
    * generated, with `DDD` being the glyph ID.
    *
    * According to the OpenType specification, glyph names are limited to 63
    * characters and can only contain (a subset of) ASCII.
    */
  @annotation.compileTimeOnly(
    "Function font_glyph_to_string contains an OUT parameter, which is not supported yet"
  )
  def fontGlyphToString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a font object is immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontIsImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @font immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontMakeImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Paints the glyph.
    *
    * The painting instructions are returned by way of calls to the callbacks of
    * the @funcs object, with @paint_data passed to them.
    *
    * If the font has color palettes (see hb_ot_color_has_palettes()), then @palette_index
    * selects the palette to use. If the font only has one palette, this will be 0.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontPaintGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on the given font object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @face as the font-face value of @font.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetFace() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Replaces the font-functions structure attached to a font, updating the
    * font's user-data with @font-data and the @destroy callback.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetFuncs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Replaces the user data attached to a font, updating the font's
    * @destroy
    *   callback.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetFuncsData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the parent font of @font.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetParent() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the horizontal and vertical pixels-per-em (PPEM) of a font.
    *
    * These values are used for pixel-size-specific adjustment to shaping and
    * draw results, though for the most part they are unused and can be left
    * unset.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetPpem() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the "point size" of a font. Set to zero to unset. Used in CoreText to
    * implement optical sizing.
    *
    * <note>Note: There are 72 points in an inch.</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetPtem() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the horizontal and vertical scale of a font.
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetScale() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the "synthetic boldness" of a font.
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetSyntheticBold() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the "synthetic slant" of a font. By default is zero. Synthetic slant
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetSyntheticSlant() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified font object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies a list of variation coordinates (in design-space units) to a font.
    *
    * Note that this overrides all existing variations set on @font. Axes not
    * included in @coords will be effectively set to their default values.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetVarCoordsDesign() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies a list of variation coordinates (in normalized units) to a font.
    *
    * Note that this overrides all existing variations set on @font. Axes not
    * included in @coords will be effectively set to their default values.
    *
    * <note>Note: Coordinates should be normalized to 2.14.</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetVarCoordsNormalized() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets design coords of a font from a named-instance index.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetVarNamedInstance() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Change the value of one variation axis on the font.
    *
    * Note: This function is expensive to be called repeatedly. If you want to
    * set multiple variation axes at the same time, use hb_font_set_variations()
    * instead.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetVariation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies a list of font-variation settings to a font.
    *
    * Note that this overrides all existing variations set on @font. Axes not
    * included in @variations will be effectively set to their default values.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def fontSetVariations() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Subtracts the origin coordinates from an (X,Y) point coordinate, in the
    * specified glyph ID in the specified font.
    *
    * Calls the appropriate direction-specific variant (horizontal or vertical)
    * depending on the value of @direction.
    */
  @annotation.compileTimeOnly(
    "Function font_subtract_glyph_origin_for_direction contains an INOUT parameter, which is not supported yet"
  )
  def fontSubtractGlyphOriginForDirection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Refreshes the state of @font when the underlying FT_Face has changed. This
    * function should be called after changing the size or variation-axis
    * settings on the FT_Face.
    */
  @annotation.compileTimeOnly("Method hb_ft_font_changed has no target types")
  def ftFontChanged() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the FT_Load_Glyph load flags of the specified #hb_font_t.
    *
    * For more information, see
    * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
    *
    * This function works with #hb_font_t objects created by hb_ft_font_create()
    * or hb_ft_font_create_referenced().
    */
  @annotation.compileTimeOnly(
    "Method hb_ft_font_get_load_flags has no target types"
  )
  def ftFontGetLoadFlags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Configures the font-functions structure of the specified #hb_font_t font
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
    */
  @annotation.compileTimeOnly("Method hb_ft_font_set_funcs has no target types")
  def ftFontSetFuncs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the FT_Load_Glyph load flags for the specified #hb_font_t.
    *
    * For more information, see
    * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
    *
    * This function works with #hb_font_t objects created by hb_ft_font_create()
    * or hb_ft_font_create_referenced().
    */
  @annotation.compileTimeOnly(
    "Method hb_ft_font_set_load_flags has no target types"
  )
  def ftFontSetLoadFlags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Releases an FT_Face previously obtained with hb_ft_font_lock_face().
    */
  @annotation.compileTimeOnly(
    "Method hb_ft_font_unlock_face has no target types"
  )
  def ftFontUnlockFace() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Refreshes the state of the underlying FT_Face of @font when the hb_font_t
    * @font
    *   has changed. This function should be called after changing the size or
    *   variation-axis settings on the @font. This call is fast if nothing has
    *   changed on @font.
    */
  @annotation.compileTimeOnly(
    "Method hb_ft_hb_font_changed has no target types"
  )
  def ftHbFontChanged() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates an #hb_blob_t blob from the specified GBytes data structure.
    */
  @annotation.compileTimeOnly("Method hb_glib_blob_create has no target types")
  def glibBlobCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a Unicode-functions structure that is populated with the
    * appropriate GLib function for each method.
    */
  @annotation.compileTimeOnly(
    "Method hb_glib_get_unicode_funcs has no target types"
  )
  def glibGetUnicodeFuncs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the GUnicodeScript identifier that corresponds to the specified
    * #hb_script_t script.
    */
  @annotation.compileTimeOnly(
    "Method hb_glib_script_from_script has no target types"
  )
  def glibScriptFromScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the #hb_script_t script that corresponds to the specified
    * GUnicodeScript identifier.
    */
  @annotation.compileTimeOnly(
    "Method hb_glib_script_to_script has no target types"
  )
  def glibScriptToScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns glyph flags encoded within a #hb_glyph_info_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(glyph_info_t), @type -> DataRecord(const hb_glyph_info_t*)))"
  )
  def glyphInfoGetGlyphFlags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts @str representing a BCP 47 language tag to the corresponding
    * #hb_language_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  def languageFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetch the default language from current locale.
    *
    * <note>Note that the first time this function is called, it calls
    * "setlocale (LC_CTYPE, nullptr)" to fetch current locale. The underlying
    * setlocale function is, in many implementations, NOT threadsafe. To avoid
    * problems, call this function once before multiple threads can call it.
    * This function is only used from hb_buffer_guess_segment_properties() by
    * HarfBuzz itself.</note>
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t)))"
  )
  def languageGetDefault() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check whether a second language tag is the same or a more specific version
    * of the provided language tag. For example, "fa_IR.utf8" is a more specific
    * tag for "fa" or for "fa_IR".
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t)))"
  )
  def languageMatches() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_language_t to a string.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t)))"
  )
  def languageToString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether memory allocation for a set was successful.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapAllocationSuccessful() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears out the contents of @map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapClear() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allocate a copy of @map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapCopy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new, initially empty map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @key and its stored value from @map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapDel() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on a map. When the reference count reaches
    * zero, the map is destroyed, freeing all memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the value stored for @key in @map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapGet() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the singleton empty #hb_map_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of key-value pairs in the map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapGetPopulation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user data associated with the specified key, attached to the
    * specified map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @key is an element of @map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapHas() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a hash representing @map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapHash() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @map is empty (contains no elements).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapIsEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @map and @other are equal (contain the same elements).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapIsEqual() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add the keys of @map to @keys.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapKeys() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the next key/value paire in @map.
    *
    * Set @idx to -1 to get started.
    *
    * If the map is modified during iteration, the behavior is undefined.
    *
    * The order in which the key/values are returned is undefined.
    */
  @annotation.compileTimeOnly(
    "Function map_next contains an OUT parameter, which is not supported yet"
  )
  def mapNext() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on a map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stores @key:@value in the map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapSet() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add the contents of @other to @map.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(hb_map_t*)))"
  )
  def mapUpdate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add the values of @map to @values.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(map_t), @type -> DataRecord(const hb_map_t*)))"
  )
  def mapValues() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all color layers for the specified glyph index in the
    * specified face. The list returned will begin at the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_color_glyph_get_layers contains an OUT parameter, which is not supported yet"
  )
  def otColorGlyphGetLayers() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests where a face includes COLRv1 paint data for @glyph.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_glyph_has_paint has no target types"
  )
  def otColorGlyphHasPaint() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the PNG image for a glyph. This function takes a font object, not
    * a face object, as input. To get an optimally sized PNG blob, the PPEM
    * values must be set on the @font object. If PPEM is unset, the blob
    * returned will be the largest PNG available.
    *
    * If the glyph has no PNG image, the singleton empty blob is returned.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_glyph_reference_png has no target types"
  )
  def otColorGlyphReferencePng() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the SVG document for a glyph. The blob may be either plain text or
    * gzip-encoded.
    *
    * If the glyph has no SVG document, the singleton empty blob is returned.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_glyph_reference_svg has no target types"
  )
  def otColorGlyphReferenceSvg() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a face includes a `COLR` table with data according to
    * COLRv0.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_has_layers has no target types"
  )
  def otColorHasLayers() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests where a face includes a `COLR` table with data according to COLRv1.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_has_paint has no target types"
  )
  def otColorHasPaint() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a face includes a `CPAL` color-palette table.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_has_palettes has no target types"
  )
  def otColorHasPalettes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a face has PNG glyph images (either in `CBDT` or `sbix`
    * tables).
    */
  @annotation.compileTimeOnly("Method hb_ot_color_has_png has no target types")
  def otColorHasPng() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a face includes any `SVG` glyph images.
    */
  @annotation.compileTimeOnly("Method hb_ot_color_has_svg has no target types")
  def otColorHasSvg() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the `name` table Name ID that provides display names for the
    * specified color in a face's `CPAL` color palette.
    *
    * Display names can be generic (e.g., "Background") or specific (e.g., "Eye
    * color").
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_palette_color_get_name_id has no target types"
  )
  def otColorPaletteColorGetNameId() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of the colors in a color palette.
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
    */
  @annotation.compileTimeOnly(
    "Function ot_color_palette_get_colors contains an OUT parameter, which is not supported yet"
  )
  def otColorPaletteGetColors() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the number of color palettes in a face.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_palette_get_count has no target types"
  )
  def otColorPaletteGetCount() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the flags defined for a color palette.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_palette_get_flags has no target types"
  )
  def otColorPaletteGetFlags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the `name` table Name ID that provides display names for a `CPAL`
    * color palette.
    *
    * Palette display names can be generic (e.g., "Default") or provide
    * specific, themed names (e.g., "Spring", "Summer", "Fall", and "Winter").
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_color_palette_get_name_id has no target types"
  )
  def otColorPaletteGetNameId() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the font functions to use when working with @font.
    */
  @annotation.compileTimeOnly("Method hb_ot_font_set_funcs has no target types")
  def otFontSetFuncs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all feature indexes in the specified face's GSUB table
    * or GPOS table, underneath the specified scripts, languages, and features.
    * If no list of scripts is provided, all scripts will be queried. If no list
    * of languages is provided, all languages will be queried. If no list of
    * features is provided, all features will be queried.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_collect_features contains an OUT parameter, which is not supported yet"
  )
  def otLayoutCollectFeatures() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the mapping from feature tags to feature indexes for the specified
    * script and language.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_collect_features_map contains an OUT parameter, which is not supported yet"
  )
  def otLayoutCollectFeaturesMap() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all feature-lookup indexes in the specified face's GSUB
    * table or GPOS table, underneath the specified scripts, languages, and
    * features. If no list of scripts is provided, all scripts will be queried.
    * If no list of languages is provided, all languages will be queried. If no
    * list of features is provided, all features will be queried.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_collect_lookups contains an OUT parameter, which is not supported yet"
  )
  def otLayoutCollectLookups() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of the characters defined as having a variant under the
    * specified "Character Variant" ("cvXX") feature tag.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_feature_get_characters contains an OUT parameter, which is not supported yet"
  )
  def otLayoutFeatureGetCharacters() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all lookups enumerated for the specified feature, in the
    * specified face's GSUB table or GPOS table. The list returned will begin at
    * the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_feature_get_lookups contains an OUT parameter, which is not supported yet"
  )
  def otLayoutFeatureGetLookups() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches name indices from feature parameters for "Stylistic Set" ('ssXX')
    * or "Character Variant" ('cvXX') features.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_feature_get_name_ids contains an OUT parameter, which is not supported yet"
  )
  def otLayoutFeatureGetNameIds() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all lookups enumerated for the specified feature, in the
    * specified face's GSUB table or GPOS table, enabled at the specified
    * variations index. The list returned will begin at the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_feature_with_variations_get_lookups contains an OUT parameter, which is not supported yet"
  )
  def otLayoutFeatureWithVariationsGetLookups() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all attachment points for the specified glyph in the
    * GDEF table of the face. The list returned will begin at the offset
    * provided.
    *
    * Useful if the client program wishes to cache the list.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_attach_points contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetAttachPoints() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a baseline value from the face.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_baseline contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetBaseline() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a baseline value from the face.
    *
    * This function is like hb_ot_layout_get_baseline() but takes #hb_script_t
    * and #hb_language_t instead of OpenType #hb_tag_t.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_baseline2 contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetBaseline2() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a baseline value from the face, and synthesizes it if the font
    * does not have it.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_baseline_with_fallback contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetBaselineWithFallback() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a baseline value from the face, and synthesizes it if the font
    * does not have it.
    *
    * This function is like hb_ot_layout_get_baseline_with_fallback() but takes
    * #hb_script_t and #hb_language_t instead of OpenType #hb_tag_t.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_baseline_with_fallback2 contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetBaselineWithFallback2() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches script/language-specific font extents. These values are looked up
    * in the `BASE` table's `MinMax` records.
    *
    * If no such extents are found, the default extents for the font are
    * fetched. As such, the return value of this function can for the most part
    * be ignored. Note that the per-script/language extents do not have a
    * line-gap value, and the line-gap is set to zero in that case.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_font_extents contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetFontExtents() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches script/language-specific font extents. These values are looked up
    * in the `BASE` table's `MinMax` records.
    *
    * If no such extents are found, the default extents for the font are
    * fetched. As such, the return value of this function can for the most part
    * be ignored. Note that the per-script/language extents do not have a
    * line-gap value, and the line-gap is set to zero in that case.
    *
    * This function is like hb_ot_layout_get_font_extents() but takes
    * #hb_script_t and #hb_language_t instead of OpenType #hb_tag_t.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_font_extents2 contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetFontExtents2() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the GDEF class of the requested glyph in the specified face.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_get_glyph_class has no target types"
  )
  def otLayoutGetGlyphClass() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the set of all glyphs from the face that belong to the requested
    * glyph class in the face's GDEF table.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_glyphs_in_class contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetGlyphsInClass() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the dominant horizontal baseline tag used by @script.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_get_horizontal_baseline_tag_for_script has no target types"
  )
  def otLayoutGetHorizontalBaselineTagForScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of the caret positions defined for a ligature glyph in the
    * GDEF table of the font. The list returned will begin at the offset
    * provided.
    *
    * Note that a ligature that is formed from n characters will have n-1 caret
    * positions. The first character is not represented in the array, since its
    * caret position is the glyph position.
    *
    * The positions returned by this function are 'unshaped', and will have to
    * be fixed up for kerning that may be applied to the ligature glyph.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_ligature_carets contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetLigatureCarets() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches optical-size feature data (i.e., the `size` feature from GPOS).
    * Note that the subfamily_id and the subfamily name string (accessible via
    * the subfamily_name_id) as used here are defined as pertaining only to
    * fonts within a font family that differ specifically in their respective
    * size ranges; other ways to differentiate fonts within a subfamily are not
    * covered by the `size` feature.
    *
    * For more information on this distinction, see the [`size` feature
    * documentation](
    * https://docs.microsoft.com/en-us/typography/opentype/spec/features_pt#tag-size).
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_get_size_params contains an OUT parameter, which is not supported yet"
  )
  def otLayoutGetSizeParams() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a face has any glyph classes defined in its GDEF table.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_has_glyph_classes has no target types"
  )
  def otLayoutHasGlyphClasses() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the specified face includes any GPOS positioning.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_has_positioning has no target types"
  )
  def otLayoutHasPositioning() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the specified face includes any GSUB substitutions.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_has_substitution has no target types"
  )
  def otLayoutHasSubstitution() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the index of a given feature tag in the specified face's GSUB
    * table or GPOS table, underneath the specified script and language.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_language_find_feature contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLanguageFindFeature() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all features in the specified face's GSUB table or GPOS
    * table, underneath the specified script and language. The list returned
    * will begin at the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_language_get_feature_indexes contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLanguageGetFeatureIndexes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all features in the specified face's GSUB table or GPOS
    * table, underneath the specified script and language. The list returned
    * will begin at the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_language_get_feature_tags contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLanguageGetFeatureTags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the tag of a requested feature index in the given face's GSUB or
    * GPOS table, underneath the specified script and language.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_language_get_required_feature contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLanguageGetRequiredFeature() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the index of a requested feature in the given face's GSUB or GPOS
    * table, underneath the specified script and language.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_language_get_required_feature_index contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLanguageGetRequiredFeatureIndex() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all glyphs affected by the specified lookup in the
    * specified face's GSUB table or GPOS table.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_lookup_collect_glyphs contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLookupCollectGlyphs() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches alternates of a glyph from a given GSUB lookup index.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_lookup_get_glyph_alternates contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLookupGetGlyphAlternates() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the optical bound of a glyph positioned at the margin of text. The
    * direction identifies which edge of the glyph to query.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_lookup_get_optical_bound has no target types"
  )
  def otLayoutLookupGetOpticalBound() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Compute the transitive closure of glyphs needed for a specified lookup.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_lookup_substitute_closure contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLookupSubstituteClosure() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a specified lookup in the specified face would trigger a
    * substitution on the given glyph sequence.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_lookup_would_substitute has no target types"
  )
  def otLayoutLookupWouldSubstitute() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Compute the transitive closure of glyphs needed for all of the provided
    * lookups.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_lookups_substitute_closure contains an OUT parameter, which is not supported yet"
  )
  def otLayoutLookupsSubstituteClosure() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the index of a given language tag in the specified face's GSUB
    * table or GPOS table, underneath the specified script tag.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_script_find_language has no target types"
  )
  def otLayoutScriptFindLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of language tags in the given face's GSUB or GPOS table,
    * underneath the specified script index. The list returned will begin at the
    * offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_script_get_language_tags contains an OUT parameter, which is not supported yet"
  )
  def otLayoutScriptGetLanguageTags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the index of the first language tag fom @language_tags that is
    * present in the specified face's GSUB or GPOS table, underneath the
    * specified script index.
    *
    * If none of the given language tags is found, `false` is returned and
    * @language_index
    *   is set to the default language index.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_script_select_language contains an OUT parameter, which is not supported yet"
  )
  def otLayoutScriptSelectLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the index of the first language tag fom @language_tags that is
    * present in the specified face's GSUB or GPOS table, underneath the
    * specified script index.
    *
    * If none of the given language tags is found, `false` is returned and
    * @language_index
    *   is set to #HB_OT_LAYOUT_DEFAULT_LANGUAGE_INDEX and
    * @chosen_language
    *   is set to #HB_TAG_NONE.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_script_select_language2 contains an OUT parameter, which is not supported yet"
  )
  def otLayoutScriptSelectLanguage2() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deprecated since 2.0.0
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_table_choose_script contains an OUT parameter, which is not supported yet"
  )
  def otLayoutTableChooseScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of feature variations in the specified face's GSUB table or
    * GPOS table, at the specified variation coordinates.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_table_find_feature_variations contains an OUT parameter, which is not supported yet"
  )
  def otLayoutTableFindFeatureVariations() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the index if a given script tag in the specified face's GSUB table
    * or GPOS table.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_table_find_script contains an OUT parameter, which is not supported yet"
  )
  def otLayoutTableFindScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all feature tags in the given face's GSUB or GPOS table.
    * Note that there might be duplicate feature tags, belonging to different
    * script/language-system pairs of the table.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_table_get_feature_tags contains an OUT parameter, which is not supported yet"
  )
  def otLayoutTableGetFeatureTags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the total number of lookups enumerated in the specified face's
    * GSUB table or GPOS table.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_layout_table_get_lookup_count has no target types"
  )
  def otLayoutTableGetLookupCount() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all scripts enumerated in the specified face's GSUB
    * table or GPOS table. The list returned will begin at the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_table_get_script_tags contains an OUT parameter, which is not supported yet"
  )
  def otLayoutTableGetScriptTags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects an OpenType script for @table_tag from the @script_tags array.
    *
    * If the table does not have any of the requested scripts, then `DFLT`,
    * `dflt`, and `latn` tags are tried in that order. If the table still does
    * not have any of these scripts, @script_index is set to
    * #HB_OT_LAYOUT_NO_SCRIPT_INDEX and @chosen_script is set to #HB_TAG_NONE.
    */
  @annotation.compileTimeOnly(
    "Function ot_layout_table_select_script contains an OUT parameter, which is not supported yet"
  )
  def otLayoutTableSelectScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the specified math constant. For most constants, the value
    * returned is an #hb_position_t.
    *
    * However, if the requested constant is
    * #HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN,
    * #HB_OT_MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN or
    * #HB_OT_MATH_CONSTANT_RADICAL_DEGREE_BOTTOM_RAISE_PERCENT, then the return
    * value is an integer between 0 and 100 representing that percentage.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_math_get_constant has no target types"
  )
  def otMathGetConstant() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the GlyphAssembly for the specified font, glyph index, and
    * direction. Returned are a list of #hb_ot_math_glyph_part_t glyph parts
    * that can be used to draw the glyph and an italics-correction value (if one
    * is defined in the font).
    *
    * <note>The @direction parameter is only used to select between horizontal
    * or vertical directions for the construction. Even though all
    * #hb_direction_t values are accepted, only the result of
    * #HB_DIRECTION_IS_HORIZONTAL is considered.</note>
    */
  @annotation.compileTimeOnly(
    "Function ot_math_get_glyph_assembly contains an OUT parameter, which is not supported yet"
  )
  def otMathGetGlyphAssembly() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches an italics-correction value (if one exists) for the specified
    * glyph index.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_math_get_glyph_italics_correction has no target types"
  )
  def otMathGetGlyphItalicsCorrection() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the math kerning (cut-ins) value for the specified font, glyph
    * index, and
    * @kern.
    *
    * If the MathKern table is found, the function examines it to find a height
    * value that is greater or equal to @correction_height. If such a height
    * value is found, corresponding kerning value from the table is returned. If
    * no such height value is found, the last kerning value is returned.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_math_get_glyph_kerning has no target types"
  )
  def otMathGetGlyphKerning() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the raw MathKern (cut-in) data for the specified font, glyph
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
    */
  @annotation.compileTimeOnly(
    "Function ot_math_get_glyph_kernings contains an OUT parameter, which is not supported yet"
  )
  def otMathGetGlyphKernings() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a top-accent-attachment value (if one exists) for the specified
    * glyph index.
    *
    * For any glyph that does not have a top-accent-attachment value - that is,
    * a glyph not covered by the `MathTopAccentAttachment` table (or, when
    * @font
    *   has no `MathTopAccentAttachment` table or no `MATH` table, any glyph) -
    *   the function synthesizes a value, returning the position at one-half the
    *   glyph's advance width.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_math_get_glyph_top_accent_attachment has no target types"
  )
  def otMathGetGlyphTopAccentAttachment() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the MathGlyphConstruction for the specified font, glyph index, and
    * direction. The corresponding list of size variants is returned as a list
    * of #hb_ot_math_glyph_variant_t structs.
    *
    * <note>The @direction parameter is only used to select between horizontal
    * or vertical directions for the construction. Even though all
    * #hb_direction_t values are accepted, only the result of
    * #HB_DIRECTION_IS_HORIZONTAL is considered.</note>
    */
  @annotation.compileTimeOnly(
    "Function ot_math_get_glyph_variants contains an OUT parameter, which is not supported yet"
  )
  def otMathGetGlyphVariants() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the MathVariants table for the specified font and returns the
    * minimum overlap of connecting glyphs that are required to draw a glyph
    * assembly in the specified direction.
    *
    * <note>The @direction parameter is only used to select between horizontal
    * or vertical directions for the construction. Even though all
    * #hb_direction_t values are accepted, only the result of
    * #HB_DIRECTION_IS_HORIZONTAL is considered.</note>
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_math_get_min_connector_overlap has no target types"
  )
  def otMathGetMinConnectorOverlap() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a face has a `MATH` table.
    */
  @annotation.compileTimeOnly("Method hb_ot_math_has_data has no target types")
  def otMathHasData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the given glyph index is an extended shape in the face.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_math_is_glyph_extended_shape has no target types"
  )
  def otMathIsGlyphExtendedShape() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches all available feature types.
    */
  @annotation.compileTimeOnly(
    "Function ot_meta_get_entry_tags contains an OUT parameter, which is not supported yet"
  )
  def otMetaGetEntryTags() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * It fetches metadata entry of a given tag from a font.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_meta_reference_entry has no target types"
  )
  def otMetaReferenceEntry() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches metrics value corresponding to @metrics_tag from @font.
    */
  @annotation.compileTimeOnly(
    "Function ot_metrics_get_position contains an OUT parameter, which is not supported yet"
  )
  def otMetricsGetPosition() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches metrics value corresponding to @metrics_tag from @font, and
    * synthesizes a value if it the value is missing in the font.
    */
  @annotation.compileTimeOnly(
    "Function ot_metrics_get_position_with_fallback contains an OUT parameter, which is not supported yet"
  )
  def otMetricsGetPositionWithFallback() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches metrics value corresponding to @metrics_tag from @font with the
    * current font variation settings applied.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_metrics_get_variation has no target types"
  )
  def otMetricsGetVariation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches horizontal metrics value corresponding to @metrics_tag from @font
    * with the current font variation settings applied.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_metrics_get_x_variation has no target types"
  )
  def otMetricsGetXVariation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches vertical metrics value corresponding to @metrics_tag from @font
    * with the current font variation settings applied.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_metrics_get_y_variation has no target types"
  )
  def otMetricsGetYVariation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a font name from the OpenType 'name' table. If @language is
    * #HB_LANGUAGE_INVALID, English ("en") is assumed. Returns string in UTF-16
    * encoding. A NUL terminator is always written for convenience, and isn't
    * included in the output @text_size.
    */
  @annotation.compileTimeOnly(
    "Function ot_name_get_utf16 contains an OUT parameter, which is not supported yet"
  )
  def otNameGetUtf16() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a font name from the OpenType 'name' table. If @language is
    * #HB_LANGUAGE_INVALID, English ("en") is assumed. Returns string in UTF-32
    * encoding. A NUL terminator is always written for convenience, and isn't
    * included in the output @text_size.
    */
  @annotation.compileTimeOnly(
    "Function ot_name_get_utf32 contains an OUT parameter, which is not supported yet"
  )
  def otNameGetUtf32() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a font name from the OpenType 'name' table. If @language is
    * #HB_LANGUAGE_INVALID, English ("en") is assumed. Returns string in UTF-8
    * encoding. A NUL terminator is always written for convenience, and isn't
    * included in the output @text_size.
    */
  @annotation.compileTimeOnly(
    "Function ot_name_get_utf8 contains an OUT parameter, which is not supported yet"
  )
  def otNameGetUtf8() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enumerates all available name IDs and language combinations. Returned
    * array is owned by the @face and should not be modified. It can be used as
    * long as @face is alive.
    */
  @annotation.compileTimeOnly(
    "Function ot_name_list_names contains an OUT parameter, which is not supported yet"
  )
  def otNameListNames() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the transitive closure of glyphs needed for a specified input
    * buffer under the given font and feature list. The closure is computed as a
    * set, not as a list.
    */
  @annotation.compileTimeOnly(
    "Function ot_shape_glyphs_closure contains an OUT parameter, which is not supported yet"
  )
  def otShapeGlyphsClosure() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the complete set of GSUB or GPOS lookups that are applicable
    * under a given @shape_plan.
    */
  @annotation.compileTimeOnly(
    "Function ot_shape_plan_collect_lookups contains an OUT parameter, which is not supported yet"
  )
  def otShapePlanCollectLookups() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_language_t to an #hb_tag_t.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_tag_from_language has no target types"
  )
  def otTagFromLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a language tag to an #hb_language_t.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_tag_to_language has no target types"
  )
  def otTagToLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a script tag to an #hb_script_t.
    */
  @annotation.compileTimeOnly("Method hb_ot_tag_to_script has no target types")
  def otTagToScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_script_t to script tags.
    */
  @annotation.compileTimeOnly(
    "Function ot_tags_from_script contains an OUT parameter, which is not supported yet"
  )
  def otTagsFromScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_script_t and an #hb_language_t to script and language
    * tags.
    */
  @annotation.compileTimeOnly(
    "Function ot_tags_from_script_and_language contains an OUT parameter, which is not supported yet"
  )
  def otTagsFromScriptAndLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a script tag and a language tag to an #hb_script_t and an
    * #hb_language_t.
    */
  @annotation.compileTimeOnly(
    "Function ot_tags_to_script_and_language contains an OUT parameter, which is not supported yet"
  )
  def otTagsToScriptAndLanguage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the variation-axis information corresponding to the specified axis
    * tag in the specified face.
    */
  @annotation.compileTimeOnly(
    "Function ot_var_find_axis contains an OUT parameter, which is not supported yet"
  )
  def otVarFindAxis() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the variation-axis information corresponding to the specified axis
    * tag in the specified face.
    */
  @annotation.compileTimeOnly(
    "Function ot_var_find_axis_info contains an OUT parameter, which is not supported yet"
  )
  def otVarFindAxisInfo() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all variation axes in the specified face. The list
    * returned will begin at the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_var_get_axes contains an OUT parameter, which is not supported yet"
  )
  def otVarGetAxes() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the number of OpenType variation axes included in the face.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_var_get_axis_count has no target types"
  )
  def otVarGetAxisCount() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a list of all variation axes in the specified face. The list
    * returned will begin at the offset provided.
    */
  @annotation.compileTimeOnly(
    "Function ot_var_get_axis_infos contains an OUT parameter, which is not supported yet"
  )
  def otVarGetAxisInfos() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the number of named instances included in the face.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_var_get_named_instance_count has no target types"
  )
  def otVarGetNamedInstanceCount() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a face includes any OpenType variation data in the `fvar`
    * table.
    */
  @annotation.compileTimeOnly("Method hb_ot_var_has_data has no target types")
  def otVarHasData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the design-space coordinates corresponding to the given named
    * instance in the face.
    */
  @annotation.compileTimeOnly(
    "Function ot_var_named_instance_get_design_coords contains an OUT parameter, which is not supported yet"
  )
  def otVarNamedInstanceGetDesignCoords() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the `name` table Name ID that provides display names for the
    * "PostScript name" defined for the given named instance in the face.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_var_named_instance_get_postscript_name_id has no target types"
  )
  def otVarNamedInstanceGetPostscriptNameId() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the `name` table Name ID that provides display names for the
    * "Subfamily name" defined for the given named instance in the face.
    */
  @annotation.compileTimeOnly(
    "Method hb_ot_var_named_instance_get_subfamily_name_id has no target types"
  )
  def otVarNamedInstanceGetSubfamilyNameId() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Normalizes the given design-space coordinates. The minimum and maximum
    * values for the axis are mapped to the interval [-1,1], with the default
    * axis value mapped to 0.
    *
    * The normalized values have 14 bits of fixed-point sub-integer precision as
    * per OpenType specification.
    *
    * Any additional scaling defined in the face's `avar` table is also applied,
    * as described at
    * https://docs.microsoft.com/en-us/typography/opentype/spec/avar
    */
  @annotation.compileTimeOnly(
    "Function ot_var_normalize_coords contains an OUT parameter, which is not supported yet"
  )
  def otVarNormalizeCoords() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Normalizes all of the coordinates in the given list of variation axes.
    */
  @annotation.compileTimeOnly(
    "Function ot_var_normalize_variations contains an OUT parameter, which is not supported yet"
  )
  def otVarNormalizeVariations() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "color" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintColor() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the custom palette color for @color_index.
    */
  @annotation.compileTimeOnly(
    "Function paint_custom_palette_color contains an OUT parameter, which is not supported yet"
  )
  def paintCustomPaletteColor() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #hb_paint_funcs_t structure of paint functions.
    *
    * The initial reference count of 1 should be released with
    * hb_paint_funcs_destroy() when you are done using the #hb_paint_funcs_t.
    * This function never returns `NULL`. If memory cannot be allocated, a
    * special singleton #hb_paint_funcs_t object will be returned.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on a paint-functions structure.
    *
    * When the reference count reaches zero, the structure is destroyed, freeing
    * all memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the singleton empty paint-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user-data associated with the specified key, attached to the
    * specified paint-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(const hb_paint_funcs_t*)))"
  )
  def paintFuncsGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a paint-functions structure is immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsIsImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes a paint-functions structure immutable.
    *
    * After this call, all attempts to set one of the callbacks on @funcs will
    * fail.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsMakeImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on a paint-functions structure.
    *
    * This prevents @funcs from being destroyed until a matching call to
    * hb_paint_funcs_destroy() is made.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the paint-color callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetColorFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the custom-palette-color callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetCustomPaletteColorFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the paint-image callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetImageFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the linear-gradient callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetLinearGradientFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the pop-clip callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetPopClipFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the pop-group callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetPopGroupFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the pop-transform callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetPopTransformFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the push-clip-glyph callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetPushClipGlyphFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the push-clip-rect callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetPushClipRectangleFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the push-group callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetPushGroupFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the push-transform callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetPushTransformFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the radial-gradient callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetRadialGradientFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the sweep-gradient callback on the paint functions struct.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetSweepGradientFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified paint-functions
    * structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintFuncsSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "image" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintImage() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "linear-gradient" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintLinearGradient() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "pop-clip" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintPopClip() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "pop-group" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintPopGroup() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "pop-transform" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintPopTransform() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "push-clip-glyph" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintPushClipGlyph() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "push-clip-rect" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintPushClipRectangle() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "push-group" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintPushGroup() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "push-transform" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintPushTransform() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "radial-gradient" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintRadialGradient() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Perform a "sweep-gradient" paint operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(paint_funcs_t), @type -> DataRecord(hb_paint_funcs_t*)))"
  )
  def paintSweepGradient() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an ISO 15924 script tag to a corresponding #hb_script_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  def scriptFromIso15924Tag() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a string @str representing an ISO 15924 script tag to a
    * corresponding #hb_script_t. Shorthand for hb_tag_from_string() then
    * hb_script_from_iso15924_tag().
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  def scriptFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the #hb_direction_t of a script when it is set horizontally. All
    * right-to-left scripts will return #HB_DIRECTION_RTL. All left-to-right
    * scripts will return #HB_DIRECTION_LTR. Scripts that can be written either
    * horizontally or vertically will return #HB_DIRECTION_INVALID. Unknown
    * scripts will return #HB_DIRECTION_LTR.
    */
  def scriptGetHorizontalDirection(
      script: Script_t /* Some(hb_script_t) */
  ): Direction_t /* Some(hb_direction_t) */ =
    Direction_t.fromRaw(hb_script_get_horizontal_direction(script.raw))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_script_t to a corresponding ISO 15924 script tag.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  def scriptToIso15924Tag() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks the equality of two #hb_segment_properties_t's.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(segment_properties_t), @type -> DataRecord(const hb_segment_properties_t*)))"
  )
  def segmentPropertiesEqual() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a hash representing @p.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(segment_properties_t), @type -> DataRecord(const hb_segment_properties_t*)))"
  )
  def segmentPropertiesHash() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fills in missing fields of @p from @src in a considered manner.
    *
    * First, if @p does not have direction set, direction is copied from @src.
    *
    * Next, if @p and @src have the same direction (which can be unset), if @p
    * does not have script set, script is copied from @src.
    *
    * Finally, if @p and @src have the same direction and script (which either
    * can be unset), if @p does not have language set, language is copied from
    * @src.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(segment_properties_t), @type -> DataRecord(hb_segment_properties_t*)))"
  )
  def segmentPropertiesOverlay() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @codepoint to @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setAdd() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds all of the elements from @first to @last (inclusive) to @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setAddRange() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @num_codepoints codepoints to a set at once. The codepoints array
    * must be in increasing order, with size at least @num_codepoints.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setAddSortedArray() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether memory allocation for a set was successful.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setAllocationSuccessful() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears out the contents of a set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setClear() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allocate a copy of @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setCopy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new, initially empty set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @codepoint from @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setDel() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all of the elements from @first to @last (inclusive) from @set.
    *
    * If @last is #HB_SET_VALUE_INVALID, then all values greater than or equal
    * to @first are removed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setDelRange() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on a set. When the reference count reaches
    * zero, the set is destroyed, freeing all memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the singleton empty #hb_set_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the largest element in the set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setGetMax() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the smallest element in the set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setGetMin() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of elements in the set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setGetPopulation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user data associated with the specified key, attached to the
    * specified set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @codepoint belongs to @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setHas() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a hash representing @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setHash() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @set the intersection of @set and @other.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setIntersect() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inverts the contents of @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setInvert() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether a set is empty (contains no elements).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setIsEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @set and @other are equal (contain the same elements).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setIsEqual() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the set is inverted.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setIsInverted() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @set is a subset of @larger_set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setIsSubset() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the next element in @set that is greater than current value of @codepoint.
    *
    * Set @codepoint to #HB_SET_VALUE_INVALID to get started.
    */
  @annotation.compileTimeOnly(
    "Function set_next contains an INOUT parameter, which is not supported yet"
  )
  def setNext() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the next element in @set that is greater than @codepoint. Writes out
    * codepoints to @out, until either the set runs out of elements, or @size
    * codepoints are written, whichever comes first.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(const hb_set_t*)))"
  )
  def setNextMany() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the next consecutive range of elements in @set that are greater
    * than current value of @last.
    *
    * Set @last to #HB_SET_VALUE_INVALID to get started.
    */
  @annotation.compileTimeOnly(
    "Function set_next_range contains an OUT parameter, which is not supported yet"
  )
  def setNextRange() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the previous element in @set that is lower than current value of @codepoint.
    *
    * Set @codepoint to #HB_SET_VALUE_INVALID to get started.
    */
  @annotation.compileTimeOnly(
    "Function set_previous contains an INOUT parameter, which is not supported yet"
  )
  def setPrevious() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the previous consecutive range of elements in @set that are
    * greater than current value of @last.
    *
    * Set @first to #HB_SET_VALUE_INVALID to get started.
    */
  @annotation.compileTimeOnly(
    "Function set_previous_range contains an OUT parameter, which is not supported yet"
  )
  def setPreviousRange() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on a set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes the contents of @set equal to the contents of @other.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setSet() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Subtracts the contents of @other from @set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setSubtract() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @set the symmetric difference of @set and @other.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setSymmetricDifference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @set the union of @set and @other.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(set_t), @type -> DataRecord(hb_set_t*)))"
  )
  def setUnion() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shapes @buffer using @font turning its Unicode characters content to
    * positioned glyphs. If @features is not `NULL`, it will be used to control
    * the features applied during shaping. If two @features have the same tag
    * but overlapping ranges the value of the feature with the higher index
    * takes precedence.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def shape() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_shape() for details. If @shaper_list is not `NULL`, the specified
    * shapers will be used in the given order, otherwise the default shapers
    * list will be used.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def shapeFull() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See hb_shape_full() for basic details. If @shaper_list is not `NULL`, the
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
    */
  @annotation.compileTimeOnly(
    "Function shape_justify contains an OUT parameter, which is not supported yet"
  )
  def shapeJustify() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the list of shapers supported by HarfBuzz.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char**)))"
  )
  def shapeListShapers() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Constructs a shaping plan for a combination of @face, @user_features, @props,
    * and @shaper_list.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def shapePlanCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The variable-font version of #hb_shape_plan_create. Constructs a shaping
    * plan for a combination of @face, @user_features, @props, and @shaper_list,
    * plus the variation-space coordinates @coords.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def shapePlanCreate2() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a cached shaping plan suitable for reuse, for a combination of @face, @user_features, @props,
    * and @shaper_list.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def shapePlanCreateCached() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The variable-font version of #hb_shape_plan_create_cached. Creates a
    * cached shaping plan suitable for reuse, for a combination of @face, @user_features, @props,
    * and @shaper_list, plus the variation-space coordinates @coords.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(face_t), @type -> DataRecord(hb_face_t*)))"
  )
  def shapePlanCreateCached2() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on the given shaping plan. When the
    * reference count reaches zero, the shaping plan is destroyed, freeing all
    * memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  def shapePlanDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Executes the given shaping plan on the specified buffer, using the given @font
    * and @features.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  def shapePlanExecute() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the singleton empty shaping plan.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  def shapePlanGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the shaper from a given shaping plan.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  def shapePlanGetShaper() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user data associated with the specified key, attached to the
    * specified shaping plan.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(const hb_shape_plan_t*)))"
  )
  def shapePlanGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on the given shaping plan.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  def shapePlanReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the given shaping plan.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(shape_plan_t), @type -> DataRecord(hb_shape_plan_t*)))"
  )
  def shapePlanSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Searches variation axes of a #hb_font_t object for a specific axis first,
    * if not set, then tries to get default style values from different tables
    * of the font.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(font_t), @type -> DataRecord(hb_font_t*)))"
  )
  def styleGetValue() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a string into an #hb_tag_t. Valid tags are four characters.
    * Shorter input strings will be padded with spaces. Longer input strings
    * will be truncated.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))"
  )
  def tagFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_tag_t to a string and returns it in @buf. Strings will be
    * four characters long.
    */
  @annotation.compileTimeOnly(
    "Function tag_to_string contains an OUT parameter, which is not supported yet"
  )
  def tagToString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the Canonical Combining Class (ccc) property of code point @unicode.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeCombiningClass() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the composition of a sequence of two Unicode code points.
    *
    * Calls the composition function of the specified Unicode-functions
    * structure @ufuncs.
    */
  @annotation.compileTimeOnly(
    "Function unicode_compose contains an OUT parameter, which is not supported yet"
  )
  def unicodeCompose() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the decomposition of a Unicode code point.
    *
    * Calls the decomposition function of the specified Unicode-functions
    * structure @ufuncs.
    */
  @annotation.compileTimeOnly(
    "Function unicode_decompose contains an OUT parameter, which is not supported yet"
  )
  def unicodeDecompose() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the compatibility decomposition of a Unicode code point.
    * Deprecated.
    */
  @annotation.compileTimeOnly(
    "Function unicode_decompose_compatibility contains an OUT parameter, which is not supported yet"
  )
  def unicodeDecomposeCompatibility() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Don't use. Not used by HarfBuzz.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeEastasianWidth() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #hb_unicode_funcs_t structure of Unicode functions.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsCreate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count on a Unicode-functions structure. When the
    * reference count reaches zero, the Unicode-functions structure is
    * destroyed, freeing all memory.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsDestroy() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches a pointer to the default Unicode-functions structure that is used
    * when no functions are explicitly set on #hb_buffer_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsGetDefault() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the singleton empty Unicode-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsGetEmpty() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the parent of the Unicode-functions structure
    * @ufuncs.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsGetParent() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the user-data associated with the specified key, attached to the
    * specified Unicode-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(const hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsGetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether the specified Unicode-functions structure is immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsIsImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes the specified Unicode-functions structure immutable.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsMakeImmutable() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count on a Unicode-functions structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsReference() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_unicode_combining_class_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetCombiningClassFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_unicode_compose_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetComposeFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for
    * #hb_unicode_decompose_compatibility_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetDecomposeCompatibilityFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_unicode_decompose_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetDecomposeFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_unicode_eastasian_width_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetEastasianWidthFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_unicode_general_category_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetGeneralCategoryFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_unicode_mirroring_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetMirroringFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the implementation function for #hb_unicode_script_func_t.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetScriptFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches a user-data key/data pair to the specified Unicode-functions
    * structure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeFuncsSetUserData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the General Category (gc) property of code point @unicode.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeGeneralCategory() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the Bi-directional Mirroring Glyph code point defined for code
    * point @unicode.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeMirroring() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the #hb_script_t script to which code point @unicode belongs.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(unicode_funcs_t), @type -> DataRecord(hb_unicode_funcs_t*)))"
  )
  def unicodeScript() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses a string into a #hb_variation_t.
    *
    * The format for specifying variation settings follows. All valid CSS
    * font-variation-settings values other than 'normal' and 'inherited' are
    * also accepted, though, not documented below.
    *
    * The format is a tag, optionally followed by an equals sign, followed by a
    * number. For example `wght=500`, or `slnt=-7.5`.
    */
  @annotation.compileTimeOnly(
    "Function variation_from_string contains an OUT parameter, which is not supported yet"
  )
  def variationFromString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts an #hb_variation_t into a `NULL`-terminated string in the format
    * understood by hb_variation_from_string(). The client in responsible for
    * allocating big enough size for @buf, 128 bytes is more than enough.
    */
  @annotation.compileTimeOnly(
    "Function variation_to_string contains an OUT parameter, which is not supported yet"
  )
  def variationToString() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns library version as three integer components.
    */
  @annotation.compileTimeOnly(
    "Function version contains an OUT parameter, which is not supported yet"
  )
  def version() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests the library version against a minimum value, as three integer
    * components.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  def versionAtleast() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns library version as a string with three components.
    */
  def versionString()(using Zone): String /* Some(CString) */ = fromCString(
    hb_version_string().asInstanceOf
  )

end HarfBuzz

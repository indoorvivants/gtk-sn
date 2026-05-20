package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.SList
import sn.gnome.glib.internal.{gpointer, guint8}
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{Font, Language}
import sn.gnome.pango.internal.PangoAnalysis

/** The `PangoAnalysis` structure stores information about the properties of a
  * segment of text.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Analysis private[gnome] (raw: Ptr[PangoAnalysis]):

  def getUnsafeRawPointer(): Ptr[PangoAnalysis] = this.raw

  /** unused, reserved
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shapeEngine: Ptr[Byte] /* None */ =
    (!raw).shape_engine.asInstanceOf[Ptr[PangoEngineShape]]

  /** unused, reserved
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shapeEngine_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).shape_engine_=(gpointer(value).asInstanceOf[Ptr[PangoEngineShape]])

  /** unused, reserved
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def langEngine: Ptr[Byte] /* None */ =
    (!raw).lang_engine.asInstanceOf[Ptr[PangoEngineLang]]

  /** unused, reserved
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def langEngine_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).lang_engine_=(gpointer(value).asInstanceOf[Ptr[PangoEngineLang]])

  /** the font for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def font(using Runtime): sn.gnome.pango.Font /* None */ =
    (!raw).font.asInstanceOf[Ptr[PangoFont]]

  /** the font for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def font_=(value: sn.gnome.pango.Font /* None */ )(using Runtime): Unit =
    (!raw).font_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[PangoFont]]
    )

  /** the bidirectional level for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def level: UByte /* None */ =
    (!raw).level.asInstanceOf[_root_.sn.gnome.glib.internal.guint8]

  /** the bidirectional level for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def level_=(value: UByte /* None */ ): Unit = (!raw).level_=(
    guint8(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint8]
  )

  /** the glyph orientation for this segment (A `PangoGravity`).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gravity: UByte /* None */ =
    (!raw).gravity.asInstanceOf[_root_.sn.gnome.glib.internal.guint8]

  /** the glyph orientation for this segment (A `PangoGravity`).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gravity_=(value: UByte /* None */ ): Unit = (!raw).gravity_=(
    guint8(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint8]
  )

  /** boolean flags for this segment (Since: 1.16).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: UByte /* None */ =
    (!raw).flags.asInstanceOf[_root_.sn.gnome.glib.internal.guint8]

  /** boolean flags for this segment (Since: 1.16).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: UByte /* None */ ): Unit = (!raw).flags_=(
    guint8(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint8]
  )

  /** the detected script for this segment (A `PangoScript`) (Since: 1.18).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def script: UByte /* None */ =
    (!raw).script.asInstanceOf[_root_.sn.gnome.glib.internal.guint8]

  /** the detected script for this segment (A `PangoScript`) (Since: 1.18).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def script_=(value: UByte /* None */ ): Unit = (!raw).script_=(
    guint8(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint8]
  )

  /** the detected language for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def language: sn.gnome.pango.Language /* None */ =
    (!raw).language.asInstanceOf[Ptr[PangoLanguage]]

  /** the detected language for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def language_=(value: sn.gnome.pango.Language /* None */ ): Unit =
    (!raw).language_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[PangoLanguage]]
    )

  /** extra attributes for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def extraAttrs: sn.gnome.glib.SList /* None */ =
    (!raw).extra_attrs.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]

  /** extra attributes for this segment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def extraAttrs_=(value: sn.gnome.glib.SList /* None */ ): Unit =
    (!raw).extra_attrs_=(
      value
        .getUnsafeRawPointer()
        .asInstanceOf
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
    )
end Analysis

object Analysis:
  def fromRaw(ptr: Ptr[PangoAnalysis]): Analysis = new Analysis(ptr)
end Analysis

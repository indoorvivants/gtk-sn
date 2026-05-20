package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_color_line_t

/** A struct containing color information for a gradient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class color_line_t private[gnome] (raw: Ptr[hb_color_line_t]):

  def getUnsafeRawPointer(): Ptr[hb_color_line_t] = this.raw
  @annotation.compileTimeOnly(
    "[field data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def data__ = ???
  @annotation.compileTimeOnly(
    "[field get_color_stops]: Cannot render type Type(List(),ListMap(@name -> DataRecord(color_line_get_color_stops_func_t), @type -> DataRecord(hb_color_line_get_color_stops_func_t)))"
  )
  private def getColorStops__ = ???
  @annotation.compileTimeOnly(
    "[field get_color_stops_user_data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def getColorStopsUserData__ = ???
  @annotation.compileTimeOnly(
    "[field get_extend]: Cannot render type Type(List(),ListMap(@name -> DataRecord(color_line_get_extend_func_t), @type -> DataRecord(hb_color_line_get_extend_func_t)))"
  )
  private def getExtend__ = ???
  @annotation.compileTimeOnly(
    "[field get_extend_user_data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def getExtendUserData__ = ???
  @annotation.compileTimeOnly(
    "[field reserved0]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved0__ = ???
  @annotation.compileTimeOnly(
    "[field reserved1]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved1__ = ???
  @annotation.compileTimeOnly(
    "[field reserved2]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved2__ = ???
  @annotation.compileTimeOnly(
    "[field reserved3]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved3__ = ???
  @annotation.compileTimeOnly(
    "[field reserved5]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved5__ = ???
  @annotation.compileTimeOnly(
    "[field reserved6]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved6__ = ???
  @annotation.compileTimeOnly(
    "[field reserved7]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved7__ = ???
  @annotation.compileTimeOnly(
    "[field reserved8]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def reserved8__ = ???
end color_line_t

object color_line_t:
  def fromRaw(ptr: Ptr[hb_color_line_t]): color_line_t = new color_line_t(ptr)
end color_line_t

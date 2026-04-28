package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkMemoryFormat: _MEMORY_B8G8R8A8_PREMULTIPLIED: 4 bytes; for blue, green, red, alpha. The color values are premultiplied with the alpha value. _MEMORY_A8R8G8B8_PREMULTIPLIED: 4 bytes; for alpha, red, green, blue. The color values are premultiplied with the alpha value. _MEMORY_R8G8B8A8_PREMULTIPLIED: 4 bytes; for red, green, blue, alpha The color values are premultiplied with the alpha value. _MEMORY_B8G8R8A8: 4 bytes; for blue, green, red, alpha. _MEMORY_A8R8G8B8: 4 bytes; for alpha, red, green, blue. _MEMORY_R8G8B8A8: 4 bytes; for red, green, blue, alpha. _MEMORY_A8B8G8R8: 4 bytes; for alpha, blue, green, red. _MEMORY_R8G8B8: 3 bytes; for red, green, blue. The data is opaque. _MEMORY_B8G8R8: 3 bytes; for blue, green, red. The data is opaque. _MEMORY_N_FORMATS: The number of formats. This value will change as more formats get added, so do not rely on its concrete integer. _MEMORY_R32G32B32_FLOAT: 3 float values; for red, green, blue.
*/
opaque type GdkMemoryFormat = CUnsignedInt
object GdkMemoryFormat extends _BindgenEnumCUnsignedInt[GdkMemoryFormat]:
  given _tag: Tag[GdkMemoryFormat] = Tag.UInt
  inline def define(inline a: Long): GdkMemoryFormat = a.toUInt
  val GDK_MEMORY_B8G8R8A8_PREMULTIPLIED = define(0)
  val GDK_MEMORY_A8R8G8B8_PREMULTIPLIED = define(1)
  val GDK_MEMORY_R8G8B8A8_PREMULTIPLIED = define(2)
  val GDK_MEMORY_B8G8R8A8 = define(3)
  val GDK_MEMORY_A8R8G8B8 = define(4)
  val GDK_MEMORY_R8G8B8A8 = define(5)
  val GDK_MEMORY_A8B8G8R8 = define(6)
  val GDK_MEMORY_R8G8B8 = define(7)
  val GDK_MEMORY_B8G8R8 = define(8)
  val GDK_MEMORY_R16G16B16 = define(9)
  val GDK_MEMORY_R16G16B16A16_PREMULTIPLIED = define(10)
  val GDK_MEMORY_R16G16B16A16 = define(11)
  val GDK_MEMORY_R16G16B16_FLOAT = define(12)
  val GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED = define(13)
  val GDK_MEMORY_R16G16B16A16_FLOAT = define(14)
  val GDK_MEMORY_R32G32B32_FLOAT = define(15)
  val GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED = define(16)
  val GDK_MEMORY_R32G32B32A32_FLOAT = define(17)
  val GDK_MEMORY_G8A8_PREMULTIPLIED = define(18)
  val GDK_MEMORY_G8A8 = define(19)
  val GDK_MEMORY_G8 = define(20)
  val GDK_MEMORY_G16A16_PREMULTIPLIED = define(21)
  val GDK_MEMORY_G16A16 = define(22)
  val GDK_MEMORY_G16 = define(23)
  val GDK_MEMORY_A8 = define(24)
  val GDK_MEMORY_A16 = define(25)
  val GDK_MEMORY_A16_FLOAT = define(26)
  val GDK_MEMORY_A32_FLOAT = define(27)
  val GDK_MEMORY_A8B8G8R8_PREMULTIPLIED = define(28)
  val GDK_MEMORY_B8G8R8X8 = define(29)
  val GDK_MEMORY_X8R8G8B8 = define(30)
  val GDK_MEMORY_R8G8B8X8 = define(31)
  val GDK_MEMORY_X8B8G8R8 = define(32)
  val GDK_MEMORY_N_FORMATS = define(33)
  def getName(value: GdkMemoryFormat): Option[String] =
    value match
      case `GDK_MEMORY_B8G8R8A8_PREMULTIPLIED` => Some("GDK_MEMORY_B8G8R8A8_PREMULTIPLIED")
      case `GDK_MEMORY_A8R8G8B8_PREMULTIPLIED` => Some("GDK_MEMORY_A8R8G8B8_PREMULTIPLIED")
      case `GDK_MEMORY_R8G8B8A8_PREMULTIPLIED` => Some("GDK_MEMORY_R8G8B8A8_PREMULTIPLIED")
      case `GDK_MEMORY_B8G8R8A8` => Some("GDK_MEMORY_B8G8R8A8")
      case `GDK_MEMORY_A8R8G8B8` => Some("GDK_MEMORY_A8R8G8B8")
      case `GDK_MEMORY_R8G8B8A8` => Some("GDK_MEMORY_R8G8B8A8")
      case `GDK_MEMORY_A8B8G8R8` => Some("GDK_MEMORY_A8B8G8R8")
      case `GDK_MEMORY_R8G8B8` => Some("GDK_MEMORY_R8G8B8")
      case `GDK_MEMORY_B8G8R8` => Some("GDK_MEMORY_B8G8R8")
      case `GDK_MEMORY_R16G16B16` => Some("GDK_MEMORY_R16G16B16")
      case `GDK_MEMORY_R16G16B16A16_PREMULTIPLIED` => Some("GDK_MEMORY_R16G16B16A16_PREMULTIPLIED")
      case `GDK_MEMORY_R16G16B16A16` => Some("GDK_MEMORY_R16G16B16A16")
      case `GDK_MEMORY_R16G16B16_FLOAT` => Some("GDK_MEMORY_R16G16B16_FLOAT")
      case `GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED` => Some("GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED")
      case `GDK_MEMORY_R16G16B16A16_FLOAT` => Some("GDK_MEMORY_R16G16B16A16_FLOAT")
      case `GDK_MEMORY_R32G32B32_FLOAT` => Some("GDK_MEMORY_R32G32B32_FLOAT")
      case `GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED` => Some("GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED")
      case `GDK_MEMORY_R32G32B32A32_FLOAT` => Some("GDK_MEMORY_R32G32B32A32_FLOAT")
      case `GDK_MEMORY_G8A8_PREMULTIPLIED` => Some("GDK_MEMORY_G8A8_PREMULTIPLIED")
      case `GDK_MEMORY_G8A8` => Some("GDK_MEMORY_G8A8")
      case `GDK_MEMORY_G8` => Some("GDK_MEMORY_G8")
      case `GDK_MEMORY_G16A16_PREMULTIPLIED` => Some("GDK_MEMORY_G16A16_PREMULTIPLIED")
      case `GDK_MEMORY_G16A16` => Some("GDK_MEMORY_G16A16")
      case `GDK_MEMORY_G16` => Some("GDK_MEMORY_G16")
      case `GDK_MEMORY_A8` => Some("GDK_MEMORY_A8")
      case `GDK_MEMORY_A16` => Some("GDK_MEMORY_A16")
      case `GDK_MEMORY_A16_FLOAT` => Some("GDK_MEMORY_A16_FLOAT")
      case `GDK_MEMORY_A32_FLOAT` => Some("GDK_MEMORY_A32_FLOAT")
      case `GDK_MEMORY_A8B8G8R8_PREMULTIPLIED` => Some("GDK_MEMORY_A8B8G8R8_PREMULTIPLIED")
      case `GDK_MEMORY_B8G8R8X8` => Some("GDK_MEMORY_B8G8R8X8")
      case `GDK_MEMORY_X8R8G8B8` => Some("GDK_MEMORY_X8R8G8B8")
      case `GDK_MEMORY_R8G8B8X8` => Some("GDK_MEMORY_R8G8B8X8")
      case `GDK_MEMORY_X8B8G8R8` => Some("GDK_MEMORY_X8B8G8R8")
      case `GDK_MEMORY_N_FORMATS` => Some("GDK_MEMORY_N_FORMATS")
      case _ => _root_.scala.None
  extension (a: GdkMemoryFormat)
    inline def &(b: GdkMemoryFormat): GdkMemoryFormat = a & b
    inline def |(b: GdkMemoryFormat): GdkMemoryFormat = a | b
    inline def is(b: GdkMemoryFormat): Boolean = (a & b) == b
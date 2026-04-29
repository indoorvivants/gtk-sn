package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_euler_order_t: _EULER_ORDER_DEFAULT: Rotate in the default order; the default order is one of the following enumeration values _EULER_ORDER_XYZ: Rotate in the X, Y, and Z order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXYZ _EULER_ORDER_YZX: Rotate in the Y, Z, and X order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYZX _EULER_ORDER_ZXY: Rotate in the Z, X, and Y order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZXY _EULER_ORDER_XZY: Rotate in the X, Z, and Y order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SXZY _EULER_ORDER_YXZ: Rotate in the Y, X, and Z order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SYXZ _EULER_ORDER_ZYX: Rotate in the Z, Y, and X order. Deprecated in Graphene 1.10, it's an alias for %GRAPHENE_EULER_ORDER_SZYX _EULER_ORDER_SXYZ: Defines a static rotation along the X, Y, and Z axes (Since: 1.10) _EULER_ORDER_SXYX: Defines a static rotation along the X, Y, and X axes (Since: 1.10) _EULER_ORDER_SXZY: Defines a static rotation along the X, Z, and Y axes (Since: 1.10) _EULER_ORDER_SXZX: Defines a static rotation along the X, Z, and X axes (Since: 1.10) _EULER_ORDER_SYZX: Defines a static rotation along the Y, Z, and X axes (Since: 1.10) _EULER_ORDER_SYZY: Defines a static rotation along the Y, Z, and Y axes (Since: 1.10) _EULER_ORDER_SYXZ: Defines a static rotation along the Y, X, and Z axes (Since: 1.10) _EULER_ORDER_SYXY: Defines a static rotation along the Y, X, and Y axes (Since: 1.10) _EULER_ORDER_SZXY: Defines a static rotation along the Z, X, and Y axes (Since: 1.10) _EULER_ORDER_SZXZ: Defines a static rotation along the Z, X, and Z axes (Since: 1.10) _EULER_ORDER_SZYX: Defines a static rotation along the Z, Y, and X axes (Since: 1.10) _EULER_ORDER_SZYZ: Defines a static rotation along the Z, Y, and Z axes (Since: 1.10) _EULER_ORDER_RZYX: Defines a relative rotation along the Z, Y, and X axes (Since: 1.10) _EULER_ORDER_RXYX: Defines a relative rotation along the X, Y, and X axes (Since: 1.10) _EULER_ORDER_RYZX: Defines a relative rotation along the Y, Z, and X axes (Since: 1.10) _EULER_ORDER_RXZX: Defines a relative rotation along the X, Z, and X axes (Since: 1.10) _EULER_ORDER_RXZY: Defines a relative rotation along the X, Z, and Y axes (Since: 1.10) _EULER_ORDER_RYZY: Defines a relative rotation along the Y, Z, and Y axes (Since: 1.10) _EULER_ORDER_RZXY: Defines a relative rotation along the Z, X, and Y axes (Since: 1.10) _EULER_ORDER_RYXY: Defines a relative rotation along the Y, X, and Y axes (Since: 1.10) _EULER_ORDER_RYXZ: Defines a relative rotation along the Y, X, and Z axes (Since: 1.10) _EULER_ORDER_RZXZ: Defines a relative rotation along the Z, X, and Z axes (Since: 1.10) _EULER_ORDER_RXYZ: Defines a relative rotation along the X, Y, and Z axes (Since: 1.10) _EULER_ORDER_RZYZ: Defines a relative rotation along the Z, Y, and Z axes (Since: 1.10)
*/
opaque type graphene_euler_order_t = CInt
object graphene_euler_order_t extends _BindgenEnumCInt[graphene_euler_order_t]:
  given _tag: Tag[graphene_euler_order_t] = Tag.Int
  inline def define(inline a: CInt): graphene_euler_order_t = a
  val GRAPHENE_EULER_ORDER_DEFAULT = define(-1)
  val GRAPHENE_EULER_ORDER_XYZ = define(0)
  val GRAPHENE_EULER_ORDER_YZX = define(1)
  val GRAPHENE_EULER_ORDER_ZXY = define(2)
  val GRAPHENE_EULER_ORDER_XZY = define(3)
  val GRAPHENE_EULER_ORDER_YXZ = define(4)
  val GRAPHENE_EULER_ORDER_ZYX = define(5)
  val GRAPHENE_EULER_ORDER_SXYZ = define(6)
  val GRAPHENE_EULER_ORDER_SXYX = define(7)
  val GRAPHENE_EULER_ORDER_SXZY = define(8)
  val GRAPHENE_EULER_ORDER_SXZX = define(9)
  val GRAPHENE_EULER_ORDER_SYZX = define(10)
  val GRAPHENE_EULER_ORDER_SYZY = define(11)
  val GRAPHENE_EULER_ORDER_SYXZ = define(12)
  val GRAPHENE_EULER_ORDER_SYXY = define(13)
  val GRAPHENE_EULER_ORDER_SZXY = define(14)
  val GRAPHENE_EULER_ORDER_SZXZ = define(15)
  val GRAPHENE_EULER_ORDER_SZYX = define(16)
  val GRAPHENE_EULER_ORDER_SZYZ = define(17)
  val GRAPHENE_EULER_ORDER_RZYX = define(18)
  val GRAPHENE_EULER_ORDER_RXYX = define(19)
  val GRAPHENE_EULER_ORDER_RYZX = define(20)
  val GRAPHENE_EULER_ORDER_RXZX = define(21)
  val GRAPHENE_EULER_ORDER_RXZY = define(22)
  val GRAPHENE_EULER_ORDER_RYZY = define(23)
  val GRAPHENE_EULER_ORDER_RZXY = define(24)
  val GRAPHENE_EULER_ORDER_RYXY = define(25)
  val GRAPHENE_EULER_ORDER_RYXZ = define(26)
  val GRAPHENE_EULER_ORDER_RZXZ = define(27)
  val GRAPHENE_EULER_ORDER_RXYZ = define(28)
  val GRAPHENE_EULER_ORDER_RZYZ = define(29)
  def getName(value: graphene_euler_order_t): Option[String] =
    value match
      case `GRAPHENE_EULER_ORDER_DEFAULT` => Some("GRAPHENE_EULER_ORDER_DEFAULT")
      case `GRAPHENE_EULER_ORDER_XYZ` => Some("GRAPHENE_EULER_ORDER_XYZ")
      case `GRAPHENE_EULER_ORDER_YZX` => Some("GRAPHENE_EULER_ORDER_YZX")
      case `GRAPHENE_EULER_ORDER_ZXY` => Some("GRAPHENE_EULER_ORDER_ZXY")
      case `GRAPHENE_EULER_ORDER_XZY` => Some("GRAPHENE_EULER_ORDER_XZY")
      case `GRAPHENE_EULER_ORDER_YXZ` => Some("GRAPHENE_EULER_ORDER_YXZ")
      case `GRAPHENE_EULER_ORDER_ZYX` => Some("GRAPHENE_EULER_ORDER_ZYX")
      case `GRAPHENE_EULER_ORDER_SXYZ` => Some("GRAPHENE_EULER_ORDER_SXYZ")
      case `GRAPHENE_EULER_ORDER_SXYX` => Some("GRAPHENE_EULER_ORDER_SXYX")
      case `GRAPHENE_EULER_ORDER_SXZY` => Some("GRAPHENE_EULER_ORDER_SXZY")
      case `GRAPHENE_EULER_ORDER_SXZX` => Some("GRAPHENE_EULER_ORDER_SXZX")
      case `GRAPHENE_EULER_ORDER_SYZX` => Some("GRAPHENE_EULER_ORDER_SYZX")
      case `GRAPHENE_EULER_ORDER_SYZY` => Some("GRAPHENE_EULER_ORDER_SYZY")
      case `GRAPHENE_EULER_ORDER_SYXZ` => Some("GRAPHENE_EULER_ORDER_SYXZ")
      case `GRAPHENE_EULER_ORDER_SYXY` => Some("GRAPHENE_EULER_ORDER_SYXY")
      case `GRAPHENE_EULER_ORDER_SZXY` => Some("GRAPHENE_EULER_ORDER_SZXY")
      case `GRAPHENE_EULER_ORDER_SZXZ` => Some("GRAPHENE_EULER_ORDER_SZXZ")
      case `GRAPHENE_EULER_ORDER_SZYX` => Some("GRAPHENE_EULER_ORDER_SZYX")
      case `GRAPHENE_EULER_ORDER_SZYZ` => Some("GRAPHENE_EULER_ORDER_SZYZ")
      case `GRAPHENE_EULER_ORDER_RZYX` => Some("GRAPHENE_EULER_ORDER_RZYX")
      case `GRAPHENE_EULER_ORDER_RXYX` => Some("GRAPHENE_EULER_ORDER_RXYX")
      case `GRAPHENE_EULER_ORDER_RYZX` => Some("GRAPHENE_EULER_ORDER_RYZX")
      case `GRAPHENE_EULER_ORDER_RXZX` => Some("GRAPHENE_EULER_ORDER_RXZX")
      case `GRAPHENE_EULER_ORDER_RXZY` => Some("GRAPHENE_EULER_ORDER_RXZY")
      case `GRAPHENE_EULER_ORDER_RYZY` => Some("GRAPHENE_EULER_ORDER_RYZY")
      case `GRAPHENE_EULER_ORDER_RZXY` => Some("GRAPHENE_EULER_ORDER_RZXY")
      case `GRAPHENE_EULER_ORDER_RYXY` => Some("GRAPHENE_EULER_ORDER_RYXY")
      case `GRAPHENE_EULER_ORDER_RYXZ` => Some("GRAPHENE_EULER_ORDER_RYXZ")
      case `GRAPHENE_EULER_ORDER_RZXZ` => Some("GRAPHENE_EULER_ORDER_RZXZ")
      case `GRAPHENE_EULER_ORDER_RXYZ` => Some("GRAPHENE_EULER_ORDER_RXYZ")
      case `GRAPHENE_EULER_ORDER_RZYZ` => Some("GRAPHENE_EULER_ORDER_RZYZ")
      case _ => _root_.scala.None
  extension (a: graphene_euler_order_t)
    inline def &(b: graphene_euler_order_t): graphene_euler_order_t = a & b
    inline def |(b: graphene_euler_order_t): graphene_euler_order_t = a | b
    inline def is(b: graphene_euler_order_t): Boolean = (a & b) == b
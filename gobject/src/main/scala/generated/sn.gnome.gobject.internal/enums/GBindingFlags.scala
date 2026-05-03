package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBindingFlags: _BINDING_DEFAULT: The default binding; if the source property changes, the target property is updated with its value. _BINDING_BIDIRECTIONAL: Bidirectional binding; if either the property of the source or the property of the target changes, the other is updated. _BINDING_SYNC_CREATE: Synchronize the values of the source and target properties when creating the binding; the direction of the synchronization is always from the source to the target. _BINDING_INVERT_BOOLEAN: If the two properties being bound are booleans, setting one to %TRUE will result in the other being set to %FALSE and vice versa. This flag will only work for boolean properties, and cannot be used when passing custom transformation functions to g_object_bind_property_full().
*/
opaque type GBindingFlags = CUnsignedInt
object GBindingFlags extends _BindgenEnumCUnsignedInt[GBindingFlags]:
  given _tag: Tag[GBindingFlags] = Tag.UInt
  inline def define(inline a: Long): GBindingFlags = a.toUInt
  val G_BINDING_DEFAULT = define(0)
  val G_BINDING_BIDIRECTIONAL = define(1)
  val G_BINDING_SYNC_CREATE = define(2)
  val G_BINDING_INVERT_BOOLEAN = define(4)
  def getName(value: GBindingFlags): Option[String] =
    value match
      case `G_BINDING_DEFAULT` => Some("G_BINDING_DEFAULT")
      case `G_BINDING_BIDIRECTIONAL` => Some("G_BINDING_BIDIRECTIONAL")
      case `G_BINDING_SYNC_CREATE` => Some("G_BINDING_SYNC_CREATE")
      case `G_BINDING_INVERT_BOOLEAN` => Some("G_BINDING_INVERT_BOOLEAN")
      case _ => _root_.scala.None
  extension (a: GBindingFlags)
    inline def &(b: GBindingFlags): GBindingFlags = a & b
    inline def |(b: GBindingFlags): GBindingFlags = a | b
    inline def is(b: GBindingFlags): Boolean = (a & b) == b
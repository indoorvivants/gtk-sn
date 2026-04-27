package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPolicyType: _POLICY_ALWAYS: The scrollbar is always visible. The view size is independent of the content. _POLICY_AUTOMATIC: The scrollbar will appear and disappear as necessary. For example, when all of a `GtkTreeView` can not be seen. _POLICY_NEVER: The scrollbar should never appear. In this mode the content determines the size. _POLICY_EXTERNAL: Don't show a scrollbar, but don't force the size to follow the content. This can be used e.g. to make multiple scrolled windows share a scrollbar.
*/
opaque type GtkPolicyType = CUnsignedInt
object GtkPolicyType extends _BindgenEnumCUnsignedInt[GtkPolicyType]:
  given _tag: Tag[GtkPolicyType] = Tag.UInt
  inline def define(inline a: Long): GtkPolicyType = a.toUInt
  val GTK_POLICY_ALWAYS = define(0)
  val GTK_POLICY_AUTOMATIC = define(1)
  val GTK_POLICY_NEVER = define(2)
  val GTK_POLICY_EXTERNAL = define(3)
  def getName(value: GtkPolicyType): Option[String] =
    value match
      case `GTK_POLICY_ALWAYS` => Some("GTK_POLICY_ALWAYS")
      case `GTK_POLICY_AUTOMATIC` => Some("GTK_POLICY_AUTOMATIC")
      case `GTK_POLICY_NEVER` => Some("GTK_POLICY_NEVER")
      case `GTK_POLICY_EXTERNAL` => Some("GTK_POLICY_EXTERNAL")
      case _ => _root_.scala.None
  extension (a: GtkPolicyType)
    inline def &(b: GtkPolicyType): GtkPolicyType = a & b
    inline def |(b: GtkPolicyType): GtkPolicyType = a | b
    inline def is(b: GtkPolicyType): Boolean = (a & b) == b
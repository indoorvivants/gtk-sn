package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileCreateFlags: _FILE_CREATE_NONE: No flags set. _FILE_CREATE_PRIVATE: Create a file that can only be accessed by the current user. _FILE_CREATE_REPLACE_DESTINATION: Replace the destination as if it didn't exist before. Don't try to keep any old permissions, replace instead of following links. This is generally useful if you're doing a "copy over" rather than a "save new version of" replace operation. You can think of it as "unlink destination" before writing to it, although the implementation may not be exactly like that. This flag can only be used with g_file_replace() and its variants, including g_file_replace_contents(). Since 2.20
*/
opaque type GFileCreateFlags = CUnsignedInt
object GFileCreateFlags extends _BindgenEnumCUnsignedInt[GFileCreateFlags]:
  given _tag: Tag[GFileCreateFlags] = Tag.UInt
  inline def define(inline a: Long): GFileCreateFlags = a.toUInt
  val G_FILE_CREATE_NONE = define(0)
  val G_FILE_CREATE_PRIVATE = define(1)
  val G_FILE_CREATE_REPLACE_DESTINATION = define(2)
  def getName(value: GFileCreateFlags): Option[String] =
    value match
      case `G_FILE_CREATE_NONE` => Some("G_FILE_CREATE_NONE")
      case `G_FILE_CREATE_PRIVATE` => Some("G_FILE_CREATE_PRIVATE")
      case `G_FILE_CREATE_REPLACE_DESTINATION` => Some("G_FILE_CREATE_REPLACE_DESTINATION")
      case _ => _root_.scala.None
  extension (a: GFileCreateFlags)
    inline def &(b: GFileCreateFlags): GFileCreateFlags = a & b
    inline def |(b: GFileCreateFlags): GFileCreateFlags = a | b
    inline def is(b: GFileCreateFlags): Boolean = (a & b) == b
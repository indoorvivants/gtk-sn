package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUserDirectory: _USER_DIRECTORY_DESKTOP: the user's Desktop directory _USER_DIRECTORY_DOCUMENTS: the user's Documents directory _USER_DIRECTORY_DOWNLOAD: the user's Downloads directory _USER_DIRECTORY_MUSIC: the user's Music directory _USER_DIRECTORY_PICTURES: the user's Pictures directory _USER_DIRECTORY_PUBLIC_SHARE: the user's shared directory _USER_DIRECTORY_TEMPLATES: the user's Templates directory _USER_DIRECTORY_VIDEOS: the user's Movies directory _USER_N_DIRECTORIES: the number of enum values
*/
opaque type GUserDirectory = CUnsignedInt
object GUserDirectory extends _BindgenEnumCUnsignedInt[GUserDirectory]:
  given _tag: Tag[GUserDirectory] = Tag.UInt
  inline def define(inline a: Long): GUserDirectory = a.toUInt
  val G_USER_DIRECTORY_DESKTOP = define(0)
  val G_USER_DIRECTORY_DOCUMENTS = define(1)
  val G_USER_DIRECTORY_DOWNLOAD = define(2)
  val G_USER_DIRECTORY_MUSIC = define(3)
  val G_USER_DIRECTORY_PICTURES = define(4)
  val G_USER_DIRECTORY_PUBLIC_SHARE = define(5)
  val G_USER_DIRECTORY_TEMPLATES = define(6)
  val G_USER_DIRECTORY_VIDEOS = define(7)
  val G_USER_N_DIRECTORIES = define(8)
  def getName(value: GUserDirectory): Option[String] =
    value match
      case `G_USER_DIRECTORY_DESKTOP` => Some("G_USER_DIRECTORY_DESKTOP")
      case `G_USER_DIRECTORY_DOCUMENTS` => Some("G_USER_DIRECTORY_DOCUMENTS")
      case `G_USER_DIRECTORY_DOWNLOAD` => Some("G_USER_DIRECTORY_DOWNLOAD")
      case `G_USER_DIRECTORY_MUSIC` => Some("G_USER_DIRECTORY_MUSIC")
      case `G_USER_DIRECTORY_PICTURES` => Some("G_USER_DIRECTORY_PICTURES")
      case `G_USER_DIRECTORY_PUBLIC_SHARE` => Some("G_USER_DIRECTORY_PUBLIC_SHARE")
      case `G_USER_DIRECTORY_TEMPLATES` => Some("G_USER_DIRECTORY_TEMPLATES")
      case `G_USER_DIRECTORY_VIDEOS` => Some("G_USER_DIRECTORY_VIDEOS")
      case `G_USER_N_DIRECTORIES` => Some("G_USER_N_DIRECTORIES")
      case _ => _root_.scala.None
  extension (a: GUserDirectory)
    inline def &(b: GUserDirectory): GUserDirectory = a & b
    inline def |(b: GUserDirectory): GUserDirectory = a | b
    inline def is(b: GUserDirectory): Boolean = (a & b) == b
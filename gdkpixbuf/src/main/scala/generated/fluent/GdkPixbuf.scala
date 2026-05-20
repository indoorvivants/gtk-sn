package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

object GdkPixbuf:
  @annotation.compileTimeOnly(
    "[pixbuf_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def pixbufErrorQuark() = ???

  /** Major version of gdk-pixbuf library, that is the "0" in "0.8.2" for
    * example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PIXBUF_MAJOR: Int = 2

  /** Micro version of gdk-pixbuf library, that is the "2" in "0.8.2" for
    * example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PIXBUF_MICRO: Int = 11

  /** Minor version of gdk-pixbuf library, that is the "8" in "0.8.2" for
    * example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PIXBUF_MINOR: Int = 42

  /** Contains the full version of GdkPixbuf as a string.
    *
    * This is the version being compiled against; contrast with
    * `gdk_pixbuf_version`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PIXBUF_VERSION: scala.Predef.String = "2.42.11"
end GdkPixbuf

package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkGLAPI

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The list of the different APIs that GdkGLContext can potentially support.
  */
class GLAPI private (val raw: GdkGLAPI):
  def is(kv: GLAPI): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[GLAPI.KnownValue]
    GLAPI.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"GLAPI(${sb.result().mkString(", ")})"
end GLAPI

object GLAPI:
  export KnownValue.*

  def fromRaw(raw: GdkGLAPI) = new GLAPI(raw)

  extension (af: GLAPI)
    def &(other: GLAPI) =
      GLAPI(af.raw & other.raw)
    def |(other: GLAPI) =
      GLAPI(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The list of the different APIs that GdkGLContext can potentially support.
    */
  enum KnownValue(override val raw: GdkGLAPI, name: String) extends GLAPI(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The OpenGL API
      */
    case GL extends KnownValue(GdkGLAPI.GDK_GL_API_GL, "GL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The OpenGL ES API
      */
    case GLES extends KnownValue(GdkGLAPI.GDK_GL_API_GLES, "GLES")
  end KnownValue
end GLAPI

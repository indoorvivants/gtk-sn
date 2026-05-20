package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGLAreaClass

/** The `GtkGLAreaClass` structure contains only private data.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GLAreaClass private[gnome] (raw: Ptr[GtkGLAreaClass]):

  def getUnsafeRawPointer(): Ptr[GtkGLAreaClass] = this.raw

  @annotation.compileTimeOnly("[field render]: Field is missing <type>")
  private def render__ = ???
  @annotation.compileTimeOnly("[field resize]: Field is missing <type>")
  private def resize__ = ???
  @annotation.compileTimeOnly("[field create_context]: Field is missing <type>")
  private def createContext__ = ???

end GLAreaClass

object GLAreaClass:
  def fromRaw(ptr: Ptr[GtkGLAreaClass]): GLAreaClass = new GLAreaClass(ptr)
end GLAreaClass

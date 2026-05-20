package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkBuilderScopeInterface

/** The virtual function table to implement for `GtkBuilderScope`
  * implementations. Default implementations for each function do exist, but
  * they usually just fail, so it is suggested that implementations implement
  * all of them.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BuilderScopeInterface private[gnome] (raw: Ptr[GtkBuilderScopeInterface]):

  def getUnsafeRawPointer(): Ptr[GtkBuilderScopeInterface] = this.raw

  @annotation.compileTimeOnly(
    "[field get_type_from_name]: Field is missing <type>"
  )
  private def getTypeFromName__ = ???
  @annotation.compileTimeOnly(
    "[field get_type_from_function]: Field is missing <type>"
  )
  private def getTypeFromFunction__ = ???
  @annotation.compileTimeOnly("[field create_closure]: Field is missing <type>")
  private def createClosure__ = ???
end BuilderScopeInterface

object BuilderScopeInterface:
  def fromRaw(ptr: Ptr[GtkBuilderScopeInterface]): BuilderScopeInterface =
    new BuilderScopeInterface(ptr)
end BuilderScopeInterface

package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GSourceCallbackFuncs

/** The `GSourceCallbackFuncs` struct contains functions for managing callback
  * objects.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SourceCallbackFuncs private[gnome] (raw: Ptr[GSourceCallbackFuncs]):

  def getUnsafeRawPointer(): Ptr[GSourceCallbackFuncs] = this.raw
  @annotation.compileTimeOnly("[field ref]: Field is missing <type>")
  private def ref__ = ???
  @annotation.compileTimeOnly("[field unref]: Field is missing <type>")
  private def unref__ = ???
  @annotation.compileTimeOnly("[field get]: Field is missing <type>")
  private def get__ = ???
end SourceCallbackFuncs

object SourceCallbackFuncs:
  def fromRaw(ptr: Ptr[GSourceCallbackFuncs]): SourceCallbackFuncs =
    new SourceCallbackFuncs(ptr)
end SourceCallbackFuncs

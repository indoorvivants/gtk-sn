package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GMemVTable

/** A set of functions used to perform memory allocation. The same #GMemVTable
  * must be used for all allocations in the same program; a call to
  * g_mem_set_vtable(), if it exists, should be prior to any use of GLib.
  *
  * This functions related to this has been deprecated in 2.46, and no longer
  * work.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MemVTable private[gnome] (raw: Ptr[GMemVTable]):

  def getUnsafeRawPointer(): Ptr[GMemVTable] = this.raw
  @annotation.compileTimeOnly("[field malloc]: Field is missing <type>")
  private def malloc__ = ???
  @annotation.compileTimeOnly("[field realloc]: Field is missing <type>")
  private def realloc__ = ???
  @annotation.compileTimeOnly("[field free]: Field is missing <type>")
  private def free__ = ???
  @annotation.compileTimeOnly("[field calloc]: Field is missing <type>")
  private def calloc__ = ???
  @annotation.compileTimeOnly("[field try_malloc]: Field is missing <type>")
  private def tryMalloc__ = ???
  @annotation.compileTimeOnly("[field try_realloc]: Field is missing <type>")
  private def tryRealloc__ = ???
end MemVTable

object MemVTable:
  def fromRaw(ptr: Ptr[GMemVTable]): MemVTable = new MemVTable(ptr)
end MemVTable

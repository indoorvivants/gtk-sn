package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.StrvBuilder
import sn.gnome.glib.internal.GStrvBuilder
import sn.gnome.runtime.*

/**  #GStrvBuilder is a method of easily building dynamically sized
  *  NULL-terminated string arrays.
  *
  *  The following example shows how to build a two element array:
  *
  *  |[<!-- language="C" -->
  *    g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
  *    g_strv_builder_add (builder, "hello");
  *    g_strv_builder_add (builder, "world");
  *    g_auto(GStrv) array = g_strv_builder_end (builder);
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class StrvBuilder private[gnome] (raw: Ptr[GStrvBuilder]):

  def getUnsafeRawPointer(): Ptr[GStrvBuilder] = this.raw

  /** Add a string to the end of the array.
    *
    * Since 2.68
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def add(
      value: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    g_strv_builder_add(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GStrvBuilder]],
      toCString(value)
    )
  end add

  /** Appends all the given strings to the builder.
    *
    * Since 2.70
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_many/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def addMany__ = ???

  /** Appends all the strings in the given vector to the builder.
    *
    * Since 2.70
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addv(
      value: scala.Array[scala.Predef.String] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ =
    g_strv_builder_addv(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GStrvBuilder]],
      MemoryWrite.nullTerminatedStringArray(value)
    )
  end addv

  /** Ends the builder process and returns the constructed NULL-terminated
    * string array. The returned value should be freed with g_strfreev() when no
    * longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method end/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(GStrv)))"
  )
  private def end__ = ???

  /** Atomically increments the reference count of @builder by one. This
    * function is thread-safe and may be called from any thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.StrvBuilder /* None */ =
    sn.gnome.glib.StrvBuilder.fromRaw(
      g_strv_builder_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GStrvBuilder]]
      )
    )
  end ref

  /** Decreases the reference count on @builder.
    *
    * In the event that there are no more references, releases all memory
    * associated with the #GStrvBuilder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_strv_builder_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GStrvBuilder]]
    )
  end unref

end StrvBuilder

object StrvBuilder:
  def fromRaw(ptr: Ptr[GStrvBuilder]): StrvBuilder = new StrvBuilder(ptr)
end StrvBuilder

package sn.gnome.codegentests

import _root_.sn.gnome.codegentests.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.codegentests.Renderable
import sn.gnome.codegentests.internal.GImpl
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

class Impl private[gnome] (raw: Ptr[GImpl]) extends Renderable:

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCount(): Int /* None */ =
    test_get_count(this.getUnsafeRawPointer().asInstanceOf[Ptr[GImpl]])
  end getCount

  def getFlags()(using Zone): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        test_get_flags(this.getUnsafeRawPointer().asInstanceOf[Ptr[GImpl]])
      )
      .map(fromCString(_))
  end getFlags

  def getTitle()(using Zone): String /* None */ =
    fromCString(
      test_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GImpl]]
      ).asInstanceOf
    )
  end getTitle

  def setOptions(
      count: Int /* Some(CInt) */,
      title: String /* Some(CString) */,
      flags: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ =
    test_set_options(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GImpl]],
      count,
      toCString(title),
      MemoryWrite.nullTerminatedStringArray(flags)
    )
  end setOptions

  def sqrtCount(): GResult[Int /* None */ ] =
    GResult.wrap(__errorPtr =>
      test_sqrt_count(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GImpl]],
        __errorPtr
      )
    )
  end sqrtCount

end Impl

object Impl:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GImpl])(using Runtime) = summon[Runtime]
    .getOrCreate[Impl](ptr.asInstanceOf[Ptr[Byte]], p => new Impl(ptr))

  /** Creates a new `Impl`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Impl =
    val raw: Ptr[Byte] = test_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Impl](raw, r => Impl.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `Impl` with a count (has to be non-negative).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withCount(count: Int /* Some(_root_.sn.gnome.glib.internal.gint) */ )(
      using Runtime
  ): GResult[Impl] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] =
        test_new_from_count(gint(count), __errorPtr).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Impl](raw, r => Impl.applyUnsafe(r.asInstanceOf))

  end withCount

  /** Creates a new `Impl` with a title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withTitle(title: String /* Some(CString) */ )(using Zone, Runtime): Impl =
    val raw: Ptr[Byte] = test_new_from_string(toCString(title)).asInstanceOf
    summon[Runtime]
      .getOrCreate[Impl](raw, r => Impl.applyUnsafe(r.asInstanceOf))
  end withTitle

  /** Adds a prefix to every string in a list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPrefix(
      prefix: String /* Some(CString) */,
      strings: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Array[String] /* Some(Ptr[CString]) */ = MemoryRead
    .nullTerminatedPointerArray(
      test_concat_title(
        toCString(prefix),
        MemoryWrite.nullTerminatedStringArray(strings)
      )
    )
    .map(fromCString(_))

end Impl

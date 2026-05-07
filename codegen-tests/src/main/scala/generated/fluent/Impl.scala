package sn.gnome.codegentests.fluent

import _root_.sn.gnome.codegentests.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.codegentests.internal.GImpl
import sn.gnome.runtime.*

/** NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Impl(raw: Ptr[GImpl]):

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCount(): Int /* None */ = test_get_count(
    this.raw.asInstanceOf[Ptr[GImpl]]
  )

  def getTitle()(using Zone): String /* None */ = fromCString(
    test_get_title(this.raw.asInstanceOf[Ptr[GImpl]]).asInstanceOf
  )

  def getFlags()(using Zone): Array[String] /* None */ = MemoryRead
    .nullTerminatedPointerArray(
      test_get_flags(this.raw.asInstanceOf[Ptr[GImpl]])
    )
    .map(fromCString(_))

  def setOptions(
      count: Int /* Some(CInt) */,
      title: String | CString /* Some(CString) */,
      flags: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ = test_set_options(
    this.raw.asInstanceOf[Ptr[GImpl]],
    count,
    __sn_extract_string(title),
    MemoryWrite.nullTerminatedStringArray(flags)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Impl

object Impl:
  /** Creates a new `Impl`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): Impl = new Impl(test_new().asInstanceOf)

  /** Creates a new `Impl` with a title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Impl = new Impl(
    test_new_from_string(__sn_extract_string(title)).asInstanceOf
  )

  /** Adds a prefix to every string in a list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPrefix(
      prefix: String | CString /* Some(CString) */,
      strings: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Array[String] /* Some(Ptr[CString]) */ = MemoryRead
    .nullTerminatedPointerArray(
      test_concat_title(
        __sn_extract_string(prefix),
        MemoryWrite.nullTerminatedStringArray(strings)
      )
    )
    .map(fromCString(_))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Impl

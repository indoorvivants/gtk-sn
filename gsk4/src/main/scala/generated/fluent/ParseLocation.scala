package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.gsk4.internal.GskParseLocation

/** A location in a parse buffer.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParseLocation private[gnome] (raw: Ptr[GskParseLocation]):

  def getUnsafeRawPointer(): Ptr[GskParseLocation] = this.raw

  /** the offset of the location in the parse buffer, as bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bytes: CUnsignedLongInt /* None */ =
    (!raw).bytes.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** the offset of the location in the parse buffer, as bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bytes_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).bytes_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )

  /** the offset of the location in the parse buffer, as characters
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def chars: CUnsignedLongInt /* None */ =
    (!raw).chars.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** the offset of the location in the parse buffer, as characters
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def chars_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).chars_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )

  /** the line of the location in the parse buffer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lines: CUnsignedLongInt /* None */ =
    (!raw).lines.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** the line of the location in the parse buffer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lines_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).lines_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )

  /** the position in the line, as bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lineBytes: CUnsignedLongInt /* None */ =
    (!raw).line_bytes.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** the position in the line, as bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lineBytes_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).line_bytes_=(
      gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
    )

  /** the position in the line, as characters
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lineChars: CUnsignedLongInt /* None */ =
    (!raw).line_chars.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** the position in the line, as characters
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lineChars_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).line_chars_=(
      gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
    )
end ParseLocation

object ParseLocation:
  def fromRaw(ptr: Ptr[GskParseLocation]): ParseLocation = new ParseLocation(
    ptr
  )
end ParseLocation

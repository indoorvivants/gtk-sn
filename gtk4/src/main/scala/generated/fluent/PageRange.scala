package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkPageRange

/** A range of pages to print.
  *
  * See also [method@Gtk.PrintSettings.set_page_ranges].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PageRange private[gnome] (raw: Ptr[GtkPageRange]):

  def getUnsafeRawPointer(): Ptr[GtkPageRange] = this.raw

  /** start of page range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def start: Int /* None */ = (!raw).start.asInstanceOf[CInt]

  /** start of page range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def start_=(value: Int /* None */ ): Unit =
    (!raw).start_=(value.asInstanceOf[CInt])

  /** end of page range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def end: Int /* None */ = (!raw).end.asInstanceOf[CInt]

  /** end of page range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def end_=(value: Int /* None */ ): Unit =
    (!raw).end_=(value.asInstanceOf[CInt])
end PageRange

object PageRange:
  def fromRaw(ptr: Ptr[GtkPageRange]): PageRange = new PageRange(ptr)
end PageRange

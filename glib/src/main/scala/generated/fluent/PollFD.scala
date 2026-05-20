package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GPollFD, gint}

/** Represents a file descriptor, which events to poll for, and which events
  * occurred.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PollFD private[gnome] (raw: Ptr[GPollFD]):

  def getUnsafeRawPointer(): Ptr[GPollFD] = this.raw

  /** the file descriptor to poll (or a HANDLE on Win32)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fd: Int /* None */ = (!raw).fd.asInstanceOf[gint]

  /** the file descriptor to poll (or a HANDLE on Win32)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fd_=(value: Int /* None */ ): Unit =
    (!raw).fd_=(gint(value).asInstanceOf[gint])

  /** a bitwise combination from #GIOCondition, specifying which events should
    * be polled for. Typically for reading from a file descriptor you would use
    * %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and for writing you would use %G_IO_OUT |
    * %G_IO_ERR.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field events]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gushort), @type -> DataRecord(gushort)))"
  )
  private def events__ = ???

  /** a bitwise combination of flags from #GIOCondition, returned from the
    * poll() function to indicate which events occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field revents]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gushort), @type -> DataRecord(gushort)))"
  )
  private def revents__ = ???
end PollFD

object PollFD:
  def fromRaw(ptr: Ptr[GPollFD]): PollFD = new PollFD(ptr)
end PollFD

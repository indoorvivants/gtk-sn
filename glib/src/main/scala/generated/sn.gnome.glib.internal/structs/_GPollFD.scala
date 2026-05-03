package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollFD: : the file descriptor to poll (or a HANDLE on Win32) : a bitwise combination from #GIOCondition, specifying which events should be polled for. Typically for reading from a file descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and for writing you would use %G_IO_OUT | %G_IO_ERR. : a bitwise combination of flags from #GIOCondition, returned from the poll() function to indicate which events occurred.
*/
opaque type _GPollFD = CStruct3[gint, gushort, gushort]

object _GPollFD:
  given _tag: Tag[_GPollFD] = Tag.materializeCStruct3Tag[gint, gushort, gushort]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPollFD)
      inline def fd : gint = struct._1
      inline def fd_=(value: gint): Unit = (!struct.at1 = value)
      inline def events : gushort = struct._2
      inline def events_=(value: gushort): Unit = (!struct.at2 = value)
      inline def revents : gushort = struct._3
      inline def revents_=(value: gushort): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GPollFD on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPollFD] = scala.scalanative.unsafe.alloc[_GPollFD](1)
  def apply(fd : gint, events : gushort, revents : gushort)(using Zone): Ptr[_GPollFD] =
    val ____ptr = apply()
    (!____ptr).fd = fd
    (!____ptr).events = events
    (!____ptr).revents = revents
    ____ptr
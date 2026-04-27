package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollFD: : the file descriptor to poll (or a HANDLE on Win32) : a bitwise combination from #GIOCondition, specifying which events should be polled for. Typically for reading from a file descriptor you would use %G_IO_IN | %G_IO_HUP | %G_IO_ERR, and for writing you would use %G_IO_OUT | %G_IO_ERR. : a bitwise combination of flags from #GIOCondition, returned from the poll() function to indicate which events occurred.
*/
opaque type GPollFD = CStruct3[_root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gushort, _root_.sn.gnome.glib.internal.gushort]

object GPollFD:
  given _tag: Tag[GPollFD] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gushort, _root_.sn.gnome.glib.internal.gushort]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GPollFD)
      inline def fd : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def fd_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def events : _root_.sn.gnome.glib.internal.gushort = struct._2
      inline def events_=(value: _root_.sn.gnome.glib.internal.gushort): Unit = (!struct.at2 = value)
      inline def revents : _root_.sn.gnome.glib.internal.gushort = struct._3
      inline def revents_=(value: _root_.sn.gnome.glib.internal.gushort): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GPollFD on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GPollFD] = scala.scalanative.unsafe.alloc[GPollFD](1)
  def apply(fd : _root_.sn.gnome.glib.internal.gint, events : _root_.sn.gnome.glib.internal.gushort, revents : _root_.sn.gnome.glib.internal.gushort)(using Zone): Ptr[GPollFD] =
    val ____ptr = apply()
    (!____ptr).fd = fd
    (!____ptr).events = events
    (!____ptr).revents = revents
    ____ptr
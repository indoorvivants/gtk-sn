package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GUnixCredentialsMessage = CStruct2[GSocketControlMessage, Ptr[GUnixCredentialsMessagePrivate]]

object _GUnixCredentialsMessage:
  given _tag: Tag[_GUnixCredentialsMessage] = Tag.materializeCStruct2Tag[GSocketControlMessage, Ptr[GUnixCredentialsMessagePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GUnixCredentialsMessage)
      inline def parent_instance : GSocketControlMessage = struct._1
      inline def parent_instance_=(value: GSocketControlMessage): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GUnixCredentialsMessagePrivate] = struct._2
      inline def priv_=(value: Ptr[GUnixCredentialsMessagePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GUnixCredentialsMessage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GUnixCredentialsMessage] = scala.scalanative.unsafe.alloc[_GUnixCredentialsMessage](1)
  def apply(parent_instance : GSocketControlMessage, priv : Ptr[GUnixCredentialsMessagePrivate])(using Zone): Ptr[_GUnixCredentialsMessage] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr
package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GError = CStruct3[GQuark, gint, Ptr[gchar]]

object GError:
  given _tag: Tag[GError] = Tag.materializeCStruct3Tag[GQuark, gint, Ptr[gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GError)
      inline def domain : GQuark = struct._1
      inline def domain_=(value: GQuark): Unit = (!struct.at1 = value)
      inline def code : gint = struct._2
      inline def code_=(value: gint): Unit = (!struct.at2 = value)
      inline def message : Ptr[gchar] = struct._3
      inline def message_=(value: Ptr[gchar]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GError on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GError] = scala.scalanative.unsafe.alloc[GError](1)
  def apply(domain : GQuark, code : gint, message : Ptr[gchar])(using Zone): Ptr[GError] =
    val ____ptr = apply()
    (!____ptr).domain = domain
    (!____ptr).code = code
    (!____ptr).message = message
    ____ptr
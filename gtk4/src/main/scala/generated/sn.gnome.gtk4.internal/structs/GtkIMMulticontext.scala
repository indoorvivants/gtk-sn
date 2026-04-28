package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIMMulticontext = CStruct2[GtkIMContext, Ptr[GtkIMMulticontextPrivate]]

object GtkIMMulticontext:
  given _tag: Tag[GtkIMMulticontext] = Tag.materializeCStruct2Tag[GtkIMContext, Ptr[GtkIMMulticontextPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkIMMulticontext)
      inline def `object` : GtkIMContext = struct._1
      inline def object_=(value: GtkIMContext): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkIMMulticontextPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkIMMulticontextPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkIMMulticontext on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkIMMulticontext] = scala.scalanative.unsafe.alloc[GtkIMMulticontext](1)
  def apply(`object` : GtkIMContext, priv : Ptr[GtkIMMulticontextPrivate])(using Zone): Ptr[GtkIMMulticontext] =
    val ____ptr = apply()
    (!____ptr).`object` = `object`
    (!____ptr).priv = priv
    ____ptr
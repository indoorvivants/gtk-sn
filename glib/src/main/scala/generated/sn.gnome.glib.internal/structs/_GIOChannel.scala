package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GIOChannel = CStruct20[gint, Ptr[Byte], Ptr[gchar], GIConv, GIConv, Ptr[gchar], guint, gsize, Ptr[GString], Ptr[GString], Ptr[GString], CArray[gchar, Nat._6], guint, guint, guint, guint, guint, guint, gpointer, gpointer]

object _GIOChannel:
  given _tag: Tag[_GIOChannel] = Tag.materializeCStruct20Tag[gint, Ptr[Byte], Ptr[gchar], GIConv, GIConv, Ptr[gchar], guint, gsize, Ptr[GString], Ptr[GString], Ptr[GString], CArray[gchar, Nat._6], guint, guint, guint, guint, guint, guint, gpointer, gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GIOChannel)
      inline def ref_count : gint = struct._1
      inline def ref_count_=(value: gint): Unit = (!struct.at1 = value)
      inline def funcs : Ptr[GIOFuncs] = struct._2.asInstanceOf[Ptr[GIOFuncs]]
      inline def funcs_=(value: Ptr[GIOFuncs]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def encoding : Ptr[gchar] = struct._3
      inline def encoding_=(value: Ptr[gchar]): Unit = (!struct.at3 = value)
      inline def read_cd : GIConv = struct._4
      inline def read_cd_=(value: GIConv): Unit = (!struct.at4 = value)
      inline def write_cd : GIConv = struct._5
      inline def write_cd_=(value: GIConv): Unit = (!struct.at5 = value)
      inline def line_term : Ptr[gchar] = struct._6
      inline def line_term_=(value: Ptr[gchar]): Unit = (!struct.at6 = value)
      inline def line_term_len : guint = struct._7
      inline def line_term_len_=(value: guint): Unit = (!struct.at7 = value)
      inline def buf_size : gsize = struct._8
      inline def buf_size_=(value: gsize): Unit = (!struct.at8 = value)
      inline def read_buf : Ptr[GString] = struct._9
      inline def read_buf_=(value: Ptr[GString]): Unit = (!struct.at9 = value)
      inline def encoded_read_buf : Ptr[GString] = struct._10
      inline def encoded_read_buf_=(value: Ptr[GString]): Unit = (!struct.at10 = value)
      inline def write_buf : Ptr[GString] = struct._11
      inline def write_buf_=(value: Ptr[GString]): Unit = (!struct.at11 = value)
      inline def partial_write_buf : CArray[gchar, Nat._6] = struct._12
      inline def partial_write_buf_=(value: CArray[gchar, Nat._6]): Unit = (!struct.at12 = value)
      inline def use_buffer : guint = struct._13
      inline def use_buffer_=(value: guint): Unit = (!struct.at13 = value)
      inline def do_encode : guint = struct._14
      inline def do_encode_=(value: guint): Unit = (!struct.at14 = value)
      inline def close_on_unref : guint = struct._15
      inline def close_on_unref_=(value: guint): Unit = (!struct.at15 = value)
      inline def is_readable : guint = struct._16
      inline def is_readable_=(value: guint): Unit = (!struct.at16 = value)
      inline def is_writeable : guint = struct._17
      inline def is_writeable_=(value: guint): Unit = (!struct.at17 = value)
      inline def is_seekable : guint = struct._18
      inline def is_seekable_=(value: guint): Unit = (!struct.at18 = value)
      inline def reserved1 : gpointer = struct._19
      inline def reserved1_=(value: gpointer): Unit = (!struct.at19 = value)
      inline def reserved2 : gpointer = struct._20
      inline def reserved2_=(value: gpointer): Unit = (!struct.at20 = value)
    end extension
  
  // Allocates _GIOChannel on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GIOChannel] = scala.scalanative.unsafe.alloc[_GIOChannel](1)
  def apply(ref_count : gint, funcs : Ptr[GIOFuncs], encoding : Ptr[gchar], read_cd : GIConv, write_cd : GIConv, line_term : Ptr[gchar], line_term_len : guint, buf_size : gsize, read_buf : Ptr[GString], encoded_read_buf : Ptr[GString], write_buf : Ptr[GString], partial_write_buf : CArray[gchar, Nat._6], use_buffer : guint, do_encode : guint, close_on_unref : guint, is_readable : guint, is_writeable : guint, is_seekable : guint, reserved1 : gpointer, reserved2 : gpointer)(using Zone): Ptr[_GIOChannel] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).funcs = funcs
    (!____ptr).encoding = encoding
    (!____ptr).read_cd = read_cd
    (!____ptr).write_cd = write_cd
    (!____ptr).line_term = line_term
    (!____ptr).line_term_len = line_term_len
    (!____ptr).buf_size = buf_size
    (!____ptr).read_buf = read_buf
    (!____ptr).encoded_read_buf = encoded_read_buf
    (!____ptr).write_buf = write_buf
    (!____ptr).partial_write_buf = partial_write_buf
    (!____ptr).use_buffer = use_buffer
    (!____ptr).do_encode = do_encode
    (!____ptr).close_on_unref = close_on_unref
    (!____ptr).is_readable = is_readable
    (!____ptr).is_writeable = is_writeable
    (!____ptr).is_seekable = is_seekable
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    ____ptr
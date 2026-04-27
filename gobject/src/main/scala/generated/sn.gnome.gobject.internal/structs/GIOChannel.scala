package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOChannel = CStruct20[_root_.sn.gnome.glib.internal.gint, Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.GIConv, _root_.sn.gnome.glib.internal.GIConv, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.GString], Ptr[_root_.sn.gnome.glib.internal.GString], Ptr[_root_.sn.gnome.glib.internal.GString], CArray[_root_.sn.gnome.glib.internal.gchar, Nat._6], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]

object GIOChannel:
  given _tag: Tag[GIOChannel] = Tag.materializeCStruct20Tag[_root_.sn.gnome.glib.internal.gint, Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.GIConv, _root_.sn.gnome.glib.internal.GIConv, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.GString], Ptr[_root_.sn.gnome.glib.internal.GString], Ptr[_root_.sn.gnome.glib.internal.GString], CArray[_root_.sn.gnome.glib.internal.gchar, Nat._6], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GIOChannel)
      inline def ref_count : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def funcs : Ptr[_root_.sn.gnome.glib.internal.GIOFuncs] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GIOFuncs]]
      inline def funcs_=(value: Ptr[_root_.sn.gnome.glib.internal.GIOFuncs]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def encoding : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def encoding_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
      inline def read_cd : _root_.sn.gnome.glib.internal.GIConv = struct._4
      inline def read_cd_=(value: _root_.sn.gnome.glib.internal.GIConv): Unit = (!struct.at4 = value)
      inline def write_cd : _root_.sn.gnome.glib.internal.GIConv = struct._5
      inline def write_cd_=(value: _root_.sn.gnome.glib.internal.GIConv): Unit = (!struct.at5 = value)
      inline def line_term : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._6
      inline def line_term_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at6 = value)
      inline def line_term_len : _root_.sn.gnome.glib.internal.guint = struct._7
      inline def line_term_len_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at7 = value)
      inline def buf_size : _root_.sn.gnome.glib.internal.gsize = struct._8
      inline def buf_size_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at8 = value)
      inline def read_buf : Ptr[_root_.sn.gnome.glib.internal.GString] = struct._9
      inline def read_buf_=(value: Ptr[_root_.sn.gnome.glib.internal.GString]): Unit = (!struct.at9 = value)
      inline def encoded_read_buf : Ptr[_root_.sn.gnome.glib.internal.GString] = struct._10
      inline def encoded_read_buf_=(value: Ptr[_root_.sn.gnome.glib.internal.GString]): Unit = (!struct.at10 = value)
      inline def write_buf : Ptr[_root_.sn.gnome.glib.internal.GString] = struct._11
      inline def write_buf_=(value: Ptr[_root_.sn.gnome.glib.internal.GString]): Unit = (!struct.at11 = value)
      inline def partial_write_buf : CArray[_root_.sn.gnome.glib.internal.gchar, Nat._6] = struct._12
      inline def partial_write_buf_=(value: CArray[_root_.sn.gnome.glib.internal.gchar, Nat._6]): Unit = (!struct.at12 = value)
      inline def use_buffer : _root_.sn.gnome.glib.internal.guint = struct._13
      inline def use_buffer_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at13 = value)
      inline def do_encode : _root_.sn.gnome.glib.internal.guint = struct._14
      inline def do_encode_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at14 = value)
      inline def close_on_unref : _root_.sn.gnome.glib.internal.guint = struct._15
      inline def close_on_unref_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at15 = value)
      inline def is_readable : _root_.sn.gnome.glib.internal.guint = struct._16
      inline def is_readable_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at16 = value)
      inline def is_writeable : _root_.sn.gnome.glib.internal.guint = struct._17
      inline def is_writeable_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at17 = value)
      inline def is_seekable : _root_.sn.gnome.glib.internal.guint = struct._18
      inline def is_seekable_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at18 = value)
      inline def reserved1 : _root_.sn.gnome.glib.internal.gpointer = struct._19
      inline def reserved1_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at19 = value)
      inline def reserved2 : _root_.sn.gnome.glib.internal.gpointer = struct._20
      inline def reserved2_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at20 = value)
    end extension
  
  // Allocates GIOChannel on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GIOChannel] = scala.scalanative.unsafe.alloc[GIOChannel](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.gint, funcs : Ptr[_root_.sn.gnome.glib.internal.GIOFuncs], encoding : Ptr[_root_.sn.gnome.glib.internal.gchar], read_cd : _root_.sn.gnome.glib.internal.GIConv, write_cd : _root_.sn.gnome.glib.internal.GIConv, line_term : Ptr[_root_.sn.gnome.glib.internal.gchar], line_term_len : _root_.sn.gnome.glib.internal.guint, buf_size : _root_.sn.gnome.glib.internal.gsize, read_buf : Ptr[_root_.sn.gnome.glib.internal.GString], encoded_read_buf : Ptr[_root_.sn.gnome.glib.internal.GString], write_buf : Ptr[_root_.sn.gnome.glib.internal.GString], partial_write_buf : CArray[_root_.sn.gnome.glib.internal.gchar, Nat._6], use_buffer : _root_.sn.gnome.glib.internal.guint, do_encode : _root_.sn.gnome.glib.internal.guint, close_on_unref : _root_.sn.gnome.glib.internal.guint, is_readable : _root_.sn.gnome.glib.internal.guint, is_writeable : _root_.sn.gnome.glib.internal.guint, is_seekable : _root_.sn.gnome.glib.internal.guint, reserved1 : _root_.sn.gnome.glib.internal.gpointer, reserved2 : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GIOChannel] =
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
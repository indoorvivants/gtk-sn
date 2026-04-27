package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GScanner = CStruct21[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], Ptr[_root_.sn.gnome.glib.internal.GScannerConfig], _root_.sn.gnome.glib.internal.GTokenType, _root_.sn.gnome.glib.internal.GTokenValue, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GTokenType, _root_.sn.gnome.glib.internal.GTokenValue, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GHashTable], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, Ptr[Byte]]

object _GScanner:
  given _tag: Tag[_GScanner] = Tag.materializeCStruct21Tag[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], Ptr[_root_.sn.gnome.glib.internal.GScannerConfig], _root_.sn.gnome.glib.internal.GTokenType, _root_.sn.gnome.glib.internal.GTokenValue, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.GTokenType, _root_.sn.gnome.glib.internal.GTokenValue, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GHashTable], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GScanner)
      inline def user_data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def user_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def max_parse_errors : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def max_parse_errors_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def parse_errors : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def parse_errors_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def input_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._4
      inline def input_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at4 = value)
      inline def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._5
      inline def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = (!struct.at5 = value)
      inline def config : Ptr[_root_.sn.gnome.glib.internal.GScannerConfig] = struct._6
      inline def config_=(value: Ptr[_root_.sn.gnome.glib.internal.GScannerConfig]): Unit = (!struct.at6 = value)
      inline def token : _root_.sn.gnome.glib.internal.GTokenType = struct._7
      inline def token_=(value: _root_.sn.gnome.glib.internal.GTokenType): Unit = (!struct.at7 = value)
      inline def value : _root_.sn.gnome.glib.internal.GTokenValue = struct._8
      inline def value_=(value: _root_.sn.gnome.glib.internal.GTokenValue): Unit = (!struct.at8 = value)
      inline def line : _root_.sn.gnome.glib.internal.guint = struct._9
      inline def line_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at9 = value)
      inline def position : _root_.sn.gnome.glib.internal.guint = struct._10
      inline def position_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at10 = value)
      inline def next_token : _root_.sn.gnome.glib.internal.GTokenType = struct._11
      inline def next_token_=(value: _root_.sn.gnome.glib.internal.GTokenType): Unit = (!struct.at11 = value)
      inline def next_value : _root_.sn.gnome.glib.internal.GTokenValue = struct._12
      inline def next_value_=(value: _root_.sn.gnome.glib.internal.GTokenValue): Unit = (!struct.at12 = value)
      inline def next_line : _root_.sn.gnome.glib.internal.guint = struct._13
      inline def next_line_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at13 = value)
      inline def next_position : _root_.sn.gnome.glib.internal.guint = struct._14
      inline def next_position_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at14 = value)
      inline def symbol_table : Ptr[_root_.sn.gnome.glib.internal.GHashTable] = struct._15
      inline def symbol_table_=(value: Ptr[_root_.sn.gnome.glib.internal.GHashTable]): Unit = (!struct.at15 = value)
      inline def input_fd : _root_.sn.gnome.glib.internal.gint = struct._16
      inline def input_fd_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at16 = value)
      inline def text : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._17
      inline def text_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at17 = value)
      inline def text_end : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._18
      inline def text_end_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at18 = value)
      inline def buffer : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._19
      inline def buffer_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at19 = value)
      inline def scope_id : _root_.sn.gnome.glib.internal.guint = struct._20
      inline def scope_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at20 = value)
      inline def msg_handler : _root_.sn.gnome.glib.internal.GScannerMsgFunc = struct._21.asInstanceOf[_root_.sn.gnome.glib.internal.GScannerMsgFunc]
      inline def msg_handler_=(value: _root_.sn.gnome.glib.internal.GScannerMsgFunc): Unit = (!struct.at21 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GScanner on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GScanner] = scala.scalanative.unsafe.alloc[_GScanner](1)
  def apply(user_data : _root_.sn.gnome.glib.internal.gpointer, max_parse_errors : _root_.sn.gnome.glib.internal.guint, parse_errors : _root_.sn.gnome.glib.internal.guint, input_name : Ptr[_root_.sn.gnome.glib.internal.gchar], qdata : Ptr[_root_.sn.gnome.glib.internal.GData], config : Ptr[_root_.sn.gnome.glib.internal.GScannerConfig], token : _root_.sn.gnome.glib.internal.GTokenType, value : _root_.sn.gnome.glib.internal.GTokenValue, line : _root_.sn.gnome.glib.internal.guint, position : _root_.sn.gnome.glib.internal.guint, next_token : _root_.sn.gnome.glib.internal.GTokenType, next_value : _root_.sn.gnome.glib.internal.GTokenValue, next_line : _root_.sn.gnome.glib.internal.guint, next_position : _root_.sn.gnome.glib.internal.guint, symbol_table : Ptr[_root_.sn.gnome.glib.internal.GHashTable], input_fd : _root_.sn.gnome.glib.internal.gint, text : Ptr[_root_.sn.gnome.glib.internal.gchar], text_end : Ptr[_root_.sn.gnome.glib.internal.gchar], buffer : Ptr[_root_.sn.gnome.glib.internal.gchar], scope_id : _root_.sn.gnome.glib.internal.guint, msg_handler : _root_.sn.gnome.glib.internal.GScannerMsgFunc)(using Zone): Ptr[_GScanner] =
    val ____ptr = apply()
    (!____ptr).user_data = user_data
    (!____ptr).max_parse_errors = max_parse_errors
    (!____ptr).parse_errors = parse_errors
    (!____ptr).input_name = input_name
    (!____ptr).qdata = qdata
    (!____ptr).config = config
    (!____ptr).token = token
    (!____ptr).value = value
    (!____ptr).line = line
    (!____ptr).position = position
    (!____ptr).next_token = next_token
    (!____ptr).next_value = next_value
    (!____ptr).next_line = next_line
    (!____ptr).next_position = next_position
    (!____ptr).symbol_table = symbol_table
    (!____ptr).input_fd = input_fd
    (!____ptr).text = text
    (!____ptr).text_end = text_end
    (!____ptr).buffer = buffer
    (!____ptr).scope_id = scope_id
    (!____ptr).msg_handler = msg_handler
    ____ptr
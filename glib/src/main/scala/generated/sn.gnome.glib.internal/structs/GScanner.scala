package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GScanner = CStruct21[gpointer, guint, guint, Ptr[gchar], Ptr[GData], Ptr[GScannerConfig], GTokenType, GTokenValue, guint, guint, GTokenType, GTokenValue, guint, guint, Ptr[GHashTable], gint, Ptr[gchar], Ptr[gchar], Ptr[gchar], guint, Ptr[Byte]]

object GScanner:
  given _tag: Tag[GScanner] = Tag.materializeCStruct21Tag[gpointer, guint, guint, Ptr[gchar], Ptr[GData], Ptr[GScannerConfig], GTokenType, GTokenValue, guint, guint, GTokenType, GTokenValue, guint, guint, Ptr[GHashTable], gint, Ptr[gchar], Ptr[gchar], Ptr[gchar], guint, Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GScanner)
      inline def user_data : gpointer = struct._1
      inline def user_data_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def max_parse_errors : guint = struct._2
      inline def max_parse_errors_=(value: guint): Unit = (!struct.at2 = value)
      inline def parse_errors : guint = struct._3
      inline def parse_errors_=(value: guint): Unit = (!struct.at3 = value)
      inline def input_name : Ptr[gchar] = struct._4
      inline def input_name_=(value: Ptr[gchar]): Unit = (!struct.at4 = value)
      inline def qdata : Ptr[GData] = struct._5
      inline def qdata_=(value: Ptr[GData]): Unit = (!struct.at5 = value)
      inline def config : Ptr[GScannerConfig] = struct._6
      inline def config_=(value: Ptr[GScannerConfig]): Unit = (!struct.at6 = value)
      inline def token : GTokenType = struct._7
      inline def token_=(value: GTokenType): Unit = (!struct.at7 = value)
      inline def value : GTokenValue = struct._8
      inline def value_=(value: GTokenValue): Unit = (!struct.at8 = value)
      inline def line : guint = struct._9
      inline def line_=(value: guint): Unit = (!struct.at9 = value)
      inline def position : guint = struct._10
      inline def position_=(value: guint): Unit = (!struct.at10 = value)
      inline def next_token : GTokenType = struct._11
      inline def next_token_=(value: GTokenType): Unit = (!struct.at11 = value)
      inline def next_value : GTokenValue = struct._12
      inline def next_value_=(value: GTokenValue): Unit = (!struct.at12 = value)
      inline def next_line : guint = struct._13
      inline def next_line_=(value: guint): Unit = (!struct.at13 = value)
      inline def next_position : guint = struct._14
      inline def next_position_=(value: guint): Unit = (!struct.at14 = value)
      inline def symbol_table : Ptr[GHashTable] = struct._15
      inline def symbol_table_=(value: Ptr[GHashTable]): Unit = (!struct.at15 = value)
      inline def input_fd : gint = struct._16
      inline def input_fd_=(value: gint): Unit = (!struct.at16 = value)
      inline def text : Ptr[gchar] = struct._17
      inline def text_=(value: Ptr[gchar]): Unit = (!struct.at17 = value)
      inline def text_end : Ptr[gchar] = struct._18
      inline def text_end_=(value: Ptr[gchar]): Unit = (!struct.at18 = value)
      inline def buffer : Ptr[gchar] = struct._19
      inline def buffer_=(value: Ptr[gchar]): Unit = (!struct.at19 = value)
      inline def scope_id : guint = struct._20
      inline def scope_id_=(value: guint): Unit = (!struct.at20 = value)
      inline def msg_handler : GScannerMsgFunc = struct._21.asInstanceOf[GScannerMsgFunc]
      inline def msg_handler_=(value: GScannerMsgFunc): Unit = (!struct.at21 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates GScanner on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GScanner] = scala.scalanative.unsafe.alloc[GScanner](1)
  def apply(user_data : gpointer, max_parse_errors : guint, parse_errors : guint, input_name : Ptr[gchar], qdata : Ptr[GData], config : Ptr[GScannerConfig], token : GTokenType, value : GTokenValue, line : guint, position : guint, next_token : GTokenType, next_value : GTokenValue, next_line : guint, next_position : guint, symbol_table : Ptr[GHashTable], input_fd : gint, text : Ptr[gchar], text_end : Ptr[gchar], buffer : Ptr[gchar], scope_id : guint, msg_handler : GScannerMsgFunc)(using Zone): Ptr[GScanner] =
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
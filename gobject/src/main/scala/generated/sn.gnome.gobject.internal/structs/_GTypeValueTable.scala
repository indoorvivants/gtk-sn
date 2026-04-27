package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeValueTable: _init: Function to initialize a GValue _free: Function to free a GValue _copy: Function to copy a GValue _peek_pointer: Function to peek the contents of a GValue if they fit into a pointer _format: A string format describing how to collect the contents of this value bit-by-bit. Each character in the format represents an argument to be collected, and the characters themselves indicate the type of the argument. Currently supported arguments are: - `'i'`: Integers, passed as `collect_values[].v_int` - `'l'`: Longs, passed as `collect_values[].v_long` - `'d'`: Doubles, passed as `collect_values[].v_double` - `'p'`: Pointers, passed as `collect_values[].v_pointer` It should be noted that for variable argument list construction, ANSI C promotes every type smaller than an integer to an int, and floats to doubles. So for collection of short int or char, `'i'` needs to be used, and for collection of floats `'d'`. _value: Function to initialize a GValue from the values collected from variadic arguments _format: Format description of the arguments to collect for _value, analogous to _format. Usually, _format string consists only of `'p'`s to provide lcopy_value() with pointers to storage locations. _value: Function to store the contents of a value into the locations collected from variadic arguments
*/
opaque type _GTypeValueTable = CStruct8[GTypeValueInitFunc, GTypeValueFreeFunc, GTypeValueCopyFunc, GTypeValuePeekPointerFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueCollectFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueLCopyFunc]

object _GTypeValueTable:
  given _tag: Tag[_GTypeValueTable] = Tag.materializeCStruct8Tag[GTypeValueInitFunc, GTypeValueFreeFunc, GTypeValueCopyFunc, GTypeValuePeekPointerFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueCollectFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], GTypeValueLCopyFunc]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypeValueTable)
      inline def value_init : GTypeValueInitFunc = struct._1
      inline def value_init_=(value: GTypeValueInitFunc): Unit = (!struct.at1 = value)
      inline def value_free : GTypeValueFreeFunc = struct._2
      inline def value_free_=(value: GTypeValueFreeFunc): Unit = (!struct.at2 = value)
      inline def value_copy : GTypeValueCopyFunc = struct._3
      inline def value_copy_=(value: GTypeValueCopyFunc): Unit = (!struct.at3 = value)
      inline def value_peek_pointer : GTypeValuePeekPointerFunc = struct._4
      inline def value_peek_pointer_=(value: GTypeValuePeekPointerFunc): Unit = (!struct.at4 = value)
      inline def collect_format : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._5
      inline def collect_format_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at5 = value)
      inline def collect_value : GTypeValueCollectFunc = struct._6
      inline def collect_value_=(value: GTypeValueCollectFunc): Unit = (!struct.at6 = value)
      inline def lcopy_format : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._7
      inline def lcopy_format_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at7 = value)
      inline def lcopy_value : GTypeValueLCopyFunc = struct._8
      inline def lcopy_value_=(value: GTypeValueLCopyFunc): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GTypeValueTable on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypeValueTable] = scala.scalanative.unsafe.alloc[_GTypeValueTable](1)
  def apply(value_init : GTypeValueInitFunc, value_free : GTypeValueFreeFunc, value_copy : GTypeValueCopyFunc, value_peek_pointer : GTypeValuePeekPointerFunc, collect_format : Ptr[_root_.sn.gnome.glib.internal.gchar], collect_value : GTypeValueCollectFunc, lcopy_format : Ptr[_root_.sn.gnome.glib.internal.gchar], lcopy_value : GTypeValueLCopyFunc)(using Zone): Ptr[_GTypeValueTable] =
    val ____ptr = apply()
    (!____ptr).value_init = value_init
    (!____ptr).value_free = value_free
    (!____ptr).value_copy = value_copy
    (!____ptr).value_peek_pointer = value_peek_pointer
    (!____ptr).collect_format = collect_format
    (!____ptr).collect_value = collect_value
    (!____ptr).lcopy_format = lcopy_format
    (!____ptr).lcopy_value = lcopy_value
    ____ptr
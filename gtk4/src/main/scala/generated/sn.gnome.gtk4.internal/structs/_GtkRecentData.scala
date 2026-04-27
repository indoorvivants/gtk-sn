package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkRecentData: _name: a UTF-8 encoded string, containing the name of the recently used resource to be displayed, or %NULL; : a UTF-8 encoded string, containing a short description of the resource, or %NULL; _type: the MIME type of the resource; _name: the name of the application that is registering this recently used resource; _exec: command line used to launch this resource; may contain the “%f” and “%u” escape characters which will be expanded to the resource file path and URI respectively when the command line is retrieved; : (array zero-terminated=1): a vector of strings containing groups names; applications that have registered it or not.
*/
opaque type _GtkRecentData = CStruct7[CString, CString, CString, CString, CString, Ptr[CString], _root_.sn.gnome.glib.internal.gboolean]

object _GtkRecentData:
  given _tag: Tag[_GtkRecentData] = Tag.materializeCStruct7Tag[CString, CString, CString, CString, CString, Ptr[CString], _root_.sn.gnome.glib.internal.gboolean]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkRecentData)
      inline def display_name : CString = struct._1
      inline def display_name_=(value: CString): Unit = (!struct.at1 = value)
      inline def description : CString = struct._2
      inline def description_=(value: CString): Unit = (!struct.at2 = value)
      inline def mime_type : CString = struct._3
      inline def mime_type_=(value: CString): Unit = (!struct.at3 = value)
      inline def app_name : CString = struct._4
      inline def app_name_=(value: CString): Unit = (!struct.at4 = value)
      inline def app_exec : CString = struct._5
      inline def app_exec_=(value: CString): Unit = (!struct.at5 = value)
      inline def groups : Ptr[CString] = struct._6
      inline def groups_=(value: Ptr[CString]): Unit = (!struct.at6 = value)
      inline def is_private : _root_.sn.gnome.glib.internal.gboolean = struct._7
      inline def is_private_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GtkRecentData on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkRecentData] = scala.scalanative.unsafe.alloc[_GtkRecentData](1)
  def apply(display_name : CString, description : CString, mime_type : CString, app_name : CString, app_exec : CString, groups : Ptr[CString], is_private : _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[_GtkRecentData] =
    val ____ptr = apply()
    (!____ptr).display_name = display_name
    (!____ptr).description = description
    (!____ptr).mime_type = mime_type
    (!____ptr).app_name = app_name
    (!____ptr).app_exec = app_exec
    (!____ptr).groups = groups
    (!____ptr).is_private = is_private
    ____ptr
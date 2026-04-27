package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPadActionEntry: : the type of pad feature that will trigger this action entry. : the 0-indexed button/ring/strip number that will trigger this action entry.
*/
opaque type GtkPadActionEntry = CStruct5[GtkPadActionType, CInt, CInt, CString, CString]

object GtkPadActionEntry:
  given _tag: Tag[GtkPadActionEntry] = Tag.materializeCStruct5Tag[GtkPadActionType, CInt, CInt, CString, CString]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkPadActionEntry)
      inline def `type` : GtkPadActionType = struct._1
      inline def type_=(value: GtkPadActionType): Unit = (!struct.at1 = value)
      inline def index : CInt = struct._2
      inline def index_=(value: CInt): Unit = (!struct.at2 = value)
      inline def mode : CInt = struct._3
      inline def mode_=(value: CInt): Unit = (!struct.at3 = value)
      inline def label : CString = struct._4
      inline def label_=(value: CString): Unit = (!struct.at4 = value)
      inline def action_name : CString = struct._5
      inline def action_name_=(value: CString): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates GtkPadActionEntry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkPadActionEntry] = scala.scalanative.unsafe.alloc[GtkPadActionEntry](1)
  def apply(`type` : GtkPadActionType, index : CInt, mode : CInt, label : CString, action_name : CString)(using Zone): Ptr[GtkPadActionEntry] =
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).index = index
    (!____ptr).mode = mode
    (!____ptr).label = label
    (!____ptr).action_name = action_name
    ____ptr
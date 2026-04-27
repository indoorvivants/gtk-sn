package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextViewClass: _class: The object class structure needs to be the first _cursor: The class handler for the `GtkTextView::move-cursor` keybinding signal.
*/
opaque type GtkTextViewClass = CStruct15[GtkWidgetClass, CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr2[Ptr[GtkTextView], CString, Unit], CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTextView], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkTextViewClass:
  given _tag: Tag[GtkTextViewClass] = Tag.materializeCStruct15Tag[GtkWidgetClass, CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr2[Ptr[GtkTextView], CString, Unit], CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Unit], CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTextView], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTextViewClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def move_cursor : CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, Unit] = struct._2
      inline def move_cursor_=(value: CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = (!struct.at2 = value)
      inline def set_anchor : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._3
      inline def set_anchor_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = (!struct.at3 = value)
      inline def insert_at_cursor : CFuncPtr2[Ptr[GtkTextView], CString, Unit] = struct._4
      inline def insert_at_cursor_=(value: CFuncPtr2[Ptr[GtkTextView], CString, Unit]): Unit = (!struct.at4 = value)
      inline def delete_from_cursor : CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit] = struct._5
      inline def delete_from_cursor_=(value: CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit]): Unit = (!struct.at5 = value)
      inline def backspace : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._6
      inline def backspace_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = (!struct.at6 = value)
      inline def cut_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._7
      inline def cut_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = (!struct.at7 = value)
      inline def copy_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._8
      inline def copy_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = (!struct.at8 = value)
      inline def paste_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._9
      inline def paste_clipboard_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = (!struct.at9 = value)
      inline def toggle_overwrite : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._10
      inline def toggle_overwrite_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = (!struct.at10 = value)
      inline def create_buffer : CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]] = struct._11
      inline def create_buffer_=(value: CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]]): Unit = (!struct.at11 = value)
      inline def snapshot_layer : CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit] = struct._12
      inline def snapshot_layer_=(value: CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit]): Unit = (!struct.at12 = value)
      inline def extend_selection : CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.sn.gnome.glib.internal.gboolean] = struct._13
      inline def extend_selection_=(value: CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at13 = value)
      inline def insert_emoji : CFuncPtr1[Ptr[GtkTextView], Unit] = struct._14
      inline def insert_emoji_=(value: CFuncPtr1[Ptr[GtkTextView], Unit]): Unit = (!struct.at14 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._15
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at15 = value)
    end extension
  
  // Allocates GtkTextViewClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTextViewClass] = scala.scalanative.unsafe.alloc[GtkTextViewClass](1)
  def apply(parent_class : GtkWidgetClass, move_cursor : CFuncPtr4[Ptr[GtkTextView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, Unit], set_anchor : CFuncPtr1[Ptr[GtkTextView], Unit], insert_at_cursor : CFuncPtr2[Ptr[GtkTextView], CString, Unit], delete_from_cursor : CFuncPtr3[Ptr[GtkTextView], GtkDeleteType, CInt, Unit], backspace : CFuncPtr1[Ptr[GtkTextView], Unit], cut_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], copy_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], paste_clipboard : CFuncPtr1[Ptr[GtkTextView], Unit], toggle_overwrite : CFuncPtr1[Ptr[GtkTextView], Unit], create_buffer : CFuncPtr1[Ptr[GtkTextView], Ptr[GtkTextBuffer]], snapshot_layer : CFuncPtr3[Ptr[GtkTextView], GtkTextViewLayer, Ptr[GtkSnapshot], Unit], extend_selection : CFuncPtr5[Ptr[GtkTextView], GtkTextExtendSelection, Ptr[GtkTextIter], Ptr[GtkTextIter], Ptr[GtkTextIter], _root_.sn.gnome.glib.internal.gboolean], insert_emoji : CFuncPtr1[Ptr[GtkTextView], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkTextViewClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).move_cursor = move_cursor
    (!____ptr).set_anchor = set_anchor
    (!____ptr).insert_at_cursor = insert_at_cursor
    (!____ptr).delete_from_cursor = delete_from_cursor
    (!____ptr).backspace = backspace
    (!____ptr).cut_clipboard = cut_clipboard
    (!____ptr).copy_clipboard = copy_clipboard
    (!____ptr).paste_clipboard = paste_clipboard
    (!____ptr).toggle_overwrite = toggle_overwrite
    (!____ptr).create_buffer = create_buffer
    (!____ptr).snapshot_layer = snapshot_layer
    (!____ptr).extend_selection = extend_selection
    (!____ptr).insert_emoji = insert_emoji
    (!____ptr).padding = padding
    ____ptr
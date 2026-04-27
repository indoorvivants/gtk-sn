package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextBufferClass: _class: The object class structure needs to be the first. _text: The class handler for the `GtkTextBuffer::insert-text` signal. _paintable: The class handler for the `GtkTextBuffer::insert-paintable` signal. _child_anchor: The class handler for the `GtkTextBuffer::insert-child-anchor` signal. _range: The class handler for the `GtkTextBuffer::delete-range` signal. : The class handler for the `GtkTextBuffer::changed` signal. _changed: The class handler for the `GtkTextBuffer::modified-changed` signal. _set: The class handler for the `GtkTextBuffer::mark-set` signal. _deleted: The class handler for the `GtkTextBuffer::mark-deleted` signal. _tag: The class handler for the `GtkTextBuffer::apply-tag` signal. _tag: The class handler for the `GtkTextBuffer::remove-tag` signal. _user_action: The class handler for the `GtkTextBuffer::begin-user-action` signal. _user_action: The class handler for the `GtkTextBuffer::end-user-action` signal. _done: The class handler for the `GtkTextBuffer::paste-done` signal. : The class handler for the `GtkTextBuffer::undo` signal : The class handler for the `GtkTextBuffer::redo` signal
*/
opaque type _GtkTextBufferClass = CStruct20[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GtkTextBufferClass:
  given _tag: Tag[_GtkTextBufferClass] = Tag.materializeCStruct20Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr1[Ptr[GtkTextBuffer], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTextBufferClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def insert_text : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit] = struct._2
      inline def insert_text_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit]): Unit = (!struct.at2 = value)
      inline def insert_paintable : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit] = struct._3
      inline def insert_paintable_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit]): Unit = (!struct.at3 = value)
      inline def insert_child_anchor : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit] = struct._4
      inline def insert_child_anchor_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit]): Unit = (!struct.at4 = value)
      inline def delete_range : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._5
      inline def delete_range_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = (!struct.at5 = value)
      inline def changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._6
      inline def changed_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = (!struct.at6 = value)
      inline def modified_changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._7
      inline def modified_changed_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = (!struct.at7 = value)
      inline def mark_set : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit] = struct._8
      inline def mark_set_=(value: CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit]): Unit = (!struct.at8 = value)
      inline def mark_deleted : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit] = struct._9
      inline def mark_deleted_=(value: CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit]): Unit = (!struct.at9 = value)
      inline def apply_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._10
      inline def apply_tag_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = (!struct.at10 = value)
      inline def remove_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit] = struct._11
      inline def remove_tag_=(value: CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit]): Unit = (!struct.at11 = value)
      inline def begin_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._12
      inline def begin_user_action_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = (!struct.at12 = value)
      inline def end_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._13
      inline def end_user_action_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = (!struct.at13 = value)
      inline def paste_done : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit] = struct._14
      inline def paste_done_=(value: CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit]): Unit = (!struct.at14 = value)
      inline def undo : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._15
      inline def undo_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = (!struct.at15 = value)
      inline def redo : CFuncPtr1[Ptr[GtkTextBuffer], Unit] = struct._16
      inline def redo_=(value: CFuncPtr1[Ptr[GtkTextBuffer], Unit]): Unit = (!struct.at16 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._17
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at17 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._18
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at18 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._19
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at19 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._20
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at20 = value)
    end extension
  
  // Allocates _GtkTextBufferClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTextBufferClass] = scala.scalanative.unsafe.alloc[_GtkTextBufferClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, insert_text : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextIter], CString, CInt, Unit], insert_paintable : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GdkPaintable], Unit], insert_child_anchor : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextChildAnchor], Unit], delete_range : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit], modified_changed : CFuncPtr1[Ptr[GtkTextBuffer], Unit], mark_set : CFuncPtr3[Ptr[GtkTextBuffer], Ptr[GtkTextIter], Ptr[GtkTextMark], Unit], mark_deleted : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GtkTextMark], Unit], apply_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], remove_tag : CFuncPtr4[Ptr[GtkTextBuffer], Ptr[GtkTextTag], Ptr[GtkTextIter], Ptr[GtkTextIter], Unit], begin_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit], end_user_action : CFuncPtr1[Ptr[GtkTextBuffer], Unit], paste_done : CFuncPtr2[Ptr[GtkTextBuffer], Ptr[GdkClipboard], Unit], undo : CFuncPtr1[Ptr[GtkTextBuffer], Unit], redo : CFuncPtr1[Ptr[GtkTextBuffer], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkTextBufferClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).insert_text = insert_text
    (!____ptr).insert_paintable = insert_paintable
    (!____ptr).insert_child_anchor = insert_child_anchor
    (!____ptr).delete_range = delete_range
    (!____ptr).changed = changed
    (!____ptr).modified_changed = modified_changed
    (!____ptr).mark_set = mark_set
    (!____ptr).mark_deleted = mark_deleted
    (!____ptr).apply_tag = apply_tag
    (!____ptr).remove_tag = remove_tag
    (!____ptr).begin_user_action = begin_user_action
    (!____ptr).end_user_action = end_user_action
    (!____ptr).paste_done = paste_done
    (!____ptr).undo = undo
    (!____ptr).redo = redo
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
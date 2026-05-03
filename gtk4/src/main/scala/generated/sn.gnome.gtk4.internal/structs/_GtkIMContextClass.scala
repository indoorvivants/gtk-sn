package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkIMContextClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]]

object _GtkIMContextClass:
  given _tag: Tag[_GtkIMContextClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._0]](Tag.Byte, Tag.Digit3[Nat._3, Nat._2, Nat._0](Tag.Nat3, Tag.Nat2, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkIMContextClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def preedit_start: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
      inline def preedit_start_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
      inline def preedit_end: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
      inline def preedit_end_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
      inline def preedit_changed: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
      inline def preedit_changed_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
      inline def commit: CFuncPtr2[Ptr[GtkIMContext], CString, Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]]]
      inline def commit_=(value: CFuncPtr2[Ptr[GtkIMContext], CString, Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]]] = value
      inline def retrieve_surrounding: CFuncPtr1[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def retrieve_surrounding_=(value: CFuncPtr1[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def delete_surrounding: CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def delete_surrounding_=(value: CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def set_client_widget: CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]]]
      inline def set_client_widget_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]]] = value
      inline def get_preedit_string: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]], Ptr[CInt], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]], Ptr[CInt], Unit]]]
      inline def get_preedit_string_=(value: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]], Ptr[CInt], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]], Ptr[CInt], Unit]]] = value
      inline def filter_keypress: CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def filter_keypress_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def focus_in: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
      inline def focus_in_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
      inline def focus_out: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
      inline def focus_out_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
      inline def reset: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
      inline def reset_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
      inline def set_cursor_location: CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit]]]
      inline def set_cursor_location_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit]]] = value
      inline def set_use_preedit: CFuncPtr2[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean, Unit] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean, Unit]]]
      inline def set_use_preedit_=(value: CFuncPtr2[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean, Unit]]] = value
      inline def set_surrounding: CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]]]
      inline def set_surrounding_=(value: CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]]] = value
      inline def get_surrounding: CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def get_surrounding_=(value: CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def set_surrounding_with_selection: CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]]]
      inline def set_surrounding_with_selection_=(value: CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]]] = value
      inline def get_surrounding_with_selection: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def get_surrounding_with_selection_=(value: CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def activate_osk: CFuncPtr1[Ptr[GtkIMContext], Unit] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]]
      inline def activate_osk_=(value: CFuncPtr1[Ptr[GtkIMContext], Unit]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkIMContext], Unit]]] = value
      inline def activate_osk_with_event: CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def activate_osk_with_event_=(value: CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def _gtk_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _gtk_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _gtk_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates _GtkIMContextClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkIMContextClass] = scala.scalanative.unsafe.alloc[_GtkIMContextClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, preedit_start : CFuncPtr1[Ptr[GtkIMContext], Unit], preedit_end : CFuncPtr1[Ptr[GtkIMContext], Unit], preedit_changed : CFuncPtr1[Ptr[GtkIMContext], Unit], commit : CFuncPtr2[Ptr[GtkIMContext], CString, Unit], retrieve_surrounding : CFuncPtr1[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean], delete_surrounding : CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean], set_client_widget : CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit], get_preedit_string : CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]], Ptr[CInt], Unit], filter_keypress : CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean], focus_in : CFuncPtr1[Ptr[GtkIMContext], Unit], focus_out : CFuncPtr1[Ptr[GtkIMContext], Unit], reset : CFuncPtr1[Ptr[GtkIMContext], Unit], set_cursor_location : CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit], set_use_preedit : CFuncPtr2[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean, Unit], set_surrounding : CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit], get_surrounding : CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], set_surrounding_with_selection : CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit], get_surrounding_with_selection : CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], activate_osk : CFuncPtr1[Ptr[GtkIMContext], Unit], activate_osk_with_event : CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkIMContextClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).preedit_start = preedit_start
    (!____ptr).preedit_end = preedit_end
    (!____ptr).preedit_changed = preedit_changed
    (!____ptr).commit = commit
    (!____ptr).retrieve_surrounding = retrieve_surrounding
    (!____ptr).delete_surrounding = delete_surrounding
    (!____ptr).set_client_widget = set_client_widget
    (!____ptr).get_preedit_string = get_preedit_string
    (!____ptr).filter_keypress = filter_keypress
    (!____ptr).focus_in = focus_in
    (!____ptr).focus_out = focus_out
    (!____ptr).reset = reset
    (!____ptr).set_cursor_location = set_cursor_location
    (!____ptr).set_use_preedit = set_use_preedit
    (!____ptr).set_surrounding = set_surrounding
    (!____ptr).get_surrounding = get_surrounding
    (!____ptr).set_surrounding_with_selection = set_surrounding_with_selection
    (!____ptr).get_surrounding_with_selection = get_surrounding_with_selection
    (!____ptr).activate_osk = activate_osk
    (!____ptr).activate_osk_with_event = activate_osk_with_event
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](24)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GtkIMContext], CString, Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr3[Ptr[GtkIMContext], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[GtkIMContext], Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]], Ptr[CInt], Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]], Ptr[CInt], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean, Unit]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr2[Ptr[GtkIMContext], _root_.sn.gnome.glib.internal.gboolean, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr4[Ptr[GtkIMContext], CString, CInt, CInt, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr3[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]].toInt)
    res(18) = align(res(17) + sizeof[CFuncPtr5[Ptr[GtkIMContext], CString, CInt, CInt, CInt, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(19) = align(res(18) + sizeof[CFuncPtr4[Ptr[GtkIMContext], Ptr[CString], Ptr[CInt], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt)
    res(20) = align(res(19) + sizeof[CFuncPtr1[Ptr[GtkIMContext], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(21) = align(res(20) + sizeof[CFuncPtr2[Ptr[GtkIMContext], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(22) = align(res(21) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(23) = align(res(22) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets
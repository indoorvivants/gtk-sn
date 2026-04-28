package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintOperationClass: _class: The parent class. : Signal emitted when the print operation run has finished doing everything required for printing. _print: Signal emitted after the user has finished changing print settings in the dialog, before the actual rendering starts. : Signal emitted after the “begin-print” signal, but before the actual rendering starts. _page_setup: Emitted once for every page that is printed, to give the application a chance to modify the page setup. _page: Signal emitted for every page that is printed. _print: Signal emitted after all pages have been rendered. _changed: Emitted at between the various phases of the print operation. _custom_widget: Signal emitted when displaying the print dialog. _widget_apply: Signal emitted right before “begin-print” if you added a custom widget in the “create-custom-widget” handler. : Signal emitted when a preview is requested from the native dialog. _custom_widget: Emitted after change of selected printer.
*/
opaque type GtkPrintOperationClass = CStruct13[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkPrintOperationClass:
  given _tag: Tag[GtkPrintOperationClass] = Tag.materializeCStruct13Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Unit], CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkPrintOperationClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def done : CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit] = struct._2
      inline def done_=(value: CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit]): Unit = (!struct.at2 = value)
      inline def begin_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit] = struct._3
      inline def begin_print_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit]): Unit = (!struct.at3 = value)
      inline def paginate : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def paginate_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def request_page_setup : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit] = struct._5
      inline def request_page_setup_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit]): Unit = (!struct.at5 = value)
      inline def draw_page : CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit] = struct._6
      inline def draw_page_=(value: CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit]): Unit = (!struct.at6 = value)
      inline def end_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit] = struct._7
      inline def end_print_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit]): Unit = (!struct.at7 = value)
      inline def status_changed : CFuncPtr1[Ptr[GtkPrintOperation], Unit] = struct._8
      inline def status_changed_=(value: CFuncPtr1[Ptr[GtkPrintOperation], Unit]): Unit = (!struct.at8 = value)
      inline def create_custom_widget : CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]] = struct._9
      inline def create_custom_widget_=(value: CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]]): Unit = (!struct.at9 = value)
      inline def custom_widget_apply : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit] = struct._10
      inline def custom_widget_apply_=(value: CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit]): Unit = (!struct.at10 = value)
      inline def preview : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean] = struct._11
      inline def preview_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at11 = value)
      inline def update_custom_widget : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit] = struct._12
      inline def update_custom_widget_=(value: CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit]): Unit = (!struct.at12 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._13
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at13 = value)
    end extension
  
  // Allocates GtkPrintOperationClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkPrintOperationClass] = scala.scalanative.unsafe.alloc[GtkPrintOperationClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, done : CFuncPtr2[Ptr[GtkPrintOperation], GtkPrintOperationResult, Unit], begin_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], paginate : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], _root_.sn.gnome.glib.internal.gboolean], request_page_setup : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Ptr[GtkPageSetup], Unit], draw_page : CFuncPtr3[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], CInt, Unit], end_print : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkPrintContext], Unit], status_changed : CFuncPtr1[Ptr[GtkPrintOperation], Unit], create_custom_widget : CFuncPtr1[Ptr[GtkPrintOperation], Ptr[GtkWidget]], custom_widget_apply : CFuncPtr2[Ptr[GtkPrintOperation], Ptr[GtkWidget], Unit], preview : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkPrintOperationPreview], Ptr[GtkPrintContext], Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean], update_custom_widget : CFuncPtr4[Ptr[GtkPrintOperation], Ptr[GtkWidget], Ptr[GtkPageSetup], Ptr[GtkPrintSettings], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkPrintOperationClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).done = done
    (!____ptr).begin_print = begin_print
    (!____ptr).paginate = paginate
    (!____ptr).request_page_setup = request_page_setup
    (!____ptr).draw_page = draw_page
    (!____ptr).end_print = end_print
    (!____ptr).status_changed = status_changed
    (!____ptr).create_custom_widget = create_custom_widget
    (!____ptr).custom_widget_apply = custom_widget_apply
    (!____ptr).preview = preview
    (!____ptr).update_custom_widget = update_custom_widget
    (!____ptr).padding = padding
    ____ptr
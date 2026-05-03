package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkEntryCompletionMatchFunc: : the `GtkEntryCompletion` : the string to match, normalized and case-folded : a `GtkTreeIter` indicating the row to match _data: user data given to gtk_entry_completion_set_match_func()
*/
opaque type GtkEntryCompletionMatchFunc = CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkEntryCompletionMatchFunc:
  given _tag: Tag[GtkEntryCompletionMatchFunc] = Tag.materializeCFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkEntryCompletionMatchFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkEntryCompletionMatchFunc = o
  extension (v: GtkEntryCompletionMatchFunc)
    inline def value: CFuncPtr4[Ptr[GtkEntryCompletion], CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)
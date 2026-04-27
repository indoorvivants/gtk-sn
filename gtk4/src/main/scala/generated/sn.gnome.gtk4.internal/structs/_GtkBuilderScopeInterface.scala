package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBuilderScopeInterface: _type_from_name: Try to lookup a `GType` via the its name. See gtk_builder_get_type_from_name() for more details. The C implementation will use g_type_from_name() and if that fails try to guess the correct function name for registering the type and then use dlsym() to load it. The default implementation just tries g_type_from_name() and otherwise fails. _type_from_function: Try to lookup a `GType` via the given function name, specified explicitly in a GtkBuilder file, like via the "type-func" attribute in the `<object>` tag. This function is very rarely used. The C implementation will use dlsym() and call the resulting function as a `GTypeFunc`. The default implementation will fail and just return %G_TYPE_INVALID. _closure: Create a closure with the given arguments. See gtk_builder_create_closure() for more details on those. The C implementation will try to use dlsym() to locate the function name and then g_cclosure_new() to create a closure for the symbol. The default implementation just fails and returns %NULL.
*/
opaque type _GtkBuilderScopeInterface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType], CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType], CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Byte]]]

object _GtkBuilderScopeInterface:
  given _tag: Tag[_GtkBuilderScopeInterface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType], CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType], CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Byte]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkBuilderScopeInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_type_from_name : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType] = struct._2
      inline def get_type_from_name_=(value: CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at2 = value)
      inline def get_type_from_function : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType] = struct._3
      inline def get_type_from_function_=(value: CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at3 = value)
      inline def create_closure : CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.gobject.internal.GClosure]] = struct._4.asInstanceOf[CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.gobject.internal.GClosure]]]
      inline def create_closure_=(value: CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.gobject.internal.GClosure]]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Byte]]])
    end extension
  
  // Allocates _GtkBuilderScopeInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkBuilderScopeInterface] = scala.scalanative.unsafe.alloc[_GtkBuilderScopeInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_type_from_name : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType], get_type_from_function : CFuncPtr3[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, _root_.sn.gnome.gobject.internal.GType], create_closure : CFuncPtr6[Ptr[GtkBuilderScope], Ptr[GtkBuilder], CString, GtkBuilderClosureFlags, Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.gobject.internal.GClosure]])(using Zone): Ptr[_GtkBuilderScopeInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_type_from_name = get_type_from_name
    (!____ptr).get_type_from_function = get_type_from_function
    (!____ptr).create_closure = create_closure
    ____ptr
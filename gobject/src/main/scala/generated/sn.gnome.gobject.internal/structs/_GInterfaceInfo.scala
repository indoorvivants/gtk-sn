package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GInterfaceInfo:
*/
opaque type _GInterfaceInfo = CStruct3[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]

object _GInterfaceInfo:
  given _tag: Tag[_GInterfaceInfo] = Tag.materializeCStruct3Tag[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GInterfaceInfo)
      inline def interface_init : GInterfaceInitFunc = struct._1
      inline def interface_init_=(value: GInterfaceInitFunc): Unit = (!struct.at1 = value)
      inline def interface_finalize : GInterfaceFinalizeFunc = struct._2
      inline def interface_finalize_=(value: GInterfaceFinalizeFunc): Unit = (!struct.at2 = value)
      inline def interface_data : _root_.sn.gnome.glib.internal.gpointer = struct._3
      inline def interface_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GInterfaceInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GInterfaceInfo] = scala.scalanative.unsafe.alloc[_GInterfaceInfo](1)
  def apply(interface_init : GInterfaceInitFunc, interface_finalize : GInterfaceFinalizeFunc, interface_data : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GInterfaceInfo] =
    val ____ptr = apply()
    (!____ptr).interface_init = interface_init
    (!____ptr).interface_finalize = interface_finalize
    (!____ptr).interface_data = interface_data
    ____ptr
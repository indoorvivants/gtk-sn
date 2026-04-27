package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GInterfaceInfo:
*/
opaque type GInterfaceInfo = CStruct3[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]

object GInterfaceInfo:
  given _tag: Tag[GInterfaceInfo] = Tag.materializeCStruct3Tag[GInterfaceInitFunc, GInterfaceFinalizeFunc, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GInterfaceInfo)
      inline def interface_init : GInterfaceInitFunc = struct._1
      inline def interface_init_=(value: GInterfaceInitFunc): Unit = (!struct.at1 = value)
      inline def interface_finalize : GInterfaceFinalizeFunc = struct._2
      inline def interface_finalize_=(value: GInterfaceFinalizeFunc): Unit = (!struct.at2 = value)
      inline def interface_data : _root_.sn.gnome.glib.internal.gpointer = struct._3
      inline def interface_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GInterfaceInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GInterfaceInfo] = scala.scalanative.unsafe.alloc[GInterfaceInfo](1)
  def apply(interface_init : GInterfaceInitFunc, interface_finalize : GInterfaceFinalizeFunc, interface_data : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GInterfaceInfo] =
    val ____ptr = apply()
    (!____ptr).interface_init = interface_init
    (!____ptr).interface_finalize = interface_finalize
    (!____ptr).interface_data = interface_data
    ____ptr
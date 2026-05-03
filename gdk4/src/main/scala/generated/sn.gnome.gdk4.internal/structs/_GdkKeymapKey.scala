package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkKeymapKey: : the hardware keycode. This is an identifying number for a physical key. : indicates movement in a horizontal direction. Usually groups are used for two different languages. In group 0, a key might have two English characters, and in group 1 it might have two Hebrew characters. The Hebrew characters will be printed on the key next to the English characters. : indicates which symbol on the key will be used, in a vertical direction. So on a standard US keyboard, the key with the number “1” on it also has the exclamation point ("!") character on it. The level indicates whether to use the “1” or the “!” symbol. The letter keys are considered to have a lowercase letter at level 0, and an uppercase letter at level 1, though only the uppercase letter is printed.
*/
opaque type _GdkKeymapKey = CStruct3[_root_.sn.gnome.glib.internal.guint, CInt, CInt]

object _GdkKeymapKey:
  given _tag: Tag[_GdkKeymapKey] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GdkKeymapKey)
      inline def keycode : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def keycode_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def group : CInt = struct._2
      inline def group_=(value: CInt): Unit = (!struct.at2 = value)
      inline def level : CInt = struct._3
      inline def level_=(value: CInt): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GdkKeymapKey on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GdkKeymapKey] = scala.scalanative.unsafe.alloc[_GdkKeymapKey](1)
  def apply(keycode : _root_.sn.gnome.glib.internal.guint, group : CInt, level : CInt)(using Zone): Ptr[_GdkKeymapKey] =
    val ____ptr = apply()
    (!____ptr).keycode = keycode
    (!____ptr).group = group
    (!____ptr).level = level
    ____ptr
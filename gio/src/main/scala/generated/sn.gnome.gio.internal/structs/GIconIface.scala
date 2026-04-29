package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIconIface: _iface: The parent interface. : A hash for a given #GIcon. : Checks if two #GIcons are equal. _tokens: Serializes a #GIcon into tokens. The tokens must not contain any whitespace. Don't implement if the #GIcon can't be serialized (Since 2.20). _tokens: Constructs a #GIcon from tokens. Set the #GError if the tokens are malformed. Don't implement if the #GIcon can't be serialized (Since 2.20). : Serializes a #GIcon into a #GVariant. Since: 2.38
*/
opaque type GIconIface = CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]

object GIconIface:
  given _tag: Tag[GIconIface] = Tag.CArray[CChar, Nat.Digit2[Nat._5, Nat._6]](Tag.Byte, Tag.Digit2[Nat._5, Nat._6](Tag.Nat5, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GIconIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def hash: CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint]]]
      inline def hash_=(value: CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint]]] = value
      inline def equal: CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def equal_=(value: CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def to_tokens: CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def to_tokens_=(value: CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def from_tokens: CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]]]]
      inline def from_tokens_=(value: CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]]]] = value
      inline def serialize: CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]]
      inline def serialize_=(value: CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]] = value
    end extension
  
  // Allocates GIconIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GIconIface] = scala.scalanative.unsafe.alloc[GIconIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, hash : CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint], equal : CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean], to_tokens : CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean], from_tokens : CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]], serialize : CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]])(using Zone): Ptr[GIconIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).hash = hash
    (!____ptr).equal = equal
    (!____ptr).to_tokens = to_tokens
    (!____ptr).from_tokens = from_tokens
    (!____ptr).serialize = serialize
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](6)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GIcon], _root_.sn.gnome.glib.internal.guint]].toInt, alignmentof[CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr2[Ptr[GIcon], Ptr[GIcon], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr3[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GPtrArray], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr4[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIcon]]].toInt, alignmentof[CFuncPtr1[Ptr[GIcon], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt)
    res
  end offsets
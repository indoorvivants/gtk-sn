package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-enum-list-model.h
*/
opaque type AdwEnumListItem_autoptr = Ptr[AdwEnumListItem]
object AdwEnumListItem_autoptr:
  given _tag: Tag[AdwEnumListItem_autoptr] = Tag.Ptr[AdwEnumListItem](AdwEnumListItem._tag)
  inline def apply(inline o: Ptr[AdwEnumListItem]): AdwEnumListItem_autoptr = o
  extension (v: AdwEnumListItem_autoptr)
    inline def value: Ptr[AdwEnumListItem] = v
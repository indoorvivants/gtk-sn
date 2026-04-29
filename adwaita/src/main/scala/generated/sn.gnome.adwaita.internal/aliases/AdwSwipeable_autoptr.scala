package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipeable.h
*/
opaque type AdwSwipeable_autoptr = Ptr[AdwSwipeable]
object AdwSwipeable_autoptr:
  given _tag: Tag[AdwSwipeable_autoptr] = Tag.Ptr[AdwSwipeable](AdwSwipeable._tag)
  inline def apply(inline o: Ptr[AdwSwipeable]): AdwSwipeable_autoptr = o
  extension (v: AdwSwipeable_autoptr)
    inline def value: Ptr[AdwSwipeable] = v
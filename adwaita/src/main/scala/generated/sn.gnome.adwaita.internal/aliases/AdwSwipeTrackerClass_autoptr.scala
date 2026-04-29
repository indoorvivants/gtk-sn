package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-swipe-tracker.h
*/
opaque type AdwSwipeTrackerClass_autoptr = Ptr[AdwSwipeTrackerClass]
object AdwSwipeTrackerClass_autoptr:
  given _tag: Tag[AdwSwipeTrackerClass_autoptr] = Tag.Ptr[AdwSwipeTrackerClass](AdwSwipeTrackerClass._tag)
  inline def apply(inline o: Ptr[AdwSwipeTrackerClass]): AdwSwipeTrackerClass_autoptr = o
  extension (v: AdwSwipeTrackerClass_autoptr)
    inline def value: Ptr[AdwSwipeTrackerClass] = v
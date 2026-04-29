package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type gatomicrefcount = gint
object gatomicrefcount:
  given _tag: Tag[gatomicrefcount] = gint._tag
  inline def apply(inline o: gint): gatomicrefcount = o
  extension (v: gatomicrefcount)
    inline def value: gint = v
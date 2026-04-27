package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type FILE = libc.stdio.FILE
object FILE:
  val _tag: Tag[FILE] = summon[Tag[libc.stdio.FILE]]
  inline def apply(inline o: libc.stdio.FILE): FILE = o
  extension (v: FILE)
    inline def value: libc.stdio.FILE = v
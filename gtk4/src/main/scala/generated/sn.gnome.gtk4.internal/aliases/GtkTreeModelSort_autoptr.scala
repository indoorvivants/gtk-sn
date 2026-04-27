package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeModelSort_autoptr = Ptr[GtkTreeModelSort]
object GtkTreeModelSort_autoptr:
  given _tag: Tag[GtkTreeModelSort_autoptr] = Tag.Ptr[GtkTreeModelSort](GtkTreeModelSort._tag)
  inline def apply(inline o: Ptr[GtkTreeModelSort]): GtkTreeModelSort_autoptr = o
  extension (v: GtkTreeModelSort_autoptr)
    inline def value: Ptr[GtkTreeModelSort] = v
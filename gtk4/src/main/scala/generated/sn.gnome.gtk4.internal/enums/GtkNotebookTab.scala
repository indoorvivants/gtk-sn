package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkNotebookTab: _NOTEBOOK_TAB_FIRST: the first tab in the notebook _NOTEBOOK_TAB_LAST: the last tab in the notebook
*/
opaque type GtkNotebookTab = CUnsignedInt
object GtkNotebookTab extends _BindgenEnumCUnsignedInt[GtkNotebookTab]:
  given _tag: Tag[GtkNotebookTab] = Tag.UInt
  inline def define(inline a: Long): GtkNotebookTab = a.toUInt
  val GTK_NOTEBOOK_TAB_FIRST = define(0)
  val GTK_NOTEBOOK_TAB_LAST = define(1)
  def getName(value: GtkNotebookTab): Option[String] =
    value match
      case `GTK_NOTEBOOK_TAB_FIRST` => Some("GTK_NOTEBOOK_TAB_FIRST")
      case `GTK_NOTEBOOK_TAB_LAST` => Some("GTK_NOTEBOOK_TAB_LAST")
      case _ => _root_.scala.None
  extension (a: GtkNotebookTab)
    inline def &(b: GtkNotebookTab): GtkNotebookTab = a & b
    inline def |(b: GtkNotebookTab): GtkNotebookTab = a | b
    inline def is(b: GtkNotebookTab): Boolean = (a & b) == b
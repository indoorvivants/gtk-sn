package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleAutocomplete: _ACCESSIBLE_AUTOCOMPLETE_NONE: Automatic suggestions are not displayed. _ACCESSIBLE_AUTOCOMPLETE_INLINE: When a user is providing input, text suggesting one way to complete the provided input may be dynamically inserted after the caret. _ACCESSIBLE_AUTOCOMPLETE_LIST: When a user is providing input, an element containing a collection of values that could complete the provided input may be displayed. _ACCESSIBLE_AUTOCOMPLETE_BOTH: When a user is providing input, an element containing a collection of values that could complete the provided input may be displayed. If displayed, one value in the collection is automatically selected, and the text needed to complete the automatically selected value appears after the caret in the input.
*/
opaque type GtkAccessibleAutocomplete = CUnsignedInt
object GtkAccessibleAutocomplete extends _BindgenEnumCUnsignedInt[GtkAccessibleAutocomplete]:
  given _tag: Tag[GtkAccessibleAutocomplete] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleAutocomplete = a.toUInt
  val GTK_ACCESSIBLE_AUTOCOMPLETE_NONE = define(0)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE = define(1)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_LIST = define(2)
  val GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH = define(3)
  def getName(value: GtkAccessibleAutocomplete): Option[String] =
    value match
      case `GTK_ACCESSIBLE_AUTOCOMPLETE_NONE` => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_NONE")
      case `GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE` => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE")
      case `GTK_ACCESSIBLE_AUTOCOMPLETE_LIST` => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_LIST")
      case `GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH` => Some("GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleAutocomplete)
    inline def &(b: GtkAccessibleAutocomplete): GtkAccessibleAutocomplete = a & b
    inline def |(b: GtkAccessibleAutocomplete): GtkAccessibleAutocomplete = a | b
    inline def is(b: GtkAccessibleAutocomplete): Boolean = (a & b) == b
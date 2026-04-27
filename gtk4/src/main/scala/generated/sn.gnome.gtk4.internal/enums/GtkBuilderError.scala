package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBuilderError: _BUILDER_ERROR_INVALID_TYPE_FUNCTION: A type-func attribute didn’t name a function that returns a `GType`. _BUILDER_ERROR_UNHANDLED_TAG: The input contained a tag that `GtkBuilder` can’t handle. _BUILDER_ERROR_MISSING_ATTRIBUTE: An attribute that is required by `GtkBuilder` was missing. _BUILDER_ERROR_INVALID_ATTRIBUTE: `GtkBuilder` found an attribute that it doesn’t understand. _BUILDER_ERROR_INVALID_TAG: `GtkBuilder` found a tag that it doesn’t understand. _BUILDER_ERROR_MISSING_PROPERTY_VALUE: A required property value was missing. _BUILDER_ERROR_INVALID_VALUE: `GtkBuilder` couldn’t parse some attribute value. _BUILDER_ERROR_VERSION_MISMATCH: The input file requires a newer version of GTK. _BUILDER_ERROR_DUPLICATE_ID: An object id occurred twice. _BUILDER_ERROR_OBJECT_TYPE_REFUSED: A specified object type is of the same type or derived from the type of the composite class being extended with builder XML. _BUILDER_ERROR_TEMPLATE_MISMATCH: The wrong type was specified in a composite class’s template XML _BUILDER_ERROR_INVALID_PROPERTY: The specified property is unknown for the object class. _BUILDER_ERROR_INVALID_SIGNAL: The specified signal is unknown for the object class. _BUILDER_ERROR_INVALID_ID: An object id is unknown. _BUILDER_ERROR_INVALID_FUNCTION: A function could not be found. This often happens when symbols are set to be kept private. Compiling code with -rdynamic or using the `gmodule-export-2.0` pkgconfig module can fix this problem.
*/
opaque type GtkBuilderError = CUnsignedInt
object GtkBuilderError extends _BindgenEnumCUnsignedInt[GtkBuilderError]:
  given _tag: Tag[GtkBuilderError] = Tag.UInt
  inline def define(inline a: Long): GtkBuilderError = a.toUInt
  val GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION = define(0)
  val GTK_BUILDER_ERROR_UNHANDLED_TAG = define(1)
  val GTK_BUILDER_ERROR_MISSING_ATTRIBUTE = define(2)
  val GTK_BUILDER_ERROR_INVALID_ATTRIBUTE = define(3)
  val GTK_BUILDER_ERROR_INVALID_TAG = define(4)
  val GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE = define(5)
  val GTK_BUILDER_ERROR_INVALID_VALUE = define(6)
  val GTK_BUILDER_ERROR_VERSION_MISMATCH = define(7)
  val GTK_BUILDER_ERROR_DUPLICATE_ID = define(8)
  val GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED = define(9)
  val GTK_BUILDER_ERROR_TEMPLATE_MISMATCH = define(10)
  val GTK_BUILDER_ERROR_INVALID_PROPERTY = define(11)
  val GTK_BUILDER_ERROR_INVALID_SIGNAL = define(12)
  val GTK_BUILDER_ERROR_INVALID_ID = define(13)
  val GTK_BUILDER_ERROR_INVALID_FUNCTION = define(14)
  def getName(value: GtkBuilderError): Option[String] =
    value match
      case `GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION` => Some("GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION")
      case `GTK_BUILDER_ERROR_UNHANDLED_TAG` => Some("GTK_BUILDER_ERROR_UNHANDLED_TAG")
      case `GTK_BUILDER_ERROR_MISSING_ATTRIBUTE` => Some("GTK_BUILDER_ERROR_MISSING_ATTRIBUTE")
      case `GTK_BUILDER_ERROR_INVALID_ATTRIBUTE` => Some("GTK_BUILDER_ERROR_INVALID_ATTRIBUTE")
      case `GTK_BUILDER_ERROR_INVALID_TAG` => Some("GTK_BUILDER_ERROR_INVALID_TAG")
      case `GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE` => Some("GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE")
      case `GTK_BUILDER_ERROR_INVALID_VALUE` => Some("GTK_BUILDER_ERROR_INVALID_VALUE")
      case `GTK_BUILDER_ERROR_VERSION_MISMATCH` => Some("GTK_BUILDER_ERROR_VERSION_MISMATCH")
      case `GTK_BUILDER_ERROR_DUPLICATE_ID` => Some("GTK_BUILDER_ERROR_DUPLICATE_ID")
      case `GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED` => Some("GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED")
      case `GTK_BUILDER_ERROR_TEMPLATE_MISMATCH` => Some("GTK_BUILDER_ERROR_TEMPLATE_MISMATCH")
      case `GTK_BUILDER_ERROR_INVALID_PROPERTY` => Some("GTK_BUILDER_ERROR_INVALID_PROPERTY")
      case `GTK_BUILDER_ERROR_INVALID_SIGNAL` => Some("GTK_BUILDER_ERROR_INVALID_SIGNAL")
      case `GTK_BUILDER_ERROR_INVALID_ID` => Some("GTK_BUILDER_ERROR_INVALID_ID")
      case `GTK_BUILDER_ERROR_INVALID_FUNCTION` => Some("GTK_BUILDER_ERROR_INVALID_FUNCTION")
      case _ => _root_.scala.None
  extension (a: GtkBuilderError)
    inline def &(b: GtkBuilderError): GtkBuilderError = a & b
    inline def |(b: GtkBuilderError): GtkBuilderError = a | b
    inline def is(b: GtkBuilderError): Boolean = (a & b) == b
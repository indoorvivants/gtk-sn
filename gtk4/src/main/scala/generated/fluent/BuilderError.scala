package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkBuilderError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes that identify various errors that can occur while using
  * `GtkBuilder`.
  */
enum BuilderError(val raw: GtkBuilderError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A type-func attribute didn’t name a function that returns a `GType`.
    */
  case INVALID_TYPE_FUNCTION
      extends BuilderError(
        GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The input contained a tag that `GtkBuilder` can’t handle.
    */
  case UNHANDLED_TAG
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_UNHANDLED_TAG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An attribute that is required by `GtkBuilder` was missing.
    */
  case MISSING_ATTRIBUTE
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_MISSING_ATTRIBUTE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `GtkBuilder` found an attribute that it doesn’t understand.
    */
  case INVALID_ATTRIBUTE
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ATTRIBUTE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `GtkBuilder` found a tag that it doesn’t understand.
    */
  case INVALID_TAG
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TAG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A required property value was missing.
    */
  case MISSING_PROPERTY_VALUE
      extends BuilderError(
        GtkBuilderError.GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `GtkBuilder` couldn’t parse some attribute value.
    */
  case INVALID_VALUE
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_VALUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The input file requires a newer version of GTK.
    */
  case VERSION_MISMATCH
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_VERSION_MISMATCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An object id occurred twice.
    */
  case DUPLICATE_ID
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_DUPLICATE_ID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A specified object type is of the same type or derived from the type of
    * the composite class being extended with builder XML.
    */
  case OBJECT_TYPE_REFUSED
      extends BuilderError(
        GtkBuilderError.GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The wrong type was specified in a composite class’s template XML
    */
  case TEMPLATE_MISMATCH
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_TEMPLATE_MISMATCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The specified property is unknown for the object class.
    */
  case INVALID_PROPERTY
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_PROPERTY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The specified signal is unknown for the object class.
    */
  case INVALID_SIGNAL
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_SIGNAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An object id is unknown.
    */
  case INVALID_ID
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A function could not be found. This often happens when symbols are set to
    * be kept private. Compiling code with -rdynamic or using the
    * `gmodule-export-2.0` pkgconfig module can fix this problem.
    */
  case INVALID_FUNCTION
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_FUNCTION)
end BuilderError

object BuilderError:
  def fromRaw(raw: GtkBuilderError): BuilderError =
    raw match
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION =>
        BuilderError.INVALID_TYPE_FUNCTION
      case GtkBuilderError.GTK_BUILDER_ERROR_UNHANDLED_TAG =>
        BuilderError.UNHANDLED_TAG
      case GtkBuilderError.GTK_BUILDER_ERROR_MISSING_ATTRIBUTE =>
        BuilderError.MISSING_ATTRIBUTE
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ATTRIBUTE =>
        BuilderError.INVALID_ATTRIBUTE
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TAG =>
        BuilderError.INVALID_TAG
      case GtkBuilderError.GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE =>
        BuilderError.MISSING_PROPERTY_VALUE
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_VALUE =>
        BuilderError.INVALID_VALUE
      case GtkBuilderError.GTK_BUILDER_ERROR_VERSION_MISMATCH =>
        BuilderError.VERSION_MISMATCH
      case GtkBuilderError.GTK_BUILDER_ERROR_DUPLICATE_ID =>
        BuilderError.DUPLICATE_ID
      case GtkBuilderError.GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED =>
        BuilderError.OBJECT_TYPE_REFUSED
      case GtkBuilderError.GTK_BUILDER_ERROR_TEMPLATE_MISMATCH =>
        BuilderError.TEMPLATE_MISMATCH
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_PROPERTY =>
        BuilderError.INVALID_PROPERTY
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_SIGNAL =>
        BuilderError.INVALID_SIGNAL
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ID =>
        BuilderError.INVALID_ID
      case GtkBuilderError.GTK_BUILDER_ERROR_INVALID_FUNCTION =>
        BuilderError.INVALID_FUNCTION
  end fromRaw
end BuilderError

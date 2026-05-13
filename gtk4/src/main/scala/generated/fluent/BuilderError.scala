package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkBuilderError

/** Error codes that identify various errors that can occur while using
  * `GtkBuilder`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BuilderError(val raw: GtkBuilderError):
  /** A type-func attribute didn’t name a function that returns a `GType`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_TYPE_FUNCTION
      extends BuilderError(
        GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION
      )

  /** The input contained a tag that `GtkBuilder` can’t handle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNHANDLED_TAG
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_UNHANDLED_TAG)

  /** An attribute that is required by `GtkBuilder` was missing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_ATTRIBUTE
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_MISSING_ATTRIBUTE)

  /** `GtkBuilder` found an attribute that it doesn’t understand.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_ATTRIBUTE
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ATTRIBUTE)

  /** `GtkBuilder` found a tag that it doesn’t understand.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_TAG
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TAG)

  /** A required property value was missing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_PROPERTY_VALUE
      extends BuilderError(
        GtkBuilderError.GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE
      )

  /** `GtkBuilder` couldn’t parse some attribute value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_VALUE
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_VALUE)

  /** The input file requires a newer version of GTK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VERSION_MISMATCH
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_VERSION_MISMATCH)

  /** An object id occurred twice.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DUPLICATE_ID
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_DUPLICATE_ID)

  /** A specified object type is of the same type or derived from the type of
    * the composite class being extended with builder XML.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OBJECT_TYPE_REFUSED
      extends BuilderError(
        GtkBuilderError.GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED
      )

  /** The wrong type was specified in a composite class’s template XML
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TEMPLATE_MISMATCH
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_TEMPLATE_MISMATCH)

  /** The specified property is unknown for the object class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_PROPERTY
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_PROPERTY)

  /** The specified signal is unknown for the object class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_SIGNAL
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_SIGNAL)

  /** An object id is unknown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_ID
      extends BuilderError(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ID)

  /** A function could not be found. This often happens when symbols are set to
    * be kept private. Compiling code with -rdynamic or using the
    * `gmodule-export-2.0` pkgconfig module can fix this problem.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GVariantClass

/** The range of possible top-level types of #GVariant instances.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum VariantClass(val raw: GVariantClass):
  /** The #GVariant is a boolean.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOOLEAN extends VariantClass(GVariantClass.G_VARIANT_CLASS_BOOLEAN)

  /** The #GVariant is a byte.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BYTE extends VariantClass(GVariantClass.G_VARIANT_CLASS_BYTE)

  /** The #GVariant is a signed 16 bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT16 extends VariantClass(GVariantClass.G_VARIANT_CLASS_INT16)

  /** The #GVariant is an unsigned 16 bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UINT16 extends VariantClass(GVariantClass.G_VARIANT_CLASS_UINT16)

  /** The #GVariant is a signed 32 bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT32 extends VariantClass(GVariantClass.G_VARIANT_CLASS_INT32)

  /** The #GVariant is an unsigned 32 bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UINT32 extends VariantClass(GVariantClass.G_VARIANT_CLASS_UINT32)

  /** The #GVariant is a signed 64 bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT64 extends VariantClass(GVariantClass.G_VARIANT_CLASS_INT64)

  /** The #GVariant is an unsigned 64 bit integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UINT64 extends VariantClass(GVariantClass.G_VARIANT_CLASS_UINT64)

  /** The #GVariant is a file handle index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANDLE extends VariantClass(GVariantClass.G_VARIANT_CLASS_HANDLE)

  /** The #GVariant is a double precision floating point value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOUBLE extends VariantClass(GVariantClass.G_VARIANT_CLASS_DOUBLE)

  /** The #GVariant is a normal string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRING extends VariantClass(GVariantClass.G_VARIANT_CLASS_STRING)

  /** The #GVariant is a D-Bus object path string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OBJECT_PATH
      extends VariantClass(GVariantClass.G_VARIANT_CLASS_OBJECT_PATH)

  /** The #GVariant is a D-Bus signature string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIGNATURE extends VariantClass(GVariantClass.G_VARIANT_CLASS_SIGNATURE)

  /** The #GVariant is a variant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VARIANT extends VariantClass(GVariantClass.G_VARIANT_CLASS_VARIANT)

  /** The #GVariant is a maybe-typed value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MAYBE extends VariantClass(GVariantClass.G_VARIANT_CLASS_MAYBE)

  /** The #GVariant is an array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ARRAY extends VariantClass(GVariantClass.G_VARIANT_CLASS_ARRAY)

  /** The #GVariant is a tuple.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TUPLE extends VariantClass(GVariantClass.G_VARIANT_CLASS_TUPLE)

  /** The #GVariant is a dictionary entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DICT_ENTRY extends VariantClass(GVariantClass.G_VARIANT_CLASS_DICT_ENTRY)
end VariantClass

object VariantClass:
  def fromRaw(raw: GVariantClass): VariantClass =
    raw match
      case GVariantClass.G_VARIANT_CLASS_BOOLEAN     => VariantClass.BOOLEAN
      case GVariantClass.G_VARIANT_CLASS_BYTE        => VariantClass.BYTE
      case GVariantClass.G_VARIANT_CLASS_INT16       => VariantClass.INT16
      case GVariantClass.G_VARIANT_CLASS_UINT16      => VariantClass.UINT16
      case GVariantClass.G_VARIANT_CLASS_INT32       => VariantClass.INT32
      case GVariantClass.G_VARIANT_CLASS_UINT32      => VariantClass.UINT32
      case GVariantClass.G_VARIANT_CLASS_INT64       => VariantClass.INT64
      case GVariantClass.G_VARIANT_CLASS_UINT64      => VariantClass.UINT64
      case GVariantClass.G_VARIANT_CLASS_HANDLE      => VariantClass.HANDLE
      case GVariantClass.G_VARIANT_CLASS_DOUBLE      => VariantClass.DOUBLE
      case GVariantClass.G_VARIANT_CLASS_STRING      => VariantClass.STRING
      case GVariantClass.G_VARIANT_CLASS_OBJECT_PATH => VariantClass.OBJECT_PATH
      case GVariantClass.G_VARIANT_CLASS_SIGNATURE   => VariantClass.SIGNATURE
      case GVariantClass.G_VARIANT_CLASS_VARIANT     => VariantClass.VARIANT
      case GVariantClass.G_VARIANT_CLASS_MAYBE       => VariantClass.MAYBE
      case GVariantClass.G_VARIANT_CLASS_ARRAY       => VariantClass.ARRAY
      case GVariantClass.G_VARIANT_CLASS_TUPLE       => VariantClass.TUPLE
      case GVariantClass.G_VARIANT_CLASS_DICT_ENTRY  => VariantClass.DICT_ENTRY
  end fromRaw
end VariantClass

package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GVariantClass

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The range of possible top-level types of #GVariant instances.
  */
enum VariantClass(val raw: GVariantClass):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a boolean.
    */
  case BOOLEAN extends VariantClass(GVariantClass.G_VARIANT_CLASS_BOOLEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a byte.
    */
  case BYTE extends VariantClass(GVariantClass.G_VARIANT_CLASS_BYTE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a signed 16 bit integer.
    */
  case INT16 extends VariantClass(GVariantClass.G_VARIANT_CLASS_INT16)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is an unsigned 16 bit integer.
    */
  case UINT16 extends VariantClass(GVariantClass.G_VARIANT_CLASS_UINT16)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a signed 32 bit integer.
    */
  case INT32 extends VariantClass(GVariantClass.G_VARIANT_CLASS_INT32)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is an unsigned 32 bit integer.
    */
  case UINT32 extends VariantClass(GVariantClass.G_VARIANT_CLASS_UINT32)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a signed 64 bit integer.
    */
  case INT64 extends VariantClass(GVariantClass.G_VARIANT_CLASS_INT64)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is an unsigned 64 bit integer.
    */
  case UINT64 extends VariantClass(GVariantClass.G_VARIANT_CLASS_UINT64)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a file handle index.
    */
  case HANDLE extends VariantClass(GVariantClass.G_VARIANT_CLASS_HANDLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a double precision floating point value.
    */
  case DOUBLE extends VariantClass(GVariantClass.G_VARIANT_CLASS_DOUBLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a normal string.
    */
  case STRING extends VariantClass(GVariantClass.G_VARIANT_CLASS_STRING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a D-Bus object path string.
    */
  case OBJECT_PATH
      extends VariantClass(GVariantClass.G_VARIANT_CLASS_OBJECT_PATH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a D-Bus signature string.
    */
  case SIGNATURE extends VariantClass(GVariantClass.G_VARIANT_CLASS_SIGNATURE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a variant.
    */
  case VARIANT extends VariantClass(GVariantClass.G_VARIANT_CLASS_VARIANT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a maybe-typed value.
    */
  case MAYBE extends VariantClass(GVariantClass.G_VARIANT_CLASS_MAYBE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is an array.
    */
  case ARRAY extends VariantClass(GVariantClass.G_VARIANT_CLASS_ARRAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a tuple.
    */
  case TUPLE extends VariantClass(GVariantClass.G_VARIANT_CLASS_TUPLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The #GVariant is a dictionary entry.
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

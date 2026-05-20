package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.Variant
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gconstpointer,
  gdouble,
  gfloat,
  gint,
  gint64,
  gpointer,
  guchar,
  guint,
  guint64,
  gulong
}
import sn.gnome.gobject.{Object, ParamSpec, TypeInstance, Value}
import sn.gnome.gobject.internal.{GType, GValue}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** An opaque structure used to hold different types of values.
  *
  * The data within the structure has protected scope: it is accessible only to
  * functions within a #GTypeValueTable structure, or implementations of the
  * g_value_*() API. That is, code portions which implement new fundamental
  * types.
  *
  * #GValue users cannot make any assumptions about how data is stored within
  * the 2 element @data union, and the @g_type member should only be accessed
  * through the G_VALUE_TYPE() macro.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Value private[gnome] (raw: Ptr[GValue]):

  def getUnsafeRawPointer(): Ptr[GValue] = this.raw

  @annotation.compileTimeOnly("[field data]: key not found: @type")
  private def data__ = ???

  /** Copies the value of @src_value into @dest_value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(
      dest_value: sn.gnome.gobject.Value /* Some(Ptr[GValue]) */
  )(using Runtime): Unit /* None */ =
    g_value_copy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      dest_value.getUnsafeRawPointer().asInstanceOf
    )
  end copy

  /** Get the contents of a %G_TYPE_BOXED derived #GValue. Upon getting, the
    * boxed value is duplicated and needs to be later freed with g_boxed_free(),
    * e.g. like: g_boxed_free (G_VALUE_TYPE (@value), return_value);
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupBoxed(): Ptr[Byte] /* None */ =
    g_value_dup_boxed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end dupBoxed

  /** Get the contents of a %G_TYPE_OBJECT derived #GValue, increasing its
    * reference count. If the contents of the #GValue are %NULL, then %NULL will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupObject()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_value_dup_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
      ).asInstanceOf
    )
  end dupObject

  /** Get the contents of a %G_TYPE_PARAM #GValue, increasing its reference
    * count.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupParam()(using Runtime): sn.gnome.gobject.ParamSpec /* None */ =
    sn.gnome.gobject.ParamSpec.applyUnsafe(
      g_value_dup_param(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
      ).asInstanceOf
    )
  end dupParam

  /** Get a copy the contents of a %G_TYPE_STRING #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupString()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_value_dup_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
      ).asInstanceOf
    )
  end dupString

  /** Get the contents of a variant #GValue, increasing its refcount. The
    * returned #GVariant is never floating.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupVariant(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_value_dup_variant(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]])
    )
  end dupVariant

  /** Determines if @value will fit inside the size of a pointer value. This is
    * an internal function introduced mainly for C marshallers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fitsPointer(): Boolean /* None */ =
    g_value_fits_pointer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value.!=(0)
  end fitsPointer

  /** Get the contents of a %G_TYPE_BOOLEAN #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBoolean(): Boolean /* None */ =
    g_value_get_boolean(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value.!=(0)
  end getBoolean

  /** Get the contents of a %G_TYPE_BOXED derived #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBoxed(): Ptr[Byte] /* None */ =
    g_value_get_boxed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getBoxed

  /** Do not use this function; it is broken on platforms where the %char type
    * is unsigned, such as ARM and PowerPC. See g_value_get_schar().
    *
    * Get the contents of a %G_TYPE_CHAR #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChar(): Byte /* None */ =
    g_value_get_char(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]).value
  end getChar

  /** Get the contents of a %G_TYPE_DOUBLE #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDouble(): Double /* None */ =
    g_value_get_double(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getDouble

  /** Get the contents of a %G_TYPE_ENUM #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnum(): Int /* None */ =
    g_value_get_enum(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]).value
  end getEnum

  /** Get the contents of a %G_TYPE_FLAGS #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): UInt /* None */ =
    g_value_get_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getFlags

  /** Get the contents of a %G_TYPE_FLOAT #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFloat(): Float /* None */ =
    g_value_get_float(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getFloat

  /** Get the contents of a %G_TYPE_GTYPE #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGtype(): GType /* None */ =
    g_value_get_gtype(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]])
  end getGtype

  /** Get the contents of a %G_TYPE_INT #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt(): Int /* None */ =
    g_value_get_int(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]).value
  end getInt

  /** Get the contents of a %G_TYPE_INT64 #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt64(): CLongInt /* None */ =
    g_value_get_int64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getInt64

  /** Get the contents of a %G_TYPE_LONG #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_long/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def getLong__ = ???

  /** Get the contents of a %G_TYPE_OBJECT derived #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObject()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_value_get_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
      ).asInstanceOf
    )
  end getObject

  /** Get the contents of a %G_TYPE_PARAM #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParam()(using Runtime): sn.gnome.gobject.ParamSpec /* None */ =
    sn.gnome.gobject.ParamSpec.applyUnsafe(
      g_value_get_param(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
      ).asInstanceOf
    )
  end getParam

  /** Get the contents of a pointer #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPointer(): Ptr[Byte] /* None */ =
    g_value_get_pointer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getPointer

  /** Get the contents of a %G_TYPE_CHAR #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_schar/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8)))"
  )
  private def getSchar__ = ???

  /** Get the contents of a %G_TYPE_STRING #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString(): scala.Predef.String /* None */ =
    fromCString(
      g_value_get_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
      ).asInstanceOf
    )
  end getString

  /** Get the contents of a %G_TYPE_UCHAR #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUchar(): UByte /* None */ =
    g_value_get_uchar(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getUchar

  /** Get the contents of a %G_TYPE_UINT #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint(): UInt /* None */ =
    g_value_get_uint(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]).value
  end getUint

  /** Get the contents of a %G_TYPE_UINT64 #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint64(): CUnsignedLongInt /* None */ =
    g_value_get_uint64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getUint64

  /** Get the contents of a %G_TYPE_ULONG #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUlong(): CUnsignedLongInt /* None */ =
    g_value_get_ulong(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end getUlong

  /** Get the contents of a variant #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVariant(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_value_get_variant(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]])
    )
  end getVariant

  /** Initializes @value with the default value of @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      g_type: GType /* Some(GType) */
  )(using Runtime): sn.gnome.gobject.Value /* None */ =
    sn.gnome.gobject.Value.fromRaw(
      g_value_init(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]], g_type)
    )
  end init

  /** Initializes and sets @value from an instantiatable type via the
    * value_table's collect_value() function.
    *
    * Note: The @value will be initialised with the exact type of
    * @instance.
    *   If you wish to set the @value's type to a different GType (such as a
    *   parent class GType), you need to manually call g_value_init() and
    *   g_value_set_instance().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initFromInstance(
      instance: sn.gnome.gobject.TypeInstance /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* None */ =
    g_value_init_from_instance(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      instance.getUnsafeRawPointer().asInstanceOf
    )
  end initFromInstance

  /** Returns the value contents as pointer. This function asserts that
    * g_value_fits_pointer() returned %TRUE for the passed in value. This is an
    * internal function introduced mainly for C marshallers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekPointer(): Ptr[Byte] /* None */ =
    g_value_peek_pointer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]]
    ).value
  end peekPointer

  /** Clears the current value in @value and resets it to the default value (as
    * if the value had just been initialized).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reset()(using Runtime): sn.gnome.gobject.Value /* None */ =
    sn.gnome.gobject.Value.fromRaw(
      g_value_reset(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]])
    )
  end reset

  /** Set the contents of a %G_TYPE_BOOLEAN #GValue to @v_boolean.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBoolean(
      v_boolean: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_value_set_boolean(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gboolean(gint((if v_boolean == true then 1 else 0)))
    )
  end setBoolean

  /** Set the contents of a %G_TYPE_BOXED derived #GValue to @v_boxed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBoxed(
      v_boxed: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
      ]
  ): Unit /* None */ =
    g_value_set_boxed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_boxed
        .map[_root_.sn.gnome.glib.internal.gconstpointer](o => gconstpointer(o))
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
        )
    )
  end setBoxed

  /** This is an internal function introduced mainly for C marshallers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBoxedTakeOwnership(
      v_boxed: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
      ]
  ): Unit /* None */ =
    g_value_set_boxed_take_ownership(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_boxed
        .map[_root_.sn.gnome.glib.internal.gconstpointer](o => gconstpointer(o))
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
        )
    )
  end setBoxedTakeOwnership

  /** Set the contents of a %G_TYPE_CHAR #GValue to @v_char.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChar(
      v_char: Byte /* Some(_root_.sn.gnome.glib.internal.gchar) */
  ): Unit /* None */ =
    g_value_set_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gchar(v_char)
    )
  end setChar

  /** Set the contents of a %G_TYPE_DOUBLE #GValue to @v_double.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDouble(
      v_double: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */
  ): Unit /* None */ =
    g_value_set_double(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gdouble(v_double)
    )
  end setDouble

  /** Set the contents of a %G_TYPE_ENUM #GValue to @v_enum.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnum(
      v_enum: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_value_set_enum(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gint(v_enum)
    )
  end setEnum

  /** Set the contents of a %G_TYPE_FLAGS #GValue to @v_flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      v_flags: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_value_set_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      guint(v_flags)
    )
  end setFlags

  /** Set the contents of a %G_TYPE_FLOAT #GValue to @v_float.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFloat(
      v_float: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */
  ): Unit /* None */ =
    g_value_set_float(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gfloat(v_float)
    )
  end setFloat

  /** Set the contents of a %G_TYPE_GTYPE #GValue to @v_gtype.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setGtype(v_gtype: GType /* Some(GType) */ ): Unit /* None */ =
    g_value_set_gtype(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_gtype
    )
  end setGtype

  /** Sets @value from an instantiatable type via the value_table's
    * collect_value() function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInstance(
      instance: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ =
    g_value_set_instance(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      instance
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end setInstance

  /** Set the contents of a %G_TYPE_INT #GValue to @v_int.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInt(
      v_int: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_value_set_int(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gint(v_int)
    )
  end setInt

  /** Set the contents of a %G_TYPE_INT64 #GValue to @v_int64.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInt64(
      v_int64: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  ): Unit /* None */ =
    g_value_set_int64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gint64(v_int64)
    )
  end setInt64

  /** Set the contents of a %G_TYPE_STRING #GValue to @v_string. The string is
    * assumed to be static and interned (canonical, for example from
    * g_intern_string()), and is thus not duplicated when setting the #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInternedString(
      v_string: Option[
        scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_value_set_interned_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_string
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setInternedString

  /** Set the contents of a %G_TYPE_LONG #GValue to @v_long.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_long/<method parameters>/v_long]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def setLong__ = ???

  /** Set the contents of a %G_TYPE_OBJECT derived #GValue to @v_object.
    *
    * g_value_set_object() increases the reference count of @v_object (the
    * #GValue holds a reference to @v_object). If you do not wish to increase
    * the reference count of the object (i.e. you wish to pass your current
    * reference to the #GValue because you no longer need it), use
    * g_value_take_object() instead.
    *
    * It is important that your #GValue holds a reference to @v_object (either
    * its own, or one it has taken) to ensure that the object won't be destroyed
    * while the #GValue still exists).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setObject(
      v_object: Option[
        sn.gnome.gobject.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Runtime): Unit /* None */ =
    g_value_set_object(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_object
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end setObject

  /** This is an internal function introduced mainly for C marshallers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setObjectTakeOwnership(
      v_object: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ =
    g_value_set_object_take_ownership(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_object
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end setObjectTakeOwnership

  /** Set the contents of a %G_TYPE_PARAM #GValue to @param.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setParam(
      param: Option[sn.gnome.gobject.ParamSpec /* Some(Ptr[GParamSpec]) */ ]
  )(using Runtime): Unit /* None */ =
    g_value_set_param(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      param
        .map[Ptr[GParamSpec]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GParamSpec]])
    )
  end setParam

  /** This is an internal function introduced mainly for C marshallers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setParamTakeOwnership(
      param: Option[sn.gnome.gobject.ParamSpec /* Some(Ptr[GParamSpec]) */ ]
  )(using Runtime): Unit /* None */ =
    g_value_set_param_take_ownership(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      param
        .map[Ptr[GParamSpec]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GParamSpec]])
    )
  end setParamTakeOwnership

  /** Set the contents of a pointer #GValue to @v_pointer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPointer(
      v_pointer: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ =
    g_value_set_pointer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_pointer
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end setPointer

  /** Set the contents of a %G_TYPE_CHAR #GValue to @v_char.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_schar/<method parameters>/v_char]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8)))"
  )
  private def setSchar__ = ???

  /** Set the contents of a %G_TYPE_BOXED derived #GValue to @v_boxed.
    *
    * The boxed value is assumed to be static, and is thus not duplicated when
    * setting the #GValue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStaticBoxed(
      v_boxed: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
      ]
  ): Unit /* None */ =
    g_value_set_static_boxed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_boxed
        .map[_root_.sn.gnome.glib.internal.gconstpointer](o => gconstpointer(o))
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
        )
    )
  end setStaticBoxed

  /** Set the contents of a %G_TYPE_STRING #GValue to @v_string. The string is
    * assumed to be static, and is thus not duplicated when setting the #GValue.
    *
    * If the the string is a canonical string, using
    * g_value_set_interned_string() is more appropriate.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStaticString(
      v_string: Option[
        scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_value_set_static_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_string
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setStaticString

  /** Set the contents of a %G_TYPE_STRING #GValue to a copy of @v_string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setString(
      v_string: Option[
        scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_value_set_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_string
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setString

  /** This is an internal function introduced mainly for C marshallers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStringTakeOwnership(
      v_string: Option[
        scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_value_set_string_take_ownership(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_string
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setStringTakeOwnership

  /** Set the contents of a %G_TYPE_UCHAR #GValue to @v_uchar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUchar(
      v_uchar: UByte /* Some(_root_.sn.gnome.glib.internal.guchar) */
  ): Unit /* None */ =
    g_value_set_uchar(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      guchar(v_uchar)
    )
  end setUchar

  /** Set the contents of a %G_TYPE_UINT #GValue to @v_uint.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUint(
      v_uint: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_value_set_uint(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      guint(v_uint)
    )
  end setUint

  /** Set the contents of a %G_TYPE_UINT64 #GValue to @v_uint64.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUint64(
      v_uint64: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */
  ): Unit /* None */ =
    g_value_set_uint64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      guint64(v_uint64)
    )
  end setUint64

  /** Set the contents of a %G_TYPE_ULONG #GValue to @v_ulong.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUlong(
      v_ulong: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Unit /* None */ =
    g_value_set_ulong(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      gulong(v_ulong)
    )
  end setUlong

  /** Set the contents of a variant #GValue to @variant. If the variant is
    * floating, it is consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVariant(
      variant: Option[
        sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
      ]
  ): Unit /* None */ =
    g_value_set_variant(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      variant
        .map[Ptr[_root_.sn.gnome.glib.internal.GVariant]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GVariant]]
        )
    )
  end setVariant

  /** Sets the contents of a %G_TYPE_BOXED derived #GValue to @v_boxed and takes
    * over the ownership of the caller’s reference to @v_boxed; the caller
    * doesn’t have to unref it any more.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeBoxed(
      v_boxed: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
      ]
  ): Unit /* None */ =
    g_value_take_boxed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_boxed
        .map[_root_.sn.gnome.glib.internal.gconstpointer](o => gconstpointer(o))
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
        )
    )
  end takeBoxed

  /** Sets the contents of a %G_TYPE_OBJECT derived #GValue to @v_object and
    * takes over the ownership of the caller’s reference to @v_object; the
    * caller doesn’t have to unref it any more (i.e. the reference count of the
    * object is not increased).
    *
    * If you want the #GValue to hold its own reference to @v_object, use
    * g_value_set_object() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeObject(
      v_object: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ =
    g_value_take_object(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_object
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end takeObject

  /** Sets the contents of a %G_TYPE_PARAM #GValue to @param and takes over the
    * ownership of the caller’s reference to @param; the caller doesn’t have to
    * unref it any more.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeParam(
      param: Option[sn.gnome.gobject.ParamSpec /* Some(Ptr[GParamSpec]) */ ]
  )(using Runtime): Unit /* None */ =
    g_value_take_param(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      param
        .map[Ptr[GParamSpec]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GParamSpec]])
    )
  end takeParam

  /** Sets the contents of a %G_TYPE_STRING #GValue to @v_string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeString(
      v_string: Option[
        scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_value_take_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      v_string
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end takeString

  /** Set the contents of a variant #GValue to @variant, and takes over the
    * ownership of the caller's reference to @variant; the caller doesn't have
    * to unref it any more (i.e. the reference count of the variant is not
    * increased).
    *
    * If @variant was floating then its floating reference is converted to a
    * hard reference.
    *
    * If you want the #GValue to hold its own reference to @variant, use
    * g_value_set_variant() instead.
    *
    * This is an internal function introduced mainly for C marshallers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeVariant(
      variant: Option[
        sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
      ]
  ): Unit /* None */ =
    g_value_take_variant(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      variant
        .map[Ptr[_root_.sn.gnome.glib.internal.GVariant]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GVariant]]
        )
    )
  end takeVariant

  /** Tries to cast the contents of @src_value into a type appropriate to store
    * in @dest_value, e.g. to transform a %G_TYPE_INT value into a %G_TYPE_FLOAT
    * value. Performing transformations between value types might incur
    * precision lossage. Especially transformations into strings might reveal
    * seemingly arbitrary results and shouldn't be relied upon for production
    * code (such as rcfile value or object property serialization).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def transform(
      dest_value: sn.gnome.gobject.Value /* Some(Ptr[GValue]) */
  )(using Runtime): Boolean /* None */ =
    g_value_transform(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]],
      dest_value.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end transform

  /** Clears the current value in @value (if any) and "unsets" the type, this
    * releases all resources associated with this GValue. An unset value is the
    * same as an uninitialized (zero-filled) #GValue structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unset(): Unit /* None */ =
    g_value_unset(this.getUnsafeRawPointer().asInstanceOf[Ptr[GValue]])
  end unset

end Value

object Value:
  def fromRaw(ptr: Ptr[GValue]): Value = new Value(ptr)
end Value

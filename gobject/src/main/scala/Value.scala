package sn.gnome.gobject

import internal.*

import runtime.Runtime

import scalanative.unsafe.*
import scalanative.unsigned
import sn.gnome.glib.internal.*

enum ValueData:
  case Int(value: scala.Int)
  case Int64(value: scala.Long)
  case Long(value: Size)
  case Float(value: scala.Float)
  case Double(value: scala.Double)
  case Str(value: java.lang.String)
  case UInt(value: unsigned.UInt)
  case ULong(value: unsigned.USize)
  case UInt64(value: unsigned.USize)
  case Bool(value: scala.Boolean)
  case Obj(value: sn.gnome.gobject.Object)
  case Pointer(value: Ptr[Byte])
  case Type(tpe: GType)
end ValueData

final class Value private (
    raw: Ptr[GValue],
    private var _data: Option[ValueData]
):
  def getUnsafeRawPointer(): Ptr[GValue] = raw.asInstanceOf

  def data: Option[ValueData] = _data

  def set(data: ValueData)(using r: Runtime) =
    val oldData = this.data

    import Value.*

    val dataGtype = gtype(data)

    val typeChange = internal.valueGType(raw) != dataGtype

    if typeChange then
      g_value_unset(raw)
      g_value_init(raw, dataGtype)

    data match
      case ValueData.Int(value)   => g_value_set_int(raw, gint(value))
      case ValueData.Int64(value) =>
        g_value_set_int64(raw, gint64(value.toSize))
      case ValueData.Long(value)   => g_value_set_long(raw, glong(value))
      case ValueData.Float(value)  => g_value_set_float(raw, gfloat(value))
      case ValueData.Double(value) => g_value_set_double(raw, gdouble(value))
      case ValueData.Str(value)    =>
        r.inZone(
          g_value_set_string(raw, toCString(value).asInstanceOf[Ptr[gchar]])
        )
      case ValueData.UInt(value)   => g_value_set_uint(raw, guint(value))
      case ValueData.UInt64(value) => g_value_set_uint64(raw, guint64(value))
      case ValueData.ULong(value)  => g_value_set_ulong(raw, gulong(value))
      case ValueData.Bool(value)   =>
        g_value_set_boolean(raw, gboolean(gint(if value then 1 else 0)))
      case ValueData.Obj(value) =>
        g_value_set_object(raw, gpointer(value.getUnsafeRawPointer()))
      case ValueData.Pointer(value) => g_value_set_pointer(raw, gpointer(value))
      case ValueData.Type(tpe)      => g_value_set_gtype(raw, tpe)
    end match

    _data = Some(data)

  end set

end Value

object Value:

  import internal.*

  def init(data: ValueData)(using r: Runtime): Value =
    r.inZone:
      val raw = GValue()
      val tpe = gtype(data)
      g_value_init(raw, tpe)
      data match
        case ValueData.Type(tpe)  => g_value_set_gtype(raw, tpe)
        case ValueData.Int(value) =>
          g_value_set_int(raw, gint(value))
        case ValueData.Int64(value) =>
          g_value_set_int64(raw, gint64(value.toSize))
        case ValueData.Long(value) =>
          g_value_set_long(raw, glong(value))
        case ValueData.Float(value) =>
          g_value_set_float(raw, gfloat(value))
        case ValueData.Double(value) =>
          g_value_set_double(raw, gdouble(value))
        case ValueData.Str(value) =>
          g_value_set_string(raw, toCString(value).asInstanceOf[Ptr[gchar]])
        case ValueData.UInt(value) =>
          g_value_set_uint(raw, guint(value))
        case ValueData.UInt64(value) =>
          g_value_set_uint64(raw, guint64(value))
        case ValueData.Bool(value) =>
          g_value_set_boolean(raw, gboolean(gint(if value then 1 else 0)))
        case ValueData.Obj(value) =>
          g_value_set_object(
            raw,
            gpointer(value.getUnsafeRawPointer())
          )
        case ValueData.ULong(value) =>
          g_value_set_ulong(raw, gulong(value))

        case ValueData.Pointer(value) =>
          g_value_set_pointer(raw, gpointer(value))
      end match

      Value(raw, Some(data))

  end init

  def fromRaw(ptr: Ptr[GValue])(using r: Runtime): Value =
    val gtype = internal.valueGType(ptr)
    gtype match
      case gtypes.gtype =>
        Value(ptr, Some(ValueData.Type(g_value_get_gtype(ptr))))
      case gtypes.int =>
        Value(ptr, Some(ValueData.Int(g_value_get_int(ptr).value)))
      case gtypes.int64 =>
        Value(ptr, Some(ValueData.Int64(g_value_get_int64(ptr).value.toLong)))
      case gtypes.long =>
        Value(ptr, Some(ValueData.Long(g_value_get_long(ptr).value)))
      case gtypes.float =>
        Value(ptr, Some(ValueData.Float(g_value_get_float(ptr).value)))
      case gtypes.double =>
        Value(ptr, Some(ValueData.Double(g_value_get_double(ptr).value)))
      case gtypes.string =>
        Value(
          ptr,
          Some(ValueData.Str(fromCString(g_value_get_string(ptr).asInstanceOf)))
        )
      case gtypes.uint =>
        Value(ptr, Some(ValueData.UInt(g_value_get_uint(ptr).value)))
      case gtypes.uint64 =>
        Value(ptr, Some(ValueData.UInt64(g_value_get_uint64(ptr).value)))
      case gtypes.pointer =>
        Value(ptr, Some(ValueData.Pointer(g_value_get_pointer(ptr).value)))
      case gtypes.boolean =>
        Value(ptr, Some(ValueData.Bool(g_value_get_boolean(ptr).value == 1)))
      case gtypes.obj =>
        // how to deal with class?
        val obj =
          Object.applyUnsafe(g_value_get_object(ptr).asInstanceOf[Ptr[GObject]])
        Value(ptr, Some(ValueData.Obj(obj)))
      case gtypes.ulong =>
        Value(ptr, Some(ValueData.ULong(g_value_get_ulong(ptr).value)))
      case _ => Value(ptr, None)
    end match
  end fromRaw

  private object gtypes:
    lazy val int: GType = gtypeInt()
    lazy val long: GType = gtypeLong()
    lazy val float: GType = gtypeFloat()
    lazy val double: GType = gtypeDouble()
    lazy val string: GType = gtypeString()
    lazy val uint: GType = gtypeUInt()
    lazy val uint64: GType = gtypeUInt64()
    lazy val pointer: GType = gtypePointer()
    lazy val boolean: GType = gtypeBoolean()
    lazy val obj: GType = gtypeObject()
    lazy val ulong: GType = gtypeULong()
    lazy val gtype: GType = gtypeGType()
    lazy val int64: GType = gtypeInt64()
  end gtypes

  private def gtype(of: ValueData) = of match
    case ValueData.Int(value)     => gtypes.int
    case ValueData.Long(value)    => gtypes.long
    case ValueData.Float(value)   => gtypes.float
    case ValueData.Double(value)  => gtypes.double
    case ValueData.Str(value)     => gtypes.string
    case ValueData.UInt(value)    => gtypes.uint
    case ValueData.UInt64(value)  => gtypes.uint64
    case ValueData.ULong(value)   => gtypes.ulong
    case ValueData.Bool(value)    => gtypes.boolean
    case ValueData.Obj(value)     => gtypes.obj
    case ValueData.Pointer(value) => gtypes.pointer
    case ValueData.Type(tpe)      => gtypes.gtype
    case ValueData.Int64(value)   => gtypes.int64

  private[Value] object internal:
    @extern
    @name("__sn_gnome_value_read_gtype")
    def valueGType(ptr: Ptr[GValue]): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_pointer")
    def gtypePointer(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_boolean")
    def gtypeBoolean(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_int")
    def gtypeInt(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_long")
    def gtypeLong(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_gtype")
    def gtypeGType(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_float")
    def gtypeFloat(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_double")
    def gtypeDouble(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_string")
    def gtypeString(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_uint")
    def gtypeUInt(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_uint64")
    def gtypeUInt64(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_int64")
    def gtypeInt64(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_object")
    def gtypeObject(): GType = extern

    @extern
    @name("__sn_gnome_value_gtype_ulong")
    def gtypeULong(): GType = extern
  end internal
end Value

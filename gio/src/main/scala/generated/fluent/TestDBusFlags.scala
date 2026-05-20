package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTestDBusFlags

/** Flags to define future #GTestDBus behaviour.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TestDBusFlags private (val raw: GTestDBusFlags):
  def is(kv: TestDBusFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[TestDBusFlags.KnownValue]
    TestDBusFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TestDBusFlags(${sb.result().mkString(", ")})"
end TestDBusFlags

object TestDBusFlags:
  export KnownValue.*

  def fromRaw(raw: GTestDBusFlags) = new TestDBusFlags(raw)

  extension (af: TestDBusFlags)
    def &(other: TestDBusFlags) =
      TestDBusFlags(af.raw & other.raw)
    def |(other: TestDBusFlags) =
      TestDBusFlags(af.raw | other.raw)

  /** Flags to define future #GTestDBus behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GTestDBusFlags, name: scala.Predef.String)
      extends TestDBusFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GTestDBusFlags.G_TEST_DBUS_NONE, "NONE")
  end KnownValue
end TestDBusFlags

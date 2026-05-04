package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTestDBusFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags to define future #GTestDBus behaviour.
  */
class TestDBusFlags private (val raw: GTestDBusFlags):
  def is(kv: TestDBusFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TestDBusFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags to define future #GTestDBus behaviour.
    */
  enum KnownValue(override val raw: GTestDBusFlags, name: String)
      extends TestDBusFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags.
      */
    case NONE extends KnownValue(GTestDBusFlags.G_TEST_DBUS_NONE, "NONE")
  end KnownValue
end TestDBusFlags

package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GOptionFlags

/** Flags which modify individual options.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OptionFlags private (val raw: GOptionFlags):
  def is(kv: OptionFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[OptionFlags.KnownValue]
    OptionFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"OptionFlags(${sb.result().mkString(", ")})"
end OptionFlags

object OptionFlags:
  export KnownValue.*

  def fromRaw(raw: GOptionFlags) = new OptionFlags(raw)

  extension (af: OptionFlags)
    def &(other: OptionFlags) =
      OptionFlags(af.raw & other.raw)
    def |(other: OptionFlags) =
      OptionFlags(af.raw | other.raw)

  /** Flags which modify individual options.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GOptionFlags, name: scala.Predef.String)
      extends OptionFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags. Since: 2.42.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GOptionFlags.G_OPTION_FLAG_NONE, "NONE")

    /** The option doesn't appear in `--help` output.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HIDDEN extends KnownValue(GOptionFlags.G_OPTION_FLAG_HIDDEN, "HIDDEN")

    /** The option appears in the main section of the `--help` output, even if
      * it is defined in a group.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IN_MAIN
        extends KnownValue(GOptionFlags.G_OPTION_FLAG_IN_MAIN, "IN_MAIN")

    /** For options of the %G_OPTION_ARG_NONE kind, this flag indicates that the
      * sense of the option is reversed. i.e. %FALSE will be stored into the
      * argument rather than %TRUE.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case REVERSE
        extends KnownValue(GOptionFlags.G_OPTION_FLAG_REVERSE, "REVERSE")

    /** For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that
      * the callback does not take any argument (like a %G_OPTION_ARG_NONE
      * option). Since 2.8
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_ARG extends KnownValue(GOptionFlags.G_OPTION_FLAG_NO_ARG, "NO_ARG")

    /** For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that
      * the argument should be passed to the callback in the GLib filename
      * encoding rather than UTF-8. Since 2.8
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FILENAME
        extends KnownValue(GOptionFlags.G_OPTION_FLAG_FILENAME, "FILENAME")

    /** For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that
      * the argument supply is optional. If no argument is given then data of
      * %GOptionParseFunc will be set to NULL. Since 2.8
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case OPTIONAL_ARG
        extends KnownValue(
          GOptionFlags.G_OPTION_FLAG_OPTIONAL_ARG,
          "OPTIONAL_ARG"
        )

    /** This flag turns off the automatic conflict resolution which prefixes
      * long option names with `groupname-` if there is a conflict. This option
      * should only be used in situations where aliasing is necessary to model
      * some legacy commandline interface. It is not safe to use this option,
      * unless all option groups are under your direct control. Since 2.8.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NOALIAS
        extends KnownValue(GOptionFlags.G_OPTION_FLAG_NOALIAS, "NOALIAS")
  end KnownValue
end OptionFlags

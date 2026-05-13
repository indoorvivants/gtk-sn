package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GOptionArg

/** The #GOptionArg enum values determine which type of extra argument the
  * options expect to find. If an option expects an extra argument, it can be
  * specified in several ways; with a short option: `-x arg`, with a long
  * option: `--name arg` or combined in a single argument: `--name=arg`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum OptionArg(val raw: GOptionArg):
  /** No extra argument. This is useful for simple flags or booleans.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends OptionArg(GOptionArg.G_OPTION_ARG_NONE)

  /** The option takes a UTF-8 string argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRING extends OptionArg(GOptionArg.G_OPTION_ARG_STRING)

  /** The option takes an integer argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT extends OptionArg(GOptionArg.G_OPTION_ARG_INT)

  /** The option provides a callback (of type #GOptionArgFunc) to parse the
    * extra argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CALLBACK extends OptionArg(GOptionArg.G_OPTION_ARG_CALLBACK)

  /** The option takes a filename as argument, which will be in the GLib
    * filename encoding rather than UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILENAME extends OptionArg(GOptionArg.G_OPTION_ARG_FILENAME)

  /** The option takes a string argument, multiple uses of the option are
    * collected into an array of strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRING_ARRAY extends OptionArg(GOptionArg.G_OPTION_ARG_STRING_ARRAY)

  /** The option takes a filename as argument, multiple uses of the option are
    * collected into an array of strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILENAME_ARRAY extends OptionArg(GOptionArg.G_OPTION_ARG_FILENAME_ARRAY)

  /** The option takes a double argument. The argument can be formatted either
    * for the user's locale or for the "C" locale. Since 2.12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOUBLE extends OptionArg(GOptionArg.G_OPTION_ARG_DOUBLE)

  /** The option takes a 64-bit integer. Like %G_OPTION_ARG_INT but for larger
    * numbers. The number can be in decimal base, or in hexadecimal (when
    * prefixed with `0x`, for example, `0xffffffff`). Since 2.12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT64 extends OptionArg(GOptionArg.G_OPTION_ARG_INT64)
end OptionArg

object OptionArg:
  def fromRaw(raw: GOptionArg): OptionArg =
    raw match
      case GOptionArg.G_OPTION_ARG_NONE           => OptionArg.NONE
      case GOptionArg.G_OPTION_ARG_STRING         => OptionArg.STRING
      case GOptionArg.G_OPTION_ARG_INT            => OptionArg.INT
      case GOptionArg.G_OPTION_ARG_CALLBACK       => OptionArg.CALLBACK
      case GOptionArg.G_OPTION_ARG_FILENAME       => OptionArg.FILENAME
      case GOptionArg.G_OPTION_ARG_STRING_ARRAY   => OptionArg.STRING_ARRAY
      case GOptionArg.G_OPTION_ARG_FILENAME_ARRAY => OptionArg.FILENAME_ARRAY
      case GOptionArg.G_OPTION_ARG_DOUBLE         => OptionArg.DOUBLE
      case GOptionArg.G_OPTION_ARG_INT64          => OptionArg.INT64
  end fromRaw
end OptionArg

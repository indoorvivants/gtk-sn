package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GApplicationCommandLineClass

/** The #GApplicationCommandLineClass-struct contains private data only.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ApplicationCommandLineClass private[gnome] (
    raw: Ptr[GApplicationCommandLineClass]
):

  def getUnsafeRawPointer(): Ptr[GApplicationCommandLineClass] = this.raw

  @annotation.compileTimeOnly("[field print_literal]: Field is missing <type>")
  private def printLiteral__ = ???
  @annotation.compileTimeOnly(
    "[field printerr_literal]: Field is missing <type>"
  )
  private def printerrLiteral__ = ???
  @annotation.compileTimeOnly("[field get_stdin]: Field is missing <type>")
  private def getStdin__ = ???

end ApplicationCommandLineClass

object ApplicationCommandLineClass:
  def fromRaw(
      ptr: Ptr[GApplicationCommandLineClass]
  ): ApplicationCommandLineClass = new ApplicationCommandLineClass(ptr)
end ApplicationCommandLineClass

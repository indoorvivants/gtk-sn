package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkBuildableParser

/** A sub-parser for `GtkBuildable` implementations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BuildableParser private[gnome] (raw: Ptr[GtkBuildableParser]):

  def getUnsafeRawPointer(): Ptr[GtkBuildableParser] = this.raw
  @annotation.compileTimeOnly("[field start_element]: Field is missing <type>")
  private def startElement__ = ???
  @annotation.compileTimeOnly("[field end_element]: Field is missing <type>")
  private def endElement__ = ???
  @annotation.compileTimeOnly("[field text]: Field is missing <type>")
  private def text__ = ???
  @annotation.compileTimeOnly("[field error]: Field is missing <type>")
  private def error__ = ???

end BuildableParser

object BuildableParser:
  def fromRaw(ptr: Ptr[GtkBuildableParser]): BuildableParser =
    new BuildableParser(ptr)
end BuildableParser

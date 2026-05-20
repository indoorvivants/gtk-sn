package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GMarkupParser

/** Any of the fields in #GMarkupParser can be %NULL, in which case they will be
  * ignored. Except for the @error function, any of these callbacks can set an
  * error; in particular the %G_MARKUP_ERROR_UNKNOWN_ELEMENT,
  * %G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE, and %G_MARKUP_ERROR_INVALID_CONTENT
  * errors are intended to be set from these callbacks. If you set an error from
  * a callback, g_markup_parse_context_parse() will report that error back to
  * its caller.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MarkupParser private[gnome] (raw: Ptr[GMarkupParser]):

  def getUnsafeRawPointer(): Ptr[GMarkupParser] = this.raw
  @annotation.compileTimeOnly("[field start_element]: Field is missing <type>")
  private def startElement__ = ???
  @annotation.compileTimeOnly("[field end_element]: Field is missing <type>")
  private def endElement__ = ???
  @annotation.compileTimeOnly("[field text]: Field is missing <type>")
  private def text__ = ???
  @annotation.compileTimeOnly("[field passthrough]: Field is missing <type>")
  private def passthrough__ = ???
  @annotation.compileTimeOnly("[field error]: Field is missing <type>")
  private def error__ = ???
end MarkupParser

object MarkupParser:
  def fromRaw(ptr: Ptr[GMarkupParser]): MarkupParser = new MarkupParser(ptr)
end MarkupParser

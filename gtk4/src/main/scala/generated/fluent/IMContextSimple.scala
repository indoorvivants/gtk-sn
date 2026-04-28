package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.IMContext
import sn.gnome.gtk4.internal.GtkIMContextSimple

class IMContextSimple(raw: Ptr[GtkIMContextSimple])
    extends IMContext(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addComposeFile(compose_file: String | CString)(using Zone): Unit =
    gtk_im_context_simple_add_compose_file(
      this.raw.asInstanceOf,
      __sn_extract_string(compose_file)
    )

  // Method add_table contains an array parameter, which is not supported yet

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IMContextSimple

object IMContextSimple:
  def apply(): IMContextSimple = new IMContextSimple(
    gtk_im_context_simple_new().asInstanceOf
  )
end IMContextSimple

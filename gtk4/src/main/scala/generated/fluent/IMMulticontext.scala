package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.IMContext
import sn.gnome.gtk4.internal.GtkIMMulticontext

class IMMulticontext(raw: Ptr[GtkIMMulticontext])
    extends IMContext(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getContextId()(using Zone): String = fromCString(
    gtk_im_multicontext_get_context_id(this.raw.asInstanceOf).asInstanceOf
  )

  def setContextId(context_id: String | CString)(using Zone): Unit =
    gtk_im_multicontext_set_context_id(
      this.raw.asInstanceOf,
      __sn_extract_string(context_id)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IMMulticontext

object IMMulticontext:
  def apply(): IMMulticontext = new IMMulticontext(
    gtk_im_multicontext_new().asInstanceOf
  )
end IMMulticontext

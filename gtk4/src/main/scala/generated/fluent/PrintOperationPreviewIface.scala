package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkPrintOperationPreviewIface

class PrintOperationPreviewIface private[gnome] (
    raw: Ptr[GtkPrintOperationPreviewIface]
):

  def getUnsafeRawPointer(): Ptr[GtkPrintOperationPreviewIface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field ready]: Field is missing <type>")
  private def ready__ = ???
  @annotation.compileTimeOnly("[field got_page_size]: Field is missing <type>")
  private def gotPageSize__ = ???
  @annotation.compileTimeOnly("[field render_page]: Field is missing <type>")
  private def renderPage__ = ???
  @annotation.compileTimeOnly("[field is_selected]: Field is missing <type>")
  private def isSelected__ = ???
  @annotation.compileTimeOnly("[field end_preview]: Field is missing <type>")
  private def endPreview__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved5]: Field is missing <type>")
  private def GtkReserved5__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved6]: Field is missing <type>")
  private def GtkReserved6__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved7]: Field is missing <type>")
  private def GtkReserved7__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved8]: Field is missing <type>")
  private def GtkReserved8__ = ???
end PrintOperationPreviewIface

object PrintOperationPreviewIface:
  def fromRaw(
      ptr: Ptr[GtkPrintOperationPreviewIface]
  ): PrintOperationPreviewIface = new PrintOperationPreviewIface(ptr)
end PrintOperationPreviewIface

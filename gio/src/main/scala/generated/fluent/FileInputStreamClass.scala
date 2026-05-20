package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.InputStreamClass
import sn.gnome.gio.internal.GFileInputStreamClass

class FileInputStreamClass private[gnome] (raw: Ptr[GFileInputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GFileInputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.InputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GInputStreamClass]
  @annotation.compileTimeOnly("[field tell]: Field is missing <type>")
  private def tell__ = ???
  @annotation.compileTimeOnly("[field can_seek]: Field is missing <type>")
  private def canSeek__ = ???
  @annotation.compileTimeOnly("[field seek]: Field is missing <type>")
  private def seek__ = ???
  @annotation.compileTimeOnly("[field query_info]: Field is missing <type>")
  private def queryInfo__ = ???
  @annotation.compileTimeOnly(
    "[field query_info_async]: Field is missing <type>"
  )
  private def queryInfoAsync__ = ???
  @annotation.compileTimeOnly(
    "[field query_info_finish]: Field is missing <type>"
  )
  private def queryInfoFinish__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
  @annotation.compileTimeOnly("[field _g_reserved5]: Field is missing <type>")
  private def GReserved5__ = ???
end FileInputStreamClass

object FileInputStreamClass:
  def fromRaw(ptr: Ptr[GFileInputStreamClass]): FileInputStreamClass =
    new FileInputStreamClass(ptr)
end FileInputStreamClass

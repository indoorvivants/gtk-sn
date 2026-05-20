package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.IOStreamClass
import sn.gnome.gio.internal.GFileIOStreamClass

class FileIOStreamClass private[gnome] (raw: Ptr[GFileIOStreamClass]):

  def getUnsafeRawPointer(): Ptr[GFileIOStreamClass] = this.raw

  def parentClass: sn.gnome.gio.IOStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GIOStreamClass]
  @annotation.compileTimeOnly("[field tell]: Field is missing <type>")
  private def tell__ = ???
  @annotation.compileTimeOnly("[field can_seek]: Field is missing <type>")
  private def canSeek__ = ???
  @annotation.compileTimeOnly("[field seek]: Field is missing <type>")
  private def seek__ = ???
  @annotation.compileTimeOnly("[field can_truncate]: Field is missing <type>")
  private def canTruncate__ = ???
  @annotation.compileTimeOnly("[field truncate_fn]: Field is missing <type>")
  private def truncateFn__ = ???
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
  @annotation.compileTimeOnly("[field get_etag]: Field is missing <type>")
  private def getEtag__ = ???
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
end FileIOStreamClass

object FileIOStreamClass:
  def fromRaw(ptr: Ptr[GFileIOStreamClass]): FileIOStreamClass =
    new FileIOStreamClass(ptr)
end FileIOStreamClass

package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentProviderClass
import sn.gnome.gobject.ObjectClass

/** Class structure for `GdkContentProvider`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ContentProviderClass private[gnome] (raw: Ptr[GdkContentProviderClass]):

  def getUnsafeRawPointer(): Ptr[GdkContentProviderClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly(
    "[field content_changed]: Field is missing <type>"
  )
  private def contentChanged__ = ???
  @annotation.compileTimeOnly(
    "[field attach_clipboard]: Field is missing <type>"
  )
  private def attachClipboard__ = ???
  @annotation.compileTimeOnly(
    "[field detach_clipboard]: Field is missing <type>"
  )
  private def detachClipboard__ = ???
  @annotation.compileTimeOnly("[field ref_formats]: Field is missing <type>")
  private def refFormats__ = ???
  @annotation.compileTimeOnly(
    "[field ref_storable_formats]: Field is missing <type>"
  )
  private def refStorableFormats__ = ???
  @annotation.compileTimeOnly(
    "[field write_mime_type_async]: Field is missing <type>"
  )
  private def writeMimeTypeAsync__ = ???
  @annotation.compileTimeOnly(
    "[field write_mime_type_finish]: Field is missing <type>"
  )
  private def writeMimeTypeFinish__ = ???
  @annotation.compileTimeOnly("[field get_value]: Field is missing <type>")
  private def getValue__ = ???

end ContentProviderClass

object ContentProviderClass:
  def fromRaw(ptr: Ptr[GdkContentProviderClass]): ContentProviderClass =
    new ContentProviderClass(ptr)
end ContentProviderClass

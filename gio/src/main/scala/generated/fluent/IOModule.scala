package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOModule
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.TypeModule
import sn.gnome.gobject.fluent.TypePlugin

class IOModule(raw: Ptr[GIOModule])
    extends TypeModule(raw.asInstanceOf),
      TypePlugin:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def load(): Unit = g_io_module_load(this.raw.asInstanceOf)

  def unload(): Unit = g_io_module_unload(this.raw.asInstanceOf)

end IOModule

object IOModule:
  def apply(filename: String | CString)(using Zone): IOModule = new IOModule(
    g_io_module_new(
      __sn_extract_string(filename).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IOModule

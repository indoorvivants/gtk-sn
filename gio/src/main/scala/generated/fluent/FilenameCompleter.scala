package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFilenameCompleter
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class FilenameCompleter(raw: Ptr[GFilenameCompleter])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCompletionSuffix(initial_text: String | CString)(using Zone): String =
    fromCString(
      g_filename_completer_get_completion_suffix(
        this.raw.asInstanceOf,
        __sn_extract_string(initial_text)
      ).asInstanceOf
    )

  def setDirsOnly(dirs_only: Boolean): Unit =
    g_filename_completer_set_dirs_only(
      this.raw.asInstanceOf,
      gboolean(gint((if dirs_only == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FilenameCompleter

object FilenameCompleter:
  def apply(): FilenameCompleter = new FilenameCompleter(
    g_filename_completer_new().asInstanceOf
  )
end FilenameCompleter

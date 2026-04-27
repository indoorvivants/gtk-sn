package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.internal.GApplicationCommandLine
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.GVariantDict
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class ApplicationCommandLine(raw: Ptr[GApplicationCommandLine])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def createFileForArg(arg: String | CString)(using Zone): File =
    new File.Abstract(
      g_application_command_line_create_file_for_arg(
        this.raw.asInstanceOf,
        __sn_extract_string(arg).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  // Method get_arguments contains an OUT parameter, which is not supported yet

  def getCwd()(using Zone): String = fromCString(
    g_application_command_line_get_cwd(this.raw.asInstanceOf).asInstanceOf
  )

  def getExitStatus(): Int = g_application_command_line_get_exit_status(
    this.raw.asInstanceOf
  )

  def getIsRemote(): Boolean =
    g_application_command_line_get_is_remote(this.raw.asInstanceOf).value.!=(0)

  def getOptionsDict(): Ptr[GVariantDict] =
    g_application_command_line_get_options_dict(this.raw.asInstanceOf)

  def getPlatformData(): Ptr[GVariant] =
    g_application_command_line_get_platform_data(this.raw.asInstanceOf)

  def getStdin(): InputStream = new InputStream(
    g_application_command_line_get_stdin(this.raw.asInstanceOf).asInstanceOf
  )

  def getenv(name: String | CString)(using Zone): String = fromCString(
    g_application_command_line_getenv(
      this.raw.asInstanceOf,
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  inline def print(format: String | CString, args: Any*)(using Zone): Unit =
    g_application_command_line_print(
      this.raw.asInstanceOf,
      __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
      args*
    )

  inline def printerr(format: String | CString, args: Any*)(using Zone): Unit =
    g_application_command_line_printerr(
      this.raw.asInstanceOf,
      __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
      args*
    )

  def setExitStatus(exit_status: Int): Unit =
    g_application_command_line_set_exit_status(
      this.raw.asInstanceOf,
      exit_status
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ApplicationCommandLine

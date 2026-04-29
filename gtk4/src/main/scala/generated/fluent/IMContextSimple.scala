package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.IMContext
import sn.gnome.gtk4.internal.GtkIMContextSimple

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkIMContextSimple` is an input method supporting table-based input
  * methods.
  *
  * ## Compose sequences
  *
  * `GtkIMContextSimple` reads compose sequences from the first of the following
  * files that is found: ~/.config/gtk-4.0/Compose, ~/.XCompose,
  * /usr/share/X11/locale/$locale/Compose (for locales that have a nontrivial
  * Compose file). A subset of the file syntax described in the Compose(5)
  * manual page is supported. Additionally, `include "%L"` loads GTK’s built-in
  * table of compose sequences rather than the locale-specific one from X11.
  *
  * If none of these files is found, `GtkIMContextSimple` uses a built-in table
  * of compose sequences that is derived from the X11 Compose files.
  *
  * Note that compose sequences typically start with the Compose_key, which is
  * often not available as a dedicated key on keyboards. Keyboard layouts may
  * map this keysym to other keys, such as the right Control key.
  *
  * ## Unicode characters
  *
  * `GtkIMContextSimple` also supports numeric entry of Unicode characters by
  * typing <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>u</kbd>, followed by a
  * hexadecimal Unicode codepoint.
  *
  * For example,
  *
  * Ctrl-Shift-u 1 2 3 Enter
  *
  * yields U+0123 LATIN SMALL LETTER G WITH CEDILLA, i.e. ģ.
  *
  * ## Dead keys
  *
  * `GtkIMContextSimple` supports dead keys. For example, typing
  *
  * dead_acute a
  *
  * yields U+00E! LATIN SMALL LETTER_A WITH ACUTE, i.e. á. Note that this
  * depends on the keyboard layout including dead keys.
  */
class IMContextSimple(raw: Ptr[GtkIMContextSimple])
    extends IMContext(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds an additional table from the X11 compose file.
    */
  def addComposeFile(compose_file: String | CString)(using Zone): Unit =
    gtk_im_context_simple_add_compose_file(
      this.raw.asInstanceOf,
      __sn_extract_string(compose_file)
    )

  @annotation.compileTimeOnly(
    "Method add_table is weird: non NULL-terminated arrays require special handling"
  )
  def addTable(using DummyImplicit) = ???

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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkIMContextSimple`.
    */
  def apply(): IMContextSimple = new IMContextSimple(
    gtk_im_context_simple_new().asInstanceOf
  )
end IMContextSimple

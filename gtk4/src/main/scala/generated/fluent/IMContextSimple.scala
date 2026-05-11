package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.IMContext
import sn.gnome.gtk4.internal.GtkIMContextSimple

/** `GtkIMContextSimple` is an input method supporting table-based input
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IMContextSimple private[gnome] (raw: Ptr[GtkIMContextSimple])
    extends IMContext(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds an additional table from the X11 compose file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addComposeFile(
      compose_file: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_im_context_simple_add_compose_file(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkIMContextSimple]],
      toCString(compose_file)
    )
  end addComposeFile

  /** Adds an additional table to search to the input context. Each row of the
    * table consists of @max_seq_len key symbols followed by two #guint16
    * interpreted as the high and low words of a #gunicode value. Tables are
    * searched starting from the last added.
    *
    * The table must be sorted in dictionary order on the numeric value of the
    * key symbol fields. (Values beyond the length of the sequence should be
    * zero.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_table]: Method add_table is weird: non NULL-terminated arrays require special handling"
  )
  private def addTable__ = ???

end IMContextSimple

object IMContextSimple:
  def applyUnsafe(ptr: Ptr[GtkIMContextSimple])(using Runtime) =
    summon[Runtime].getOrCreate[IMContextSimple](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new IMContextSimple(ptr)
    )

  /** Creates a new `GtkIMContextSimple`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): IMContextSimple =
    val raw: Ptr[Byte] = gtk_im_context_simple_new().asInstanceOf
    summon[Runtime].getOrCreate[IMContextSimple](
      raw,
      r => IMContextSimple.applyUnsafe(r.asInstanceOf)
    )
  end apply
end IMContextSimple

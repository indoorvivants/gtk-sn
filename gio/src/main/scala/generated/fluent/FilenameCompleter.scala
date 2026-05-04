package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFilenameCompleter
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Completes partial file and directory names given a partial string by looking
  * in the file system for clues. Can return a list of possible completion
  * strings for widget implementations.
  */
class FilenameCompleter(raw: Ptr[GFilenameCompleter])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains a completion for @initial_text from @completer.
    */
  def getCompletionSuffix(
      initial_text: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_filename_completer_get_completion_suffix(
      this.raw.asInstanceOf[Ptr[GFilenameCompleter]],
      __sn_extract_string(initial_text)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets an array of completion strings for a given initial text.
    */
  def getCompletions(
      initial_text: String | CString /* Some(CString) */
  )(using Zone): Array[String] /* None */ = __decode_nullable_ptrs(
    g_filename_completer_get_completions(
      this.raw.asInstanceOf[Ptr[GFilenameCompleter]],
      __sn_extract_string(initial_text)
    )
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @dirs_only is %TRUE, @completer will only complete directory names, and
    * not file names.
    */
  def setDirsOnly(
      dirs_only: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_filename_completer_set_dirs_only(
    this.raw.asInstanceOf[Ptr[GFilenameCompleter]],
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

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs
end FilenameCompleter

object FilenameCompleter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new filename completer.
    */
  def apply(): FilenameCompleter = new FilenameCompleter(
    g_filename_completer_new().asInstanceOf
  )
end FilenameCompleter

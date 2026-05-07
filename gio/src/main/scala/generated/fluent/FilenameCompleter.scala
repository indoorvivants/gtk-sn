package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFilenameCompleter
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** Completes partial file and directory names given a partial string by looking
  * in the file system for clues. Can return a list of possible completion
  * strings for widget implementations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FilenameCompleter(raw: Ptr[GFilenameCompleter])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Obtains a completion for @initial_text from @completer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCompletionSuffix(
      initial_text: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_filename_completer_get_completion_suffix(
      this.raw.asInstanceOf[Ptr[GFilenameCompleter]],
      __sn_extract_string(initial_text)
    ).asInstanceOf
  )

  /** Gets an array of completion strings for a given initial text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCompletions(
      initial_text: String | CString /* Some(CString) */
  )(using Zone): Array[String] /* None */ = MemoryRead
    .nullTerminatedPointerArray(
      g_filename_completer_get_completions(
        this.raw.asInstanceOf[Ptr[GFilenameCompleter]],
        __sn_extract_string(initial_text)
      )
    )
    .map(fromCString(_))

  /** If @dirs_only is %TRUE, @completer will only complete directory names, and
    * not file names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDirsOnly(
      dirs_only: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_filename_completer_set_dirs_only(
    this.raw.asInstanceOf[Ptr[GFilenameCompleter]],
    gboolean(gint((if dirs_only == true then 1 else 0)))
  )

  /** Emitted when the file name completion information comes available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onGotCompletionData(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GFilenameCompleter],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"got-completion-data"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onGotCompletionData

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
  /** Creates a new filename completer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): FilenameCompleter = new FilenameCompleter(
    g_filename_completer_new().asInstanceOf
  )
end FilenameCompleter

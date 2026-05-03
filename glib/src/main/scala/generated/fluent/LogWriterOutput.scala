package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GLogWriterOutput

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Return values from #GLogWriterFuncs to indicate whether the given log entry
  * was successfully handled by the writer, or whether there was an error in
  * handling it (and hence a fallback writer should be used).
  *
  * If a #GLogWriterFunc ignores a log entry, it should return
  * %G_LOG_WRITER_HANDLED.
  */
enum LogWriterOutput(val raw: GLogWriterOutput):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Log writer has handled the log entry.
    */
  case HANDLED extends LogWriterOutput(GLogWriterOutput.G_LOG_WRITER_HANDLED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Log writer could not handle the log entry.
    */
  case UNHANDLED
      extends LogWriterOutput(GLogWriterOutput.G_LOG_WRITER_UNHANDLED)
end LogWriterOutput

object LogWriterOutput:
  def fromRaw(raw: GLogWriterOutput): LogWriterOutput =
    raw match
      case GLogWriterOutput.G_LOG_WRITER_HANDLED   => LogWriterOutput.HANDLED
      case GLogWriterOutput.G_LOG_WRITER_UNHANDLED => LogWriterOutput.UNHANDLED
  end fromRaw
end LogWriterOutput

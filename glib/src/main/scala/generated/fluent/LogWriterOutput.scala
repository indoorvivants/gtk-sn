package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GLogWriterOutput

/** Return values from #GLogWriterFuncs to indicate whether the given log entry
  * was successfully handled by the writer, or whether there was an error in
  * handling it (and hence a fallback writer should be used).
  *
  * If a #GLogWriterFunc ignores a log entry, it should return
  * %G_LOG_WRITER_HANDLED.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum LogWriterOutput(val raw: GLogWriterOutput):
  /** Log writer has handled the log entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANDLED extends LogWriterOutput(GLogWriterOutput.G_LOG_WRITER_HANDLED)

  /** Log writer could not handle the log entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

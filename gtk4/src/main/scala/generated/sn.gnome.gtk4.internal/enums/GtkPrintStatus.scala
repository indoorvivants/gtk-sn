package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintStatus: _PRINT_STATUS_INITIAL: The printing has not started yet; this status is set initially, and while the print dialog is shown. _PRINT_STATUS_PREPARING: This status is set while the begin-print signal is emitted and during pagination. _PRINT_STATUS_GENERATING_DATA: This status is set while the pages are being rendered. _PRINT_STATUS_SENDING_DATA: The print job is being sent off to the printer. _PRINT_STATUS_PENDING: The print job has been sent to the printer, but is not printed for some reason, e.g. the printer may be stopped. _PRINT_STATUS_PENDING_ISSUE: Some problem has occurred during printing, e.g. a paper jam. _PRINT_STATUS_PRINTING: The printer is processing the print job. _PRINT_STATUS_FINISHED: The printing has been completed successfully. _PRINT_STATUS_FINISHED_ABORTED: The printing has been aborted.
*/
opaque type GtkPrintStatus = CUnsignedInt
object GtkPrintStatus extends _BindgenEnumCUnsignedInt[GtkPrintStatus]:
  given _tag: Tag[GtkPrintStatus] = Tag.UInt
  inline def define(inline a: Long): GtkPrintStatus = a.toUInt
  val GTK_PRINT_STATUS_INITIAL = define(0)
  val GTK_PRINT_STATUS_PREPARING = define(1)
  val GTK_PRINT_STATUS_GENERATING_DATA = define(2)
  val GTK_PRINT_STATUS_SENDING_DATA = define(3)
  val GTK_PRINT_STATUS_PENDING = define(4)
  val GTK_PRINT_STATUS_PENDING_ISSUE = define(5)
  val GTK_PRINT_STATUS_PRINTING = define(6)
  val GTK_PRINT_STATUS_FINISHED = define(7)
  val GTK_PRINT_STATUS_FINISHED_ABORTED = define(8)
  def getName(value: GtkPrintStatus): Option[String] =
    value match
      case `GTK_PRINT_STATUS_INITIAL` => Some("GTK_PRINT_STATUS_INITIAL")
      case `GTK_PRINT_STATUS_PREPARING` => Some("GTK_PRINT_STATUS_PREPARING")
      case `GTK_PRINT_STATUS_GENERATING_DATA` => Some("GTK_PRINT_STATUS_GENERATING_DATA")
      case `GTK_PRINT_STATUS_SENDING_DATA` => Some("GTK_PRINT_STATUS_SENDING_DATA")
      case `GTK_PRINT_STATUS_PENDING` => Some("GTK_PRINT_STATUS_PENDING")
      case `GTK_PRINT_STATUS_PENDING_ISSUE` => Some("GTK_PRINT_STATUS_PENDING_ISSUE")
      case `GTK_PRINT_STATUS_PRINTING` => Some("GTK_PRINT_STATUS_PRINTING")
      case `GTK_PRINT_STATUS_FINISHED` => Some("GTK_PRINT_STATUS_FINISHED")
      case `GTK_PRINT_STATUS_FINISHED_ABORTED` => Some("GTK_PRINT_STATUS_FINISHED_ABORTED")
      case _ => _root_.scala.None
  extension (a: GtkPrintStatus)
    inline def &(b: GtkPrintStatus): GtkPrintStatus = a & b
    inline def |(b: GtkPrintStatus): GtkPrintStatus = a | b
    inline def is(b: GtkPrintStatus): Boolean = (a & b) == b
package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkPadActionType
import sn.gnome.gtk4.internal.GtkPadController

class PadController(raw: Ptr[GtkPadController])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setAction(
      `type`: GtkPadActionType,
      index: Int,
      mode: Int,
      label: String | CString,
      action_name: String | CString
  )(using Zone): Unit = gtk_pad_controller_set_action(
    this.raw.asInstanceOf,
    `type`,
    index,
    mode,
    __sn_extract_string(label),
    __sn_extract_string(action_name)
  )

  // Method set_action_entries contains an array parameter, which is not supported yet

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PadController

object PadController:
  def apply(group: ActionGroup, pad: Device): PadController = new PadController(
    gtk_pad_controller_new(
      group.getUnsafeRawPointer().asInstanceOf,
      pad.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end PadController

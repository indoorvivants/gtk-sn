package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.internal.GdkDisplayManager
import sn.gnome.glib.internal.GSList
import sn.gnome.gobject.fluent.Object

class DisplayManager(raw: Ptr[GdkDisplayManager])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDefaultDisplay(): Display = new Display(
    gdk_display_manager_get_default_display(this.raw.asInstanceOf).asInstanceOf
  )

  def listDisplays(): Ptr[GSList] = gdk_display_manager_list_displays(
    this.raw.asInstanceOf
  )

  def openDisplay(name: String | CString)(using Zone): Display = new Display(
    gdk_display_manager_open_display(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  def setDefaultDisplay(display: Display): Unit =
    gdk_display_manager_set_default_display(
      this.raw.asInstanceOf,
      display.getUnsafeRawPointer().asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DisplayManager

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkLevelBar
import sn.gnome.gtk4.internal.GtkLevelBarMode

class LevelBar(raw: Ptr[GtkLevelBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addOffsetValue(name: String | CString, value: Double)(using Zone): Unit =
    gtk_level_bar_add_offset_value(
      this.raw.asInstanceOf,
      __sn_extract_string(name),
      value
    )

  def getInverted(): Boolean =
    gtk_level_bar_get_inverted(this.raw.asInstanceOf).value.!=(0)

  def getMaxValue(): Double = gtk_level_bar_get_max_value(this.raw.asInstanceOf)

  def getMinValue(): Double = gtk_level_bar_get_min_value(this.raw.asInstanceOf)

  def getMode(): GtkLevelBarMode = gtk_level_bar_get_mode(this.raw.asInstanceOf)

  // Method get_offset_value contains an OUT parameter, which is not supported yet

  def getValue(): Double = gtk_level_bar_get_value(this.raw.asInstanceOf)

  def removeOffsetValue(name: String | CString)(using Zone): Unit =
    gtk_level_bar_remove_offset_value(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def setInverted(inverted: Boolean): Unit = gtk_level_bar_set_inverted(
    this.raw.asInstanceOf,
    gboolean(gint((if inverted == true then 1 else 0)))
  )

  def setMaxValue(value: Double): Unit =
    gtk_level_bar_set_max_value(this.raw.asInstanceOf, value)

  def setMinValue(value: Double): Unit =
    gtk_level_bar_set_min_value(this.raw.asInstanceOf, value)

  def setMode(mode: GtkLevelBarMode): Unit =
    gtk_level_bar_set_mode(this.raw.asInstanceOf, mode)

  def setValue(value: Double): Unit =
    gtk_level_bar_set_value(this.raw.asInstanceOf, value)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end LevelBar

object LevelBar:
  def apply(): LevelBar = new LevelBar(gtk_level_bar_new().asInstanceOf)
  def forInterval(min_value: Double, max_value: Double): LevelBar =
    new LevelBar(
      gtk_level_bar_new_for_interval(min_value, max_value).asInstanceOf
    )
end LevelBar

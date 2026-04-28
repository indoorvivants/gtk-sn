package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.internal.GtkConstraintGuide
import sn.gnome.gtk4.internal.GtkConstraintStrength

class ConstraintGuide(raw: Ptr[GtkConstraintGuide])
    extends Object(raw.asInstanceOf),
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_max_size contains an OUT parameter, which is not supported yet

  // Method get_min_size contains an OUT parameter, which is not supported yet

  def getName()(using Zone): String = fromCString(
    gtk_constraint_guide_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_nat_size contains an OUT parameter, which is not supported yet

  def getStrength(): GtkConstraintStrength = gtk_constraint_guide_get_strength(
    this.raw.asInstanceOf
  )

  def setMaxSize(width: Int, height: Int): Unit =
    gtk_constraint_guide_set_max_size(this.raw.asInstanceOf, width, height)

  def setMinSize(width: Int, height: Int): Unit =
    gtk_constraint_guide_set_min_size(this.raw.asInstanceOf, width, height)

  def setName(name: String | CString)(using Zone): Unit =
    gtk_constraint_guide_set_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def setNatSize(width: Int, height: Int): Unit =
    gtk_constraint_guide_set_nat_size(this.raw.asInstanceOf, width, height)

  def setStrength(strength: GtkConstraintStrength): Unit =
    gtk_constraint_guide_set_strength(this.raw.asInstanceOf, strength)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ConstraintGuide

object ConstraintGuide:
  def apply(): ConstraintGuide = new ConstraintGuide(
    gtk_constraint_guide_new().asInstanceOf
  )
end ConstraintGuide

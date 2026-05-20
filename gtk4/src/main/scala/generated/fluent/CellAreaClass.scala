package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkCellAreaClass

class CellAreaClass private[gnome] (raw: Ptr[GtkCellAreaClass]):

  def getUnsafeRawPointer(): Ptr[GtkCellAreaClass] = this.raw

  @annotation.compileTimeOnly("[field add]: Field is missing <type>")
  private def add__ = ???
  @annotation.compileTimeOnly("[field remove]: Field is missing <type>")
  private def remove__ = ???
  @annotation.compileTimeOnly("[field foreach]: Field is missing <type>")
  private def foreach__ = ???
  @annotation.compileTimeOnly("[field foreach_alloc]: Field is missing <type>")
  private def foreachAlloc__ = ???
  @annotation.compileTimeOnly("[field event]: Field is missing <type>")
  private def event__ = ???
  @annotation.compileTimeOnly("[field snapshot]: Field is missing <type>")
  private def snapshot__ = ???
  @annotation.compileTimeOnly(
    "[field apply_attributes]: Field is missing <type>"
  )
  private def applyAttributes__ = ???
  @annotation.compileTimeOnly("[field create_context]: Field is missing <type>")
  private def createContext__ = ???
  @annotation.compileTimeOnly("[field copy_context]: Field is missing <type>")
  private def copyContext__ = ???
  @annotation.compileTimeOnly(
    "[field get_request_mode]: Field is missing <type>"
  )
  private def getRequestMode__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_width]: Field is missing <type>"
  )
  private def getPreferredWidth__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_height_for_width]: Field is missing <type>"
  )
  private def getPreferredHeightForWidth__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_height]: Field is missing <type>"
  )
  private def getPreferredHeight__ = ???
  @annotation.compileTimeOnly(
    "[field get_preferred_width_for_height]: Field is missing <type>"
  )
  private def getPreferredWidthForHeight__ = ???
  @annotation.compileTimeOnly(
    "[field set_cell_property]: Field is missing <type>"
  )
  private def setCellProperty__ = ???
  @annotation.compileTimeOnly(
    "[field get_cell_property]: Field is missing <type>"
  )
  private def getCellProperty__ = ???
  @annotation.compileTimeOnly("[field focus]: Field is missing <type>")
  private def focus__ = ???
  @annotation.compileTimeOnly("[field is_activatable]: Field is missing <type>")
  private def isActivatable__ = ???
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

  /** Finds a cell property of a cell area class by name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findCellProperty(
      property_name: scala.Predef.String /* Some(CString) */
  )(using Zone, Runtime): sn.gnome.gobject.ParamSpec /* None */ =
    sn.gnome.gobject.ParamSpec.applyUnsafe(
      gtk_cell_area_class_find_cell_property(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellAreaClass]],
        toCString(property_name)
      ).asInstanceOf
    )
  end findCellProperty

  /** Installs a cell property on a cell area class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def installCellProperty(
      property_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      pspec: sn.gnome.gobject.ParamSpec /* Some(Ptr[_root_.sn.gnome.gobject.internal.GParamSpec]) */
  )(using Runtime): Unit /* None */ =
    gtk_cell_area_class_install_cell_property(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellAreaClass]],
      guint(property_id),
      pspec.getUnsafeRawPointer().asInstanceOf
    )
  end installCellProperty

  /** Returns all cell properties of a cell area class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_cell_properties]: Method list_cell_properties contains an OUT parameter, which is not supported yet"
  )
  private def listCellProperties__ = ???

end CellAreaClass

object CellAreaClass:
  def fromRaw(ptr: Ptr[GtkCellAreaClass]): CellAreaClass = new CellAreaClass(
    ptr
  )
end CellAreaClass

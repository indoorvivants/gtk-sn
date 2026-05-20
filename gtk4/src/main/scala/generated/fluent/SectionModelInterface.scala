package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkSectionModelInterface

/** The list of virtual functions for the `GtkSectionModel` interface. No
  * function must be implemented, but unless `GtkSectionModel::get_section()` is
  * implemented, the whole model will just be a single section.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SectionModelInterface private[gnome] (raw: Ptr[GtkSectionModelInterface]):

  def getUnsafeRawPointer(): Ptr[GtkSectionModelInterface] = this.raw

  @annotation.compileTimeOnly("[field get_section]: Field is missing <type>")
  private def getSection__ = ???
end SectionModelInterface

object SectionModelInterface:
  def fromRaw(ptr: Ptr[GtkSectionModelInterface]): SectionModelInterface =
    new SectionModelInterface(ptr)
end SectionModelInterface

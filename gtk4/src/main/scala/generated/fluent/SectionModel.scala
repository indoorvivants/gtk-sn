package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint

trait SectionModel:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Query the section that covers the given position. The number of items in
    * the section can be computed by `out_end - out_start`.
    *
    * If the position is larger than the number of items, a single range from
    * n_items to G_MAXUINT will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_section]: Method get_section contains an OUT parameter, which is not supported yet"
  )
  private def getSection__ = ???

  def sectionsChanged(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_items: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_section_model_sections_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSectionModel]],
      guint(position),
      guint(n_items)
    )
  end sectionsChanged

end SectionModel

object SectionModel:
  class Abstract(raw: Ptr[Byte]) extends SectionModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SectionModel

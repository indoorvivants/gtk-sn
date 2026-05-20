package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gint16
import sn.gnome.gtk4.Border
import sn.gnome.gtk4.internal.GtkBorder

/** A struct that specifies a border around a rectangular area.
  *
  * Each side can have different width.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Border private[gnome] (raw: Ptr[GtkBorder]):

  def getUnsafeRawPointer(): Ptr[GtkBorder] = this.raw

  /** The width of the left border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def left: CShort /* None */ =
    (!raw).left.asInstanceOf[_root_.sn.gnome.glib.internal.gint16]

  /** The width of the left border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def left_=(value: CShort /* None */ ): Unit = (!raw).left_=(
    gint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint16]
  )

  /** The width of the right border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def right: CShort /* None */ =
    (!raw).right.asInstanceOf[_root_.sn.gnome.glib.internal.gint16]

  /** The width of the right border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def right_=(value: CShort /* None */ ): Unit = (!raw).right_=(
    gint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint16]
  )

  /** The width of the top border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def top: CShort /* None */ =
    (!raw).top.asInstanceOf[_root_.sn.gnome.glib.internal.gint16]

  /** The width of the top border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def top_=(value: CShort /* None */ ): Unit = (!raw).top_=(
    gint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint16]
  )

  /** The width of the bottom border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bottom: CShort /* None */ =
    (!raw).bottom.asInstanceOf[_root_.sn.gnome.glib.internal.gint16]

  /** The width of the bottom border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bottom_=(value: CShort /* None */ ): Unit = (!raw).bottom_=(
    gint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint16]
  )

  /** Copies a `GtkBorder`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.Border /* None */ =
    sn.gnome.gtk4.Border.fromRaw(
      gtk_border_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBorder]])
    )
  end copy

  /** Frees a `GtkBorder`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gtk_border_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBorder]])
  end free

end Border

object Border:
  def fromRaw(ptr: Ptr[GtkBorder]): Border = new Border(ptr)
end Border

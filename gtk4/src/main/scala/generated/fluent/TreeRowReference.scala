package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.{TreeModel, TreePath, TreeRowReference}
import sn.gnome.gtk4.internal.GtkTreeRowReference

/** A GtkTreeRowReference tracks model changes so that it always refers to the
  * same row (a `GtkTreePath` refers to a position, not a fixed row). Create a
  * new GtkTreeRowReference with gtk_tree_row_reference_new().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeRowReference private[gnome] (raw: Ptr[GtkTreeRowReference]):

  def getUnsafeRawPointer(): Ptr[GtkTreeRowReference] = this.raw

  /** Copies a `GtkTreeRowReference`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.TreeRowReference /* None */ =
    sn.gnome.gtk4.TreeRowReference.fromRaw(
      gtk_tree_row_reference_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeRowReference]]
      )
    )
  end copy

  /** Free’s @reference. @reference may be %NULL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gtk_tree_row_reference_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeRowReference]]
    )
  end free

  /** Returns the model that the row reference is monitoring.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): sn.gnome.gtk4.TreeModel /* None */ =
    new TreeModel.Abstract(
      gtk_tree_row_reference_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeRowReference]]
      ).asInstanceOf
    )
  end getModel

  /** Returns a path that the row reference currently points to, or %NULL if the
    * path pointed to is no longer valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath(): sn.gnome.gtk4.TreePath /* None */ =
    sn.gnome.gtk4.TreePath.fromRaw(
      gtk_tree_row_reference_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeRowReference]]
      )
    )
  end getPath

  /** Returns %TRUE if the @reference is non-%NULL and refers to a current valid
    * path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valid(): Boolean /* None */ =
    gtk_tree_row_reference_valid(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeRowReference]]
    ).value.!=(0)
  end valid

end TreeRowReference

object TreeRowReference:
  def fromRaw(ptr: Ptr[GtkTreeRowReference]): TreeRowReference =
    new TreeRowReference(ptr)
end TreeRowReference

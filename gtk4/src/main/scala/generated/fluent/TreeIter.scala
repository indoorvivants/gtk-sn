package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.TreeIter
import sn.gnome.gtk4.internal.GtkTreeIter

/** The `GtkTreeIter` is the primary structure for accessing a `GtkTreeModel`.
  * Models are expected to put a unique integer in the @stamp member, and put
  * model-specific data in the three @user_data members.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeIter private[gnome] (raw: Ptr[GtkTreeIter]):

  def getUnsafeRawPointer(): Ptr[GtkTreeIter] = this.raw

  /** a unique stamp to catch invalid iterators
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stamp: Int /* None */ = (!raw).stamp.asInstanceOf[CInt]

  /** a unique stamp to catch invalid iterators
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stamp_=(value: Int /* None */ ): Unit =
    (!raw).stamp_=(value.asInstanceOf[CInt])

  /** model-specific data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData: Ptr[Byte] /* None */ =
    (!raw).user_data.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** model-specific data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).user_data_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )

  /** model-specific data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData2: Ptr[Byte] /* None */ =
    (!raw).user_data2.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** model-specific data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData2_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).user_data2_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )

  /** model-specific data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData3: Ptr[Byte] /* None */ =
    (!raw).user_data3.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** model-specific data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData3_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).user_data3_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )

  /** Creates a dynamically allocated tree iterator as a copy of @iter.
    *
    * This function is not intended for use in applications, because you can
    * just copy the structs by value (`GtkTreeIter new_iter = iter;`). You must
    * free this iter with gtk_tree_iter_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.TreeIter /* None */ =
    sn.gnome.gtk4.TreeIter.fromRaw(
      gtk_tree_iter_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeIter]]
      )
    )
  end copy

  /** Frees an iterator that has been allocated by gtk_tree_iter_copy().
    *
    * This function is mainly used for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gtk_tree_iter_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeIter]]
    )
  end free

end TreeIter

object TreeIter:
  def fromRaw(ptr: Ptr[GtkTreeIter]): TreeIter = new TreeIter(ptr)
end TreeIter

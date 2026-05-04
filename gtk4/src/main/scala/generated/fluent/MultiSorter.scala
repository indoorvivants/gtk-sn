package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.{Buildable, Sorter}
import sn.gnome.gtk4.internal.GtkMultiSorter

/** `GtkMultiSorter` combines multiple sorters by trying them in turn.
  *
  * If the first sorter compares two items as equal, the second is tried next,
  * and so on.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MultiSorter(raw: Ptr[GtkMultiSorter])
    extends Sorter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Add @sorter to @self to use for sorting at the end.
    *
    * @self
    *   will consult all existing sorters before it will sort with the given @sorter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(sorter: Sorter /* Some(Ptr[GtkSorter]) */ ): Unit /* None */ =
    gtk_multi_sorter_append(
      this.raw.asInstanceOf[Ptr[GtkMultiSorter]],
      sorter.getUnsafeRawPointer().asInstanceOf
    )

  /** Removes the sorter at the given @position from the list of sorter used by @self.
    *
    * If @position is larger than the number of sorters, nothing happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_multi_sorter_remove(
    this.raw.asInstanceOf[Ptr[GtkMultiSorter]],
    guint(position)
  )

end MultiSorter

object MultiSorter:
  /** Creates a new multi sorter.
    *
    * This sorter compares items by trying each of the sorters in turn, until
    * one returns non-zero. In particular, if no sorter has been added to it, it
    * will always compare items as equal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): MultiSorter = new MultiSorter(
    gtk_multi_sorter_new().asInstanceOf
  )
end MultiSorter

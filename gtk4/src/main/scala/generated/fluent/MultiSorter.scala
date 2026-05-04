package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.{Buildable, Sorter}
import sn.gnome.gtk4.internal.GtkMultiSorter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkMultiSorter` combines multiple sorters by trying them in turn.
  *
  * If the first sorter compares two items as equal, the second is tried next,
  * and so on.
  */
class MultiSorter(raw: Ptr[GtkMultiSorter])
    extends Sorter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add @sorter to @self to use for sorting at the end.
    *
    * @self
    *   will consult all existing sorters before it will sort with the given @sorter.
    */
  def append(sorter: Sorter /* Some(Ptr[GtkSorter]) */ ): Unit /* None */ =
    gtk_multi_sorter_append(
      this.raw.asInstanceOf[Ptr[GtkMultiSorter]],
      sorter.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the sorter at the given @position from the list of sorter used by @self.
    *
    * If @position is larger than the number of sorters, nothing happens.
    */
  def remove(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_multi_sorter_remove(
    this.raw.asInstanceOf[Ptr[GtkMultiSorter]],
    guint(position)
  )

end MultiSorter

object MultiSorter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new multi sorter.
    *
    * This sorter compares items by trying each of the sorters in turn, until
    * one returns non-zero. In particular, if no sorter has been added to it, it
    * will always compare items as equal.
    */
  def apply(): MultiSorter = new MultiSorter(
    gtk_multi_sorter_new().asInstanceOf
  )
end MultiSorter

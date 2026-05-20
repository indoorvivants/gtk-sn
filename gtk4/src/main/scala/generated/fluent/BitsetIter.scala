package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gtk4.internal.GtkBitsetIter

/** An opaque, stack-allocated struct for iterating over the elements of a
  * `GtkBitset`.
  *
  * Before a `GtkBitsetIter` can be used, it needs to be initialized with
  * [func@Gtk.BitsetIter.init_first], [func@Gtk.BitsetIter.init_last] or
  * [func@Gtk.BitsetIter.init_at].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BitsetIter private[gnome] (raw: Ptr[GtkBitsetIter]):

  def getUnsafeRawPointer(): Ptr[GtkBitsetIter] = this.raw

  /** Gets the current value that @iter points to.
    *
    * If @iter is not valid and [method@Gtk.BitsetIter.is_valid] returns %FALSE,
    * this function returns 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(): UInt /* None */ =
    gtk_bitset_iter_get_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitsetIter]]
    ).value
  end getValue

  /** Checks if @iter points to a valid value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isValid(): Boolean /* None */ =
    gtk_bitset_iter_is_valid(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitsetIter]]
    ).value.!=(0)
  end isValid

  /** Moves @iter to the next value in the set.
    *
    * If it was already pointing to the last value in the set, %FALSE is
    * returned and @iter is invalidated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method next]: Method next contains an OUT parameter, which is not supported yet"
  )
  private def next__ = ???

  /** Moves @iter to the previous value in the set.
    *
    * If it was already pointing to the first value in the set, %FALSE is
    * returned and @iter is invalidated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method previous]: Method previous contains an OUT parameter, which is not supported yet"
  )
  private def previous__ = ???

end BitsetIter

object BitsetIter:
  def fromRaw(ptr: Ptr[GtkBitsetIter]): BitsetIter = new BitsetIter(ptr)
end BitsetIter

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint, guint64}
import sn.gnome.gtk4.Bitset
import sn.gnome.gtk4.internal.GtkBitset

/** A `GtkBitset` represents a set of unsigned integers.
  *
  * Another name for this data structure is "bitmap".
  *
  * The current implementation is based on [roaring
  * bitmaps](https://roaringbitmap.org/).
  *
  * A bitset allows adding a set of integers and provides support for set
  * operations like unions, intersections and checks for equality or if a value
  * is contained in the set. `GtkBitset` also contains various functions to
  * query metadata about the bitset, such as the minimum or maximum values or
  * its size.
  *
  * The fastest way to iterate values in a bitset is [struct@Gtk.BitsetIter].
  *
  * The main use case for `GtkBitset` is implementing complex selections for
  * [iface@Gtk.SelectionModel].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Bitset private[gnome] (raw: Ptr[GtkBitset]):

  def getUnsafeRawPointer(): Ptr[GtkBitset] = this.raw

  /** Adds @value to @self if it wasn't part of it before.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def add(
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    gtk_bitset_add(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(value)
    ).value.!=(0)
  end add

  /** Adds all values from @start (inclusive) to @start + @n_items (exclusive)
    * in @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addRange(
      start: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_items: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_add_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(start),
      guint(n_items)
    )
  end addRange

  /** Adds the closed range [@first, @last], so @first, @last and all values in
    * between. @first must be smaller than @last.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addRangeClosed(
      first: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      last: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_add_range_closed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(first),
      guint(last)
    )
  end addRangeClosed

  /** Interprets the values as a 2-dimensional boolean grid with the given @stride
    * and inside that grid, adds a rectangle with the given @width and @height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addRectangle(
      start: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      width: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      height: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      stride: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_add_rectangle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(start),
      guint(width),
      guint(height),
      guint(stride)
    )
  end addRectangle

  /** Checks if the given @value has been added to @self
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contains(
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    gtk_bitset_contains(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(value)
    ).value.!=(0)
  end contains

  /** Creates a copy of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.Bitset /* None */ =
    sn.gnome.gtk4.Bitset.fromRaw(
      gtk_bitset_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]])
    )
  end copy

  /** Sets @self to be the symmetric difference of @self and @other.
    *
    * The symmetric difference is set @self to contain all values that were
    * either contained in @self or in @other, but not in both. This operation is
    * also called an XOR.
    *
    * It is allowed for @self and @other to be the same bitset. The bitset will
    * be emptied in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def difference(
      other: sn.gnome.gtk4.Bitset /* Some(Ptr[GtkBitset]) */
  ): Unit /* None */ =
    gtk_bitset_difference(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      other.getUnsafeRawPointer().asInstanceOf
    )
  end difference

  /** Returns %TRUE if @self and @other contain the same values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equals(
      other: sn.gnome.gtk4.Bitset /* Some(Ptr[GtkBitset]) */
  ): Boolean /* None */ =
    gtk_bitset_equals(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      other.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equals

  /** Returns the largest value in @self.
    *
    * If @self is empty, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaximum(): UInt /* None */ =
    gtk_bitset_get_maximum(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]]
    ).value
  end getMaximum

  /** Returns the smallest value in @self.
    *
    * If @self is empty, `G_MAXUINT` is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinimum(): UInt /* None */ =
    gtk_bitset_get_minimum(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]]
    ).value
  end getMinimum

  /** Returns the value of the @nth item in self.
    *
    * If @nth is >= the size of @self, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNth(
      nth: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* None */ =
    gtk_bitset_get_nth(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(nth)
    ).value
  end getNth

  /** Gets the number of values that were added to the set.
    *
    * For example, if the set is empty, 0 is returned.
    *
    * Note that this function returns a `guint64`, because when all values are
    * set, the return value is `G_MAXUINT + 1`. Unless you are sure this cannot
    * happen (it can't with `GListModel`), be sure to use a 64bit type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): CUnsignedLongInt /* None */ =
    gtk_bitset_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]]
    ).value
  end getSize

  /** Gets the number of values that are part of the set from @first to @last
    * (inclusive).
    *
    * Note that this function returns a `guint64`, because when all values are
    * set, the return value is `G_MAXUINT + 1`. Unless you are sure this cannot
    * happen (it can't with `GListModel`), be sure to use a 64bit type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSizeInRange(
      first: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      last: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): CUnsignedLongInt /* None */ =
    gtk_bitset_get_size_in_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(first),
      guint(last)
    ).value
  end getSizeInRange

  /** Sets @self to be the intersection of @self and @other.
    *
    * In other words, remove all values from @self that are not part of @other.
    *
    * It is allowed for @self and @other to be the same bitset. Nothing will
    * happen in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def intersect(
      other: sn.gnome.gtk4.Bitset /* Some(Ptr[GtkBitset]) */
  ): Unit /* None */ =
    gtk_bitset_intersect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      other.getUnsafeRawPointer().asInstanceOf
    )
  end intersect

  /** Check if no value is contained in bitset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEmpty(): Boolean /* None */ =
    gtk_bitset_is_empty(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]]
    ).value.!=(0)
  end isEmpty

  /** Acquires a reference on the given `GtkBitset`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gtk4.Bitset /* None */ =
    sn.gnome.gtk4.Bitset.fromRaw(
      gtk_bitset_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]])
    )
  end ref

  /** Removes @value from @self if it was part of it before.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    gtk_bitset_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(value)
    ).value.!=(0)
  end remove

  /** Removes all values from the bitset so that it is empty again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAll(): Unit /* None */ =
    gtk_bitset_remove_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]]
    )
  end removeAll

  /** Removes all values from @start (inclusive) to @start + @n_items
    * (exclusive) in @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeRange(
      start: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_items: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_remove_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(start),
      guint(n_items)
    )
  end removeRange

  /** Removes the closed range [@first, @last], so @first, @last and all values
    * in between. @first must be smaller than @last.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeRangeClosed(
      first: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      last: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_remove_range_closed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(first),
      guint(last)
    )
  end removeRangeClosed

  /** Interprets the values as a 2-dimensional boolean grid with the given @stride
    * and inside that grid, removes a rectangle with the given @width and @height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeRectangle(
      start: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      width: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      height: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      stride: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_remove_rectangle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(start),
      guint(width),
      guint(height),
      guint(stride)
    )
  end removeRectangle

  /** Shifts all values in @self to the left by @amount.
    *
    * Values smaller than @amount are discarded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shiftLeft(
      amount: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_shift_left(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(amount)
    )
  end shiftLeft

  /** Shifts all values in @self to the right by @amount.
    *
    * Values that end up too large to be held in a #guint are discarded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shiftRight(
      amount: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_shift_right(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(amount)
    )
  end shiftRight

  /** This is a support function for `GListModel` handling, by mirroring the
    * `GlistModel::items-changed` signal.
    *
    * First, it "cuts" the values from @position to @removed from the bitset.
    * That is, it removes all those values and shifts all larger values to the
    * left by @removed places.
    *
    * Then, it "pastes" new room into the bitset by shifting all values larger
    * than @position by @added spaces to the right. This frees up space that can
    * then be filled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def splice(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      removed: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      added: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_bitset_splice(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      guint(position),
      guint(removed),
      guint(added)
    )
  end splice

  /** Sets @self to be the subtraction of @other from @self.
    *
    * In other words, remove all values from @self that are part of @other.
    *
    * It is allowed for @self and @other to be the same bitset. The bitset will
    * be emptied in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def subtract(
      other: sn.gnome.gtk4.Bitset /* Some(Ptr[GtkBitset]) */
  ): Unit /* None */ =
    gtk_bitset_subtract(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      other.getUnsafeRawPointer().asInstanceOf
    )
  end subtract

  /** Sets @self to be the union of @self and @other.
    *
    * That is, add all values from @other into @self that weren't part of it.
    *
    * It is allowed for @self and @other to be the same bitset. Nothing will
    * happen in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def union(
      other: sn.gnome.gtk4.Bitset /* Some(Ptr[GtkBitset]) */
  ): Unit /* None */ =
    gtk_bitset_union(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]],
      other.getUnsafeRawPointer().asInstanceOf
    )
  end union

  /** Releases a reference on the given `GtkBitset`.
    *
    * If the reference was the last, the resources associated to the @self are
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gtk_bitset_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBitset]])
  end unref

end Bitset

object Bitset:
  def fromRaw(ptr: Ptr[GtkBitset]): Bitset = new Bitset(ptr)
end Bitset

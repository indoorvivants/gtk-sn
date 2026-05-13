package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkCustomSorter

/** `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
  * function.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CustomSorter private[gnome] (raw: Ptr[GtkCustomSorter])
    extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Sets (or unsets) the function used for sorting items.
    *
    * If @sort_func is %NULL, all items are considered equal.
    *
    * If the sort func changes its sorting behavior, gtk_sorter_changed() needs
    * to be called.
    *
    * If a previous function was set, its @user_destroy will be called now.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def setSortFunc__ = ???

end CustomSorter

object CustomSorter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkCustomSorter])(using Runtime) =
    summon[Runtime].getOrCreate[CustomSorter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CustomSorter(ptr)
    )

  /** Creates a new `GtkSorter` that works by calling
    * @sort_func
    *   to compare items.
    *
    * If @sort_func is %NULL, all items are considered equal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def apply() = ???

end CustomSorter

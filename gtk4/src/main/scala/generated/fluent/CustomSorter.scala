package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkCustomSorter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
  * function.
  */
class CustomSorter(raw: Ptr[GtkCustomSorter]) extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets (or unsets) the function used for sorting items.
    *
    * If @sort_func is %NULL, all items are considered equal.
    *
    * If the sort func changes its sorting behavior, gtk_sorter_changed() needs
    * to be called.
    *
    * If a previous function was set, its @user_destroy will be called now.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  def setSortFunc__ = ???

end CustomSorter

object CustomSorter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSorter` that works by calling
    * @sort_func
    *   to compare items.
    *
    * If @sort_func is %NULL, all items are considered equal.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  def `new`() = ???

end CustomSorter

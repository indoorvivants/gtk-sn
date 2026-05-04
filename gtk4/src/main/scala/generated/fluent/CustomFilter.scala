package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkCustomFilter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCustomFilter` determines whether to include items with a callback.
  */
class CustomFilter(raw: Ptr[GtkCustomFilter]) extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the function used for filtering items.
    *
    * If @match_func is %NULL, the filter matches all items.
    *
    * If the filter func changes its filtering behavior, gtk_filter_changed()
    * needs to be called.
    *
    * If a previous function was set, its @user_destroy will be called now.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomFilterFunc), @type -> DataRecord(GtkCustomFilterFunc)))"
  )
  def setFilterFunc__ = ???

end CustomFilter

object CustomFilter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new filter using the given @match_func to filter items.
    *
    * If @match_func is %NULL, the filter matches all items.
    *
    * If the filter func changes its filtering behavior, gtk_filter_changed()
    * needs to be called.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomFilterFunc), @type -> DataRecord(GtkCustomFilterFunc)))"
  )
  def `new`() = ???

end CustomFilter

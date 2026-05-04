package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkCustomFilter

/** `GtkCustomFilter` determines whether to include items with a callback.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CustomFilter(raw: Ptr[GtkCustomFilter]) extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Sets the function used for filtering items.
    *
    * If @match_func is %NULL, the filter matches all items.
    *
    * If the filter func changes its filtering behavior, gtk_filter_changed()
    * needs to be called.
    *
    * If a previous function was set, its @user_destroy will be called now.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_filter_func/<method parameters>/match_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomFilterFunc), @type -> DataRecord(GtkCustomFilterFunc)))"
  )
  private def setFilterFunc__ = ???

end CustomFilter

object CustomFilter:
  /** Creates a new filter using the given @match_func to filter items.
    *
    * If @match_func is %NULL, the filter matches all items.
    *
    * If the filter func changes its filtering behavior, gtk_filter_changed()
    * needs to be called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[match_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomFilterFunc), @type -> DataRecord(GtkCustomFilterFunc)))"
  )
  private def `new`() = ???

end CustomFilter

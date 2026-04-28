package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkStringFilter
import sn.gnome.gtk4.internal.GtkStringFilterMatchMode

class StringFilter(raw: Ptr[GtkStringFilter]) extends Filter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getExpression(): Expression = new Expression(
    gtk_string_filter_get_expression(this.raw.asInstanceOf).asInstanceOf
  )

  def getIgnoreCase(): Boolean =
    gtk_string_filter_get_ignore_case(this.raw.asInstanceOf).value.!=(0)

  def getMatchMode(): GtkStringFilterMatchMode =
    gtk_string_filter_get_match_mode(this.raw.asInstanceOf)

  def getSearch()(using Zone): String = fromCString(
    gtk_string_filter_get_search(this.raw.asInstanceOf).asInstanceOf
  )

  def setExpression(expression: Expression): Unit =
    gtk_string_filter_set_expression(
      this.raw.asInstanceOf,
      expression.getUnsafeRawPointer().asInstanceOf
    )

  def setIgnoreCase(ignore_case: Boolean): Unit =
    gtk_string_filter_set_ignore_case(
      this.raw.asInstanceOf,
      gboolean(gint((if ignore_case == true then 1 else 0)))
    )

  def setMatchMode(mode: GtkStringFilterMatchMode): Unit =
    gtk_string_filter_set_match_mode(this.raw.asInstanceOf, mode)

  def setSearch(search: String | CString)(using Zone): Unit =
    gtk_string_filter_set_search(
      this.raw.asInstanceOf,
      __sn_extract_string(search)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StringFilter

object StringFilter:
  def apply(expression: Expression): StringFilter = new StringFilter(
    gtk_string_filter_new(
      expression.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end StringFilter

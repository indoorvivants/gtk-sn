package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkExpression
import sn.gnome.gtk4.internal.GtkExpressionNotify
import sn.gnome.gtk4.internal.GtkExpressionWatch

class Expression(raw: Ptr[GtkExpression]):
  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def bind(target: Object, property: String | CString, `this_`: Object)(using
      Zone
  ): Ptr[GtkExpressionWatch] = gtk_expression_bind(
    this.raw.asInstanceOf,
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    __sn_extract_string(property),
    gpointer(`this_`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  def evaluate(`this_`: Object, value: Ptr[GValue]): Boolean =
    gtk_expression_evaluate(
      this.raw.asInstanceOf,
      gpointer(
        `this_`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      value
    ).value.!=(0)

  def getValueType(): GType = gtk_expression_get_value_type(
    this.raw.asInstanceOf
  )

  def isStatic(): Boolean =
    gtk_expression_is_static(this.raw.asInstanceOf).value.!=(0)

  def ref(): Expression = new Expression(
    gtk_expression_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def unref(): Unit = gtk_expression_unref(this.raw.asInstanceOf)

  def watch(
      `this_`: Object,
      _notify: GtkExpressionNotify,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): Ptr[GtkExpressionWatch] = gtk_expression_watch(
    this.raw.asInstanceOf,
    gpointer(
      `this_`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    _notify,
    gpointer(user_data),
    user_destroy
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Expression

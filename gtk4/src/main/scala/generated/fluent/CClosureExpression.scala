package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Expression
import sn.gnome.gtk4.internal.GtkCClosureExpression

class CClosureExpression(raw: Ptr[GtkCClosureExpression])
    extends Expression(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CClosureExpression

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkFlowBoxChildClass

class FlowBoxChildClass private[gnome] (raw: Ptr[GtkFlowBoxChildClass]):

  def getUnsafeRawPointer(): Ptr[GtkFlowBoxChildClass] = this.raw

  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???

end FlowBoxChildClass

object FlowBoxChildClass:
  def fromRaw(ptr: Ptr[GtkFlowBoxChildClass]): FlowBoxChildClass =
    new FlowBoxChildClass(ptr)
end FlowBoxChildClass

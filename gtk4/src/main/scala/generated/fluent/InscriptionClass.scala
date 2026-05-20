package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkInscriptionClass

class InscriptionClass private[gnome] (raw: Ptr[GtkInscriptionClass]):

  def getUnsafeRawPointer(): Ptr[GtkInscriptionClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end InscriptionClass

object InscriptionClass:
  def fromRaw(ptr: Ptr[GtkInscriptionClass]): InscriptionClass =
    new InscriptionClass(ptr)
end InscriptionClass

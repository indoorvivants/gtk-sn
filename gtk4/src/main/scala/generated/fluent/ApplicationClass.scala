package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ApplicationClass
import sn.gnome.gtk4.internal.GtkApplicationClass

class ApplicationClass private[gnome] (raw: Ptr[GtkApplicationClass]):

  def getUnsafeRawPointer(): Ptr[GtkApplicationClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gio.ApplicationClass /* None */ =
    (!raw).parent_class
      .asInstanceOf[_root_.sn.gnome.gio.internal.GApplicationClass]
  @annotation.compileTimeOnly("[field window_added]: Field is missing <type>")
  private def windowAdded__ = ???
  @annotation.compileTimeOnly("[field window_removed]: Field is missing <type>")
  private def windowRemoved__ = ???

end ApplicationClass

object ApplicationClass:
  def fromRaw(ptr: Ptr[GtkApplicationClass]): ApplicationClass =
    new ApplicationClass(ptr)
end ApplicationClass

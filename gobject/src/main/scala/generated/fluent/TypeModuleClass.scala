package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gobject.internal.GTypeModuleClass

/** In order to implement dynamic loading of types based on #GTypeModule, the @load
  * and @unload functions in #GTypeModuleClass must be implemented.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeModuleClass private[gnome] (raw: Ptr[GTypeModuleClass]):

  def getUnsafeRawPointer(): Ptr[GTypeModuleClass] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ =
    (!raw).parent_class.asInstanceOf[GObjectClass]
  @annotation.compileTimeOnly("[field load]: Field is missing <type>")
  private def load__ = ???
  @annotation.compileTimeOnly("[field unload]: Field is missing <type>")
  private def unload__ = ???
  @annotation.compileTimeOnly("[field reserved1]: Field is missing <type>")
  private def reserved1__ = ???
  @annotation.compileTimeOnly("[field reserved2]: Field is missing <type>")
  private def reserved2__ = ???
  @annotation.compileTimeOnly("[field reserved3]: Field is missing <type>")
  private def reserved3__ = ???
  @annotation.compileTimeOnly("[field reserved4]: Field is missing <type>")
  private def reserved4__ = ???
end TypeModuleClass

object TypeModuleClass:
  def fromRaw(ptr: Ptr[GTypeModuleClass]): TypeModuleClass =
    new TypeModuleClass(ptr)
end TypeModuleClass

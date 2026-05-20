package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeClass
import sn.gnome.gobject.internal.GInitiallyUnownedClass

/** The class structure for the GInitiallyUnowned type.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InitiallyUnownedClass private[gnome] (raw: Ptr[GInitiallyUnownedClass]):

  def getUnsafeRawPointer(): Ptr[GInitiallyUnownedClass] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gTypeClass: sn.gnome.gobject.TypeClass /* None */ =
    (!raw).g_type_class.asInstanceOf[GTypeClass]

  @annotation.compileTimeOnly("[field constructor]: Field is missing <type>")
  private def constructor__ = ???
  @annotation.compileTimeOnly("[field set_property]: Field is missing <type>")
  private def setProperty__ = ???
  @annotation.compileTimeOnly("[field get_property]: Field is missing <type>")
  private def getProperty__ = ???
  @annotation.compileTimeOnly("[field dispose]: Field is missing <type>")
  private def dispose__ = ???
  @annotation.compileTimeOnly("[field finalize]: Field is missing <type>")
  private def finalize__ = ???
  @annotation.compileTimeOnly(
    "[field dispatch_properties_changed]: Field is missing <type>"
  )
  private def dispatchPropertiesChanged__ = ???
  @annotation.compileTimeOnly(
    "[field notify]: Field notify has no target types"
  )
  private def notify__ = ???
  @annotation.compileTimeOnly("[field constructed]: Field is missing <type>")
  private def constructed__ = ???

end InitiallyUnownedClass

object InitiallyUnownedClass:
  def fromRaw(ptr: Ptr[GInitiallyUnownedClass]): InitiallyUnownedClass =
    new InitiallyUnownedClass(ptr)
end InitiallyUnownedClass

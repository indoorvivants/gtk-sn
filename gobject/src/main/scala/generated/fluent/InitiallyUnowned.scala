package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GInitiallyUnowned
import sn.gnome.gobject.runtime.*

/** A type for objects that have an initially floating reference.
  *
  * All the fields in the `GInitiallyUnowned` structure are private to the
  * implementation and should never be accessed directly.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InitiallyUnowned private[gnome] (raw: Ptr[GInitiallyUnowned])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end InitiallyUnowned

object InitiallyUnowned:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GInitiallyUnowned])(using Runtime) =
    summon[Runtime].getOrCreate[InitiallyUnowned](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new InitiallyUnowned(ptr)
    )

end InitiallyUnowned

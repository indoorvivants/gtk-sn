package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GInitiallyUnowned

/** A type for objects that have an initially floating reference.
  *
  * All the fields in the `GInitiallyUnowned` structure are private to the
  * implementation and should never be accessed directly.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InitiallyUnowned(raw: Ptr[GInitiallyUnowned])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end InitiallyUnowned

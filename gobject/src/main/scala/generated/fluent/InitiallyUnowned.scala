package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GInitiallyUnowned

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A type for objects that have an initially floating reference.
  *
  * All the fields in the `GInitiallyUnowned` structure are private to the
  * implementation and should never be accessed directly.
  */
class InitiallyUnowned(raw: Ptr[GInitiallyUnowned])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end InitiallyUnowned

package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecFloat

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GParamSpec derived structure that contains the meta data for float
  * properties.
  */
class ParamSpecFloat(raw: Ptr[GParamSpecFloat])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecFloat

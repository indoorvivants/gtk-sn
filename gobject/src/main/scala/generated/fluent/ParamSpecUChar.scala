package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecUChar

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GParamSpec derived structure that contains the meta data for unsigned
  * character properties.
  */
class ParamSpecUChar(raw: Ptr[GParamSpecUChar])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecUChar

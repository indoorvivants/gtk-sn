package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkBuildableIface

/** The `GtkBuildableIface` interface contains methods that are necessary to
  * allow `GtkBuilder` to construct an object from a `GtkBuilder` UI definition.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BuildableIface private[gnome] (raw: Ptr[GtkBuildableIface]):

  def getUnsafeRawPointer(): Ptr[GtkBuildableIface] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field set_id]: Field is missing <type>")
  private def setId__ = ???
  @annotation.compileTimeOnly("[field get_id]: Field is missing <type>")
  private def getId__ = ???
  @annotation.compileTimeOnly("[field add_child]: Field is missing <type>")
  private def addChild__ = ???
  @annotation.compileTimeOnly(
    "[field set_buildable_property]: Field is missing <type>"
  )
  private def setBuildableProperty__ = ???
  @annotation.compileTimeOnly(
    "[field construct_child]: Field is missing <type>"
  )
  private def constructChild__ = ???
  @annotation.compileTimeOnly(
    "[field custom_tag_start]: Field is missing <type>"
  )
  private def customTagStart__ = ???
  @annotation.compileTimeOnly("[field custom_tag_end]: Field is missing <type>")
  private def customTagEnd__ = ???
  @annotation.compileTimeOnly(
    "[field custom_finished]: Field is missing <type>"
  )
  private def customFinished__ = ???
  @annotation.compileTimeOnly(
    "[field parser_finished]: Field is missing <type>"
  )
  private def parserFinished__ = ???
  @annotation.compileTimeOnly(
    "[field get_internal_child]: Field is missing <type>"
  )
  private def getInternalChild__ = ???
end BuildableIface

object BuildableIface:
  def fromRaw(ptr: Ptr[GtkBuildableIface]): BuildableIface = new BuildableIface(
    ptr
  )
end BuildableIface

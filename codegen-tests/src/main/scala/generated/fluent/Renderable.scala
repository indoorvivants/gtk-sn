package sn.gnome.codegentests

import _root_.sn.gnome.codegentests.internal.*

import _root_.scala.scalanative.unsafe.*

trait Renderable:
  def getUnsafeRawPointer(): Ptr[Byte]
  def render(width: Int /* Some(CInt) */ )(using Zone): String /* None */ =
    fromCString(
      test_renderable_render(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GRenderable]],
        width
      ).asInstanceOf
    )
  end render

end Renderable

object Renderable:
  class Abstract(raw: Ptr[Byte]) extends Renderable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Renderable

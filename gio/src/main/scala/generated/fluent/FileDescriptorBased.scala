package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait FileDescriptorBased:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the underlying file descriptor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_fd]: Method g_file_descriptor_based_get_fd has no target types"
  )
  private def getFd__ = ???

end FileDescriptorBased

object FileDescriptorBased:
  class Abstract(raw: Ptr[Byte]) extends FileDescriptorBased:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end FileDescriptorBased

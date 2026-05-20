package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GCredentialsClass

/** Class structure for #GCredentials.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CredentialsClass private[gnome] (raw: Ptr[GCredentialsClass]):

  def getUnsafeRawPointer(): Ptr[GCredentialsClass] = this.raw
end CredentialsClass

object CredentialsClass:
  def fromRaw(ptr: Ptr[GCredentialsClass]): CredentialsClass =
    new CredentialsClass(ptr)
end CredentialsClass

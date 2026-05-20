package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GHashTable

/** The #GHashTable struct is an opaque data structure to represent a [Hash
  * Table][glib-Hash-Tables]. It should only be accessed via the following
  * functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class HashTable private[gnome] (raw: Ptr[GHashTable]):

  def getUnsafeRawPointer(): Ptr[GHashTable] = this.raw
end HashTable

object HashTable:
  def fromRaw(ptr: Ptr[GHashTable]): HashTable = new HashTable(ptr)
end HashTable

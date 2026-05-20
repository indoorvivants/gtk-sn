package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GResolverClass
import sn.gnome.gobject.ObjectClass

class ResolverClass private[gnome] (raw: Ptr[GResolverClass]):

  def getUnsafeRawPointer(): Ptr[GResolverClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field reload]: Field is missing <type>")
  private def reload__ = ???
  @annotation.compileTimeOnly("[field lookup_by_name]: Field is missing <type>")
  private def lookupByName__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_name_async]: Field is missing <type>"
  )
  private def lookupByNameAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_name_finish]: Field is missing <type>"
  )
  private def lookupByNameFinish__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_address]: Field is missing <type>"
  )
  private def lookupByAddress__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_address_async]: Field is missing <type>"
  )
  private def lookupByAddressAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_address_finish]: Field is missing <type>"
  )
  private def lookupByAddressFinish__ = ???
  @annotation.compileTimeOnly("[field lookup_service]: Field is missing <type>")
  private def lookupService__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_service_async]: Field is missing <type>"
  )
  private def lookupServiceAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_service_finish]: Field is missing <type>"
  )
  private def lookupServiceFinish__ = ???
  @annotation.compileTimeOnly("[field lookup_records]: Field is missing <type>")
  private def lookupRecords__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_records_async]: Field is missing <type>"
  )
  private def lookupRecordsAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_records_finish]: Field is missing <type>"
  )
  private def lookupRecordsFinish__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_name_with_flags_async]: Field is missing <type>"
  )
  private def lookupByNameWithFlagsAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_name_with_flags_finish]: Field is missing <type>"
  )
  private def lookupByNameWithFlagsFinish__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_by_name_with_flags]: Field is missing <type>"
  )
  private def lookupByNameWithFlags__ = ???
end ResolverClass

object ResolverClass:
  def fromRaw(ptr: Ptr[GResolverClass]): ResolverClass = new ResolverClass(ptr)
end ResolverClass

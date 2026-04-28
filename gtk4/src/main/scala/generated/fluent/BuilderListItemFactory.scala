package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GBytes
import sn.gnome.gtk4.fluent.BuilderScope
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.internal.GtkBuilderListItemFactory

class BuilderListItemFactory(raw: Ptr[GtkBuilderListItemFactory])
    extends ListItemFactory(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBytes(): Ptr[GBytes] = gtk_builder_list_item_factory_get_bytes(
    this.raw.asInstanceOf
  )

  def getResource()(using Zone): String = fromCString(
    gtk_builder_list_item_factory_get_resource(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getScope(): BuilderScope = new BuilderScope.Abstract(
    gtk_builder_list_item_factory_get_scope(this.raw.asInstanceOf).asInstanceOf
  )

end BuilderListItemFactory

object BuilderListItemFactory:
  def fromBytes(
      scope: BuilderScope,
      bytes: Ptr[GBytes]
  ): BuilderListItemFactory = new BuilderListItemFactory(
    gtk_builder_list_item_factory_new_from_bytes(
      scope.getUnsafeRawPointer().asInstanceOf,
      bytes
    ).asInstanceOf
  )
  def fromResource(scope: BuilderScope, resource_path: String | CString)(using
      Zone
  ): BuilderListItemFactory = new BuilderListItemFactory(
    gtk_builder_list_item_factory_new_from_resource(
      scope.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(resource_path)
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end BuilderListItemFactory

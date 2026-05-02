package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GBytes
import sn.gnome.gtk4.fluent.BuilderScope
import sn.gnome.gtk4.fluent.ListItemFactory
import sn.gnome.gtk4.internal.GtkBuilderListItemFactory

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkBuilderListItemFactory` is a `GtkListItemFactory` that creates widgets
  * by instantiating `GtkBuilder` UI templates.
  *
  * The templates must be extending `GtkListItem`, and typically use
  * `GtkExpression`s to obtain data from the items in the model.
  *
  * Example:
  * ```xml
  *   <interface>
  *     <template class="GtkListItem">
  *       <property name="child">
  *         <object class="GtkLabel">
  *           <property name="xalign">0</property>
  *           <binding name="label">
  *             <lookup name="name" type="SettingsKey">
  *               <lookup name="item">GtkListItem</lookup>
  *             </lookup>
  *           </binding>
  *         </object>
  *       </property>
  *     </template>
  *   </interface>
  * ```
  */
class BuilderListItemFactory(raw: Ptr[GtkBuilderListItemFactory])
    extends ListItemFactory(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the data used as the `GtkBuilder` UI template for constructing
    * listitems.
    */
  def getBytes(): Ptr[GBytes] /* None */ =
    gtk_builder_list_item_factory_get_bytes(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If the data references a resource, gets the path of that resource.
    */
  def getResource()(using Zone): String /* None */ = fromCString(
    gtk_builder_list_item_factory_get_resource(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the scope used when constructing listitems.
    */
  def getScope(): BuilderScope /* None */ = new BuilderScope.Abstract(
    gtk_builder_list_item_factory_get_scope(this.raw.asInstanceOf).asInstanceOf
  )

end BuilderListItemFactory

object BuilderListItemFactory:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkBuilderListItemFactory` that instantiates widgets using @bytes
    * as the data to pass to `GtkBuilder`.
    */
  def fromBytes(
      scope: Option[BuilderScope /* Some(Ptr[GtkBuilderScope]) */ ],
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  ): BuilderListItemFactory = new BuilderListItemFactory(
    gtk_builder_list_item_factory_new_from_bytes(
      scope
        .map[Ptr[GtkBuilderScope]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkBuilderScope]]),
      bytes
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkBuilderListItemFactory` that instantiates widgets using
    * data read from the given @resource_path to pass to `GtkBuilder`.
    */
  def fromResource(
      scope: Option[BuilderScope /* Some(Ptr[GtkBuilderScope]) */ ],
      resource_path: String | CString /* Some(CString) */
  )(using Zone): BuilderListItemFactory = new BuilderListItemFactory(
    gtk_builder_list_item_factory_new_from_resource(
      scope
        .map[Ptr[GtkBuilderScope]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkBuilderScope]]),
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

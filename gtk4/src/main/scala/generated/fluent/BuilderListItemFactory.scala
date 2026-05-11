package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{BuilderScope, ListItemFactory}
import sn.gnome.gtk4.internal.GtkBuilderListItemFactory

/** `GtkBuilderListItemFactory` is a `GtkListItemFactory` that creates widgets
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BuilderListItemFactory private[gnome] (
    raw: Ptr[GtkBuilderListItemFactory]
) extends ListItemFactory(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the data used as the `GtkBuilder` UI template for constructing
    * listitems.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bytes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getBytes__ = ???

  /** If the data references a resource, gets the path of that resource.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResource()(using Zone): String /* None */ =
    fromCString(
      gtk_builder_list_item_factory_get_resource(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBuilderListItemFactory]]
      ).asInstanceOf
    )
  end getResource

  /** Gets the scope used when constructing listitems.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScope(): BuilderScope /* None */ =
    new BuilderScope.Abstract(
      gtk_builder_list_item_factory_get_scope(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBuilderListItemFactory]]
      ).asInstanceOf
    )
  end getScope

end BuilderListItemFactory

object BuilderListItemFactory:
  def applyUnsafe(ptr: Ptr[GtkBuilderListItemFactory])(using Runtime) =
    summon[Runtime].getOrCreate[BuilderListItemFactory](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BuilderListItemFactory(ptr)
    )

  /** Creates a new `GtkBuilderListItemFactory` that instantiates widgets using @bytes
    * as the data to pass to `GtkBuilder`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def new_from_bytes() = ???

  /** Creates a new `GtkBuilderListItemFactory` that instantiates widgets using
    * data read from the given @resource_path to pass to `GtkBuilder`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromResource(
      scope: Option[BuilderScope /* Some(Ptr[GtkBuilderScope]) */ ],
      resource_path: String /* Some(CString) */
  )(using Zone, Runtime): BuilderListItemFactory =
    val raw: Ptr[Byte] = gtk_builder_list_item_factory_new_from_resource(
      scope
        .map[Ptr[GtkBuilderScope]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkBuilderScope]]),
      toCString(resource_path)
    ).asInstanceOf
    summon[Runtime].getOrCreate[BuilderListItemFactory](
      raw,
      r => BuilderListItemFactory.applyUnsafe(r.asInstanceOf)
    )
  end fromResource
end BuilderListItemFactory

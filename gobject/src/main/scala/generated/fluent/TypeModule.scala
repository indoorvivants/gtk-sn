package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.fluent.TypePlugin
import sn.gnome.gobject.internal.GEnumValue
import sn.gnome.gobject.internal.GFlagsValue
import sn.gnome.gobject.internal.GInterfaceInfo
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GTypeFlags
import sn.gnome.gobject.internal.GTypeInfo
import sn.gnome.gobject.internal.GTypeModule

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GTypeModule provides a simple implementation of the #GTypePlugin interface.
  *
  * The model of #GTypeModule is a dynamically loaded module which implements
  * some number of types and interface implementations.
  *
  * When the module is loaded, it registers its types and interfaces using
  * g_type_module_register_type() and g_type_module_add_interface(). As long as
  * any instances of these types and interface implementations are in use, the
  * module is kept loaded. When the types and interfaces are gone, the module
  * may be unloaded. If the types and interfaces become used again, the module
  * will be reloaded. Note that the last reference cannot be released from
  * within the module code, since that would lead to the caller's code being
  * unloaded before g_object_unref() returns to it.
  *
  * Keeping track of whether the module should be loaded or not is done by using
  * a use count - it starts at zero, and whenever it is greater than zero, the
  * module is loaded. The use count is maintained internally by the type system,
  * but also can be explicitly controlled by g_type_module_use() and
  * g_type_module_unuse(). Typically, when loading a module for the first type,
  * g_type_module_use() will be used to load it so that it can initialize its
  * types. At some later point, when the module no longer needs to be loaded
  * except for the type implementations it contains, g_type_module_unuse() is
  * called.
  *
  * #GTypeModule does not actually provide any implementation of module loading
  * and unloading. To create a particular module type you must derive from
  * #GTypeModule and implement the load and unload functions in
  * #GTypeModuleClass.
  */
class TypeModule(raw: Ptr[GTypeModule])
    extends Object(raw.asInstanceOf),
      TypePlugin:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers an additional interface for a type, whose interface lives in the
    * given type plugin. If the interface was already registered for the type in
    * this plugin, nothing will be done.
    *
    * As long as any instances of the type exist, the type plugin will not be
    * unloaded.
    *
    * Since 2.56 if @module is %NULL this will call
    * g_type_add_interface_static() instead. This can be used when making a
    * static build of the module.
    */
  def addInterface(
      instance_type: GType,
      interface_type: GType,
      interface_info: Ptr[GInterfaceInfo]
  ): Unit = g_type_module_add_interface(
    this.raw.asInstanceOf,
    instance_type,
    interface_type,
    interface_info
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up or registers an enumeration that is implemented with a particular
    * type plugin. If a type with name @type_name was previously registered, the
    * #GType identifier for the type is returned, otherwise the type is newly
    * registered, and the resulting #GType identifier returned.
    *
    * As long as any instances of the type exist, the type plugin will not be
    * unloaded.
    *
    * Since 2.56 if @module is %NULL this will call g_type_register_static()
    * instead. This can be used when making a static build of the module.
    */
  def registerEnum(
      name: String | CString,
      const_static_values: Ptr[GEnumValue]
  )(using Zone): GType = g_type_module_register_enum(
    this.raw.asInstanceOf,
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
    const_static_values
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up or registers a flags type that is implemented with a particular
    * type plugin. If a type with name @type_name was previously registered, the
    * #GType identifier for the type is returned, otherwise the type is newly
    * registered, and the resulting #GType identifier returned.
    *
    * As long as any instances of the type exist, the type plugin will not be
    * unloaded.
    *
    * Since 2.56 if @module is %NULL this will call g_type_register_static()
    * instead. This can be used when making a static build of the module.
    */
  def registerFlags(
      name: String | CString,
      const_static_values: Ptr[GFlagsValue]
  )(using Zone): GType = g_type_module_register_flags(
    this.raw.asInstanceOf,
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
    const_static_values
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up or registers a type that is implemented with a particular type
    * plugin. If a type with name @type_name was previously registered, the
    * #GType identifier for the type is returned, otherwise the type is newly
    * registered, and the resulting #GType identifier returned.
    *
    * When reregistering a type (typically because a module is unloaded then
    * reloaded, and reinitialized), @module and @parent_type must be the same as
    * they were previously.
    *
    * As long as any instances of the type exist, the type plugin will not be
    * unloaded.
    *
    * Since 2.56 if @module is %NULL this will call g_type_register_static()
    * instead. This can be used when making a static build of the module.
    */
  def registerType(
      parent_type: GType,
      type_name: String | CString,
      type_info: Ptr[GTypeInfo],
      flags: GTypeFlags
  )(using Zone): GType = g_type_module_register_type(
    this.raw.asInstanceOf,
    parent_type,
    __sn_extract_string(type_name).asInstanceOf[Ptr[gchar]],
    type_info,
    flags
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the name for a #GTypeModule
    */
  def setName(name: String | CString)(using Zone): Unit =
    g_type_module_set_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the use count of a #GTypeModule by one. If the result is zero,
    * the module will be unloaded. (However, the #GTypeModule will not be freed,
    * and types associated with the #GTypeModule are not unregistered. Once a
    * #GTypeModule is initialized, it must exist forever.)
    */
  def unuse(): Unit = g_type_module_unuse(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the use count of a #GTypeModule by one. If the use count was
    * zero before, the plugin will be loaded. If loading the plugin fails, the
    * use count is reset to its prior value.
    */
  def use(): Boolean = g_type_module_use(this.raw.asInstanceOf).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TypeModule

package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gchar, guint}
import sn.gnome.gobject.{ParamSpec, TypeClass}
import sn.gnome.gobject.internal.GObjectClass
import sn.gnome.gobject.runtime.*

/**  The class structure for the GObject type.
  *
  *  |[<!-- language="C" -->
  *  // Example of implementing a singleton using a constructor.
  *  static MySingleton *the_singleton = NULL;
  *
  *  static GObject*
  *  my_singleton_constructor (GType                  type,
  *                            guint                  n_construct_params,
  *                            GObjectConstructParam *construct_params)
  *  {
  *    GObject *object;
  *
  *    if (!the_singleton)
  *      {
  *        object = G_OBJECT_CLASS (parent_class)->constructor (type,
  *                                                             n_construct_params,
  *                                                             construct_params);
  *        the_singleton = MY_SINGLETON (object);
  *      }
  *    else
  *      object = g_object_ref (G_OBJECT (the_singleton));
  *
  *    return object;
  *  }
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class ObjectClass private[gnome] (raw: Ptr[GObjectClass]):

  def getUnsafeRawPointer(): Ptr[GObjectClass] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gTypeClass: sn.gnome.gobject.TypeClass /* None */ =
    (!raw).g_type_class.asInstanceOf[GTypeClass]

  @annotation.compileTimeOnly("[field constructor]: Field is missing <type>")
  private def constructor__ = ???
  @annotation.compileTimeOnly("[field set_property]: Field is missing <type>")
  private def setProperty__ = ???
  @annotation.compileTimeOnly("[field get_property]: Field is missing <type>")
  private def getProperty__ = ???
  @annotation.compileTimeOnly("[field dispose]: Field is missing <type>")
  private def dispose__ = ???
  @annotation.compileTimeOnly("[field finalize]: Field is missing <type>")
  private def finalize__ = ???
  @annotation.compileTimeOnly(
    "[field dispatch_properties_changed]: Field is missing <type>"
  )
  private def dispatchPropertiesChanged__ = ???
  @annotation.compileTimeOnly(
    "[field notify]: Field notify has no target types"
  )
  private def notify__ = ???
  @annotation.compileTimeOnly("[field constructed]: Field is missing <type>")
  private def constructed__ = ???

  /** Looks up the #GParamSpec for a property of a class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findProperty(
      property_name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): sn.gnome.gobject.ParamSpec /* None */ =
    sn.gnome.gobject.ParamSpec.applyUnsafe(
      g_object_class_find_property(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GObjectClass]],
        toCString(property_name).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end findProperty

  /**  Installs new properties from an array of #GParamSpecs.
    *
    *  All properties should be installed during the class initializer.  It
    *  is possible to install properties after that, but doing so is not
    *  recommend, and specifically, is not guaranteed to be thread-safe vs.
    *  use of properties on the same type on other threads.
    *
    *  The property id of each property is the index of each #GParamSpec in
    *  the @pspecs array.
    *
    *  The property id of 0 is treated specially by #GObject and it should not
    *  be used to store a #GParamSpec.
    *
    *  This function should be used if you plan to use a static array of
    *  #GParamSpecs and g_object_notify_by_pspec(). For instance, this
    *  class initialization:
    *
    *  |[<!-- language="C" -->
    *  typedef enum {
    *    PROP_FOO = 1,
    *    PROP_BAR,
    *    N_PROPERTIES
    *  } MyObjectProperty;
    *
    *  static GParamSpec *obj_properties[N_PROPERTIES] = { NULL, };
    *
    *  static void
    *  my_object_class_init (MyObjectClass *klass)
    *  {
    *    GObjectClass *gobject_class = G_OBJECT_CLASS (klass);
    *
    *    obj_properties[PROP_FOO] =
    *      g_param_spec_int ("foo", "Foo", "Foo",
    *                        -1, G_MAXINT,
    *                        0,
    *                        G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
    *
    *    obj_properties[PROP_BAR] =
    *      g_param_spec_string ("bar", "Bar", "Bar",
    *                           NULL,
    *                           G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
    *
    *    gobject_class->set_property = my_object_set_property;
    *    gobject_class->get_property = my_object_get_property;
    *    g_object_class_install_properties (gobject_class,
    *                                       G_N_ELEMENTS (obj_properties),
    *                                       obj_properties);
    *  }
    *  ]|
    *
    *  allows calling g_object_notify_by_pspec() to notify of property changes:
    *
    *  |[<!-- language="C" -->
    *  void
    *  my_object_set_foo (MyObject *self, gint foo)
    *  {
    *    if (self->foo != foo)
    *      {
    *        self->foo = foo;
    *        g_object_notify_by_pspec (G_OBJECT (self), obj_properties[PROP_FOO]);
    *      }
    *   }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method install_properties/<method parameters>/pspecs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ParamSpec), @type -> DataRecord(GParamSpec*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GParamSpec**)))"
  )
  private def installProperties__ = ???

  /** Installs a new property.
    *
    * All properties should be installed during the class initializer. It is
    * possible to install properties after that, but doing so is not recommend,
    * and specifically, is not guaranteed to be thread-safe vs. use of
    * properties on the same type on other threads.
    *
    * Note that it is possible to redefine a property in a derived class, by
    * installing a property with the same name. This can be useful at times,
    * e.g. to change the range of allowed values or the default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def installProperty(
      property_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      pspec: sn.gnome.gobject.ParamSpec /* Some(Ptr[GParamSpec]) */
  )(using Runtime): Unit /* None */ =
    g_object_class_install_property(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObjectClass]],
      guint(property_id),
      pspec.getUnsafeRawPointer().asInstanceOf
    )
  end installProperty

  /** Get an array of #GParamSpec* for all properties of a class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_properties]: Method list_properties contains an OUT parameter, which is not supported yet"
  )
  private def listProperties__ = ???

  /** Registers @property_id as referring to a property with the name
    * @name
    *   in a parent class or in an interface implemented by @oclass. This allows
    *   this class to "override" a property implementation in a parent class or
    *   to provide the implementation of a property from an interface.
    *
    * Internally, overriding is implemented by creating a property of type
    * #GParamSpecOverride; generally operations that query the properties of the
    * object class, such as g_object_class_find_property() or
    * g_object_class_list_properties() will return the overridden property.
    * However, in one case, the @construct_properties argument of the @constructor
    * virtual function, the #GParamSpecOverride is passed instead, so that the @param_id
    * field of the #GParamSpec will be correct. For virtually all uses, this
    * makes no difference. If you need to get the overridden property, you can
    * call g_param_spec_get_redirect_target().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def overrideProperty(
      property_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_object_class_override_property(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObjectClass]],
      guint(property_id),
      toCString(name).asInstanceOf[Ptr[gchar]]
    )
  end overrideProperty

end ObjectClass

object ObjectClass:
  def fromRaw(ptr: Ptr[GObjectClass]): ObjectClass = new ObjectClass(ptr)
end ObjectClass

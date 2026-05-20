package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gint, gpointer, gsize}
import sn.gnome.gobject.TypeClass
import sn.gnome.gobject.internal.{GType, GTypeClass}

/** An opaque structure used as the base of all classes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeClass private[gnome] (raw: Ptr[GTypeClass]):

  def getUnsafeRawPointer(): Ptr[GTypeClass] = this.raw

  /**  Registers a private structure for an instantiatable type.
    *
    *  When an object is allocated, the private structures for
    *  the type and all of its parent types are allocated
    *  sequentially in the same memory block as the public
    *  structures, and are zero-filled.
    *
    *  Note that the accumulated size of the private structures of
    *  a type and all its parent types cannot exceed 64 KiB.
    *
    *  This function should be called in the type's class_init() function.
    *  The private structure can be retrieved using the
    *  G_TYPE_INSTANCE_GET_PRIVATE() macro.
    *
    *  The following example shows attaching a private structure
    *  MyObjectPrivate to an object MyObject defined in the standard
    *  GObject fashion in the type's class_init() function.
    *
    *  Note the use of a structure member "priv" to avoid the overhead
    *  of repeatedly calling MY_OBJECT_GET_PRIVATE().
    *
    *  |[<!-- language="C" -->
    *  typedef struct _MyObject        MyObject;
    *  typedef struct _MyObjectPrivate MyObjectPrivate;
    *
    *  struct _MyObject {
    *   GObject parent;
    *
    *   MyObjectPrivate *priv;
    *  };
    *
    *  struct _MyObjectPrivate {
    *    int some_field;
    *  };
    *
    *  static void
    *  my_object_class_init (MyObjectClass *klass)
    *  {
    *    g_type_class_add_private (klass, sizeof (MyObjectPrivate));
    *  }
    *
    *  static void
    *  my_object_init (MyObject *my_object)
    *  {
    *    my_object->priv = G_TYPE_INSTANCE_GET_PRIVATE (my_object,
    *                                                   MY_TYPE_OBJECT,
    *                                                   MyObjectPrivate);
    *    // my_object->priv->some_field will be automatically initialised to 0
    *  }
    *
    *  static int
    *  my_object_get_some_field (MyObject *my_object)
    *  {
    *    MyObjectPrivate *priv;
    *
    *    g_return_val_if_fail (MY_IS_OBJECT (my_object), 0);
    *
    *    priv = my_object->priv;
    *
    *    return priv->some_field;
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def addPrivate(
      private_size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): Unit /* None */ =
    g_type_class_add_private(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer],
      gsize(private_size)
    )
  end addPrivate

  /** Gets the offset of the private data for instances of @g_class.
    *
    * This is how many bytes you should add to the instance pointer of a class
    * in order to get the private data for the type represented by
    * @g_class.
    *
    * You can only call this function after you have registered a private data
    * area for @g_class using g_type_class_add_private().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInstancePrivateOffset(): Int /* None */ =
    g_type_class_get_instance_private_offset(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    ).value
  end getInstancePrivateOffset

  def getPrivate(private_type: GType /* Some(GType) */ ): Ptr[Byte] /* None */ =
    g_type_class_get_private(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTypeClass]],
      private_type
    ).value
  end getPrivate

  /** This is a convenience function often needed in class initializers. It
    * returns the class structure of the immediate parent type of the class
    * passed in. Since derived classes hold a reference count on their parent
    * classes as long as they are instantiated, the returned class will always
    * exist.
    *
    * This function is essentially equivalent to: g_type_class_peek
    * (g_type_parent (G_TYPE_FROM_CLASS (g_class)))
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekParent(): sn.gnome.gobject.TypeClass /* None */ =
    sn.gnome.gobject.TypeClass.fromRaw(
      g_type_class_peek_parent(
        this
          .getUnsafeRawPointer()
          .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
      )
    )
  end peekParent

  /** Decrements the reference count of the class structure being passed in.
    * Once the last reference count of a class has been released, classes may be
    * finalized by the type system, so further dereferencing of a class pointer
    * after g_type_class_unref() are invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_type_class_unref(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    )
  end unref

  /** A variant of g_type_class_unref() for use in #GTypeClassCacheFunc
    * implementations. It unreferences a class without consulting the chain of
    * #GTypeClassCacheFuncs, avoiding the recursion which would occur otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unrefUncached(): Unit /* None */ =
    g_type_class_unref_uncached(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    )
  end unrefUncached

end TypeClass

object TypeClass:
  def fromRaw(ptr: Ptr[GTypeClass]): TypeClass = new TypeClass(ptr)
end TypeClass

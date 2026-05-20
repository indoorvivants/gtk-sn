package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.GWeakRef
import sn.gnome.gobject.runtime.*

/** A structure containing a weak reference to a #GObject.
  *
  * A `GWeakRef` can either be empty (i.e. point to %NULL), or point to an
  * object for as long as at least one "strong" reference to that object exists.
  * Before the object's #GObjectClass.dispose method is called, every #GWeakRef
  * associated with becomes empty (i.e. points to %NULL).
  *
  * Like #GValue, #GWeakRef can be statically allocated, stack- or
  * heap-allocated, or embedded in larger structures.
  *
  * Unlike g_object_weak_ref() and g_object_add_weak_pointer(), this weak
  * reference is thread-safe: converting a weak pointer to a reference is atomic
  * with respect to invalidation of weak pointers to destroyed objects.
  *
  * If the object's #GObjectClass.dispose method results in additional
  * references to the object being held (‘re-referencing’), any #GWeakRefs taken
  * before it was disposed will continue to point to %NULL. Any #GWeakRefs taken
  * during disposal and after re-referencing, or after disposal has returned due
  * to the re-referencing, will continue to point to the object until its
  * refcount goes back to zero, at which point they too will be invalidated.
  *
  * It is invalid to take a #GWeakRef on an object during #GObjectClass.dispose
  * without first having or creating a strong reference to the object.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class WeakRef private[gnome] (raw: Ptr[GWeakRef]):

  def getUnsafeRawPointer(): Ptr[GWeakRef] = this.raw

  /** Frees resources associated with a non-statically-allocated #GWeakRef.
    * After this call, the #GWeakRef is left in an undefined state.
    *
    * You should only call this on a #GWeakRef that previously had
    * g_weak_ref_init() called on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method clear]: Method clear contains an INOUT parameter, which is not supported yet"
  )
  private def clear__ = ???

  /** If @weak_ref is not empty, atomically acquire a strong reference to the
    * object it points to, and return that reference.
    *
    * This function is needed because of the potential race between taking the
    * pointer value and g_object_ref() on it, if the object was losing its last
    * reference at the same time in a different thread.
    *
    * The caller should release the resulting reference in the usual way, by
    * using g_object_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get]: Method get contains an INOUT parameter, which is not supported yet"
  )
  private def get__ = ???

  /** Initialise a non-statically-allocated #GWeakRef.
    *
    * This function also calls g_weak_ref_set() with @object on the
    * freshly-initialised weak reference.
    *
    * This function should always be matched with a call to g_weak_ref_clear().
    * It is not necessary to use this function for a #GWeakRef in static storage
    * because it will already be properly initialised. Just use g_weak_ref_set()
    * directly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method init]: Method init contains an INOUT parameter, which is not supported yet"
  )
  private def init__ = ???

  /** Change the object to which @weak_ref points, or set it to %NULL.
    *
    * You must own a strong reference on @object while calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def set(
      `object`: Option[
        sn.gnome.gobject.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Runtime): Unit /* None */ =
    g_weak_ref_set(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GWeakRef]],
      `object`
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end set

end WeakRef

object WeakRef:
  def fromRaw(ptr: Ptr[GWeakRef]): WeakRef = new WeakRef(ptr)
end WeakRef

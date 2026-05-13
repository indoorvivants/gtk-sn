package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuAttributeIter
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GMenuAttributeIter is an opaque structure type. You must access it using
  * the functions below.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MenuAttributeIter private[gnome] (raw: Ptr[GMenuAttributeIter])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the name of the attribute at the current iterator position, as a
    * string.
    *
    * The iterator is not advanced.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ =
    fromCString(
      g_menu_attribute_iter_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuAttributeIter]]
      ).asInstanceOf
    )
  end getName

  /** This function combines g_menu_attribute_iter_next() with
    * g_menu_attribute_iter_get_name() and g_menu_attribute_iter_get_value().
    *
    * First the iterator is advanced to the next (possibly first) attribute. If
    * that fails, then %FALSE is returned and there are no other effects.
    *
    * If successful, @name and @value are set to the name and value of the
    * attribute that has just been advanced to. At this point,
    * g_menu_attribute_iter_get_name() and g_menu_attribute_iter_get_value()
    * will return the same values again.
    *
    * The value returned in @name remains valid for as long as the iterator
    * remains at the current position. The value returned in @value must be
    * unreffed using g_variant_unref() when it is no longer in use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_next]: Method get_next contains an OUT parameter, which is not supported yet"
  )
  private def getNext__ = ???

  /** Gets the value of the attribute at the current iterator position.
    *
    * The iterator is not advanced.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getValue__ = ???

  /** Attempts to advance the iterator to the next (possibly first) attribute.
    *
    * %TRUE is returned on success, or %FALSE if there are no more attributes.
    *
    * You must call this function when you first acquire the iterator to advance
    * it to the first attribute (and determine if the first attribute exists at
    * all).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): Boolean /* None */ =
    g_menu_attribute_iter_next(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenuAttributeIter]]
    ).value.!=(0)
  end next

end MenuAttributeIter

object MenuAttributeIter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GMenuAttributeIter])(using Runtime) =
    summon[Runtime].getOrCreate[MenuAttributeIter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MenuAttributeIter(ptr)
    )

end MenuAttributeIter

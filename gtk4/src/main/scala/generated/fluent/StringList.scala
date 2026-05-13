package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.internal.GtkStringList

/** `GtkStringList` is a list model that wraps an array of strings.
  *
  * The objects in the model are of type [class@Gtk.StringObject] and have a
  * "string" property that can be used inside expressions.
  *
  * `GtkStringList` is well-suited for any place where you would typically use a
  * `char*[]`, but need a list model.
  *
  * ## GtkStringList as GtkBuildable
  *
  * The `GtkStringList` implementation of the `GtkBuildable` interface supports
  * adding items directly using the `<items>` element and specifying `<item>`
  * elements for each item. Each `<item>` element supports the regular
  * translation attributes “translatable”, “context” and “comments”.
  *
  * Here is a UI definition fragment specifying a `GtkStringList`
  *
  * ```xml
  * <object class="GtkStringList">
  *   <items>
  *     <item translatable="yes">Factory</item>
  *     <item translatable="yes">Home</item>
  *     <item translatable="yes">Subway</item>
  *   </items>
  * </object>
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StringList private[gnome] (raw: Ptr[GtkStringList])
    extends Object(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends @string to @self.
    *
    * The @string will be copied. See [method@Gtk.StringList.take] for a way to
    * avoid that.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(string: String /* Some(CString) */ )(using Zone): Unit /* None */ =
    gtk_string_list_append(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringList]],
      toCString(string)
    )
  end append

  /** Gets the string that is at @position in @self.
    *
    * If @self does not contain @position items, %NULL is returned.
    *
    * This function returns the const char *. To get the object wrapping it, use
    * g_list_model_get_item().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* None */ =
    fromCString(
      gtk_string_list_get_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringList]],
        guint(position)
      ).asInstanceOf
    )
  end getString

  /** Removes the string at @position from @self.
    *
    * @position
    *   must be smaller than the current length of the list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_string_list_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringList]],
      guint(position)
    )
  end remove

  /** Changes @self by removing @n_removals strings and adding @additions to it.
    *
    * This function is more efficient than [method@Gtk.StringList.append] and
    * [method@Gtk.StringList.remove], because it only emits the ::items-changed
    * signal once for the change.
    *
    * This function copies the strings in @additions.
    *
    * The parameters @position and @n_removals must be correct (ie:
    * @position
    *   + @n_removals must be less than or equal to the length of the list at
    *   the time this function is called).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method splice/<method parameters>/additions]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def splice__ = ???

  /** Adds @string to self at the end, and takes ownership of it.
    *
    * This variant of [method@Gtk.StringList.append] is convenient for
    * formatting strings:
    *
    * ```c
    * gtk_string_list_take (self, g_strdup_print ("%d dollars", lots));
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def take(string: String /* Some(CString) */ )(using Zone): Unit /* None */ =
    gtk_string_list_take(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringList]],
      toCString(string)
    )
  end take

end StringList

object StringList:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkStringList])(using Runtime) =
    summon[Runtime].getOrCreate[StringList](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new StringList(ptr)
    )

  /** Creates a new `GtkStringList` with the given @strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strings]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def apply() = ???

end StringList

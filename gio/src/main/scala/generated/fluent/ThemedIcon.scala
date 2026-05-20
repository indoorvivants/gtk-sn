package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.Icon
import sn.gnome.gio.internal.GThemedIcon
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** #GThemedIcon is an implementation of #GIcon that supports icon themes.
  * #GThemedIcon contains a list of all of the icons present in an icon theme,
  * so that icons can be looked up quickly. #GThemedIcon does not provide actual
  * pixmaps for icons, just the icon names. Ideally something like
  * gtk_icon_theme_choose_icon() should be used to resolve the list of names so
  * that fallback icons work nicely with themes that inherit other themes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ThemedIcon private[gnome] (raw: Ptr[GThemedIcon])
    extends Object(raw.asInstanceOf),
      Icon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Append a name to the list of icons from within @icon.
    *
    * Note that doing so invalidates the hash computed by prior calls to
    * g_icon_hash().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendName(
      iconname: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_themed_icon_append_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GThemedIcon]],
      summon[Runtime].inZone(toCString(iconname))
    )
  end appendName

  /** Gets the names of icons from within @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_names/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def getNames__ = ???

  /** Prepend a name to the list of icons from within @icon.
    *
    * Note that doing so invalidates the hash computed by prior calls to
    * g_icon_hash().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependName(
      iconname: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_themed_icon_prepend_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GThemedIcon]],
      summon[Runtime].inZone(toCString(iconname))
    )
  end prependName

end ThemedIcon

object ThemedIcon:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GThemedIcon])(using Runtime) =
    summon[Runtime].getOrCreate[ThemedIcon](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ThemedIcon(ptr)
    )

  /** Creates a new themed icon for @iconname.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(iconname: scala.Predef.String /* Some(CString) */ )(using
      Runtime
  ): ThemedIcon =
    val raw: Ptr[Byte] = g_themed_icon_new(
      summon[Runtime].inZone(toCString(iconname))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ThemedIcon](raw, r => ThemedIcon.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new themed icon for @iconnames.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromNames(
      iconnames: scala.Array[scala.Predef.String] /* Some(Ptr[CString]) */,
      len: Int /* Some(CInt) */
  )(using Runtime): ThemedIcon =
    val raw: Ptr[Byte] = g_themed_icon_new_from_names(
      summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(iconnames)),
      len
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ThemedIcon](raw, r => ThemedIcon.applyUnsafe(r.asInstanceOf))
  end fromNames

  /**  Creates a new themed icon for @iconname, and all the names
    *  that can be created by shortening @iconname at '-' characters.
    *
    *  In the following example, @icon1 and @icon2 are equivalent:
    *  |[<!-- language="C" -->
    *  const char *names[] = {
    *    "gnome-dev-cdrom-audio",
    *    "gnome-dev-cdrom",
    *    "gnome-dev",
    *    "gnome"
    *  };
    *
    *  icon1 = g_themed_icon_new_from_names (names, 4);
    *  icon2 = g_themed_icon_new_with_default_fallbacks ("gnome-dev-cdrom-audio");
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def withDefaultFallbacks(iconname: scala.Predef.String /* Some(CString) */ )(
      using Runtime
  ): ThemedIcon =
    val raw: Ptr[Byte] = g_themed_icon_new_with_default_fallbacks(
      summon[Runtime].inZone(toCString(iconname))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ThemedIcon](raw, r => ThemedIcon.applyUnsafe(r.asInstanceOf))
  end withDefaultFallbacks
end ThemedIcon

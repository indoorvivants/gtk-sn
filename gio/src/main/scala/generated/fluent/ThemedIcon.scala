package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GThemedIcon
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GThemedIcon is an implementation of #GIcon that supports icon themes.
  * #GThemedIcon contains a list of all of the icons present in an icon theme,
  * so that icons can be looked up quickly. #GThemedIcon does not provide actual
  * pixmaps for icons, just the icon names. Ideally something like
  * gtk_icon_theme_choose_icon() should be used to resolve the list of names so
  * that fallback icons work nicely with themes that inherit other themes.
  */
class ThemedIcon(raw: Ptr[GThemedIcon]) extends Object(raw.asInstanceOf), Icon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Append a name to the list of icons from within @icon.
    *
    * Note that doing so invalidates the hash computed by prior calls to
    * g_icon_hash().
    */
  def appendName(
      iconname: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_themed_icon_append_name(
    this.raw.asInstanceOf[Ptr[GThemedIcon]],
    __sn_extract_string(iconname)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prepend a name to the list of icons from within @icon.
    *
    * Note that doing so invalidates the hash computed by prior calls to
    * g_icon_hash().
    */
  def prependName(
      iconname: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_themed_icon_prepend_name(
    this.raw.asInstanceOf[Ptr[GThemedIcon]],
    __sn_extract_string(iconname)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ThemedIcon

object ThemedIcon:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new themed icon for @iconname.
    */
  def apply(
      iconname: String | CString /* Some(CString) */
  )(using Zone): ThemedIcon = new ThemedIcon(
    g_themed_icon_new(__sn_extract_string(iconname)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new themed icon for @iconnames.
    */
  def fromNames(
      iconnames: Array[String] /* Some(Ptr[CString]) */,
      len: Int /* Some(CInt) */
  )(using Zone): ThemedIcon = new ThemedIcon(
    g_themed_icon_new_from_names(
      iconnames.map(__sn_extract_string).atUnsafe(0),
      len
    ).asInstanceOf
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a new themed icon for @iconname, and all the names
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
    */
  def withDefaultFallbacks(
      iconname: String | CString /* Some(CString) */
  )(using Zone): ThemedIcon = new ThemedIcon(
    g_themed_icon_new_with_default_fallbacks(
      __sn_extract_string(iconname)
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
end ThemedIcon

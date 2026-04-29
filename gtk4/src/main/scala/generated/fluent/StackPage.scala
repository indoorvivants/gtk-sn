package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkStackPage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkStackPage` is an auxiliary class used by `GtkStack`.
  */
class StackPage(raw: Ptr[GtkStackPage])
    extends Object(raw.asInstanceOf),
      Accessible:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the stack child to which @self belongs.
    */
  def getChild(): Widget = new Widget(
    gtk_stack_page_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the icon name of the page.
    */
  def getIconName()(using Zone): String = fromCString(
    gtk_stack_page_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the name of the page.
    */
  def getName()(using Zone): String = fromCString(
    gtk_stack_page_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the page is marked as “needs attention”.
    */
  def getNeedsAttention(): Boolean =
    gtk_stack_page_get_needs_attention(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the page title.
    */
  def getTitle()(using Zone): String = fromCString(
    gtk_stack_page_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether underlines in the page title indicate mnemonics.
    */
  def getUseUnderline(): Boolean =
    gtk_stack_page_get_use_underline(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @page is visible in its `GtkStack`.
    *
    * This is independent from the [property@Gtk.Widget:visible] property of its
    * widget.
    */
  def getVisible(): Boolean =
    gtk_stack_page_get_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon name of the page.
    */
  def setIconName(setting: String | CString)(using Zone): Unit =
    gtk_stack_page_set_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(setting)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the name of the page.
    */
  def setName(setting: String | CString)(using Zone): Unit =
    gtk_stack_page_set_name(this.raw.asInstanceOf, __sn_extract_string(setting))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the page is marked as “needs attention”.
    */
  def setNeedsAttention(setting: Boolean): Unit =
    gtk_stack_page_set_needs_attention(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the page title.
    */
  def setTitle(setting: String | CString)(using Zone): Unit =
    gtk_stack_page_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(setting)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether underlines in the page title indicate mnemonics.
    */
  def setUseUnderline(setting: Boolean): Unit =
    gtk_stack_page_set_use_underline(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @page is visible in its `GtkStack`.
    */
  def setVisible(visible: Boolean): Unit = gtk_stack_page_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StackPage

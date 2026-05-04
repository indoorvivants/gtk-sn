package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{Accessible, Widget}
import sn.gnome.gtk4.internal.GtkStackPage

/** `GtkStackPage` is an auxiliary class used by `GtkStack`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StackPage(raw: Ptr[GtkStackPage])
    extends Object(raw.asInstanceOf),
      Accessible:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the stack child to which @self belongs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_stack_page_get_child(
      this.raw.asInstanceOf[Ptr[GtkStackPage]]
    ).asInstanceOf
  )

  /** Returns the icon name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_stack_page_get_icon_name(
      this.raw.asInstanceOf[Ptr[GtkStackPage]]
    ).asInstanceOf
  )

  /** Returns the name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ = fromCString(
    gtk_stack_page_get_name(
      this.raw.asInstanceOf[Ptr[GtkStackPage]]
    ).asInstanceOf
  )

  /** Returns whether the page is marked as “needs attention”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNeedsAttention(): Boolean /* None */ =
    gtk_stack_page_get_needs_attention(
      this.raw.asInstanceOf[Ptr[GtkStackPage]]
    ).value.!=(0)

  /** Gets the page title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_stack_page_get_title(
      this.raw.asInstanceOf[Ptr[GtkStackPage]]
    ).asInstanceOf
  )

  /** Gets whether underlines in the page title indicate mnemonics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseUnderline(): Boolean /* None */ = gtk_stack_page_get_use_underline(
    this.raw.asInstanceOf[Ptr[GtkStackPage]]
  ).value.!=(0)

  /** Returns whether @page is visible in its `GtkStack`.
    *
    * This is independent from the [property@Gtk.Widget:visible] property of its
    * widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ = gtk_stack_page_get_visible(
    this.raw.asInstanceOf[Ptr[GtkStackPage]]
  ).value.!=(0)

  /** Sets the icon name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconName(
      setting: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_stack_page_set_icon_name(
    this.raw.asInstanceOf[Ptr[GtkStackPage]],
    __sn_extract_string(setting)
  )

  /** Sets the name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(
      setting: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_stack_page_set_name(
    this.raw.asInstanceOf[Ptr[GtkStackPage]],
    __sn_extract_string(setting)
  )

  /** Sets whether the page is marked as “needs attention”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNeedsAttention(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_stack_page_set_needs_attention(
    this.raw.asInstanceOf[Ptr[GtkStackPage]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets the page title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      setting: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_stack_page_set_title(
    this.raw.asInstanceOf[Ptr[GtkStackPage]],
    __sn_extract_string(setting)
  )

  /** Sets whether underlines in the page title indicate mnemonics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseUnderline(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_stack_page_set_use_underline(
    this.raw.asInstanceOf[Ptr[GtkStackPage]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets whether @page is visible in its `GtkStack`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_stack_page_set_visible(
    this.raw.asInstanceOf[Ptr[GtkStackPage]],
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

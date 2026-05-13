package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Widget}
import sn.gnome.gtk4.internal.GtkStackPage

/** `GtkStackPage` is an auxiliary class used by `GtkStack`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StackPage private[gnome] (raw: Ptr[GtkStackPage])
    extends Object(raw.asInstanceOf),
      Accessible:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the stack child to which @self belongs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_stack_page_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]]
      ).asInstanceOf
    )
  end getChild

  /** Returns the icon name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconName()(using Zone): String /* None */ =
    fromCString(
      gtk_stack_page_get_icon_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]]
      ).asInstanceOf
    )
  end getIconName

  /** Returns the name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ =
    fromCString(
      gtk_stack_page_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]]
      ).asInstanceOf
    )
  end getName

  /** Returns whether the page is marked as “needs attention”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNeedsAttention(): Boolean /* None */ =
    gtk_stack_page_get_needs_attention(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]]
    ).value.!=(0)
  end getNeedsAttention

  /** Gets the page title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ =
    fromCString(
      gtk_stack_page_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]]
      ).asInstanceOf
    )
  end getTitle

  /** Gets whether underlines in the page title indicate mnemonics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseUnderline(): Boolean /* None */ =
    gtk_stack_page_get_use_underline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]]
    ).value.!=(0)
  end getUseUnderline

  /** Returns whether @page is visible in its `GtkStack`.
    *
    * This is independent from the [property@Gtk.Widget:visible] property of its
    * widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ =
    gtk_stack_page_get_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]]
    ).value.!=(0)
  end getVisible

  /** Sets the icon name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconName(
      setting: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_stack_page_set_icon_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]],
      toCString(setting)
    )
  end setIconName

  /** Sets the name of the page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(
      setting: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_stack_page_set_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]],
      toCString(setting)
    )
  end setName

  /** Sets whether the page is marked as “needs attention”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNeedsAttention(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_stack_page_set_needs_attention(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setNeedsAttention

  /** Sets the page title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      setting: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_stack_page_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]],
      toCString(setting)
    )
  end setTitle

  /** Sets whether underlines in the page title indicate mnemonics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseUnderline(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_stack_page_set_use_underline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setUseUnderline

  /** Sets whether @page is visible in its `GtkStack`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_stack_page_set_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStackPage]],
      gboolean(gint((if visible == true then 1 else 0)))
    )
  end setVisible

end StackPage

object StackPage:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkStackPage])(using Runtime) =
    summon[Runtime].getOrCreate[StackPage](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new StackPage(ptr)
    )

end StackPage

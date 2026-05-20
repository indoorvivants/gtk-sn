package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.ScrollInfo
import sn.gnome.gtk4.internal.GtkScrollInfo

/** The `GtkScrollInfo` can be used to provide more accurate data on how a
  * scroll operation should be performed.
  *
  * Scrolling functions usually allow passing a %NULL scroll info which will
  * cause the default values to be used and just scroll the element into view.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ScrollInfo private[gnome] (raw: Ptr[GtkScrollInfo]):

  def getUnsafeRawPointer(): Ptr[GtkScrollInfo] = this.raw

  /** Checks if horizontal scrolling is enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableHorizontal(): Boolean /* None */ =
    gtk_scroll_info_get_enable_horizontal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollInfo]]
    ).value.!=(0)
  end getEnableHorizontal

  /** Checks if vertical scrolling is enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableVertical(): Boolean /* None */ =
    gtk_scroll_info_get_enable_vertical(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollInfo]]
    ).value.!=(0)
  end getEnableVertical

  /** Increases the reference count of a `GtkScrollInfo` by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gtk4.ScrollInfo /* None */ =
    sn.gnome.gtk4.ScrollInfo.fromRaw(
      gtk_scroll_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollInfo]]
      )
    )
  end ref

  /** Turns horizontal scrolling on or off.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableHorizontal(
      horizontal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scroll_info_set_enable_horizontal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollInfo]],
      gboolean(gint((if horizontal == true then 1 else 0)))
    )
  end setEnableHorizontal

  /** Turns vertical scrolling on or off.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableVertical(
      vertical: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scroll_info_set_enable_vertical(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollInfo]],
      gboolean(gint((if vertical == true then 1 else 0)))
    )
  end setEnableVertical

  /** Decreases the reference count of a `GtkScrollInfo` by one.
    *
    * If the resulting reference count is zero, frees the self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gtk_scroll_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScrollInfo]]
    )
  end unref

end ScrollInfo

object ScrollInfo:
  def fromRaw(ptr: Ptr[GtkScrollInfo]): ScrollInfo = new ScrollInfo(ptr)
end ScrollInfo

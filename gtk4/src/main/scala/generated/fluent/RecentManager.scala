package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkRecentData
import sn.gnome.gtk4.internal.GtkRecentInfo
import sn.gnome.gtk4.internal.GtkRecentManager

class RecentManager(raw: Ptr[GtkRecentManager])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addFull(uri: String | CString, recent_data: Ptr[GtkRecentData])(using
      Zone
  ): Boolean = gtk_recent_manager_add_full(
    this.raw.asInstanceOf,
    __sn_extract_string(uri),
    recent_data
  ).value.!=(0)

  def addItem(uri: String | CString)(using Zone): Boolean =
    gtk_recent_manager_add_item(
      this.raw.asInstanceOf,
      __sn_extract_string(uri)
    ).value.!=(0)

  def getItems(): Ptr[GList] = gtk_recent_manager_get_items(
    this.raw.asInstanceOf
  )

  def hasItem(uri: String | CString)(using Zone): Boolean =
    gtk_recent_manager_has_item(
      this.raw.asInstanceOf,
      __sn_extract_string(uri)
    ).value.!=(0)

  def lookupItem(
      uri: String | CString
  )(using Zone): GResult[Ptr[GtkRecentInfo]] = GResult.wrap(__errorPtr =>
    gtk_recent_manager_lookup_item(
      this.raw.asInstanceOf,
      __sn_extract_string(uri),
      __errorPtr
    )
  )

  def moveItem(uri: String | CString, new_uri: String | CString)(using
      Zone
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gtk_recent_manager_move_item(
      this.raw.asInstanceOf,
      __sn_extract_string(uri),
      __sn_extract_string(new_uri),
      __errorPtr
    ).value.!=(0)
  )

  def purgeItems(): GResult[Int] = GResult.wrap(__errorPtr =>
    gtk_recent_manager_purge_items(this.raw.asInstanceOf, __errorPtr)
  )

  def removeItem(uri: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_recent_manager_remove_item(
        this.raw.asInstanceOf,
        __sn_extract_string(uri),
        __errorPtr
      ).value.!=(0)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end RecentManager

object RecentManager:
  def apply(): RecentManager = new RecentManager(
    gtk_recent_manager_new().asInstanceOf
  )
end RecentManager

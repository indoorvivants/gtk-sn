package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AppInfo

trait AppChooser:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Returns the currently selected application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAppInfo(): AppInfo /* None */ =
    new AppInfo.Abstract(
      gtk_app_chooser_get_app_info(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooser]]
      ).asInstanceOf
    )
  end getAppInfo

  /** Returns the content type for which the `GtkAppChooser` shows applications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContentType()(using Zone): String /* None */ =
    fromCString(
      gtk_app_chooser_get_content_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooser]]
      ).asInstanceOf
    )
  end getContentType

  /** Reloads the list of applications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refresh(): Unit /* None */ =
    gtk_app_chooser_refresh(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooser]]
    )
  end refresh

end AppChooser

object AppChooser:
  class Abstract(raw: Ptr[Byte]) extends AppChooser:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AppChooser

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  AppChooser,
  Buildable,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkAppChooserWidget

/** `GtkAppChooserWidget` is a widget for selecting applications.
  *
  * It is the main building block for [class@Gtk.AppChooserDialog]. Most
  * applications only need to use the latter; but you can use this widget as
  * part of a larger widget if you have special needs.
  *
  * `GtkAppChooserWidget` offers detailed control over what applications are
  * shown, using the [property@Gtk.AppChooserWidget:show-default],
  * [property@Gtk.AppChooserWidget:show-recommended],
  * [property@Gtk.AppChooserWidget:show-fallback],
  * [property@Gtk.AppChooserWidget:show-other] and
  * [property@Gtk.AppChooserWidget:show-all] properties. See the
  * [iface@Gtk.AppChooser] documentation for more information about these groups
  * of applications.
  *
  * To keep track of the selected application, use the
  * [signal@Gtk.AppChooserWidget::application-selected] and
  * [signal@Gtk.AppChooserWidget::application-activated] signals.
  *
  * ## CSS nodes
  *
  * `GtkAppChooserWidget` has a single CSS node with name appchooser.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppChooserWidget private[gnome] (raw: Ptr[GtkAppChooserWidget])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AppChooser,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the text that is shown if there are not applications that can
    * handle the content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultText()(using Zone): String /* None */ =
    fromCString(
      gtk_app_chooser_widget_get_default_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]]
      ).asInstanceOf
    )
  end getDefaultText

  /** Gets whether the app chooser should show all applications in a flat list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowAll(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]]
    ).value.!=(0)
  end getShowAll

  /** Gets whether the app chooser should show the default handler for the
    * content type in a separate section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowDefault(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]]
    ).value.!=(0)
  end getShowDefault

  /** Gets whether the app chooser should show related applications for the
    * content type in a separate section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowFallback(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_fallback(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]]
    ).value.!=(0)
  end getShowFallback

  /** Gets whether the app chooser should show applications which are unrelated
    * to the content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowOther(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_other(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]]
    ).value.!=(0)
  end getShowOther

  /** Gets whether the app chooser should show recommended applications for the
    * content type in a separate section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowRecommended(): Boolean /* None */ =
    gtk_app_chooser_widget_get_show_recommended(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]]
    ).value.!=(0)
  end getShowRecommended

  /** Sets the text that is shown if there are not applications that can handle
    * the content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultText(
      text: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_app_chooser_widget_set_default_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]],
      toCString(text)
    )
  end setDefaultText

  /** Sets whether the app chooser should show all applications in a flat list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowAll(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_widget_set_show_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowAll

  /** Sets whether the app chooser should show the default handler for the
    * content type in a separate section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowDefault(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_widget_set_show_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowDefault

  /** Sets whether the app chooser should show related applications for the
    * content type in a separate section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowFallback(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_widget_set_show_fallback(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowFallback

  /** Sets whether the app chooser should show applications which are unrelated
    * to the content type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowOther(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_widget_set_show_other(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowOther

  /** Sets whether the app chooser should show recommended applications for the
    * content type in a separate section.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowRecommended(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_app_chooser_widget_set_show_recommended(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAppChooserWidget]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowRecommended

  /** Emitted when an application item is activated from the widget's list.
    *
    * This usually happens when the user double clicks an item, or an item is
    * selected and the user presses one of the keys Space, Shift+Space, Return
    * or Enter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal application-activated]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gio.AppInfo)))"
  )
  private def onApplicationActivated = ???

  /** Emitted when an application item is selected from the widget's list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal application-selected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gio.AppInfo)))"
  )
  private def onApplicationSelected = ???

end AppChooserWidget

object AppChooserWidget:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAppChooserWidget])(using Runtime) =
    summon[Runtime].getOrCreate[AppChooserWidget](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AppChooserWidget(ptr)
    )

  /** Creates a new `GtkAppChooserWidget` for applications that can handle
    * content of the given type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      content_type: String /* Some(CString) */
  )(using Zone, Runtime): AppChooserWidget =
    val raw: Ptr[Byte] = gtk_app_chooser_widget_new(
      toCString(content_type)
    ).asInstanceOf
    summon[Runtime].getOrCreate[AppChooserWidget](
      raw,
      r => AppChooserWidget.applyUnsafe(r.asInstanceOf)
    )
  end apply
end AppChooserWidget

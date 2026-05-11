package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkColorDialog

/** A `GtkColorDialog` object collects the arguments that are needed to present
  * a color chooser dialog to the user, such as a title for the dialog and
  * whether it should be modal.
  *
  * The dialog is shown with the [method@Gtk.ColorDialog.choose_rgba] function.
  * This API follows the GIO async pattern, and the result can be obtained by
  * calling [method@Gtk.ColorDialog.choose_rgba_finish].
  *
  * See [class@Gtk.ColorDialogButton] for a convenient control that uses
  * `GtkColorDialog` and presents the results.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorDialog private[gnome] (raw: Ptr[GtkColorDialog])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** This function initiates a color choice operation by presenting a color
    * chooser dialog to the user.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.ColorDialog.choose_rgba_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_rgba/<method parameters>/initial_color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def chooseRgba__ = ???

  /** Finishes the [method@Gtk.ColorDialog.choose_rgba] call and returns the
    * resulting color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method choose_rgba_finish/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(GdkRGBA*)))"
  )
  private def chooseRgbaFinish__ = ???

  /** Returns whether the color chooser dialog blocks interaction with the
    * parent window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_color_dialog_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialog]]
    ).value.!=(0)
  end getModal

  /** Returns the title that will be shown on the color chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ =
    fromCString(
      gtk_color_dialog_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialog]]
      ).asInstanceOf
    )
  end getTitle

  /** Returns whether colors may have alpha.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWithAlpha(): Boolean /* None */ =
    gtk_color_dialog_get_with_alpha(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialog]]
    ).value.!=(0)
  end getWithAlpha

  /** Sets whether the color chooser dialog blocks interaction with the parent
    * window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_color_dialog_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialog]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets the title that will be shown on the color chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_color_dialog_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialog]],
      toCString(title)
    )
  end setTitle

  /** Sets whether colors may have alpha.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWithAlpha(
      with_alpha: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_color_dialog_set_with_alpha(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColorDialog]],
      gboolean(gint((if with_alpha == true then 1 else 0)))
    )
  end setWithAlpha

end ColorDialog

object ColorDialog:
  def applyUnsafe(ptr: Ptr[GtkColorDialog])(using Runtime) =
    summon[Runtime].getOrCreate[ColorDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColorDialog(ptr)
    )

  /** Creates a new `GtkColorDialog` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ColorDialog =
    val raw: Ptr[Byte] = gtk_color_dialog_new().asInstanceOf
    summon[Runtime].getOrCreate[ColorDialog](
      raw,
      r => ColorDialog.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ColorDialog

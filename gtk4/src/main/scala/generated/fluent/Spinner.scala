package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkSpinner

/** A `GtkSpinner` widget displays an icon-size spinning animation.
  *
  * It is often used as an alternative to a [class@Gtk.ProgressBar] for
  * displaying indefinite activity, instead of actual progress.
  *
  * ![An example GtkSpinner](spinner.png)
  *
  * To start the animation, use [method@Gtk.Spinner.start], to stop it use
  * [method@Gtk.Spinner.stop].
  *
  * # CSS nodes
  *
  * `GtkSpinner` has a single CSS node with the name spinner. When the animation
  * is active, the :checked pseudoclass is added to this node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Spinner private[gnome] (raw: Ptr[GtkSpinner])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether the spinner is spinning.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpinning(): Boolean /* None */ =
    gtk_spinner_get_spinning(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSpinner]]
    ).value.!=(0)
  end getSpinning

  /** Sets the activity of the spinner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSpinning(
      spinning: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_spinner_set_spinning(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSpinner]],
      gboolean(gint((if spinning == true then 1 else 0)))
    )
  end setSpinning

  /** Starts the animation of the spinner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def start(): Unit /* None */ =
    gtk_spinner_start(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSpinner]])
  end start

  /** Stops the animation of the spinner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stop(): Unit /* None */ =
    gtk_spinner_stop(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSpinner]])
  end stop

end Spinner

object Spinner:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSpinner])(using Runtime) = summon[Runtime]
    .getOrCreate[Spinner](ptr.asInstanceOf[Ptr[Byte]], p => new Spinner(ptr))

  /** Returns a new spinner widget. Not yet started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Spinner =
    val raw: Ptr[Byte] = gtk_spinner_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Spinner](raw, r => Spinner.applyUnsafe(r.asInstanceOf))
  end apply
end Spinner

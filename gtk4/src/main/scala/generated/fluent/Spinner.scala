package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkSpinner

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkSpinner` widget displays an icon-size spinning animation.
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
  */
class Spinner(raw: Ptr[GtkSpinner])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the spinner is spinning.
    */
  def getSpinning(): Boolean /* None */ =
    gtk_spinner_get_spinning(this.raw.asInstanceOf[Ptr[GtkSpinner]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the activity of the spinner.
    */
  def setSpinning(
      spinning: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_spinner_set_spinning(
    this.raw.asInstanceOf[Ptr[GtkSpinner]],
    gboolean(gint((if spinning == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts the animation of the spinner.
    */
  def start(): Unit /* None */ = gtk_spinner_start(
    this.raw.asInstanceOf[Ptr[GtkSpinner]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stops the animation of the spinner.
    */
  def stop(): Unit /* None */ = gtk_spinner_stop(
    this.raw.asInstanceOf[Ptr[GtkSpinner]]
  )

end Spinner

object Spinner:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a new spinner widget. Not yet started.
    */
  def apply(): Spinner = new Spinner(gtk_spinner_new().asInstanceOf)
end Spinner

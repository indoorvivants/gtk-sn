package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererToggle

/** Renders a toggle button in a cell
  *
  * `GtkCellRendererToggle` renders a toggle button in a cell. The button is
  * drawn as a radio or a checkbutton, depending on the
  * `GtkCellRendererToggle:radio` property. When activated, it emits the
  * `GtkCellRendererToggle::toggled` signal.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellRendererToggle(raw: Ptr[GtkCellRendererToggle])
    extends CellRenderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether the cell renderer is activatable. See
    * gtk_cell_renderer_toggle_set_activatable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivatable(): Boolean /* None */ =
    gtk_cell_renderer_toggle_get_activatable(
      this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]]
    ).value.!=(0)

  /** Returns whether the cell renderer is active. See
    * gtk_cell_renderer_toggle_set_active().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActive(): Boolean /* None */ = gtk_cell_renderer_toggle_get_active(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]]
  ).value.!=(0)

  /** Returns whether we’re rendering radio toggles rather than checkboxes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRadio(): Boolean /* None */ = gtk_cell_renderer_toggle_get_radio(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]]
  ).value.!=(0)

  /** Makes the cell renderer activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivatable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_toggle_set_activatable(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Activates or deactivates a cell renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActive(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_toggle_set_active(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** If @radio is %TRUE, the cell renderer renders a radio toggle (i.e. a
    * toggle in a group of mutually-exclusive toggles). If %FALSE, it renders a
    * check toggle (a standalone boolean option). This can be set globally for
    * the cell renderer, or changed just before rendering each cell in the model
    * (for `GtkTreeView`, you set up a per-row setting using `GtkTreeViewColumn`
    * to associate model columns with cell renderer properties).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRadio(
      radio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_toggle_set_radio(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]],
    gboolean(gint((if radio == true then 1 else 0)))
  )

  /** The ::toggled signal is emitted when the cell is toggled.
    *
    * It is the responsibility of the application to update the model with the
    * correct value to store at @path. Often this is simply the opposite of the
    * value currently stored at @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggled(handler: ((path: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (path: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkCellRendererToggle],
          path: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((path = fromCString(path)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"toggled"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onToggled
end CellRendererToggle

object CellRendererToggle:
  /** Creates a new `GtkCellRendererToggle`. Adjust rendering parameters using
    * object properties. Object properties can be set globally (with
    * g_object_set()). Also, with `GtkTreeViewColumn`, you can bind a property
    * to a value in a `GtkTreeModel`. For example, you can bind the “active”
    * property on the cell renderer to a boolean value in the model, thus
    * causing the check button to reflect the state of the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): CellRendererToggle = new CellRendererToggle(
    gtk_cell_renderer_toggle_new().asInstanceOf
  )
end CellRendererToggle

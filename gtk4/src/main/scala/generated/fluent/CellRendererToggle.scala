package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererToggle

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders a toggle button in a cell
  *
  * `GtkCellRendererToggle` renders a toggle button in a cell. The button is
  * drawn as a radio or a checkbutton, depending on the
  * `GtkCellRendererToggle:radio` property. When activated, it emits the
  * `GtkCellRendererToggle::toggled` signal.
  */
class CellRendererToggle(raw: Ptr[GtkCellRendererToggle])
    extends CellRenderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the cell renderer is activatable. See
    * gtk_cell_renderer_toggle_set_activatable().
    */
  def getActivatable(): Boolean /* None */ =
    gtk_cell_renderer_toggle_get_activatable(
      this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the cell renderer is active. See
    * gtk_cell_renderer_toggle_set_active().
    */
  def getActive(): Boolean /* None */ = gtk_cell_renderer_toggle_get_active(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether we’re rendering radio toggles rather than checkboxes.
    */
  def getRadio(): Boolean /* None */ = gtk_cell_renderer_toggle_get_radio(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes the cell renderer activatable.
    */
  def setActivatable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_toggle_set_activatable(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Activates or deactivates a cell renderer.
    */
  def setActive(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_toggle_set_active(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @radio is %TRUE, the cell renderer renders a radio toggle (i.e. a
    * toggle in a group of mutually-exclusive toggles). If %FALSE, it renders a
    * check toggle (a standalone boolean option). This can be set globally for
    * the cell renderer, or changed just before rendering each cell in the model
    * (for `GtkTreeView`, you set up a per-row setting using `GtkTreeViewColumn`
    * to associate model columns with cell renderer properties).
    */
  def setRadio(
      radio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_renderer_toggle_set_radio(
    this.raw.asInstanceOf[Ptr[GtkCellRendererToggle]],
    gboolean(gint((if radio == true then 1 else 0)))
  )

end CellRendererToggle

object CellRendererToggle:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellRendererToggle`. Adjust rendering parameters using
    * object properties. Object properties can be set globally (with
    * g_object_set()). Also, with `GtkTreeViewColumn`, you can bind a property
    * to a value in a `GtkTreeModel`. For example, you can bind the “active”
    * property on the cell renderer to a boolean value in the model, thus
    * causing the check button to reflect the state of the model.
    */
  def apply(): CellRendererToggle = new CellRendererToggle(
    gtk_cell_renderer_toggle_new().asInstanceOf
  )
end CellRendererToggle

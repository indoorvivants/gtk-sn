package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkFlowBoxChild

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkFlowBoxChild` is the kind of widget that can be added to a `GtkFlowBox`.
  */
class FlowBoxChild(raw: Ptr[GtkFlowBoxChild])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks @child as changed, causing any state that depends on this to be
    * updated.
    *
    * This affects sorting and filtering.
    *
    * Note that calls to this method must be in sync with the data used for the
    * sorting and filtering functions. For instance, if the list is mirroring
    * some external data set, and *two* children changed in the external data
    * set when you call gtk_flow_box_child_changed() on the first child, the
    * sort function must only read the new data for the first of the two changed
    * children, otherwise the resorting of the children will be wrong.
    *
    * This generally means that if you don’t fully control the data model, you
    * have to duplicate the data that affects the sorting and filtering
    * functions into the widgets themselves.
    *
    * Another alternative is to call [method@Gtk.FlowBox.invalidate_sort] on any
    * model change, but that is more expensive.
    */
  def changed(): Unit /* None */ = gtk_flow_box_child_changed(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @self.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_flow_box_child_get_child(
      this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current index of the @child in its `GtkFlowBox` container.
    */
  def getIndex(): Int /* None */ = gtk_flow_box_child_get_index(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the @child is currently selected in its `GtkFlowBox`
    * container.
    */
  def isSelected(): Boolean /* None */ = gtk_flow_box_child_is_selected(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @self.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_flow_box_child_set_child(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

end FlowBoxChild

object FlowBoxChild:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFlowBoxChild`.
    *
    * This should only be used as a child of a `GtkFlowBox`.
    */
  def apply(): FlowBoxChild = new FlowBoxChild(
    gtk_flow_box_child_new().asInstanceOf
  )
end FlowBoxChild

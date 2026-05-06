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
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkFlowBoxChild

/** `GtkFlowBoxChild` is the kind of widget that can be added to a `GtkFlowBox`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FlowBoxChild(raw: Ptr[GtkFlowBoxChild])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Marks @child as changed, causing any state that depends on this to be
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def changed(): Unit /* None */ = gtk_flow_box_child_changed(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
  )

  /** Gets the child widget of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_flow_box_child_get_child(
      this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
    ).asInstanceOf
  )

  /** Gets the current index of the @child in its `GtkFlowBox` container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIndex(): Int /* None */ = gtk_flow_box_child_get_index(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
  )

  /** Returns whether the @child is currently selected in its `GtkFlowBox`
    * container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSelected(): Boolean /* None */ = gtk_flow_box_child_is_selected(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]]
  ).value.!=(0)

  /** Sets the child widget of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_flow_box_child_set_child(
    this.raw.asInstanceOf[Ptr[GtkFlowBoxChild]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Emitted when the user activates a child widget in a `GtkFlowBox`.
    *
    * This can happen either by clicking or double-clicking, or via a
    * keybinding.
    *
    * This is a [keybinding signal](class.SignalAction.html), but it can be used
    * by applications for their own purposes.
    *
    * The default bindings are <kbd>Space</kbd> and <kbd>Enter</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(f: EmptyTuple.type => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkFlowBoxChild],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate"
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
  end onActivate
end FlowBoxChild

object FlowBoxChild:
  /** Creates a new `GtkFlowBoxChild`.
    *
    * This should only be used as a child of a `GtkFlowBox`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): FlowBoxChild = new FlowBoxChild(
    gtk_flow_box_child_new().asInstanceOf
  )
end FlowBoxChild

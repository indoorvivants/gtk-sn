package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, PackType, Widget}
import sn.gnome.gtk4.internal.GtkWindowControls

/** `GtkWindowControls` shows window frame controls.
  *
  * Typical window frame controls are minimize, maximize and close buttons, and
  * the window icon.
  *
  * ![An example GtkWindowControls](windowcontrols.png)
  *
  * `GtkWindowControls` only displays start or end side of the controls (see
  * [property@Gtk.WindowControls:side]), so it's intended to be always used in
  * pair with another `GtkWindowControls` for the opposite side, for example:
  *
  * ```xml
  * <object class="GtkBox">
  *   <child>
  *     <object class="GtkWindowControls">
  *       <property name="side">start</property>
  *     </object>
  *   </child>
  *
  *   ...
  *
  *   <child>
  *     <object class="GtkWindowControls">
  *       <property name="side">end</property>
  *     </object>
  *   </child>
  * </object>
  * ```
  *
  * # CSS nodes
  *
  * ```
  * windowcontrols
  * ├── [image.icon]
  * ├── [button.minimize]
  * ├── [button.maximize]
  * ╰── [button.close]
  * ```
  *
  * A `GtkWindowControls`' CSS node is called windowcontrols. It contains
  * subnodes corresponding to each title button. Which of the title buttons
  * exist and where they are placed exactly depends on the desktop environment
  * and [property@Gtk.WindowControls:decoration-layout] value.
  *
  * When [property@Gtk.WindowControls:empty] is %TRUE, it gets the .empty style
  * class.
  *
  * # Accessibility
  *
  * `GtkWindowControls` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class WindowControls private[gnome] (raw: Ptr[GtkWindowControls])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the decoration layout of this `GtkWindowControls`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDecorationLayout()(using Zone): String /* None */ =
    fromCString(
      gtk_window_controls_get_decoration_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindowControls]]
      ).asInstanceOf
    )
  end getDecorationLayout

  /** Gets whether the widget has any window buttons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEmpty(): Boolean /* None */ =
    gtk_window_controls_get_empty(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindowControls]]
    ).value.!=(0)
  end getEmpty

  /** Gets the side to which this `GtkWindowControls` instance belongs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSide(): PackType /* None */ =
    PackType.fromRaw(
      gtk_window_controls_get_side(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindowControls]]
      )
    )
  end getSide

  /** Sets the decoration layout for the title buttons.
    *
    * This overrides the [property@Gtk.Settings:gtk-decoration-layout] setting.
    *
    * The format of the string is button names, separated by commas. A colon
    * separates the buttons that should appear on the left from those on the
    * right. Recognized button names are minimize, maximize, close and icon (the
    * window icon).
    *
    * For example, “icon:minimize,maximize,close” specifies a icon on the left,
    * and minimize, maximize and close buttons on the right.
    *
    * If [property@Gtk.WindowControls:side] value is @GTK_PACK_START, @self will
    * display the part before the colon, otherwise after that.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDecorationLayout(
      layout: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_window_controls_set_decoration_layout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindowControls]],
      layout
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setDecorationLayout

  /** Determines which part of decoration layout the `GtkWindowControls` uses.
    *
    * See [property@Gtk.WindowControls:decoration-layout].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSide(side: PackType /* Some(GtkPackType) */ ): Unit /* None */ =
    gtk_window_controls_set_side(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindowControls]],
      side.raw
    )
  end setSide

end WindowControls

object WindowControls:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkWindowControls])(using Runtime) =
    summon[Runtime].getOrCreate[WindowControls](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new WindowControls(ptr)
    )

  /** Creates a new `GtkWindowControls`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(side: PackType /* Some(GtkPackType) */ )(using
      Runtime
  ): WindowControls =
    val raw: Ptr[Byte] = gtk_window_controls_new(side.raw).asInstanceOf
    summon[Runtime].getOrCreate[WindowControls](
      raw,
      r => WindowControls.applyUnsafe(r.asInstanceOf)
    )
  end apply
end WindowControls

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkPackType
import sn.gnome.gtk4.internal.GtkWindowControls

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkWindowControls` shows window frame controls.
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
  */
class WindowControls(raw: Ptr[GtkWindowControls])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the decoration layout of this `GtkWindowControls`.
    */
  def getDecorationLayout()(using Zone): String = fromCString(
    gtk_window_controls_get_decoration_layout(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the widget has any window buttons.
    */
  def getEmpty(): Boolean =
    gtk_window_controls_get_empty(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the side to which this `GtkWindowControls` instance belongs.
    */
  def getSide(): GtkPackType = gtk_window_controls_get_side(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the decoration layout for the title buttons.
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
    */
  def setDecorationLayout(layout: String | CString)(using Zone): Unit =
    gtk_window_controls_set_decoration_layout(
      this.raw.asInstanceOf,
      __sn_extract_string(layout)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines which part of decoration layout the `GtkWindowControls` uses.
    *
    * See [property@Gtk.WindowControls:decoration-layout].
    */
  def setSide(side: GtkPackType): Unit =
    gtk_window_controls_set_side(this.raw.asInstanceOf, side)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end WindowControls

object WindowControls:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkWindowControls`.
    */
  def apply(side: GtkPackType): WindowControls = new WindowControls(
    gtk_window_controls_new(side).asInstanceOf
  )
end WindowControls

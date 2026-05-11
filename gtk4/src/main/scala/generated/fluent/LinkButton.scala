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
import sn.gnome.gtk4.fluent.{
  Accessible,
  Actionable,
  Buildable,
  Button,
  ConstraintTarget
}
import sn.gnome.gtk4.internal.GtkLinkButton
import sn.gnome.runtime.*

/** A `GtkLinkButton` is a button with a hyperlink.
  *
  * ![An example GtkLinkButton](link-button.png)
  *
  * It is useful to show quick links to resources.
  *
  * A link button is created by calling either [ctor@Gtk.LinkButton.new] or
  * [ctor@Gtk.LinkButton.new_with_label]. If using the former, the URI you pass
  * to the constructor is used as a label for the widget.
  *
  * The URI bound to a `GtkLinkButton` can be set specifically using
  * [method@Gtk.LinkButton.set_uri].
  *
  * By default, `GtkLinkButton` calls [method@Gtk.FileLauncher.launch] when the
  * button is clicked. This behaviour can be overridden by connecting to the
  * [signal@Gtk.LinkButton::activate-link] signal and returning %TRUE from the
  * signal handler.
  *
  * # CSS nodes
  *
  * `GtkLinkButton` has a single CSS node with name button. To differentiate it
  * from a plain `GtkButton`, it gets the .link style class.
  *
  * # Accessibility
  *
  * `GtkLinkButton` uses the %GTK_ACCESSIBLE_ROLE_LINK role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LinkButton private[gnome] (raw: Ptr[GtkLinkButton])
    extends Button(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the URI of the `GtkLinkButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUri()(using Zone): String /* None */ =
    fromCString(
      gtk_link_button_get_uri(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLinkButton]]
      ).asInstanceOf
    )
  end getUri

  /** Retrieves the “visited” state of the `GtkLinkButton`.
    *
    * The button becomes visited when it is clicked. If the URI is changed on
    * the button, the “visited” state is unset again.
    *
    * The state may also be changed using [method@Gtk.LinkButton.set_visited].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisited(): Boolean /* None */ =
    gtk_link_button_get_visited(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLinkButton]]
    ).value.!=(0)
  end getVisited

  /** Sets @uri as the URI where the `GtkLinkButton` points.
    *
    * As a side-effect this unsets the “visited” state of the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUri(uri: String /* Some(CString) */ )(using Zone): Unit /* None */ =
    gtk_link_button_set_uri(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLinkButton]],
      toCString(uri)
    )
  end setUri

  /** Sets the “visited” state of the `GtkLinkButton`.
    *
    * See [method@Gtk.LinkButton.get_visited] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisited(
      visited: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_link_button_set_visited(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLinkButton]],
      gboolean(gint((if visited == true then 1 else 0)))
    )
  end setVisited

  /** Emitted each time the `GtkLinkButton` is clicked.
    *
    * The default handler will call [method@Gtk.FileLauncher.launch] with the
    * URI stored inside the [property@Gtk.LinkButton:uri] property.
    *
    * To override the default behavior, you can connect to the ::activate-link
    * signal and stop the propagation of the signal by returning %TRUE from your
    * handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateLink(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkLinkButton],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate-link"
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
  end onActivateLink
end LinkButton

object LinkButton:
  def applyUnsafe(ptr: Ptr[GtkLinkButton])(using Runtime) =
    summon[Runtime].getOrCreate[LinkButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new LinkButton(ptr)
    )

  /** Creates a new `GtkLinkButton` with the URI as its text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(uri: String /* Some(CString) */ )(using Zone, Runtime): LinkButton =
    val raw: Ptr[Byte] = gtk_link_button_new(toCString(uri)).asInstanceOf
    summon[Runtime]
      .getOrCreate[LinkButton](raw, r => LinkButton.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkLinkButton` containing a label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withLabel(
      uri: String /* Some(CString) */,
      label: Option[String /* Some(CString) */ ]
  )(using Zone, Runtime): LinkButton =
    val raw: Ptr[Byte] = gtk_link_button_new_with_label(
      toCString(uri),
      label
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[LinkButton](raw, r => LinkButton.applyUnsafe(r.asInstanceOf))
  end withLabel
end LinkButton

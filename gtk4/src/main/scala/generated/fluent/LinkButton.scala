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
class LinkButton(raw: Ptr[GtkLinkButton])
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
  def getUri()(using Zone): String /* None */ = fromCString(
    gtk_link_button_get_uri(
      this.raw.asInstanceOf[Ptr[GtkLinkButton]]
    ).asInstanceOf
  )

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
  def getVisited(): Boolean /* None */ = gtk_link_button_get_visited(
    this.raw.asInstanceOf[Ptr[GtkLinkButton]]
  ).value.!=(0)

  /** Sets @uri as the URI where the `GtkLinkButton` points.
    *
    * As a side-effect this unsets the “visited” state of the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUri(
      uri: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_link_button_set_uri(
    this.raw.asInstanceOf[Ptr[GtkLinkButton]],
    __sn_extract_string(uri)
  )

  /** Sets the “visited” state of the `GtkLinkButton`.
    *
    * See [method@Gtk.LinkButton.get_visited] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisited(
      visited: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_link_button_set_visited(
    this.raw.asInstanceOf[Ptr[GtkLinkButton]],
    gboolean(gint((if visited == true then 1 else 0)))
  )

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

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end LinkButton

object LinkButton:
  /** Creates a new `GtkLinkButton` with the URI as its text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(uri: String | CString /* Some(CString) */ )(using
      Zone
  )(using Runtime): LinkButton =
    val raw: Ptr[Byte] = gtk_link_button_new(
      __sn_extract_string(uri)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[LinkButton](raw, r => new LinkButton(r.asInstanceOf))
  end apply

  /** Creates a new `GtkLinkButton` containing a label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withLabel(
      uri: String | CString /* Some(CString) */,
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone)(using Runtime): LinkButton =
    val raw: Ptr[Byte] = gtk_link_button_new_with_label(
      __sn_extract_string(uri),
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[LinkButton](raw, r => new LinkButton(r.asInstanceOf))
  end withLabel

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end LinkButton

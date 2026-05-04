package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Actionable,
  Buildable,
  Button,
  ConstraintTarget
}
import sn.gnome.gtk4.internal.GtkLinkButton

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
  def apply(
      uri: String | CString /* Some(CString) */
  )(using Zone): LinkButton = new LinkButton(
    gtk_link_button_new(__sn_extract_string(uri)).asInstanceOf
  )

  /** Creates a new `GtkLinkButton` containing a label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withLabel(
      uri: String | CString /* Some(CString) */,
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): LinkButton = new LinkButton(
    gtk_link_button_new_with_label(
      __sn_extract_string(uri),
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end LinkButton

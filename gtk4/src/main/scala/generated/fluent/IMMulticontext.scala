package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.IMContext
import sn.gnome.gtk4.internal.GtkIMMulticontext

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkIMMulticontext` is an input method context supporting multiple,
  * switchable input methods.
  *
  * Text widgets such as `GtkText` or `GtkTextView` use a `GtkIMMultiContext` to
  * implement their `im-module` property for switching between different input
  * methods.
  */
class IMMulticontext(raw: Ptr[GtkIMMulticontext])
    extends IMContext(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the id of the currently active delegate of the @context.
    */
  def getContextId()(using Zone): String /* None */ = fromCString(
    gtk_im_multicontext_get_context_id(
      this.raw.asInstanceOf[Ptr[GtkIMMulticontext]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the context id for @context.
    *
    * This causes the currently active delegate of @context to be replaced by
    * the delegate corresponding to the new context id.
    *
    * Setting this to a non-%NULL value overrides the system-wide IM module
    * setting. See the [property@Gtk.Settings:gtk-im-module] property.
    */
  def setContextId(
      context_id: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_im_multicontext_set_context_id(
    this.raw.asInstanceOf[Ptr[GtkIMMulticontext]],
    context_id
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IMMulticontext

object IMMulticontext:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkIMMulticontext`.
    */
  def apply(): IMMulticontext = new IMMulticontext(
    gtk_im_multicontext_new().asInstanceOf
  )
end IMMulticontext

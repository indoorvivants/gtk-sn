package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkNamedAction

/** A `GtkShortcutAction` that activates an action by name.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NamedAction(raw: Ptr[GtkNamedAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the name of the action that will be activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActionName()(using Zone): String /* None */ = fromCString(
    gtk_named_action_get_action_name(
      this.raw.asInstanceOf[Ptr[GtkNamedAction]]
    ).asInstanceOf
  )

end NamedAction

object NamedAction:
  /** Creates an action that when activated, activates the named action on the
    * widget.
    *
    * It also passes the given arguments to it.
    *
    * See [method@Gtk.Widget.insert_action_group] for how to add actions to
    * widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      name: String | CString /* Some(CString) */
  )(using Zone): NamedAction = new NamedAction(
    gtk_named_action_new(__sn_extract_string(name)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end NamedAction

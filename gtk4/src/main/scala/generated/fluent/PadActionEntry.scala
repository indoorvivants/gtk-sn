package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.PadActionType
import sn.gnome.gtk4.internal.GtkPadActionEntry

/** Struct defining a pad action entry.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PadActionEntry private[gnome] (raw: Ptr[GtkPadActionEntry]):

  def getUnsafeRawPointer(): Ptr[GtkPadActionEntry] = this.raw

  /** the type of pad feature that will trigger this action entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `type`: sn.gnome.gtk4.PadActionType /* None */ =
    (!raw).`type`.asInstanceOf[GtkPadActionType]

  /** the type of pad feature that will trigger this action entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def type_=(value: sn.gnome.gtk4.PadActionType /* None */ ): Unit =
    (!raw).type_=(value.raw.asInstanceOf[GtkPadActionType])

  /** the 0-indexed button/ring/strip number that will trigger this action
    * entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def index: Int /* None */ = (!raw).index.asInstanceOf[CInt]

  /** the 0-indexed button/ring/strip number that will trigger this action
    * entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def index_=(value: Int /* None */ ): Unit =
    (!raw).index_=(value.asInstanceOf[CInt])

  /** the mode that will trigger this action entry, or -1 for all modes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mode: Int /* None */ = (!raw).mode.asInstanceOf[CInt]

  /** the mode that will trigger this action entry, or -1 for all modes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mode_=(value: Int /* None */ ): Unit =
    (!raw).mode_=(value.asInstanceOf[CInt])

  /** Human readable description of this action entry, this string should be
    * deemed user-visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def label: scala.Predef.String /* None */ = (!raw).label.asInstanceOf[CString]

  /** Human readable description of this action entry, this string should be
    * deemed user-visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def label_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).label_=(toCString(value).asInstanceOf[CString])

  /** action name that will be activated in the `GActionGroup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def actionName: scala.Predef.String /* None */ =
    (!raw).action_name.asInstanceOf[CString]

  /** action name that will be activated in the `GActionGroup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def actionName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).action_name_=(toCString(value).asInstanceOf[CString])
end PadActionEntry

object PadActionEntry:
  def fromRaw(ptr: Ptr[GtkPadActionEntry]): PadActionEntry = new PadActionEntry(
    ptr
  )
end PadActionEntry

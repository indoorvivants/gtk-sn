package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.Hook
import sn.gnome.glib.internal.{
  GHookList,
  gboolean,
  gint,
  gpointer,
  guint,
  gulong
}

/** The #GHookList struct represents a list of hook functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class HookList private[gnome] (raw: Ptr[GHookList]):

  def getUnsafeRawPointer(): Ptr[GHookList] = this.raw

  /** the next free #GHook id
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seqId: CUnsignedLongInt /* None */ = (!raw).seq_id.asInstanceOf[gulong]

  /** the next free #GHook id
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def seqId_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).seq_id_=(gulong(value).asInstanceOf[gulong])

  /** the size of the #GHookList elements, in bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hookSize: UInt /* None */ = (!raw).hook_size.asInstanceOf[guint]

  /** the size of the #GHookList elements, in bytes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hookSize_=(value: UInt /* None */ ): Unit =
    (!raw).hook_size_=(guint(value).asInstanceOf[guint])

  /** 1 if the #GHookList has been initialized
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSetup: UInt /* None */ = (!raw).is_setup.asInstanceOf[guint]

  /** 1 if the #GHookList has been initialized
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSetup_=(value: UInt /* None */ ): Unit =
    (!raw).is_setup_=(guint(value).asInstanceOf[guint])

  /** the first #GHook element in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hooks: sn.gnome.glib.Hook /* None */ =
    (!raw).hooks.asInstanceOf[Ptr[GHook]]

  /** the first #GHook element in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hooks_=(value: sn.gnome.glib.Hook /* None */ ): Unit = (!raw).hooks_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GHook]]
  )

  /** unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dummy3: Ptr[Byte] /* None */ = (!raw).dummy3.asInstanceOf[gpointer]

  /** unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dummy3_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).dummy3_=(gpointer(value).asInstanceOf[gpointer])

  /** the function to call to finalize a #GHook element. The default behaviour
    * is to call the hooks @destroy function
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field finalize_hook]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookFinalizeFunc), @type -> DataRecord(GHookFinalizeFunc)))"
  )
  private def finalizeHook__ = ???

  /** unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[field dummy]: key not found: @type")
  private def dummy__ = ???

  /** Removes all the #GHook elements from a #GHookList.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    g_hook_list_clear(this.getUnsafeRawPointer().asInstanceOf[Ptr[GHookList]])
  end clear

  /** Initializes a #GHookList. This must be called before the #GHookList is
    * used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(hook_size: UInt /* Some(guint) */ ): Unit /* None */ =
    g_hook_list_init(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHookList]],
      guint(hook_size)
    )
  end init

  /** Calls all of the #GHook functions in a #GHookList.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invoke(may_recurse: Boolean /* Some(gboolean) */ ): Unit /* None */ =
    g_hook_list_invoke(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHookList]],
      gboolean(gint((if may_recurse == true then 1 else 0)))
    )
  end invoke

  /** Calls all of the #GHook functions in a #GHookList. Any function which
    * returns %FALSE is removed from the #GHookList.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invokeCheck(may_recurse: Boolean /* Some(gboolean) */ ): Unit /* None */ =
    g_hook_list_invoke_check(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHookList]],
      gboolean(gint((if may_recurse == true then 1 else 0)))
    )
  end invokeCheck

  /** Calls a function on each valid #GHook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method marshal/<method parameters>/marshaller]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookMarshaller), @type -> DataRecord(GHookMarshaller)))"
  )
  private def marshal__ = ???

  /** Calls a function on each valid #GHook and destroys it if the function
    * returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method marshal_check/<method parameters>/marshaller]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookCheckMarshaller), @type -> DataRecord(GHookCheckMarshaller)))"
  )
  private def marshalCheck__ = ???

end HookList

object HookList:
  def fromRaw(ptr: Ptr[GHookList]): HookList = new HookList(ptr)
end HookList

package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.Hook
import sn.gnome.glib.internal.{GHook, gint, gpointer, guint, gulong}

/** The #GHook struct represents a single hook function in a #GHookList.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Hook private[gnome] (raw: Ptr[GHook]):

  def getUnsafeRawPointer(): Ptr[GHook] = this.raw

  /** data which is passed to func when this hook is invoked
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data: Ptr[Byte] /* None */ = (!raw).data.asInstanceOf[gpointer]

  /** data which is passed to func when this hook is invoked
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).data_=(gpointer(value).asInstanceOf[gpointer])

  /** pointer to the next hook in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next: sn.gnome.glib.Hook /* None */ = (!raw).next.asInstanceOf[Ptr[GHook]]

  /** pointer to the next hook in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next_=(value: sn.gnome.glib.Hook /* None */ ): Unit = (!raw).next_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GHook]]
  )

  /** pointer to the previous hook in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev: sn.gnome.glib.Hook /* None */ = (!raw).prev.asInstanceOf[Ptr[GHook]]

  /** pointer to the previous hook in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev_=(value: sn.gnome.glib.Hook /* None */ ): Unit = (!raw).prev_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GHook]]
  )

  /** the reference count of this hook
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refCount: UInt /* None */ = (!raw).ref_count.asInstanceOf[guint]

  /** the reference count of this hook
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refCount_=(value: UInt /* None */ ): Unit =
    (!raw).ref_count_=(guint(value).asInstanceOf[guint])

  /** the id of this hook, which is unique within its list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hookId: CUnsignedLongInt /* None */ = (!raw).hook_id.asInstanceOf[gulong]

  /** the id of this hook, which is unique within its list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hookId_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).hook_id_=(gulong(value).asInstanceOf[gulong])

  /** flags which are set for this hook. See #GHookFlagMask for predefined flags
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: UInt /* None */ = (!raw).flags.asInstanceOf[guint]

  /** flags which are set for this hook. See #GHookFlagMask for predefined flags
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: UInt /* None */ ): Unit =
    (!raw).flags_=(guint(value).asInstanceOf[guint])

  /** the function to call when this hook is invoked. The possible signatures
    * for this function are #GHookFunc and #GHookCheckFunc
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def func: Ptr[Byte] /* None */ = (!raw).func.asInstanceOf[gpointer]

  /** the function to call when this hook is invoked. The possible signatures
    * for this function are #GHookFunc and #GHookCheckFunc
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def func_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).func_=(gpointer(value).asInstanceOf[gpointer])

  /** the default @finalize_hook function of a #GHookList calls this member of
    * the hook that is being finalized
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def destroy__ = ???

  /** Compares the ids of two #GHook elements, returning a negative value if the
    * second id is greater than the first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compareIds(
      sibling: sn.gnome.glib.Hook /* Some(Ptr[GHook]) */
  ): Int /* None */ =
    g_hook_compare_ids(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHook]],
      sibling.getUnsafeRawPointer().asInstanceOf
    ).value
  end compareIds

end Hook

object Hook:
  def fromRaw(ptr: Ptr[GHook]): Hook = new Hook(ptr)
end Hook

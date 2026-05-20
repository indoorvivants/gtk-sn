package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.pango.internal.PangoScriptIter

/** A `PangoScriptIter` is used to iterate through a string and identify ranges
  * in different scripts.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ScriptIter private[gnome] (raw: Ptr[PangoScriptIter]):

  def getUnsafeRawPointer(): Ptr[PangoScriptIter] = this.raw

  /** Frees a `PangoScriptIter`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_script_iter_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoScriptIter]]
    )
  end free

  /** Gets information about the range to which @iter currently points.
    *
    * The range is the set of locations p where *start <= p < *end. (That is, it
    * doesn't include the character stored at *end)
    *
    * Note that while the type of the @script argument is declared as
    * `PangoScript`, as of Pango 1.18, this function simply returns
    * `GUnicodeScript` values. Callers must be prepared to handle unknown
    * values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_range]: Method get_range contains an OUT parameter, which is not supported yet"
  )
  private def getRange__ = ???

  /** Advances a `PangoScriptIter` to the next range.
    *
    * If @iter is already at the end, it is left unchanged and %FALSE is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): Boolean /* None */ =
    pango_script_iter_next(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoScriptIter]]
    ).value.!=(0)
  end next

end ScriptIter

object ScriptIter:
  def fromRaw(ptr: Ptr[PangoScriptIter]): ScriptIter = new ScriptIter(ptr)
end ScriptIter

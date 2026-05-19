package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{Font, Fontset}
import sn.gnome.pango.internal.PangoFontsetSimple

/** `PangoFontsetSimple` is a implementation of the abstract `PangoFontset` base
  * class as an array of fonts.
  *
  * When creating a `PangoFontsetSimple`, you have to provide the array of fonts
  * that make up the fontset.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontsetSimple private[gnome] (raw: Ptr[PangoFontsetSimple])
    extends Fontset(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a font to the fontset.
    *
    * The fontset takes ownership of @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      font: sn.gnome.pango.Font /* Some(Ptr[PangoFont]) */
  )(using Runtime): Unit /* None */ =
    pango_fontset_simple_append(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontsetSimple]],
      font.getUnsafeRawPointer().asInstanceOf
    )
  end append

  /** Returns the number of fonts in the fontset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size(): Int /* None */ =
    pango_fontset_simple_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontsetSimple]]
    )
  end size

end FontsetSimple

object FontsetSimple:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[PangoFontsetSimple])(using Runtime) =
    summon[Runtime].getOrCreate[FontsetSimple](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FontsetSimple(ptr)
    )

  /** Creates a new `PangoFontsetSimple` for the given language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  private def apply() = ???

end FontsetSimple

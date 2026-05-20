package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.internal.GdkPixbufModule

/** A `GdkPixbufModule` contains the necessary functions to load and save images
  * in a certain file format.
  *
  * If `GdkPixbuf` has been compiled with `GModule` support, it can be extended
  * by modules which can load (and perhaps also save) new image and animation
  * formats.
  *
  * ## Implementing modules
  *
  * The `GdkPixbuf` interfaces needed for implementing modules are contained in
  * `gdk-pixbuf-io.h` (and `gdk-pixbuf-animation.h` if the module supports
  * animations). They are not covered by the same stability guarantees as the
  * regular GdkPixbuf API. To underline this fact, they are protected by the
  * `GDK_PIXBUF_ENABLE_BACKEND` pre-processor symbol.
  *
  * Each loadable module must contain a `GdkPixbufModuleFillVtableFunc` function
  * named `fill_vtable`, which will get called when the module is loaded and
  * must set the function pointers of the `GdkPixbufModule`.
  *
  * In order to make format-checking work before actually loading the modules
  * (which may require calling `dlopen` to load image libraries), modules export
  * their signatures (and other information) via the `fill_info` function. An
  * external utility, `gdk-pixbuf-query-loaders`, uses this to create a text
  * file containing a list of all available loaders and their signatures. This
  * file is then read at runtime by `GdkPixbuf` to obtain the list of available
  * loaders and their signatures.
  *
  * Modules may only implement a subset of the functionality available via
  * `GdkPixbufModule`. If a particular functionality is not implemented, the
  * `fill_vtable` function will simply not set the corresponding function
  * pointers of the `GdkPixbufModule` structure. If a module supports
  * incremental loading (i.e. provides `begin_load`, `stop_load` and
  * `load_increment`), it doesn't have to implement `load`, since `GdkPixbuf`
  * can supply a generic `load` implementation wrapping the incremental loading.
  *
  * ## Installing modules
  *
  * Installing a module is a two-step process:
  *
  *   - copy the module file(s) to the loader directory (normally
  *     `$libdir/gdk-pixbuf-2.0/$version/loaders`, unless overridden by the
  *     environment variable `GDK_PIXBUF_MODULEDIR`)
  *   - call `gdk-pixbuf-query-loaders` to update the module file (normally
  *     `$libdir/gdk-pixbuf-2.0/$version/loaders.cache`, unless overridden by
  *     the environment variable `GDK_PIXBUF_MODULE_FILE`)
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufModule private[gnome] (raw: Ptr[GdkPixbufModule]):

  def getUnsafeRawPointer(): Ptr[GdkPixbufModule] = this.raw

  /** the name of the module, usually the same as the usual file extension for
    * images of this type, eg. "xpm", "jpeg" or "png".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moduleName: String /* None */ = fromCString(
    (!raw).module_name.asInstanceOf
  )

  /** the name of the module, usually the same as the usual file extension for
    * images of this type, eg. "xpm", "jpeg" or "png".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moduleName_=(value: String /* None */ ): Unit =
    (!raw).module_name_=(summon[Runtime].inZone(toCString(value)))

  /** the path from which the module is loaded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def modulePath: String /* None */ = fromCString(
    (!raw).module_path.asInstanceOf
  )

  /** the path from which the module is loaded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def modulePath_=(value: String /* None */ ): Unit =
    (!raw).module_path_=(summon[Runtime].inZone(toCString(value)))

  /** the loaded `GModule`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def module: Ptr[Byte] /* None */ = (!raw).module.value

  /** the loaded `GModule`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def module_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).module_=(gpointer(value))

  /** a `GdkPixbufFormat` holding information about the module.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def info: sn.gnome.gdkpixbuf.PixbufFormat /* None */ =
    sn.gnome.gdkpixbuf.PixbufFormat.fromRaw((!raw).info)

  /** a `GdkPixbufFormat` holding information about the module.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def info_=(value: sn.gnome.gdkpixbuf.PixbufFormat /* None */ ): Unit =
    (!raw).info_=(value.getUnsafeRawPointer())

  /** loads an image from a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field load]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleLoadFunc), @type -> DataRecord(GdkPixbufModuleLoadFunc)))"
  )
  private def load__ = ???

  /** loads an image from data in memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field load_xpm_data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleLoadXpmDataFunc), @type -> DataRecord(GdkPixbufModuleLoadXpmDataFunc)))"
  )
  private def loadXpmData__ = ???

  /** begins an incremental load.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field begin_load]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleBeginLoadFunc), @type -> DataRecord(GdkPixbufModuleBeginLoadFunc)))"
  )
  private def beginLoad__ = ???

  /** stops an incremental load.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field stop_load]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleStopLoadFunc), @type -> DataRecord(GdkPixbufModuleStopLoadFunc)))"
  )
  private def stopLoad__ = ???

  /** continues an incremental load.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field load_increment]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleIncrementLoadFunc), @type -> DataRecord(GdkPixbufModuleIncrementLoadFunc)))"
  )
  private def loadIncrement__ = ???

  /** loads an animation from a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field load_animation]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleLoadAnimationFunc), @type -> DataRecord(GdkPixbufModuleLoadAnimationFunc)))"
  )
  private def loadAnimation__ = ???

  /** saves a `GdkPixbuf` to a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field save]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleSaveFunc), @type -> DataRecord(GdkPixbufModuleSaveFunc)))"
  )
  private def save__ = ???

  /** saves a `GdkPixbuf` by calling the given `GdkPixbufSaveFunc`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field save_to_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleSaveCallbackFunc), @type -> DataRecord(GdkPixbufModuleSaveCallbackFunc)))"
  )
  private def saveToCallback__ = ???

  /** returns whether a save option key is supported by the module
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field is_save_option_supported]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufModuleSaveOptionSupportedFunc), @type -> DataRecord(GdkPixbufModuleSaveOptionSupportedFunc)))"
  )
  private def isSaveOptionSupported__ = ???
  @annotation.compileTimeOnly("[field _reserved1]: Field is missing <type>")
  private def Reserved1__ = ???
  @annotation.compileTimeOnly("[field _reserved2]: Field is missing <type>")
  private def Reserved2__ = ???
  @annotation.compileTimeOnly("[field _reserved3]: Field is missing <type>")
  private def Reserved3__ = ???
  @annotation.compileTimeOnly("[field _reserved4]: Field is missing <type>")
  private def Reserved4__ = ???
end PixbufModule
object PixbufModule:
  def fromRaw(ptr: Ptr[GdkPixbufModule]): PixbufModule = new PixbufModule(ptr)
end PixbufModule

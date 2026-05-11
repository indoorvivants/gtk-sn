package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait LoadableIcon:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Loads a loadable icon. For the asynchronous version of this function, see
    * g_loadable_icon_load_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load]: Method load contains an OUT parameter, which is not supported yet"
  )
  private def load__ = ???

  /** Loads an icon asynchronously. To finish this function, see
    * g_loadable_icon_load_finish(). For the synchronous, blocking version of
    * this function, see g_loadable_icon_load().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def loadAsync__ = ???

  /** Finishes an asynchronous icon load started in
    * g_loadable_icon_load_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_finish]: Method load_finish contains an OUT parameter, which is not supported yet"
  )
  private def loadFinish__ = ???

end LoadableIcon

object LoadableIcon:
  class Abstract(raw: Ptr[Byte]) extends LoadableIcon:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end LoadableIcon

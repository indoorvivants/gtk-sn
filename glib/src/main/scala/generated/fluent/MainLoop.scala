package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{MainContext, MainLoop}
import sn.gnome.glib.internal.{GMainLoop, gboolean, gint}

/** The `GMainLoop` struct is an opaque data type representing the main event
  * loop of a GLib or GTK application.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MainLoop private[gnome] (raw: Ptr[GMainLoop]):

  def getUnsafeRawPointer(): Ptr[GMainLoop] = this.raw

  /** Returns the #GMainContext of @loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContext(): sn.gnome.glib.MainContext /* None */ =
    sn.gnome.glib.MainContext.fromRaw(
      g_main_loop_get_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainLoop]]
      )
    )
  end getContext

  /** Checks to see if the main loop is currently being run via
    * g_main_loop_run().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRunning(): Boolean /* None */ =
    g_main_loop_is_running(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainLoop]]
    ).value.!=(0)
  end isRunning

  /** Stops a #GMainLoop from running. Any calls to g_main_loop_run() for the
    * loop will return.
    *
    * Note that sources that have already been dispatched when
    * g_main_loop_quit() is called will still be executed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def quit(): Unit /* None */ =
    g_main_loop_quit(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainLoop]])
  end quit

  /** Increases the reference count on a #GMainLoop object by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.MainLoop /* None */ =
    sn.gnome.glib.MainLoop.fromRaw(
      g_main_loop_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainLoop]])
    )
  end ref

  /** Runs a main loop until g_main_loop_quit() is called on the loop. If this
    * is called for the thread of the loop's #GMainContext, it will process
    * events from the loop, otherwise it will simply wait.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def run(): Unit /* None */ =
    g_main_loop_run(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainLoop]])
  end run

  /** Decreases the reference count on a #GMainLoop object by one. If the result
    * is zero, free the loop and free all associated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_main_loop_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainLoop]])
  end unref

end MainLoop

object MainLoop:
  def fromRaw(ptr: Ptr[GMainLoop]): MainLoop = new MainLoop(ptr)
end MainLoop

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.Renderer

trait Native:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Returns the renderer that is used for this `GtkNative`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRenderer()(using Runtime): sn.gnome.gsk4.fluent.Renderer /* None */ =
    sn.gnome.gsk4.fluent.Renderer.applyUnsafe(
      gtk_native_get_renderer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
      ).asInstanceOf
    )
  end getRenderer

  /** Returns the surface of this `GtkNative`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurface()(using Runtime): sn.gnome.gdk4.fluent.Surface /* None */ =
    sn.gnome.gdk4.fluent.Surface.applyUnsafe(
      gtk_native_get_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
      ).asInstanceOf
    )
  end getSurface

  /** Retrieves the surface transform of @self.
    *
    * This is the translation from @self's surface coordinates into
    * @self's
    *   widget coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_surface_transform]: Method get_surface_transform contains an OUT parameter, which is not supported yet"
  )
  private def getSurfaceTransform__ = ???

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

end Native

object Native:
  class Abstract(raw: Ptr[Byte]) extends Native:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Native

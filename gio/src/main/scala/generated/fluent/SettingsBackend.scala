package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSettingsBackend
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The #GSettingsBackend interface defines a generic interface for
  * non-strictly-typed data that is stored in a hierarchy. To implement an
  * alternative storage backend for #GSettings, you need to implement the
  * #GSettingsBackend interface and then make it implement the extension point
  * %G_SETTINGS_BACKEND_EXTENSION_POINT_NAME.
  *
  * The interface defines methods for reading and writing values, a method for
  * determining if writing of certain values will fail (lockdown) and a change
  * notification mechanism.
  *
  * The semantics of the interface are very precisely defined and
  * implementations must carefully adhere to the expectations of callers that
  * are documented on each of the interface methods.
  *
  * Some of the #GSettingsBackend functions accept or return a #GTree. These
  * trees always have strings as keys and #GVariant as values.
  * g_settings_backend_create_tree() is a convenience function to create
  * suitable trees.
  *
  * The #GSettingsBackend API is exported to allow third-party implementations,
  * but does not carry the same stability guarantees as the public GIO API. For
  * this reason, you have to define the C preprocessor symbol
  * %G_SETTINGS_ENABLE_BACKEND before including `gio/gsettingsbackend.h`.
  */
class SettingsBackend(raw: Ptr[GSettingsBackend])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  @annotation.compileTimeOnly("GSettingsBackend methods are not rendered")
  def changed() = ???

  @annotation.compileTimeOnly("GSettingsBackend methods are not rendered")
  def changedTree() = ???

  @annotation.compileTimeOnly("GSettingsBackend methods are not rendered")
  def keysChanged() = ???

  @annotation.compileTimeOnly("GSettingsBackend methods are not rendered")
  def pathChanged() = ???

  @annotation.compileTimeOnly("GSettingsBackend methods are not rendered")
  def pathWritableChanged() = ???

  @annotation.compileTimeOnly("GSettingsBackend methods are not rendered")
  def writableChanged() = ???

end SettingsBackend

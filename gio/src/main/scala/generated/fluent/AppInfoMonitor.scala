package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AppInfoMonitor
import sn.gnome.gio.internal.GAppInfoMonitor
import sn.gnome.gobject.fluent.Object

/** #GAppInfoMonitor is a very simple object used for monitoring the app info
  * database for changes (newly installed or removed applications).
  *
  * Call g_app_info_monitor_get() to get a #GAppInfoMonitor and connect to the
  * #GAppInfoMonitor::changed signal. The signal will be emitted once when the
  * app info database changes, and will not be emitted again until after the
  * next call to g_app_info_get_all() or another `g_app_info_*()` function. This
  * is because monitoring the app info database for changes is expensive.
  *
  * The following functions will re-arm the #GAppInfoMonitor::changed signal so
  * it can be emitted again:
  *   - g_app_info_get_all()
  *   - g_app_info_get_all_for_type()
  *   - g_app_info_get_default_for_type()
  *   - g_app_info_get_fallback_for_type()
  *   - g_app_info_get_recommended_for_type()
  *   - g_desktop_app_info_get_implementations()
  *   - g_desktop_app_info_new()
  *   - g_desktop_app_info_new_from_filename()
  *   - g_desktop_app_info_new_from_keyfile()
  *   - g_desktop_app_info_search()
  *
  * In the usual case, applications should try to make note of the change (doing
  * things like invalidating caches) but not act on it. In particular,
  * applications should avoid making calls to #GAppInfo APIs in response to the
  * change signal, deferring these until the time that the updated data is
  * actually required. The exception to this case is when application
  * information is actually being displayed on the screen (for example, during a
  * search or when the list of all applications is shown). The reason for this
  * is that changes to the list of installed applications often come in groups
  * (like during system updates) and rescanning the list on every change is
  * pointless and expensive.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppInfoMonitor(raw: Ptr[GAppInfoMonitor])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end AppInfoMonitor

object AppInfoMonitor:
  /** Gets the #GAppInfoMonitor for the current thread-default main context.
    *
    * The #GAppInfoMonitor will emit a "changed" signal in the thread-default
    * main context whenever the list of installed applications (as reported by
    * g_app_info_get_all()) may have changed.
    *
    * The #GAppInfoMonitor::changed signal will only be emitted once until
    * g_app_info_get_all() (or another `g_app_info_*()` function) is called.
    * Doing so will re-arm the signal ready to notify about the next change.
    *
    * You must only call g_object_unref() on the return value from under the
    * same main context as you created it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(): AppInfoMonitor /* Some(Ptr[GAppInfoMonitor]) */ =
    new AppInfoMonitor(g_app_info_monitor_get().asInstanceOf)

end AppInfoMonitor

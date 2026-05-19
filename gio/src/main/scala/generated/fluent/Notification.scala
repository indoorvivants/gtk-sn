package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{Icon, NotificationPriority}
import sn.gnome.gio.internal.GNotification
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/**  #GNotification is a mechanism for creating a notification to be shown
  *  to the user -- typically as a pop-up notification presented by the
  *  desktop environment shell.
  *
  *  The key difference between #GNotification and other similar APIs is
  *  that, if supported by the desktop environment, notifications sent
  *  with #GNotification will persist after the application has exited,
  *  and even across system reboots.
  *
  *  Since the user may click on a notification while the application is
  *  not running, applications using #GNotification should be able to be
  *  started as a D-Bus service, using #GApplication.
  *
  *  In order for #GNotification to work, the application must have installed
  *  a `.desktop` file. For example:
  *  |[
  *   [Desktop Entry]
  *    Name=Test Application
  *    Comment=Description of what Test Application does
  *    Exec=gnome-test-application
  *    Icon=org.gnome.TestApplication
  *    Terminal=false
  *    Type=Application
  *    Categories=GNOME;GTK;TestApplication Category;
  *    StartupNotify=true
  *    DBusActivatable=true
  *    X-GNOME-UsesNotifications=true
  *  ]|
  *
  *  The `X-GNOME-UsesNotifications` key indicates to GNOME Control Center
  *  that this application uses notifications, so it can be listed in the
  *  Control Center’s ‘Notifications’ panel.
  *
  *  The `.desktop` file must be named as `org.gnome.TestApplication.desktop`,
  *  where `org.gnome.TestApplication` is the ID passed to g_application_new().
  *
  *  User interaction with a notification (either the default action, or
  *  buttons) must be associated with actions on the application (ie:
  *  "app." actions).  It is not possible to route user interaction
  *  through the notification itself, because the object will not exist if
  *  the application is autostarted as a result of a notification being
  *  clicked.
  *
  *  A notification can be sent with g_application_send_notification().
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class Notification private[gnome] (raw: Ptr[GNotification])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a button to @notification that activates the action in
    * @detailed_action
    *   when clicked. That action must be an application-wide action (starting
    *   with "app."). If @detailed_action contains a target, the action will be
    *   activated with that target as its parameter.
    *
    * See g_action_parse_detailed_name() for a description of the format for @detailed_action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addButton(
      label: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      detailed_action: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): Unit /* None */ =
    g_notification_add_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      summon[Runtime].inZone(toCString(label)).asInstanceOf[Ptr[gchar]],
      summon[Runtime]
        .inZone(toCString(detailed_action))
        .asInstanceOf[Ptr[gchar]]
    )
  end addButton

  /** Adds a button to @notification that activates @action when clicked.
    * @action
    *   must be an application-wide action (it must start with "app.").
    *
    * If @target_format is given, it is used to collect remaining positional
    * parameters into a #GVariant instance, similar to g_variant_new(). @action
    * will be activated with that #GVariant as its parameter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_button_with_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def addButtonWithTarget__ = ???

  /** Adds a button to @notification that activates @action when clicked.
    * @action
    *   must be an application-wide action (it must start with "app.").
    *
    * If @target is non-%NULL, @action will be activated with @target as its
    * parameter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_button_with_target_value/<method parameters>/target]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def addButtonWithTargetValue__ = ???

  /** Sets the body of @notification to @body.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBody(
      body: Option[String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ ]
  )(using Runtime): Unit /* None */ =
    g_notification_set_body(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      body
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          summon[Runtime].inZone(toCString(o)).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setBody

  /** Sets the type of @notification to @category. Categories have a main type
    * like `email`, `im` or `device` and can have a detail separated by a `.`,
    * e.g. `im.received` or `email.arrived`. Setting the category helps the
    * notification server to select proper feedback to the user.
    *
    * Standard categories are [listed in the
    * specification](https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCategory(
      category: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_notification_set_category(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      category
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          summon[Runtime].inZone(toCString(o)).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end setCategory

  /** Sets the default action of @notification to @detailed_action. This action
    * is activated when the notification is clicked on.
    *
    * The action in @detailed_action must be an application-wide action (it must
    * start with "app."). If @detailed_action contains a target, the given
    * action will be activated with that target as its parameter. See
    * g_action_parse_detailed_name() for a description of the format for @detailed_action.
    *
    * When no default action is set, the application that the notification was
    * sent on is activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultAction(
      detailed_action: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): Unit /* None */ =
    g_notification_set_default_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      summon[Runtime]
        .inZone(toCString(detailed_action))
        .asInstanceOf[Ptr[gchar]]
    )
  end setDefaultAction

  /** Sets the default action of @notification to @action. This action is
    * activated when the notification is clicked on. It must be an
    * application-wide action (it must start with "app.").
    *
    * If @target_format is given, it is used to collect remaining positional
    * parameters into a #GVariant instance, similar to g_variant_new(). @action
    * will be activated with that #GVariant as its parameter.
    *
    * When no default action is set, the application that the notification was
    * sent on is activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_default_action_and_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def setDefaultActionAndTarget__ = ???

  /** Sets the default action of @notification to @action. This action is
    * activated when the notification is clicked on. It must be an
    * application-wide action (start with "app.").
    *
    * If @target is non-%NULL, @action will be activated with @target as its
    * parameter. If @target is floating, it will be consumed.
    *
    * When no default action is set, the application that the notification was
    * sent on is activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_default_action_and_target_value/<method parameters>/target]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setDefaultActionAndTargetValue__ = ???

  /** Sets the icon of @notification to @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcon(icon: Icon /* Some(Ptr[GIcon]) */ ): Unit /* None */ =
    g_notification_set_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      icon.getUnsafeRawPointer().asInstanceOf
    )
  end setIcon

  /** Sets the priority of @notification to @priority. See
    * #GNotificationPriority for possible values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPriority(
      priority: NotificationPriority /* Some(GNotificationPriority) */
  ): Unit /* None */ =
    g_notification_set_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      priority.raw
    )
  end setPriority

  /** Sets the title of @notification to @title.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): Unit /* None */ =
    g_notification_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      summon[Runtime].inZone(toCString(title)).asInstanceOf[Ptr[gchar]]
    )
  end setTitle

  /** Deprecated in favor of g_notification_set_priority().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUrgent(
      urgent: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_notification_set_urgent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNotification]],
      gboolean(gint((if urgent == true then 1 else 0)))
    )
  end setUrgent

end Notification

object Notification:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GNotification])(using Runtime) =
    summon[Runtime].getOrCreate[Notification](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Notification(ptr)
    )

  /** Creates a new #GNotification with @title as its title.
    *
    * After populating @notification with more details, it can be sent to the
    * desktop shell with g_application_send_notification(). Changing any
    * properties after this call will not have any effect until resending @notification.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      title: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): Notification =
    val raw: Ptr[Byte] = g_notification_new(
      summon[Runtime].inZone(toCString(title)).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[Notification](
      raw,
      r => Notification.applyUnsafe(r.asInstanceOf)
    )
  end apply
end Notification

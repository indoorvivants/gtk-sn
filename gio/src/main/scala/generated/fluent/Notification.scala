package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Icon, NotificationPriority}
import sn.gnome.gio.internal.GNotification
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.fluent.Object

/**  COMMENT FOR THE ORIGINAL C DEFINITION
  *
  *  #GNotification is a mechanism for creating a notification to be shown
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
  */
class Notification(raw: Ptr[GNotification]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a button to @notification that activates the action in
    * @detailed_action
    *   when clicked. That action must be an application-wide action (starting
    *   with "app."). If @detailed_action contains a target, the action will be
    *   activated with that target as its parameter.
    *
    * See g_action_parse_detailed_name() for a description of the format for @detailed_action.
    */
  def addButton(
      label: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      detailed_action: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_notification_add_button(
    this.raw.asInstanceOf[Ptr[GNotification]],
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a button to @notification that activates @action when clicked.
    * @action
    *   must be an application-wide action (it must start with "app.").
    *
    * If @target_format is given, it is used to collect remaining positional
    * parameters into a #GVariant instance, similar to g_variant_new(). @action
    * will be activated with that #GVariant as its parameter.
    */
  inline def addButtonWithTarget(
      label: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      action: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target_format: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      args: Any*
  )(using Zone): Unit /* None */ = g_notification_add_button_with_target(
    this.raw.asInstanceOf[Ptr[GNotification]],
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    target_format
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a button to @notification that activates @action when clicked.
    * @action
    *   must be an application-wide action (it must start with "app.").
    *
    * If @target is non-%NULL, @action will be activated with @target as its
    * parameter.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  def addButtonWithTargetValue__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the body of @notification to @body.
    */
  def setBody(
      body: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_notification_set_body(
    this.raw.asInstanceOf[Ptr[GNotification]],
    body
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the type of @notification to @category. Categories have a main type
    * like `email`, `im` or `device` and can have a detail separated by a `.`,
    * e.g. `im.received` or `email.arrived`. Setting the category helps the
    * notification server to select proper feedback to the user.
    *
    * Standard categories are [listed in the
    * specification](https://specifications.freedesktop.org/notification-spec/latest/ar01s06.html).
    */
  def setCategory(
      category: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_notification_set_category(
    this.raw.asInstanceOf[Ptr[GNotification]],
    category
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default action of @notification to @detailed_action. This action
    * is activated when the notification is clicked on.
    *
    * The action in @detailed_action must be an application-wide action (it must
    * start with "app."). If @detailed_action contains a target, the given
    * action will be activated with that target as its parameter. See
    * g_action_parse_detailed_name() for a description of the format for @detailed_action.
    *
    * When no default action is set, the application that the notification was
    * sent on is activated.
    */
  def setDefaultAction(
      detailed_action: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_notification_set_default_action(
    this.raw.asInstanceOf[Ptr[GNotification]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default action of @notification to @action. This action is
    * activated when the notification is clicked on. It must be an
    * application-wide action (it must start with "app.").
    *
    * If @target_format is given, it is used to collect remaining positional
    * parameters into a #GVariant instance, similar to g_variant_new(). @action
    * will be activated with that #GVariant as its parameter.
    *
    * When no default action is set, the application that the notification was
    * sent on is activated.
    */
  inline def setDefaultActionAndTarget(
      action: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target_format: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      args: Any*
  )(using Zone): Unit /* None */ = g_notification_set_default_action_and_target(
    this.raw.asInstanceOf[Ptr[GNotification]],
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    target_format
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default action of @notification to @action. This action is
    * activated when the notification is clicked on. It must be an
    * application-wide action (start with "app.").
    *
    * If @target is non-%NULL, @action will be activated with @target as its
    * parameter. If @target is floating, it will be consumed.
    *
    * When no default action is set, the application that the notification was
    * sent on is activated.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  def setDefaultActionAndTargetValue__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon of @notification to @icon.
    */
  def setIcon(icon: Icon /* Some(Ptr[GIcon]) */ ): Unit /* None */ =
    g_notification_set_icon(
      this.raw.asInstanceOf[Ptr[GNotification]],
      icon.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the priority of @notification to @priority. See
    * #GNotificationPriority for possible values.
    */
  def setPriority(
      priority: NotificationPriority /* Some(GNotificationPriority) */
  ): Unit /* None */ = g_notification_set_priority(
    this.raw.asInstanceOf[Ptr[GNotification]],
    priority.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title of @notification to @title.
    */
  def setTitle(
      title: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_notification_set_title(
    this.raw.asInstanceOf[Ptr[GNotification]],
    __sn_extract_string(title).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deprecated in favor of g_notification_set_priority().
    */
  def setUrgent(
      urgent: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_notification_set_urgent(
    this.raw.asInstanceOf[Ptr[GNotification]],
    gboolean(gint((if urgent == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Notification

object Notification:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GNotification with @title as its title.
    *
    * After populating @notification with more details, it can be sent to the
    * desktop shell with g_application_send_notification(). Changing any
    * properties after this call will not have any effect until resending @notification.
    */
  def apply(
      title: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Notification = new Notification(
    g_notification_new(
      __sn_extract_string(title).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Notification

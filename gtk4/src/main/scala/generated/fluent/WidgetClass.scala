package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.Bytes
import sn.gnome.glib.internal.{gboolean, gint, gssize, guint}
import sn.gnome.gobject.InitiallyUnownedClass
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{AccessibleRole, BuilderScope, Shortcut}
import sn.gnome.gtk4.internal.GtkWidgetClass

class WidgetClass private[gnome] (raw: Ptr[GtkWidgetClass]):

  def getUnsafeRawPointer(): Ptr[GtkWidgetClass] = this.raw

  /** The object class structure needs to be the first element in the widget
    * class structure in order for the class mechanism to work correctly. This
    * allows a GtkWidgetClass pointer to be cast to a GObjectClass pointer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.InitiallyUnownedClass /* None */ =
    (!raw).parent_class
      .asInstanceOf[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass]
  @annotation.compileTimeOnly("[field show]: Field is missing <type>")
  private def show__ = ???
  @annotation.compileTimeOnly("[field hide]: Field is missing <type>")
  private def hide__ = ???
  @annotation.compileTimeOnly("[field map]: Field is missing <type>")
  private def map__ = ???
  @annotation.compileTimeOnly("[field unmap]: Field is missing <type>")
  private def unmap__ = ???
  @annotation.compileTimeOnly("[field realize]: Field is missing <type>")
  private def realize__ = ???
  @annotation.compileTimeOnly("[field unrealize]: Field is missing <type>")
  private def unrealize__ = ???
  @annotation.compileTimeOnly("[field root]: Field is missing <type>")
  private def root__ = ???
  @annotation.compileTimeOnly("[field unroot]: Field is missing <type>")
  private def unroot__ = ???
  @annotation.compileTimeOnly("[field size_allocate]: Field is missing <type>")
  private def sizeAllocate__ = ???
  @annotation.compileTimeOnly(
    "[field state_flags_changed]: Field is missing <type>"
  )
  private def stateFlagsChanged__ = ???
  @annotation.compileTimeOnly(
    "[field direction_changed]: Field is missing <type>"
  )
  private def directionChanged__ = ???
  @annotation.compileTimeOnly(
    "[field get_request_mode]: Field is missing <type>"
  )
  private def getRequestMode__ = ???
  @annotation.compileTimeOnly("[field measure]: Field is missing <type>")
  private def measure__ = ???
  @annotation.compileTimeOnly(
    "[field mnemonic_activate]: Field is missing <type>"
  )
  private def mnemonicActivate__ = ???
  @annotation.compileTimeOnly("[field grab_focus]: Field is missing <type>")
  private def grabFocus__ = ???
  @annotation.compileTimeOnly("[field focus]: Field is missing <type>")
  private def focus__ = ???
  @annotation.compileTimeOnly(
    "[field set_focus_child]: Field is missing <type>"
  )
  private def setFocusChild__ = ???
  @annotation.compileTimeOnly("[field move_focus]: Field is missing <type>")
  private def moveFocus__ = ???
  @annotation.compileTimeOnly("[field keynav_failed]: Field is missing <type>")
  private def keynavFailed__ = ???
  @annotation.compileTimeOnly("[field query_tooltip]: Field is missing <type>")
  private def queryTooltip__ = ???
  @annotation.compileTimeOnly("[field compute_expand]: Field is missing <type>")
  private def computeExpand__ = ???
  @annotation.compileTimeOnly("[field css_changed]: Field is missing <type>")
  private def cssChanged__ = ???
  @annotation.compileTimeOnly(
    "[field system_setting_changed]: Field is missing <type>"
  )
  private def systemSettingChanged__ = ???
  @annotation.compileTimeOnly("[field snapshot]: Field is missing <type>")
  private def snapshot__ = ???
  @annotation.compileTimeOnly("[field contains]: Field is missing <type>")
  private def contains__ = ???

  /** Creates a new shortcut for @widget_class that calls the given @callback
    * with arguments read according to @format_string.
    *
    * The arguments and format string must be provided in the same way as with
    * g_variant_new().
    *
    * This function is a convenience wrapper around
    * [method@Gtk.WidgetClass.add_shortcut] and must be called during class
    * initialization. It does not provide for user_data, if you need that, you
    * will have to use [method@Gtk.WidgetClass.add_shortcut] with a custom
    * shortcut.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_binding/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ShortcutFunc), @type -> DataRecord(GtkShortcutFunc)))"
  )
  private def addBinding__ = ???

  /** Creates a new shortcut for @widget_class that activates the given
    * @action_name
    *   with arguments read according to @format_string.
    *
    * The arguments and format string must be provided in the same way as with
    * g_variant_new().
    *
    * This function is a convenience wrapper around
    * [method@Gtk.WidgetClass.add_shortcut] and must be called during class
    * initialization.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_binding_action/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def addBindingAction__ = ???

  /** Creates a new shortcut for @widget_class that emits the given action
    * @signal
    *   with arguments read according to @format_string.
    *
    * The arguments and format string must be provided in the same way as with
    * g_variant_new().
    *
    * This function is a convenience wrapper around
    * [method@Gtk.WidgetClass.add_shortcut] and must be called during class
    * initialization.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_binding_signal/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def addBindingSignal__ = ???

  /** Installs a shortcut in @widget_class.
    *
    * Every instance created for @widget_class or its subclasses will inherit
    * this shortcut and trigger it.
    *
    * Shortcuts added this way will be triggered in the %GTK_PHASE_BUBBLE phase,
    * which means they may also trigger if child widgets have focus.
    *
    * This function must only be used in class initialization functions
    * otherwise it is not guaranteed that the shortcut will be installed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addShortcut(
      shortcut: sn.gnome.gtk4.Shortcut /* Some(Ptr[GtkShortcut]) */
  )(using Runtime): Unit /* None */ =
    gtk_widget_class_add_shortcut(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      shortcut.getUnsafeRawPointer().asInstanceOf
    )
  end addShortcut

  /** Declares a @callback_symbol to handle @callback_name from the template XML
    * defined for @widget_type.
    *
    * This function is not supported after
    * [method@Gtk.WidgetClass.set_template_scope] has been used on @widget_class.
    * See [method@Gtk.BuilderCScope.add_callback_symbol].
    *
    * Note that this must be called from a composite widget classes class
    * initializer after calling [method@Gtk.WidgetClass.set_template].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method bind_template_callback_full/<method parameters>/callback_symbol]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))"
  )
  private def bindTemplateCallbackFull__ = ???

  /** Automatically assign an object declared in the class template XML to be
    * set to a location on a freshly built instance’s private data, or
    * alternatively accessible via [method@Gtk.Widget.get_template_child].
    *
    * The struct can point either into the public instance, then you should use
    * `G_STRUCT_OFFSET(WidgetType, member)` for @struct_offset, or in the
    * private struct, then you should use
    * `G_PRIVATE_OFFSET(WidgetType, member)`.
    *
    * An explicit strong reference will be held automatically for the duration
    * of your instance’s life cycle, it will be released automatically when
    * `GObjectClass.dispose()` runs on your instance and if a @struct_offset
    * that is `!= 0` is specified, then the automatic location in your instance
    * public or private data will be set to %NULL. You can however access an
    * automated child pointer the first time your classes
    * `GObjectClass.dispose()` runs, or alternatively in
    * [signal@Gtk.Widget::destroy].
    *
    * If @internal_child is specified, [vfunc@Gtk.Buildable.get_internal_child]
    * will be automatically implemented by the `GtkWidget` class so there is no
    * need to implement it manually.
    *
    * The wrapper macros [func@Gtk.widget_class_bind_template_child],
    * [func@Gtk.widget_class_bind_template_child_internal],
    * [func@Gtk.widget_class_bind_template_child_private] and
    * [func@Gtk.widget_class_bind_template_child_internal_private] might be more
    * convenient to use.
    *
    * Note that this must be called from a composite widget classes class
    * initializer after calling [method@Gtk.WidgetClass.set_template].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bindTemplateChildFull(
      name: scala.Predef.String /* Some(CString) */,
      internal_child: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      struct_offset: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */
  )(using Zone): Unit /* None */ =
    gtk_widget_class_bind_template_child_full(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      toCString(name),
      gboolean(gint((if internal_child == true then 1 else 0))),
      gssize(struct_offset)
    )
  end bindTemplateChildFull

  /** Retrieves the accessible role used by the given `GtkWidget` class.
    *
    * Different accessible roles have different states, and are rendered
    * differently by assistive technologies.
    *
    * See also: [method@Gtk.Accessible.get_accessible_role].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleRole(): sn.gnome.gtk4.AccessibleRole /* None */ =
    sn.gnome.gtk4.AccessibleRole.fromRaw(
      gtk_widget_class_get_accessible_role(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]]
      )
    )
  end getAccessibleRole

  /** Retrieves the signal id for the activation signal.
    *
    * the activation signal is set using
    * [method@Gtk.WidgetClass.set_activate_signal].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivateSignal(): UInt /* None */ =
    gtk_widget_class_get_activate_signal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]]
    ).value
  end getActivateSignal

  /** Gets the name used by this class for matching in CSS code.
    *
    * See [method@Gtk.WidgetClass.set_css_name] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCssName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_widget_class_get_css_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]]
      ).asInstanceOf
    )
  end getCssName

  /** Retrieves the type of the [class@Gtk.LayoutManager] used by widgets of
    * class @widget_class.
    *
    * See also: [method@Gtk.WidgetClass.set_layout_manager_type].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayoutManagerType(): GType /* None */ =
    gtk_widget_class_get_layout_manager_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]]
    )
  end getLayoutManagerType

  /** This should be called at class initialization time to specify actions to
    * be added for all instances of this class.
    *
    * Actions installed by this function are stateless. The only state they have
    * is whether they are enabled or not (which can be changed with
    * [method@Gtk.Widget.action_set_enabled]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method install_action/<method parameters>/activate]: Cannot render type Type(List(),ListMap(@name -> DataRecord(WidgetActionActivateFunc), @type -> DataRecord(GtkWidgetActionActivateFunc)))"
  )
  private def installAction__ = ???

  /** Installs an action called @action_name on @widget_class and binds its
    * state to the value of the @property_name property.
    *
    * This function will perform a few sanity checks on the property selected
    * via @property_name. Namely, the property must exist, must be readable,
    * writable and must not be construct-only. There are also restrictions on
    * the type of the given property, it must be boolean, int, unsigned int,
    * double or string. If any of these conditions are not met, a critical
    * warning will be printed and no action will be added.
    *
    * The state type of the action matches the property type.
    *
    * If the property is boolean, the action will have no parameter and toggle
    * the property value. Otherwise, the action will have a parameter of the
    * same type as the property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def installPropertyAction(
      action_name: scala.Predef.String /* Some(CString) */,
      property_name: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_widget_class_install_property_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      toCString(action_name),
      toCString(property_name)
    )
  end installPropertyAction

  /** Returns details about the @index_-th action that has been installed for @widget_class
    * during class initialization.
    *
    * See [method@Gtk.WidgetClass.install_action] for details on how to install
    * actions.
    *
    * Note that this function will also return actions defined by parent
    * classes. You can identify those by looking at @owner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_action]: Method query_action contains an OUT parameter, which is not supported yet"
  )
  private def queryAction__ = ???

  /** Sets the accessible role used by the given `GtkWidget` class.
    *
    * Different accessible roles have different states, and are rendered
    * differently by assistive technologies.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccessibleRole(
      accessible_role: sn.gnome.gtk4.AccessibleRole /* Some(GtkAccessibleRole) */
  ): Unit /* None */ =
    gtk_widget_class_set_accessible_role(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      accessible_role.raw
    )
  end setAccessibleRole

  /** Sets the `GtkWidgetClass.activate_signal` field with the given @signal_id.
    *
    * The signal will be emitted when calling [method@Gtk.Widget.activate].
    *
    * The @signal_id must have been registered with `g_signal_new()` or
    * g_signal_newv() before calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivateSignal(
      signal_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_widget_class_set_activate_signal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      guint(signal_id)
    )
  end setActivateSignal

  /** Sets the `GtkWidgetClass.activate_signal` field with the signal id for the
    * given @signal_name.
    *
    * The signal will be emitted when calling [method@Gtk.Widget.activate].
    *
    * The @signal_name of @widget_type must have been registered with
    * g_signal_new() or g_signal_newv() before calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivateSignalFromName(
      signal_name: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_widget_class_set_activate_signal_from_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      toCString(signal_name)
    )
  end setActivateSignalFromName

  /** Sets the name to be used for CSS matching of widgets.
    *
    * If this function is not called for a given class, the name set on the
    * parent class is used. By default, `GtkWidget` uses the name "widget".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCssName(
      name: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_widget_class_set_css_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      toCString(name)
    )
  end setCssName

  /** Sets the type to be used for creating layout managers for widgets of @widget_class.
    *
    * The given @type must be a subtype of [class@Gtk.LayoutManager].
    *
    * This function should only be called from class init functions of widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLayoutManagerType(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */
  ): Unit /* None */ =
    gtk_widget_class_set_layout_manager_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      `type`
    )
  end setLayoutManagerType

  /** This should be called at class initialization time to specify the
    * `GtkBuilder` XML to be used to extend a widget.
    *
    * For convenience, [method@Gtk.WidgetClass.set_template_from_resource] is
    * also provided.
    *
    * Note that any class that installs templates must call
    * [method@Gtk.Widget.init_template] in the widget’s instance initializer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTemplate(
      template_bytes: sn.gnome.glib.Bytes /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  ): Unit /* None */ =
    gtk_widget_class_set_template(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      template_bytes.getUnsafeRawPointer().asInstanceOf
    )
  end setTemplate

  /** A convenience function that calls [method@Gtk.WidgetClass.set_template]
    * with the contents of a `GResource`.
    *
    * Note that any class that installs templates must call
    * [method@Gtk.Widget.init_template] in the widget’s instance initializer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTemplateFromResource(
      resource_name: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_widget_class_set_template_from_resource(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      toCString(resource_name)
    )
  end setTemplateFromResource

  /** For use in language bindings, this will override the default
    * `GtkBuilderScope` to be used when parsing GtkBuilder XML from this class’s
    * template data.
    *
    * Note that this must be called from a composite widget classes class
    * initializer after calling [method@Gtk.WidgetClass.set_template].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTemplateScope(
      scope: sn.gnome.gtk4.BuilderScope /* Some(Ptr[GtkBuilderScope]) */
  ): Unit /* None */ =
    gtk_widget_class_set_template_scope(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidgetClass]],
      scope.getUnsafeRawPointer().asInstanceOf
    )
  end setTemplateScope

end WidgetClass

object WidgetClass:
  def fromRaw(ptr: Ptr[GtkWidgetClass]): WidgetClass = new WidgetClass(ptr)
end WidgetClass

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.{Clipboard, Cursor, Display, FrameClock}
import sn.gnome.gio.{ActionGroup, ListModel}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.{InitiallyUnowned, Object}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GType,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Align,
  Buildable,
  ConstraintTarget,
  DirectionType,
  EventController,
  LayoutManager,
  Native,
  Orientation,
  Overflow,
  PickFlags,
  Root,
  Settings,
  SizeRequestMode,
  Snapshot,
  StateFlags,
  StyleContext,
  TextDirection,
  Tooltip,
  Widget
}
import sn.gnome.gtk4.internal.{
  GtkDirectionType,
  GtkStateFlags,
  GtkTextDirection,
  GtkTooltip,
  GtkWidget
}
import sn.gnome.pango.{Context, FontMap, Layout}
import sn.gnome.runtime.*

/** The base class for all widgets.
  *
  * `GtkWidget` is the base class all widgets in GTK derive from. It manages the
  * widget lifecycle, layout, states and style.
  *
  * ### Height-for-width Geometry Management
  *
  * GTK uses a height-for-width (and width-for-height) geometry management
  * system. Height-for-width means that a widget can change how much vertical
  * space it needs, depending on the amount of horizontal space that it is given
  * (and similar for width-for-height). The most common example is a label that
  * reflows to fill up the available width, wraps to fewer lines, and therefore
  * needs less height.
  *
  * Height-for-width geometry management is implemented in GTK by way of two
  * virtual methods:
  *
  *   - [vfunc@Gtk.Widget.get_request_mode]
  *   - [vfunc@Gtk.Widget.measure]
  *
  * There are some important things to keep in mind when implementing
  * height-for-width and when using it in widget implementations.
  *
  * If you implement a direct `GtkWidget` subclass that supports
  * height-for-width or width-for-height geometry management for itself or its
  * child widgets, the [vfunc@Gtk.Widget.get_request_mode] virtual function must
  * be implemented as well and return the widget's preferred request mode. The
  * default implementation of this virtual function returns
  * %GTK_SIZE_REQUEST_CONSTANT_SIZE, which means that the widget will only ever
  * get -1 passed as the for_size value to its [vfunc@Gtk.Widget.measure]
  * implementation.
  *
  * The geometry management system will query a widget hierarchy in only one
  * orientation at a time. When widgets are initially queried for their minimum
  * sizes it is generally done in two initial passes in the
  * [enum@Gtk.SizeRequestMode] chosen by the toplevel.
  *
  * For example, when queried in the normal %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH
  * mode:
  *
  * First, the default minimum and natural width for each widget in the
  * interface will be computed using [method@Gtk.Widget.measure] with an
  * orientation of %GTK_ORIENTATION_HORIZONTAL and a for_size of -1. Because the
  * preferred widths for each widget depend on the preferred widths of their
  * children, this information propagates up the hierarchy, and finally a
  * minimum and natural width is determined for the entire toplevel. Next, the
  * toplevel will use the minimum width to query for the minimum height
  * contextual to that width using [method@Gtk.Widget.measure] with an
  * orientation of %GTK_ORIENTATION_VERTICAL and a for_size of the just computed
  * width. This will also be a highly recursive operation. The minimum height
  * for the minimum width is normally used to set the minimum size constraint on
  * the toplevel.
  *
  * After the toplevel window has initially requested its size in both
  * dimensions it can go on to allocate itself a reasonable size (or a size
  * previously specified with [method@Gtk.Window.set_default_size]). During the
  * recursive allocation process it’s important to note that request cycles will
  * be recursively executed while widgets allocate their children. Each widget,
  * once allocated a size, will go on to first share the space in one
  * orientation among its children and then request each child's height for its
  * target allocated width or its width for allocated height, depending. In this
  * way a `GtkWidget` will typically be requested its size a number of times
  * before actually being allocated a size. The size a widget is finally
  * allocated can of course differ from the size it has requested. For this
  * reason, `GtkWidget` caches a small number of results to avoid re-querying
  * for the same sizes in one allocation cycle.
  *
  * If a widget does move content around to intelligently use up the allocated
  * size then it must support the request in both `GtkSizeRequestMode`s even if
  * the widget in question only trades sizes in a single orientation.
  *
  * For instance, a [class@Gtk.Label] that does height-for-width word wrapping
  * will not expect to have [vfunc@Gtk.Widget.measure] with an orientation of
  * %GTK_ORIENTATION_VERTICAL called because that call is specific to a
  * width-for-height request. In this case the label must return the height
  * required for its own minimum possible width. By following this rule any
  * widget that handles height-for-width or width-for-height requests will
  * always be allocated at least enough space to fit its own content.
  *
  * Here are some examples of how a %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH widget
  * generally deals with width-for-height requests:
  *
  * ```c
  * static void
  * foo_widget_measure (GtkWidget      *widget,
  *                     GtkOrientation  orientation,
  *                     int             for_size,
  *                     int            *minimum_size,
  *                     int            *natural_size,
  *                     int            *minimum_baseline,
  *                     int            *natural_baseline)
  * {
  *   if (orientation == GTK_ORIENTATION_HORIZONTAL)
  *     {
  *       // Calculate minimum and natural width
  *     }
  *   else // VERTICAL
  *     {
  *       if (i_am_in_height_for_width_mode)
  *         {
  *           int min_width, dummy;
  *
  *           // First, get the minimum width of our widget
  *           GTK_WIDGET_GET_CLASS (widget)->measure (widget, GTK_ORIENTATION_HORIZONTAL, -1,
  *                                                   &min_width, &dummy, &dummy, &dummy);
  *
  *           // Now use the minimum width to retrieve the minimum and natural height to display
  *           // that width.
  *           GTK_WIDGET_GET_CLASS (widget)->measure (widget, GTK_ORIENTATION_VERTICAL, min_width,
  *                                                   minimum_size, natural_size, &dummy, &dummy);
  *         }
  *       else
  *         {
  *           // ... some widgets do both.
  *         }
  *     }
  * }
  * ```
  *
  * Often a widget needs to get its own request during size request or
  * allocation. For example, when computing height it may need to also compute
  * width. Or when deciding how to use an allocation, the widget may need to
  * know its natural size. In these cases, the widget should be careful to call
  * its virtual methods directly, like in the code example above.
  *
  * It will not work to use the wrapper function [method@Gtk.Widget.measure]
  * inside your own [vfunc@Gtk.Widget.size_allocate] implementation. These
  * return a request adjusted by [class@Gtk.SizeGroup], the widget's align and
  * expand flags, as well as its CSS style.
  *
  * If a widget used the wrappers inside its virtual method implementations,
  * then the adjustments (such as widget margins) would be applied twice. GTK
  * therefore does not allow this and will warn if you try to do it.
  *
  * Of course if you are getting the size request for another widget, such as a
  * child widget, you must use [method@Gtk.Widget.measure]; otherwise, you would
  * not properly consider widget margins, [class@Gtk.SizeGroup], and so forth.
  *
  * GTK also supports baseline vertical alignment of widgets. This means that
  * widgets are positioned such that the typographical baseline of widgets in
  * the same row are aligned. This happens if a widget supports baselines, has a
  * vertical alignment using baselines, and is inside a widget that supports
  * baselines and has a natural “row” that it aligns to the baseline, or a
  * baseline assigned to it by the grandparent.
  *
  * Baseline alignment support for a widget is also done by the
  * [vfunc@Gtk.Widget.measure] virtual function. It allows you to report both a
  * minimum and natural size.
  *
  * If a widget ends up baseline aligned it will be allocated all the space in
  * the parent as if it was %GTK_ALIGN_FILL, but the selected baseline can be
  * found via [method@Gtk.Widget.get_baseline]. If the baseline has a value
  * other than -1 you need to align the widget such that the baseline appears at
  * the position.
  *
  * ### GtkWidget as GtkBuildable
  *
  * The `GtkWidget` implementation of the `GtkBuildable` interface supports
  * various custom elements to specify additional aspects of widgets that are
  * not directly expressed as properties.
  *
  * If the widget uses a [class@Gtk.LayoutManager], `GtkWidget` supports a
  * custom `<layout>` element, used to define layout properties:
  *
  * ```xml
  * <object class="GtkGrid" id="my_grid">
  *   <child>
  *     <object class="GtkLabel" id="label1">
  *       <property name="label">Description</property>
  *       <layout>
  *         <property name="column">0</property>
  *         <property name="row">0</property>
  *         <property name="row-span">1</property>
  *         <property name="column-span">1</property>
  *       </layout>
  *     </object>
  *   </child>
  *   <child>
  *     <object class="GtkEntry" id="description_entry">
  *       <layout>
  *         <property name="column">1</property>
  *         <property name="row">0</property>
  *         <property name="row-span">1</property>
  *         <property name="column-span">1</property>
  *       </layout>
  *     </object>
  *   </child>
  * </object>
  * ```
  *
  * `GtkWidget` allows style information such as style classes to be associated
  * with widgets, using the custom `<style>` element:
  *
  * ```xml
  * <object class="GtkButton" id="button1">
  *   <style>
  *     <class name="my-special-button-class"/>
  *     <class name="dark-button"/>
  *   </style>
  * </object>
  * ```
  *
  * `GtkWidget` allows defining accessibility information, such as properties,
  * relations, and states, using the custom `<accessibility>` element:
  *
  * ```xml
  * <object class="GtkButton" id="button1">
  *   <accessibility>
  *     <property name="label">Download</property>
  *     <relation name="labelled-by">label1</relation>
  *   </accessibility>
  * </object>
  * ```
  *
  * ### Building composite widgets from template XML
  *
  * `GtkWidget `exposes some facilities to automate the procedure of creating
  * composite widgets using "templates".
  *
  * To create composite widgets with `GtkBuilder` XML, one must associate the
  * interface description with the widget class at class initialization time
  * using [method@Gtk.WidgetClass.set_template].
  *
  * The interface description semantics expected in composite template
  * descriptions is slightly different from regular [class@Gtk.Builder] XML.
  *
  * Unlike regular interface descriptions, [method@Gtk.WidgetClass.set_template]
  * will expect a `<template>` tag as a direct child of the toplevel
  * `<interface>` tag. The `<template>` tag must specify the “class” attribute
  * which must be the type name of the widget. Optionally, the “parent”
  * attribute may be specified to specify the direct parent type of the widget
  * type; this is ignored by `GtkBuilder` but can be used by UI design tools to
  * introspect what kind of properties and internal children exist for a given
  * type when the actual type does not exist.
  *
  * The XML which is contained inside the `<template>` tag behaves as if it were
  * added to the `<object>` tag defining the widget itself. You may set
  * properties on a widget by inserting `<property>` tags into the `<template>`
  * tag, and also add `<child>` tags to add children and extend a widget in the
  * normal way you would with `<object>` tags.
  *
  * Additionally, `<object>` tags can also be added before and after the initial
  * `<template>` tag in the normal way, allowing one to define auxiliary objects
  * which might be referenced by other widgets declared as children of the
  * `<template>` tag.
  *
  * An example of a template definition:
  *
  * ```xml
  * <interface>
  *   <template class="FooWidget" parent="GtkBox">
  *     <property name="orientation">horizontal</property>
  *     <property name="spacing">4</property>
  *     <child>
  *       <object class="GtkButton" id="hello_button">
  *         <property name="label">Hello World</property>
  *         <signal name="clicked" handler="hello_button_clicked" object="FooWidget" swapped="yes"/>
  *       </object>
  *     </child>
  *     <child>
  *       <object class="GtkButton" id="goodbye_button">
  *         <property name="label">Goodbye World</property>
  *       </object>
  *     </child>
  *   </template>
  * </interface>
  * ```
  *
  * Typically, you'll place the template fragment into a file that is bundled
  * with your project, using `GResource`. In order to load the template, you
  * need to call [method@Gtk.WidgetClass.set_template_from_resource] from the
  * class initialization of your `GtkWidget` type:
  *
  * ```c
  * static void
  * foo_widget_class_init (FooWidgetClass *klass)
  * {
  *   // ...
  *
  *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
  *                                                "/com/example/ui/foowidget.ui");
  * }
  * ```
  *
  * You will also need to call [method@Gtk.Widget.init_template] from the
  * instance initialization function:
  *
  * ```c
  * static void
  * foo_widget_init (FooWidget *self)
  * {
  *   gtk_widget_init_template (GTK_WIDGET (self));
  *
  *   // Initialize the rest of the widget...
  * }
  * ```
  *
  * as well as calling [method@Gtk.Widget.dispose_template] from the dispose
  * function:
  *
  * ```c
  * static void
  * foo_widget_dispose (GObject *gobject)
  * {
  *   FooWidget *self = FOO_WIDGET (gobject);
  *
  *   // Dispose objects for which you have a reference...
  *
  *   // Clear the template children for this widget type
  *   gtk_widget_dispose_template (GTK_WIDGET (self), FOO_TYPE_WIDGET);
  *
  *   G_OBJECT_CLASS (foo_widget_parent_class)->dispose (gobject);
  * }
  * ```
  *
  * You can access widgets defined in the template using the
  * [method@Gtk.Widget.get_template_child] function, but you will typically
  * declare a pointer in the instance private data structure of your type using
  * the same name as the widget in the template definition, and call
  * [method@Gtk.WidgetClass.bind_template_child_full] (or one of its wrapper
  * macros [func@Gtk.widget_class_bind_template_child] and
  * [func@Gtk.widget_class_bind_template_child_private]) with that name, e.g.
  *
  * ```c
  * typedef struct {
  *   GtkWidget *hello_button;
  *   GtkWidget *goodbye_button;
  * } FooWidgetPrivate;
  *
  * G_DEFINE_TYPE_WITH_PRIVATE (FooWidget, foo_widget, GTK_TYPE_BOX)
  *
  * static void
  * foo_widget_dispose (GObject *gobject)
  * {
  *   gtk_widget_dispose_template (GTK_WIDGET (gobject), FOO_TYPE_WIDGET);
  *
  *   G_OBJECT_CLASS (foo_widget_parent_class)->dispose (gobject);
  * }
  *
  * static void
  * foo_widget_class_init (FooWidgetClass *klass)
  * {
  *   // ...
  *   G_OBJECT_CLASS (klass)->dispose = foo_widget_dispose;
  *
  *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
  *                                                "/com/example/ui/foowidget.ui");
  *   gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
  *                                                 FooWidget, hello_button);
  *   gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
  *                                                 FooWidget, goodbye_button);
  * }
  *
  * static void
  * foo_widget_init (FooWidget *widget)
  * {
  *   gtk_widget_init_template (GTK_WIDGET (widget));
  * }
  * ```
  *
  * You can also use [method@Gtk.WidgetClass.bind_template_callback_full] (or is
  * wrapper macro [func@Gtk.widget_class_bind_template_callback]) to connect a
  * signal callback defined in the template with a function visible in the scope
  * of the class, e.g.
  *
  * ```c
  * // the signal handler has the instance and user data swapped
  * // because of the swapped="yes" attribute in the template XML
  * static void
  * hello_button_clicked (FooWidget *self,
  *                       GtkButton *button)
  * {
  *   g_print ("Hello, world!\n");
  * }
  *
  * static void
  * foo_widget_class_init (FooWidgetClass *klass)
  * {
  *   // ...
  *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
  *                                                "/com/example/ui/foowidget.ui");
  *   gtk_widget_class_bind_template_callback (GTK_WIDGET_CLASS (klass), hello_button_clicked);
  * }
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Widget private[gnome] (raw: Ptr[GtkWidget])
    extends InitiallyUnowned(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Enable or disable an action installed with
    * gtk_widget_class_install_action().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def actionSetEnabled(
      action_name: String /* Some(CString) */,
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ =
    gtk_widget_action_set_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      toCString(action_name),
      gboolean(gint((if enabled == true then 1 else 0)))
    )
  end actionSetEnabled

  /** For widgets that can be “activated” (buttons, menu items, etc.), this
    * function activates them.
    *
    * The activation will emit the signal set using
    * [method@Gtk.WidgetClass.set_activate_signal] during class initialization.
    *
    * Activation is what happens when you press <kbd>Enter</kbd> on a widget
    * during key navigation.
    *
    * If you wish to handle the activation keybinding yourself, it is
    * recommended to use [method@Gtk.WidgetClass.add_shortcut] with an action
    * created with [ctor@Gtk.SignalAction.new].
    *
    * If @widget isn't activatable, the function returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def activate(): Boolean /* None */ =
    gtk_widget_activate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end activate

  /** Looks up the action in the action groups associated with @widget and its
    * ancestors, and activates it.
    *
    * This is a wrapper around [method@Gtk.Widget.activate_action_variant] that
    * constructs the @args variant according to @format_string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate_action/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def activateAction__ = ???

  /** Looks up the action in the action groups associated with
    * @widget
    *   and its ancestors, and activates it.
    *
    * If the action is in an action group added with
    * [method@Gtk.Widget.insert_action_group], the @name is expected to be
    * prefixed with the prefix that was used when the group was inserted.
    *
    * The arguments must match the actions expected parameter type, as returned
    * by `g_action_get_parameter_type()`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate_action_variant/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def activateActionVariant__ = ???

  /** Activates the `default.activate` action from @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def activateDefault(): Unit /* None */ =
    gtk_widget_activate_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end activateDefault

  /** Adds @controller to @widget so that it will receive events.
    *
    * You will usually want to call this function right after creating any kind
    * of [class@Gtk.EventController].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addController(
      controller: sn.gnome.gtk4.EventController /* Some(Ptr[GtkEventController]) */
  )(using Runtime): Unit /* None */ =
    gtk_widget_add_controller(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      controller.getUnsafeRawPointer().asInstanceOf
    )
  end addController

  /** Adds a style class to @widget.
    *
    * After calling this function, the widget’s style will match for @css_class,
    * according to CSS matching rules.
    *
    * Use [method@Gtk.Widget.remove_css_class] to remove the style again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addCssClass(
      css_class: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_widget_add_css_class(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      toCString(css_class)
    )
  end addCssClass

  /** Adds a widget to the list of mnemonic labels for this widget.
    *
    * See [method@Gtk.Widget.list_mnemonic_labels]. Note the list of mnemonic
    * labels for the widget is cleared when the widget is destroyed, so the
    * caller must make sure to update its internal state at this point as well.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMnemonicLabel(
      label: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_widget_add_mnemonic_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      label.getUnsafeRawPointer().asInstanceOf
    )
  end addMnemonicLabel

  /** Queues an animation frame update and adds a callback to be called before
    * each frame.
    *
    * Until the tick callback is removed, it will be called frequently (usually
    * at the frame rate of the output device or as quickly as the application
    * can be repainted, whichever is slower). For this reason, is most suitable
    * for handling graphics that change every frame or every few frames. The
    * tick callback does not automatically imply a relayout or repaint. If you
    * want a repaint or relayout, and aren’t changing widget properties that
    * would trigger that (for example, changing the text of a `GtkLabel`), then
    * you will have to call [method@Gtk.Widget.queue_resize] or
    * [method@Gtk.Widget.queue_draw] yourself.
    *
    * [method@Gdk.FrameClock.get_frame_time] should generally be used for timing
    * continuous animations and
    * [method@Gdk.FrameTimings.get_predicted_presentation_time] if you are
    * trying to display isolated frames at particular times.
    *
    * This is a more convenient alternative to connecting directly to the
    * [signal@Gdk.FrameClock::update] signal of `GdkFrameClock`, since you don't
    * have to worry about when a `GdkFrameClock` is assigned to a widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_tick_callback/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TickCallback), @type -> DataRecord(GtkTickCallback)))"
  )
  private def addTickCallback__ = ???

  /** This function is only used by `GtkWidget` subclasses, to assign a size,
    * position and (optionally) baseline to their child widgets.
    *
    * In this function, the allocation and baseline may be adjusted. The given
    * allocation will be forced to be bigger than the widget's minimum size, as
    * well as at least 0×0 in size.
    *
    * For a version that does not take a transform, see
    * [method@Gtk.Widget.size_allocate].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method allocate/<method parameters>/transform]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def allocate__ = ???

  /** Called by widgets as the user moves around the window using keyboard
    * shortcuts.
    *
    * The @direction argument indicates what kind of motion is taking place (up,
    * down, left, right, tab forward, tab backward).
    *
    * This function calls the [vfunc@Gtk.Widget.focus] virtual function; widgets
    * can override the virtual function in order to implement appropriate focus
    * behavior.
    *
    * The default `focus()` virtual function for a widget should return `TRUE`
    * if moving in @direction left the focus on a focusable location inside that
    * widget, and `FALSE` if moving in @direction moved the focus outside the
    * widget. When returning `TRUE`, widgets normally call
    * [method@Gtk.Widget.grab_focus] to place the focus accordingly; when
    * returning `FALSE`, they don’t modify the current focus location.
    *
    * This function is used by custom widget implementations; if you're writing
    * an app, you’d use [method@Gtk.Widget.grab_focus] to move the focus to a
    * particular widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def childFocus(
      direction: DirectionType /* Some(GtkDirectionType) */
  ): Boolean /* None */ =
    gtk_widget_child_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      direction.raw
    ).value.!=(0)
  end childFocus

  /** Computes the bounds for @widget in the coordinate space of @target.
    *
    * The bounds of widget are (the bounding box of) the region that it is
    * expected to draw in. See the [coordinate system](coordinates.html)
    * overview to learn more.
    *
    * If the operation is successful, %TRUE is returned. If @widget has no
    * bounds or the bounds cannot be expressed in @target's coordinate space
    * (for example if both widgets are in different windows), %FALSE is returned
    * and @bounds is set to the zero rectangle.
    *
    * It is valid for @widget and @target to be the same widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method compute_bounds]: Method compute_bounds contains an OUT parameter, which is not supported yet"
  )
  private def computeBounds__ = ???

  /** Computes whether a container should give this widget extra space when
    * possible.
    *
    * Containers should check this, rather than looking at
    * [method@Gtk.Widget.get_hexpand] or [method@Gtk.Widget.get_vexpand].
    *
    * This function already checks whether the widget is visible, so visibility
    * does not need to be checked separately. Non-visible widgets are not
    * expanded.
    *
    * The computed expand value uses either the expand setting explicitly set on
    * the widget itself, or, if none has been explicitly set, the widget may
    * expand if some of its children do.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def computeExpand(
      orientation: Orientation /* Some(GtkOrientation) */
  ): Boolean /* None */ =
    gtk_widget_compute_expand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      orientation.raw
    ).value.!=(0)
  end computeExpand

  /** Translates the given @point in @widget's coordinates to coordinates
    * relative to @target’s coordinate system.
    *
    * In order to perform this operation, both widgets must share a common
    * ancestor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method compute_point]: Method compute_point contains an OUT parameter, which is not supported yet"
  )
  private def computePoint__ = ???

  /** Computes a matrix suitable to describe a transformation from
    * @widget's
    *   coordinate system into @target's coordinate system.
    *
    * The transform can not be computed in certain cases, for example when @widget
    * and @target do not share a common ancestor. In that case @out_transform
    * gets set to the identity matrix.
    *
    * To learn more about widget coordinate systems, see the coordinate system
    * [overview](coordinates.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method compute_transform]: Method compute_transform contains an OUT parameter, which is not supported yet"
  )
  private def computeTransform__ = ???

  /** Tests if the point at (@x, @y) is contained in @widget.
    *
    * The coordinates for (@x, @y) must be in widget coordinates, so (0, 0) is
    * assumed to be the top left of @widget's content area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contains(
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */
  ): Boolean /* None */ =
    gtk_widget_contains(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      x,
      y
    ).value.!=(0)
  end contains

  /** Creates a new `PangoContext` with the appropriate font map, font options,
    * font description, and base direction for drawing text for this widget.
    *
    * See also [method@Gtk.Widget.get_pango_context].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createPangoContext()(using Runtime): sn.gnome.pango.Context /* None */ =
    sn.gnome.pango.Context.applyUnsafe(
      gtk_widget_create_pango_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end createPangoContext

  /** Creates a new `PangoLayout` with the appropriate font map, font
    * description, and base direction for drawing text for this widget.
    *
    * If you keep a `PangoLayout` created in this way around, you need to
    * re-create it when the widget `PangoContext` is replaced. This can be
    * tracked by listening to changes of the [property@Gtk.Widget:root] property
    * on the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createPangoLayout(
      text: Option[String /* Some(CString) */ ]
  )(using Zone, Runtime): sn.gnome.pango.Layout /* None */ =
    sn.gnome.pango.Layout.applyUnsafe(
      gtk_widget_create_pango_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
        text
          .map[CString](o => toCString(o))
          .getOrElse(null.asInstanceOf[CString])
      ).asInstanceOf
    )
  end createPangoLayout

  /** Clears the template children for the given widget.
    *
    * This function is the opposite of [method@Gtk.Widget.init_template], and it
    * is used to clear all the template children from a widget instance. If you
    * bound a template child to a field in the instance structure, or in the
    * instance private data structure, the field will be set to `NULL` after
    * this function returns.
    *
    * You should call this function inside the `GObjectClass.dispose()`
    * implementation of any widget that called `gtk_widget_init_template()`.
    * Typically, you will want to call this function last, right before chaining
    * up to the parent type's dispose implementation, e.g.
    *
    * ```c
    * static void
    * some_widget_dispose (GObject *gobject)
    * {
    *   SomeWidget *self = SOME_WIDGET (gobject);
    *
    *   // Clear the template data for SomeWidget
    *   gtk_widget_dispose_template (GTK_WIDGET (self), SOME_TYPE_WIDGET);
    *
    *   G_OBJECT_CLASS (some_widget_parent_class)->dispose (gobject);
    * }
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def disposeTemplate(
      widget_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */
  ): Unit /* None */ =
    gtk_widget_dispose_template(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      widget_type
    )
  end disposeTemplate

  /** Checks to see if a drag movement has passed the GTK drag threshold.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dragCheckThreshold(
      start_x: Int /* Some(CInt) */,
      start_y: Int /* Some(CInt) */,
      current_x: Int /* Some(CInt) */,
      current_y: Int /* Some(CInt) */
  ): Boolean /* None */ =
    gtk_drag_check_threshold(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      start_x,
      start_y,
      current_x,
      current_y
    ).value.!=(0)
  end dragCheckThreshold

  /** Notifies the user about an input-related error on this widget.
    *
    * If the [property@Gtk.Settings:gtk-error-bell] setting is %TRUE, it calls
    * [method@Gdk.Surface.beep], otherwise it does nothing.
    *
    * Note that the effect of [method@Gdk.Surface.beep] can be configured in
    * many ways, depending on the windowing backend and the desktop environment
    * or window manager that is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def errorBell(): Unit /* None */ =
    gtk_widget_error_bell(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end errorBell

  /** Returns the baseline that has currently been allocated to @widget.
    *
    * This function is intended to be used when implementing handlers for the
    * `GtkWidget`Class.snapshot() function, and when allocating child widgets in
    * `GtkWidget`Class.size_allocate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAllocatedBaseline(): Int /* None */ =
    gtk_widget_get_allocated_baseline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getAllocatedBaseline

  /** Returns the height that has currently been allocated to @widget.
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAllocatedHeight(): Int /* None */ =
    gtk_widget_get_allocated_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getAllocatedHeight

  /** Returns the width that has currently been allocated to @widget.
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAllocatedWidth(): Int /* None */ =
    gtk_widget_get_allocated_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getAllocatedWidth

  /** Retrieves the widget’s allocation.
    *
    * Note, when implementing a layout container: a widget’s allocation will be
    * its “adjusted” allocation, that is, the widget’s parent typically calls
    * [method@Gtk.Widget.size_allocate] with an allocation, and that allocation
    * is then adjusted (to handle margin and alignment for example) before
    * assignment to the widget. [method@Gtk.Widget.get_allocation] returns the
    * adjusted allocation that was actually assigned to the widget. The adjusted
    * allocation is guaranteed to be completely contained within the
    * [method@Gtk.Widget.size_allocate] allocation, however.
    *
    * So a layout container is guaranteed that its children stay inside the
    * assigned bounds, but not that they have exactly the bounds the container
    * assigned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_allocation]: Method get_allocation contains an OUT parameter, which is not supported yet"
  )
  private def getAllocation__ = ???

  /** Gets the first ancestor of @widget with type @widget_type.
    *
    * For example, `gtk_widget_get_ancestor (widget, GTK_TYPE_BOX)` gets the
    * first `GtkBox` that’s an ancestor of @widget. No reference will be added
    * to the returned widget; it should not be unreferenced.
    *
    * Note that unlike [method@Gtk.Widget.is_ancestor], this function considers @widget
    * to be an ancestor of itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAncestor(
      widget_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */
  )(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_get_ancestor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
        widget_type
      ).asInstanceOf
    )
  end getAncestor

  /** Returns the baseline that has currently been allocated to @widget.
    *
    * This function is intended to be used when implementing handlers for the
    * `GtkWidget`Class.snapshot() function, and when allocating child widgets in
    * `GtkWidget`Class.size_allocate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseline(): Int /* None */ =
    gtk_widget_get_baseline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getBaseline

  /** Determines whether the input focus can enter @widget or any of its
    * children.
    *
    * See [method@Gtk.Widget.set_focusable].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanFocus(): Boolean /* None */ =
    gtk_widget_get_can_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getCanFocus

  /** Queries whether @widget can be the target of pointer events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanTarget(): Boolean /* None */ =
    gtk_widget_get_can_target(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getCanTarget

  /** Gets the value set with gtk_widget_set_child_visible().
    *
    * If you feel a need to use this function, your code probably needs
    * reorganization.
    *
    * This function is only useful for container implementations and should
    * never be called by an application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildVisible(): Boolean /* None */ =
    gtk_widget_get_child_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getChildVisible

  /** Gets the clipboard object for @widget.
    *
    * This is a utility function to get the clipboard object for the
    * `GdkDisplay` that @widget is using.
    *
    * Note that this function always works, even when @widget is not realized
    * yet.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClipboard()(using Runtime): sn.gnome.gdk4.Clipboard /* None */ =
    sn.gnome.gdk4.Clipboard.applyUnsafe(
      gtk_widget_get_clipboard(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getClipboard

  /** Gets the current foreground color for the widget’s CSS style.
    *
    * This function should only be used in snapshot implementations that need to
    * do custom drawing with the foreground color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color]: Method get_color contains an OUT parameter, which is not supported yet"
  )
  private def getColor__ = ???

  /** Returns the list of style classes applied to @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCssClasses()(using Zone): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_widget_get_css_classes(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
        )
      )
      .map(fromCString(_))
  end getCssClasses

  /** Returns the CSS name that is used for @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCssName()(using Zone): String /* None */ =
    fromCString(
      gtk_widget_get_css_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getCssName

  /** Queries the cursor set on @widget.
    *
    * See [method@Gtk.Widget.set_cursor] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCursor()(using Runtime): sn.gnome.gdk4.Cursor /* None */ =
    sn.gnome.gdk4.Cursor.applyUnsafe(
      gtk_widget_get_cursor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getCursor

  /** Gets the reading direction for a particular widget.
    *
    * See [method@Gtk.Widget.set_direction].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDirection(): TextDirection /* None */ =
    TextDirection.fromRaw(
      gtk_widget_get_direction(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      )
    )
  end getDirection

  /** Get the `GdkDisplay` for the toplevel window associated with this widget.
    *
    * This function can only be called after the widget has been added to a
    * widget hierarchy with a `GtkWindow` at the top.
    *
    * In general, you should only create display specific resources when a
    * widget has been realized, and you should free those resources when the
    * widget is unrealized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_widget_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getDisplay

  /** Returns the widget’s first child.
    *
    * This API is primarily meant for widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFirstChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_get_first_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getFirstChild

  /** Returns the current focus child of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_get_focus_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getFocusChild

  /** Returns whether the widget should grab focus when it is clicked with the
    * mouse.
    *
    * See [method@Gtk.Widget.set_focus_on_click].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusOnClick(): Boolean /* None */ =
    gtk_widget_get_focus_on_click(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getFocusOnClick

  /** Determines whether @widget can own the input focus.
    *
    * See [method@Gtk.Widget.set_focusable].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusable(): Boolean /* None */ =
    gtk_widget_get_focusable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getFocusable

  /** Gets the font map of @widget.
    *
    * See [method@Gtk.Widget.set_font_map].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFontMap()(using Runtime): sn.gnome.pango.FontMap /* None */ =
    sn.gnome.pango.FontMap.applyUnsafe(
      gtk_widget_get_font_map(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getFontMap

  /** Returns the `cairo_font_options_t` of widget.
    *
    * Seee [method@Gtk.Widget.set_font_options].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_font_options/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.FontOptions), @type -> DataRecord(const cairo_font_options_t*)))"
  )
  private def getFontOptions__ = ???

  /** Obtains the frame clock for a widget.
    *
    * The frame clock is a global “ticker” that can be used to drive animations
    * and repaints. The most common reason to get the frame clock is to call
    * [method@Gdk.FrameClock.get_frame_time], in order to get a time to use for
    * animating. For example you might record the start of the animation with an
    * initial value from [method@Gdk.FrameClock.get_frame_time], and then update
    * the animation by calling [method@Gdk.FrameClock.get_frame_time] again
    * during each repaint.
    *
    * [method@Gdk.FrameClock.request_phase] will result in a new frame on the
    * clock, but won’t necessarily repaint any widgets. To repaint a widget, you
    * have to use [method@Gtk.Widget.queue_draw] which invalidates the widget
    * (thus scheduling it to receive a draw on the next frame).
    * gtk_widget_queue_draw() will also end up requesting a frame on the
    * appropriate frame clock.
    *
    * A widget’s frame clock will not change while the widget is mapped.
    * Reparenting a widget (which implies a temporary unmap) can change the
    * widget’s frame clock.
    *
    * Unrealized widgets do not have a frame clock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFrameClock()(using Runtime): sn.gnome.gdk4.FrameClock /* None */ =
    sn.gnome.gdk4.FrameClock.applyUnsafe(
      gtk_widget_get_frame_clock(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getFrameClock

  /** Gets the horizontal alignment of @widget.
    *
    * For backwards compatibility reasons this method will never return one of
    * the baseline alignments, but instead it will convert it to
    * `GTK_ALIGN_FILL` or `GTK_ALIGN_CENTER`.
    *
    * Baselines are not supported for horizontal alignment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHalign(): Align /* None */ =
    Align.fromRaw(
      gtk_widget_get_halign(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      )
    )
  end getHalign

  /** Returns the current value of the `has-tooltip` property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasTooltip(): Boolean /* None */ =
    gtk_widget_get_has_tooltip(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getHasTooltip

  /** Returns the content height of the widget.
    *
    * This function returns the height passed to its size-allocate
    * implementation, which is the height you should be using in
    * [vfunc@Gtk.Widget.snapshot].
    *
    * For pointer events, see [method@Gtk.Widget.contains].
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Int /* None */ =
    gtk_widget_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getHeight

  /** Gets whether the widget would like any available extra horizontal space.
    *
    * When a user resizes a `GtkWindow`, widgets with expand=TRUE generally
    * receive the extra space. For example, a list or scrollable area or
    * document in your window would often be set to expand.
    *
    * Containers should use [method@Gtk.Widget.compute_expand] rather than this
    * function, to see whether a widget, or any of its children, has the expand
    * flag set. If any child of a widget wants to expand, the parent may ask to
    * expand also.
    *
    * This function only looks at the widget’s own hexpand flag, rather than
    * computing whether the entire widget tree rooted at this widget wants to
    * expand.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHexpand(): Boolean /* None */ =
    gtk_widget_get_hexpand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getHexpand

  /** Gets whether gtk_widget_set_hexpand() has been used to explicitly set the
    * expand flag on this widget.
    *
    * If [property@Gtk.Widget:hexpand] property is set, then it overrides any
    * computed expand value based on child widgets. If `hexpand` is not set,
    * then the expand value depends on whether any children of the widget would
    * like to expand.
    *
    * There are few reasons to use this function, but it’s here for completeness
    * and consistency.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHexpandSet(): Boolean /* None */ =
    gtk_widget_get_hexpand_set(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getHexpandSet

  /** Returns the widget’s last child.
    *
    * This API is primarily meant for widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLastChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_get_last_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getLastChild

  /** Retrieves the layout manager used by @widget.
    *
    * See [method@Gtk.Widget.set_layout_manager].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayoutManager()(using
      Runtime
  ): sn.gnome.gtk4.LayoutManager /* None */ =
    sn.gnome.gtk4.LayoutManager.applyUnsafe(
      gtk_widget_get_layout_manager(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getLayoutManager

  /** Whether the widget is mapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMapped(): Boolean /* None */ =
    gtk_widget_get_mapped(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getMapped

  /** Gets the bottom margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMarginBottom(): Int /* None */ =
    gtk_widget_get_margin_bottom(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getMarginBottom

  /** Gets the end margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMarginEnd(): Int /* None */ =
    gtk_widget_get_margin_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getMarginEnd

  /** Gets the start margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMarginStart(): Int /* None */ =
    gtk_widget_get_margin_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getMarginStart

  /** Gets the top margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMarginTop(): Int /* None */ =
    gtk_widget_get_margin_top(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getMarginTop

  /** Retrieves the name of a widget.
    *
    * See [method@Gtk.Widget.set_name] for the significance of widget names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ =
    fromCString(
      gtk_widget_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getName

  /** Returns the nearest `GtkNative` ancestor of @widget.
    *
    * This function will return %NULL if the widget is not contained inside a
    * widget tree with a native ancestor.
    *
    * `GtkNative` widgets will return themselves here.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNative(): Native /* None */ =
    new Native.Abstract(
      gtk_widget_get_native(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getNative

  /** Returns the widget’s next sibling.
    *
    * This API is primarily meant for widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNextSibling()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_get_next_sibling(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getNextSibling

  /** #Fetches the requested opacity for this widget.
    *
    * See [method@Gtk.Widget.set_opacity].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOpacity(): Double /* None */ =
    gtk_widget_get_opacity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getOpacity

  /** Returns the widget’s overflow value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOverflow(): Overflow /* None */ =
    Overflow.fromRaw(
      gtk_widget_get_overflow(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      )
    )
  end getOverflow

  /** Gets a `PangoContext` with the appropriate font map, font description, and
    * base direction for this widget.
    *
    * Unlike the context returned by [method@Gtk.Widget.create_pango_context],
    * this context is owned by the widget (it can be used until the screen for
    * the widget changes or the widget is removed from its toplevel), and will
    * be updated to match any changes to the widget’s attributes. This can be
    * tracked by listening to changes of the [property@Gtk.Widget:root] property
    * on the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPangoContext()(using Runtime): sn.gnome.pango.Context /* None */ =
    sn.gnome.pango.Context.applyUnsafe(
      gtk_widget_get_pango_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getPangoContext

  /** Returns the parent widget of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParent()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_get_parent(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getParent

  /** Retrieves the minimum and natural size of a widget, taking into account
    * the widget’s preference for height-for-width management.
    *
    * This is used to retrieve a suitable size by container widgets which do not
    * impose any restrictions on the child placement. It can be used to deduce
    * toplevel window and menu sizes as well as child widgets in free-form
    * containers such as `GtkFixed`.
    *
    * Handle with care. Note that the natural height of a height-for-width
    * widget will generally be a smaller size than the minimum height, since the
    * required height for the natural width is generally smaller than the
    * required height for the minimum width.
    *
    * Use [method@Gtk.Widget.measure] if you want to support baseline alignment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_preferred_size]: Method get_preferred_size contains an OUT parameter, which is not supported yet"
  )
  private def getPreferredSize__ = ???

  /** Returns the widget’s previous sibling.
    *
    * This API is primarily meant for widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrevSibling()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_get_prev_sibling(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getPrevSibling

  /** Gets the primary clipboard of @widget.
    *
    * This is a utility function to get the primary clipboard object for the
    * `GdkDisplay` that @widget is using.
    *
    * Note that this function always works, even when @widget is not realized
    * yet.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrimaryClipboard()(using Runtime): sn.gnome.gdk4.Clipboard /* None */ =
    sn.gnome.gdk4.Clipboard.applyUnsafe(
      gtk_widget_get_primary_clipboard(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getPrimaryClipboard

  /** Determines whether @widget is realized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRealized(): Boolean /* None */ =
    gtk_widget_get_realized(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getRealized

  /** Determines whether @widget is always treated as the default widget within
    * its toplevel when it has the focus, even if another widget is the default.
    *
    * See [method@Gtk.Widget.set_receives_default].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getReceivesDefault(): Boolean /* None */ =
    gtk_widget_get_receives_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getReceivesDefault

  /** Gets whether the widget prefers a height-for-width layout or a
    * width-for-height layout.
    *
    * Single-child widgets generally propagate the preference of their child,
    * more complex widgets need to request something either in context of their
    * children or in context of their allocation capabilities.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRequestMode(): SizeRequestMode /* None */ =
    SizeRequestMode.fromRaw(
      gtk_widget_get_request_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      )
    )
  end getRequestMode

  /** Returns the `GtkRoot` widget of @widget.
    *
    * This function will return %NULL if the widget is not contained inside a
    * widget tree with a root widget.
    *
    * `GtkRoot` widgets will return themselves here.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRoot(): Root /* None */ =
    new Root.Abstract(
      gtk_widget_get_root(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getRoot

  /** Retrieves the internal scale factor that maps from window coordinates to
    * the actual device pixels.
    *
    * On traditional systems this is 1, on high density outputs, it can be a
    * higher value (typically 2).
    *
    * See [method@Gdk.Surface.get_scale_factor].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScaleFactor(): Int /* None */ =
    gtk_widget_get_scale_factor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getScaleFactor

  /** Returns the widget’s sensitivity.
    *
    * This function returns the value that has been set using
    * [method@Gtk.Widget.set_sensitive]).
    *
    * The effective sensitivity of a widget is however determined by both its
    * own and its parent widget’s sensitivity. See
    * [method@Gtk.Widget.is_sensitive].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSensitive(): Boolean /* None */ =
    gtk_widget_get_sensitive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getSensitive

  /** Gets the settings object holding the settings used for this widget.
    *
    * Note that this function can only be called when the `GtkWidget` is
    * attached to a toplevel, since the settings object is specific to a
    * particular `GdkDisplay`. If you want to monitor the widget for changes in
    * its settings, connect to the `notify::display` signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSettings()(using Runtime): sn.gnome.gtk4.Settings /* None */ =
    sn.gnome.gtk4.Settings.applyUnsafe(
      gtk_widget_get_settings(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getSettings

  /** Returns the content width or height of the widget.
    *
    * Which dimension is returned depends on @orientation.
    *
    * This is equivalent to calling [method@Gtk.Widget.get_width] for
    * %GTK_ORIENTATION_HORIZONTAL or [method@Gtk.Widget.get_height] for
    * %GTK_ORIENTATION_VERTICAL, but can be used when writing
    * orientation-independent code, such as when implementing
    * [iface@Gtk.Orientable] widgets.
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(
      orientation: Orientation /* Some(GtkOrientation) */
  ): Int /* None */ =
    gtk_widget_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      orientation.raw
    )
  end getSize

  /** Gets the size request that was explicitly set for the widget using
    * gtk_widget_set_size_request().
    *
    * A value of -1 stored in @width or @height indicates that that dimension
    * has not been set explicitly and the natural requisition of the widget will
    * be used instead. See [method@Gtk.Widget.set_size_request]. To get the size
    * a widget will actually request, call [method@Gtk.Widget.measure] instead
    * of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_size_request]: Method get_size_request contains an OUT parameter, which is not supported yet"
  )
  private def getSizeRequest__ = ???

  /** Returns the widget state as a flag set.
    *
    * It is worth mentioning that the effective %GTK_STATE_FLAG_INSENSITIVE
    * state will be returned, that is, also based on parent insensitivity, even
    * if @widget itself is sensitive.
    *
    * Also note that if you are looking for a way to obtain the
    * [flags@Gtk.StateFlags] to pass to a [class@Gtk.StyleContext] method, you
    * should look at [method@Gtk.StyleContext.get_state].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStateFlags(): StateFlags /* None */ =
    StateFlags.fromRaw(
      gtk_widget_get_state_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      )
    )
  end getStateFlags

  /** Returns the style context associated to @widget.
    *
    * The returned object is guaranteed to be the same for the lifetime of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStyleContext()(using Runtime): sn.gnome.gtk4.StyleContext /* None */ =
    sn.gnome.gtk4.StyleContext.applyUnsafe(
      gtk_widget_get_style_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getStyleContext

  /** Fetch an object build from the template XML for @widget_type in this @widget
    * instance.
    *
    * This will only report children which were previously declared with
    * [method@Gtk.WidgetClass.bind_template_child_full] or one of its variants.
    *
    * This function is only meant to be called for code which is private to the @widget_type
    * which declared the child and is meant for language bindings which cannot
    * easily make use of the GObject structure offsets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTemplateChild(
      widget_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      name: String /* Some(CString) */
  )(using Zone, Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      gtk_widget_get_template_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
        widget_type,
        toCString(name)
      ).asInstanceOf
    )
  end getTemplateChild

  /** Gets the contents of the tooltip for @widget.
    *
    * If the tooltip has not been set using
    * [method@Gtk.Widget.set_tooltip_markup], this function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTooltipMarkup()(using Zone): String /* None */ =
    fromCString(
      gtk_widget_get_tooltip_markup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getTooltipMarkup

  /** Gets the contents of the tooltip for @widget.
    *
    * If the @widget's tooltip was set using
    * [method@Gtk.Widget.set_tooltip_markup], this function will return the
    * escaped text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTooltipText()(using Zone): String /* None */ =
    fromCString(
      gtk_widget_get_tooltip_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end getTooltipText

  /** Gets the vertical alignment of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValign(): Align /* None */ =
    Align.fromRaw(
      gtk_widget_get_valign(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      )
    )
  end getValign

  /** Gets whether the widget would like any available extra vertical space.
    *
    * See [method@Gtk.Widget.get_hexpand] for more detail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVexpand(): Boolean /* None */ =
    gtk_widget_get_vexpand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getVexpand

  /** Gets whether gtk_widget_set_vexpand() has been used to explicitly set the
    * expand flag on this widget.
    *
    * See [method@Gtk.Widget.get_hexpand_set] for more detail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVexpandSet(): Boolean /* None */ =
    gtk_widget_get_vexpand_set(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getVexpandSet

  /** Determines whether the widget is visible.
    *
    * If you want to take into account whether the widget’s parent is also
    * marked as visible, use [method@Gtk.Widget.is_visible] instead.
    *
    * This function does not check if the widget is obscured in any way.
    *
    * See [method@Gtk.Widget.set_visible].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ =
    gtk_widget_get_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end getVisible

  /** Returns the content width of the widget.
    *
    * This function returns the width passed to its size-allocate
    * implementation, which is the width you should be using in
    * [vfunc@Gtk.Widget.snapshot].
    *
    * For pointer events, see [method@Gtk.Widget.contains].
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ =
    gtk_widget_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end getWidth

  /** Causes @widget to have the keyboard focus for the `GtkWindow` it's inside.
    *
    * If @widget is not focusable, or its [vfunc@Gtk.Widget.grab_focus]
    * implementation cannot transfer the focus to a descendant of @widget that
    * is focusable, it will not take focus and %FALSE will be returned.
    *
    * Calling [method@Gtk.Widget.grab_focus] on an already focused widget is
    * allowed, should not have an effect, and return %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def grabFocus(): Boolean /* None */ =
    gtk_widget_grab_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end grabFocus

  /** Returns whether @css_class is currently applied to @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasCssClass(
      css_class: String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gtk_widget_has_css_class(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      toCString(css_class)
    ).value.!=(0)
  end hasCssClass

  /** Determines whether @widget is the current default widget within its
    * toplevel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasDefault(): Boolean /* None */ =
    gtk_widget_has_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end hasDefault

  /** Determines if the widget has the global input focus.
    *
    * See [method@Gtk.Widget.is_focus] for the difference between having the
    * global input focus, and only having the focus within a toplevel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasFocus(): Boolean /* None */ =
    gtk_widget_has_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end hasFocus

  /** Determines if the widget should show a visible indication that it has the
    * global input focus.
    *
    * This is a convenience function that takes into account whether focus
    * indication should currently be shown in the toplevel window of @widget.
    * See [method@Gtk.Window.get_focus_visible] for more information about focus
    * indication.
    *
    * To find out if the widget has the global input focus, use
    * [method@Gtk.Widget.has_focus].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasVisibleFocus(): Boolean /* None */ =
    gtk_widget_has_visible_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end hasVisibleFocus

  /** Reverses the effects of gtk_widget_show().
    *
    * This is causing the widget to be hidden (invisible to the user).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hide(): Unit /* None */ =
    gtk_widget_hide(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end hide

  /** Returns whether the widget is currently being destroyed.
    *
    * This information can sometimes be used to avoid doing unnecessary work.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inDestruction(): Boolean /* None */ =
    gtk_widget_in_destruction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end inDestruction

  /** Creates and initializes child widgets defined in templates.
    *
    * This function must be called in the instance initializer for any class
    * which assigned itself a template using
    * [method@Gtk.WidgetClass.set_template].
    *
    * It is important to call this function in the instance initializer of a
    * `GtkWidget` subclass and not in `GObject.constructed()` or
    * `GObject.constructor()` for two reasons:
    *
    *   - derived widgets will assume that the composite widgets defined by its
    *     parent classes have been created in their relative instance
    *     initializers
    *   - when calling `g_object_new()` on a widget with composite templates,
    *     it’s important to build the composite widgets before the construct
    *     properties are set. Properties passed to `g_object_new()` should take
    *     precedence over properties set in the private template XML
    *
    * A good rule of thumb is to call this function as the first thing in an
    * instance initialization function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initTemplate(): Unit /* None */ =
    gtk_widget_init_template(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end initTemplate

  /** Inserts @group into @widget.
    *
    * Children of @widget that implement [iface@Gtk.Actionable] can then be
    * associated with actions in @group by setting their “action-name” to @prefix.`action-name`.
    *
    * Note that inheritance is defined for individual actions. I.e. even if you
    * insert a group with prefix @prefix, actions with the same prefix will
    * still be inherited from the parent, unless the group contains an action
    * with the same name.
    *
    * If @group is %NULL, a previously inserted group for @name is removed from @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertActionGroup(
      name: String /* Some(CString) */,
      group: Option[
        ActionGroup /* Some(Ptr[_root_.sn.gnome.gio.internal.GActionGroup]) */
      ]
  )(using Zone): Unit /* None */ =
    gtk_widget_insert_action_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      toCString(name),
      group
        .map[Ptr[_root_.sn.gnome.gio.internal.GActionGroup]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GActionGroup]]
        )
    )
  end insertActionGroup

  /** Inserts @widget into the child widget list of @parent.
    *
    * It will be placed after @previous_sibling, or at the beginning if
    * @previous_sibling
    *   is %NULL.
    *
    * After calling this function, `gtk_widget_get_prev_sibling(widget)` will
    * return @previous_sibling.
    *
    * If @parent is already set as the parent widget of @widget, this function
    * can also be used to reorder @widget in the child widget list of @parent.
    *
    * This API is primarily meant for widget implementations; if you are just
    * using a widget, you *must* use its own API for adding children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertAfter(
      parent: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      previous_sibling: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_insert_after(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      parent.getUnsafeRawPointer().asInstanceOf,
      previous_sibling
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end insertAfter

  /** Inserts @widget into the child widget list of @parent.
    *
    * It will be placed before @next_sibling, or at the end if
    * @next_sibling
    *   is %NULL.
    *
    * After calling this function, `gtk_widget_get_next_sibling(widget)` will
    * return @next_sibling.
    *
    * If @parent is already set as the parent widget of @widget, this function
    * can also be used to reorder @widget in the child widget list of @parent.
    *
    * This API is primarily meant for widget implementations; if you are just
    * using a widget, you *must* use its own API for adding children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertBefore(
      parent: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      next_sibling: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_insert_before(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      parent.getUnsafeRawPointer().asInstanceOf,
      next_sibling
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end insertBefore

  /** Determines whether @widget is somewhere inside @ancestor, possibly with
    * intermediate containers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isAncestor(
      ancestor: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Boolean /* None */ =
    gtk_widget_is_ancestor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      ancestor.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isAncestor

  /** Determines whether @widget can be drawn to.
    *
    * A widget can be drawn if it is mapped and visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDrawable(): Boolean /* None */ =
    gtk_widget_is_drawable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end isDrawable

  /** Determines if the widget is the focus widget within its toplevel.
    *
    * This does not mean that the [property@Gtk.Widget:has-focus] property is
    * necessarily set; [property@Gtk.Widget:has-focus] will only be set if the
    * toplevel widget additionally has the global input focus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFocus(): Boolean /* None */ =
    gtk_widget_is_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end isFocus

  /** Returns the widget’s effective sensitivity.
    *
    * This means it is sensitive itself and also its parent widget is sensitive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSensitive(): Boolean /* None */ =
    gtk_widget_is_sensitive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end isSensitive

  /** Determines whether the widget and all its parents are marked as visible.
    *
    * This function does not check if the widget is obscured in any way.
    *
    * See also [method@Gtk.Widget.get_visible] and
    * [method@Gtk.Widget.set_visible].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isVisible(): Boolean /* None */ =
    gtk_widget_is_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end isVisible

  /** Emits the `::keynav-failed` signal on the widget.
    *
    * This function should be called whenever keyboard navigation within a
    * single widget hits a boundary.
    *
    * The return value of this function should be interpreted in a way similar
    * to the return value of [method@Gtk.Widget.child_focus]. When %TRUE is
    * returned, stay in the widget, the failed keyboard navigation is OK and/or
    * there is nowhere we can/should move the focus to. When %FALSE is returned,
    * the caller should continue with keyboard navigation outside the widget,
    * e.g. by calling [method@Gtk.Widget.child_focus] on the widget’s toplevel.
    *
    * The default [signal@Gtk.Widget::keynav-failed] handler returns %FALSE for
    * %GTK_DIR_TAB_FORWARD and %GTK_DIR_TAB_BACKWARD. For the other values of
    * `GtkDirectionType` it returns %TRUE.
    *
    * Whenever the default handler returns %TRUE, it also calls
    * [method@Gtk.Widget.error_bell] to notify the user of the failed keyboard
    * navigation.
    *
    * A use case for providing an own implementation of ::keynav-failed (either
    * by connecting to it or by overriding it) would be a row of
    * [class@Gtk.Entry] widgets where the user should be able to navigate the
    * entire row with the cursor keys, as e.g. known from user interfaces that
    * require entering license keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keynavFailed(
      direction: DirectionType /* Some(GtkDirectionType) */
  ): Boolean /* None */ =
    gtk_widget_keynav_failed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      direction.raw
    ).value.!=(0)
  end keynavFailed

  /** Returns the widgets for which this widget is the target of a mnemonic.
    *
    * Typically, these widgets will be labels. See, for example,
    * [method@Gtk.Label.set_mnemonic_widget].
    *
    * The widgets in the list are not individually referenced. If you want to
    * iterate through the list and perform actions involving callbacks that
    * might destroy the widgets, you must call
    * `g_list_foreach (result, (GFunc)g_object_ref, NULL)` first, and then unref
    * all the widgets afterwards.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_mnemonic_labels/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Widget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def listMnemonicLabels__ = ???

  /** Causes a widget to be mapped if it isn’t already.
    *
    * This function is only for use in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def map(): Unit /* None */ =
    gtk_widget_map(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end map

  /** Measures @widget in the orientation @orientation and for the given @for_size.
    *
    * As an example, if @orientation is %GTK_ORIENTATION_HORIZONTAL and @for_size
    * is 300, this functions will compute the minimum and natural width of @widget
    * if it is allocated at a height of 300 pixels.
    *
    * See [GtkWidget’s geometry management
    * section](class.Widget.html#height-for-width-geometry-management) for a
    * more details on implementing `GtkWidgetClass.measure()`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method measure]: Method measure contains an OUT parameter, which is not supported yet"
  )
  private def measure__ = ???

  /** Emits the ::mnemonic-activate signal.
    *
    * See [signal@Gtk.Widget::mnemonic-activate].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mnemonicActivate(
      group_cycling: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_widget_mnemonic_activate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if group_cycling == true then 1 else 0)))
    ).value.!=(0)
  end mnemonicActivate

  /** Returns a `GListModel` to track the children of @widget.
    *
    * Calling this function will enable extra internal bookkeeping to track
    * children and emit signals on the returned listmodel. It may slow down
    * operations a lot.
    *
    * Applications should try hard to avoid calling this function because of the
    * slowdowns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def observeChildren(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_widget_observe_children(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end observeChildren

  /** Returns a `GListModel` to track the [class@Gtk.EventController]s of @widget.
    *
    * Calling this function will enable extra internal bookkeeping to track
    * controllers and emit signals on the returned listmodel. It may slow down
    * operations a lot.
    *
    * Applications should try hard to avoid calling this function because of the
    * slowdowns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def observeControllers(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_widget_observe_controllers(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
      ).asInstanceOf
    )
  end observeControllers

  /** Finds the descendant of @widget closest to the point (@x, @y).
    *
    * The point must be given in widget coordinates, so (0, 0) is assumed to be
    * the top left of @widget's content area.
    *
    * Usually widgets will return %NULL if the given coordinate is not contained
    * in @widget checked via [method@Gtk.Widget.contains]. Otherwise they will
    * recursively try to find a child that does not return %NULL. Widgets are
    * however free to customize their picking algorithm.
    *
    * This function is used on the toplevel to determine the widget below the
    * mouse cursor for purposes of hover highlighting and delivering events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pick(
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */,
      flags: PickFlags /* Some(GtkPickFlags) */
  )(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_widget_pick(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
        x,
        y,
        flags.raw
      ).asInstanceOf
    )
  end pick

  /** Flags the widget for a rerun of the [vfunc@Gtk.Widget.size_allocate]
    * function.
    *
    * Use this function instead of [method@Gtk.Widget.queue_resize] when the @widget's
    * size request didn't change but it wants to reposition its contents.
    *
    * An example user of this function is [method@Gtk.Widget.set_halign].
    *
    * This function is only for use in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queueAllocate(): Unit /* None */ =
    gtk_widget_queue_allocate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end queueAllocate

  /** Schedules this widget to be redrawn in the paint phase of the current or
    * the next frame.
    *
    * This means @widget's [vfunc@Gtk.Widget.snapshot] implementation will be
    * called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queueDraw(): Unit /* None */ =
    gtk_widget_queue_draw(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end queueDraw

  /** Flags a widget to have its size renegotiated.
    *
    * This should be called when a widget for some reason has a new size
    * request. For example, when you change the text in a [class@Gtk.Label], the
    * label queues a resize to ensure there’s enough space for the new text.
    *
    * Note that you cannot call gtk_widget_queue_resize() on a widget from
    * inside its implementation of the [vfunc@Gtk.Widget.size_allocate] virtual
    * method. Calls to gtk_widget_queue_resize() from inside
    * [vfunc@Gtk.Widget.size_allocate] will be silently ignored.
    *
    * This function is only for use in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queueResize(): Unit /* None */ =
    gtk_widget_queue_resize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end queueResize

  /** Creates the GDK resources associated with a widget.
    *
    * Normally realization happens implicitly; if you show a widget and all its
    * parent containers, then the widget will be realized and mapped
    * automatically.
    *
    * Realizing a widget requires all the widget’s parent widgets to be
    * realized; calling this function realizes the widget’s parents in addition
    * to @widget itself. If a widget is not yet inside a toplevel window when
    * you realize it, bad things will happen.
    *
    * This function is primarily used in widget implementations, and isn’t very
    * useful otherwise. Many times when you think you might need it, a better
    * approach is to connect to a signal that will be called after the widget is
    * realized automatically, such as [signal@Gtk.Widget::realize].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def realize(): Unit /* None */ =
    gtk_widget_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end realize

  /** Removes @controller from @widget, so that it doesn't process events
    * anymore.
    *
    * It should not be used again.
    *
    * Widgets will remove all event controllers automatically when they are
    * destroyed, there is normally no need to call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeController(
      controller: sn.gnome.gtk4.EventController /* Some(Ptr[GtkEventController]) */
  )(using Runtime): Unit /* None */ =
    gtk_widget_remove_controller(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      controller.getUnsafeRawPointer().asInstanceOf
    )
  end removeController

  /** Removes a style from @widget.
    *
    * After this, the style of @widget will stop matching for @css_class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeCssClass(
      css_class: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_widget_remove_css_class(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      toCString(css_class)
    )
  end removeCssClass

  /** Removes a widget from the list of mnemonic labels for this widget.
    *
    * See [method@Gtk.Widget.list_mnemonic_labels]. The widget must have
    * previously been added to the list with
    * [method@Gtk.Widget.add_mnemonic_label].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeMnemonicLabel(
      label: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_widget_remove_mnemonic_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      label.getUnsafeRawPointer().asInstanceOf
    )
  end removeMnemonicLabel

  /** Removes a tick callback previously registered with
    * gtk_widget_add_tick_callback().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeTickCallback(
      id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_widget_remove_tick_callback(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      guint(id)
    )
  end removeTickCallback

  /** Specifies whether the input focus can enter the widget or any of its
    * children.
    *
    * Applications should set @can_focus to %FALSE to mark a widget as for
    * pointer/touch use only.
    *
    * Note that having @can_focus be %TRUE is only one of the necessary
    * conditions for being focusable. A widget must also be sensitive and
    * focusable and not have an ancestor that is marked as not can-focus in
    * order to receive input focus.
    *
    * See [method@Gtk.Widget.grab_focus] for actually setting the input focus on
    * a widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCanFocus(
      can_focus: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_can_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if can_focus == true then 1 else 0)))
    )
  end setCanFocus

  /** Sets whether @widget can be the target of pointer events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCanTarget(
      can_target: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_can_target(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if can_target == true then 1 else 0)))
    )
  end setCanTarget

  /** Sets whether @widget should be mapped along with its parent.
    *
    * The child visibility can be set for widget before it is added to a
    * container with [method@Gtk.Widget.set_parent], to avoid mapping children
    * unnecessary before immediately unmapping them. However it will be reset to
    * its default state of %TRUE when the widget is removed from a container.
    *
    * Note that changing the child visibility of a widget does not queue a
    * resize on the widget. Most of the time, the size of a widget is computed
    * from all visible children, whether or not they are mapped. If this is not
    * the case, the container can queue a resize itself.
    *
    * This function is only useful for container implementations and should
    * never be called by an application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChildVisible(
      child_visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_child_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if child_visible == true then 1 else 0)))
    )
  end setChildVisible

  /** Clear all style classes applied to @widget and replace them with @classes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCssClasses(
      classes: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ =
    gtk_widget_set_css_classes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      MemoryWrite.nullTerminatedStringArray(classes)
    )
  end setCssClasses

  /** Sets the cursor to be shown when pointer devices point towards @widget.
    *
    * If the @cursor is NULL, @widget will use the cursor inherited from the
    * parent widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCursor(
      cursor: Option[
        sn.gnome.gdk4.Cursor /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkCursor]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_set_cursor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      cursor
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkCursor]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkCursor]]
        )
    )
  end setCursor

  /** Sets a named cursor to be shown when pointer devices point towards @widget.
    *
    * This is a utility function that creates a cursor via
    * [ctor@Gdk.Cursor.new_from_name] and then sets it on @widget with
    * [method@Gtk.Widget.set_cursor]. See those functions for details.
    *
    * On top of that, this function allows @name to be %NULL, which will do the
    * same as calling [method@Gtk.Widget.set_cursor] with a %NULL cursor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCursorFromName(
      name: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_widget_set_cursor_from_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      name.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setCursorFromName

  /** Sets the reading direction on a particular widget.
    *
    * This direction controls the primary direction for widgets containing text,
    * and also the direction in which the children of a container are packed.
    * The ability to set the direction is present in order so that correct
    * localization into languages with right-to-left reading directions can be
    * done. Generally, applications will let the default reading direction
    * present, except for containers where the containers are arranged in an
    * order that is explicitly visual rather than logical (such as buttons for
    * text justification).
    *
    * If the direction is set to %GTK_TEXT_DIR_NONE, then the value set by
    * [func@Gtk.Widget.set_default_direction] will be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDirection(
      dir: TextDirection /* Some(GtkTextDirection) */
  ): Unit /* None */ =
    gtk_widget_set_direction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      dir.raw
    )
  end setDirection

  /** Set @child as the current focus child of @widget.
    *
    * This function is only suitable for widget implementations. If you want a
    * certain widget to get the input focus, call [method@Gtk.Widget.grab_focus]
    * on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFocusChild(
      child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_set_focus_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocusChild

  /** Sets whether the widget should grab focus when it is clicked with the
    * mouse.
    *
    * Making mouse clicks not grab focus is useful in places like toolbars where
    * you don’t want the keyboard focus removed from the main area of the
    * application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFocusOnClick(
      focus_on_click: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_focus_on_click(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if focus_on_click == true then 1 else 0)))
    )
  end setFocusOnClick

  /** Specifies whether @widget can own the input focus.
    *
    * Widget implementations should set @focusable to %TRUE in their init()
    * function if they want to receive keyboard input.
    *
    * Note that having @focusable be %TRUE is only one of the necessary
    * conditions for being focusable. A widget must also be sensitive and
    * can-focus and not have an ancestor that is marked as not can-focus in
    * order to receive input focus.
    *
    * See [method@Gtk.Widget.grab_focus] for actually setting the input focus on
    * a widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFocusable(
      focusable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_focusable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if focusable == true then 1 else 0)))
    )
  end setFocusable

  /** Sets the font map to use for Pango rendering.
    *
    * The font map is the object that is used to look up fonts. Setting a custom
    * font map can be useful in special situations, e.g. when you need to add
    * application-specific fonts to the set of available fonts.
    *
    * When not set, the widget will inherit the font map from its parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFontMap(
      font_map: Option[
        sn.gnome.pango.FontMap /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_set_font_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      font_map
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]
        )
    )
  end setFontMap

  /** Sets the `cairo_font_options_t` used for Pango rendering in this widget.
    *
    * When not set, the default font options for the `GdkDisplay` will be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_font_options/<method parameters>/options]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.FontOptions), @type -> DataRecord(const cairo_font_options_t*)))"
  )
  private def setFontOptions__ = ???

  /** Sets the horizontal alignment of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHalign(align: Align /* Some(GtkAlign) */ ): Unit /* None */ =
    gtk_widget_set_halign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      align.raw
    )
  end setHalign

  /** Sets the `has-tooltip` property on @widget to @has_tooltip.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasTooltip(
      has_tooltip: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_has_tooltip(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if has_tooltip == true then 1 else 0)))
    )
  end setHasTooltip

  /** Sets whether the widget would like any available extra horizontal space.
    *
    * When a user resizes a `GtkWindow`, widgets with expand=TRUE generally
    * receive the extra space. For example, a list or scrollable area or
    * document in your window would often be set to expand.
    *
    * Call this function to set the expand flag if you would like your widget to
    * become larger horizontally when the window has extra room.
    *
    * By default, widgets automatically expand if any of their children want to
    * expand. (To see if a widget will automatically expand given its current
    * children and state, call [method@Gtk.Widget.compute_expand]. A container
    * can decide how the expandability of children affects the expansion of the
    * container by overriding the compute_expand virtual method on
    * `GtkWidget`.).
    *
    * Setting hexpand explicitly with this function will override the automatic
    * expand behavior.
    *
    * This function forces the widget to expand or not to expand, regardless of
    * children. The override occurs because [method@Gtk.Widget.set_hexpand] sets
    * the hexpand-set property (see [method@Gtk.Widget.set_hexpand_set]) which
    * causes the widget’s hexpand value to be used, rather than looking at
    * children and widget state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHexpand(
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_hexpand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end setHexpand

  /** Sets whether the hexpand flag will be used.
    *
    * The [property@Gtk.Widget:hexpand-set] property will be set automatically
    * when you call [method@Gtk.Widget.set_hexpand] to set hexpand, so the most
    * likely reason to use this function would be to unset an explicit expand
    * flag.
    *
    * If hexpand is set, then it overrides any computed expand value based on
    * child widgets. If hexpand is not set, then the expand value depends on
    * whether any children of the widget would like to expand.
    *
    * There are few reasons to use this function, but it’s here for completeness
    * and consistency.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHexpandSet(
      set: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_hexpand_set(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if set == true then 1 else 0)))
    )
  end setHexpandSet

  /** Sets the layout manager delegate instance that provides an implementation
    * for measuring and allocating the children of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLayoutManager(
      layout_manager: Option[
        sn.gnome.gtk4.LayoutManager /* Some(Ptr[GtkLayoutManager]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_widget_set_layout_manager(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      layout_manager
        .map[Ptr[GtkLayoutManager]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkLayoutManager]])
    )
  end setLayoutManager

  /** Sets the bottom margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarginBottom(margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_widget_set_margin_bottom(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      margin
    )
  end setMarginBottom

  /** Sets the end margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarginEnd(margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_widget_set_margin_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      margin
    )
  end setMarginEnd

  /** Sets the start margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarginStart(margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_widget_set_margin_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      margin
    )
  end setMarginStart

  /** Sets the top margin of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarginTop(margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_widget_set_margin_top(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      margin
    )
  end setMarginTop

  /** Sets a widgets name.
    *
    * Setting a name allows you to refer to the widget from a CSS file. You can
    * apply a style to widgets with a particular name in the CSS file. See the
    * documentation for the CSS syntax (on the same page as the docs for
    * [class@Gtk.StyleContext].
    *
    * Note that the CSS syntax has certain special characters to delimit and
    * represent elements in a selector (period, #, >, *...), so using these will
    * make your widget impossible to match by name. Any combination of
    * alphanumeric symbols, dashes and underscores will suffice.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(name: String /* Some(CString) */ )(using Zone): Unit /* None */ =
    gtk_widget_set_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      toCString(name)
    )
  end setName

  /** Request the @widget to be rendered partially transparent.
    *
    * An opacity of 0 is fully transparent and an opacity of 1 is fully opaque.
    *
    * Opacity works on both toplevel widgets and child widgets, although there
    * are some limitations: For toplevel widgets, applying opacity depends on
    * the capabilities of the windowing system. On X11, this has any effect only
    * on X displays with a compositing manager, see gdk_display_is_composited().
    * On Windows and Wayland it should always work, although setting a window’s
    * opacity after the window has been shown may cause some flicker.
    *
    * Note that the opacity is inherited through inclusion — if you set a
    * toplevel to be partially translucent, all of its content will appear
    * translucent, since it is ultimatively rendered on that toplevel. The
    * opacity value itself is not inherited by child widgets (since that would
    * make widgets deeper in the hierarchy progressively more translucent). As a
    * consequence, [class@Gtk.Popover]s and other [iface@Gtk.Native] widgets
    * with their own surface will use their own opacity value, and thus by
    * default appear non-translucent, even if they are attached to a toplevel
    * that is translucent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOpacity(opacity: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_widget_set_opacity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      opacity
    )
  end setOpacity

  /** Sets how @widget treats content that is drawn outside the widget's content
    * area.
    *
    * See the definition of [enum@Gtk.Overflow] for details.
    *
    * This setting is provided for widget implementations and should not be used
    * by application code.
    *
    * The default value is %GTK_OVERFLOW_VISIBLE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOverflow(
      overflow: Overflow /* Some(GtkOverflow) */
  ): Unit /* None */ =
    gtk_widget_set_overflow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      overflow.raw
    )
  end setOverflow

  /** Sets @parent as the parent widget of @widget.
    *
    * This takes care of details such as updating the state and style of the
    * child to reflect its new location and resizing the parent. The opposite
    * function is [method@Gtk.Widget.unparent].
    *
    * This function is useful only when implementing subclasses of `GtkWidget`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setParent(
      parent: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_widget_set_parent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      parent.getUnsafeRawPointer().asInstanceOf
    )
  end setParent

  /** Specifies whether @widget will be treated as the default widget within its
    * toplevel when it has the focus, even if another widget is the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setReceivesDefault(
      receives_default: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_receives_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if receives_default == true then 1 else 0)))
    )
  end setReceivesDefault

  /** Sets the sensitivity of a widget.
    *
    * A widget is sensitive if the user can interact with it. Insensitive
    * widgets are “grayed out” and the user can’t interact with them.
    * Insensitive widgets are known as “inactive”, “disabled”, or “ghosted” in
    * some other toolkits.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSensitive(
      sensitive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_sensitive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if sensitive == true then 1 else 0)))
    )
  end setSensitive

  /** Sets the minimum size of a widget.
    *
    * That is, the widget’s size request will be at least @width by @height. You
    * can use this function to force a widget to be larger than it normally
    * would be.
    *
    * In most cases, [method@Gtk.Window.set_default_size] is a better choice for
    * toplevel windows than this function; setting the default size will still
    * allow users to shrink the window. Setting the size request will force them
    * to leave the window at least as large as the size request.
    *
    * Note the inherent danger of setting any fixed size - themes, translations
    * into other languages, different fonts, and user action can all change the
    * appropriate size for a given widget. So, it's basically impossible to
    * hardcode a size that will always be correct.
    *
    * The size request of a widget is the smallest size a widget can accept
    * while still functioning well and drawing itself correctly. However in some
    * strange cases a widget may be allocated less than its requested size, and
    * in many cases a widget may be allocated more space than it requested.
    *
    * If the size request in a given direction is -1 (unset), then the “natural”
    * size request of the widget will be used instead.
    *
    * The size request set here does not include any margin from the properties
    * [property@Gtk.Widget:margin-start], [property@Gtk.Widget:margin-end],
    * [property@Gtk.Widget:margin-top], and [property@Gtk.Widget:margin-bottom],
    * but it does include pretty much all other padding or border properties set
    * by any subclass of `GtkWidget`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSizeRequest(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_widget_set_size_request(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      width,
      height
    )
  end setSizeRequest

  /** Turns on flag values in the current widget state.
    *
    * Typical widget states are insensitive, prelighted, etc.
    *
    * This function accepts the values %GTK_STATE_FLAG_DIR_LTR and
    * %GTK_STATE_FLAG_DIR_RTL but ignores them. If you want to set the widget's
    * direction, use [method@Gtk.Widget.set_direction].
    *
    * This function is for use in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStateFlags(
      flags: StateFlags /* Some(GtkStateFlags) */,
      clear: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_state_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      flags.raw,
      gboolean(gint((if clear == true then 1 else 0)))
    )
  end setStateFlags

  /** Sets @markup as the contents of the tooltip, which is marked up with Pango
    * markup.
    *
    * This function will take care of setting the
    * [property@Gtk.Widget:has-tooltip] as a side effect, and of the default
    * handler for the [signal@Gtk.Widget::query-tooltip] signal.
    *
    * See also [method@Gtk.Tooltip.set_markup].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTooltipMarkup(
      markup: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_widget_set_tooltip_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      markup
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setTooltipMarkup

  /** Sets @text as the contents of the tooltip.
    *
    * If @text contains any markup, it will be escaped.
    *
    * This function will take care of setting [property@Gtk.Widget:has-tooltip]
    * as a side effect, and of the default handler for the
    * [signal@Gtk.Widget::query-tooltip] signal.
    *
    * See also [method@Gtk.Tooltip.set_text].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTooltipText(
      text: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_widget_set_tooltip_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      text.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setTooltipText

  /** Sets the vertical alignment of @widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValign(align: Align /* Some(GtkAlign) */ ): Unit /* None */ =
    gtk_widget_set_valign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      align.raw
    )
  end setValign

  /** Sets whether the widget would like any available extra vertical space.
    *
    * See [method@Gtk.Widget.set_hexpand] for more detail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVexpand(
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_vexpand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if expand == true then 1 else 0)))
    )
  end setVexpand

  /** Sets whether the vexpand flag will be used.
    *
    * See [method@Gtk.Widget.set_hexpand_set] for more detail.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVexpandSet(
      set: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_vexpand_set(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if set == true then 1 else 0)))
    )
  end setVexpandSet

  /** Sets the visibility state of @widget.
    *
    * Note that setting this to %TRUE doesn’t mean the widget is actually
    * viewable, see [method@Gtk.Widget.get_visible].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisible(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_widget_set_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      gboolean(gint((if visible == true then 1 else 0)))
    )
  end setVisible

  /** Returns whether @widget should contribute to the measuring and allocation
    * of its parent.
    *
    * This is %FALSE for invisible children, but also for children that have
    * their own surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shouldLayout(): Boolean /* None */ =
    gtk_widget_should_layout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    ).value.!=(0)
  end shouldLayout

  /** Flags a widget to be displayed.
    *
    * Any widget that isn’t shown will not appear on the screen.
    *
    * Remember that you have to show the containers containing a widget, in
    * addition to the widget itself, before it will appear onscreen.
    *
    * When a toplevel container is shown, it is immediately realized and mapped;
    * other shown widgets are realized and mapped when their toplevel container
    * is realized and mapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def show(): Unit /* None */ =
    gtk_widget_show(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end show

  /** Allocates widget with a transformation that translates the origin to the
    * position in @allocation.
    *
    * This is a simple form of [method@Gtk.Widget.allocate].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method size_allocate/<method parameters>/allocation]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Allocation), @type -> DataRecord(const GtkAllocation*)))"
  )
  private def sizeAllocate__ = ???

  /** Snapshot the a child of @widget.
    *
    * When a widget receives a call to the snapshot function, it must send
    * synthetic [vfunc@Gtk.Widget.snapshot] calls to all children. This function
    * provides a convenient way of doing this. A widget, when it receives a call
    * to its [vfunc@Gtk.Widget.snapshot] function, calls
    * gtk_widget_snapshot_child() once for each child, passing in the @snapshot
    * the widget received.
    *
    * gtk_widget_snapshot_child() takes care of translating the origin of
    * @snapshot,
    *   and deciding whether the child needs to be snapshot.
    *
    * This function does nothing for children that implement `GtkNative`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def snapshotChild(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      snapshot: sn.gnome.gtk4.Snapshot /* Some(Ptr[GtkSnapshot]) */
  )(using Runtime): Unit /* None */ =
    gtk_widget_snapshot_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      child.getUnsafeRawPointer().asInstanceOf,
      snapshot.getUnsafeRawPointer().asInstanceOf
    )
  end snapshotChild

  /** Translate coordinates relative to @src_widget’s allocation to coordinates
    * relative to @dest_widget’s allocations.
    *
    * In order to perform this operation, both widget must share a common
    * ancestor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method translate_coordinates]: Method translate_coordinates contains an OUT parameter, which is not supported yet"
  )
  private def translateCoordinates__ = ???

  /** Triggers a tooltip query on the display where the toplevel of @widget is
    * located.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def triggerTooltipQuery(): Unit /* None */ =
    gtk_widget_trigger_tooltip_query(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end triggerTooltipQuery

  /** Causes a widget to be unmapped if it’s currently mapped.
    *
    * This function is only for use in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unmap(): Unit /* None */ =
    gtk_widget_unmap(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end unmap

  /** Dissociate @widget from its parent.
    *
    * This function is only for use in widget implementations, typically in
    * dispose.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unparent(): Unit /* None */ =
    gtk_widget_unparent(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]])
  end unparent

  /** Causes a widget to be unrealized (frees all GDK resources associated with
    * the widget).
    *
    * This function is only useful in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unrealize(): Unit /* None */ =
    gtk_widget_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]]
    )
  end unrealize

  /** Turns off flag values for the current widget state.
    *
    * See [method@Gtk.Widget.set_state_flags].
    *
    * This function is for use in widget implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetStateFlags(
      flags: StateFlags /* Some(GtkStateFlags) */
  ): Unit /* None */ =
    gtk_widget_unset_state_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWidget]],
      flags.raw
    )
  end unsetStateFlags

  /** Signals that all holders of a reference to the widget should release the
    * reference that they hold.
    *
    * May result in finalization of the widget if all references are released.
    *
    * This signal is not suitable for saving widget state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDestroy(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"destroy"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDestroy

  /** Emitted when the text direction of a widget changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDirectionChanged(handler: ((previousDirection: TextDirection)) => Unit)(
      using Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (previousDirection: TextDirection), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          previousDirection: GtkTextDirection /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (previousDirection = TextDirection.fromRaw(previousDirection))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"direction-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDirectionChanged

  /** Emitted when @widget is hidden.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onHide(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"hide"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onHide

  /** Emitted if keyboard navigation fails.
    *
    * See [method@Gtk.Widget.keynav_failed] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onKeynavFailed(handler: ((direction: DirectionType)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (direction: DirectionType), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          direction: GtkDirectionType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((direction = DirectionType.fromRaw(direction)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"keynav-failed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onKeynavFailed

  /** Emitted when @widget is going to be mapped.
    *
    * A widget is mapped when the widget is visible (which is controlled with
    * [property@Gtk.Widget:visible]) and all its parents up to the toplevel
    * widget are also visible.
    *
    * The ::map signal can be used to determine whether a widget will be drawn,
    * for instance it can resume an animation that was stopped during the
    * emission of [signal@Gtk.Widget::unmap].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMap(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"map"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMap

  /** Emitted when a widget is activated via a mnemonic.
    *
    * The default handler for this signal activates @widget if @group_cycling is
    * %FALSE, or just makes @widget grab focus if @group_cycling is %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMnemonicActivate(handler: ((groupCycling: Boolean)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (groupCycling: Boolean), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          groupCycling: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((groupCycling = groupCycling))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"mnemonic-activate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMnemonicActivate

  /** Emitted when the focus is moved.
    *
    * The ::move-focus signal is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Tab</kbd> to move forward,
    * and <kbd>Shift</kbd>+<kbd>Tab</kbd> to move backward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveFocus(handler: ((direction: DirectionType)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (direction: DirectionType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          direction: GtkDirectionType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((direction = DirectionType.fromRaw(direction)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"move-focus"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMoveFocus

  /** Emitted when the widget’s tooltip is about to be shown.
    *
    * This happens when the [property@Gtk.Widget:has-tooltip] property is %TRUE
    * and the hover timeout has expired with the cursor hovering "above" @widget;
    * or emitted when @widget got focus in keyboard mode.
    *
    * Using the given coordinates, the signal handler should determine whether a
    * tooltip should be shown for @widget. If this is the case %TRUE should be
    * returned, %FALSE otherwise. Note that if
    * @keyboard_mode
    *   is %TRUE, the values of @x and @y are undefined and should not be used.
    *
    * The signal handler is free to manipulate @tooltip with the therefore
    * destined function calls.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onQueryTooltip(
      handler: (
          (x: Int, y: Int, keyboardMode: Boolean, tooltip: Tooltip)
      ) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (x: Int, y: Int, keyboardMode: Boolean, tooltip: Tooltip),
      Boolean
    ]
    val c_handler = CFuncPtr6.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          x: Int /* param */,
          y: Int /* param */,
          keyboardMode: Boolean /* param */,
          tooltip: Ptr[GtkTooltip] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            x = x,
            y = y,
            keyboardMode = keyboardMode,
            tooltip = sr.runtime.get[Tooltip](tooltip.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"query-tooltip"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onQueryTooltip

  /** Emitted when @widget is associated with a `GdkSurface`.
    *
    * This means that [method@Gtk.Widget.realize] has been called or the widget
    * has been mapped (that is, it is going to be drawn).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onRealize(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"realize"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onRealize

  /** Emitted when @widget is shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onShow(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"show"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onShow

  /** Emitted when the widget state changes.
    *
    * See [method@Gtk.Widget.get_state_flags].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onStateFlagsChanged(handler: ((flags: StateFlags)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (flags: StateFlags), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          flags: GtkStateFlags /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((flags = StateFlags.fromRaw(flags)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"state-flags-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onStateFlagsChanged

  /** Emitted when @widget is going to be unmapped.
    *
    * A widget is unmapped when either it or any of its parents up to the
    * toplevel widget have been set as hidden.
    *
    * As ::unmap indicates that a widget will not be shown any longer, it can be
    * used to, for example, stop an animation on the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onUnmap(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"unmap"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onUnmap

  /** Emitted when the `GdkSurface` associated with @widget is destroyed.
    *
    * This means that [method@Gtk.Widget.unrealize] has been called or the
    * widget has been unmapped (that is, it is going to be hidden).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onUnrealize(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWidget],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"unrealize"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onUnrealize
end Widget

object Widget:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkWidget])(using Runtime) = summon[Runtime]
    .getOrCreate[Widget](ptr.asInstanceOf[Ptr[Byte]], p => new Widget(ptr))

  /** Obtains the current default reading direction.
    *
    * See [func@Gtk.Widget.set_default_direction].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultDirection(): TextDirection /* Some(GtkTextDirection) */ =
    TextDirection.fromRaw(gtk_widget_get_default_direction())

  /** Sets the default reading direction for widgets.
    *
    * See [method@Gtk.Widget.set_direction].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultDirection(
      dir: TextDirection /* Some(GtkTextDirection) */
  ): Unit /* Some(Unit) */ = gtk_widget_set_default_direction(dir.raw)

end Widget

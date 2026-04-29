package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.cairo.internal.cairo_font_options_t
import sn.gnome.gdk4.fluent.Clipboard
import sn.gnome.gdk4.fluent.Cursor
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.FrameClock
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gsk4.internal.GskTransform
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.Settings
import sn.gnome.gtk4.fluent.Snapshot
import sn.gnome.gtk4.fluent.StyleContext
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkAlign
import sn.gnome.gtk4.internal.GtkAllocation
import sn.gnome.gtk4.internal.GtkDirectionType
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkOverflow
import sn.gnome.gtk4.internal.GtkPickFlags
import sn.gnome.gtk4.internal.GtkSizeRequestMode
import sn.gnome.gtk4.internal.GtkStateFlags
import sn.gnome.gtk4.internal.GtkTextDirection
import sn.gnome.gtk4.internal.GtkTickCallback
import sn.gnome.gtk4.internal.GtkWidget
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.fluent.Layout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The base class for all widgets.
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
  */
class Widget(raw: Ptr[GtkWidget])
    extends InitiallyUnowned(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enable or disable an action installed with
    * gtk_widget_class_install_action().
    */
  def actionSetEnabled(action_name: String | CString, enabled: Boolean)(using
      Zone
  ): Unit = gtk_widget_action_set_enabled(
    this.raw.asInstanceOf,
    __sn_extract_string(action_name),
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * For widgets that can be “activated” (buttons, menu items, etc.), this
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
    */
  def activate(): Boolean =
    gtk_widget_activate(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the action in the action groups associated with @widget and its
    * ancestors, and activates it.
    *
    * This is a wrapper around [method@Gtk.Widget.activate_action_variant] that
    * constructs the @args variant according to @format_string.
    */
  inline def activateAction(
      name: String | CString,
      format_string: String | CString,
      args: Any*
  )(using Zone): Boolean = gtk_widget_activate_action(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    __sn_extract_string(format_string),
    args*
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the action in the action groups associated with
    * @widget
    *   and its ancestors, and activates it.
    *
    * If the action is in an action group added with
    * [method@Gtk.Widget.insert_action_group], the @name is expected to be
    * prefixed with the prefix that was used when the group was inserted.
    *
    * The arguments must match the actions expected parameter type, as returned
    * by `g_action_get_parameter_type()`.
    */
  def activateActionVariant(name: String | CString, args: Ptr[GVariant])(using
      Zone
  ): Boolean = gtk_widget_activate_action_variant(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    args
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Activates the `default.activate` action from @widget.
    */
  def activateDefault(): Unit = gtk_widget_activate_default(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @controller to @widget so that it will receive events.
    *
    * You will usually want to call this function right after creating any kind
    * of [class@Gtk.EventController].
    */
  def addController(controller: EventController): Unit =
    gtk_widget_add_controller(
      this.raw.asInstanceOf,
      controller.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a style class to @widget.
    *
    * After calling this function, the widget’s style will match for @css_class,
    * according to CSS matching rules.
    *
    * Use [method@Gtk.Widget.remove_css_class] to remove the style again.
    */
  def addCssClass(css_class: String | CString)(using Zone): Unit =
    gtk_widget_add_css_class(
      this.raw.asInstanceOf,
      __sn_extract_string(css_class)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a widget to the list of mnemonic labels for this widget.
    *
    * See [method@Gtk.Widget.list_mnemonic_labels]. Note the list of mnemonic
    * labels for the widget is cleared when the widget is destroyed, so the
    * caller must make sure to update its internal state at this point as well.
    */
  def addMnemonicLabel(label: Widget): Unit = gtk_widget_add_mnemonic_label(
    this.raw.asInstanceOf,
    label.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queues an animation frame update and adds a callback to be called before
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
    */
  def addTickCallback(
      callback: GtkTickCallback,
      user_data: Ptr[Byte],
      _notify: GDestroyNotify
  ): UInt = gtk_widget_add_tick_callback(
    this.raw.asInstanceOf,
    callback,
    gpointer(user_data),
    _notify
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is only used by `GtkWidget` subclasses, to assign a size,
    * position and (optionally) baseline to their child widgets.
    *
    * In this function, the allocation and baseline may be adjusted. The given
    * allocation will be forced to be bigger than the widget's minimum size, as
    * well as at least 0×0 in size.
    *
    * For a version that does not take a transform, see
    * [method@Gtk.Widget.size_allocate].
    */
  def allocate(
      width: Int,
      height: Int,
      baseline: Int,
      transform: Ptr[GskTransform]
  ): Unit = gtk_widget_allocate(
    this.raw.asInstanceOf,
    width,
    height,
    baseline,
    transform
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Called by widgets as the user moves around the window using keyboard
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
    */
  def childFocus(direction: GtkDirectionType): Boolean =
    gtk_widget_child_focus(this.raw.asInstanceOf, direction).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the bounds for @widget in the coordinate space of @target.
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
    */
  @annotation.compileTimeOnly(
    "Method compute_bounds contains an OUT parameter, which is not supported yet"
  )
  def computeBounds(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes whether a container should give this widget extra space when
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
    */
  def computeExpand(orientation: GtkOrientation): Boolean =
    gtk_widget_compute_expand(this.raw.asInstanceOf, orientation).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translates the given @point in @widget's coordinates to coordinates
    * relative to @target’s coordinate system.
    *
    * In order to perform this operation, both widgets must share a common
    * ancestor.
    */
  @annotation.compileTimeOnly(
    "Method compute_point contains an OUT parameter, which is not supported yet"
  )
  def computePoint(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes a matrix suitable to describe a transformation from
    * @widget's
    *   coordinate system into @target's coordinate system.
    *
    * The transform can not be computed in certain cases, for example when @widget
    * and @target do not share a common ancestor. In that case @out_transform
    * gets set to the identity matrix.
    *
    * To learn more about widget coordinate systems, see the coordinate system
    * [overview](coordinates.html).
    */
  @annotation.compileTimeOnly(
    "Method compute_transform contains an OUT parameter, which is not supported yet"
  )
  def computeTransform(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests if the point at (@x, @y) is contained in @widget.
    *
    * The coordinates for (@x, @y) must be in widget coordinates, so (0, 0) is
    * assumed to be the top left of @widget's content area.
    */
  def contains(x: Double, y: Double): Boolean =
    gtk_widget_contains(this.raw.asInstanceOf, x, y).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `PangoContext` with the appropriate font map, font options,
    * font description, and base direction for drawing text for this widget.
    *
    * See also [method@Gtk.Widget.get_pango_context].
    */
  def createPangoContext(): Context = new Context(
    gtk_widget_create_pango_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `PangoLayout` with the appropriate font map, font
    * description, and base direction for drawing text for this widget.
    *
    * If you keep a `PangoLayout` created in this way around, you need to
    * re-create it when the widget `PangoContext` is replaced. This can be
    * tracked by listening to changes of the [property@Gtk.Widget:root] property
    * on the widget.
    */
  def createPangoLayout(text: String | CString)(using Zone): Layout =
    new Layout(
      gtk_widget_create_pango_layout(
        this.raw.asInstanceOf,
        __sn_extract_string(text)
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears the template children for the given widget.
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
    */
  def disposeTemplate(widget_type: GType): Unit =
    gtk_widget_dispose_template(this.raw.asInstanceOf, widget_type)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks to see if a drag movement has passed the GTK drag threshold.
    */
  def dragCheckThreshold(
      start_x: Int,
      start_y: Int,
      current_x: Int,
      current_y: Int
  ): Boolean = gtk_drag_check_threshold(
    this.raw.asInstanceOf,
    start_x,
    start_y,
    current_x,
    current_y
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notifies the user about an input-related error on this widget.
    *
    * If the [property@Gtk.Settings:gtk-error-bell] setting is %TRUE, it calls
    * [method@Gdk.Surface.beep], otherwise it does nothing.
    *
    * Note that the effect of [method@Gdk.Surface.beep] can be configured in
    * many ways, depending on the windowing backend and the desktop environment
    * or window manager that is used.
    */
  def errorBell(): Unit = gtk_widget_error_bell(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the baseline that has currently been allocated to @widget.
    *
    * This function is intended to be used when implementing handlers for the
    * `GtkWidget`Class.snapshot() function, and when allocating child widgets in
    * `GtkWidget`Class.size_allocate().
    */
  def getAllocatedBaseline(): Int = gtk_widget_get_allocated_baseline(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the height that has currently been allocated to @widget.
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    */
  def getAllocatedHeight(): Int = gtk_widget_get_allocated_height(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the width that has currently been allocated to @widget.
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    */
  def getAllocatedWidth(): Int = gtk_widget_get_allocated_width(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the widget’s allocation.
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
    */
  @annotation.compileTimeOnly(
    "Method get_allocation contains an OUT parameter, which is not supported yet"
  )
  def getAllocation(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the first ancestor of @widget with type @widget_type.
    *
    * For example, `gtk_widget_get_ancestor (widget, GTK_TYPE_BOX)` gets the
    * first `GtkBox` that’s an ancestor of @widget. No reference will be added
    * to the returned widget; it should not be unreferenced.
    *
    * Note that unlike [method@Gtk.Widget.is_ancestor], this function considers @widget
    * to be an ancestor of itself.
    */
  def getAncestor(widget_type: GType): Widget = new Widget(
    gtk_widget_get_ancestor(this.raw.asInstanceOf, widget_type).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the baseline that has currently been allocated to @widget.
    *
    * This function is intended to be used when implementing handlers for the
    * `GtkWidget`Class.snapshot() function, and when allocating child widgets in
    * `GtkWidget`Class.size_allocate().
    */
  def getBaseline(): Int = gtk_widget_get_baseline(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether the input focus can enter @widget or any of its
    * children.
    *
    * See [method@Gtk.Widget.set_focusable].
    */
  def getCanFocus(): Boolean =
    gtk_widget_get_can_focus(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries whether @widget can be the target of pointer events.
    */
  def getCanTarget(): Boolean =
    gtk_widget_get_can_target(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set with gtk_widget_set_child_visible().
    *
    * If you feel a need to use this function, your code probably needs
    * reorganization.
    *
    * This function is only useful for container implementations and should
    * never be called by an application.
    */
  def getChildVisible(): Boolean =
    gtk_widget_get_child_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the clipboard object for @widget.
    *
    * This is a utility function to get the clipboard object for the
    * `GdkDisplay` that @widget is using.
    *
    * Note that this function always works, even when @widget is not realized
    * yet.
    */
  def getClipboard(): Clipboard = new Clipboard(
    gtk_widget_get_clipboard(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current foreground color for the widget’s CSS style.
    *
    * This function should only be used in snapshot implementations that need to
    * do custom drawing with the foreground color.
    */
  @annotation.compileTimeOnly(
    "Method get_color contains an OUT parameter, which is not supported yet"
  )
  def getColor(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the list of style classes applied to @widget.
    */
  def getCssClasses()(using Zone): Array[String] = __decode_nullable_ptrs(
    gtk_widget_get_css_classes(this.raw.asInstanceOf)
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the CSS name that is used for @self.
    */
  def getCssName()(using Zone): String = fromCString(
    gtk_widget_get_css_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the cursor set on @widget.
    *
    * See [method@Gtk.Widget.set_cursor] for details.
    */
  def getCursor(): Cursor = new Cursor(
    gtk_widget_get_cursor(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the reading direction for a particular widget.
    *
    * See [method@Gtk.Widget.set_direction].
    */
  def getDirection(): GtkTextDirection = gtk_widget_get_direction(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the `GdkDisplay` for the toplevel window associated with this widget.
    *
    * This function can only be called after the widget has been added to a
    * widget hierarchy with a `GtkWindow` at the top.
    *
    * In general, you should only create display specific resources when a
    * widget has been realized, and you should free those resources when the
    * widget is unrealized.
    */
  def getDisplay(): Display = new Display(
    gtk_widget_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget’s first child.
    *
    * This API is primarily meant for widget implementations.
    */
  def getFirstChild(): Widget = new Widget(
    gtk_widget_get_first_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current focus child of @widget.
    */
  def getFocusChild(): Widget = new Widget(
    gtk_widget_get_focus_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the widget should grab focus when it is clicked with the
    * mouse.
    *
    * See [method@Gtk.Widget.set_focus_on_click].
    */
  def getFocusOnClick(): Boolean =
    gtk_widget_get_focus_on_click(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether @widget can own the input focus.
    *
    * See [method@Gtk.Widget.set_focusable].
    */
  def getFocusable(): Boolean =
    gtk_widget_get_focusable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the font map of @widget.
    *
    * See [method@Gtk.Widget.set_font_map].
    */
  def getFontMap(): FontMap = new FontMap(
    gtk_widget_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `cairo_font_options_t` of widget.
    *
    * Seee [method@Gtk.Widget.set_font_options].
    */
  def getFontOptions(): Ptr[cairo_font_options_t] = gtk_widget_get_font_options(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the frame clock for a widget.
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
    */
  def getFrameClock(): FrameClock = new FrameClock(
    gtk_widget_get_frame_clock(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the horizontal alignment of @widget.
    *
    * For backwards compatibility reasons this method will never return one of
    * the baseline alignments, but instead it will convert it to
    * `GTK_ALIGN_FILL` or `GTK_ALIGN_CENTER`.
    *
    * Baselines are not supported for horizontal alignment.
    */
  def getHalign(): GtkAlign = gtk_widget_get_halign(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current value of the `has-tooltip` property.
    */
  def getHasTooltip(): Boolean =
    gtk_widget_get_has_tooltip(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the content height of the widget.
    *
    * This function returns the height passed to its size-allocate
    * implementation, which is the height you should be using in
    * [vfunc@Gtk.Widget.snapshot].
    *
    * For pointer events, see [method@Gtk.Widget.contains].
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    */
  def getHeight(): Int = gtk_widget_get_height(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the widget would like any available extra horizontal space.
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
    */
  def getHexpand(): Boolean =
    gtk_widget_get_hexpand(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether gtk_widget_set_hexpand() has been used to explicitly set the
    * expand flag on this widget.
    *
    * If [property@Gtk.Widget:hexpand] property is set, then it overrides any
    * computed expand value based on child widgets. If `hexpand` is not set,
    * then the expand value depends on whether any children of the widget would
    * like to expand.
    *
    * There are few reasons to use this function, but it’s here for completeness
    * and consistency.
    */
  def getHexpandSet(): Boolean =
    gtk_widget_get_hexpand_set(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget’s last child.
    *
    * This API is primarily meant for widget implementations.
    */
  def getLastChild(): Widget = new Widget(
    gtk_widget_get_last_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the layout manager used by @widget.
    *
    * See [method@Gtk.Widget.set_layout_manager].
    */
  def getLayoutManager(): LayoutManager = new LayoutManager(
    gtk_widget_get_layout_manager(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Whether the widget is mapped.
    */
  def getMapped(): Boolean =
    gtk_widget_get_mapped(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the bottom margin of @widget.
    */
  def getMarginBottom(): Int = gtk_widget_get_margin_bottom(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the end margin of @widget.
    */
  def getMarginEnd(): Int = gtk_widget_get_margin_end(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the start margin of @widget.
    */
  def getMarginStart(): Int = gtk_widget_get_margin_start(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the top margin of @widget.
    */
  def getMarginTop(): Int = gtk_widget_get_margin_top(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the name of a widget.
    *
    * See [method@Gtk.Widget.set_name] for the significance of widget names.
    */
  def getName()(using Zone): String = fromCString(
    gtk_widget_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the nearest `GtkNative` ancestor of @widget.
    *
    * This function will return %NULL if the widget is not contained inside a
    * widget tree with a native ancestor.
    *
    * `GtkNative` widgets will return themselves here.
    */
  def getNative(): Native = new Native.Abstract(
    gtk_widget_get_native(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget’s next sibling.
    *
    * This API is primarily meant for widget implementations.
    */
  def getNextSibling(): Widget = new Widget(
    gtk_widget_get_next_sibling(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * #Fetches the requested opacity for this widget.
    *
    * See [method@Gtk.Widget.set_opacity].
    */
  def getOpacity(): Double = gtk_widget_get_opacity(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget’s overflow value.
    */
  def getOverflow(): GtkOverflow = gtk_widget_get_overflow(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a `PangoContext` with the appropriate font map, font description, and
    * base direction for this widget.
    *
    * Unlike the context returned by [method@Gtk.Widget.create_pango_context],
    * this context is owned by the widget (it can be used until the screen for
    * the widget changes or the widget is removed from its toplevel), and will
    * be updated to match any changes to the widget’s attributes. This can be
    * tracked by listening to changes of the [property@Gtk.Widget:root] property
    * on the widget.
    */
  def getPangoContext(): Context = new Context(
    gtk_widget_get_pango_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the parent widget of @widget.
    */
  def getParent(): Widget = new Widget(
    gtk_widget_get_parent(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the minimum and natural size of a widget, taking into account
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
    */
  @annotation.compileTimeOnly(
    "Method get_preferred_size contains an OUT parameter, which is not supported yet"
  )
  def getPreferredSize(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget’s previous sibling.
    *
    * This API is primarily meant for widget implementations.
    */
  def getPrevSibling(): Widget = new Widget(
    gtk_widget_get_prev_sibling(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the primary clipboard of @widget.
    *
    * This is a utility function to get the primary clipboard object for the
    * `GdkDisplay` that @widget is using.
    *
    * Note that this function always works, even when @widget is not realized
    * yet.
    */
  def getPrimaryClipboard(): Clipboard = new Clipboard(
    gtk_widget_get_primary_clipboard(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether @widget is realized.
    */
  def getRealized(): Boolean =
    gtk_widget_get_realized(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether @widget is always treated as the default widget within
    * its toplevel when it has the focus, even if another widget is the default.
    *
    * See [method@Gtk.Widget.set_receives_default].
    */
  def getReceivesDefault(): Boolean =
    gtk_widget_get_receives_default(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the widget prefers a height-for-width layout or a
    * width-for-height layout.
    *
    * Single-child widgets generally propagate the preference of their child,
    * more complex widgets need to request something either in context of their
    * children or in context of their allocation capabilities.
    */
  def getRequestMode(): GtkSizeRequestMode = gtk_widget_get_request_mode(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkRoot` widget of @widget.
    *
    * This function will return %NULL if the widget is not contained inside a
    * widget tree with a root widget.
    *
    * `GtkRoot` widgets will return themselves here.
    */
  def getRoot(): Root =
    new Root.Abstract(gtk_widget_get_root(this.raw.asInstanceOf).asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the internal scale factor that maps from window coordinates to
    * the actual device pixels.
    *
    * On traditional systems this is 1, on high density outputs, it can be a
    * higher value (typically 2).
    *
    * See [method@Gdk.Surface.get_scale_factor].
    */
  def getScaleFactor(): Int = gtk_widget_get_scale_factor(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget’s sensitivity.
    *
    * This function returns the value that has been set using
    * [method@Gtk.Widget.set_sensitive]).
    *
    * The effective sensitivity of a widget is however determined by both its
    * own and its parent widget’s sensitivity. See
    * [method@Gtk.Widget.is_sensitive].
    */
  def getSensitive(): Boolean =
    gtk_widget_get_sensitive(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the settings object holding the settings used for this widget.
    *
    * Note that this function can only be called when the `GtkWidget` is
    * attached to a toplevel, since the settings object is specific to a
    * particular `GdkDisplay`. If you want to monitor the widget for changes in
    * its settings, connect to the `notify::display` signal.
    */
  def getSettings(): Settings = new Settings(
    gtk_widget_get_settings(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the content width or height of the widget.
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
    */
  def getSize(orientation: GtkOrientation): Int =
    gtk_widget_get_size(this.raw.asInstanceOf, orientation)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the size request that was explicitly set for the widget using
    * gtk_widget_set_size_request().
    *
    * A value of -1 stored in @width or @height indicates that that dimension
    * has not been set explicitly and the natural requisition of the widget will
    * be used instead. See [method@Gtk.Widget.set_size_request]. To get the size
    * a widget will actually request, call [method@Gtk.Widget.measure] instead
    * of this function.
    */
  @annotation.compileTimeOnly(
    "Method get_size_request contains an OUT parameter, which is not supported yet"
  )
  def getSizeRequest(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget state as a flag set.
    *
    * It is worth mentioning that the effective %GTK_STATE_FLAG_INSENSITIVE
    * state will be returned, that is, also based on parent insensitivity, even
    * if @widget itself is sensitive.
    *
    * Also note that if you are looking for a way to obtain the
    * [flags@Gtk.StateFlags] to pass to a [class@Gtk.StyleContext] method, you
    * should look at [method@Gtk.StyleContext.get_state].
    */
  def getStateFlags(): GtkStateFlags = gtk_widget_get_state_flags(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the style context associated to @widget.
    *
    * The returned object is guaranteed to be the same for the lifetime of @widget.
    */
  def getStyleContext(): StyleContext = new StyleContext(
    gtk_widget_get_style_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetch an object build from the template XML for @widget_type in this @widget
    * instance.
    *
    * This will only report children which were previously declared with
    * [method@Gtk.WidgetClass.bind_template_child_full] or one of its variants.
    *
    * This function is only meant to be called for code which is private to the @widget_type
    * which declared the child and is meant for language bindings which cannot
    * easily make use of the GObject structure offsets.
    */
  def getTemplateChild(widget_type: GType, name: String | CString)(using
      Zone
  ): Object = new Object(
    gtk_widget_get_template_child(
      this.raw.asInstanceOf,
      widget_type,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the contents of the tooltip for @widget.
    *
    * If the tooltip has not been set using
    * [method@Gtk.Widget.set_tooltip_markup], this function returns %NULL.
    */
  def getTooltipMarkup()(using Zone): String = fromCString(
    gtk_widget_get_tooltip_markup(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the contents of the tooltip for @widget.
    *
    * If the @widget's tooltip was set using
    * [method@Gtk.Widget.set_tooltip_markup], this function will return the
    * escaped text.
    */
  def getTooltipText()(using Zone): String = fromCString(
    gtk_widget_get_tooltip_text(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the vertical alignment of @widget.
    */
  def getValign(): GtkAlign = gtk_widget_get_valign(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the widget would like any available extra vertical space.
    *
    * See [method@Gtk.Widget.get_hexpand] for more detail.
    */
  def getVexpand(): Boolean =
    gtk_widget_get_vexpand(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether gtk_widget_set_vexpand() has been used to explicitly set the
    * expand flag on this widget.
    *
    * See [method@Gtk.Widget.get_hexpand_set] for more detail.
    */
  def getVexpandSet(): Boolean =
    gtk_widget_get_vexpand_set(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether the widget is visible.
    *
    * If you want to take into account whether the widget’s parent is also
    * marked as visible, use [method@Gtk.Widget.is_visible] instead.
    *
    * This function does not check if the widget is obscured in any way.
    *
    * See [method@Gtk.Widget.set_visible].
    */
  def getVisible(): Boolean =
    gtk_widget_get_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the content width of the widget.
    *
    * This function returns the width passed to its size-allocate
    * implementation, which is the width you should be using in
    * [vfunc@Gtk.Widget.snapshot].
    *
    * For pointer events, see [method@Gtk.Widget.contains].
    *
    * To learn more about widget sizes, see the coordinate system
    * [overview](coordinates.html).
    */
  def getWidth(): Int = gtk_widget_get_width(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes @widget to have the keyboard focus for the `GtkWindow` it's inside.
    *
    * If @widget is not focusable, or its [vfunc@Gtk.Widget.grab_focus]
    * implementation cannot transfer the focus to a descendant of @widget that
    * is focusable, it will not take focus and %FALSE will be returned.
    *
    * Calling [method@Gtk.Widget.grab_focus] on an already focused widget is
    * allowed, should not have an effect, and return %TRUE.
    */
  def grabFocus(): Boolean =
    gtk_widget_grab_focus(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @css_class is currently applied to @widget.
    */
  def hasCssClass(css_class: String | CString)(using Zone): Boolean =
    gtk_widget_has_css_class(
      this.raw.asInstanceOf,
      __sn_extract_string(css_class)
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether @widget is the current default widget within its
    * toplevel.
    */
  def hasDefault(): Boolean =
    gtk_widget_has_default(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines if the widget has the global input focus.
    *
    * See [method@Gtk.Widget.is_focus] for the difference between having the
    * global input focus, and only having the focus within a toplevel.
    */
  def hasFocus(): Boolean =
    gtk_widget_has_focus(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines if the widget should show a visible indication that it has the
    * global input focus.
    *
    * This is a convenience function that takes into account whether focus
    * indication should currently be shown in the toplevel window of @widget.
    * See [method@Gtk.Window.get_focus_visible] for more information about focus
    * indication.
    *
    * To find out if the widget has the global input focus, use
    * [method@Gtk.Widget.has_focus].
    */
  def hasVisibleFocus(): Boolean =
    gtk_widget_has_visible_focus(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reverses the effects of gtk_widget_show().
    *
    * This is causing the widget to be hidden (invisible to the user).
    */
  def hide(): Unit = gtk_widget_hide(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the widget is currently being destroyed.
    *
    * This information can sometimes be used to avoid doing unnecessary work.
    */
  def inDestruction(): Boolean =
    gtk_widget_in_destruction(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates and initializes child widgets defined in templates.
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
    */
  def initTemplate(): Unit = gtk_widget_init_template(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @group into @widget.
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
    */
  def insertActionGroup(name: String | CString, group: ActionGroup)(using
      Zone
  ): Unit = gtk_widget_insert_action_group(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    group.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @widget into the child widget list of @parent.
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
    */
  def insertAfter(parent: Widget, previous_sibling: Widget): Unit =
    gtk_widget_insert_after(
      this.raw.asInstanceOf,
      parent.getUnsafeRawPointer().asInstanceOf,
      previous_sibling.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @widget into the child widget list of @parent.
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
    */
  def insertBefore(parent: Widget, next_sibling: Widget): Unit =
    gtk_widget_insert_before(
      this.raw.asInstanceOf,
      parent.getUnsafeRawPointer().asInstanceOf,
      next_sibling.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether @widget is somewhere inside @ancestor, possibly with
    * intermediate containers.
    */
  def isAncestor(ancestor: Widget): Boolean = gtk_widget_is_ancestor(
    this.raw.asInstanceOf,
    ancestor.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether @widget can be drawn to.
    *
    * A widget can be drawn if it is mapped and visible.
    */
  def isDrawable(): Boolean =
    gtk_widget_is_drawable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines if the widget is the focus widget within its toplevel.
    *
    * This does not mean that the [property@Gtk.Widget:has-focus] property is
    * necessarily set; [property@Gtk.Widget:has-focus] will only be set if the
    * toplevel widget additionally has the global input focus.
    */
  def isFocus(): Boolean =
    gtk_widget_is_focus(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widget’s effective sensitivity.
    *
    * This means it is sensitive itself and also its parent widget is sensitive.
    */
  def isSensitive(): Boolean =
    gtk_widget_is_sensitive(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether the widget and all its parents are marked as visible.
    *
    * This function does not check if the widget is obscured in any way.
    *
    * See also [method@Gtk.Widget.get_visible] and
    * [method@Gtk.Widget.set_visible].
    */
  def isVisible(): Boolean =
    gtk_widget_is_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the `::keynav-failed` signal on the widget.
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
    */
  def keynavFailed(direction: GtkDirectionType): Boolean =
    gtk_widget_keynav_failed(this.raw.asInstanceOf, direction).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the widgets for which this widget is the target of a mnemonic.
    *
    * Typically, these widgets will be labels. See, for example,
    * [method@Gtk.Label.set_mnemonic_widget].
    *
    * The widgets in the list are not individually referenced. If you want to
    * iterate through the list and perform actions involving callbacks that
    * might destroy the widgets, you must call
    * `g_list_foreach (result, (GFunc)g_object_ref, NULL)` first, and then unref
    * all the widgets afterwards.
    */
  def listMnemonicLabels(): Ptr[GList] = gtk_widget_list_mnemonic_labels(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes a widget to be mapped if it isn’t already.
    *
    * This function is only for use in widget implementations.
    */
  def map(): Unit = gtk_widget_map(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Measures @widget in the orientation @orientation and for the given @for_size.
    *
    * As an example, if @orientation is %GTK_ORIENTATION_HORIZONTAL and @for_size
    * is 300, this functions will compute the minimum and natural width of @widget
    * if it is allocated at a height of 300 pixels.
    *
    * See [GtkWidget’s geometry management
    * section](class.Widget.html#height-for-width-geometry-management) for a
    * more details on implementing `GtkWidgetClass.measure()`.
    */
  @annotation.compileTimeOnly(
    "Method measure contains an OUT parameter, which is not supported yet"
  )
  def measure(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the ::mnemonic-activate signal.
    *
    * See [signal@Gtk.Widget::mnemonic-activate].
    */
  def mnemonicActivate(group_cycling: Boolean): Boolean =
    gtk_widget_mnemonic_activate(
      this.raw.asInstanceOf,
      gboolean(gint((if group_cycling == true then 1 else 0)))
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a `GListModel` to track the children of @widget.
    *
    * Calling this function will enable extra internal bookkeeping to track
    * children and emit signals on the returned listmodel. It may slow down
    * operations a lot.
    *
    * Applications should try hard to avoid calling this function because of the
    * slowdowns.
    */
  def observeChildren(): ListModel = new ListModel.Abstract(
    gtk_widget_observe_children(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a `GListModel` to track the [class@Gtk.EventController]s of @widget.
    *
    * Calling this function will enable extra internal bookkeeping to track
    * controllers and emit signals on the returned listmodel. It may slow down
    * operations a lot.
    *
    * Applications should try hard to avoid calling this function because of the
    * slowdowns.
    */
  def observeControllers(): ListModel = new ListModel.Abstract(
    gtk_widget_observe_controllers(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the descendant of @widget closest to the point (@x, @y).
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
    */
  def pick(x: Double, y: Double, flags: GtkPickFlags): Widget = new Widget(
    gtk_widget_pick(this.raw.asInstanceOf, x, y, flags).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags the widget for a rerun of the [vfunc@Gtk.Widget.size_allocate]
    * function.
    *
    * Use this function instead of [method@Gtk.Widget.queue_resize] when the @widget's
    * size request didn't change but it wants to reposition its contents.
    *
    * An example user of this function is [method@Gtk.Widget.set_halign].
    *
    * This function is only for use in widget implementations.
    */
  def queueAllocate(): Unit = gtk_widget_queue_allocate(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Schedules this widget to be redrawn in the paint phase of the current or
    * the next frame.
    *
    * This means @widget's [vfunc@Gtk.Widget.snapshot] implementation will be
    * called.
    */
  def queueDraw(): Unit = gtk_widget_queue_draw(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags a widget to have its size renegotiated.
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
    */
  def queueResize(): Unit = gtk_widget_queue_resize(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates the GDK resources associated with a widget.
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
    */
  def realize(): Unit = gtk_widget_realize(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @controller from @widget, so that it doesn't process events
    * anymore.
    *
    * It should not be used again.
    *
    * Widgets will remove all event controllers automatically when they are
    * destroyed, there is normally no need to call this function.
    */
  def removeController(controller: EventController): Unit =
    gtk_widget_remove_controller(
      this.raw.asInstanceOf,
      controller.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a style from @widget.
    *
    * After this, the style of @widget will stop matching for @css_class.
    */
  def removeCssClass(css_class: String | CString)(using Zone): Unit =
    gtk_widget_remove_css_class(
      this.raw.asInstanceOf,
      __sn_extract_string(css_class)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a widget from the list of mnemonic labels for this widget.
    *
    * See [method@Gtk.Widget.list_mnemonic_labels]. The widget must have
    * previously been added to the list with
    * [method@Gtk.Widget.add_mnemonic_label].
    */
  def removeMnemonicLabel(label: Widget): Unit =
    gtk_widget_remove_mnemonic_label(
      this.raw.asInstanceOf,
      label.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a tick callback previously registered with
    * gtk_widget_add_tick_callback().
    */
  def removeTickCallback(id: UInt): Unit =
    gtk_widget_remove_tick_callback(this.raw.asInstanceOf, guint(id))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies whether the input focus can enter the widget or any of its
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
    */
  def setCanFocus(can_focus: Boolean): Unit = gtk_widget_set_can_focus(
    this.raw.asInstanceOf,
    gboolean(gint((if can_focus == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @widget can be the target of pointer events.
    */
  def setCanTarget(can_target: Boolean): Unit = gtk_widget_set_can_target(
    this.raw.asInstanceOf,
    gboolean(gint((if can_target == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @widget should be mapped along with its parent.
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
    */
  def setChildVisible(child_visible: Boolean): Unit =
    gtk_widget_set_child_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if child_visible == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clear all style classes applied to @widget and replace them with @classes.
    */
  def setCssClasses(classes: Ptr[CString])(using Zone): Unit =
    gtk_widget_set_css_classes(this.raw.asInstanceOf, classes)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the cursor to be shown when pointer devices point towards @widget.
    *
    * If the @cursor is NULL, @widget will use the cursor inherited from the
    * parent widget.
    */
  def setCursor(cursor: Cursor): Unit = gtk_widget_set_cursor(
    this.raw.asInstanceOf,
    cursor.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a named cursor to be shown when pointer devices point towards @widget.
    *
    * This is a utility function that creates a cursor via
    * [ctor@Gdk.Cursor.new_from_name] and then sets it on @widget with
    * [method@Gtk.Widget.set_cursor]. See those functions for details.
    *
    * On top of that, this function allows @name to be %NULL, which will do the
    * same as calling [method@Gtk.Widget.set_cursor] with a %NULL cursor.
    */
  def setCursorFromName(name: String | CString)(using Zone): Unit =
    gtk_widget_set_cursor_from_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the reading direction on a particular widget.
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
    */
  def setDirection(dir: GtkTextDirection): Unit =
    gtk_widget_set_direction(this.raw.asInstanceOf, dir)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set @child as the current focus child of @widget.
    *
    * This function is only suitable for widget implementations. If you want a
    * certain widget to get the input focus, call [method@Gtk.Widget.grab_focus]
    * on it.
    */
  def setFocusChild(child: Widget): Unit = gtk_widget_set_focus_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the widget should grab focus when it is clicked with the
    * mouse.
    *
    * Making mouse clicks not grab focus is useful in places like toolbars where
    * you don’t want the keyboard focus removed from the main area of the
    * application.
    */
  def setFocusOnClick(focus_on_click: Boolean): Unit =
    gtk_widget_set_focus_on_click(
      this.raw.asInstanceOf,
      gboolean(gint((if focus_on_click == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies whether @widget can own the input focus.
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
    */
  def setFocusable(focusable: Boolean): Unit = gtk_widget_set_focusable(
    this.raw.asInstanceOf,
    gboolean(gint((if focusable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the font map to use for Pango rendering.
    *
    * The font map is the object that is used to look up fonts. Setting a custom
    * font map can be useful in special situations, e.g. when you need to add
    * application-specific fonts to the set of available fonts.
    *
    * When not set, the widget will inherit the font map from its parent.
    */
  def setFontMap(font_map: FontMap): Unit = gtk_widget_set_font_map(
    this.raw.asInstanceOf,
    font_map.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `cairo_font_options_t` used for Pango rendering in this widget.
    *
    * When not set, the default font options for the `GdkDisplay` will be used.
    */
  def setFontOptions(options: Ptr[cairo_font_options_t]): Unit =
    gtk_widget_set_font_options(this.raw.asInstanceOf, options)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the horizontal alignment of @widget.
    */
  def setHalign(align: GtkAlign): Unit =
    gtk_widget_set_halign(this.raw.asInstanceOf, align)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `has-tooltip` property on @widget to @has_tooltip.
    */
  def setHasTooltip(has_tooltip: Boolean): Unit = gtk_widget_set_has_tooltip(
    this.raw.asInstanceOf,
    gboolean(gint((if has_tooltip == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the widget would like any available extra horizontal space.
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
    */
  def setHexpand(expand: Boolean): Unit = gtk_widget_set_hexpand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the hexpand flag will be used.
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
    */
  def setHexpandSet(set: Boolean): Unit = gtk_widget_set_hexpand_set(
    this.raw.asInstanceOf,
    gboolean(gint((if set == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the layout manager delegate instance that provides an implementation
    * for measuring and allocating the children of @widget.
    */
  def setLayoutManager(layout_manager: LayoutManager): Unit =
    gtk_widget_set_layout_manager(
      this.raw.asInstanceOf,
      layout_manager.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the bottom margin of @widget.
    */
  def setMarginBottom(margin: Int): Unit =
    gtk_widget_set_margin_bottom(this.raw.asInstanceOf, margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the end margin of @widget.
    */
  def setMarginEnd(margin: Int): Unit =
    gtk_widget_set_margin_end(this.raw.asInstanceOf, margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the start margin of @widget.
    */
  def setMarginStart(margin: Int): Unit =
    gtk_widget_set_margin_start(this.raw.asInstanceOf, margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the top margin of @widget.
    */
  def setMarginTop(margin: Int): Unit =
    gtk_widget_set_margin_top(this.raw.asInstanceOf, margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a widgets name.
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
    */
  def setName(name: String | CString)(using Zone): Unit =
    gtk_widget_set_name(this.raw.asInstanceOf, __sn_extract_string(name))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Request the @widget to be rendered partially transparent.
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
    */
  def setOpacity(opacity: Double): Unit =
    gtk_widget_set_opacity(this.raw.asInstanceOf, opacity)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets how @widget treats content that is drawn outside the widget's content
    * area.
    *
    * See the definition of [enum@Gtk.Overflow] for details.
    *
    * This setting is provided for widget implementations and should not be used
    * by application code.
    *
    * The default value is %GTK_OVERFLOW_VISIBLE.
    */
  def setOverflow(overflow: GtkOverflow): Unit =
    gtk_widget_set_overflow(this.raw.asInstanceOf, overflow)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @parent as the parent widget of @widget.
    *
    * This takes care of details such as updating the state and style of the
    * child to reflect its new location and resizing the parent. The opposite
    * function is [method@Gtk.Widget.unparent].
    *
    * This function is useful only when implementing subclasses of `GtkWidget`.
    */
  def setParent(parent: Widget): Unit = gtk_widget_set_parent(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies whether @widget will be treated as the default widget within its
    * toplevel when it has the focus, even if another widget is the default.
    */
  def setReceivesDefault(receives_default: Boolean): Unit =
    gtk_widget_set_receives_default(
      this.raw.asInstanceOf,
      gboolean(gint((if receives_default == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the sensitivity of a widget.
    *
    * A widget is sensitive if the user can interact with it. Insensitive
    * widgets are “grayed out” and the user can’t interact with them.
    * Insensitive widgets are known as “inactive”, “disabled”, or “ghosted” in
    * some other toolkits.
    */
  def setSensitive(sensitive: Boolean): Unit = gtk_widget_set_sensitive(
    this.raw.asInstanceOf,
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum size of a widget.
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
    */
  def setSizeRequest(width: Int, height: Int): Unit =
    gtk_widget_set_size_request(this.raw.asInstanceOf, width, height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns on flag values in the current widget state.
    *
    * Typical widget states are insensitive, prelighted, etc.
    *
    * This function accepts the values %GTK_STATE_FLAG_DIR_LTR and
    * %GTK_STATE_FLAG_DIR_RTL but ignores them. If you want to set the widget's
    * direction, use [method@Gtk.Widget.set_direction].
    *
    * This function is for use in widget implementations.
    */
  def setStateFlags(flags: GtkStateFlags, clear: Boolean): Unit =
    gtk_widget_set_state_flags(
      this.raw.asInstanceOf,
      flags,
      gboolean(gint((if clear == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @markup as the contents of the tooltip, which is marked up with Pango
    * markup.
    *
    * This function will take care of setting the
    * [property@Gtk.Widget:has-tooltip] as a side effect, and of the default
    * handler for the [signal@Gtk.Widget::query-tooltip] signal.
    *
    * See also [method@Gtk.Tooltip.set_markup].
    */
  def setTooltipMarkup(markup: String | CString)(using Zone): Unit =
    gtk_widget_set_tooltip_markup(
      this.raw.asInstanceOf,
      __sn_extract_string(markup)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @text as the contents of the tooltip.
    *
    * If @text contains any markup, it will be escaped.
    *
    * This function will take care of setting [property@Gtk.Widget:has-tooltip]
    * as a side effect, and of the default handler for the
    * [signal@Gtk.Widget::query-tooltip] signal.
    *
    * See also [method@Gtk.Tooltip.set_text].
    */
  def setTooltipText(text: String | CString)(using Zone): Unit =
    gtk_widget_set_tooltip_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the vertical alignment of @widget.
    */
  def setValign(align: GtkAlign): Unit =
    gtk_widget_set_valign(this.raw.asInstanceOf, align)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the widget would like any available extra vertical space.
    *
    * See [method@Gtk.Widget.set_hexpand] for more detail.
    */
  def setVexpand(expand: Boolean): Unit = gtk_widget_set_vexpand(
    this.raw.asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the vexpand flag will be used.
    *
    * See [method@Gtk.Widget.set_hexpand_set] for more detail.
    */
  def setVexpandSet(set: Boolean): Unit = gtk_widget_set_vexpand_set(
    this.raw.asInstanceOf,
    gboolean(gint((if set == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the visibility state of @widget.
    *
    * Note that setting this to %TRUE doesn’t mean the widget is actually
    * viewable, see [method@Gtk.Widget.get_visible].
    */
  def setVisible(visible: Boolean): Unit = gtk_widget_set_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @widget should contribute to the measuring and allocation
    * of its parent.
    *
    * This is %FALSE for invisible children, but also for children that have
    * their own surface.
    */
  def shouldLayout(): Boolean =
    gtk_widget_should_layout(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags a widget to be displayed.
    *
    * Any widget that isn’t shown will not appear on the screen.
    *
    * Remember that you have to show the containers containing a widget, in
    * addition to the widget itself, before it will appear onscreen.
    *
    * When a toplevel container is shown, it is immediately realized and mapped;
    * other shown widgets are realized and mapped when their toplevel container
    * is realized and mapped.
    */
  def show(): Unit = gtk_widget_show(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allocates widget with a transformation that translates the origin to the
    * position in @allocation.
    *
    * This is a simple form of [method@Gtk.Widget.allocate].
    */
  def sizeAllocate(allocation: Ptr[GtkAllocation], baseline: Int): Unit =
    gtk_widget_size_allocate(this.raw.asInstanceOf, allocation, baseline)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Snapshot the a child of @widget.
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
    */
  def snapshotChild(child: Widget, snapshot: Snapshot): Unit =
    gtk_widget_snapshot_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      snapshot.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Translate coordinates relative to @src_widget’s allocation to coordinates
    * relative to @dest_widget’s allocations.
    *
    * In order to perform this operation, both widget must share a common
    * ancestor.
    */
  @annotation.compileTimeOnly(
    "Method translate_coordinates contains an OUT parameter, which is not supported yet"
  )
  def translateCoordinates(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Triggers a tooltip query on the display where the toplevel of @widget is
    * located.
    */
  def triggerTooltipQuery(): Unit = gtk_widget_trigger_tooltip_query(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes a widget to be unmapped if it’s currently mapped.
    *
    * This function is only for use in widget implementations.
    */
  def unmap(): Unit = gtk_widget_unmap(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dissociate @widget from its parent.
    *
    * This function is only for use in widget implementations, typically in
    * dispose.
    */
  def unparent(): Unit = gtk_widget_unparent(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes a widget to be unrealized (frees all GDK resources associated with
    * the widget).
    *
    * This function is only useful in widget implementations.
    */
  def unrealize(): Unit = gtk_widget_unrealize(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns off flag values for the current widget state.
    *
    * See [method@Gtk.Widget.set_state_flags].
    *
    * This function is for use in widget implementations.
    */
  def unsetStateFlags(flags: GtkStateFlags): Unit =
    gtk_widget_unset_state_flags(this.raw.asInstanceOf, flags)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs
end Widget

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Display
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.StyleProvider
import sn.gnome.gtk4.internal.GtkStateFlags
import sn.gnome.gtk4.internal.GtkStyleContext
import sn.gnome.gtk4.internal.GtkStyleContextPrintFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkStyleContext` stores styling information affecting a widget.
  *
  * In order to construct the final style information, `GtkStyleContext` queries
  * information from all attached `GtkStyleProviders`. Style providers can be
  * either attached explicitly to the context through
  * [method@Gtk.StyleContext.add_provider], or to the display through
  * [func@Gtk.StyleContext.add_provider_for_display]. The resulting style is a
  * combination of all providers’ information in priority order.
  *
  * For GTK widgets, any `GtkStyleContext` returned by
  * [method@Gtk.Widget.get_style_context] will already have a `GdkDisplay` and
  * RTL/LTR information set. The style context will also be updated
  * automatically if any of these settings change on the widget.
  *
  * ## Style Classes
  *
  * Widgets can add style classes to their context, which can be used to
  * associate different styles by class. The documentation for individual
  * widgets lists which style classes it uses itself, and which style classes
  * may be added by applications to affect their appearance.
  *
  * # Custom styling in UI libraries and applications
  *
  * If you are developing a library with custom widgets that render differently
  * than standard components, you may need to add a `GtkStyleProvider` yourself
  * with the %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK priority, either a
  * `GtkCssProvider` or a custom object implementing the `GtkStyleProvider`
  * interface. This way themes may still attempt to style your UI elements in a
  * different way if needed so.
  *
  * If you are using custom styling on an applications, you probably want then
  * to make your style information prevail to the theme’s, so you must use a
  * `GtkStyleProvider` with the %GTK_STYLE_PROVIDER_PRIORITY_APPLICATION
  * priority, keep in mind that the user settings in
  * `XDG_CONFIG_HOME/gtk-4.0/gtk.css` will still take precedence over your
  * changes, as it uses the %GTK_STYLE_PROVIDER_PRIORITY_USER priority.
  */
class StyleContext(raw: Ptr[GtkStyleContext]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a style class to @context, so later uses of the style context will
    * make use of this new class for styling.
    *
    * In the CSS file format, a `GtkEntry` defining a “search” class, would be
    * matched by:
    *
    * ```css
    * entry.search { ... }
    * ```
    *
    * While any widget defining a “search” class would be matched by:
    * ```css
    * .search { ... }
    * ```
    */
  def addClass(
      class_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_style_context_add_class(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]],
    __sn_extract_string(class_name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a style provider to @context, to be used in style construction.
    *
    * Note that a style provider added by this function only affects the style
    * of the widget to which @context belongs. If you want to affect the style
    * of all widgets, use [func@Gtk.StyleContext.add_provider_for_display].
    *
    * Note: If both priorities are the same, a `GtkStyleProvider` added through
    * this function takes precedence over another added through
    * [func@Gtk.StyleContext.add_provider_for_display].
    */
  def addProvider(
      provider: StyleProvider /* Some(Ptr[GtkStyleProvider]) */,
      priority: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_style_context_add_provider(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]],
    provider.getUnsafeRawPointer().asInstanceOf,
    guint(priority)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the border for a given state as a `GtkBorder`.
    */
  @annotation.compileTimeOnly(
    "Method get_border contains an OUT parameter, which is not supported yet"
  )
  private def getBorder__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the foreground color for a given state.
    */
  @annotation.compileTimeOnly(
    "Method get_color contains an OUT parameter, which is not supported yet"
  )
  private def getColor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDisplay` to which @context is attached.
    */
  def getDisplay(): Display /* None */ = new Display(
    gtk_style_context_get_display(
      this.raw.asInstanceOf[Ptr[GtkStyleContext]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the margin for a given state as a `GtkBorder`.
    */
  @annotation.compileTimeOnly(
    "Method get_margin contains an OUT parameter, which is not supported yet"
  )
  private def getMargin__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the padding for a given state as a `GtkBorder`.
    */
  @annotation.compileTimeOnly(
    "Method get_padding contains an OUT parameter, which is not supported yet"
  )
  private def getPadding__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the scale used for assets.
    */
  def getScale(): Int /* None */ = gtk_style_context_get_scale(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the state used for style matching.
    *
    * This method should only be used to retrieve the `GtkStateFlags` to pass to
    * `GtkStyleContext` methods, like [method@Gtk.StyleContext.get_padding]. If
    * you need to retrieve the current state of a `GtkWidget`, use
    * [method@Gtk.Widget.get_state_flags].
    */
  def getState(): GtkStateFlags /* None */ = gtk_style_context_get_state(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if @context currently has defined the given class name.
    */
  def hasClass(
      class_name: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_style_context_has_class(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]],
    __sn_extract_string(class_name)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up and resolves a color name in the @context color map.
    */
  @annotation.compileTimeOnly(
    "Method lookup_color contains an OUT parameter, which is not supported yet"
  )
  private def lookupColor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @class_name from @context.
    */
  def removeClass(
      class_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_style_context_remove_class(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]],
    __sn_extract_string(class_name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @provider from the style providers list in @context.
    */
  def removeProvider(
      provider: StyleProvider /* Some(Ptr[GtkStyleProvider]) */
  ): Unit /* None */ = gtk_style_context_remove_provider(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]],
    provider.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Restores @context state to a previous stage.
    *
    * See [method@Gtk.StyleContext.save].
    */
  def restore(): Unit /* None */ = gtk_style_context_restore(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Saves the @context state.
    *
    * This allows temporary modifications done through
    * [method@Gtk.StyleContext.add_class],
    * [method@Gtk.StyleContext.remove_class],
    * [method@Gtk.StyleContext.set_state] to be quickly reverted in one go
    * through [method@Gtk.StyleContext.restore].
    *
    * The matching call to [method@Gtk.StyleContext.restore] must be done before
    * GTK returns to the main loop.
    */
  def save(): Unit /* None */ = gtk_style_context_save(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches @context to the given display.
    *
    * The display is used to add style information from “global” style
    * providers, such as the display's `GtkSettings` instance.
    *
    * If you are using a `GtkStyleContext` returned from
    * [method@Gtk.Widget.get_style_context], you do not need to call this
    * yourself.
    */
  def setDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  ): Unit /* None */ = gtk_style_context_set_display(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]],
    display.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the scale to use when getting image assets for the style.
    */
  def setScale(scale: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_style_context_set_scale(
      this.raw.asInstanceOf[Ptr[GtkStyleContext]],
      scale
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the state to be used for style matching.
    */
  def setState(
      flags: GtkStateFlags /* Some(GtkStateFlags) */
  ): Unit /* None */ = gtk_style_context_set_state(
    this.raw.asInstanceOf[Ptr[GtkStyleContext]],
    flags
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts the style context into a string representation.
    *
    * The string representation always includes information about the name,
    * state, id, visibility and style classes of the CSS node that is backing @context.
    * Depending on the flags, more information may be included.
    *
    * This function is intended for testing and debugging of the CSS
    * implementation in GTK. There are no guarantees about the format of the
    * returned string, it may change.
    */
  def toString(
      flags: GtkStyleContextPrintFlags /* Some(GtkStyleContextPrintFlags) */
  )(using Zone): String /* None */ = fromCString(
    gtk_style_context_to_string(
      this.raw.asInstanceOf[Ptr[GtkStyleContext]],
      flags
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
end StyleContext

object StyleContext:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a global style provider to @display, which will be used in style
    * construction for all `GtkStyleContexts` under @display.
    *
    * GTK uses this to make styling information from `GtkSettings` available.
    *
    * Note: If both priorities are the same, A `GtkStyleProvider` added through
    * [method@Gtk.StyleContext.add_provider] takes precedence over another added
    * through this function.
    */
  def addProviderForDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */,
      provider: StyleProvider /* Some(Ptr[GtkStyleProvider]) */,
      priority: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_style_context_add_provider_for_display(
    display.getUnsafeRawPointer().asInstanceOf,
    provider.getUnsafeRawPointer().asInstanceOf,
    guint(priority)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @provider from the global style providers list in @display.
    */
  def removeProviderForDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */,
      provider: StyleProvider /* Some(Ptr[GtkStyleProvider]) */
  ): Unit /* None */ = gtk_style_context_remove_provider_for_display(
    display.getUnsafeRawPointer().asInstanceOf,
    provider.getUnsafeRawPointer().asInstanceOf
  )

end StyleContext

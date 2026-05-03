package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.ContentProvider
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.gunichar
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.EntryBuffer
import sn.gnome.gtk4.fluent.EntryCompletion
import sn.gnome.gtk4.fluent.EntryIconPosition
import sn.gnome.gtk4.fluent.ImageType
import sn.gnome.gtk4.fluent.InputPurpose
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkEntry
import sn.gnome.gtk4.internal.GtkInputHints
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoTabArray

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEntry` is a single line text entry widget.
  *
  * ![An example GtkEntry](entry.png)
  *
  * A fairly large set of key bindings are supported by default. If the entered
  * text is longer than the allocation of the widget, the widget will scroll so
  * that the cursor position is visible.
  *
  * When using an entry for passwords and other sensitive information, it can be
  * put into “password mode” using [method@Gtk.Entry.set_visibility]. In this
  * mode, entered text is displayed using a “invisible” character. By default,
  * GTK picks the best invisible character that is available in the current
  * font, but it can be changed with [method@Gtk.Entry.set_invisible_char].
  *
  * `GtkEntry` has the ability to display progress or activity information
  * behind the text. To make an entry display such information, use
  * [method@Gtk.Entry.set_progress_fraction] or
  * [method@Gtk.Entry.set_progress_pulse_step].
  *
  * Additionally, `GtkEntry` can show icons at either side of the entry. These
  * icons can be activatable by clicking, can be set up as drag source and can
  * have tooltips. To add an icon, use [method@Gtk.Entry.set_icon_from_gicon] or
  * one of the various other functions that set an icon from an icon name or a
  * paintable. To trigger an action when the user clicks an icon, connect to the
  * [signal@Gtk.Entry::icon-press] signal. To allow DND operations from an icon,
  * use [method@Gtk.Entry.set_icon_drag_source]. To set a tooltip on an icon,
  * use [method@Gtk.Entry.set_icon_tooltip_text] or the corresponding function
  * for markup.
  *
  * Note that functionality or information that is only available by clicking on
  * an icon in an entry may not be accessible at all to users which are not able
  * to use a mouse or other pointing device. It is therefore recommended that
  * any such functionality should also be available by other means, e.g. via the
  * context menu of the entry.
  *
  * # CSS nodes
  *
  * ```
  * entry[.flat][.warning][.error]
  * ├── text[.readonly]
  * ├── image.left
  * ├── image.right
  * ╰── [progress[.pulse]]
  * ```
  *
  * `GtkEntry` has a main node with the name entry. Depending on the properties
  * of the entry, the style classes .read-only and .flat may appear. The style
  * classes .warning and .error may also be used with entries.
  *
  * When the entry shows icons, it adds subnodes with the name image and the
  * style class .left or .right, depending on where the icon appears.
  *
  * When the entry shows progress, it adds a subnode with the name progress. The
  * node has the style class .pulse when the shown progress is pulsing.
  *
  * For all the subnodes added to the text node in various situations, see
  * [class@Gtk.Text].
  *
  * # GtkEntry as GtkBuildable
  *
  * The `GtkEntry` implementation of the `GtkBuildable` interface supports a
  * custom `<attributes>` element, which supports any number of `<attribute>`
  * elements. The `<attribute>` element has attributes named “name“, “value“,
  * “start“ and “end“ and allows you to specify `PangoAttribute` values for this
  * label.
  *
  * An example of a UI definition fragment specifying Pango attributes:
  * ```xml
  * <object class="GtkEntry">
  *   <attributes>
  *     <attribute name="weight" value="PANGO_WEIGHT_BOLD"/>
  *     <attribute name="background" value="red" start="5" end="10"/>
  *   </attributes>
  * </object>
  * ```
  *
  * The start and end attributes specify the range of characters to which the
  * Pango attribute applies. If start and end are not specified, the attribute
  * is applied to the whole text. Note that specifying ranges does not make much
  * sense with translatable attributes. Use markup embedded in the translatable
  * content instead.
  *
  * # Accessibility
  *
  * `GtkEntry` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
  */
class Entry(raw: Ptr[GtkEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the value set by gtk_entry_set_activates_default().
    */
  def getActivatesDefault(): Boolean /* None */ =
    gtk_entry_get_activates_default(this.raw.asInstanceOf[Ptr[GtkEntry]]).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_entry_set_alignment().
    *
    * See also: [property@Gtk.Editable:xalign]
    */
  def getAlignment(): Float /* None */ = gtk_entry_get_alignment(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attribute list of the `GtkEntry`.
    *
    * See [method@Gtk.Entry.set_attributes].
    */
  def getAttributes(): Ptr[PangoAttrList] /* None */ = gtk_entry_get_attributes(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the `GtkEntryBuffer` object which holds the text for this widget.
    */
  def getBuffer(): EntryBuffer /* None */ = new EntryBuffer(
    gtk_entry_get_buffer(this.raw.asInstanceOf[Ptr[GtkEntry]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the auxiliary completion object currently in use by @entry.
    */
  def getCompletion(): EntryCompletion /* None */ = new EntryCompletion(
    gtk_entry_get_completion(this.raw.asInstanceOf[Ptr[GtkEntry]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the index of the icon which is the source of the current DND
    * operation, or -1.
    */
  def getCurrentIconDragSource(): Int /* None */ =
    gtk_entry_get_current_icon_drag_source(this.raw.asInstanceOf[Ptr[GtkEntry]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the menu model set with gtk_entry_set_extra_menu().
    */
  def getExtraMenu(): MenuModel /* None */ = new MenuModel(
    gtk_entry_get_extra_menu(this.raw.asInstanceOf[Ptr[GtkEntry]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_entry_set_has_frame().
    */
  def getHasFrame(): Boolean /* None */ =
    gtk_entry_get_has_frame(this.raw.asInstanceOf[Ptr[GtkEntry]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the icon is activatable.
    */
  def getIconActivatable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Boolean /* None */ = gtk_entry_get_icon_activatable(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the area where entry’s icon at @icon_pos is drawn.
    *
    * This function is useful when drawing something to the entry in a draw
    * callback.
    *
    * If the entry is not realized or has no icon at the given position, @icon_area
    * is filled with zeros. Otherwise,
    * @icon_area
    *   will be filled with the icon's allocation, relative to @entry's
    *   allocation.
    */
  @annotation.compileTimeOnly(
    "Method get_icon_area contains an OUT parameter, which is not supported yet"
  )
  private def getIconArea__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the icon at the given position and return its index.
    *
    * The position’s coordinates are relative to the @entry’s top left corner.
    * If @x, @y doesn’t lie inside an icon, -1 is returned. This function is
    * intended for use in a [signal@Gtk.Widget::query-tooltip] signal handler.
    */
  def getIconAtPos(
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  ): Int /* None */ =
    gtk_entry_get_icon_at_pos(this.raw.asInstanceOf[Ptr[GtkEntry]], x, y)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GIcon` used for the icon.
    *
    * %NULL will be returned if there is no icon or if the icon was set by some
    * other method (e.g., by `GdkPaintable` or icon name).
    */
  def getIconGicon(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Icon /* None */ = new Icon.Abstract(
    gtk_entry_get_icon_gicon(
      this.raw.asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the icon name used for the icon.
    *
    * %NULL is returned if there is no icon or if the icon was set by some other
    * method (e.g., by `GdkPaintable` or gicon).
    */
  def getIconName(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  )(using Zone): String /* None */ = fromCString(
    gtk_entry_get_icon_name(
      this.raw.asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GdkPaintable` used for the icon.
    *
    * If no `GdkPaintable` was used for the icon, %NULL is returned.
    */
  def getIconPaintable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Paintable /* None */ = new Paintable.Abstract(
    gtk_entry_get_icon_paintable(
      this.raw.asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the icon appears sensitive or insensitive.
    */
  def getIconSensitive(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Boolean /* None */ = gtk_entry_get_icon_sensitive(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the type of representation being used by the icon to store image
    * data.
    *
    * If the icon has no image data, the return value will be %GTK_IMAGE_EMPTY.
    */
  def getIconStorageType(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): ImageType /* None */ = ImageType.fromRaw(
    gtk_entry_get_icon_storage_type(
      this.raw.asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the contents of the tooltip on the icon at the specified position in @entry.
    */
  def getIconTooltipMarkup(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  )(using Zone): String /* None */ = fromCString(
    gtk_entry_get_icon_tooltip_markup(
      this.raw.asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the contents of the tooltip on the icon at the specified position in @entry.
    */
  def getIconTooltipText(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  )(using Zone): String /* None */ = fromCString(
    gtk_entry_get_icon_tooltip_text(
      this.raw.asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the input hints of this `GtkEntry`.
    */
  def getInputHints(): GtkInputHints /* None */ = gtk_entry_get_input_hints(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the input purpose of the `GtkEntry`.
    */
  def getInputPurpose(): InputPurpose /* None */ = InputPurpose.fromRaw(
    gtk_entry_get_input_purpose(this.raw.asInstanceOf[Ptr[GtkEntry]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the character displayed in place of the actual text in “password
    * mode”.
    */
  def getInvisibleChar(): CUnsignedInt /* None */ =
    gtk_entry_get_invisible_char(this.raw.asInstanceOf[Ptr[GtkEntry]]).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the maximum allowed length of the text in @entry.
    *
    * See [method@Gtk.Entry.set_max_length].
    */
  def getMaxLength(): Int /* None */ = gtk_entry_get_max_length(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the `GtkEntry` is in overwrite mode.
    */
  def getOverwriteMode(): Boolean /* None */ = gtk_entry_get_overwrite_mode(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the text that will be displayed when @entry is empty and
    * unfocused
    */
  def getPlaceholderText()(using Zone): String /* None */ = fromCString(
    gtk_entry_get_placeholder_text(
      this.raw.asInstanceOf[Ptr[GtkEntry]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current fraction of the task that’s been completed.
    *
    * See [method@Gtk.Entry.set_progress_fraction].
    */
  def getProgressFraction(): Double /* None */ =
    gtk_entry_get_progress_fraction(this.raw.asInstanceOf[Ptr[GtkEntry]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the pulse step set with gtk_entry_set_progress_pulse_step().
    */
  def getProgressPulseStep(): Double /* None */ =
    gtk_entry_get_progress_pulse_step(this.raw.asInstanceOf[Ptr[GtkEntry]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the tabstops of the `GtkEntry`.
    *
    * See [method@Gtk.Entry.set_tabs].
    */
  def getTabs(): Ptr[PangoTabArray] /* None */ = gtk_entry_get_tabs(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current length of the text in @entry.
    *
    * This is equivalent to getting @entry's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.get_length] on it.
    */
  def getTextLength(): UShort /* None */ = gtk_entry_get_text_length(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the text in @entry is visible.
    *
    * See [method@Gtk.Entry.set_visibility].
    */
  def getVisibility(): Boolean /* None */ =
    gtk_entry_get_visibility(this.raw.asInstanceOf[Ptr[GtkEntry]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes @entry to have keyboard focus.
    *
    * It behaves like [method@Gtk.Widget.grab_focus], except that it doesn't
    * select the contents of the entry. You only want to call this on some
    * special entries which the user usually doesn't want to replace all text
    * in, such as search-as-you-type entries.
    */
  def grabFocusWithoutSelecting(): Boolean /* None */ =
    gtk_entry_grab_focus_without_selecting(
      this.raw.asInstanceOf[Ptr[GtkEntry]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates that some progress is made, but you don’t know how much.
    *
    * Causes the entry’s progress indicator to enter “activity mode”, where a
    * block bounces back and forth. Each call to gtk_entry_progress_pulse()
    * causes the block to move by a little bit (the amount of movement per pulse
    * is determined by [method@Gtk.Entry.set_progress_pulse_step]).
    */
  def progressPulse(): Unit /* None */ = gtk_entry_progress_pulse(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reset the input method context of the entry if needed.
    *
    * This can be necessary in the case where modifying the buffer would confuse
    * on-going input method behavior.
    */
  def resetImContext(): Unit /* None */ = gtk_entry_reset_im_context(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether pressing Enter in the @entry will activate the default widget
    * for the window containing the entry.
    *
    * This usually means that the dialog containing the entry will be closed,
    * since the default widget is usually one of the dialog buttons.
    */
  def setActivatesDefault(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_set_activates_default(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the alignment for the contents of the entry.
    *
    * This controls the horizontal positioning of the contents when the
    * displayed text is shorter than the width of the entry.
    *
    * See also: [property@Gtk.Editable:xalign]
    */
  def setAlignment(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_entry_set_alignment(
      this.raw.asInstanceOf[Ptr[GtkEntry]],
      xalign.asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `PangoAttrList`.
    *
    * The attributes in the list are applied to the entry text.
    *
    * Since the attributes will be applied to text that changes as the user
    * types, it makes most sense to use attributes with unlimited extent.
    */
  def setAttributes(
      attrs: Ptr[
        PangoAttrList
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]) */
  ): Unit /* None */ =
    gtk_entry_set_attributes(this.raw.asInstanceOf[Ptr[GtkEntry]], attrs)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the `GtkEntryBuffer` object which holds the text for this widget.
    */
  def setBuffer(
      buffer: EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */
  ): Unit /* None */ = gtk_entry_set_buffer(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    buffer.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @completion to be the auxiliary completion object to use with @entry.
    *
    * All further configuration of the completion mechanism is done on @completion
    * using the `GtkEntryCompletion` API. Completion is disabled if @completion
    * is set to %NULL.
    */
  def setCompletion(
      completion: Option[EntryCompletion /* Some(Ptr[GtkEntryCompletion]) */ ]
  ): Unit /* None */ = gtk_entry_set_completion(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    completion
      .map[Ptr[GtkEntryCompletion]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkEntryCompletion]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a menu model to add when constructing the context menu for @entry.
    */
  def setExtraMenu(
      model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_entry_set_extra_menu(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the entry has a beveled frame around it.
    */
  def setHasFrame(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_set_has_frame(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the icon is activatable.
    */
  def setIconActivatable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      activatable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_set_icon_activatable(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    gboolean(gint((if activatable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets up the icon at the given position as drag source.
    *
    * This makes it so that GTK will start a drag operation when the user clicks
    * and drags the icon.
    */
  def setIconDragSource(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      provider: ContentProvider /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentProvider]) */,
      actions: GdkDragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  ): Unit /* None */ = gtk_entry_set_icon_drag_source(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    provider.getUnsafeRawPointer().asInstanceOf,
    actions
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon shown in the entry at the specified position from the
    * current icon theme.
    *
    * If the icon isn’t known, a “broken image” icon will be displayed instead.
    *
    * If @icon is %NULL, no icon will be shown in the specified position.
    */
  def setIconFromGicon(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      icon: Option[Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */ ]
  ): Unit /* None */ = gtk_entry_set_icon_from_gicon(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    icon
      .map[Ptr[_root_.sn.gnome.gio.internal.GIcon]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GIcon]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon shown in the entry at the specified position from the
    * current icon theme.
    *
    * If the icon name isn’t known, a “broken image” icon will be displayed
    * instead.
    *
    * If @icon_name is %NULL, no icon will be shown in the specified position.
    */
  def setIconFromIconName(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      icon_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_entry_set_icon_from_icon_name(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    icon_name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon shown in the specified position using a `GdkPaintable`.
    *
    * If @paintable is %NULL, no icon will be shown in the specified position.
    */
  def setIconFromPaintable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Unit /* None */ = gtk_entry_set_icon_from_paintable(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    paintable
      .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the sensitivity for the specified icon.
    */
  def setIconSensitive(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      sensitive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_set_icon_sensitive(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @tooltip as the contents of the tooltip for the icon at the specified
    * position.
    *
    * @tooltip
    *   is assumed to be marked up with Pango Markup.
    *
    * Use %NULL for @tooltip to remove an existing tooltip.
    *
    * See also [method@Gtk.Widget.set_tooltip_markup] and
    * [method@Gtk.Entry.set_icon_tooltip_text].
    */
  def setIconTooltipMarkup(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      tooltip: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_entry_set_icon_tooltip_markup(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    tooltip
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @tooltip as the contents of the tooltip for the icon at the specified
    * position.
    *
    * Use %NULL for @tooltip to remove an existing tooltip.
    *
    * See also [method@Gtk.Widget.set_tooltip_text] and
    * [method@Gtk.Entry.set_icon_tooltip_markup].
    *
    * If you unset the widget tooltip via [method@Gtk.Widget.set_tooltip_text]
    * or [method@Gtk.Widget.set_tooltip_markup], this sets
    * [property@Gtk.Widget:has-tooltip] to %FALSE, which suppresses icon
    * tooltips too. You can resolve this by then calling
    * [method@Gtk.Widget.set_has_tooltip] to set
    * [property@Gtk.Widget:has-tooltip] back to %TRUE, or setting at least one
    * non-empty tooltip on any icon achieves the same result.
    */
  def setIconTooltipText(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      tooltip: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_entry_set_icon_tooltip_text(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    icon_pos.raw,
    tooltip
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set additional hints which allow input methods to fine-tune their
    * behavior.
    */
  def setInputHints(
      hints: GtkInputHints /* Some(GtkInputHints) */
  ): Unit /* None */ =
    gtk_entry_set_input_hints(this.raw.asInstanceOf[Ptr[GtkEntry]], hints)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the input purpose which can be used by input methods to adjust their
    * behavior.
    */
  def setInputPurpose(
      purpose: InputPurpose /* Some(GtkInputPurpose) */
  ): Unit /* None */ = gtk_entry_set_input_purpose(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    purpose.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the character to use in place of the actual text in “password mode”.
    *
    * See [method@Gtk.Entry.set_visibility] for how to enable “password mode”.
    *
    * By default, GTK picks the best invisible char available in the current
    * font. If you set the invisible char to 0, then the user will get no
    * feedback at all; there will be no text on the screen as they type.
    */
  def setInvisibleChar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Unit /* None */ = gtk_entry_set_invisible_char(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    gunichar(guint32(ch))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum allowed length of the contents of the widget.
    *
    * If the current contents are longer than the given length, then they will
    * be truncated to fit. The length is in characters.
    *
    * This is equivalent to getting @entry's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.set_max_length] on it.
    */
  def setMaxLength(max: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_entry_set_max_length(this.raw.asInstanceOf[Ptr[GtkEntry]], max)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the text is overwritten when typing in the `GtkEntry`.
    */
  def setOverwriteMode(
      overwrite: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_set_overwrite_mode(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets text to be displayed in @entry when it is empty.
    *
    * This can be used to give a visual hint of the expected contents of the
    * `GtkEntry`.
    */
  def setPlaceholderText(
      text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_entry_set_placeholder_text(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes the entry’s progress indicator to “fill in” the given fraction of
    * the bar.
    *
    * The fraction should be between 0.0 and 1.0, inclusive.
    */
  def setProgressFraction(
      fraction: Double /* Some(Double) */
  ): Unit /* None */ = gtk_entry_set_progress_fraction(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    fraction
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the fraction of total entry width to move the progress bouncing block
    * for each pulse.
    *
    * Use [method@Gtk.Entry.progress_pulse] to pulse the progress.
    */
  def setProgressPulseStep(
      fraction: Double /* Some(Double) */
  ): Unit /* None */ = gtk_entry_set_progress_pulse_step(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    fraction
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `PangoTabArray`.
    *
    * The tabstops in the array are applied to the entry text.
    */
  def setTabs(
      tabs: Option[Ptr[
        PangoTabArray
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]) */ ]
  ): Unit /* None */ = gtk_entry_set_tabs(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    tabs
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the contents of the entry are visible or not.
    *
    * When visibility is set to %FALSE, characters are displayed as the
    * invisible char, and will also appear that way when the text in the entry
    * widget is copied elsewhere.
    *
    * By default, GTK picks the best invisible character available in the
    * current font, but it can be changed with
    * [method@Gtk.Entry.set_invisible_char].
    *
    * Note that you probably want to set [property@Gtk.Entry:input-purpose] to
    * %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to inform input
    * methods about the purpose of this entry, in addition to setting visibility
    * to %FALSE.
    */
  def setVisibility(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_set_visibility(
    this.raw.asInstanceOf[Ptr[GtkEntry]],
    gboolean(gint((if visible == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unsets the invisible char, so that the default invisible char is used
    * again. See [method@Gtk.Entry.set_invisible_char].
    */
  def unsetInvisibleChar(): Unit /* None */ = gtk_entry_unset_invisible_char(
    this.raw.asInstanceOf[Ptr[GtkEntry]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Entry

object Entry:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new entry.
    */
  def apply(): Entry = new Entry(gtk_entry_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new entry with the specified text buffer.
    */
  def withBuffer(buffer: EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */ ): Entry =
    new Entry(
      gtk_entry_new_with_buffer(
        buffer.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end Entry

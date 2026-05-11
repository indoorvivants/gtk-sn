package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{ContentProvider, DragAction, Paintable}
import sn.gnome.gio.fluent.{Icon, MenuModel}
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gint,
  gpointer,
  guint16,
  guint32,
  gunichar
}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  CellEditable,
  ConstraintTarget,
  Editable,
  EntryBuffer,
  EntryCompletion,
  EntryIconPosition,
  ImageType,
  InputHints,
  InputPurpose,
  Widget
}
import sn.gnome.gtk4.internal.{GtkEntry, GtkEntryIconPosition}
import sn.gnome.runtime.*

/** `GtkEntry` is a single line text entry widget.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Entry private[gnome] (raw: Ptr[GtkEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the value set by gtk_entry_set_activates_default().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivatesDefault(): Boolean /* None */ =
    gtk_entry_get_activates_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    ).value.!=(0)
  end getActivatesDefault

  /** Gets the value set by gtk_entry_set_alignment().
    *
    * See also: [property@Gtk.Editable:xalign]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getAlignment(): Float /* None */ =
    gtk_entry_get_alignment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end getAlignment

  /** Gets the attribute list of the `GtkEntry`.
    *
    * See [method@Gtk.Entry.set_attributes].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_attributes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def getAttributes__ = ???

  /** Get the `GtkEntryBuffer` object which holds the text for this widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBuffer()(using Runtime): sn.gnome.gtk4.fluent.EntryBuffer /* None */ =
    sn.gnome.gtk4.fluent.EntryBuffer.applyUnsafe(
      gtk_entry_get_buffer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
      ).asInstanceOf
    )
  end getBuffer

  /** Returns the auxiliary completion object currently in use by @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCompletion()(using
      Runtime
  ): sn.gnome.gtk4.fluent.EntryCompletion /* None */ =
    sn.gnome.gtk4.fluent.EntryCompletion.applyUnsafe(
      gtk_entry_get_completion(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
      ).asInstanceOf
    )
  end getCompletion

  /** Returns the index of the icon which is the source of the current DND
    * operation, or -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentIconDragSource(): Int /* None */ =
    gtk_entry_get_current_icon_drag_source(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end getCurrentIconDragSource

  /** Gets the menu model set with gtk_entry_set_extra_menu().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExtraMenu()(using Runtime): sn.gnome.gio.fluent.MenuModel /* None */ =
    sn.gnome.gio.fluent.MenuModel.applyUnsafe(
      gtk_entry_get_extra_menu(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
      ).asInstanceOf
    )
  end getExtraMenu

  /** Gets the value set by gtk_entry_set_has_frame().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasFrame(): Boolean /* None */ =
    gtk_entry_get_has_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    ).value.!=(0)
  end getHasFrame

  /** Returns whether the icon is activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconActivatable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Boolean /* None */ =
    gtk_entry_get_icon_activatable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    ).value.!=(0)
  end getIconActivatable

  /** Gets the area where entry’s icon at @icon_pos is drawn.
    *
    * This function is useful when drawing something to the entry in a draw
    * callback.
    *
    * If the entry is not realized or has no icon at the given position, @icon_area
    * is filled with zeros. Otherwise,
    * @icon_area
    *   will be filled with the icon's allocation, relative to @entry's
    *   allocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_icon_area]: Method get_icon_area contains an OUT parameter, which is not supported yet"
  )
  private def getIconArea__ = ???

  /** Finds the icon at the given position and return its index.
    *
    * The position’s coordinates are relative to the @entry’s top left corner.
    * If @x, @y doesn’t lie inside an icon, -1 is returned. This function is
    * intended for use in a [signal@Gtk.Widget::query-tooltip] signal handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconAtPos(
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  ): Int /* None */ =
    gtk_entry_get_icon_at_pos(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      x,
      y
    )
  end getIconAtPos

  /** Retrieves the `GIcon` used for the icon.
    *
    * %NULL will be returned if there is no icon or if the icon was set by some
    * other method (e.g., by `GdkPaintable` or icon name).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconGicon(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Icon /* None */ =
    new Icon.Abstract(
      gtk_entry_get_icon_gicon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
        icon_pos.raw
      ).asInstanceOf
    )
  end getIconGicon

  /** Retrieves the icon name used for the icon.
    *
    * %NULL is returned if there is no icon or if the icon was set by some other
    * method (e.g., by `GdkPaintable` or gicon).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconName(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  )(using Zone): String /* None */ =
    fromCString(
      gtk_entry_get_icon_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
        icon_pos.raw
      ).asInstanceOf
    )
  end getIconName

  /** Retrieves the `GdkPaintable` used for the icon.
    *
    * If no `GdkPaintable` was used for the icon, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconPaintable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Paintable /* None */ =
    new Paintable.Abstract(
      gtk_entry_get_icon_paintable(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
        icon_pos.raw
      ).asInstanceOf
    )
  end getIconPaintable

  /** Returns whether the icon appears sensitive or insensitive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconSensitive(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): Boolean /* None */ =
    gtk_entry_get_icon_sensitive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw
    ).value.!=(0)
  end getIconSensitive

  /** Gets the type of representation being used by the icon to store image
    * data.
    *
    * If the icon has no image data, the return value will be %GTK_IMAGE_EMPTY.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconStorageType(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  ): ImageType /* None */ =
    ImageType.fromRaw(
      gtk_entry_get_icon_storage_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
        icon_pos.raw
      )
    )
  end getIconStorageType

  /** Gets the contents of the tooltip on the icon at the specified position in @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconTooltipMarkup(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  )(using Zone): String /* None */ =
    fromCString(
      gtk_entry_get_icon_tooltip_markup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
        icon_pos.raw
      ).asInstanceOf
    )
  end getIconTooltipMarkup

  /** Gets the contents of the tooltip on the icon at the specified position in @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconTooltipText(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */
  )(using Zone): String /* None */ =
    fromCString(
      gtk_entry_get_icon_tooltip_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
        icon_pos.raw
      ).asInstanceOf
    )
  end getIconTooltipText

  /** Gets the input hints of this `GtkEntry`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputHints(): InputHints /* None */ =
    InputHints.fromRaw(
      gtk_entry_get_input_hints(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
      )
    )
  end getInputHints

  /** Gets the input purpose of the `GtkEntry`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputPurpose(): InputPurpose /* None */ =
    InputPurpose.fromRaw(
      gtk_entry_get_input_purpose(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
      )
    )
  end getInputPurpose

  /** Retrieves the character displayed in place of the actual text in “password
    * mode”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInvisibleChar(): CUnsignedInt /* None */ =
    gtk_entry_get_invisible_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    ).value
  end getInvisibleChar

  /** Retrieves the maximum allowed length of the text in @entry.
    *
    * See [method@Gtk.Entry.set_max_length].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxLength(): Int /* None */ =
    gtk_entry_get_max_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end getMaxLength

  /** Gets whether the `GtkEntry` is in overwrite mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOverwriteMode(): Boolean /* None */ =
    gtk_entry_get_overwrite_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    ).value.!=(0)
  end getOverwriteMode

  /** Retrieves the text that will be displayed when @entry is empty and
    * unfocused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlaceholderText()(using Zone): String /* None */ =
    fromCString(
      gtk_entry_get_placeholder_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
      ).asInstanceOf
    )
  end getPlaceholderText

  /** Returns the current fraction of the task that’s been completed.
    *
    * See [method@Gtk.Entry.set_progress_fraction].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProgressFraction(): Double /* None */ =
    gtk_entry_get_progress_fraction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end getProgressFraction

  /** Retrieves the pulse step set with gtk_entry_set_progress_pulse_step().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProgressPulseStep(): Double /* None */ =
    gtk_entry_get_progress_pulse_step(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end getProgressPulseStep

  /** Gets the tabstops of the `GtkEntry`.
    *
    * See [method@Gtk.Entry.set_tabs].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tabs/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def getTabs__ = ???

  /** Retrieves the current length of the text in @entry.
    *
    * This is equivalent to getting @entry's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.get_length] on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTextLength(): UShort /* None */ =
    gtk_entry_get_text_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    ).value
  end getTextLength

  /** Retrieves whether the text in @entry is visible.
    *
    * See [method@Gtk.Entry.set_visibility].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibility(): Boolean /* None */ =
    gtk_entry_get_visibility(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    ).value.!=(0)
  end getVisibility

  /** Causes @entry to have keyboard focus.
    *
    * It behaves like [method@Gtk.Widget.grab_focus], except that it doesn't
    * select the contents of the entry. You only want to call this on some
    * special entries which the user usually doesn't want to replace all text
    * in, such as search-as-you-type entries.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def grabFocusWithoutSelecting(): Boolean /* None */ =
    gtk_entry_grab_focus_without_selecting(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    ).value.!=(0)
  end grabFocusWithoutSelecting

  /** Indicates that some progress is made, but you don’t know how much.
    *
    * Causes the entry’s progress indicator to enter “activity mode”, where a
    * block bounces back and forth. Each call to gtk_entry_progress_pulse()
    * causes the block to move by a little bit (the amount of movement per pulse
    * is determined by [method@Gtk.Entry.set_progress_pulse_step]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def progressPulse(): Unit /* None */ =
    gtk_entry_progress_pulse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end progressPulse

  /** Reset the input method context of the entry if needed.
    *
    * This can be necessary in the case where modifying the buffer would confuse
    * on-going input method behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetImContext(): Unit /* None */ =
    gtk_entry_reset_im_context(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end resetImContext

  /** Sets whether pressing Enter in the @entry will activate the default widget
    * for the window containing the entry.
    *
    * This usually means that the dialog containing the entry will be closed,
    * since the default widget is usually one of the dialog buttons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivatesDefault(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_set_activates_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setActivatesDefault

  /** Sets the alignment for the contents of the entry.
    *
    * This controls the horizontal positioning of the contents when the
    * displayed text is shorter than the width of the entry.
    *
    * See also: [property@Gtk.Editable:xalign]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setAlignment(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_entry_set_alignment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      xalign.asInstanceOf
    )
  end setAlignment

  /** Sets a `PangoAttrList`.
    *
    * The attributes in the list are applied to the entry text.
    *
    * Since the attributes will be applied to text that changes as the user
    * types, it makes most sense to use attributes with unlimited extent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes/<method parameters>/attrs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def setAttributes__ = ???

  /** Set the `GtkEntryBuffer` object which holds the text for this widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBuffer(
      buffer: sn.gnome.gtk4.fluent.EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */
  )(using Runtime): Unit /* None */ =
    gtk_entry_set_buffer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      buffer.getUnsafeRawPointer().asInstanceOf
    )
  end setBuffer

  /** Sets @completion to be the auxiliary completion object to use with @entry.
    *
    * All further configuration of the completion mechanism is done on @completion
    * using the `GtkEntryCompletion` API. Completion is disabled if @completion
    * is set to %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCompletion(
      completion: Option[
        sn.gnome.gtk4.fluent.EntryCompletion /* Some(Ptr[GtkEntryCompletion]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_entry_set_completion(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      completion
        .map[Ptr[GtkEntryCompletion]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkEntryCompletion]])
    )
  end setCompletion

  /** Sets a menu model to add when constructing the context menu for @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExtraMenu(
      model: Option[
        sn.gnome.gio.fluent.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_entry_set_extra_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setExtraMenu

  /** Sets whether the entry has a beveled frame around it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasFrame(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_set_has_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setHasFrame

  /** Sets whether the icon is activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconActivatable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      activatable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_set_icon_activatable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      gboolean(gint((if activatable == true then 1 else 0)))
    )
  end setIconActivatable

  /** Sets up the icon at the given position as drag source.
    *
    * This makes it so that GTK will start a drag operation when the user clicks
    * and drags the icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconDragSource(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      provider: sn.gnome.gdk4.fluent.ContentProvider /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentProvider]) */,
      actions: DragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  )(using Runtime): Unit /* None */ =
    gtk_entry_set_icon_drag_source(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      provider.getUnsafeRawPointer().asInstanceOf,
      actions.raw
    )
  end setIconDragSource

  /** Sets the icon shown in the entry at the specified position from the
    * current icon theme.
    *
    * If the icon isn’t known, a “broken image” icon will be displayed instead.
    *
    * If @icon is %NULL, no icon will be shown in the specified position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconFromGicon(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      icon: Option[Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */ ]
  ): Unit /* None */ =
    gtk_entry_set_icon_from_gicon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      icon
        .map[Ptr[_root_.sn.gnome.gio.internal.GIcon]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GIcon]])
    )
  end setIconFromGicon

  /** Sets the icon shown in the entry at the specified position from the
    * current icon theme.
    *
    * If the icon name isn’t known, a “broken image” icon will be displayed
    * instead.
    *
    * If @icon_name is %NULL, no icon will be shown in the specified position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconFromIconName(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      icon_name: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_entry_set_icon_from_icon_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      icon_name
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setIconFromIconName

  /** Sets the icon shown in the specified position using a `GdkPaintable`.
    *
    * If @paintable is %NULL, no icon will be shown in the specified position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconFromPaintable(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Unit /* None */ =
    gtk_entry_set_icon_from_paintable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      paintable
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
        )
    )
  end setIconFromPaintable

  /** Sets the sensitivity for the specified icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconSensitive(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      sensitive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_set_icon_sensitive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      gboolean(gint((if sensitive == true then 1 else 0)))
    )
  end setIconSensitive

  /** Sets @tooltip as the contents of the tooltip for the icon at the specified
    * position.
    *
    * @tooltip
    *   is assumed to be marked up with Pango Markup.
    *
    * Use %NULL for @tooltip to remove an existing tooltip.
    *
    * See also [method@Gtk.Widget.set_tooltip_markup] and
    * [method@Gtk.Entry.set_icon_tooltip_text].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconTooltipMarkup(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      tooltip: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_entry_set_icon_tooltip_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      tooltip
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setIconTooltipMarkup

  /** Sets @tooltip as the contents of the tooltip for the icon at the specified
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconTooltipText(
      icon_pos: EntryIconPosition /* Some(GtkEntryIconPosition) */,
      tooltip: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_entry_set_icon_tooltip_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      icon_pos.raw,
      tooltip
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setIconTooltipText

  /** Set additional hints which allow input methods to fine-tune their
    * behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInputHints(
      hints: InputHints /* Some(GtkInputHints) */
  ): Unit /* None */ =
    gtk_entry_set_input_hints(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      hints.raw
    )
  end setInputHints

  /** Sets the input purpose which can be used by input methods to adjust their
    * behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInputPurpose(
      purpose: InputPurpose /* Some(GtkInputPurpose) */
  ): Unit /* None */ =
    gtk_entry_set_input_purpose(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      purpose.raw
    )
  end setInputPurpose

  /** Sets the character to use in place of the actual text in “password mode”.
    *
    * See [method@Gtk.Entry.set_visibility] for how to enable “password mode”.
    *
    * By default, GTK picks the best invisible char available in the current
    * font. If you set the invisible char to 0, then the user will get no
    * feedback at all; there will be no text on the screen as they type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInvisibleChar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Unit /* None */ =
    gtk_entry_set_invisible_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      gunichar(guint32(ch))
    )
  end setInvisibleChar

  /** Sets the maximum allowed length of the contents of the widget.
    *
    * If the current contents are longer than the given length, then they will
    * be truncated to fit. The length is in characters.
    *
    * This is equivalent to getting @entry's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.set_max_length] on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxLength(max: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_entry_set_max_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      max
    )
  end setMaxLength

  /** Sets whether the text is overwritten when typing in the `GtkEntry`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOverwriteMode(
      overwrite: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_set_overwrite_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      gboolean(gint((if overwrite == true then 1 else 0)))
    )
  end setOverwriteMode

  /** Sets text to be displayed in @entry when it is empty.
    *
    * This can be used to give a visual hint of the expected contents of the
    * `GtkEntry`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPlaceholderText(
      text: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_entry_set_placeholder_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      text.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setPlaceholderText

  /** Causes the entry’s progress indicator to “fill in” the given fraction of
    * the bar.
    *
    * The fraction should be between 0.0 and 1.0, inclusive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setProgressFraction(
      fraction: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_entry_set_progress_fraction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      fraction
    )
  end setProgressFraction

  /** Sets the fraction of total entry width to move the progress bouncing block
    * for each pulse.
    *
    * Use [method@Gtk.Entry.progress_pulse] to pulse the progress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setProgressPulseStep(
      fraction: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_entry_set_progress_pulse_step(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      fraction
    )
  end setProgressPulseStep

  /** Sets a `PangoTabArray`.
    *
    * The tabstops in the array are applied to the entry text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_tabs/<method parameters>/tabs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def setTabs__ = ???

  /** Sets whether the contents of the entry are visible or not.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisibility(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_set_visibility(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]],
      gboolean(gint((if visible == true then 1 else 0)))
    )
  end setVisibility

  /** Unsets the invisible char, so that the default invisible char is used
    * again. See [method@Gtk.Entry.set_invisible_char].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetInvisibleChar(): Unit /* None */ =
    gtk_entry_unset_invisible_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntry]]
    )
  end unsetInvisibleChar

  /** Emitted when the entry is activated.
    *
    * The keybindings for this signal are all forms of the Enter key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEntry],
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
    val signal = c"activate"
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
  end onActivate

  /** Emitted when an activatable icon is clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onIconPress(handler: ((iconPos: EntryIconPosition)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (iconPos: EntryIconPosition), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkEntry],
          iconPos: GtkEntryIconPosition /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((iconPos = EntryIconPosition.fromRaw(iconPos)))
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
    val signal = c"icon-press"
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
  end onIconPress

  /** Emitted on the button release from a mouse click over an activatable icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onIconRelease(handler: ((iconPos: EntryIconPosition)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (iconPos: EntryIconPosition), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkEntry],
          iconPos: GtkEntryIconPosition /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((iconPos = EntryIconPosition.fromRaw(iconPos)))
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
    val signal = c"icon-release"
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
  end onIconRelease
end Entry

object Entry:
  def applyUnsafe(ptr: Ptr[GtkEntry])(using Runtime) = summon[Runtime]
    .getOrCreate[Entry](ptr.asInstanceOf[Ptr[Byte]], p => new Entry(ptr))

  /** Creates a new entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Entry =
    val raw: Ptr[Byte] = gtk_entry_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Entry](raw, r => Entry.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new entry with the specified text buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withBuffer(
      buffer: sn.gnome.gtk4.fluent.EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */
  )(using Runtime): Entry =
    val raw: Ptr[Byte] = gtk_entry_new_with_buffer(
      buffer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Entry](raw, r => Entry.applyUnsafe(r.asInstanceOf))
  end withBuffer
end Entry

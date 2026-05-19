package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.MenuModel
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Justification,
  MovementStep,
  NaturalWrapMode,
  Widget
}
import sn.gnome.gtk4.internal.{GtkLabel, GtkMovementStep}
import sn.gnome.pango.{EllipsizeMode, Layout, WrapMode}
import sn.gnome.runtime.*

/** The `GtkLabel` widget displays a small amount of text.
  *
  * As the name implies, most labels are used to label another widget such as a
  * [class@Button].
  *
  * ![An example GtkLabel](label.png)
  *
  * # CSS nodes
  *
  * ```
  * label
  * ├── [selection]
  * ├── [link]
  * ┊
  * ╰── [link]
  * ```
  *
  * `GtkLabel` has a single CSS node with the name label. A wide variety of
  * style classes may be applied to labels, such as .title, .subtitle,
  * .dim-label, etc. In the `GtkShortcutsWindow`, labels are used with the
  * .keycap style class.
  *
  * If the label has a selection, it gets a subnode with name selection.
  *
  * If the label has links, there is one subnode per link. These subnodes carry
  * the link or visited state depending on whether they have been visited. In
  * this case, label node also gets a .link style class.
  *
  * # GtkLabel as GtkBuildable
  *
  * The GtkLabel implementation of the GtkBuildable interface supports a custom
  * `<attributes>` element, which supports any number of `<attribute>` elements.
  * The <attribute> element has attributes named “name“, “value“, “start“ and
  * “end“ and allows you to specify [struct@Pango.Attribute] values for this
  * label.
  *
  * An example of a UI definition fragment specifying Pango attributes:
  * ```xml
  * <object class="GtkLabel">
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
  * `GtkLabel` uses the %GTK_ACCESSIBLE_ROLE_LABEL role.
  *
  * # Mnemonics
  *
  * Labels may contain “mnemonics”. Mnemonics are underlined characters in the
  * label, used for keyboard navigation. Mnemonics are created by providing a
  * string with an underscore before the mnemonic character, such as `"_File"`,
  * to the functions [ctor@Gtk.Label.new_with_mnemonic] or
  * [method@Gtk.Label.set_text_with_mnemonic].
  *
  * Mnemonics automatically activate any activatable widget the label is inside,
  * such as a [class@Gtk.Button]; if the label is not inside the mnemonic’s
  * target widget, you have to tell the label about the target using
  * [class@Gtk.Label.set_mnemonic_widget]. Here’s a simple example where the
  * label is inside a button:
  *
  * ```c
  * // Pressing Alt+H will activate this button
  * GtkWidget *button = gtk_button_new ();
  * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
  * gtk_button_set_child (GTK_BUTTON (button), label);
  * ```
  *
  * There’s a convenience function to create buttons with a mnemonic label
  * already inside:
  *
  * ```c
  * // Pressing Alt+H will activate this button
  * GtkWidget *button = gtk_button_new_with_mnemonic ("_Hello");
  * ```
  *
  * To create a mnemonic for a widget alongside the label, such as a
  * [class@Gtk.Entry], you have to point the label at the entry with
  * [method@Gtk.Label.set_mnemonic_widget]:
  *
  * ```c
  * // Pressing Alt+H will focus the entry
  * GtkWidget *entry = gtk_entry_new ();
  * GtkWidget *label = gtk_label_new_with_mnemonic ("_Hello");
  * gtk_label_set_mnemonic_widget (GTK_LABEL (label), entry);
  * ```
  *
  * # Markup (styled text)
  *
  * To make it easy to format text in a label (changing colors, fonts, etc.),
  * label text can be provided in a simple markup format:
  *
  * Here’s how to create a label with a small font:
  * ```c
  * GtkWidget *label = gtk_label_new (NULL);
  * gtk_label_set_markup (GTK_LABEL (label), "<small>Small text</small>");
  * ```
  *
  * (See the Pango manual for complete documentation] of available tags,
  * [func@Pango.parse_markup])
  *
  * The markup passed to [method@Gtk.Label.set_markup] must be valid; for
  * example, literal `<`, `>` and `&` characters must be escaped as `&lt;`,
  * `&gt;`, and `&amp;`. If you pass text obtained from the user, file, or a
  * network to [method@Gtk.Label.set_markup], you’ll want to escape it with
  * [func@GLib.markup_escape_text] or [func@GLib.markup_printf_escaped].
  *
  * Markup strings are just a convenient way to set the [struct@Pango.AttrList]
  * on a label; [method@Gtk.Label.set_attributes] may be a simpler way to set
  * attributes in some cases. Be careful though; [struct@Pango.AttrList] tends
  * to cause internationalization problems, unless you’re applying attributes to
  * the entire string (i.e. unless you set the range of each attribute to [0,
  * %G_MAXINT)). The reason is that specifying the start_index and end_index for
  * a [struct@Pango.Attribute] requires knowledge of the exact string being
  * displayed, so translations will cause problems.
  *
  * # Selectable labels
  *
  * Labels can be made selectable with [method@Gtk.Label.set_selectable].
  * Selectable labels allow the user to copy the label contents to the
  * clipboard. Only labels that contain useful-to-copy information — such as
  * error messages — should be made selectable.
  *
  * # Text layout
  *
  * A label can contain any number of paragraphs, but will have performance
  * problems if it contains more than a small number. Paragraphs are separated
  * by newlines or other paragraph separators understood by Pango.
  *
  * Labels can automatically wrap text if you call [method@Gtk.Label.set_wrap].
  *
  * [method@Gtk.Label.set_justify] sets how the lines in a label align with one
  * another. If you want to set how the label as a whole aligns in its available
  * space, see the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
  * properties.
  *
  * The [property@Gtk.Label:width-chars] and
  * [property@Gtk.Label:max-width-chars] properties can be used to control the
  * size allocation of ellipsized or wrapped labels. For ellipsizing labels, if
  * either is specified (and less than the actual text size), it is used as the
  * minimum width, and the actual text size is used as the natural width of the
  * label. For wrapping labels, width-chars is used as the minimum width, if
  * specified, and max-width-chars is used as the natural width. Even if
  * max-width-chars specified, wrapping labels will be rewrapped to use all of
  * the available width.
  *
  * # Links
  *
  * GTK supports markup for clickable hyperlinks in addition to regular Pango
  * markup. The markup for links is borrowed from HTML, using the `<a>` with
  * “href“, “title“ and “class“ attributes. GTK renders links similar to the way
  * they appear in web browsers, with colored, underlined text. The “title“
  * attribute is displayed as a tooltip on the link. The “class“ attribute is
  * used as style class on the CSS node for the link.
  *
  * An example looks like this:
  *
  * ```c
  * const char *text =
  * "Go to the "
  * "<a href=\"https://www.gtk.org\" title=\"&lt;i&gt;Our&lt;/i&gt; website\">"
  * "GTK website</a> for more...";
  * GtkWidget *label = gtk_label_new (NULL);
  * gtk_label_set_markup (GTK_LABEL (label), text);
  * ```
  *
  * It is possible to implement custom handling for links and their tooltips
  * with the [signal@Gtk.Label::activate-link] signal and the
  * [method@Gtk.Label.get_current_uri] function.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Label private[gnome] (raw: Ptr[GtkLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the label's attribute list.
    *
    * This is the [struct@Pango.AttrList] that was set on the label using
    * [method@Gtk.Label.set_attributes], if any. This function does not reflect
    * attributes that come from the label's markup (see
    * [method@Gtk.Label.set_markup]). If you want to get the effective
    * attributes for the label, use
    * `pango_layout_get_attributes (gtk_label_get_layout (self))`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def getAttributes__ = ???

  /** Returns the URI for the currently active link in the label.
    *
    * The active link is the one under the mouse pointer or, in a selectable
    * label, the link in which the text cursor is currently positioned.
    *
    * This function is intended for use in a [signal@Gtk.Label::activate-link]
    * handler or for use in a [signal@Gtk.Widget::query-tooltip] handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentUri(): String /* None */ =
    fromCString(
      gtk_label_get_current_uri(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      ).asInstanceOf
    )
  end getCurrentUri

  /** Returns the ellipsizing position of the label.
    *
    * See [method@Gtk.Label.set_ellipsize].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEllipsize(): EllipsizeMode /* None */ =
    EllipsizeMode.fromRaw(
      gtk_label_get_ellipsize(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      )
    )
  end getEllipsize

  /** Gets the extra menu model of @label.
    *
    * See [method@Gtk.Label.set_extra_menu].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExtraMenu()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      gtk_label_get_extra_menu(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      ).asInstanceOf
    )
  end getExtraMenu

  /** Returns the justification of the label.
    *
    * See [method@Gtk.Label.set_justify].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getJustify(): Justification /* None */ =
    Justification.fromRaw(
      gtk_label_get_justify(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      )
    )
  end getJustify

  /** Fetches the text from a label.
    *
    * The returned text includes any embedded underlines indicating mnemonics
    * and Pango markup. (See [method@Gtk.Label.get_text]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabel(): String /* None */ =
    fromCString(
      gtk_label_get_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      ).asInstanceOf
    )
  end getLabel

  /** Gets the `PangoLayout` used to display the label.
    *
    * The layout is useful to e.g. convert text positions to pixel positions, in
    * combination with [method@Gtk.Label.get_layout_offsets]. The returned
    * layout is owned by the @label so need not be freed by the caller. The @label
    * is free to recreate its layout at any time, so it should be considered
    * read-only.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayout()(using Runtime): sn.gnome.pango.Layout /* None */ =
    sn.gnome.pango.Layout.applyUnsafe(
      gtk_label_get_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      ).asInstanceOf
    )
  end getLayout

  /** Obtains the coordinates where the label will draw its `PangoLayout`.
    *
    * The coordinates are useful to convert mouse events into coordinates inside
    * the [class@Pango.Layout], e.g. to take some action if some part of the
    * label is clicked. Remember when using the [class@Pango.Layout] functions
    * you need to convert to and from pixels using PANGO_PIXELS() or
    * [const@Pango.SCALE].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_layout_offsets]: Method get_layout_offsets contains an OUT parameter, which is not supported yet"
  )
  private def getLayoutOffsets__ = ???

  /** Gets the number of lines to which an ellipsized, wrapping label should be
    * limited.
    *
    * See [method@Gtk.Label.set_lines].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLines(): Int /* None */ =
    gtk_label_get_lines(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]])
  end getLines

  /** Retrieves the desired maximum width of @label, in characters.
    *
    * See [method@Gtk.Label.set_width_chars].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxWidthChars(): Int /* None */ =
    gtk_label_get_max_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    )
  end getMaxWidthChars

  /** Return the mnemonic accelerator.
    *
    * If the label has been set so that it has a mnemonic key this function
    * returns the keyval used for the mnemonic accelerator. If there is no
    * mnemonic set up it returns `GDK_KEY_VoidSymbol`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMnemonicKeyval(): UInt /* None */ =
    gtk_label_get_mnemonic_keyval(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    ).value
  end getMnemonicKeyval

  /** Retrieves the target of the mnemonic (keyboard shortcut) of this label.
    *
    * See [method@Gtk.Label.set_mnemonic_widget].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMnemonicWidget()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_label_get_mnemonic_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      ).asInstanceOf
    )
  end getMnemonicWidget

  /** Returns line wrap mode used by the label.
    *
    * See [method@Gtk.Label.set_natural_wrap_mode].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNaturalWrapMode(): NaturalWrapMode /* None */ =
    NaturalWrapMode.fromRaw(
      gtk_label_get_natural_wrap_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      )
    )
  end getNaturalWrapMode

  /** Returns whether the label is selectable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectable(): Boolean /* None */ =
    gtk_label_get_selectable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    ).value.!=(0)
  end getSelectable

  /** Gets the selected range of characters in the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_selection_bounds]: Method get_selection_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getSelectionBounds__ = ???

  /** Returns whether the label is in single line mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSingleLineMode(): Boolean /* None */ =
    gtk_label_get_single_line_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    ).value.!=(0)
  end getSingleLineMode

  /** Gets the tabs for @self.
    *
    * The returned array will be %NULL if “standard” (8-space) tabs are used.
    * Free the return value with [method@Pango.TabArray.free].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tabs/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def getTabs__ = ???

  /** Fetches the text from a label.
    *
    * The returned text is as it appears on screen. This does not include any
    * embedded underlines indicating mnemonics or Pango markup. (See
    * [method@Gtk.Label.get_label])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText(): String /* None */ =
    fromCString(
      gtk_label_get_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      ).asInstanceOf
    )
  end getText

  /** Returns whether the label’s text is interpreted as Pango markup.
    *
    * See [method@Gtk.Label.set_use_markup].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseMarkup(): Boolean /* None */ =
    gtk_label_get_use_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    ).value.!=(0)
  end getUseMarkup

  /** Returns whether an embedded underlines in the label indicate mnemonics.
    *
    * See [method@Gtk.Label.set_use_underline].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseUnderline(): Boolean /* None */ =
    gtk_label_get_use_underline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    ).value.!=(0)
  end getUseUnderline

  /** Retrieves the desired width of @label, in characters.
    *
    * See [method@Gtk.Label.set_width_chars].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidthChars(): Int /* None */ =
    gtk_label_get_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    )
  end getWidthChars

  /** Returns whether lines in the label are automatically wrapped.
    *
    * See [method@Gtk.Label.set_wrap].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrap(): Boolean /* None */ =
    gtk_label_get_wrap(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
    ).value.!=(0)
  end getWrap

  /** Returns line wrap mode used by the label.
    *
    * See [method@Gtk.Label.set_wrap_mode].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrapMode(): WrapMode /* None */ =
    WrapMode.fromRaw(
      gtk_label_get_wrap_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]]
      )
    )
  end getWrapMode

  /** Gets the `xalign` of the label.
    *
    * See the [property@Gtk.Label:xalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getXalign(): Float /* None */ =
    gtk_label_get_xalign(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]])
  end getXalign

  /** Gets the `yalign` of the label.
    *
    * See the [property@Gtk.Label:yalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getYalign(): Float /* None */ =
    gtk_label_get_yalign(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]])
  end getYalign

  /** Selects a range of characters in the label, if the label is selectable.
    *
    * See [method@Gtk.Label.set_selectable]. If the label is not selectable,
    * this function has no effect. If @start_offset or
    * @end_offset
    *   are -1, then the end of the label will be substituted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectRegion(
      start_offset: Int /* Some(CInt) */,
      end_offset: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_label_select_region(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      start_offset,
      end_offset
    )
  end selectRegion

  /** Apply attributes to the label text.
    *
    * The attributes set with this function will be applied and merged with any
    * other attributes previously effected by way of the
    * [property@Gtk.Label:use-underline] or [property@Gtk.Label:use-markup]
    * properties. While it is not recommended to mix markup strings with
    * manually set attributes, if you must; know that the attributes will be
    * applied to the label after the markup string is parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes/<method parameters>/attrs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def setAttributes__ = ???

  /** Sets the mode used to ellipsize the text.
    *
    * The text will be ellipsized if there is not enough space to render the
    * entire string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEllipsize(
      mode: EllipsizeMode /* Some(_root_.sn.gnome.pango.internal.PangoEllipsizeMode) */
  ): Unit /* None */ =
    gtk_label_set_ellipsize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      mode.raw
    )
  end setEllipsize

  /** Sets a menu model to add when constructing the context menu for @label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExtraMenu(
      model: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_label_set_extra_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setExtraMenu

  /** Sets the alignment of the lines in the text of the label relative to each
    * other.
    *
    * %GTK_JUSTIFY_LEFT is the default value when the widget is first created
    * with [ctor@Gtk.Label.new]. If you instead want to set the alignment of the
    * label as a whole, use [method@Gtk.Widget.set_halign] instead.
    * [method@Gtk.Label.set_justify] has no effect on labels containing only a
    * single line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setJustify(
      jtype: Justification /* Some(GtkJustification) */
  ): Unit /* None */ =
    gtk_label_set_justify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      jtype.raw
    )
  end setJustify

  /** Sets the text of the label.
    *
    * The label is interpreted as including embedded underlines and/or Pango
    * markup depending on the values of the [property@Gtk.Label:use-underline]
    * and [property@Gtk.Label:use-markup] properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      str: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_label_set_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      summon[Runtime].inZone(toCString(str))
    )
  end setLabel

  /** Sets the number of lines to which an ellipsized, wrapping label should be
    * limited.
    *
    * This has no effect if the label is not wrapping or ellipsized. Set this to
    * -1 if you don’t want to limit the number of lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLines(lines: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_label_set_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      lines
    )
  end setLines

  /** Sets the labels text and attributes from markup.
    *
    * The string must be marked up with Pango markup (see
    * [func@Pango.parse_markup]).
    *
    * If the @str is external data, you may need to escape it with
    * g_markup_escape_text() or g_markup_printf_escaped():
    *
    * ```c
    * GtkWidget *self = gtk_label_new (NULL);
    * const char *str = "...";
    * const char *format = "<span style=\"italic\">\%s</span>";
    * char *markup;
    *
    * markup = g_markup_printf_escaped (format, str);
    * gtk_label_set_markup (GTK_LABEL (self), markup);
    * g_free (markup);
    * ```
    *
    * This function will set the [property@Gtk.Label:use-markup] property to
    * %TRUE as a side effect.
    *
    * If you set the label contents using the [property@Gtk.Label:label]
    * property you should also ensure that you set the
    * [property@Gtk.Label:use-markup] property accordingly.
    *
    * See also: [method@Gtk.Label.set_text]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarkup(
      str: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_label_set_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      summon[Runtime].inZone(toCString(str))
    )
  end setMarkup

  /** Sets the labels text, attributes and mnemonic from markup.
    *
    * Parses @str which is marked up with Pango markup (see
    * [func@Pango.parse_markup]), setting the label’s text and attribute list
    * based on the parse results. If characters in @str are preceded by an
    * underscore, they are underlined indicating that they represent a keyboard
    * accelerator called a mnemonic.
    *
    * The mnemonic key can be used to activate another widget, chosen
    * automatically, or explicitly using [method@Gtk.Label.set_mnemonic_widget].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarkupWithMnemonic(
      str: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_label_set_markup_with_mnemonic(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      summon[Runtime].inZone(toCString(str))
    )
  end setMarkupWithMnemonic

  /** Sets the desired maximum width in characters of @label to @n_chars.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxWidthChars(n_chars: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_label_set_max_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      n_chars
    )
  end setMaxWidthChars

  /** Associate the label with its mnemonic target.
    *
    * If the label has been set so that it has a mnemonic key (using i.e.
    * [method@Gtk.Label.set_markup_with_mnemonic],
    * [method@Gtk.Label.set_text_with_mnemonic],
    * [ctor@Gtk.Label.new_with_mnemonic] or the
    * [property@Gtk.Label:use_underline] property) the label can be associated
    * with a widget that is the target of the mnemonic. When the label is inside
    * a widget (like a [class@Gtk.Button] or a [class@Gtk.Notebook] tab) it is
    * automatically associated with the correct widget, but sometimes (i.e. when
    * the target is a [class@Gtk.Entry] next to the label) you need to set it
    * explicitly using this function.
    *
    * The target widget will be accelerated by emitting the
    * [signal@Gtk.Widget::mnemonic-activate] signal on it. The default handler
    * for this signal will activate the widget if there are no mnemonic
    * collisions and toggle focus between the colliding widgets otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMnemonicWidget(
      widget: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_label_set_mnemonic_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setMnemonicWidget

  /** Select the line wrapping for the natural size request.
    *
    * This only affects the natural size requested, for the actual wrapping
    * used, see the [property@Gtk.Label:wrap-mode] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNaturalWrapMode(
      wrap_mode: NaturalWrapMode /* Some(GtkNaturalWrapMode) */
  ): Unit /* None */ =
    gtk_label_set_natural_wrap_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      wrap_mode.raw
    )
  end setNaturalWrapMode

  /** Makes text in the label selectable.
    *
    * Selectable labels allow the user to select text from the label, for
    * copy-and-paste.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelectable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_label_set_selectable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setSelectable

  /** Sets whether the label is in single line mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSingleLineMode(
      single_line_mode: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_label_set_single_line_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      gboolean(gint((if single_line_mode == true then 1 else 0)))
    )
  end setSingleLineMode

  /** Sets the default tab stops for paragraphs in @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_tabs/<method parameters>/tabs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def setTabs__ = ???

  /** Sets the text within the `GtkLabel` widget.
    *
    * It overwrites any text that was there before.
    *
    * This function will clear any previously set mnemonic accelerators, and set
    * the [property@Gtk.Label:use-underline] property to %FALSE as a side
    * effect.
    *
    * This function will set the [property@Gtk.Label:use-markup] property to
    * %FALSE as a side effect.
    *
    * See also: [method@Gtk.Label.set_markup]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(
      str: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_label_set_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      summon[Runtime].inZone(toCString(str))
    )
  end setText

  /** Sets the label’s text from the string @str.
    *
    * If characters in @str are preceded by an underscore, they are underlined
    * indicating that they represent a keyboard accelerator called a mnemonic.
    * The mnemonic key can be used to activate another widget, chosen
    * automatically, or explicitly using [method@Gtk.Label.set_mnemonic_widget].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTextWithMnemonic(
      str: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_label_set_text_with_mnemonic(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      summon[Runtime].inZone(toCString(str))
    )
  end setTextWithMnemonic

  /** Sets whether the text of the label contains markup.
    *
    * See [method@Gtk.Label.set_markup].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseMarkup(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_label_set_use_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setUseMarkup

  /** Sets whether underlines in the text indicate mnemonics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseUnderline(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_label_set_use_underline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setUseUnderline

  /** Sets the desired width in characters of @label to @n_chars.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWidthChars(n_chars: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_label_set_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      n_chars
    )
  end setWidthChars

  /** Toggles line wrapping within the `GtkLabel` widget.
    *
    * %TRUE makes it break lines if text exceeds the widget’s size. %FALSE lets
    * the text get cut off by the edge of the widget if it exceeds the widget
    * size.
    *
    * Note that setting line wrapping to %TRUE does not make the label wrap at
    * its parent container’s width, because GTK widgets conceptually can’t make
    * their requisition depend on the parent container’s size. For a label that
    * wraps at a specific position, set the label’s width using
    * [method@Gtk.Widget.set_size_request].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrap(
      wrap: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_label_set_wrap(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      gboolean(gint((if wrap == true then 1 else 0)))
    )
  end setWrap

  /** Controls how line wrapping is done.
    *
    * This only affects the label if line wrapping is on. (See
    * [method@Gtk.Label.set_wrap]) The default is %PANGO_WRAP_WORD which means
    * wrap on word boundaries.
    *
    * For sizing behavior, also consider the
    * [property@Gtk.Label:natural-wrap-mode] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrapMode(
      wrap_mode: WrapMode /* Some(_root_.sn.gnome.pango.internal.PangoWrapMode) */
  ): Unit /* None */ =
    gtk_label_set_wrap_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      wrap_mode.raw
    )
  end setWrapMode

  /** Sets the `xalign` of the label.
    *
    * See the [property@Gtk.Label:xalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setXalign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_label_set_xalign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      xalign.asInstanceOf
    )
  end setXalign

  /** Sets the `yalign` of the label.
    *
    * See the [property@Gtk.Label:yalign] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setYalign(yalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_label_set_yalign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkLabel]],
      yalign.asInstanceOf
    )
  end setYalign

  /** Gets emitted when the user activates a link in the label.
    *
    * The ::activate-current-link is a [keybinding
    * signal](class.SignalAction.html).
    *
    * Applications may also emit the signal with g_signal_emit_by_name() if they
    * need to control activation of URIs programmatically.
    *
    * The default bindings for this signal are all forms of the <kbd>Enter</kbd>
    * key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateCurrentLink(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkLabel],
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
    val signal = c"activate-current-link"
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
  end onActivateCurrentLink

  /** Gets emitted to activate a URI.
    *
    * Applications may connect to it to override the default behaviour, which is
    * to call [method@Gtk.FileLauncher.launch].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateLink(handler: ((uri: String)) => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (uri: String), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkLabel],
          uri: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((uri = fromCString(uri)))
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
    val signal = c"activate-link"
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
  end onActivateLink

  /** Gets emitted to copy the selection to the clipboard.
    *
    * The ::copy-clipboard signal is a [keybinding
    * signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>Ctrl</kbd>+<kbd>c</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCopyClipboard(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkLabel],
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
    val signal = c"copy-clipboard"
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
  end onCopyClipboard

  /** Gets emitted when the user initiates a cursor movement.
    *
    * The ::move-cursor signal is a [keybinding
    * signal](class.SignalAction.html). If the cursor is not visible in @entry,
    * this signal causes the viewport to be moved instead.
    *
    * Applications should not connect to it, but may emit it with
    * g_signal_emit_by_name() if they need to control the cursor
    * programmatically.
    *
    * The default bindings for this signal come in two variants, the variant
    * with the Shift modifier extends the selection, the variant without the
    * Shift modifier does not. There are too many key combinations to list them
    * all here.
    *
    *   - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd> move by
    *     individual characters/lines
    *   - <kbd>Ctrl</kbd>+<kbd>←</kbd>, etc. move by words/paragraphs
    *   - <kbd>Home</kbd> and <kbd>End</kbd> move to the ends of the buffer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveCursor(
      handler: (
          (step: MovementStep, count: Int, extendSelection: Boolean)
      ) => Unit
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (step: MovementStep, count: Int, extendSelection: Boolean),
      Unit
    ]
    val c_handler = CFuncPtr5.fromScalaFunction {
      (
          self: Ptr[GtkLabel],
          step: GtkMovementStep /* param */,
          count: Int /* param */,
          extendSelection: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            step = MovementStep.fromRaw(step),
            count = count,
            extendSelection = extendSelection
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
    val signal = c"move-cursor"
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
  end onMoveCursor
end Label

object Label:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkLabel])(using Runtime) = summon[Runtime]
    .getOrCreate[Label](ptr.asInstanceOf[Ptr[Byte]], p => new Label(ptr))

  /** Creates a new label with the given text inside it.
    *
    * You can pass %NULL to get an empty label widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(str: Option[String /* Some(CString) */ ])(using Runtime): Label =
    val raw: Ptr[Byte] = gtk_label_new(
      str
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Label](raw, r => Label.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkLabel`, containing the text in @str.
    *
    * If characters in @str are preceded by an underscore, they are underlined.
    * If you need a literal underscore character in a label, use '__' (two
    * underscores). The first underlined character represents a keyboard
    * accelerator called a mnemonic. The mnemonic key can be used to activate
    * another widget, chosen automatically, or explicitly using
    * [method@Gtk.Label.set_mnemonic_widget].
    *
    * If [method@Gtk.Label.set_mnemonic_widget] is not called, then the first
    * activatable ancestor of the `GtkLabel` will be chosen as the mnemonic
    * widget. For instance, if the label is inside a button or menu item, the
    * button or menu item will automatically become the mnemonic widget and be
    * activated by the mnemonic.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withMnemonic(str: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Label =
    val raw: Ptr[Byte] = gtk_label_new_with_mnemonic(
      str
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Label](raw, r => Label.applyUnsafe(r.asInstanceOf))
  end withMnemonic
end Label

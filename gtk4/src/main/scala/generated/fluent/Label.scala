package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Justification
import sn.gnome.gtk4.fluent.NaturalWrapMode
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkLabel
import sn.gnome.pango.fluent.EllipsizeMode
import sn.gnome.pango.fluent.Layout
import sn.gnome.pango.fluent.WrapMode
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoTabArray

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkLabel` widget displays a small amount of text.
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
  */
class Label(raw: Ptr[GtkLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the label's attribute list.
    *
    * This is the [struct@Pango.AttrList] that was set on the label using
    * [method@Gtk.Label.set_attributes], if any. This function does not reflect
    * attributes that come from the label's markup (see
    * [method@Gtk.Label.set_markup]). If you want to get the effective
    * attributes for the label, use
    * `pango_layout_get_attributes (gtk_label_get_layout (self))`.
    */
  def getAttributes(): Ptr[PangoAttrList] /* None */ = gtk_label_get_attributes(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the URI for the currently active link in the label.
    *
    * The active link is the one under the mouse pointer or, in a selectable
    * label, the link in which the text cursor is currently positioned.
    *
    * This function is intended for use in a [signal@Gtk.Label::activate-link]
    * handler or for use in a [signal@Gtk.Widget::query-tooltip] handler.
    */
  def getCurrentUri()(using Zone): String /* None */ = fromCString(
    gtk_label_get_current_uri(this.raw.asInstanceOf[Ptr[GtkLabel]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the ellipsizing position of the label.
    *
    * See [method@Gtk.Label.set_ellipsize].
    */
  def getEllipsize(): EllipsizeMode /* None */ = EllipsizeMode.fromRaw(
    gtk_label_get_ellipsize(this.raw.asInstanceOf[Ptr[GtkLabel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the extra menu model of @label.
    *
    * See [method@Gtk.Label.set_extra_menu].
    */
  def getExtraMenu(): MenuModel /* None */ = new MenuModel(
    gtk_label_get_extra_menu(this.raw.asInstanceOf[Ptr[GtkLabel]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the justification of the label.
    *
    * See [method@Gtk.Label.set_justify].
    */
  def getJustify(): Justification /* None */ = Justification.fromRaw(
    gtk_label_get_justify(this.raw.asInstanceOf[Ptr[GtkLabel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the text from a label.
    *
    * The returned text includes any embedded underlines indicating mnemonics
    * and Pango markup. (See [method@Gtk.Label.get_text]).
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_label_get_label(this.raw.asInstanceOf[Ptr[GtkLabel]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoLayout` used to display the label.
    *
    * The layout is useful to e.g. convert text positions to pixel positions, in
    * combination with [method@Gtk.Label.get_layout_offsets]. The returned
    * layout is owned by the @label so need not be freed by the caller. The @label
    * is free to recreate its layout at any time, so it should be considered
    * read-only.
    */
  def getLayout(): Layout /* None */ = new Layout(
    gtk_label_get_layout(this.raw.asInstanceOf[Ptr[GtkLabel]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the coordinates where the label will draw its `PangoLayout`.
    *
    * The coordinates are useful to convert mouse events into coordinates inside
    * the [class@Pango.Layout], e.g. to take some action if some part of the
    * label is clicked. Remember when using the [class@Pango.Layout] functions
    * you need to convert to and from pixels using PANGO_PIXELS() or
    * [const@Pango.SCALE].
    */
  @annotation.compileTimeOnly(
    "Method get_layout_offsets contains an OUT parameter, which is not supported yet"
  )
  private def getLayoutOffsets__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the number of lines to which an ellipsized, wrapping label should be
    * limited.
    *
    * See [method@Gtk.Label.set_lines].
    */
  def getLines(): Int /* None */ = gtk_label_get_lines(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the desired maximum width of @label, in characters.
    *
    * See [method@Gtk.Label.set_width_chars].
    */
  def getMaxWidthChars(): Int /* None */ = gtk_label_get_max_width_chars(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return the mnemonic accelerator.
    *
    * If the label has been set so that it has a mnemonic key this function
    * returns the keyval used for the mnemonic accelerator. If there is no
    * mnemonic set up it returns `GDK_KEY_VoidSymbol`.
    */
  def getMnemonicKeyval(): UInt /* None */ = gtk_label_get_mnemonic_keyval(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the target of the mnemonic (keyboard shortcut) of this label.
    *
    * See [method@Gtk.Label.set_mnemonic_widget].
    */
  def getMnemonicWidget(): Widget /* None */ = new Widget(
    gtk_label_get_mnemonic_widget(
      this.raw.asInstanceOf[Ptr[GtkLabel]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns line wrap mode used by the label.
    *
    * See [method@Gtk.Label.set_natural_wrap_mode].
    */
  def getNaturalWrapMode(): NaturalWrapMode /* None */ =
    NaturalWrapMode.fromRaw(
      gtk_label_get_natural_wrap_mode(this.raw.asInstanceOf[Ptr[GtkLabel]])
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the label is selectable.
    */
  def getSelectable(): Boolean /* None */ =
    gtk_label_get_selectable(this.raw.asInstanceOf[Ptr[GtkLabel]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selected range of characters in the label.
    */
  @annotation.compileTimeOnly(
    "Method get_selection_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getSelectionBounds__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the label is in single line mode.
    */
  def getSingleLineMode(): Boolean /* None */ = gtk_label_get_single_line_mode(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the tabs for @self.
    *
    * The returned array will be %NULL if “standard” (8-space) tabs are used.
    * Free the return value with [method@Pango.TabArray.free].
    */
  def getTabs(): Ptr[PangoTabArray] /* None */ = gtk_label_get_tabs(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the text from a label.
    *
    * The returned text is as it appears on screen. This does not include any
    * embedded underlines indicating mnemonics or Pango markup. (See
    * [method@Gtk.Label.get_label])
    */
  def getText()(using Zone): String /* None */ = fromCString(
    gtk_label_get_text(this.raw.asInstanceOf[Ptr[GtkLabel]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the label’s text is interpreted as Pango markup.
    *
    * See [method@Gtk.Label.set_use_markup].
    */
  def getUseMarkup(): Boolean /* None */ =
    gtk_label_get_use_markup(this.raw.asInstanceOf[Ptr[GtkLabel]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether an embedded underlines in the label indicate mnemonics.
    *
    * See [method@Gtk.Label.set_use_underline].
    */
  def getUseUnderline(): Boolean /* None */ = gtk_label_get_use_underline(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the desired width of @label, in characters.
    *
    * See [method@Gtk.Label.set_width_chars].
    */
  def getWidthChars(): Int /* None */ = gtk_label_get_width_chars(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether lines in the label are automatically wrapped.
    *
    * See [method@Gtk.Label.set_wrap].
    */
  def getWrap(): Boolean /* None */ =
    gtk_label_get_wrap(this.raw.asInstanceOf[Ptr[GtkLabel]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns line wrap mode used by the label.
    *
    * See [method@Gtk.Label.set_wrap_mode].
    */
  def getWrapMode(): WrapMode /* None */ = WrapMode.fromRaw(
    gtk_label_get_wrap_mode(this.raw.asInstanceOf[Ptr[GtkLabel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `xalign` of the label.
    *
    * See the [property@Gtk.Label:xalign] property.
    */
  def getXalign(): Float /* None */ = gtk_label_get_xalign(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `yalign` of the label.
    *
    * See the [property@Gtk.Label:yalign] property.
    */
  def getYalign(): Float /* None */ = gtk_label_get_yalign(
    this.raw.asInstanceOf[Ptr[GtkLabel]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects a range of characters in the label, if the label is selectable.
    *
    * See [method@Gtk.Label.set_selectable]. If the label is not selectable,
    * this function has no effect. If @start_offset or
    * @end_offset
    *   are -1, then the end of the label will be substituted.
    */
  def selectRegion(
      start_offset: Int /* Some(CInt) */,
      end_offset: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_label_select_region(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    start_offset,
    end_offset
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Apply attributes to the label text.
    *
    * The attributes set with this function will be applied and merged with any
    * other attributes previously effected by way of the
    * [property@Gtk.Label:use-underline] or [property@Gtk.Label:use-markup]
    * properties. While it is not recommended to mix markup strings with
    * manually set attributes, if you must; know that the attributes will be
    * applied to the label after the markup string is parsed.
    */
  def setAttributes(
      attrs: Option[Ptr[
        PangoAttrList
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]) */ ]
  ): Unit /* None */ = gtk_label_set_attributes(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    attrs
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the mode used to ellipsize the text.
    *
    * The text will be ellipsized if there is not enough space to render the
    * entire string.
    */
  def setEllipsize(
      mode: EllipsizeMode /* Some(_root_.sn.gnome.pango.internal.PangoEllipsizeMode) */
  ): Unit /* None */ =
    gtk_label_set_ellipsize(this.raw.asInstanceOf[Ptr[GtkLabel]], mode.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a menu model to add when constructing the context menu for @label.
    */
  def setExtraMenu(
      model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_label_set_extra_menu(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
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
    * Sets the alignment of the lines in the text of the label relative to each
    * other.
    *
    * %GTK_JUSTIFY_LEFT is the default value when the widget is first created
    * with [ctor@Gtk.Label.new]. If you instead want to set the alignment of the
    * label as a whole, use [method@Gtk.Widget.set_halign] instead.
    * [method@Gtk.Label.set_justify] has no effect on labels containing only a
    * single line.
    */
  def setJustify(
      jtype: Justification /* Some(GtkJustification) */
  ): Unit /* None */ =
    gtk_label_set_justify(this.raw.asInstanceOf[Ptr[GtkLabel]], jtype.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text of the label.
    *
    * The label is interpreted as including embedded underlines and/or Pango
    * markup depending on the values of the [property@Gtk.Label:use-underline]
    * and [property@Gtk.Label:use-markup] properties.
    */
  def setLabel(
      str: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_label_set_label(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    __sn_extract_string(str)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the number of lines to which an ellipsized, wrapping label should be
    * limited.
    *
    * This has no effect if the label is not wrapping or ellipsized. Set this to
    * -1 if you don’t want to limit the number of lines.
    */
  def setLines(lines: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_label_set_lines(this.raw.asInstanceOf[Ptr[GtkLabel]], lines)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the labels text and attributes from markup.
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
    */
  def setMarkup(
      str: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_label_set_markup(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    __sn_extract_string(str)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the labels text, attributes and mnemonic from markup.
    *
    * Parses @str which is marked up with Pango markup (see
    * [func@Pango.parse_markup]), setting the label’s text and attribute list
    * based on the parse results. If characters in @str are preceded by an
    * underscore, they are underlined indicating that they represent a keyboard
    * accelerator called a mnemonic.
    *
    * The mnemonic key can be used to activate another widget, chosen
    * automatically, or explicitly using [method@Gtk.Label.set_mnemonic_widget].
    */
  def setMarkupWithMnemonic(
      str: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_label_set_markup_with_mnemonic(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    __sn_extract_string(str)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the desired maximum width in characters of @label to @n_chars.
    */
  def setMaxWidthChars(n_chars: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_label_set_max_width_chars(this.raw.asInstanceOf[Ptr[GtkLabel]], n_chars)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associate the label with its mnemonic target.
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
    */
  def setMnemonicWidget(
      widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_label_set_mnemonic_widget(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select the line wrapping for the natural size request.
    *
    * This only affects the natural size requested, for the actual wrapping
    * used, see the [property@Gtk.Label:wrap-mode] property.
    */
  def setNaturalWrapMode(
      wrap_mode: NaturalWrapMode /* Some(GtkNaturalWrapMode) */
  ): Unit /* None */ = gtk_label_set_natural_wrap_mode(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    wrap_mode.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes text in the label selectable.
    *
    * Selectable labels allow the user to select text from the label, for
    * copy-and-paste.
    */
  def setSelectable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_label_set_selectable(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the label is in single line mode.
    */
  def setSingleLineMode(
      single_line_mode: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_label_set_single_line_mode(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    gboolean(gint((if single_line_mode == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default tab stops for paragraphs in @self.
    */
  def setTabs(
      tabs: Option[Ptr[
        PangoTabArray
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]) */ ]
  ): Unit /* None */ = gtk_label_set_tabs(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    tabs
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text within the `GtkLabel` widget.
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
    */
  def setText(
      str: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_label_set_text(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    __sn_extract_string(str)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the label’s text from the string @str.
    *
    * If characters in @str are preceded by an underscore, they are underlined
    * indicating that they represent a keyboard accelerator called a mnemonic.
    * The mnemonic key can be used to activate another widget, chosen
    * automatically, or explicitly using [method@Gtk.Label.set_mnemonic_widget].
    */
  def setTextWithMnemonic(
      str: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_label_set_text_with_mnemonic(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    __sn_extract_string(str)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the text of the label contains markup.
    *
    * See [method@Gtk.Label.set_markup].
    */
  def setUseMarkup(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_label_set_use_markup(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether underlines in the text indicate mnemonics.
    */
  def setUseUnderline(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_label_set_use_underline(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the desired width in characters of @label to @n_chars.
    */
  def setWidthChars(n_chars: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_label_set_width_chars(this.raw.asInstanceOf[Ptr[GtkLabel]], n_chars)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Toggles line wrapping within the `GtkLabel` widget.
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
    */
  def setWrap(
      wrap: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_label_set_wrap(
    this.raw.asInstanceOf[Ptr[GtkLabel]],
    gboolean(gint((if wrap == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Controls how line wrapping is done.
    *
    * This only affects the label if line wrapping is on. (See
    * [method@Gtk.Label.set_wrap]) The default is %PANGO_WRAP_WORD which means
    * wrap on word boundaries.
    *
    * For sizing behavior, also consider the
    * [property@Gtk.Label:natural-wrap-mode] property.
    */
  def setWrapMode(
      wrap_mode: WrapMode /* Some(_root_.sn.gnome.pango.internal.PangoWrapMode) */
  ): Unit /* None */ =
    gtk_label_set_wrap_mode(this.raw.asInstanceOf[Ptr[GtkLabel]], wrap_mode.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `xalign` of the label.
    *
    * See the [property@Gtk.Label:xalign] property.
    */
  def setXalign(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_label_set_xalign(
      this.raw.asInstanceOf[Ptr[GtkLabel]],
      xalign.asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `yalign` of the label.
    *
    * See the [property@Gtk.Label:yalign] property.
    */
  def setYalign(yalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_label_set_yalign(
      this.raw.asInstanceOf[Ptr[GtkLabel]],
      yalign.asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Label

object Label:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new label with the given text inside it.
    *
    * You can pass %NULL to get an empty label widget.
    */
  def apply(
      str: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Label = new Label(
    gtk_label_new(
      str
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkLabel`, containing the text in @str.
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
    */
  def withMnemonic(
      str: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Label = new Label(
    gtk_label_new_with_mnemonic(
      str
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
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
end Label

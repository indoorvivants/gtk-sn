package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkEditableProperties

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The identifiers for [iface@Gtk.Editable] properties.
  *
  * See [func@Gtk.Editable.install_properties] for details on how to implement
  * the `GtkEditable` interface.
  */
enum EditableProperties(val raw: GtkEditableProperties):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:text]
    */
  case PROP_TEXT
      extends EditableProperties(GtkEditableProperties.GTK_EDITABLE_PROP_TEXT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:cursor-position]
    */
  case PROP_CURSOR_POSITION
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_CURSOR_POSITION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:selection-bound]
    */
  case PROP_SELECTION_BOUND
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_SELECTION_BOUND
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:editable]
    */
  case PROP_EDITABLE
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_EDITABLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:width-chars]
    */
  case PROP_WIDTH_CHARS
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_WIDTH_CHARS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:max-width-chars]
    */
  case PROP_MAX_WIDTH_CHARS
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_MAX_WIDTH_CHARS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:xalign]
    */
  case PROP_XALIGN
      extends EditableProperties(GtkEditableProperties.GTK_EDITABLE_PROP_XALIGN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the property id for [property@Gtk.Editable:enable-undo]
    */
  case PROP_ENABLE_UNDO
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_ENABLE_UNDO
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the number of properties
    */
  case NUM_PROPERTIES
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_NUM_PROPERTIES
      )
end EditableProperties

object EditableProperties:
  def fromRaw(raw: GtkEditableProperties): EditableProperties =
    raw match
      case GtkEditableProperties.GTK_EDITABLE_PROP_TEXT =>
        EditableProperties.PROP_TEXT
      case GtkEditableProperties.GTK_EDITABLE_PROP_CURSOR_POSITION =>
        EditableProperties.PROP_CURSOR_POSITION
      case GtkEditableProperties.GTK_EDITABLE_PROP_SELECTION_BOUND =>
        EditableProperties.PROP_SELECTION_BOUND
      case GtkEditableProperties.GTK_EDITABLE_PROP_EDITABLE =>
        EditableProperties.PROP_EDITABLE
      case GtkEditableProperties.GTK_EDITABLE_PROP_WIDTH_CHARS =>
        EditableProperties.PROP_WIDTH_CHARS
      case GtkEditableProperties.GTK_EDITABLE_PROP_MAX_WIDTH_CHARS =>
        EditableProperties.PROP_MAX_WIDTH_CHARS
      case GtkEditableProperties.GTK_EDITABLE_PROP_XALIGN =>
        EditableProperties.PROP_XALIGN
      case GtkEditableProperties.GTK_EDITABLE_PROP_ENABLE_UNDO =>
        EditableProperties.PROP_ENABLE_UNDO
      case GtkEditableProperties.GTK_EDITABLE_NUM_PROPERTIES =>
        EditableProperties.NUM_PROPERTIES
  end fromRaw
end EditableProperties

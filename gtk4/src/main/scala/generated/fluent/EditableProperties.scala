package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkEditableProperties

/** The identifiers for [iface@Gtk.Editable] properties.
  *
  * See [func@Gtk.Editable.install_properties] for details on how to implement
  * the `GtkEditable` interface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum EditableProperties(val raw: GtkEditableProperties):
  /** the property id for [property@Gtk.Editable:text]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_TEXT
      extends EditableProperties(GtkEditableProperties.GTK_EDITABLE_PROP_TEXT)

  /** the property id for [property@Gtk.Editable:cursor-position]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_CURSOR_POSITION
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_CURSOR_POSITION
      )

  /** the property id for [property@Gtk.Editable:selection-bound]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_SELECTION_BOUND
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_SELECTION_BOUND
      )

  /** the property id for [property@Gtk.Editable:editable]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_EDITABLE
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_EDITABLE
      )

  /** the property id for [property@Gtk.Editable:width-chars]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_WIDTH_CHARS
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_WIDTH_CHARS
      )

  /** the property id for [property@Gtk.Editable:max-width-chars]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_MAX_WIDTH_CHARS
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_MAX_WIDTH_CHARS
      )

  /** the property id for [property@Gtk.Editable:xalign]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_XALIGN
      extends EditableProperties(GtkEditableProperties.GTK_EDITABLE_PROP_XALIGN)

  /** the property id for [property@Gtk.Editable:enable-undo]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROP_ENABLE_UNDO
      extends EditableProperties(
        GtkEditableProperties.GTK_EDITABLE_PROP_ENABLE_UNDO
      )

  /** the number of properties
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

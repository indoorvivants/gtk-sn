package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkAccessibleRole

/** The accessible role for a [iface@Accessible] implementation.
  *
  * Abstract roles are only used as part of the ontology; application developers
  * must not use abstract roles in their code.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AccessibleRole(val raw: GtkAccessibleRole):
  /** An element with important, and usually time-sensitive, information
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALERT extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT)

  /** A type of dialog that contains an alert message
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALERT_DIALOG
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT_DIALOG)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BANNER
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BANNER)

  /** An input element that allows for user-triggered actions when clicked or
    * pressed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUTTON
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BUTTON)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CAPTION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CAPTION)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CELL extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CELL)

  /** A checkable input element that has three possible values: `true`, `false`,
    * or `mixed`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHECKBOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CHECKBOX)

  /** A header in a columned list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLUMN_HEADER
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COLUMN_HEADER
      )

  /** An input that controls another element, such as a list or a grid, that can
    * dynamically pop up to help the user set the value of the input
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMBO_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMBO_BOX)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMMAND
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMMAND)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMPOSITE
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMPOSITE)

  /** A dialog is a window that is designed to interrupt the current processing
    * of an application in order to prompt the user to enter information or
    * require a response.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIALOG
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DIALOG)

  /** Content that assistive technology users may want to browse in a reading
    * mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOCUMENT
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DOCUMENT)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FEED extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FEED)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FORM extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FORM)

  /** A nameless container that has no semantic meaning of its own. This is the
    * role that GTK uses by default for widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GENERIC
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GENERIC)

  /** A grid of items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRID extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID)

  /** An item in a grid or tree grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRID_CELL
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID_CELL)

  /** An element that groups multiple related widgets. GTK uses this role for
    * various containers, like [class@Gtk.HeaderBar] or [class@Gtk.Notebook].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GROUP extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GROUP)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEADING
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_HEADING)

  /** An image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IMG extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_IMG)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INPUT extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_INPUT)

  /** A visible name or caption for a user interface component.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LABEL extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LABEL)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LANDMARK
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LANDMARK)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEGEND
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LEGEND)

  /** A clickable link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINK extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LINK)

  /** A list of items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIST extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST)

  /** Unused.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIST_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_BOX)

  /** An item in a list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIST_ITEM
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_ITEM)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOG extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LOG)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MAIN extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MAIN)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MARQUEE
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MARQUEE)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MATH extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MATH)

  /** An element that represents a value within a known range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case METER extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_METER)

  /** A menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MENU extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU)

  /** A menubar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MENU_BAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_BAR)

  /** An item in a menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MENU_ITEM
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM)

  /** A check item in a menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MENU_ITEM_CHECKBOX
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX
      )

  /** A radio item in a menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MENU_ITEM_RADIO
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO
      )

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NAVIGATION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NAVIGATION)

  /** An element that is not represented to accessibility technologies. This
    * role is synonymous to @GTK_ACCESSIBLE_ROLE_PRESENTATION.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NONE)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOTE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NOTE)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPTION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_OPTION)

  /** An element that is not represented to accessibility technologies. This
    * role is synonymous to @GTK_ACCESSIBLE_ROLE_NONE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRESENTATION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PRESENTATION)

  /** An element that displays the progress status for tasks that take a long
    * time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROGRESS_BAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PROGRESS_BAR)

  /** A checkable input in a group of radio roles, only one of which can be
    * checked at a time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RADIO extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RADIO_GROUP
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO_GROUP)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RANGE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RANGE)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REGION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_REGION)

  /** A row in a columned list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROW extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROW_GROUP
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_GROUP)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROW_HEADER
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_HEADER)

  /** A graphical object that controls the scrolling of content within a viewing
    * area, regardless of whether the content is fully displayed within the
    * viewing area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SCROLLBAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SCROLLBAR)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEARCH
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH)

  /** A type of textbox intended for specifying search criteria.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEARCH_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH_BOX)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SECTION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SECTION_HEAD
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION_HEAD)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SELECT
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SELECT)

  /** A divider that separates and distinguishes sections of content or groups
    * of menuitems.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEPARATOR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEPARATOR)

  /** A user input where the user selects a value from within a given range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDER
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SLIDER)

  /** A form of range that expects the user to select from among discrete
    * choices.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SPIN_BUTTON
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SPIN_BUTTON)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STATUS
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STATUS)

  /** Abstract role.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRUCTURE
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STRUCTURE)

  /** A type of checkbox that represents on/off values, as opposed to
    * checked/unchecked values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SWITCH
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SWITCH)

  /** An item in a list of tab used for switching pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAB extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TABLE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TABLE)

  /** A list of tabs for switching pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAB_LIST
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_LIST)

  /** A page in a notebook or stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAB_PANEL
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_PANEL)

  /** A type of input that allows free-form text as its value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TEXT_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TEXT_BOX)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIME extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIME)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIMER extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIMER)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOOLBAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLBAR)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOOLTIP
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLTIP)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TREE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE)

  /** A treeview-like, columned list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TREE_GRID
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_GRID)

  /** Unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TREE_ITEM
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_ITEM)

  /** Abstract role for interactive components of a graphical user interface
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WIDGET
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WIDGET)

  /** Abstract role for windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WINDOW
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WINDOW)

  /** A type of push button which stays pressed until depressed by a second
    * activation. Since: 4.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOGGLE_BUTTON
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOGGLE_BUTTON
      )

  /** A toplevel element of a graphical user interface. This is the role that
    * GTK uses by default for windows. Since: 4.12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APPLICATION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_APPLICATION)
end AccessibleRole

object AccessibleRole:
  def fromRaw(raw: GtkAccessibleRole): AccessibleRole =
    raw match
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT => AccessibleRole.ALERT
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT_DIALOG =>
        AccessibleRole.ALERT_DIALOG
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BANNER => AccessibleRole.BANNER
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BUTTON => AccessibleRole.BUTTON
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CAPTION =>
        AccessibleRole.CAPTION
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CELL     => AccessibleRole.CELL
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CHECKBOX =>
        AccessibleRole.CHECKBOX
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COLUMN_HEADER =>
        AccessibleRole.COLUMN_HEADER
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMBO_BOX =>
        AccessibleRole.COMBO_BOX
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMMAND =>
        AccessibleRole.COMMAND
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMPOSITE =>
        AccessibleRole.COMPOSITE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DIALOG => AccessibleRole.DIALOG
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DOCUMENT =>
        AccessibleRole.DOCUMENT
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FEED    => AccessibleRole.FEED
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FORM    => AccessibleRole.FORM
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GENERIC =>
        AccessibleRole.GENERIC
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID => AccessibleRole.GRID
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID_CELL =>
        AccessibleRole.GRID_CELL
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GROUP   => AccessibleRole.GROUP
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_HEADING =>
        AccessibleRole.HEADING
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_IMG   => AccessibleRole.IMG
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_INPUT => AccessibleRole.INPUT
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LABEL => AccessibleRole.LABEL
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LANDMARK =>
        AccessibleRole.LANDMARK
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LEGEND => AccessibleRole.LEGEND
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LINK   => AccessibleRole.LINK
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST   => AccessibleRole.LIST
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_BOX =>
        AccessibleRole.LIST_BOX
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_ITEM =>
        AccessibleRole.LIST_ITEM
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LOG     => AccessibleRole.LOG
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MAIN    => AccessibleRole.MAIN
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MARQUEE =>
        AccessibleRole.MARQUEE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MATH  => AccessibleRole.MATH
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_METER => AccessibleRole.METER
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU  => AccessibleRole.MENU
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_BAR =>
        AccessibleRole.MENU_BAR
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM =>
        AccessibleRole.MENU_ITEM
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX =>
        AccessibleRole.MENU_ITEM_CHECKBOX
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO =>
        AccessibleRole.MENU_ITEM_RADIO
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NAVIGATION =>
        AccessibleRole.NAVIGATION
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NONE   => AccessibleRole.NONE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NOTE   => AccessibleRole.NOTE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_OPTION => AccessibleRole.OPTION
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PRESENTATION =>
        AccessibleRole.PRESENTATION
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PROGRESS_BAR =>
        AccessibleRole.PROGRESS_BAR
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO => AccessibleRole.RADIO
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO_GROUP =>
        AccessibleRole.RADIO_GROUP
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RANGE  => AccessibleRole.RANGE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_REGION => AccessibleRole.REGION
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW    => AccessibleRole.ROW
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_GROUP =>
        AccessibleRole.ROW_GROUP
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_HEADER =>
        AccessibleRole.ROW_HEADER
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SCROLLBAR =>
        AccessibleRole.SCROLLBAR
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH => AccessibleRole.SEARCH
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH_BOX =>
        AccessibleRole.SEARCH_BOX
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION =>
        AccessibleRole.SECTION
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION_HEAD =>
        AccessibleRole.SECTION_HEAD
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SELECT => AccessibleRole.SELECT
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEPARATOR =>
        AccessibleRole.SEPARATOR
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SLIDER => AccessibleRole.SLIDER
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SPIN_BUTTON =>
        AccessibleRole.SPIN_BUTTON
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STATUS => AccessibleRole.STATUS
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STRUCTURE =>
        AccessibleRole.STRUCTURE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SWITCH => AccessibleRole.SWITCH
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB    => AccessibleRole.TAB
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TABLE  => AccessibleRole.TABLE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_LIST =>
        AccessibleRole.TAB_LIST
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_PANEL =>
        AccessibleRole.TAB_PANEL
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TEXT_BOX =>
        AccessibleRole.TEXT_BOX
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIME    => AccessibleRole.TIME
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIMER   => AccessibleRole.TIMER
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLBAR =>
        AccessibleRole.TOOLBAR
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLTIP =>
        AccessibleRole.TOOLTIP
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE => AccessibleRole.TREE
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_GRID =>
        AccessibleRole.TREE_GRID
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_ITEM =>
        AccessibleRole.TREE_ITEM
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WIDGET => AccessibleRole.WIDGET
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WINDOW => AccessibleRole.WINDOW
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOGGLE_BUTTON =>
        AccessibleRole.TOGGLE_BUTTON
      case GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_APPLICATION =>
        AccessibleRole.APPLICATION
  end fromRaw
end AccessibleRole

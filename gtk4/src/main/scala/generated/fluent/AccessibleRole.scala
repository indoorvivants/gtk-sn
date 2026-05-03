package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleRole

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The accessible role for a [iface@Accessible] implementation.
  *
  * Abstract roles are only used as part of the ontology; application developers
  * must not use abstract roles in their code.
  */
enum AccessibleRole(val raw: GtkAccessibleRole):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An element with important, and usually time-sensitive, information
    */
  case ALERT extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A type of dialog that contains an alert message
    */
  case ALERT_DIALOG
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ALERT_DIALOG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case BANNER
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BANNER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An input element that allows for user-triggered actions when clicked or
    * pressed
    */
  case BUTTON
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_BUTTON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case CAPTION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CAPTION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case CELL extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CELL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A checkable input element that has three possible values: `true`, `false`,
    * or `mixed`
    */
  case CHECKBOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_CHECKBOX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A header in a columned list.
    */
  case COLUMN_HEADER
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COLUMN_HEADER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An input that controls another element, such as a list or a grid, that can
    * dynamically pop up to help the user set the value of the input
    */
  case COMBO_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMBO_BOX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case COMMAND
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMMAND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case COMPOSITE
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_COMPOSITE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A dialog is a window that is designed to interrupt the current processing
    * of an application in order to prompt the user to enter information or
    * require a response.
    */
  case DIALOG
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DIALOG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Content that assistive technology users may want to browse in a reading
    * mode.
    */
  case DOCUMENT
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_DOCUMENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case FEED extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FEED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case FORM extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_FORM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A nameless container that has no semantic meaning of its own. This is the
    * role that GTK uses by default for widgets.
    */
  case GENERIC
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GENERIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A grid of items.
    */
  case GRID extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An item in a grid or tree grid.
    */
  case GRID_CELL
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GRID_CELL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An element that groups multiple related widgets. GTK uses this role for
    * various containers, like [class@Gtk.HeaderBar] or [class@Gtk.Notebook].
    */
  case GROUP extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_GROUP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case HEADING
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_HEADING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An image.
    */
  case IMG extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_IMG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case INPUT extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_INPUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A visible name or caption for a user interface component.
    */
  case LABEL extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LABEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case LANDMARK
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LANDMARK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case LEGEND
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LEGEND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A clickable link.
    */
  case LINK extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LINK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A list of items.
    */
  case LIST extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused.
    */
  case LIST_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_BOX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An item in a list.
    */
  case LIST_ITEM
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LIST_ITEM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case LOG extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_LOG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case MAIN extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MAIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case MARQUEE
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MARQUEE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case MATH extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MATH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An element that represents a value within a known range.
    */
  case METER extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_METER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A menu.
    */
  case MENU extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A menubar.
    */
  case MENU_BAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_BAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An item in a menu.
    */
  case MENU_ITEM
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A check item in a menu.
    */
  case MENU_ITEM_CHECKBOX
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A radio item in a menu.
    */
  case MENU_ITEM_RADIO
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case NAVIGATION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NAVIGATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An element that is not represented to accessibility technologies. This
    * role is synonymous to @GTK_ACCESSIBLE_ROLE_PRESENTATION.
    */
  case NONE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case NOTE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_NOTE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case OPTION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_OPTION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An element that is not represented to accessibility technologies. This
    * role is synonymous to @GTK_ACCESSIBLE_ROLE_NONE.
    */
  case PRESENTATION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PRESENTATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An element that displays the progress status for tasks that take a long
    * time.
    */
  case PROGRESS_BAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_PROGRESS_BAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A checkable input in a group of radio roles, only one of which can be
    * checked at a time.
    */
  case RADIO extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case RADIO_GROUP
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RADIO_GROUP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case RANGE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_RANGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case REGION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_REGION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A row in a columned list.
    */
  case ROW extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case ROW_GROUP
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_GROUP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case ROW_HEADER
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_ROW_HEADER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A graphical object that controls the scrolling of content within a viewing
    * area, regardless of whether the content is fully displayed within the
    * viewing area.
    */
  case SCROLLBAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SCROLLBAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case SEARCH
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A type of textbox intended for specifying search criteria.
    */
  case SEARCH_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEARCH_BOX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case SECTION
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case SECTION_HEAD
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SECTION_HEAD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case SELECT
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SELECT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A divider that separates and distinguishes sections of content or groups
    * of menuitems.
    */
  case SEPARATOR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SEPARATOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A user input where the user selects a value from within a given range.
    */
  case SLIDER
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SLIDER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A form of range that expects the user to select from among discrete
    * choices.
    */
  case SPIN_BUTTON
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SPIN_BUTTON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case STATUS
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STATUS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role.
    */
  case STRUCTURE
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_STRUCTURE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A type of checkbox that represents on/off values, as opposed to
    * checked/unchecked values.
    */
  case SWITCH
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_SWITCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An item in a list of tab used for switching pages.
    */
  case TAB extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case TABLE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TABLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A list of tabs for switching pages.
    */
  case TAB_LIST
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_LIST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A page in a notebook or stack.
    */
  case TAB_PANEL
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TAB_PANEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A type of input that allows free-form text as its value.
    */
  case TEXT_BOX
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TEXT_BOX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case TIME extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case TIMER extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TIMER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case TOOLBAR
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLBAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case TOOLTIP
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOOLTIP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case TREE extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A treeview-like, columned list.
    */
  case TREE_GRID
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_GRID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unused
    */
  case TREE_ITEM
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TREE_ITEM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role for interactive components of a graphical user interface
    */
  case WIDGET
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WIDGET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Abstract role for windows.
    */
  case WINDOW
      extends AccessibleRole(GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_WINDOW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A type of push button which stays pressed until depressed by a second
    * activation. Since: 4.10
    */
  case TOGGLE_BUTTON
      extends AccessibleRole(
        GtkAccessibleRole.GTK_ACCESSIBLE_ROLE_TOGGLE_BUTTON
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A toplevel element of a graphical user interface. This is the role that
    * GTK uses by default for windows. Since: 4.12
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

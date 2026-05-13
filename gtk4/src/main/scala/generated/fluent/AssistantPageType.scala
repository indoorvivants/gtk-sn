package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkAssistantPageType

/** Determines the page role inside a `GtkAssistant`.
  *
  * The role is used to handle buttons sensitivity and visibility.
  *
  * Note that an assistant needs to end its page flow with a page of type
  * %GTK_ASSISTANT_PAGE_CONFIRM, %GTK_ASSISTANT_PAGE_SUMMARY or
  * %GTK_ASSISTANT_PAGE_PROGRESS to be correct.
  *
  * The Cancel button will only be shown if the page isn’t “committed”. See
  * gtk_assistant_commit() for details.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AssistantPageType(val raw: GtkAssistantPageType):
  /** The page has regular contents. Both the Back and forward buttons will be
    * shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONTENT
      extends AssistantPageType(GtkAssistantPageType.GTK_ASSISTANT_PAGE_CONTENT)

  /** The page contains an introduction to the assistant task. Only the Forward
    * button will be shown if there is a next page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTRO
      extends AssistantPageType(GtkAssistantPageType.GTK_ASSISTANT_PAGE_INTRO)

  /** The page lets the user confirm or deny the changes. The Back and Apply
    * buttons will be shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONFIRM
      extends AssistantPageType(GtkAssistantPageType.GTK_ASSISTANT_PAGE_CONFIRM)

  /** The page informs the user of the changes done. Only the Close button will
    * be shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUMMARY
      extends AssistantPageType(GtkAssistantPageType.GTK_ASSISTANT_PAGE_SUMMARY)

  /** Used for tasks that take a long time to complete, blocks the assistant
    * until the page is marked as complete. Only the back button will be shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROGRESS
      extends AssistantPageType(
        GtkAssistantPageType.GTK_ASSISTANT_PAGE_PROGRESS
      )

  /** Used for when other page types are not appropriate. No buttons will be
    * shown, and the application must add its own buttons through
    * gtk_assistant_add_action_widget().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CUSTOM
      extends AssistantPageType(GtkAssistantPageType.GTK_ASSISTANT_PAGE_CUSTOM)
end AssistantPageType

object AssistantPageType:
  def fromRaw(raw: GtkAssistantPageType): AssistantPageType =
    raw match
      case GtkAssistantPageType.GTK_ASSISTANT_PAGE_CONTENT =>
        AssistantPageType.CONTENT
      case GtkAssistantPageType.GTK_ASSISTANT_PAGE_INTRO =>
        AssistantPageType.INTRO
      case GtkAssistantPageType.GTK_ASSISTANT_PAGE_CONFIRM =>
        AssistantPageType.CONFIRM
      case GtkAssistantPageType.GTK_ASSISTANT_PAGE_SUMMARY =>
        AssistantPageType.SUMMARY
      case GtkAssistantPageType.GTK_ASSISTANT_PAGE_PROGRESS =>
        AssistantPageType.PROGRESS
      case GtkAssistantPageType.GTK_ASSISTANT_PAGE_CUSTOM =>
        AssistantPageType.CUSTOM
  end fromRaw
end AssistantPageType

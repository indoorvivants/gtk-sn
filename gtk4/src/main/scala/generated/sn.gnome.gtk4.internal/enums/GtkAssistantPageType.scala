package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAssistantPageType: _ASSISTANT_PAGE_CONTENT: The page has regular contents. Both the Back and forward buttons will be shown. _ASSISTANT_PAGE_INTRO: The page contains an introduction to the assistant task. Only the Forward button will be shown if there is a next page. _ASSISTANT_PAGE_CONFIRM: The page lets the user confirm or deny the changes. The Back and Apply buttons will be shown. _ASSISTANT_PAGE_SUMMARY: The page informs the user of the changes done. Only the Close button will be shown. _ASSISTANT_PAGE_PROGRESS: Used for tasks that take a long time to complete, blocks the assistant until the page is marked as complete. Only the back button will be shown. _ASSISTANT_PAGE_CUSTOM: Used for when other page types are not appropriate. No buttons will be shown, and the application must add its own buttons through gtk_assistant_add_action_widget().
*/
opaque type GtkAssistantPageType = CUnsignedInt
object GtkAssistantPageType extends _BindgenEnumCUnsignedInt[GtkAssistantPageType]:
  given _tag: Tag[GtkAssistantPageType] = Tag.UInt
  inline def define(inline a: Long): GtkAssistantPageType = a.toUInt
  val GTK_ASSISTANT_PAGE_CONTENT = define(0)
  val GTK_ASSISTANT_PAGE_INTRO = define(1)
  val GTK_ASSISTANT_PAGE_CONFIRM = define(2)
  val GTK_ASSISTANT_PAGE_SUMMARY = define(3)
  val GTK_ASSISTANT_PAGE_PROGRESS = define(4)
  val GTK_ASSISTANT_PAGE_CUSTOM = define(5)
  def getName(value: GtkAssistantPageType): Option[String] =
    value match
      case `GTK_ASSISTANT_PAGE_CONTENT` => Some("GTK_ASSISTANT_PAGE_CONTENT")
      case `GTK_ASSISTANT_PAGE_INTRO` => Some("GTK_ASSISTANT_PAGE_INTRO")
      case `GTK_ASSISTANT_PAGE_CONFIRM` => Some("GTK_ASSISTANT_PAGE_CONFIRM")
      case `GTK_ASSISTANT_PAGE_SUMMARY` => Some("GTK_ASSISTANT_PAGE_SUMMARY")
      case `GTK_ASSISTANT_PAGE_PROGRESS` => Some("GTK_ASSISTANT_PAGE_PROGRESS")
      case `GTK_ASSISTANT_PAGE_CUSTOM` => Some("GTK_ASSISTANT_PAGE_CUSTOM")
      case _ => _root_.scala.None
  extension (a: GtkAssistantPageType)
    inline def &(b: GtkAssistantPageType): GtkAssistantPageType = a & b
    inline def |(b: GtkAssistantPageType): GtkAssistantPageType = a | b
    inline def is(b: GtkAssistantPageType): Boolean = (a & b) == b
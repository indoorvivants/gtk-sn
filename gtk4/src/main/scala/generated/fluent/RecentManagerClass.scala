package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkRecentManagerClass

/** `GtkRecentManagerClass` contains only private data.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RecentManagerClass private[gnome] (raw: Ptr[GtkRecentManagerClass]):

  def getUnsafeRawPointer(): Ptr[GtkRecentManagerClass] = this.raw

  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field _gtk_recent1]: Field is missing <type>")
  private def GtkRecent1__ = ???
  @annotation.compileTimeOnly("[field _gtk_recent2]: Field is missing <type>")
  private def GtkRecent2__ = ???
  @annotation.compileTimeOnly("[field _gtk_recent3]: Field is missing <type>")
  private def GtkRecent3__ = ???
  @annotation.compileTimeOnly("[field _gtk_recent4]: Field is missing <type>")
  private def GtkRecent4__ = ???
end RecentManagerClass

object RecentManagerClass:
  def fromRaw(ptr: Ptr[GtkRecentManagerClass]): RecentManagerClass =
    new RecentManagerClass(ptr)
end RecentManagerClass

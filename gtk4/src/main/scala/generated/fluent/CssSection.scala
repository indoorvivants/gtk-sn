package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.File
import sn.gnome.glib.String
import sn.gnome.gtk4.{CssLocation, CssSection}
import sn.gnome.gtk4.internal.GtkCssSection

/** Defines a part of a CSS document.
  *
  * Because sections are nested into one another, you can use
  * [method@CssSection.get_parent] to get the containing region.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CssSection private[gnome] (raw: Ptr[GtkCssSection]):

  def getUnsafeRawPointer(): Ptr[GtkCssSection] = this.raw

  /** Returns the location in the CSS document where this section ends.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEndLocation(): sn.gnome.gtk4.CssLocation /* None */ =
    sn.gnome.gtk4.CssLocation.fromRaw(
      gtk_css_section_get_end_location(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]]
      )
    )
  end getEndLocation

  /** Gets the file that @section was parsed from.
    *
    * If no such file exists, for example because the CSS was loaded via
    * [method@Gtk.CssProvider.load_from_data], then `NULL` is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): sn.gnome.gio.File /* None */ =
    new File.Abstract(
      gtk_css_section_get_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]]
      ).asInstanceOf
    )
  end getFile

  /** Gets the parent section for the given `section`.
    *
    * The parent section is the section that contains this `section`. A special
    * case are sections of type `GTK_CSS_SECTION_DOCUMEN`T. Their parent will
    * either be `NULL` if they are the original CSS document that was loaded by
    * [method@Gtk.CssProvider.load_from_file] or a section of type
    * `GTK_CSS_SECTION_IMPORT` if it was loaded with an `@import` rule from a
    * different file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParent(): sn.gnome.gtk4.CssSection /* None */ =
    sn.gnome.gtk4.CssSection.fromRaw(
      gtk_css_section_get_parent(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]]
      )
    )
  end getParent

  /** Returns the location in the CSS document where this section starts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartLocation(): sn.gnome.gtk4.CssLocation /* None */ =
    sn.gnome.gtk4.CssLocation.fromRaw(
      gtk_css_section_get_start_location(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]]
      )
    )
  end getStartLocation

  /** Prints the `section` into `string` in a human-readable form.
    *
    * This is a form like `gtk.css:32:1-23` to denote line 32, characters 1 to
    * 23 in the file `gtk.css`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def print(
      string: sn.gnome.glib.String /* Some(Ptr[_root_.sn.gnome.glib.internal.GString]) */
  ): Unit /* None */ =
    gtk_css_section_print(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]],
      string.getUnsafeRawPointer().asInstanceOf
    )
  end print

  /** Increments the reference count on `section`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gtk4.CssSection /* None */ =
    sn.gnome.gtk4.CssSection.fromRaw(
      gtk_css_section_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]]
      )
    )
  end ref

  /** Prints the section into a human-readable text form using
    * [method@Gtk.CssSection.print].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      gtk_css_section_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]]
      ).asInstanceOf
    )
  end _toString

  /** Decrements the reference count on `section`, freeing the structure if the
    * reference count reaches 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gtk_css_section_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCssSection]]
    )
  end unref

end CssSection

object CssSection:
  def fromRaw(ptr: Ptr[GtkCssSection]): CssSection = new CssSection(ptr)
end CssSection

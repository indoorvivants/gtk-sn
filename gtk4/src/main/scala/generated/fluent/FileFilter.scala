package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{Buildable, Filter}
import sn.gnome.gtk4.internal.GtkFileFilter
import sn.gnome.runtime.*

/** `GtkFileFilter` filters files by name or mime type.
  *
  * `GtkFileFilter` can be used to restrict the files being shown in a
  * `GtkFileChooser`. Files can be filtered based on their name (with
  * [method@Gtk.FileFilter.add_pattern] or [method@Gtk.FileFilter.add_suffix])
  * or on their mime type (with [method@Gtk.FileFilter.add_mime_type]).
  *
  * Filtering by mime types handles aliasing and subclassing of mime types; e.g.
  * a filter for text/plain also matches a file with mime type application/rtf,
  * since application/rtf is a subclass of text/plain. Note that `GtkFileFilter`
  * allows wildcards for the subtype of a mime type, so you can e.g. filter for
  * image/\*.
  *
  * Normally, file filters are used by adding them to a `GtkFileChooser` (see
  * [method@Gtk.FileChooser.add_filter]), but it is also possible to manually
  * use a file filter on any [class@Gtk.FilterListModel] containing `GFileInfo`
  * objects.
  *
  * # GtkFileFilter as GtkBuildable
  *
  * The `GtkFileFilter` implementation of the `GtkBuildable` interface supports
  * adding rules using the `<mime-types>` and `<patterns>` and `<suffixes>`
  * elements and listing the rules within. Specifying a `<mime-type>` or
  * `<pattern>` or `<suffix>` has the same effect as as calling
  * [method@Gtk.FileFilter.add_mime_type] or [method@Gtk.FileFilter.add_pattern]
  * or [method@Gtk.FileFilter.add_suffix].
  *
  * An example of a UI definition fragment specifying `GtkFileFilter` rules:
  * ```xml
  * <object class="GtkFileFilter">
  *   <property name="name" translatable="yes">Text and Images</property>
  *   <mime-types>
  *     <mime-type>text/plain</mime-type>
  *     <mime-type>image/ *</mime-type>
  *   </mime-types>
  *   <patterns>
  *     <pattern>*.txt</pattern>
  *   </patterns>
  *   <suffixes>
  *     <suffix>png</suffix>
  *   </suffixes>
  * </object>
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileFilter(raw: Ptr[GtkFileFilter])
    extends Filter(raw.asInstanceOf),
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a rule allowing a given mime type to @filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMimeType(
      mime_type: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_file_filter_add_mime_type(
    this.raw.asInstanceOf[Ptr[GtkFileFilter]],
    __sn_extract_string(mime_type)
  )

  /** Adds a rule allowing a shell style glob to a filter.
    *
    * Note that it depends on the platform whether pattern matching ignores case
    * or not. On Windows, it does, on other platforms, it doesn't.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPattern(
      pattern: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_file_filter_add_pattern(
    this.raw.asInstanceOf[Ptr[GtkFileFilter]],
    __sn_extract_string(pattern)
  )

  /** Adds a rule allowing image files in the formats supported by GdkPixbuf.
    *
    * This is equivalent to calling [method@Gtk.FileFilter.add_mime_type] for
    * all the supported mime types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPixbufFormats(): Unit /* None */ = gtk_file_filter_add_pixbuf_formats(
    this.raw.asInstanceOf[Ptr[GtkFileFilter]]
  )

  /** Adds a suffix match rule to a filter.
    *
    * This is similar to adding a match for the pattern "*.@suffix".
    *
    * In contrast to pattern matches, suffix matches are *always*
    * case-insensitive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSuffix(
      suffix: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_file_filter_add_suffix(
    this.raw.asInstanceOf[Ptr[GtkFileFilter]],
    __sn_extract_string(suffix)
  )

  /** Gets the attributes that need to be filled in for the `GFileInfo` passed
    * to this filter.
    *
    * This function will not typically be used by applications; it is intended
    * principally for use in the implementation of `GtkFileChooser`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributes()(using Zone): Array[String] /* None */ = MemoryRead
    .nullTerminatedPointerArray(
      gtk_file_filter_get_attributes(this.raw.asInstanceOf[Ptr[GtkFileFilter]])
    )
    .map(fromCString(_))

  /** Gets the human-readable name for the filter.
    *
    * See [method@Gtk.FileFilter.set_name].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ = fromCString(
    gtk_file_filter_get_name(
      this.raw.asInstanceOf[Ptr[GtkFileFilter]]
    ).asInstanceOf
  )

  /** Sets a human-readable name of the filter.
    *
    * This is the string that will be displayed in the file chooser if there is
    * a selectable list of filters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_file_filter_set_name(
    this.raw.asInstanceOf[Ptr[GtkFileFilter]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Serialize a file filter to an `a{sv}` variant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_gvariant/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def toGvariant__ = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FileFilter

object FileFilter:
  /** Creates a new `GtkFileFilter` with no rules added to it.
    *
    * Such a filter doesn’t accept any files, so is not particularly useful
    * until you add rules with [method@Gtk.FileFilter.add_mime_type],
    * [method@Gtk.FileFilter.add_pattern], [method@Gtk.FileFilter.add_suffix] or
    * [method@Gtk.FileFilter.add_pixbuf_formats].
    *
    * To create a filter that accepts any file, use:
    * ```c
    * GtkFileFilter *filter = gtk_file_filter_new ();
    * gtk_file_filter_add_pattern (filter, "*");
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): FileFilter = new FileFilter(gtk_file_filter_new().asInstanceOf)

  /** Deserialize a file filter from a `GVariant`.
    *
    * The variant must be in the format produced by
    * [method@Gtk.FileFilter.to_gvariant].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variant]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def new_from_gvariant() = ???

end FileFilter

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.Variant
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Buildable, Filter}
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
class FileFilter private[gnome] (raw: Ptr[GtkFileFilter])
    extends Filter(raw.asInstanceOf),
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a rule allowing a given mime type to @filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMimeType(
      mime_type: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_file_filter_add_mime_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]],
      summon[Runtime].inZone(toCString(mime_type))
    )
  end addMimeType

  /** Adds a rule allowing a shell style glob to a filter.
    *
    * Note that it depends on the platform whether pattern matching ignores case
    * or not. On Windows, it does, on other platforms, it doesn't.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPattern(
      pattern: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_file_filter_add_pattern(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]],
      summon[Runtime].inZone(toCString(pattern))
    )
  end addPattern

  /** Adds a rule allowing image files in the formats supported by GdkPixbuf.
    *
    * This is equivalent to calling [method@Gtk.FileFilter.add_mime_type] for
    * all the supported mime types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPixbufFormats(): Unit /* None */ =
    gtk_file_filter_add_pixbuf_formats(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]]
    )
  end addPixbufFormats

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
      suffix: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_file_filter_add_suffix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]],
      summon[Runtime].inZone(toCString(suffix))
    )
  end addSuffix

  /** Gets the attributes that need to be filled in for the `GFileInfo` passed
    * to this filter.
    *
    * This function will not typically be used by applications; it is intended
    * principally for use in the implementation of `GtkFileChooser`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributes(): scala.Array[scala.Predef.String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_file_filter_get_attributes(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]]
        )
      )
      .map(fromCString(_))
  end getAttributes

  /** Gets the human-readable name for the filter.
    *
    * See [method@Gtk.FileFilter.set_name].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_file_filter_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]]
      ).asInstanceOf
    )
  end getName

  /** Sets a human-readable name of the filter.
    *
    * This is the string that will be displayed in the file chooser if there is
    * a selectable list of filters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(name: Option[scala.Predef.String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_file_filter_set_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]],
      name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setName

  /** Serialize a file filter to an `a{sv}` variant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toGvariant(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      gtk_file_filter_to_gvariant(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileFilter]]
      )
    )
  end toGvariant

end FileFilter

object FileFilter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFileFilter])(using Runtime) =
    summon[Runtime].getOrCreate[FileFilter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FileFilter(ptr)
    )

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
  def apply()(using Runtime): FileFilter =
    val raw: Ptr[Byte] = gtk_file_filter_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[FileFilter](raw, r => FileFilter.applyUnsafe(r.asInstanceOf))
  end apply

  /** Deserialize a file filter from a `GVariant`.
    *
    * The variant must be in the format produced by
    * [method@Gtk.FileFilter.to_gvariant].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromGvariant(
      variant: sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
  )(using Runtime): FileFilter =
    val raw: Ptr[Byte] = gtk_file_filter_new_from_gvariant(
      variant.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[FileFilter](raw, r => FileFilter.applyUnsafe(r.asInstanceOf))
  end fromGvariant
end FileFilter

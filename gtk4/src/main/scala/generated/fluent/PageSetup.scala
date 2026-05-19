package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{GTKUnit, PageOrientation, PageSetup}
import sn.gnome.gtk4.internal.GtkPageSetup

/** A `GtkPageSetup` object stores the page size, orientation and margins.
  *
  * The idea is that you can get one of these from the page setup dialog and
  * then pass it to the `GtkPrintOperation` when printing. The benefit of
  * splitting this out of the `GtkPrintSettings` is that these affect the actual
  * layout of the page, and thus need to be set long before user prints.
  *
  * ## Margins
  *
  * The margins specified in this object are the “print margins”, i.e. the parts
  * of the page that the printer cannot print on. These are different from the
  * layout margins that a word processor uses; they are typically used to
  * determine the minimal size for the layout margins.
  *
  * To obtain a `GtkPageSetup` use [ctor@Gtk.PageSetup.new] to get the defaults,
  * or use [func@Gtk.print_run_page_setup_dialog] to show the page setup dialog
  * and receive the resulting page setup.
  *
  * ## A page setup dialog
  *
  * ```c
  * static GtkPrintSettings *settings = NULL;
  * static GtkPageSetup *page_setup = NULL;
  *
  * static void
  * do_page_setup (void)
  * {
  *   GtkPageSetup *new_page_setup;
  *
  *   if (settings == NULL)
  *     settings = gtk_print_settings_new ();
  *
  *   new_page_setup = gtk_print_run_page_setup_dialog (GTK_WINDOW (main_window),
  *                                                     page_setup, settings);
  *
  *   if (page_setup)
  *     g_object_unref (page_setup);
  *
  *   page_setup = new_page_setup;
  * }
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PageSetup private[gnome] (raw: Ptr[GtkPageSetup])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Copies a `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy()(using Runtime): sn.gnome.gtk4.PageSetup /* None */ =
    sn.gnome.gtk4.PageSetup.applyUnsafe(
      gtk_page_setup_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]]
      ).asInstanceOf
    )
  end copy

  /** Gets the bottom margin in units of @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBottomMargin(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_bottom_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getBottomMargin

  /** Gets the left margin in units of @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLeftMargin(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_left_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getLeftMargin

  /** Gets the page orientation of the `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOrientation(): PageOrientation /* None */ =
    PageOrientation.fromRaw(
      gtk_page_setup_get_orientation(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]]
      )
    )
  end getOrientation

  /** Returns the page height in units of @unit.
    *
    * Note that this function takes orientation and margins into consideration.
    * See [method@Gtk.PageSetup.get_paper_height].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageHeight(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_page_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getPageHeight

  /** Returns the page width in units of @unit.
    *
    * Note that this function takes orientation and margins into consideration.
    * See [method@Gtk.PageSetup.get_paper_width].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageWidth(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_page_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getPageWidth

  /** Returns the paper height in units of @unit.
    *
    * Note that this function takes orientation, but not margins into
    * consideration. See [method@Gtk.PageSetup.get_page_height].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPaperHeight(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_paper_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getPaperHeight

  /** Gets the paper size of the `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_paper_size/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))"
  )
  private def getPaperSize__ = ???

  /** Returns the paper width in units of @unit.
    *
    * Note that this function takes orientation, but not margins into
    * consideration. See [method@Gtk.PageSetup.get_page_width].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPaperWidth(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_paper_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getPaperWidth

  /** Gets the right margin in units of @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRightMargin(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_right_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getRightMargin

  /** Gets the top margin in units of @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTopMargin(unit: GTKUnit /* Some(GtkUnit) */ ): Double /* None */ =
    gtk_page_setup_get_top_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      unit.raw
    )
  end getTopMargin

  /** Reads the page setup from the file @file_name.
    *
    * See [method@Gtk.PageSetup.to_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loadFile(
      file_name: String /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_page_setup_load_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
        toCString(file_name),
        __errorPtr
      ).value.!=(0)
    )
  end loadFile

  /** Reads the page setup from the group @group_name in the key file
    * @key_file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method load_key_file/<method parameters>/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))"
  )
  private def loadKeyFile__ = ???

  /** Sets the bottom margin of the `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBottomMargin(
      margin: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ =
    gtk_page_setup_set_bottom_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      margin,
      unit.raw
    )
  end setBottomMargin

  /** Sets the left margin of the `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLeftMargin(
      margin: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ =
    gtk_page_setup_set_left_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      margin,
      unit.raw
    )
  end setLeftMargin

  /** Sets the page orientation of the `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOrientation(
      orientation: PageOrientation /* Some(GtkPageOrientation) */
  ): Unit /* None */ =
    gtk_page_setup_set_orientation(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      orientation.raw
    )
  end setOrientation

  /** Sets the paper size of the `GtkPageSetup` without changing the margins.
    *
    * See [method@Gtk.PageSetup.set_paper_size_and_default_margins].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_paper_size/<method parameters>/size]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))"
  )
  private def setPaperSize__ = ???

  /** Sets the paper size of the `GtkPageSetup` and modifies the margins
    * according to the new paper size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_paper_size_and_default_margins/<method parameters>/size]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))"
  )
  private def setPaperSizeAndDefaultMargins__ = ???

  /** Sets the right margin of the `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRightMargin(
      margin: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ =
    gtk_page_setup_set_right_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      margin,
      unit.raw
    )
  end setRightMargin

  /** Sets the top margin of the `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTopMargin(
      margin: Double /* Some(Double) */,
      unit: GTKUnit /* Some(GtkUnit) */
  ): Unit /* None */ =
    gtk_page_setup_set_top_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
      margin,
      unit.raw
    )
  end setTopMargin

  /** This function saves the information from @setup to @file_name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toFile(
      file_name: String /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_page_setup_to_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPageSetup]],
        toCString(file_name),
        __errorPtr
      ).value.!=(0)
    )
  end toFile

  /** Serialize page setup to an a{sv} variant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_gvariant/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def toGvariant__ = ???

  /** This function adds the page setup from @setup to @key_file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_key_file/<method parameters>/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))"
  )
  private def toKeyFile__ = ???

end PageSetup

object PageSetup:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkPageSetup])(using Runtime) =
    summon[Runtime].getOrCreate[PageSetup](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PageSetup(ptr)
    )

  /** Creates a new `GtkPageSetup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): PageSetup =
    val raw: Ptr[Byte] = gtk_page_setup_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[PageSetup](raw, r => PageSetup.applyUnsafe(r.asInstanceOf))
  end apply

  /** Reads the page setup from the file @file_name.
    *
    * Returns a new `GtkPageSetup` object with the restored page setup, or %NULL
    * if an error occurred. See [method@Gtk.PageSetup.to_file].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFile(
      file_name: String /* Some(CString) */
  )(using Zone, Runtime): GResult[PageSetup] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] =
        gtk_page_setup_new_from_file(toCString(file_name), __errorPtr)
          .asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[PageSetup](
          raw,
          r => PageSetup.applyUnsafe(r.asInstanceOf)
        )

  end fromFile

  /** Desrialize a page setup from an a{sv} variant.
    *
    * The variant must be in the format produced by
    * [method@Gtk.PageSetup.to_gvariant].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_gvariant/variant]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def fromGvariant() = ???

  /** Reads the page setup from the group @group_name in the key file
    * @key_file.
    *
    * Returns a new `GtkPageSetup` object with the restored page setup, or %NULL
    * if an error occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_key_file/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))"
  )
  private def fromKeyFile() = ???

end PageSetup

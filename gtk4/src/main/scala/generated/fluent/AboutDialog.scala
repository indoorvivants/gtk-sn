package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  License,
  Native,
  Root,
  ShortcutManager,
  Window
}
import sn.gnome.gtk4.internal.GtkAboutDialog

/** The `GtkAboutDialog` offers a simple way to display information about a
  * program.
  *
  * The shown information includes the programs' logo, name, copyright, website
  * and license. It is also possible to give credits to the authors,
  * documenters, translators and artists who have worked on the program.
  *
  * An about dialog is typically opened when the user selects the `About` option
  * from the `Help` menu. All parts of the dialog are optional.
  *
  * ![An example GtkAboutDialog](aboutdialog.png)
  *
  * About dialogs often contain links and email addresses. `GtkAboutDialog`
  * displays these as clickable links. By default, it calls
  * [method@Gtk.FileLauncher.launch] when a user clicks one. The behaviour can
  * be overridden with the [signal@Gtk.AboutDialog::activate-link] signal.
  *
  * To specify a person with an email address, use a string like
  * `Edgar Allan Poe <edgar@poe.com>`. To specify a website with a title, use a
  * string like `GTK team https://www.gtk.org`.
  *
  * To make constructing a `GtkAboutDialog` as convenient as possible, you can
  * use the function [func@Gtk.show_about_dialog] which constructs and shows a
  * dialog and keeps it around so that it can be shown again.
  *
  * Note that GTK sets a default title of `_("About %s")` on the dialog window
  * (where `%s` is replaced by the name of the application, but in order to
  * ensure proper translation of the title, applications should set the title
  * property explicitly when constructing a `GtkAboutDialog`, as shown in the
  * following example:
  *
  * ```c
  * GFile *logo_file = g_file_new_for_path ("./logo.png");
  * GdkTexture *example_logo = gdk_texture_new_from_file (logo_file, NULL);
  * g_object_unref (logo_file);
  *
  * gtk_show_about_dialog (NULL,
  *                        "program-name", "ExampleCode",
  *                        "logo", example_logo,
  *                        "title", _("About ExampleCode"),
  *                        NULL);
  * ```
  *
  * ## CSS nodes
  *
  * `GtkAboutDialog` has a single CSS node with the name `window` and style
  * class `.aboutdialog`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AboutDialog(raw: Ptr[GtkAboutDialog])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Creates a new section in the "Credits" page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[add_credit_section/<method parameters>/people]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char**)))"
  )
  private def addCreditSection__ = ???

  /** Returns the names of the artists which are displayed in the credits page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_artists/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getArtists__ = ???

  /** Returns the names of the authors which are displayed in the credits page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_authors/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getAuthors__ = ???

  /** Returns the comments string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getComments()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_comments(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the copyright string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCopyright()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_copyright(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the name of the documenters which are displayed in the credits
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_documenters/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getDocumenters__ = ???

  /** Returns the license information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLicense()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_license(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Retrieves the license type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLicenseType(): License /* None */ = License.fromRaw(
    gtk_about_dialog_get_license_type(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    )
  )

  /** Returns the paintable displayed as logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLogo(): Paintable /* None */ = new Paintable.Abstract(
    gtk_about_dialog_get_logo(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the icon name displayed as logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLogoIconName()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_logo_icon_name(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the program name displayed in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProgramName()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_program_name(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the system information that is shown in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSystemInformation()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_system_information(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the translator credits string which is displayed in the credits
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTranslatorCredits()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_translator_credits(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the version string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVersion()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_version(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the website URL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWebsite()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_website(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns the label used for the website link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWebsiteLabel()(using Zone): String /* None */ = fromCString(
    gtk_about_dialog_get_website_label(
      this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
    ).asInstanceOf
  )

  /** Returns whether the license text in the about dialog is automatically
    * wrapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrapLicense(): Boolean /* None */ = gtk_about_dialog_get_wrap_license(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]]
  ).value.!=(0)

  /** Sets the names of the artists to be displayed in the "Credits" page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_artists/<method parameters>/artists]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char**)))"
  )
  private def setArtists__ = ???

  /** Sets the names of the authors which are displayed in the "Credits" page of
    * the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_authors/<method parameters>/authors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char**)))"
  )
  private def setAuthors__ = ???

  /** Sets the comments string to display in the about dialog.
    *
    * This should be a short string of one or two lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setComments(
      comments: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_comments(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    comments
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the copyright string to display in the about dialog.
    *
    * This should be a short string of one or two lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCopyright(
      copyright: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_copyright(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    copyright
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the names of the documenters which are displayed in the "Credits"
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_documenters/<method parameters>/documenters]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char**)))"
  )
  private def setDocumenters__ = ???

  /** Sets the license information to be displayed in the about dialog.
    *
    * If `license` is `NULL`, the license page is hidden.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLicense(
      license: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_license(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    license
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the license of the application showing the about dialog from a list
    * of known licenses.
    *
    * This function overrides the license set using
    * [method@Gtk.AboutDialog.set_license].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLicenseType(
      license_type: License /* Some(GtkLicense) */
  ): Unit /* None */ = gtk_about_dialog_set_license_type(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    license_type.raw
  )

  /** Sets the logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLogo(
      logo: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Unit /* None */ = gtk_about_dialog_set_logo(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    logo
      .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
      )
  )

  /** Sets the icon name to be displayed as logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLogoIconName(
      icon_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_logo_icon_name(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    icon_name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the name to display in the about dialog.
    *
    * If `name` is not set, the string returned by `g_get_application_name()` is
    * used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setProgramName(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_program_name(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the system information to be displayed in the about dialog.
    *
    * If `system_information` is `NULL`, the system information page is hidden.
    *
    * See [property@Gtk.AboutDialog:system-information].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSystemInformation(
      system_information: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_system_information(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    system_information
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the translator credits string which is displayed in the credits page.
    *
    * The intended use for this string is to display the translator of the
    * language which is currently used in the user interface. Using `gettext()`,
    * a simple way to achieve that is to mark the string for translation:
    *
    * ```c
    * GtkWidget *about = gtk_about_dialog_new ();
    *  gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
    *                                           _("translator-credits"));
    * ```
    *
    * It is a good idea to use the customary `msgid` “translator-credits” for
    * this purpose, since translators will already know the purpose of that
    * `msgid`, and since `GtkAboutDialog` will detect if “translator-credits” is
    * untranslated and omit translator credits.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTranslatorCredits(
      translator_credits: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_translator_credits(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    translator_credits
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the version string to display in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVersion(
      version: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_version(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    version
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the URL to use for the website link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWebsite(
      website: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_website(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    website
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the label to be used for the website link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWebsiteLabel(
      website_label: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_about_dialog_set_website_label(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    __sn_extract_string(website_label)
  )

  /** Sets whether the license text in the about dialog should be automatically
    * wrapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrapLicense(
      wrap_license: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_about_dialog_set_wrap_license(
    this.raw.asInstanceOf[Ptr[GtkAboutDialog]],
    gboolean(gint((if wrap_license == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AboutDialog

object AboutDialog:
  /** Creates a new `GtkAboutDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): AboutDialog = new AboutDialog(
    gtk_about_dialog_new().asInstanceOf
  )
end AboutDialog

package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Display, Paintable}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  License,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{GtkAboutDialog, GtkNative, GtkRoot, GtkWindow}
import sn.gnome.runtime.*

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
class AboutDialog private[gnome] (raw: Ptr[GtkAboutDialog])
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
  def addCreditSection(
      section_name: String /* Some(CString) */,
      people: Array[String] /* Some(Ptr[CString]) */
  )(using Runtime): Unit /* None */ =
    gtk_about_dialog_add_credit_section(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      summon[Runtime].inZone(toCString(section_name)),
      summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(people))
    )
  end addCreditSection

  /** Returns the names of the artists which are displayed in the credits page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_artists/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getArtists__ = ???

  /** Returns the names of the authors which are displayed in the credits page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_authors/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getAuthors__ = ???

  /** Returns the comments string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getComments(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_comments(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getComments

  /** Returns the copyright string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCopyright(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_copyright(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getCopyright

  /** Returns the display that this `GtkRoot` is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_root_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getDisplay

  /** Returns the name of the documenters which are displayed in the credits
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_documenters/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def getDocumenters__ = ???

  /** Retrieves the current focused widget within the window.
    *
    * Note that this is the widget that would have the focus if the toplevel
    * window focused; if the toplevel window is not focused then
    * `gtk_widget_has_focus (widget)` will not be %TRUE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocus()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_window_get_focus(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]]
      ).asInstanceOf
    )
  end getFocus

  /** Returns the license information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLicense(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_license(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getLicense

  /** Retrieves the license type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLicenseType(): License /* None */ =
    License.fromRaw(
      gtk_about_dialog_get_license_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      )
    )
  end getLicenseType

  /** Returns the paintable displayed as logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLogo(): Paintable /* None */ =
    new Paintable.Abstract(
      gtk_about_dialog_get_logo(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getLogo

  /** Returns the icon name displayed as logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLogoIconName(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_logo_icon_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getLogoIconName

  /** Returns the program name displayed in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProgramName(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_program_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getProgramName

  /** Returns the system information that is shown in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSystemInformation(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_system_information(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getSystemInformation

  /** Returns the translator credits string which is displayed in the credits
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTranslatorCredits(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_translator_credits(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getTranslatorCredits

  /** Returns the version string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVersion(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_version(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getVersion

  /** Returns the website URL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWebsite(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_website(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getWebsite

  /** Returns the label used for the website link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWebsiteLabel(): String /* None */ =
    fromCString(
      gtk_about_dialog_get_website_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
      ).asInstanceOf
    )
  end getWebsiteLabel

  /** Returns whether the license text in the about dialog is automatically
    * wrapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrapLicense(): Boolean /* None */ =
    gtk_about_dialog_get_wrap_license(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]]
    ).value.!=(0)
  end getWrapLicense

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** Sets the names of the artists to be displayed in the "Credits" page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setArtists(
      artists: Array[String] /* Some(Ptr[CString]) */
  )(using Runtime): Unit /* None */ =
    gtk_about_dialog_set_artists(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(artists))
    )
  end setArtists

  /** Sets the names of the authors which are displayed in the "Credits" page of
    * the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAuthors(
      authors: Array[String] /* Some(Ptr[CString]) */
  )(using Runtime): Unit /* None */ =
    gtk_about_dialog_set_authors(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(authors))
    )
  end setAuthors

  /** Sets the comments string to display in the about dialog.
    *
    * This should be a short string of one or two lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setComments(comments: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_about_dialog_set_comments(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      comments
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setComments

  /** Sets the copyright string to display in the about dialog.
    *
    * This should be a short string of one or two lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCopyright(copyright: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_about_dialog_set_copyright(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      copyright
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setCopyright

  /** Sets the names of the documenters which are displayed in the "Credits"
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDocumenters(
      documenters: Array[String] /* Some(Ptr[CString]) */
  )(using Runtime): Unit /* None */ =
    gtk_about_dialog_set_documenters(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(documenters))
    )
  end setDocumenters

  /** Sets the focus widget.
    *
    * If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the window. If @focus is %NULL, unsets the focus
    * widget for this window. To set the focus to a particular widget in the
    * toplevel, it is usually more convenient to use
    * [method@Gtk.Widget.grab_focus] instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocus(
      focus: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_window_set_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]],
      focus
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocus

  /** Sets the license information to be displayed in the about dialog.
    *
    * If `license` is `NULL`, the license page is hidden.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLicense(license: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_about_dialog_set_license(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      license
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setLicense

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
  ): Unit /* None */ =
    gtk_about_dialog_set_license_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      license_type.raw
    )
  end setLicenseType

  /** Sets the logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLogo(
      logo: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Unit /* None */ =
    gtk_about_dialog_set_logo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      logo
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
        )
    )
  end setLogo

  /** Sets the icon name to be displayed as logo in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLogoIconName(icon_name: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_about_dialog_set_logo_icon_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      icon_name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setLogoIconName

  /** Sets the name to display in the about dialog.
    *
    * If `name` is not set, the string returned by `g_get_application_name()` is
    * used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setProgramName(name: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_about_dialog_set_program_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setProgramName

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
      system_information: Option[String /* Some(CString) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_about_dialog_set_system_information(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      system_information
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setSystemInformation

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
      translator_credits: Option[String /* Some(CString) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_about_dialog_set_translator_credits(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      translator_credits
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setTranslatorCredits

  /** Sets the version string to display in the about dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVersion(version: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_about_dialog_set_version(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      version
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setVersion

  /** Sets the URL to use for the website link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWebsite(website: Option[String /* Some(CString) */ ])(using
      Runtime
  ): Unit /* None */ =
    gtk_about_dialog_set_website(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      website
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setWebsite

  /** Sets the label to be used for the website link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWebsiteLabel(
      website_label: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_about_dialog_set_website_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      summon[Runtime].inZone(toCString(website_label))
    )
  end setWebsiteLabel

  /** Sets whether the license text in the about dialog should be automatically
    * wrapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrapLicense(
      wrap_license: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_about_dialog_set_wrap_license(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAboutDialog]],
      gboolean(gint((if wrap_license == true then 1 else 0)))
    )
  end setWrapLicense

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

  /** Emitted every time a URL is activated.
    *
    * Applications may connect to it to override the default behaviour, which is
    * to call [method@Gtk.FileLauncher.launch].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateLink(handler: ((uri: String)) => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (uri: String), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkAboutDialog],
          uri: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((uri = fromCString(uri)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate-link"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivateLink
end AboutDialog

object AboutDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAboutDialog])(using Runtime) =
    summon[Runtime].getOrCreate[AboutDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AboutDialog(ptr)
    )

  /** Creates a new `GtkAboutDialog`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): AboutDialog =
    val raw: Ptr[Byte] = gtk_about_dialog_new().asInstanceOf
    summon[Runtime].getOrCreate[AboutDialog](
      raw,
      r => AboutDialog.applyUnsafe(r.asInstanceOf)
    )
  end apply
end AboutDialog

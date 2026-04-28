package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkAboutDialog
import sn.gnome.gtk4.internal.GtkLicense

class AboutDialog(raw: Ptr[GtkAboutDialog])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method add_credit_section contains an array parameter, which is not supported yet

  def getComments()(using Zone): String = fromCString(
    gtk_about_dialog_get_comments(this.raw.asInstanceOf).asInstanceOf
  )

  def getCopyright()(using Zone): String = fromCString(
    gtk_about_dialog_get_copyright(this.raw.asInstanceOf).asInstanceOf
  )

  def getLicense()(using Zone): String = fromCString(
    gtk_about_dialog_get_license(this.raw.asInstanceOf).asInstanceOf
  )

  def getLicenseType(): GtkLicense = gtk_about_dialog_get_license_type(
    this.raw.asInstanceOf
  )

  def getLogo(): Paintable = new Paintable.Abstract(
    gtk_about_dialog_get_logo(this.raw.asInstanceOf).asInstanceOf
  )

  def getLogoIconName()(using Zone): String = fromCString(
    gtk_about_dialog_get_logo_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getProgramName()(using Zone): String = fromCString(
    gtk_about_dialog_get_program_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getSystemInformation()(using Zone): String = fromCString(
    gtk_about_dialog_get_system_information(this.raw.asInstanceOf).asInstanceOf
  )

  def getTranslatorCredits()(using Zone): String = fromCString(
    gtk_about_dialog_get_translator_credits(this.raw.asInstanceOf).asInstanceOf
  )

  def getVersion()(using Zone): String = fromCString(
    gtk_about_dialog_get_version(this.raw.asInstanceOf).asInstanceOf
  )

  def getWebsite()(using Zone): String = fromCString(
    gtk_about_dialog_get_website(this.raw.asInstanceOf).asInstanceOf
  )

  def getWebsiteLabel()(using Zone): String = fromCString(
    gtk_about_dialog_get_website_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getWrapLicense(): Boolean =
    gtk_about_dialog_get_wrap_license(this.raw.asInstanceOf).value.!=(0)

  // Method set_artists contains an array parameter, which is not supported yet

  // Method set_authors contains an array parameter, which is not supported yet

  def setComments(comments: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_comments(
      this.raw.asInstanceOf,
      __sn_extract_string(comments)
    )

  def setCopyright(copyright: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_copyright(
      this.raw.asInstanceOf,
      __sn_extract_string(copyright)
    )

  // Method set_documenters contains an array parameter, which is not supported yet

  def setLicense(license: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_license(
      this.raw.asInstanceOf,
      __sn_extract_string(license)
    )

  def setLicenseType(license_type: GtkLicense): Unit =
    gtk_about_dialog_set_license_type(this.raw.asInstanceOf, license_type)

  def setLogo(logo: Paintable): Unit = gtk_about_dialog_set_logo(
    this.raw.asInstanceOf,
    logo.getUnsafeRawPointer().asInstanceOf
  )

  def setLogoIconName(icon_name: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_logo_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  def setProgramName(name: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_program_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def setSystemInformation(
      system_information: String | CString
  )(using Zone): Unit = gtk_about_dialog_set_system_information(
    this.raw.asInstanceOf,
    __sn_extract_string(system_information)
  )

  def setTranslatorCredits(
      translator_credits: String | CString
  )(using Zone): Unit = gtk_about_dialog_set_translator_credits(
    this.raw.asInstanceOf,
    __sn_extract_string(translator_credits)
  )

  def setVersion(version: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_version(
      this.raw.asInstanceOf,
      __sn_extract_string(version)
    )

  def setWebsite(website: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_website(
      this.raw.asInstanceOf,
      __sn_extract_string(website)
    )

  def setWebsiteLabel(website_label: String | CString)(using Zone): Unit =
    gtk_about_dialog_set_website_label(
      this.raw.asInstanceOf,
      __sn_extract_string(website_label)
    )

  def setWrapLicense(wrap_license: Boolean): Unit =
    gtk_about_dialog_set_wrap_license(
      this.raw.asInstanceOf,
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
  def apply(): AboutDialog = new AboutDialog(
    gtk_about_dialog_new().asInstanceOf
  )
end AboutDialog

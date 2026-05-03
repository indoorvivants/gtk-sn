package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkLicense

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of license for an application.
  *
  * This enumeration can be expanded at later date.
  */
enum License(val raw: GtkLicense):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No license specified
    */
  case UNKNOWN extends License(GtkLicense.GTK_LICENSE_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A license text is going to be specified by the developer
    */
  case CUSTOM extends License(GtkLicense.GTK_LICENSE_CUSTOM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU General Public License, version 2.0 or later
    */
  case GPL_2_0 extends License(GtkLicense.GTK_LICENSE_GPL_2_0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU General Public License, version 3.0 or later
    */
  case GPL_3_0 extends License(GtkLicense.GTK_LICENSE_GPL_3_0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU Lesser General Public License, version 2.1 or later
    */
  case LGPL_2_1 extends License(GtkLicense.GTK_LICENSE_LGPL_2_1)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU Lesser General Public License, version 3.0 or later
    */
  case LGPL_3_0 extends License(GtkLicense.GTK_LICENSE_LGPL_3_0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The BSD standard license
    */
  case BSD extends License(GtkLicense.GTK_LICENSE_BSD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The MIT/X11 standard license
    */
  case MIT_X11 extends License(GtkLicense.GTK_LICENSE_MIT_X11)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The Artistic License, version 2.0
    */
  case ARTISTIC extends License(GtkLicense.GTK_LICENSE_ARTISTIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU General Public License, version 2.0 only
    */
  case GPL_2_0_ONLY extends License(GtkLicense.GTK_LICENSE_GPL_2_0_ONLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU General Public License, version 3.0 only
    */
  case GPL_3_0_ONLY extends License(GtkLicense.GTK_LICENSE_GPL_3_0_ONLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU Lesser General Public License, version 2.1 only
    */
  case LGPL_2_1_ONLY extends License(GtkLicense.GTK_LICENSE_LGPL_2_1_ONLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU Lesser General Public License, version 3.0 only
    */
  case LGPL_3_0_ONLY extends License(GtkLicense.GTK_LICENSE_LGPL_3_0_ONLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU Affero General Public License, version 3.0 or later
    */
  case AGPL_3_0 extends License(GtkLicense.GTK_LICENSE_AGPL_3_0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The GNU Affero General Public License, version 3.0 only
    */
  case AGPL_3_0_ONLY extends License(GtkLicense.GTK_LICENSE_AGPL_3_0_ONLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The 3-clause BSD licence
    */
  case BSD_3 extends License(GtkLicense.GTK_LICENSE_BSD_3)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The Apache License, version 2.0
    */
  case APACHE_2_0 extends License(GtkLicense.GTK_LICENSE_APACHE_2_0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The Mozilla Public License, version 2.0
    */
  case MPL_2_0 extends License(GtkLicense.GTK_LICENSE_MPL_2_0)
end License

object License:
  def fromRaw(raw: GtkLicense): License =
    raw match
      case GtkLicense.GTK_LICENSE_UNKNOWN       => License.UNKNOWN
      case GtkLicense.GTK_LICENSE_CUSTOM        => License.CUSTOM
      case GtkLicense.GTK_LICENSE_GPL_2_0       => License.GPL_2_0
      case GtkLicense.GTK_LICENSE_GPL_3_0       => License.GPL_3_0
      case GtkLicense.GTK_LICENSE_LGPL_2_1      => License.LGPL_2_1
      case GtkLicense.GTK_LICENSE_LGPL_3_0      => License.LGPL_3_0
      case GtkLicense.GTK_LICENSE_BSD           => License.BSD
      case GtkLicense.GTK_LICENSE_MIT_X11       => License.MIT_X11
      case GtkLicense.GTK_LICENSE_ARTISTIC      => License.ARTISTIC
      case GtkLicense.GTK_LICENSE_GPL_2_0_ONLY  => License.GPL_2_0_ONLY
      case GtkLicense.GTK_LICENSE_GPL_3_0_ONLY  => License.GPL_3_0_ONLY
      case GtkLicense.GTK_LICENSE_LGPL_2_1_ONLY => License.LGPL_2_1_ONLY
      case GtkLicense.GTK_LICENSE_LGPL_3_0_ONLY => License.LGPL_3_0_ONLY
      case GtkLicense.GTK_LICENSE_AGPL_3_0      => License.AGPL_3_0
      case GtkLicense.GTK_LICENSE_AGPL_3_0_ONLY => License.AGPL_3_0_ONLY
      case GtkLicense.GTK_LICENSE_BSD_3         => License.BSD_3
      case GtkLicense.GTK_LICENSE_APACHE_2_0    => License.APACHE_2_0
      case GtkLicense.GTK_LICENSE_MPL_2_0       => License.MPL_2_0
  end fromRaw
end License

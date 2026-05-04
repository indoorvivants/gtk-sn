package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkLicense

/** The type of license for an application.
  *
  * This enumeration can be expanded at later date.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum License(val raw: GtkLicense):
  /** No license specified
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends License(GtkLicense.GTK_LICENSE_UNKNOWN)

  /** A license text is going to be specified by the developer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CUSTOM extends License(GtkLicense.GTK_LICENSE_CUSTOM)

  /** The GNU General Public License, version 2.0 or later
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GPL_2_0 extends License(GtkLicense.GTK_LICENSE_GPL_2_0)

  /** The GNU General Public License, version 3.0 or later
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GPL_3_0 extends License(GtkLicense.GTK_LICENSE_GPL_3_0)

  /** The GNU Lesser General Public License, version 2.1 or later
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LGPL_2_1 extends License(GtkLicense.GTK_LICENSE_LGPL_2_1)

  /** The GNU Lesser General Public License, version 3.0 or later
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LGPL_3_0 extends License(GtkLicense.GTK_LICENSE_LGPL_3_0)

  /** The BSD standard license
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BSD extends License(GtkLicense.GTK_LICENSE_BSD)

  /** The MIT/X11 standard license
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MIT_X11 extends License(GtkLicense.GTK_LICENSE_MIT_X11)

  /** The Artistic License, version 2.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ARTISTIC extends License(GtkLicense.GTK_LICENSE_ARTISTIC)

  /** The GNU General Public License, version 2.0 only
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GPL_2_0_ONLY extends License(GtkLicense.GTK_LICENSE_GPL_2_0_ONLY)

  /** The GNU General Public License, version 3.0 only
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GPL_3_0_ONLY extends License(GtkLicense.GTK_LICENSE_GPL_3_0_ONLY)

  /** The GNU Lesser General Public License, version 2.1 only
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LGPL_2_1_ONLY extends License(GtkLicense.GTK_LICENSE_LGPL_2_1_ONLY)

  /** The GNU Lesser General Public License, version 3.0 only
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LGPL_3_0_ONLY extends License(GtkLicense.GTK_LICENSE_LGPL_3_0_ONLY)

  /** The GNU Affero General Public License, version 3.0 or later
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AGPL_3_0 extends License(GtkLicense.GTK_LICENSE_AGPL_3_0)

  /** The GNU Affero General Public License, version 3.0 only
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AGPL_3_0_ONLY extends License(GtkLicense.GTK_LICENSE_AGPL_3_0_ONLY)

  /** The 3-clause BSD licence
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BSD_3 extends License(GtkLicense.GTK_LICENSE_BSD_3)

  /** The Apache License, version 2.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APACHE_2_0 extends License(GtkLicense.GTK_LICENSE_APACHE_2_0)

  /** The Mozilla Public License, version 2.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

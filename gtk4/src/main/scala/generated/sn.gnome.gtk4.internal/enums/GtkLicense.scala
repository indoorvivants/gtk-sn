package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkLicense: _LICENSE_UNKNOWN: No license specified _LICENSE_CUSTOM: A license text is going to be specified by the developer _LICENSE_GPL_2_0: The GNU General Public License, version 2.0 or later _LICENSE_GPL_3_0: The GNU General Public License, version 3.0 or later _LICENSE_LGPL_2_1: The GNU Lesser General Public License, version 2.1 or later _LICENSE_LGPL_3_0: The GNU Lesser General Public License, version 3.0 or later _LICENSE_BSD: The BSD standard license _LICENSE_MIT_X11: The MIT/X11 standard license _LICENSE_ARTISTIC: The Artistic License, version 2.0 _LICENSE_GPL_2_0_ONLY: The GNU General Public License, version 2.0 only _LICENSE_GPL_3_0_ONLY: The GNU General Public License, version 3.0 only _LICENSE_LGPL_2_1_ONLY: The GNU Lesser General Public License, version 2.1 only _LICENSE_LGPL_3_0_ONLY: The GNU Lesser General Public License, version 3.0 only _LICENSE_AGPL_3_0: The GNU Affero General Public License, version 3.0 or later _LICENSE_AGPL_3_0_ONLY: The GNU Affero General Public License, version 3.0 only _LICENSE_BSD_3: The 3-clause BSD licence _LICENSE_APACHE_2_0: The Apache License, version 2.0 _LICENSE_MPL_2_0: The Mozilla Public License, version 2.0 _LICENSE_0BSD: Zero-Clause BSD license
*/
opaque type GtkLicense = CUnsignedInt
object GtkLicense extends _BindgenEnumCUnsignedInt[GtkLicense]:
  given _tag: Tag[GtkLicense] = Tag.UInt
  inline def define(inline a: Long): GtkLicense = a.toUInt
  val GTK_LICENSE_UNKNOWN = define(0)
  val GTK_LICENSE_CUSTOM = define(1)
  val GTK_LICENSE_GPL_2_0 = define(2)
  val GTK_LICENSE_GPL_3_0 = define(3)
  val GTK_LICENSE_LGPL_2_1 = define(4)
  val GTK_LICENSE_LGPL_3_0 = define(5)
  val GTK_LICENSE_BSD = define(6)
  val GTK_LICENSE_MIT_X11 = define(7)
  val GTK_LICENSE_ARTISTIC = define(8)
  val GTK_LICENSE_GPL_2_0_ONLY = define(9)
  val GTK_LICENSE_GPL_3_0_ONLY = define(10)
  val GTK_LICENSE_LGPL_2_1_ONLY = define(11)
  val GTK_LICENSE_LGPL_3_0_ONLY = define(12)
  val GTK_LICENSE_AGPL_3_0 = define(13)
  val GTK_LICENSE_AGPL_3_0_ONLY = define(14)
  val GTK_LICENSE_BSD_3 = define(15)
  val GTK_LICENSE_APACHE_2_0 = define(16)
  val GTK_LICENSE_MPL_2_0 = define(17)
  val GTK_LICENSE_0BSD = define(18)
  def getName(value: GtkLicense): Option[String] =
    value match
      case `GTK_LICENSE_UNKNOWN` => Some("GTK_LICENSE_UNKNOWN")
      case `GTK_LICENSE_CUSTOM` => Some("GTK_LICENSE_CUSTOM")
      case `GTK_LICENSE_GPL_2_0` => Some("GTK_LICENSE_GPL_2_0")
      case `GTK_LICENSE_GPL_3_0` => Some("GTK_LICENSE_GPL_3_0")
      case `GTK_LICENSE_LGPL_2_1` => Some("GTK_LICENSE_LGPL_2_1")
      case `GTK_LICENSE_LGPL_3_0` => Some("GTK_LICENSE_LGPL_3_0")
      case `GTK_LICENSE_BSD` => Some("GTK_LICENSE_BSD")
      case `GTK_LICENSE_MIT_X11` => Some("GTK_LICENSE_MIT_X11")
      case `GTK_LICENSE_ARTISTIC` => Some("GTK_LICENSE_ARTISTIC")
      case `GTK_LICENSE_GPL_2_0_ONLY` => Some("GTK_LICENSE_GPL_2_0_ONLY")
      case `GTK_LICENSE_GPL_3_0_ONLY` => Some("GTK_LICENSE_GPL_3_0_ONLY")
      case `GTK_LICENSE_LGPL_2_1_ONLY` => Some("GTK_LICENSE_LGPL_2_1_ONLY")
      case `GTK_LICENSE_LGPL_3_0_ONLY` => Some("GTK_LICENSE_LGPL_3_0_ONLY")
      case `GTK_LICENSE_AGPL_3_0` => Some("GTK_LICENSE_AGPL_3_0")
      case `GTK_LICENSE_AGPL_3_0_ONLY` => Some("GTK_LICENSE_AGPL_3_0_ONLY")
      case `GTK_LICENSE_BSD_3` => Some("GTK_LICENSE_BSD_3")
      case `GTK_LICENSE_APACHE_2_0` => Some("GTK_LICENSE_APACHE_2_0")
      case `GTK_LICENSE_MPL_2_0` => Some("GTK_LICENSE_MPL_2_0")
      case `GTK_LICENSE_0BSD` => Some("GTK_LICENSE_0BSD")
      case _ => _root_.scala.None
  extension (a: GtkLicense)
    inline def &(b: GtkLicense): GtkLicense = a & b
    inline def |(b: GtkLicense): GtkLicense = a | b
    inline def is(b: GtkLicense): Boolean = (a & b) == b
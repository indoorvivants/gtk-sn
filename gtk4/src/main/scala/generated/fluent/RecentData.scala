package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.internal.GtkRecentData
import sn.gnome.runtime.*

/** Meta-data to be passed to gtk_recent_manager_add_full() when registering a
  * recently used resource.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RecentData private[gnome] (raw: Ptr[GtkRecentData]):

  def getUnsafeRawPointer(): Ptr[GtkRecentData] = this.raw

  /** a UTF-8 encoded string, containing the name of the recently used resource
    * to be displayed, or %NULL;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def displayName: scala.Predef.String /* None */ =
    (!raw).display_name.asInstanceOf[CString]

  /** a UTF-8 encoded string, containing the name of the recently used resource
    * to be displayed, or %NULL;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def displayName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).display_name_=(toCString(value).asInstanceOf[CString])

  /** a UTF-8 encoded string, containing a short description of the resource, or
    * %NULL;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def description: scala.Predef.String /* None */ =
    (!raw).description.asInstanceOf[CString]

  /** a UTF-8 encoded string, containing a short description of the resource, or
    * %NULL;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def description_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).description_=(toCString(value).asInstanceOf[CString])

  /** the MIME type of the resource;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mimeType: scala.Predef.String /* None */ =
    (!raw).mime_type.asInstanceOf[CString]

  /** the MIME type of the resource;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mimeType_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).mime_type_=(toCString(value).asInstanceOf[CString])

  /** the name of the application that is registering this recently used
    * resource;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appName: scala.Predef.String /* None */ =
    (!raw).app_name.asInstanceOf[CString]

  /** the name of the application that is registering this recently used
    * resource;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).app_name_=(toCString(value).asInstanceOf[CString])

  /** command line used to launch this resource; may contain the “\%f” and “\%u”
    * escape characters which will be expanded to the resource file path and URI
    * respectively when the command line is retrieved;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appExec: scala.Predef.String /* None */ =
    (!raw).app_exec.asInstanceOf[CString]

  /** command line used to launch this resource; may contain the “\%f” and “\%u”
    * escape characters which will be expanded to the resource file path and URI
    * respectively when the command line is retrieved;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appExec_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).app_exec_=(toCString(value).asInstanceOf[CString])

  /** a vector of strings containing groups names;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def groups: scala.Array[scala.Predef.String] /* None */ =
    (!raw).groups.asInstanceOf[Ptr[CString]]

  /** a vector of strings containing groups names;
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def groups_=(
      value: scala.Array[scala.Predef.String] /* None */
  )(using Zone): Unit = (!raw).groups_=(
    MemoryWrite.nullTerminatedStringArray(value).asInstanceOf[Ptr[CString]]
  )

  /** whether this resource should be displayed only by the applications that
    * have registered it or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isPrivate: Boolean /* None */ =
    (!raw).is_private.asInstanceOf[_root_.sn.gnome.glib.internal.gboolean]

  /** whether this resource should be displayed only by the applications that
    * have registered it or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isPrivate_=(value: Boolean /* None */ ): Unit = (!raw).is_private_=(
    gboolean(gint((if value == true then 1 else 0)))
      .asInstanceOf[_root_.sn.gnome.glib.internal.gboolean]
  )
end RecentData

object RecentData:
  def fromRaw(ptr: Ptr[GtkRecentData]): RecentData = new RecentData(ptr)
end RecentData

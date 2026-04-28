package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GSList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GClosure
import sn.gnome.gobject.internal.GType
import sn.gnome.gtk4.fluent.BuilderScope
import sn.gnome.gtk4.internal.GtkBuilder
import sn.gnome.gtk4.internal.GtkBuilderClosureFlags

class Builder(raw: Ptr[GtkBuilder]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addFromFile(filename: String | CString)(using Zone): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_builder_add_from_file(
        this.raw.asInstanceOf,
        __sn_extract_string(filename),
        __errorPtr
      ).value.!=(0)
    )

  def addFromResource(
      resource_path: String | CString
  )(using Zone): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gtk_builder_add_from_resource(
      this.raw.asInstanceOf,
      __sn_extract_string(resource_path),
      __errorPtr
    ).value.!=(0)
  )

  def addFromString(buffer: String | CString, length: CLongInt)(using
      Zone
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gtk_builder_add_from_string(
      this.raw.asInstanceOf,
      __sn_extract_string(buffer),
      gssize(length),
      __errorPtr
    ).value.!=(0)
  )

  // Method add_objects_from_file contains an array parameter, which is not supported yet

  // Method add_objects_from_resource contains an array parameter, which is not supported yet

  // Method add_objects_from_string contains an array parameter, which is not supported yet

  def createClosure(
      function_name: String | CString,
      flags: GtkBuilderClosureFlags,
      `object`: Object
  )(using Zone): GResult[Ptr[GClosure]] = GResult.wrap(__errorPtr =>
    gtk_builder_create_closure(
      this.raw.asInstanceOf,
      __sn_extract_string(function_name),
      flags,
      `object`.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def exposeObject(name: String | CString, `object`: Object)(using Zone): Unit =
    gtk_builder_expose_object(
      this.raw.asInstanceOf,
      __sn_extract_string(name),
      `object`.getUnsafeRawPointer().asInstanceOf
    )

  def extendWithTemplate(
      `object`: Object,
      template_type: GType,
      buffer: String | CString,
      length: CLongInt
  )(using Zone): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gtk_builder_extend_with_template(
      this.raw.asInstanceOf,
      `object`.getUnsafeRawPointer().asInstanceOf,
      template_type,
      __sn_extract_string(buffer),
      gssize(length),
      __errorPtr
    ).value.!=(0)
  )

  def getCurrentObject(): Object = new Object(
    gtk_builder_get_current_object(this.raw.asInstanceOf).asInstanceOf
  )

  def getObject(name: String | CString)(using Zone): Object = new Object(
    gtk_builder_get_object(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  def getObjects(): Ptr[GSList] = gtk_builder_get_objects(this.raw.asInstanceOf)

  def getScope(): BuilderScope = new BuilderScope.Abstract(
    gtk_builder_get_scope(this.raw.asInstanceOf).asInstanceOf
  )

  def getTranslationDomain()(using Zone): String = fromCString(
    gtk_builder_get_translation_domain(this.raw.asInstanceOf).asInstanceOf
  )

  def getTypeFromName(type_name: String | CString)(using Zone): GType =
    gtk_builder_get_type_from_name(
      this.raw.asInstanceOf,
      __sn_extract_string(type_name)
    )

  def setCurrentObject(current_object: Object): Unit =
    gtk_builder_set_current_object(
      this.raw.asInstanceOf,
      current_object.getUnsafeRawPointer().asInstanceOf
    )

  def setScope(scope: BuilderScope): Unit = gtk_builder_set_scope(
    this.raw.asInstanceOf,
    scope.getUnsafeRawPointer().asInstanceOf
  )

  def setTranslationDomain(domain: String | CString)(using Zone): Unit =
    gtk_builder_set_translation_domain(
      this.raw.asInstanceOf,
      __sn_extract_string(domain)
    )

  // Method value_from_string contains an OUT parameter, which is not supported yet

  // Method value_from_string_type contains an OUT parameter, which is not supported yet

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Builder

object Builder:
  def apply(): Builder = new Builder(gtk_builder_new().asInstanceOf)
  def fromFile(filename: String | CString)(using Zone): Builder = new Builder(
    gtk_builder_new_from_file(__sn_extract_string(filename)).asInstanceOf
  )
  def fromResource(resource_path: String | CString)(using Zone): Builder =
    new Builder(
      gtk_builder_new_from_resource(
        __sn_extract_string(resource_path)
      ).asInstanceOf
    )
  def fromString(string: String | CString, length: CLongInt)(using
      Zone
  ): Builder = new Builder(
    gtk_builder_new_from_string(
      __sn_extract_string(string),
      gssize(length)
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Builder

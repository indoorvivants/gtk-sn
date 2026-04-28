package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GCallback
import sn.gnome.gtk4.fluent.BuilderScope
import sn.gnome.gtk4.internal.GtkBuilderCScope

class BuilderCScope(raw: Ptr[GtkBuilderCScope])
    extends Object(raw.asInstanceOf),
      BuilderScope:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addCallbackSymbol(
      callback_name: String | CString,
      callback_symbol: GCallback
  )(using Zone): Unit = gtk_builder_cscope_add_callback_symbol(
    this.raw.asInstanceOf,
    __sn_extract_string(callback_name),
    callback_symbol
  )

  inline def addCallbackSymbols(
      first_callback_name: String | CString,
      first_callback_symbol: GCallback,
      args: Any*
  )(using Zone): Unit = gtk_builder_cscope_add_callback_symbols(
    this.raw.asInstanceOf,
    __sn_extract_string(first_callback_name),
    first_callback_symbol,
    args*
  )

  def lookupCallbackSymbol(
      callback_name: String | CString
  )(using Zone): GCallback = gtk_builder_cscope_lookup_callback_symbol(
    this.raw.asInstanceOf,
    __sn_extract_string(callback_name)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end BuilderCScope

object BuilderCScope:
  def apply(): BuilderCScope = new BuilderCScope(
    gtk_builder_cscope_new().asInstanceOf
  )
end BuilderCScope

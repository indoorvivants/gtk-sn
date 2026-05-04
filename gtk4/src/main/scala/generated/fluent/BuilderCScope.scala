package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.BuilderScope
import sn.gnome.gtk4.internal.GtkBuilderCScope

/** A `GtkBuilderScope` implementation for the C language.
  *
  * `GtkBuilderCScope` instances use symbols explicitly added to @builder with
  * prior calls to [method@Gtk.BuilderCScope.add_callback_symbol]. If developers
  * want to do that, they are encouraged to create their own scopes for that
  * purpose.
  *
  * In the case that symbols are not explicitly added; GTK will uses `GModule`’s
  * introspective features (by opening the module %NULL) to look at the
  * application’s symbol table. From here it tries to match the signal function
  * names given in the interface description with symbols in the application.
  *
  * Note that unless [method@Gtk.BuilderCScope.add_callback_symbol] is called
  * for all signal callbacks which are referenced by the loaded XML, this
  * functionality will require that `GModule` be supported on the platform.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BuilderCScope(raw: Ptr[GtkBuilderCScope])
    extends Object(raw.asInstanceOf),
      BuilderScope:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds the @callback_symbol to the scope of @builder under the given @callback_name.
    *
    * Using this function overrides the behavior of
    * [method@Gtk.Builder.create_closure] for any callback symbols that are
    * added. Using this method allows for better encapsulation as it does not
    * require that callback symbols be declared in the global namespace.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[add_callback_symbol/<method parameters>/callback_symbol]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))"
  )
  private def addCallbackSymbol__ = ???

  /** A convenience function to add many callbacks.
    *
    * This is equivalent to calling
    * [method@Gtk.BuilderCScope.add_callback_symbol] for each symbol.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[add_callback_symbols/<method parameters>/first_callback_symbol]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))"
  )
  private def addCallbackSymbols__ = ???

  /** Fetches a symbol previously added with
    * gtk_builder_cscope_add_callback_symbol().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[lookup_callback_symbol/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))"
  )
  private def lookupCallbackSymbol__ = ???

end BuilderCScope

object BuilderCScope:
  /** Creates a new `GtkBuilderCScope` object to use with future `GtkBuilder`
    * instances.
    *
    * Calling this function is only necessary if you want to add custom
    * callbacks via [method@Gtk.BuilderCScope.add_callback_symbol].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): BuilderCScope = new BuilderCScope(
    gtk_builder_cscope_new().asInstanceOf
  )
end BuilderCScope

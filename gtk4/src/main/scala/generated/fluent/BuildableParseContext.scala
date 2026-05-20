package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.BuildableParser
import sn.gnome.gtk4.internal.GtkBuildableParseContext

/** An opaque context struct for `GtkBuildableParser`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BuildableParseContext private[gnome] (raw: Ptr[GtkBuildableParseContext]):

  def getUnsafeRawPointer(): Ptr[GtkBuildableParseContext] = this.raw

  /** Retrieves the name of the currently open element.
    *
    * If called from the start_element or end_element handlers this will give
    * the element_name as passed to those functions. For the parent elements,
    * see gtk_buildable_parse_context_get_element_stack().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getElement(): scala.Predef.String /* None */ =
    fromCString(
      gtk_buildable_parse_context_get_element(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBuildableParseContext]]
      ).asInstanceOf
    )
  end getElement

  /** Retrieves the element stack from the internal state of the parser.
    *
    * The returned `GPtrArray` is an array of strings where the last item is the
    * currently open tag (as would be returned by
    * gtk_buildable_parse_context_get_element()) and the previous item is its
    * immediate parent.
    *
    * This function is intended to be used in the start_element and end_element
    * handlers where gtk_buildable_parse_context_get_element() would merely
    * return the name of the element that is being processed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_element_stack/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@name -> DataRecord(GLib.PtrArray), @type -> DataRecord(GPtrArray*)))"
  )
  private def getElementStack__ = ???

  /** Retrieves the current line number and the number of the character on that
    * line. Intended for use in error messages; there are no strict semantics
    * for what constitutes the "current" line number other than "the best number
    * we could come up with for error messages."
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_position]: Method get_position contains an OUT parameter, which is not supported yet"
  )
  private def getPosition__ = ???

  /** Completes the process of a temporary sub-parser redirection.
    *
    * This function exists to collect the user_data allocated by a matching call
    * to gtk_buildable_parse_context_push(). It must be called in the
    * end_element handler corresponding to the start_element handler during
    * which gtk_buildable_parse_context_push() was called. You must not call
    * this function from the error callback -- the
    * @user_data
    *   is provided directly to the callback in that case.
    *
    * This function is not intended to be directly called by users interested in
    * invoking subparsers. Instead, it is intended to be used by the subparsers
    * themselves to implement a higher-level interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pop(): Ptr[Byte] /* None */ =
    gtk_buildable_parse_context_pop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBuildableParseContext]]
    ).value
  end pop

  /** Temporarily redirects markup data to a sub-parser.
    *
    * This function may only be called from the start_element handler of a
    * `GtkBuildableParser`. It must be matched with a corresponding call to
    * gtk_buildable_parse_context_pop() in the matching end_element handler
    * (except in the case that the parser aborts due to an error).
    *
    * All tags, text and other data between the matching tags is redirected to
    * the subparser given by @parser. @user_data is used as the user_data for
    * that parser. @user_data is also passed to the error callback in the event
    * that an error occurs. This includes errors that occur in subparsers of the
    * subparser.
    *
    * The end tag matching the start tag for which this call was made is handled
    * by the previous parser (which is given its own user_data) which is why
    * gtk_buildable_parse_context_pop() is provided to allow "one last access"
    * to the @user_data provided to this function. In the case of error, the @user_data
    * provided here is passed directly to the error callback of the subparser
    * and gtk_buildable_parse_context_pop() should not be called. In either
    * case, if @user_data was allocated then it ought to be freed from both of
    * these locations.
    *
    * This function is not intended to be directly called by users interested in
    * invoking subparsers. Instead, it is intended to be used by the subparsers
    * themselves to implement a higher-level interface.
    *
    * For an example of how to use this, see g_markup_parse_context_push() which
    * has the same kind of API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def push(
      parser: sn.gnome.gtk4.BuildableParser /* Some(Ptr[GtkBuildableParser]) */,
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ =
    gtk_buildable_parse_context_push(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBuildableParseContext]],
      parser.getUnsafeRawPointer().asInstanceOf,
      user_data
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end push

end BuildableParseContext

object BuildableParseContext:
  def fromRaw(ptr: Ptr[GtkBuildableParseContext]): BuildableParseContext =
    new BuildableParseContext(ptr)
end BuildableParseContext

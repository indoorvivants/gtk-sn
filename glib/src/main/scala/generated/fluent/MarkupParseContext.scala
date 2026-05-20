package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{GResult, MarkupParseContext, MarkupParser, SList}
import sn.gnome.glib.internal.{
  GMarkupParseContext,
  gboolean,
  gchar,
  gint,
  gpointer,
  gssize
}

/** A parse context is used to parse a stream of bytes that you expect to
  * contain marked-up text.
  *
  * See g_markup_parse_context_new(), #GMarkupParser, and so on for more
  * details.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MarkupParseContext private[gnome] (raw: Ptr[GMarkupParseContext]):

  def getUnsafeRawPointer(): Ptr[GMarkupParseContext] = this.raw

  /** Signals to the #GMarkupParseContext that all data has been fed into the
    * parse context with g_markup_parse_context_parse().
    *
    * This function reports an error if the document isn't complete, for example
    * if elements are still open.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endParse(): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_markup_parse_context_end_parse(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]],
        __errorPtr
      ).value.!=(0)
    )
  end endParse

  /** Frees a #GMarkupParseContext.
    *
    * This function can't be called from inside one of the #GMarkupParser
    * functions or while a subparser is pushed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_markup_parse_context_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]]
    )
  end free

  /** Retrieves the name of the currently open element.
    *
    * If called from the start_element or end_element handlers this will give
    * the element_name as passed to those functions. For the parent elements,
    * see g_markup_parse_context_get_element_stack().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getElement(): scala.Predef.String /* None */ =
    fromCString(
      g_markup_parse_context_get_element(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]]
      ).asInstanceOf
    )
  end getElement

  /** Retrieves the element stack from the internal state of the parser.
    *
    * The returned #GSList is a list of strings where the first item is the
    * currently open tag (as would be returned by
    * g_markup_parse_context_get_element()) and the next item is its immediate
    * parent.
    *
    * This function is intended to be used in the start_element and end_element
    * handlers where g_markup_parse_context_get_element() would merely return
    * the name of the element that is being processed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getElementStack(): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      g_markup_parse_context_get_element_stack(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]]
      )
    )
  end getElementStack

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

  /** Returns the user_data associated with @context.
    *
    * This will either be the user_data that was provided to
    * g_markup_parse_context_new() or to the most recent call of
    * g_markup_parse_context_push().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserData(): Ptr[Byte] /* None */ =
    g_markup_parse_context_get_user_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]]
    ).value
  end getUserData

  /** Feed some data to the #GMarkupParseContext.
    *
    * The data need not be valid UTF-8; an error will be signaled if it's
    * invalid. The data need not be an entire document; you can feed a document
    * into the parser incrementally, via multiple calls to this function.
    * Typically, as you receive data from a network connection or file, you feed
    * each received chunk of data into this function, aborting the process if an
    * error occurs. Once an error is reported, no further data may be fed to the
    * #GMarkupParseContext; all errors are fatal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parse(
      text: scala.Predef.String /* Some(Ptr[gchar]) */,
      text_len: CLongInt /* Some(gssize) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_markup_parse_context_parse(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]],
        toCString(text).asInstanceOf[Ptr[gchar]],
        gssize(text_len),
        __errorPtr
      ).value.!=(0)
    )
  end parse

  /** Completes the process of a temporary sub-parser redirection.
    *
    * This function exists to collect the user_data allocated by a matching call
    * to g_markup_parse_context_push(). It must be called in the end_element
    * handler corresponding to the start_element handler during which
    * g_markup_parse_context_push() was called. You must not call this function
    * from the error callback -- the
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
    g_markup_parse_context_pop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]]
    ).value
  end pop

  /**  Temporarily redirects markup data to a sub-parser.
    *
    *  This function may only be called from the start_element handler of
    *  a #GMarkupParser. It must be matched with a corresponding call to
    *  g_markup_parse_context_pop() in the matching end_element handler
    *  (except in the case that the parser aborts due to an error).
    *
    *  All tags, text and other data between the matching tags is
    *  redirected to the subparser given by @parser. @user_data is used
    *  as the user_data for that parser. @user_data is also passed to the
    *  error callback in the event that an error occurs. This includes
    *  errors that occur in subparsers of the subparser.
    *
    *  The end tag matching the start tag for which this call was made is
    *  handled by the previous parser (which is given its own user_data)
    *  which is why g_markup_parse_context_pop() is provided to allow "one
    *  last access" to the @user_data provided to this function. In the
    *  case of error, the @user_data provided here is passed directly to
    *  the error callback of the subparser and g_markup_parse_context_pop()
    *  should not be called. In either case, if @user_data was allocated
    *  then it ought to be freed from both of these locations.
    *
    *  This function is not intended to be directly called by users
    *  interested in invoking subparsers. Instead, it is intended to be
    *  used by the subparsers themselves to implement a higher-level
    *  interface.
    *
    *  As an example, see the following implementation of a simple
    *  parser that counts the number of tags encountered.
    *
    *  |[<!-- language="C" -->
    *  typedef struct
    *  {
    *    gint tag_count;
    *  } CounterData;
    *
    *  static void
    *  counter_start_element (GMarkupParseContext  *context,
    *                         const gchar          *element_name,
    *                         const gchar         **attribute_names,
    *                         const gchar         **attribute_values,
    *                         gpointer              user_data,
    *                         GError              **error)
    *  {
    *    CounterData *data = user_data;
    *
    *    data->tag_count++;
    *  }
    *
    *  static void
    *  counter_error (GMarkupParseContext *context,
    *                 GError              *error,
    *                 gpointer             user_data)
    *  {
    *    CounterData *data = user_data;
    *
    *    g_slice_free (CounterData, data);
    *  }
    *
    *  static GMarkupParser counter_subparser =
    *  {
    *    counter_start_element,
    *    NULL,
    *    NULL,
    *    NULL,
    *    counter_error
    *  };
    *  ]|
    *
    *  In order to allow this parser to be easily used as a subparser, the
    *  following interface is provided:
    *
    *  |[<!-- language="C" -->
    *  void
    *  start_counting (GMarkupParseContext *context)
    *  {
    *    CounterData *data = g_slice_new (CounterData);
    *
    *    data->tag_count = 0;
    *    g_markup_parse_context_push (context, &counter_subparser, data);
    *  }
    *
    *  gint
    *  end_counting (GMarkupParseContext *context)
    *  {
    *    CounterData *data = g_markup_parse_context_pop (context);
    *    int result;
    *
    *    result = data->tag_count;
    *    g_slice_free (CounterData, data);
    *
    *    return result;
    *  }
    *  ]|
    *
    *  The subparser would then be used as follows:
    *
    *  |[<!-- language="C" -->
    *  static void start_element (context, element_name, ...)
    *  {
    *    if (strcmp (element_name, "count-these") == 0)
    *      start_counting (context);
    *
    *    // else, handle other tags...
    *  }
    *
    *  static void end_element (context, element_name, ...)
    *  {
    *    if (strcmp (element_name, "count-these") == 0)
    *      g_print ("Counted %d tags\n", end_counting (context));
    *
    *    // else, handle other tags...
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def push(
      parser: sn.gnome.glib.MarkupParser /* Some(Ptr[GMarkupParser]) */,
      user_data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* None */ =
    g_markup_parse_context_push(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]],
      parser.getUnsafeRawPointer().asInstanceOf,
      user_data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end push

  /** Increases the reference count of @context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.MarkupParseContext /* None */ =
    sn.gnome.glib.MarkupParseContext.fromRaw(
      g_markup_parse_context_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]]
      )
    )
  end ref

  /** Decreases the reference count of @context. When its reference count drops
    * to 0, it is freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_markup_parse_context_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMarkupParseContext]]
    )
  end unref

end MarkupParseContext

object MarkupParseContext:
  def fromRaw(ptr: Ptr[GMarkupParseContext]): MarkupParseContext =
    new MarkupParseContext(ptr)
end MarkupParseContext

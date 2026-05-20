package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.UriParamsFlags
import sn.gnome.glib.internal.{GUriParamsIter, gchar, gssize}

/** Many URI schemes include one or more attribute/value pairs as part of the
  * URI value. For example `scheme://server/path?query=string&is=there` has two
  * attributes – `query=string` and `is=there` – in its query part.
  *
  * A #GUriParamsIter structure represents an iterator that can be used to
  * iterate over the attribute/value pairs of a URI query string.
  * #GUriParamsIter structures are typically allocated on the stack and then
  * initialized with g_uri_params_iter_init(). See the documentation for
  * g_uri_params_iter_init() for a usage example.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UriParamsIter private[gnome] (raw: Ptr[GUriParamsIter]):

  def getUnsafeRawPointer(): Ptr[GUriParamsIter] = this.raw

  /**  Initializes an attribute/value pair iterator.
    *
    *  The iterator keeps pointers to the @params and @separators arguments, those
    *  variables must thus outlive the iterator and not be modified during the
    *  iteration.
    *
    *  If %G_URI_PARAMS_WWW_FORM is passed in @flags, `+` characters in the param
    *  string will be replaced with spaces in the output. For example, `foo=bar+baz`
    *  will give attribute `foo` with value `bar baz`. This is commonly used on the
    *  web (the `https` and `http` schemes only), but is deprecated in favour of
    *  the equivalent of encoding spaces as `%20`.
    *
    *  Unlike with g_uri_parse_params(), %G_URI_PARAMS_CASE_INSENSITIVE has no
    *  effect if passed to @flags for g_uri_params_iter_init(). The caller is
    *  responsible for doing their own case-insensitive comparisons.
    *
    *  |[<!-- language="C" -->
    *  GUriParamsIter iter;
    *  GError *error = NULL;
    *  gchar *unowned_attr, *unowned_value;
    *
    *  g_uri_params_iter_init (&iter, "foo=bar&baz=bar&Foo=frob&baz=bar2", -1, "&", G_URI_PARAMS_NONE);
    *  while (g_uri_params_iter_next (&iter, &unowned_attr, &unowned_value, &error))
    *    {
    *      g_autofree gchar *attr = g_steal_pointer (&unowned_attr);
    *      g_autofree gchar *value = g_steal_pointer (&unowned_value);
    *      // do something with attr and value; this code will be called 4 times
    *      // for the params string in this example: once with attr=foo and value=bar,
    *      // then with baz/bar, then Foo/frob, then baz/bar2.
    *    }
    *  if (error)
    *    // handle parsing error
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      params: scala.Predef.String /* Some(Ptr[gchar]) */,
      length: CLongInt /* Some(gssize) */,
      separators: scala.Predef.String /* Some(Ptr[gchar]) */,
      flags: sn.gnome.glib.UriParamsFlags /* Some(GUriParamsFlags) */
  )(using Zone): Unit /* None */ =
    g_uri_params_iter_init(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GUriParamsIter]],
      toCString(params).asInstanceOf[Ptr[gchar]],
      gssize(length),
      toCString(separators).asInstanceOf[Ptr[gchar]],
      flags.raw
    )
  end init

  /** Advances @iter and retrieves the next attribute/value. %FALSE is returned
    * if an error has occurred (in which case @error is set), or if the end of
    * the iteration is reached (in which case @attribute and @value are set to
    * %NULL and the iterator becomes invalid). If %TRUE is returned,
    * g_uri_params_iter_next() may be called again to receive another
    * attribute/value pair.
    *
    * Note that the same @attribute may be returned multiple times, since URIs
    * allow repeated attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method next]: Method next contains an OUT parameter, which is not supported yet"
  )
  private def next__ = ???

end UriParamsIter

object UriParamsIter:
  def fromRaw(ptr: Ptr[GUriParamsIter]): UriParamsIter = new UriParamsIter(ptr)
end UriParamsIter

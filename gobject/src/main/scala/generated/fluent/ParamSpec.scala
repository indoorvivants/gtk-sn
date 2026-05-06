package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.fluent.{ParamFlags, ParamSpec}
import sn.gnome.gobject.internal.{GParamSpec, GType}

/** #GParamSpec is an object structure that encapsulates the metadata required
  * to specify parameters, such as e.g. #GObject properties.
  *
  * ## Parameter names # {#canonical-parameter-names}
  *
  * A property name consists of one or more segments consisting of ASCII letters
  * and digits, separated by either the `-` or `_` character. The first
  * character of a property name must be a letter. These are the same rules as
  * for signal naming (see g_signal_new()).
  *
  * When creating and looking up a #GParamSpec, either separator can be used,
  * but they cannot be mixed. Using `-` is considerably more efficient, and is
  * the ‘canonical form’. Using `_` is discouraged.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpec(raw: Ptr[GParamSpec]):

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Get the short description of a #GParamSpec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBlurb()(using Zone): String /* None */ = fromCString(
    g_param_spec_get_blurb(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** Gets the default value of @pspec as a pointer to a #GValue.
    *
    * The #GValue will remain valid for the life of @pspec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_default_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def getDefaultValue__ = ???

  /** Get the name of a #GParamSpec.
    *
    * The name is always an "interned" string (as per g_intern_string()). This
    * allows for pointer-value comparisons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ = fromCString(
    g_param_spec_get_name(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** Gets the GQuark for the name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_name_quark/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def getNameQuark__ = ???

  /** Get the nickname of a #GParamSpec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNick()(using Zone): String /* None */ = fromCString(
    g_param_spec_get_nick(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** Gets back user data pointers stored via g_param_spec_set_qdata().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def getQdata__ = ???

  /** If the paramspec redirects operations to another paramspec, returns that
    * paramspec. Redirect is used typically for providing a new implementation
    * of a property in a derived type while preserving all the properties from
    * the parent type. Redirection is established by creating a property of type
    * #GParamSpecOverride. See g_object_class_override_property() for an example
    * of the use of this capability.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRedirectTarget(): ParamSpec /* None */ = new ParamSpec(
    g_param_spec_get_redirect_target(
      this.raw.asInstanceOf[Ptr[GParamSpec]]
    ).asInstanceOf
  )

  /** Increments the reference count of @pspec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): ParamSpec /* None */ = new ParamSpec(
    g_param_spec_ref(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** Convenience function to ref and sink a #GParamSpec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refSink(): ParamSpec /* None */ = new ParamSpec(
    g_param_spec_ref_sink(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** Sets an opaque, named pointer on a #GParamSpec. The name is specified
    * through a #GQuark (retrieved e.g. via g_quark_from_static_string()), and
    * the pointer can be gotten back from the @pspec with
    * g_param_spec_get_qdata(). Setting a previously set user data pointer,
    * overrides (frees) the old pointer set, using %NULL as pointer essentially
    * removes the data stored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def setQdata__ = ???

  /** This function works like g_param_spec_set_qdata(), but in addition, a
    * `void (*destroy) (gpointer)` function may be specified which is called
    * with @data as argument when the @pspec is finalized, or the data is being
    * overwritten by a call to g_param_spec_set_qdata() with the same @quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_qdata_full/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def setQdataFull__ = ???

  /** The initial reference count of a newly created #GParamSpec is 1, even
    * though no one has explicitly called g_param_spec_ref() on it yet. So the
    * initial reference count is flagged as "floating", until someone calls
    * `g_param_spec_ref (pspec); g_param_spec_sink (pspec);` in sequence on it,
    * taking over the initial reference count (thus ending up with a @pspec that
    * has a reference count of 1 still, but is not flagged "floating" anymore).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sink(): Unit /* None */ = g_param_spec_sink(
    this.raw.asInstanceOf[Ptr[GParamSpec]]
  )

  /** Gets back user data pointers stored via g_param_spec_set_qdata() and
    * removes the @data from @pspec without invoking its destroy() function (if
    * any was set). Usually, calling this function is only required to update
    * user data pointers with a destroy notifier.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method steal_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def stealQdata__ = ???

  /** Decrements the reference count of a @pspec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ = g_param_spec_unref(
    this.raw.asInstanceOf[Ptr[GParamSpec]]
  )

end ParamSpec

object ParamSpec:
  /** Creates a new #GParamSpec instance.
    *
    * See [canonical parameter names][canonical-parameter-names] for details of
    * the rules for @name. Names which violate these rules lead to undefined
    * behaviour.
    *
    * Beyond the name, #GParamSpecs have two more descriptive strings, the
    * @nick
    *   and @blurb, which may be used as a localized label and description. For
    *   GTK and related libraries these are considered deprecated and may be
    *   omitted, while for other libraries such as GStreamer and its plugins
    *   they are essential. When in doubt, follow the conventions used in the
    *   surrounding code and supporting libraries.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def internal(
      param_type: GType /* Some(GType) */,
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    new ParamSpec(
      g_param_spec_internal(
        param_type,
        __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        flags.raw
      ).asInstanceOf
    )

  /** Validate a property name for a #GParamSpec. This can be useful for
    * dynamically-generated properties which need to be validated at run-time
    * before actually trying to create them.
    *
    * See [canonical parameter names][canonical-parameter-names] for details of
    * the rules for valid names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isValidName(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_param_spec_is_valid_name(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ParamSpec

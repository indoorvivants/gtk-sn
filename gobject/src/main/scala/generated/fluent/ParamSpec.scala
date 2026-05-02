package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GQuark
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpec
import sn.gnome.gobject.internal.GValue

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GParamSpec is an object structure that encapsulates the metadata required
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
  */
class ParamSpec(raw: Ptr[GParamSpec]):

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the short description of a #GParamSpec.
    */
  def getBlurb()(using Zone): String /* None */ = fromCString(
    g_param_spec_get_blurb(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default value of @pspec as a pointer to a #GValue.
    *
    * The #GValue will remain valid for the life of @pspec.
    */
  def getDefaultValue(): Ptr[GValue] /* None */ =
    g_param_spec_get_default_value(this.raw.asInstanceOf[Ptr[GParamSpec]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the name of a #GParamSpec.
    *
    * The name is always an "interned" string (as per g_intern_string()). This
    * allows for pointer-value comparisons.
    */
  def getName()(using Zone): String /* None */ = fromCString(
    g_param_spec_get_name(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the GQuark for the name.
    */
  def getNameQuark(): GQuark /* None */ = g_param_spec_get_name_quark(
    this.raw.asInstanceOf[Ptr[GParamSpec]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the nickname of a #GParamSpec.
    */
  def getNick()(using Zone): String /* None */ = fromCString(
    g_param_spec_get_nick(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets back user data pointers stored via g_param_spec_set_qdata().
    */
  def getQdata(
      quark: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */
  ): Ptr[Byte] /* None */ =
    g_param_spec_get_qdata(this.raw.asInstanceOf[Ptr[GParamSpec]], quark).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If the paramspec redirects operations to another paramspec, returns that
    * paramspec. Redirect is used typically for providing a new implementation
    * of a property in a derived type while preserving all the properties from
    * the parent type. Redirection is established by creating a property of type
    * #GParamSpecOverride. See g_object_class_override_property() for an example
    * of the use of this capability.
    */
  def getRedirectTarget(): ParamSpec /* None */ = new ParamSpec(
    g_param_spec_get_redirect_target(
      this.raw.asInstanceOf[Ptr[GParamSpec]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increments the reference count of @pspec.
    */
  def ref(): ParamSpec /* None */ = new ParamSpec(
    g_param_spec_ref(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function to ref and sink a #GParamSpec.
    */
  def refSink(): ParamSpec /* None */ = new ParamSpec(
    g_param_spec_ref_sink(this.raw.asInstanceOf[Ptr[GParamSpec]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets an opaque, named pointer on a #GParamSpec. The name is specified
    * through a #GQuark (retrieved e.g. via g_quark_from_static_string()), and
    * the pointer can be gotten back from the @pspec with
    * g_param_spec_get_qdata(). Setting a previously set user data pointer,
    * overrides (frees) the old pointer set, using %NULL as pointer essentially
    * removes the data stored.
    */
  def setQdata(
      quark: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_param_spec_set_qdata(
    this.raw.asInstanceOf[Ptr[GParamSpec]],
    quark,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function works like g_param_spec_set_qdata(), but in addition, a
    * `void (*destroy) (gpointer)` function may be specified which is called
    * with @data as argument when the @pspec is finalized, or the data is being
    * overwritten by a call to g_param_spec_set_qdata() with the same @quark.
    */
  def setQdataFull(
      quark: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  ): Unit /* None */ = g_param_spec_set_qdata_full(
    this.raw.asInstanceOf[Ptr[GParamSpec]],
    quark,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The initial reference count of a newly created #GParamSpec is 1, even
    * though no one has explicitly called g_param_spec_ref() on it yet. So the
    * initial reference count is flagged as "floating", until someone calls
    * `g_param_spec_ref (pspec); g_param_spec_sink (pspec);` in sequence on it,
    * taking over the initial reference count (thus ending up with a @pspec that
    * has a reference count of 1 still, but is not flagged "floating" anymore).
    */
  def sink(): Unit /* None */ = g_param_spec_sink(
    this.raw.asInstanceOf[Ptr[GParamSpec]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets back user data pointers stored via g_param_spec_set_qdata() and
    * removes the @data from @pspec without invoking its destroy() function (if
    * any was set). Usually, calling this function is only required to update
    * user data pointers with a destroy notifier.
    */
  def stealQdata(
      quark: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */
  ): Ptr[Byte] /* None */ = g_param_spec_steal_qdata(
    this.raw.asInstanceOf[Ptr[GParamSpec]],
    quark
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decrements the reference count of a @pspec.
    */
  def unref(): Unit /* None */ = g_param_spec_unref(
    this.raw.asInstanceOf[Ptr[GParamSpec]]
  )

end ParamSpec

package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.DrawContext
import sn.gnome.gdk4.fluent.GLContext
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkGLAPI
import sn.gnome.gdk4.internal.GdkGLContext
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkGLContext` is an object representing a platform-specific OpenGL draw
  * context.
  *
  * `GdkGLContext`s are created for a surface using
  * [method@Gdk.Surface.create_gl_context], and the context will match the
  * characteristics of the surface.
  *
  * A `GdkGLContext` is not tied to any particular normal framebuffer. For
  * instance, it cannot draw to the surface back buffer. The GDK repaint system
  * is in full control of the painting to that. Instead, you can create render
  * buffers or textures and use [func@cairo_draw_from_gl] in the draw function
  * of your widget to draw them. Then GDK will handle the integration of your
  * rendering with that of other widgets.
  *
  * Support for `GdkGLContext` is platform-specific and context creation can
  * fail, returning %NULL context.
  *
  * A `GdkGLContext` has to be made "current" in order to start using it,
  * otherwise any OpenGL call will be ignored.
  *
  * ## Creating a new OpenGL context
  *
  * In order to create a new `GdkGLContext` instance you need a `GdkSurface`,
  * which you typically get during the realize call of a widget.
  *
  * A `GdkGLContext` is not realized until either
  * [method@Gdk.GLContext.make_current] or [method@Gdk.GLContext.realize] is
  * called. It is possible to specify details of the GL context like the OpenGL
  * version to be used, or whether the GL context should have extra state
  * validation enabled after calling [method@Gdk.Surface.create_gl_context] by
  * calling [method@Gdk.GLContext.realize]. If the realization fails you have
  * the option to change the settings of the `GdkGLContext` and try again.
  *
  * ## Using a GdkGLContext
  *
  * You will need to make the `GdkGLContext` the current context before issuing
  * OpenGL calls; the system sends OpenGL commands to whichever context is
  * current. It is possible to have multiple contexts, so you always need to
  * ensure that the one which you want to draw with is the current one before
  * issuing commands:
  *
  * ```c
  * gdk_gl_context_make_current (context);
  * ```
  *
  * You can now perform your drawing using OpenGL commands.
  *
  * You can check which `GdkGLContext` is the current one by using
  * [func@Gdk.GLContext.get_current]; you can also unset any `GdkGLContext` that
  * is currently set by calling [func@Gdk.GLContext.clear_current].
  */
class GLContext(raw: Ptr[GdkGLContext]) extends DrawContext(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the allowed APIs set via gdk_gl_context_set_allowed_apis().
    */
  def getAllowedApis(): GdkGLAPI /* None */ = gdk_gl_context_get_allowed_apis(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the API currently in use.
    *
    * If the renderer has not been realized yet, 0 is returned.
    */
  def getApi(): GdkGLAPI /* None */ = gdk_gl_context_get_api(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the context is doing extra validations and runtime
    * checking.
    *
    * See [method@Gdk.GLContext.set_debug_enabled].
    */
  def getDebugEnabled(): Boolean /* None */ =
    gdk_gl_context_get_debug_enabled(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the display the @context is created for
    */
  override def getDisplay(): Display /* None */ = new Display(
    gdk_gl_context_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the context is forward-compatible.
    *
    * See [method@Gdk.GLContext.set_forward_compatible].
    */
  def getForwardCompatible(): Boolean /* None */ =
    gdk_gl_context_get_forward_compatible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves required OpenGL version set as a requirement for the @context
    * realization. It will not change even if a greater OpenGL version is
    * supported and used after the @context is realized. See
    * [method@Gdk.GLContext.get_version] for the real version in use.
    *
    * See [method@Gdk.GLContext.set_required_version].
    */
  @annotation.compileTimeOnly(
    "Method get_required_version contains an OUT parameter, which is not supported yet"
  )
  private def getRequiredVersion__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to retrieves the `GdkGLContext` that this @context share data with.
    *
    * As many contexts can share data now and no single shared context exists
    * anymore, this function has been deprecated and now always returns %NULL.
    */
  def getSharedContext(): GLContext /* None */ = new GLContext(
    gdk_gl_context_get_shared_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the surface used by the @context.
    */
  override def getSurface(): Surface /* None */ = new Surface(
    gdk_gl_context_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the @context is using an OpenGL or OpenGL ES profile.
    */
  def getUseEs(): Boolean /* None */ =
    gdk_gl_context_get_use_es(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the OpenGL version of the @context.
    *
    * The @context must be realized prior to calling this function.
    */
  @annotation.compileTimeOnly(
    "Method get_version contains an OUT parameter, which is not supported yet"
  )
  private def getVersion__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Whether the `GdkGLContext` is in legacy mode or not.
    *
    * The `GdkGLContext` must be realized before calling this function.
    *
    * When realizing a GL context, GDK will try to use the OpenGL 3.2 core
    * profile; this profile removes all the OpenGL API that was deprecated prior
    * to the 3.2 version of the specification. If the realization is successful,
    * this function will return %FALSE.
    *
    * If the underlying OpenGL implementation does not support core profiles,
    * GDK will fall back to a pre-3.2 compatibility profile, and this function
    * will return %TRUE.
    *
    * You can use the value returned by this function to decide which kind of
    * OpenGL API to use, or whether to do extension discovery, or what kind of
    * shader programs to load.
    */
  def isLegacy(): Boolean /* None */ =
    gdk_gl_context_is_legacy(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the two GL contexts can share resources.
    *
    * When they can, the texture IDs from @other can be used in @self. This is
    * particularly useful when passing `GdkGLTexture` objects between different
    * contexts.
    *
    * Contexts created for the same display with the same properties will always
    * be compatible, even if they are created for different surfaces. For other
    * contexts it depends on the GL backend.
    *
    * Both contexts must be realized for this check to succeed. If either one is
    * not, this function will return %FALSE.
    */
  def isShared(
      other: GLContext /* Some(Ptr[GdkGLContext]) */
  ): Boolean /* None */ = gdk_gl_context_is_shared(
    this.raw.asInstanceOf,
    other.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes the @context the current one.
    */
  def makeCurrent(): Unit /* None */ = gdk_gl_context_make_current(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Realizes the given `GdkGLContext`.
    *
    * It is safe to call this function on a realized `GdkGLContext`.
    */
  def realize(): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gdk_gl_context_realize(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the allowed APIs. When gdk_gl_context_realize() is called, only the
    * allowed APIs will be tried. If you set this to 0, realizing will always
    * fail.
    *
    * If you set it on a realized context, the property will not have any
    * effect. It is only relevant during gdk_gl_context_realize().
    *
    * By default, all APIs are allowed.
    */
  def setAllowedApis(apis: GdkGLAPI /* Some(GdkGLAPI) */ ): Unit /* None */ =
    gdk_gl_context_set_allowed_apis(this.raw.asInstanceOf, apis)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GdkGLContext` should perform extra validations and
    * runtime checking.
    *
    * This is useful during development, but has additional overhead.
    *
    * The `GdkGLContext` must not be realized or made current prior to calling
    * this function.
    */
  def setDebugEnabled(
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gdk_gl_context_set_debug_enabled(
    this.raw.asInstanceOf,
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GdkGLContext` should be forward-compatible.
    *
    * Forward-compatible contexts must not support OpenGL functionality that has
    * been marked as deprecated in the requested version; non-forward compatible
    * contexts, on the other hand, must support both deprecated and non
    * deprecated functionality.
    *
    * The `GdkGLContext` must not be realized or made current prior to calling
    * this function.
    */
  def setForwardCompatible(
      compatible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gdk_gl_context_set_forward_compatible(
    this.raw.asInstanceOf,
    gboolean(gint((if compatible == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the major and minor version of OpenGL to request.
    *
    * Setting @major and @minor to zero will use the default values.
    *
    * Setting @major and @minor lower than the minimum versions required by GTK
    * will result in the context choosing the minimum version.
    *
    * The @context must not be realized or made current prior to calling this
    * function.
    */
  def setRequiredVersion(
      major: Int /* Some(CInt) */,
      minor: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_gl_context_set_required_version(this.raw.asInstanceOf, major, minor)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requests that GDK create an OpenGL ES context instead of an OpenGL one.
    *
    * Not all platforms support OpenGL ES.
    *
    * The @context must not have been realized.
    *
    * By default, GDK will attempt to automatically detect whether the
    * underlying GL implementation is OpenGL or OpenGL ES once the @context is
    * realized.
    *
    * You should check the return value of [method@Gdk.GLContext.get_use_es]
    * after calling [method@Gdk.GLContext.realize] to decide whether to use the
    * OpenGL or OpenGL ES API, extensions, or shaders.
    */
  def setUseEs(use_es: Int /* Some(CInt) */ ): Unit /* None */ =
    gdk_gl_context_set_use_es(this.raw.asInstanceOf, use_es)

end GLContext

package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.GdkPixbufAlphaMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Control the alpha channel for drawables.
  *
  * These values can be passed to gdk_pixbuf_xlib_render_to_drawable_alpha() in
  * gdk-pixbuf-xlib to control how the alpha channel of an image should be
  * handled.
  *
  * This function can create a bilevel clipping mask (black and white) and use
  * it while painting the image.
  *
  * In the future, when the X Window System gets an alpha channel extension, it
  * will be possible to do full alpha compositing onto arbitrary drawables. For
  * now both cases fall back to a bilevel clipping mask.
  */
enum PixbufAlphaMode(val raw: GdkPixbufAlphaMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A bilevel clipping mask (black and white) will be created and used to draw
    * the image. Pixels below 0.5 opacity will be considered fully transparent,
    * and all others will be considered fully opaque.
    */
  case BILEVEL
      extends PixbufAlphaMode(GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_BILEVEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * For now falls back to #GDK_PIXBUF_ALPHA_BILEVEL. In the future it will do
    * full alpha compositing.
    */
  case FULL extends PixbufAlphaMode(GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_FULL)
end PixbufAlphaMode

object PixbufAlphaMode:
  def fromRaw(raw: GdkPixbufAlphaMode): PixbufAlphaMode =
    raw match
      case GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_BILEVEL =>
        PixbufAlphaMode.BILEVEL
      case GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_FULL => PixbufAlphaMode.FULL
  end fromRaw
end PixbufAlphaMode

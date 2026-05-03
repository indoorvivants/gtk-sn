package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_operator_t

enum Operator(val raw: cairo_operator_t):
  case CLEAR extends Operator(cairo_operator_t.CAIRO_OPERATOR_CLEAR)
  case SOURCE extends Operator(cairo_operator_t.CAIRO_OPERATOR_SOURCE)
  case OVER extends Operator(cairo_operator_t.CAIRO_OPERATOR_OVER)
  case IN extends Operator(cairo_operator_t.CAIRO_OPERATOR_IN)
  case OUT extends Operator(cairo_operator_t.CAIRO_OPERATOR_OUT)
  case ATOP extends Operator(cairo_operator_t.CAIRO_OPERATOR_ATOP)
  case DEST extends Operator(cairo_operator_t.CAIRO_OPERATOR_DEST)
  case DEST_OVER extends Operator(cairo_operator_t.CAIRO_OPERATOR_DEST_OVER)
  case DEST_IN extends Operator(cairo_operator_t.CAIRO_OPERATOR_DEST_IN)
  case DEST_OUT extends Operator(cairo_operator_t.CAIRO_OPERATOR_DEST_OUT)
  case DEST_ATOP extends Operator(cairo_operator_t.CAIRO_OPERATOR_DEST_ATOP)
  case XOR extends Operator(cairo_operator_t.CAIRO_OPERATOR_XOR)
  case ADD extends Operator(cairo_operator_t.CAIRO_OPERATOR_ADD)
  case SATURATE extends Operator(cairo_operator_t.CAIRO_OPERATOR_SATURATE)
  case MULTIPLY extends Operator(cairo_operator_t.CAIRO_OPERATOR_MULTIPLY)
  case SCREEN extends Operator(cairo_operator_t.CAIRO_OPERATOR_SCREEN)
  case OVERLAY extends Operator(cairo_operator_t.CAIRO_OPERATOR_OVERLAY)
  case DARKEN extends Operator(cairo_operator_t.CAIRO_OPERATOR_DARKEN)
  case LIGHTEN extends Operator(cairo_operator_t.CAIRO_OPERATOR_LIGHTEN)
  case COLOR_DODGE extends Operator(cairo_operator_t.CAIRO_OPERATOR_COLOR_DODGE)
  case COLOR_BURN extends Operator(cairo_operator_t.CAIRO_OPERATOR_COLOR_BURN)
  case HARD_LIGHT extends Operator(cairo_operator_t.CAIRO_OPERATOR_HARD_LIGHT)
  case SOFT_LIGHT extends Operator(cairo_operator_t.CAIRO_OPERATOR_SOFT_LIGHT)
  case DIFFERENCE extends Operator(cairo_operator_t.CAIRO_OPERATOR_DIFFERENCE)
  case EXCLUSION extends Operator(cairo_operator_t.CAIRO_OPERATOR_EXCLUSION)
  case HSL_HUE extends Operator(cairo_operator_t.CAIRO_OPERATOR_HSL_HUE)
  case HSL_SATURATION
      extends Operator(cairo_operator_t.CAIRO_OPERATOR_HSL_SATURATION)
  case HSL_COLOR extends Operator(cairo_operator_t.CAIRO_OPERATOR_HSL_COLOR)
  case HSL_LUMINOSITY
      extends Operator(cairo_operator_t.CAIRO_OPERATOR_HSL_LUMINOSITY)
end Operator

object Operator:
  def fromRaw(raw: cairo_operator_t): Operator =
    raw match
      case cairo_operator_t.CAIRO_OPERATOR_CLEAR       => Operator.CLEAR
      case cairo_operator_t.CAIRO_OPERATOR_SOURCE      => Operator.SOURCE
      case cairo_operator_t.CAIRO_OPERATOR_OVER        => Operator.OVER
      case cairo_operator_t.CAIRO_OPERATOR_IN          => Operator.IN
      case cairo_operator_t.CAIRO_OPERATOR_OUT         => Operator.OUT
      case cairo_operator_t.CAIRO_OPERATOR_ATOP        => Operator.ATOP
      case cairo_operator_t.CAIRO_OPERATOR_DEST        => Operator.DEST
      case cairo_operator_t.CAIRO_OPERATOR_DEST_OVER   => Operator.DEST_OVER
      case cairo_operator_t.CAIRO_OPERATOR_DEST_IN     => Operator.DEST_IN
      case cairo_operator_t.CAIRO_OPERATOR_DEST_OUT    => Operator.DEST_OUT
      case cairo_operator_t.CAIRO_OPERATOR_DEST_ATOP   => Operator.DEST_ATOP
      case cairo_operator_t.CAIRO_OPERATOR_XOR         => Operator.XOR
      case cairo_operator_t.CAIRO_OPERATOR_ADD         => Operator.ADD
      case cairo_operator_t.CAIRO_OPERATOR_SATURATE    => Operator.SATURATE
      case cairo_operator_t.CAIRO_OPERATOR_MULTIPLY    => Operator.MULTIPLY
      case cairo_operator_t.CAIRO_OPERATOR_SCREEN      => Operator.SCREEN
      case cairo_operator_t.CAIRO_OPERATOR_OVERLAY     => Operator.OVERLAY
      case cairo_operator_t.CAIRO_OPERATOR_DARKEN      => Operator.DARKEN
      case cairo_operator_t.CAIRO_OPERATOR_LIGHTEN     => Operator.LIGHTEN
      case cairo_operator_t.CAIRO_OPERATOR_COLOR_DODGE => Operator.COLOR_DODGE
      case cairo_operator_t.CAIRO_OPERATOR_COLOR_BURN  => Operator.COLOR_BURN
      case cairo_operator_t.CAIRO_OPERATOR_HARD_LIGHT  => Operator.HARD_LIGHT
      case cairo_operator_t.CAIRO_OPERATOR_SOFT_LIGHT  => Operator.SOFT_LIGHT
      case cairo_operator_t.CAIRO_OPERATOR_DIFFERENCE  => Operator.DIFFERENCE
      case cairo_operator_t.CAIRO_OPERATOR_EXCLUSION   => Operator.EXCLUSION
      case cairo_operator_t.CAIRO_OPERATOR_HSL_HUE     => Operator.HSL_HUE
      case cairo_operator_t.CAIRO_OPERATOR_HSL_SATURATION =>
        Operator.HSL_SATURATION
      case cairo_operator_t.CAIRO_OPERATOR_HSL_COLOR      => Operator.HSL_COLOR
      case cairo_operator_t.CAIRO_OPERATOR_HSL_LUMINOSITY =>
        Operator.HSL_LUMINOSITY
  end fromRaw
end Operator

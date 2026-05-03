package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_memory_mode_t

/**  COMMENT FOR THE ORIGINAL C DEFINITION
  *
  *  Data type holding the memory modes available to
  *  client programs.
  *
  *  Regarding these various memory-modes:
  *
  *  - In no case shall the HarfBuzz client modify memory
  *    that is passed to HarfBuzz in a blob.  If there is
  *    any such possibility, @HB_MEMORY_MODE_DUPLICATE should be used
  *    such that HarfBuzz makes a copy immediately,
  *
  *  - Use @HB_MEMORY_MODE_READONLY otherwise, unless you really really
  *    really know what you are doing,
  *
  *  - @HB_MEMORY_MODE_WRITABLE is appropriate if you really made a
  *    copy of data solely for the purpose of passing to
  *    HarfBuzz and doing that just once (no reuse!),
  *
  *  - If the font is mmap()ed, it's okay to use
  *    @HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE, however, using that mode
  *    correctly is very tricky.  Use @HB_MEMORY_MODE_READONLY instead.
  */
enum memory_mode_t(val raw: hb_memory_mode_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * HarfBuzz immediately makes a copy of the data.
    */
  case DUPLICATE
      extends memory_mode_t(hb_memory_mode_t.HB_MEMORY_MODE_DUPLICATE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * HarfBuzz client will never modify the data, and HarfBuzz will never modify
    * the data.
    */
  case READONLY extends memory_mode_t(hb_memory_mode_t.HB_MEMORY_MODE_READONLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * HarfBuzz client made a copy of the data solely for HarfBuzz, so HarfBuzz
    * may modify the data.
    */
  case WRITABLE extends memory_mode_t(hb_memory_mode_t.HB_MEMORY_MODE_WRITABLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See above
    */
  case READONLY_MAY_MAKE_WRITABLE
      extends memory_mode_t(
        hb_memory_mode_t.HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE
      )
end memory_mode_t

object memory_mode_t:
  def fromRaw(raw: hb_memory_mode_t): memory_mode_t =
    raw match
      case hb_memory_mode_t.HB_MEMORY_MODE_DUPLICATE => memory_mode_t.DUPLICATE
      case hb_memory_mode_t.HB_MEMORY_MODE_READONLY  => memory_mode_t.READONLY
      case hb_memory_mode_t.HB_MEMORY_MODE_WRITABLE  => memory_mode_t.WRITABLE
      case hb_memory_mode_t.HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE =>
        memory_mode_t.READONLY_MAY_MAKE_WRITABLE
  end fromRaw
end memory_mode_t

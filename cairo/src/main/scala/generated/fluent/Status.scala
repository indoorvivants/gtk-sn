package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_status_t

enum Status(val raw: cairo_status_t):
  case SUCCESS extends Status(cairo_status_t.CAIRO_STATUS_SUCCESS)
  case NO_MEMORY extends Status(cairo_status_t.CAIRO_STATUS_NO_MEMORY)
  case INVALID_RESTORE
      extends Status(cairo_status_t.CAIRO_STATUS_INVALID_RESTORE)
  case INVALID_POP_GROUP
      extends Status(cairo_status_t.CAIRO_STATUS_INVALID_POP_GROUP)
  case NO_CURRENT_POINT
      extends Status(cairo_status_t.CAIRO_STATUS_NO_CURRENT_POINT)
  case INVALID_MATRIX extends Status(cairo_status_t.CAIRO_STATUS_INVALID_MATRIX)
  case INVALID_STATUS extends Status(cairo_status_t.CAIRO_STATUS_INVALID_STATUS)
  case NULL_POINTER extends Status(cairo_status_t.CAIRO_STATUS_NULL_POINTER)
  case INVALID_STRING extends Status(cairo_status_t.CAIRO_STATUS_INVALID_STRING)
  case INVALID_PATH_DATA
      extends Status(cairo_status_t.CAIRO_STATUS_INVALID_PATH_DATA)
  case READ_ERROR extends Status(cairo_status_t.CAIRO_STATUS_READ_ERROR)
  case WRITE_ERROR extends Status(cairo_status_t.CAIRO_STATUS_WRITE_ERROR)
  case SURFACE_FINISHED
      extends Status(cairo_status_t.CAIRO_STATUS_SURFACE_FINISHED)
  case SURFACE_TYPE_MISMATCH
      extends Status(cairo_status_t.CAIRO_STATUS_SURFACE_TYPE_MISMATCH)
  case PATTERN_TYPE_MISMATCH
      extends Status(cairo_status_t.CAIRO_STATUS_PATTERN_TYPE_MISMATCH)
  case INVALID_CONTENT
      extends Status(cairo_status_t.CAIRO_STATUS_INVALID_CONTENT)
  case INVALID_FORMAT extends Status(cairo_status_t.CAIRO_STATUS_INVALID_FORMAT)
  case INVALID_VISUAL extends Status(cairo_status_t.CAIRO_STATUS_INVALID_VISUAL)
  case FILE_NOT_FOUND extends Status(cairo_status_t.CAIRO_STATUS_FILE_NOT_FOUND)
  case INVALID_DASH extends Status(cairo_status_t.CAIRO_STATUS_INVALID_DASH)
  case INVALID_DSC_COMMENT
      extends Status(cairo_status_t.CAIRO_STATUS_INVALID_DSC_COMMENT)
  case INVALID_INDEX extends Status(cairo_status_t.CAIRO_STATUS_INVALID_INDEX)
  case CLIP_NOT_REPRESENTABLE
      extends Status(cairo_status_t.CAIRO_STATUS_CLIP_NOT_REPRESENTABLE)
  case TEMP_FILE_ERROR
      extends Status(cairo_status_t.CAIRO_STATUS_TEMP_FILE_ERROR)
  case INVALID_STRIDE extends Status(cairo_status_t.CAIRO_STATUS_INVALID_STRIDE)
  case FONT_TYPE_MISMATCH
      extends Status(cairo_status_t.CAIRO_STATUS_FONT_TYPE_MISMATCH)
  case USER_FONT_IMMUTABLE
      extends Status(cairo_status_t.CAIRO_STATUS_USER_FONT_IMMUTABLE)
  case USER_FONT_ERROR
      extends Status(cairo_status_t.CAIRO_STATUS_USER_FONT_ERROR)
  case NEGATIVE_COUNT extends Status(cairo_status_t.CAIRO_STATUS_NEGATIVE_COUNT)
  case INVALID_CLUSTERS
      extends Status(cairo_status_t.CAIRO_STATUS_INVALID_CLUSTERS)
  case INVALID_SLANT extends Status(cairo_status_t.CAIRO_STATUS_INVALID_SLANT)
  case INVALID_WEIGHT extends Status(cairo_status_t.CAIRO_STATUS_INVALID_WEIGHT)
  case INVALID_SIZE extends Status(cairo_status_t.CAIRO_STATUS_INVALID_SIZE)
  case USER_FONT_NOT_IMPLEMENTED
      extends Status(cairo_status_t.CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED)
  case DEVICE_TYPE_MISMATCH
      extends Status(cairo_status_t.CAIRO_STATUS_DEVICE_TYPE_MISMATCH)
  case DEVICE_ERROR extends Status(cairo_status_t.CAIRO_STATUS_DEVICE_ERROR)
  case INVALID_MESH_CONSTRUCTION
      extends Status(cairo_status_t.CAIRO_STATUS_INVALID_MESH_CONSTRUCTION)
  case DEVICE_FINISHED
      extends Status(cairo_status_t.CAIRO_STATUS_DEVICE_FINISHED)
  case JBIG2_GLOBAL_MISSING
      extends Status(cairo_status_t.CAIRO_STATUS_JBIG2_GLOBAL_MISSING)
end Status

object Status:
  def fromRaw(raw: cairo_status_t): Status =
    raw match
      case cairo_status_t.CAIRO_STATUS_SUCCESS         => Status.SUCCESS
      case cairo_status_t.CAIRO_STATUS_NO_MEMORY       => Status.NO_MEMORY
      case cairo_status_t.CAIRO_STATUS_INVALID_RESTORE => Status.INVALID_RESTORE
      case cairo_status_t.CAIRO_STATUS_INVALID_POP_GROUP =>
        Status.INVALID_POP_GROUP
      case cairo_status_t.CAIRO_STATUS_NO_CURRENT_POINT =>
        Status.NO_CURRENT_POINT
      case cairo_status_t.CAIRO_STATUS_INVALID_MATRIX => Status.INVALID_MATRIX
      case cairo_status_t.CAIRO_STATUS_INVALID_STATUS => Status.INVALID_STATUS
      case cairo_status_t.CAIRO_STATUS_NULL_POINTER   => Status.NULL_POINTER
      case cairo_status_t.CAIRO_STATUS_INVALID_STRING => Status.INVALID_STRING
      case cairo_status_t.CAIRO_STATUS_INVALID_PATH_DATA =>
        Status.INVALID_PATH_DATA
      case cairo_status_t.CAIRO_STATUS_READ_ERROR       => Status.READ_ERROR
      case cairo_status_t.CAIRO_STATUS_WRITE_ERROR      => Status.WRITE_ERROR
      case cairo_status_t.CAIRO_STATUS_SURFACE_FINISHED =>
        Status.SURFACE_FINISHED
      case cairo_status_t.CAIRO_STATUS_SURFACE_TYPE_MISMATCH =>
        Status.SURFACE_TYPE_MISMATCH
      case cairo_status_t.CAIRO_STATUS_PATTERN_TYPE_MISMATCH =>
        Status.PATTERN_TYPE_MISMATCH
      case cairo_status_t.CAIRO_STATUS_INVALID_CONTENT => Status.INVALID_CONTENT
      case cairo_status_t.CAIRO_STATUS_INVALID_FORMAT  => Status.INVALID_FORMAT
      case cairo_status_t.CAIRO_STATUS_INVALID_VISUAL  => Status.INVALID_VISUAL
      case cairo_status_t.CAIRO_STATUS_FILE_NOT_FOUND  => Status.FILE_NOT_FOUND
      case cairo_status_t.CAIRO_STATUS_INVALID_DASH    => Status.INVALID_DASH
      case cairo_status_t.CAIRO_STATUS_INVALID_DSC_COMMENT =>
        Status.INVALID_DSC_COMMENT
      case cairo_status_t.CAIRO_STATUS_INVALID_INDEX => Status.INVALID_INDEX
      case cairo_status_t.CAIRO_STATUS_CLIP_NOT_REPRESENTABLE =>
        Status.CLIP_NOT_REPRESENTABLE
      case cairo_status_t.CAIRO_STATUS_TEMP_FILE_ERROR => Status.TEMP_FILE_ERROR
      case cairo_status_t.CAIRO_STATUS_INVALID_STRIDE  => Status.INVALID_STRIDE
      case cairo_status_t.CAIRO_STATUS_FONT_TYPE_MISMATCH =>
        Status.FONT_TYPE_MISMATCH
      case cairo_status_t.CAIRO_STATUS_USER_FONT_IMMUTABLE =>
        Status.USER_FONT_IMMUTABLE
      case cairo_status_t.CAIRO_STATUS_USER_FONT_ERROR => Status.USER_FONT_ERROR
      case cairo_status_t.CAIRO_STATUS_NEGATIVE_COUNT  => Status.NEGATIVE_COUNT
      case cairo_status_t.CAIRO_STATUS_INVALID_CLUSTERS =>
        Status.INVALID_CLUSTERS
      case cairo_status_t.CAIRO_STATUS_INVALID_SLANT  => Status.INVALID_SLANT
      case cairo_status_t.CAIRO_STATUS_INVALID_WEIGHT => Status.INVALID_WEIGHT
      case cairo_status_t.CAIRO_STATUS_INVALID_SIZE   => Status.INVALID_SIZE
      case cairo_status_t.CAIRO_STATUS_USER_FONT_NOT_IMPLEMENTED =>
        Status.USER_FONT_NOT_IMPLEMENTED
      case cairo_status_t.CAIRO_STATUS_DEVICE_TYPE_MISMATCH =>
        Status.DEVICE_TYPE_MISMATCH
      case cairo_status_t.CAIRO_STATUS_DEVICE_ERROR => Status.DEVICE_ERROR
      case cairo_status_t.CAIRO_STATUS_INVALID_MESH_CONSTRUCTION =>
        Status.INVALID_MESH_CONSTRUCTION
      case cairo_status_t.CAIRO_STATUS_DEVICE_FINISHED => Status.DEVICE_FINISHED
      case cairo_status_t.CAIRO_STATUS_JBIG2_GLOBAL_MISSING =>
        Status.JBIG2_GLOBAL_MISSING
  end fromRaw
end Status

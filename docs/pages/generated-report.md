---
title: Generator report
index: 10
---

This report is generated automatically from all the supported namespaces.
It shows the current state of supported definitions.
# cairo

## Enums
- Status ✅

- Content ✅

- Operator ✅

- Antialias ✅

- FillRule ✅

- LineCap ✅

- LineJoin ✅

- TextClusterFlags ✅

- FontSlant ✅

- FontWeight ✅

- SubpixelOrder ✅

- HintStyle ✅

- HintMetrics ✅

- FontType ✅

- PathDataType ✅

- DeviceType ✅

- SurfaceType ✅

- Format ✅

- PatternType ✅

- Extend ✅

- Filter ✅

- RegionOverlap ✅

# Gdk

## Classes
### AppLaunchContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_display ✅

- set_desktop ✅

- set_icon ✅

- set_icon_name ✅

- set_timestamp ✅


### ButtonEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_button ✅


### CairoContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- cairo_create
  > ❌ `[method cairo_create/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))`

### Clipboard


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>9</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- get_content ✅

- get_display ✅

- get_formats
  > ❌ `[method get_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- is_local ✅

- read_async
  > ❌ `[method read_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_finish
  > ❌ `[method read_finish]: Method read_finish contains an OUT parameter, which is not supported yet`
- read_text_async
  > ❌ `[method read_text_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_text_finish ✅

- read_texture_async
  > ❌ `[method read_texture_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_texture_finish ✅

- read_value_async
  > ❌ `[method read_value_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_value_finish ✅

- set
  > ❌ `[method set/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_content ✅

- set_text ✅

- set_texture ✅

- set_valist
  > ❌ `[method set_valist]: Method set_valist is weird: Something with overrides `
- set_value ✅

- store_async
  > ❌ `[method store_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- store_finish ✅

#### Signals
- changed ✅


### ContentDeserializer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_cancellable ✅

- get_gtype ✅

- get_input_stream ✅

- get_mime_type ✅

- get_priority ✅

- get_task_data ✅

- get_user_data ✅

- get_value ✅

- return_error
  > ❌ `[method return_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))`
- return_success ✅

- set_task_data
  > ❌ `[method set_task_data/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`

### ContentProvider


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new_for_bytes
  > ❌ `[constructor new_for_bytes/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- new_for_value ✅

- new_typed ✅

- new_union
  > ❌ `[constructor new_union]: Constructor new_union is weird: non NULL-terminated arrays require special handling`
#### Methods
- content_changed ✅

- get_value
  > ❌ `[method get_value]: Method get_value contains an OUT parameter, which is not supported yet`
- ref_formats
  > ❌ `[method ref_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- ref_storable_formats
  > ❌ `[method ref_storable_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- write_mime_type_async
  > ❌ `[method write_mime_type_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- write_mime_type_finish ✅

#### Signals
- content-changed ✅


### ContentSerializer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_cancellable ✅

- get_gtype ✅

- get_mime_type ✅

- get_output_stream ✅

- get_priority ✅

- get_task_data ✅

- get_user_data ✅

- get_value ✅

- return_error
  > ❌ `[method return_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))`
- return_success ✅

- set_task_data
  > ❌ `[method set_task_data/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`

### CrossingEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_detail ✅

- get_focus ✅

- get_mode ✅


### Cursor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_name ✅

- new_from_texture ✅

#### Methods
- get_fallback ✅

- get_hotspot_x ✅

- get_hotspot_y ✅

- get_name ✅

- get_texture ✅


### DNDEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_drop ✅


### DeleteEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### Device


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>16</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Methods
- get_caps_lock_state ✅

- get_device_tool ✅

- get_direction ✅

- get_display ✅

- get_has_cursor ✅

- get_modifier_state ✅

- get_name ✅

- get_num_lock_state ✅

- get_num_touches ✅

- get_product_id ✅

- get_scroll_lock_state ✅

- get_seat ✅

- get_source ✅

- get_surface_at_position
  > ❌ `[method get_surface_at_position]: Method get_surface_at_position contains an OUT parameter, which is not supported yet`
- get_timestamp ✅

- get_vendor_id ✅

- has_bidi_layouts ✅

#### Signals
- changed ✅

- tool-changed ✅


### DeviceTool


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_axes ✅

- get_hardware_id ✅

- get_serial ✅

- get_tool_type ✅


### Display


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>22</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>5</td><td>0</td><td>0</tr></table>

#### Methods
- beep ✅

- close ✅

- create_gl_context ✅

- device_is_grabbed ✅

- flush ✅

- get_app_launch_context ✅

- get_clipboard ✅

- get_default_seat ✅

- get_monitor_at_surface ✅

- get_monitors ✅

- get_name ✅

- get_primary_clipboard ✅

- get_setting ✅

- get_startup_notification_id ✅

- is_closed ✅

- is_composited ✅

- is_rgba ✅

- list_seats
  > ❌ `[method list_seats/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Seat))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- map_keycode
  > ❌ `[method map_keycode]: Method map_keycode contains an OUT parameter, which is not supported yet`
- map_keyval
  > ❌ `[method map_keyval]: Method map_keyval contains an OUT parameter, which is not supported yet`
- notify_startup_complete ✅

- prepare_gl ✅

- put_event ✅

- supports_input_shapes ✅

- sync ✅

- translate_key
  > ❌ `[method translate_key]: Method translate_key contains an OUT parameter, which is not supported yet`
#### Functions
- get_default ✅

- open ✅

#### Signals
- closed ✅

- opened ✅

- seat-added ✅

- seat-removed ✅

- setting-changed ✅


### DisplayManager


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- get_default_display ✅

- list_displays
  > ❌ `[method list_displays/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Display))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))`
- open_display ✅

- set_default_display ✅

#### Functions
- get ✅

#### Signals
- display-opened ✅


### Drag


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>0</tr></table>

#### Methods
- drop_done ✅

- get_actions ✅

- get_content ✅

- get_device ✅

- get_display ✅

- get_drag_surface ✅

- get_formats
  > ❌ `[method get_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- get_selected_action ✅

- get_surface ✅

- set_hotspot ✅

#### Functions
- begin ✅

#### Signals
- cancel ✅

- dnd-finished ✅

- drop-performed ✅


### DrawContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- begin_frame
  > ❌ `[method begin_frame/<method parameters>/region]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(const cairo_region_t*)))`
- end_frame ✅

- get_display ✅

- get_frame_region
  > ❌ `[method get_frame_region/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(const cairo_region_t*)))`
- get_surface ✅

- is_in_frame ✅


### Drop


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- finish ✅

- get_actions ✅

- get_device ✅

- get_display ✅

- get_drag ✅

- get_formats
  > ❌ `[method get_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- get_surface ✅

- read_async
  > ❌ `[method read_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_finish
  > ❌ `[method read_finish]: Method read_finish contains an OUT parameter, which is not supported yet`
- read_value_async
  > ❌ `[method read_value_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_value_finish ✅

- status ✅


### Event


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>8</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- _get_angle
  > ❌ `[method _get_angle]: Method _get_angle contains an OUT parameter, which is not supported yet`
- _get_center
  > ❌ `[method _get_center]: Method _get_center contains an OUT parameter, which is not supported yet`
- _get_distance
  > ❌ `[method _get_distance]: Method _get_distance contains an OUT parameter, which is not supported yet`
- get_axes
  > ❌ `[method get_axes]: Method get_axes contains an OUT parameter, which is not supported yet`
- get_axis
  > ❌ `[method get_axis]: Method get_axis contains an OUT parameter, which is not supported yet`
- get_device ✅

- get_device_tool ✅

- get_display ✅

- get_event_sequence
  > ❌ `[method get_event_sequence/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(EventSequence), @type -> DataRecord(GdkEventSequence*)))`
- get_event_type ✅

- get_history
  > ❌ `[method get_history]: Method get_history contains an OUT parameter, which is not supported yet`
- get_modifier_state ✅

- get_pointer_emulated ✅

- get_position
  > ❌ `[method get_position]: Method get_position contains an OUT parameter, which is not supported yet`
- get_seat ✅

- get_surface ✅

- get_time ✅

- ref ✅

- triggers_context_menu ✅

- unref ✅


### FocusEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_in ✅


### FrameClock


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>7</td><td>0</td><td>0</tr></table>

#### Methods
- begin_updating ✅

- end_updating ✅

- get_current_timings
  > ❌ `[method get_current_timings/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FrameTimings), @type -> DataRecord(GdkFrameTimings*)))`
- get_fps ✅

- get_frame_counter ✅

- get_frame_time ✅

- get_history_start ✅

- get_refresh_info
  > ❌ `[method get_refresh_info]: Method get_refresh_info contains an OUT parameter, which is not supported yet`
- get_timings
  > ❌ `[method get_timings/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FrameTimings), @type -> DataRecord(GdkFrameTimings*)))`
- request_phase ✅

#### Signals
- after-paint ✅

- before-paint ✅

- flush-events ✅

- layout ✅

- paint ✅

- resume-events ✅

- update ✅


### GLContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>17</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_allowed_apis ✅

- get_api ✅

- get_debug_enabled ✅

- get_display ✅

- get_forward_compatible ✅

- get_required_version
  > ❌ `[method get_required_version]: Method get_required_version contains an OUT parameter, which is not supported yet`
- get_shared_context ✅

- get_surface ✅

- get_use_es ✅

- get_version
  > ❌ `[method get_version]: Method get_version contains an OUT parameter, which is not supported yet`
- is_legacy ✅

- is_shared ✅

- make_current ✅

- realize ✅

- set_allowed_apis ✅

- set_debug_enabled ✅

- set_forward_compatible ✅

- set_required_version ✅

- set_use_es ✅

#### Functions
- clear_current ✅

- get_current ✅


### GLTexture


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`
#### Methods
- release ✅


### GLTextureBuilder


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>16</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- build
  > ❌ `[method build/<method parameters>/destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`
- get_context ✅

- get_format ✅

- get_has_mipmap ✅

- get_height ✅

- get_id ✅

- get_sync ✅

- get_update_region
  > ❌ `[method get_update_region/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))`
- get_update_texture ✅

- get_width ✅

- set_context ✅

- set_format ✅

- set_has_mipmap ✅

- set_height ✅

- set_id ✅

- set_sync ✅

- set_update_region
  > ❌ `[method set_update_region/<method parameters>/region]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))`
- set_update_texture ✅

- set_width ✅


### GrabBrokenEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_grab_surface ✅

- get_implicit ✅


### KeyEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_consumed_modifiers ✅

- get_keycode ✅

- get_keyval ✅

- get_layout ✅

- get_level ✅

- get_match
  > ❌ `[method get_match]: Method get_match contains an OUT parameter, which is not supported yet`
- is_modifier ✅

- matches ✅


### MemoryTexture


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`

### Monitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- get_connector ✅

- get_description ✅

- get_display ✅

- get_geometry
  > ❌ `[method get_geometry]: Method get_geometry contains an OUT parameter, which is not supported yet`
- get_height_mm ✅

- get_manufacturer ✅

- get_model ✅

- get_refresh_rate ✅

- get_scale_factor ✅

- get_subpixel_layout ✅

- get_width_mm ✅

- is_valid ✅

#### Signals
- invalidate ✅


### MotionEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### PadEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_axis_value
  > ❌ `[method get_axis_value]: Method get_axis_value contains an OUT parameter, which is not supported yet`
- get_button ✅

- get_group_mode
  > ❌ `[method get_group_mode]: Method get_group_mode contains an OUT parameter, which is not supported yet`

### ProximityEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ScrollEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_deltas
  > ❌ `[method get_deltas]: Method get_deltas contains an OUT parameter, which is not supported yet`
- get_direction ✅

- get_unit ✅

- is_stop ✅


### Seat


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>4</td><td>0</td><td>0</tr></table>

#### Methods
- get_capabilities ✅

- get_devices
  > ❌ `[method get_devices/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Device))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_display ✅

- get_keyboard ✅

- get_pointer ✅

- get_tools
  > ❌ `[method get_tools/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DeviceTool))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
#### Signals
- device-added ✅

- device-removed ✅

- tool-added ✅

- tool-removed ✅


### Snapshot


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### Surface


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>20</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>4</td><td>0</td><td>1</tr></table>

#### Constructors
- new_popup ✅

- new_toplevel ✅

#### Methods
- beep ✅

- create_cairo_context ✅

- create_gl_context ✅

- create_similar_surface
  > ❌ `[method create_similar_surface/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))`
- create_vulkan_context ✅

- destroy ✅

- get_cursor ✅

- get_device_cursor ✅

- get_device_position
  > ❌ `[method get_device_position]: Method get_device_position contains an OUT parameter, which is not supported yet`
- get_display ✅

- get_frame_clock ✅

- get_height ✅

- get_mapped ✅

- get_scale ✅

- get_scale_factor ✅

- get_width ✅

- hide ✅

- is_destroyed ✅

- queue_render ✅

- request_layout ✅

- set_cursor ✅

- set_device_cursor ✅

- set_input_region
  > ❌ `[method set_input_region/<method parameters>/region]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))`
- set_opaque_region
  > ❌ `[method set_opaque_region/<method parameters>/region]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))`
- translate_coordinates
  > ❌ `[method translate_coordinates]: Method translate_coordinates contains an INOUT parameter, which is not supported yet`
#### Signals
- enter-monitor ✅

- event ✅

- layout ✅

- leave-monitor ✅

- render
  > ❌ `[signal render]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(cairo.Region)))`

### Texture


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_for_pixbuf ✅

- new_from_bytes
  > ❌ `[constructor new_from_bytes/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- new_from_file ✅

- new_from_filename ✅

- new_from_resource ✅

#### Methods
- download
  > ❌ `[method download/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(guchar*)))`
- get_format ✅

- get_height ✅

- get_width ✅

- save_to_png ✅

- save_to_png_bytes
  > ❌ `[method save_to_png_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- save_to_tiff ✅

- save_to_tiff_bytes
  > ❌ `[method save_to_tiff_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`

### TouchEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_emulating_pointer ✅


### TouchpadEvent


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_deltas
  > ❌ `[method get_deltas]: Method get_deltas contains an OUT parameter, which is not supported yet`
- get_gesture_phase ✅

- get_n_fingers ✅

- get_pinch_angle_delta ✅

- get_pinch_scale ✅


### VulkanContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Signals
- images-updated ✅


## Interfaces
### DevicePad


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>4</td><td>0</td><td>0</tr></table>

#### Methods
- get_feature_group ✅

- get_group_n_modes ✅

- get_n_features ✅

- get_n_groups ✅

### DragSurface


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- present ✅

### Paintable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>8</td><td>0</td><td>1</tr></table>

#### Methods
- compute_concrete_size
  > ❌ `[method compute_concrete_size]: Method compute_concrete_size contains an OUT parameter, which is not supported yet`
- get_current_image ✅

- get_flags ✅

- get_intrinsic_aspect_ratio ✅

- get_intrinsic_height ✅

- get_intrinsic_width ✅

- invalidate_contents ✅

- invalidate_size ✅

- snapshot ✅

### Popup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>6</td><td>0</td><td>1</tr></table>

#### Methods
- get_autohide ✅

- get_parent ✅

- get_position_x ✅

- get_position_y ✅

- get_rect_anchor ✅

- get_surface_anchor ✅

- present
  > ❌ `[method present/<method parameters>/layout]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PopupLayout), @type -> DataRecord(GdkPopupLayout*)))`
### Toplevel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>17</td><td>0</td><td>2</tr></table>

#### Methods
- begin_move ✅

- begin_resize ✅

- focus ✅

- get_state ✅

- inhibit_system_shortcuts ✅

- lower ✅

- minimize ✅

- present
  > ❌ `[method present/<method parameters>/layout]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ToplevelLayout), @type -> DataRecord(GdkToplevelLayout*)))`
- restore_system_shortcuts ✅

- set_decorated ✅

- set_deletable ✅

- set_icon_list
  > ❌ `[method set_icon_list/<method parameters>/surfaces]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Texture))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- set_modal ✅

- set_startup_id ✅

- set_title ✅

- set_transient_for ✅

- show_window_menu ✅

- supports_edge_constraints ✅

- titlebar_gesture ✅

## Enums
- AxisUse ✅

- CrossingMode ✅

- DevicePadFeature ✅

- DeviceToolType ✅

- DragCancelReason ✅

- EventType ✅

- FullscreenMode ✅

- GLError ✅

- Gravity ✅

- InputSource ✅

- KeyMatch ✅

- MemoryFormat ✅

- NotifyType ✅

- ScrollDirection ✅

- ScrollUnit ✅

- SubpixelLayout ✅

- SurfaceEdge ✅

- TextureError ✅

- TitlebarGesture ✅

- TouchpadGesturePhase ✅

- VulkanError ✅

## Bitfields
- AnchorHints ✅

- AxisFlags ✅

- DragAction ✅

- FrameClockPhase ✅

- GLAPI ✅

- ModifierType ✅

- PaintableFlags ✅

- SeatCapabilities ✅

- ToplevelState ✅

## Constants
- ACTION_ALL ✅

- BUTTON_MIDDLE ✅

- BUTTON_PRIMARY ✅

- BUTTON_SECONDARY ✅

- CURRENT_TIME ✅

- EVENT_PROPAGATE ✅

- EVENT_STOP ✅

- KEY_0 ✅

- KEY_1 ✅

- KEY_2 ✅

- KEY_3 ✅

- KEY_3270_AltCursor ✅

- KEY_3270_Attn ✅

- KEY_3270_BackTab ✅

- KEY_3270_ChangeScreen ✅

- KEY_3270_Copy ✅

- KEY_3270_CursorBlink ✅

- KEY_3270_CursorSelect ✅

- KEY_3270_DeleteWord ✅

- KEY_3270_Duplicate ✅

- KEY_3270_Enter ✅

- KEY_3270_EraseEOF ✅

- KEY_3270_EraseInput ✅

- KEY_3270_ExSelect ✅

- KEY_3270_FieldMark ✅

- KEY_3270_Ident ✅

- KEY_3270_Jump ✅

- KEY_3270_KeyClick ✅

- KEY_3270_Left2 ✅

- KEY_3270_PA1 ✅

- KEY_3270_PA2 ✅

- KEY_3270_PA3 ✅

- KEY_3270_Play ✅

- KEY_3270_PrintScreen ✅

- KEY_3270_Quit ✅

- KEY_3270_Record ✅

- KEY_3270_Reset ✅

- KEY_3270_Right2 ✅

- KEY_3270_Rule ✅

- KEY_3270_Setup ✅

- KEY_3270_Test ✅

- KEY_4 ✅

- KEY_5 ✅

- KEY_6 ✅

- KEY_7 ✅

- KEY_8 ✅

- KEY_9 ✅

- KEY_A ✅

- KEY_AE ✅

- KEY_Aacute ✅

- KEY_Abelowdot ✅

- KEY_Abreve ✅

- KEY_Abreveacute ✅

- KEY_Abrevebelowdot ✅

- KEY_Abrevegrave ✅

- KEY_Abrevehook ✅

- KEY_Abrevetilde ✅

- KEY_AccessX_Enable ✅

- KEY_AccessX_Feedback_Enable ✅

- KEY_Acircumflex ✅

- KEY_Acircumflexacute ✅

- KEY_Acircumflexbelowdot ✅

- KEY_Acircumflexgrave ✅

- KEY_Acircumflexhook ✅

- KEY_Acircumflextilde ✅

- KEY_AddFavorite ✅

- KEY_Adiaeresis ✅

- KEY_Agrave ✅

- KEY_Ahook ✅

- KEY_Alt_L ✅

- KEY_Alt_R ✅

- KEY_Amacron ✅

- KEY_Aogonek ✅

- KEY_ApplicationLeft ✅

- KEY_ApplicationRight ✅

- KEY_Arabic_0 ✅

- KEY_Arabic_1 ✅

- KEY_Arabic_2 ✅

- KEY_Arabic_3 ✅

- KEY_Arabic_4 ✅

- KEY_Arabic_5 ✅

- KEY_Arabic_6 ✅

- KEY_Arabic_7 ✅

- KEY_Arabic_8 ✅

- KEY_Arabic_9 ✅

- KEY_Arabic_ain ✅

- KEY_Arabic_alef ✅

- KEY_Arabic_alefmaksura ✅

- KEY_Arabic_beh ✅

- KEY_Arabic_comma ✅

- KEY_Arabic_dad ✅

- KEY_Arabic_dal ✅

- KEY_Arabic_damma ✅

- KEY_Arabic_dammatan ✅

- KEY_Arabic_ddal ✅

- KEY_Arabic_farsi_yeh ✅

- KEY_Arabic_fatha ✅

- KEY_Arabic_fathatan ✅

- KEY_Arabic_feh ✅

- KEY_Arabic_fullstop ✅

- KEY_Arabic_gaf ✅

- KEY_Arabic_ghain ✅

- KEY_Arabic_ha ✅

- KEY_Arabic_hah ✅

- KEY_Arabic_hamza ✅

- KEY_Arabic_hamza_above ✅

- KEY_Arabic_hamza_below ✅

- KEY_Arabic_hamzaonalef ✅

- KEY_Arabic_hamzaonwaw ✅

- KEY_Arabic_hamzaonyeh ✅

- KEY_Arabic_hamzaunderalef ✅

- KEY_Arabic_heh ✅

- KEY_Arabic_heh_doachashmee ✅

- KEY_Arabic_heh_goal ✅

- KEY_Arabic_jeem ✅

- KEY_Arabic_jeh ✅

- KEY_Arabic_kaf ✅

- KEY_Arabic_kasra ✅

- KEY_Arabic_kasratan ✅

- KEY_Arabic_keheh ✅

- KEY_Arabic_khah ✅

- KEY_Arabic_lam ✅

- KEY_Arabic_madda_above ✅

- KEY_Arabic_maddaonalef ✅

- KEY_Arabic_meem ✅

- KEY_Arabic_noon ✅

- KEY_Arabic_noon_ghunna ✅

- KEY_Arabic_peh ✅

- KEY_Arabic_percent ✅

- KEY_Arabic_qaf ✅

- KEY_Arabic_question_mark ✅

- KEY_Arabic_ra ✅

- KEY_Arabic_rreh ✅

- KEY_Arabic_sad ✅

- KEY_Arabic_seen ✅

- KEY_Arabic_semicolon ✅

- KEY_Arabic_shadda ✅

- KEY_Arabic_sheen ✅

- KEY_Arabic_sukun ✅

- KEY_Arabic_superscript_alef ✅

- KEY_Arabic_switch ✅

- KEY_Arabic_tah ✅

- KEY_Arabic_tatweel ✅

- KEY_Arabic_tcheh ✅

- KEY_Arabic_teh ✅

- KEY_Arabic_tehmarbuta ✅

- KEY_Arabic_thal ✅

- KEY_Arabic_theh ✅

- KEY_Arabic_tteh ✅

- KEY_Arabic_veh ✅

- KEY_Arabic_waw ✅

- KEY_Arabic_yeh ✅

- KEY_Arabic_yeh_baree ✅

- KEY_Arabic_zah ✅

- KEY_Arabic_zain ✅

- KEY_Aring ✅

- KEY_Armenian_AT ✅

- KEY_Armenian_AYB ✅

- KEY_Armenian_BEN ✅

- KEY_Armenian_CHA ✅

- KEY_Armenian_DA ✅

- KEY_Armenian_DZA ✅

- KEY_Armenian_E ✅

- KEY_Armenian_FE ✅

- KEY_Armenian_GHAT ✅

- KEY_Armenian_GIM ✅

- KEY_Armenian_HI ✅

- KEY_Armenian_HO ✅

- KEY_Armenian_INI ✅

- KEY_Armenian_JE ✅

- KEY_Armenian_KE ✅

- KEY_Armenian_KEN ✅

- KEY_Armenian_KHE ✅

- KEY_Armenian_LYUN ✅

- KEY_Armenian_MEN ✅

- KEY_Armenian_NU ✅

- KEY_Armenian_O ✅

- KEY_Armenian_PE ✅

- KEY_Armenian_PYUR ✅

- KEY_Armenian_RA ✅

- KEY_Armenian_RE ✅

- KEY_Armenian_SE ✅

- KEY_Armenian_SHA ✅

- KEY_Armenian_TCHE ✅

- KEY_Armenian_TO ✅

- KEY_Armenian_TSA ✅

- KEY_Armenian_TSO ✅

- KEY_Armenian_TYUN ✅

- KEY_Armenian_VEV ✅

- KEY_Armenian_VO ✅

- KEY_Armenian_VYUN ✅

- KEY_Armenian_YECH ✅

- KEY_Armenian_ZA ✅

- KEY_Armenian_ZHE ✅

- KEY_Armenian_accent ✅

- KEY_Armenian_amanak ✅

- KEY_Armenian_apostrophe ✅

- KEY_Armenian_at ✅

- KEY_Armenian_ayb ✅

- KEY_Armenian_ben ✅

- KEY_Armenian_but ✅

- KEY_Armenian_cha ✅

- KEY_Armenian_da ✅

- KEY_Armenian_dza ✅

- KEY_Armenian_e ✅

- KEY_Armenian_exclam ✅

- KEY_Armenian_fe ✅

- KEY_Armenian_full_stop ✅

- KEY_Armenian_ghat ✅

- KEY_Armenian_gim ✅

- KEY_Armenian_hi ✅

- KEY_Armenian_ho ✅

- KEY_Armenian_hyphen ✅

- KEY_Armenian_ini ✅

- KEY_Armenian_je ✅

- KEY_Armenian_ke ✅

- KEY_Armenian_ken ✅

- KEY_Armenian_khe ✅

- KEY_Armenian_ligature_ew ✅

- KEY_Armenian_lyun ✅

- KEY_Armenian_men ✅

- KEY_Armenian_nu ✅

- KEY_Armenian_o ✅

- KEY_Armenian_paruyk ✅

- KEY_Armenian_pe ✅

- KEY_Armenian_pyur ✅

- KEY_Armenian_question ✅

- KEY_Armenian_ra ✅

- KEY_Armenian_re ✅

- KEY_Armenian_se ✅

- KEY_Armenian_separation_mark ✅

- KEY_Armenian_sha ✅

- KEY_Armenian_shesht ✅

- KEY_Armenian_tche ✅

- KEY_Armenian_to ✅

- KEY_Armenian_tsa ✅

- KEY_Armenian_tso ✅

- KEY_Armenian_tyun ✅

- KEY_Armenian_verjaket ✅

- KEY_Armenian_vev ✅

- KEY_Armenian_vo ✅

- KEY_Armenian_vyun ✅

- KEY_Armenian_yech ✅

- KEY_Armenian_yentamna ✅

- KEY_Armenian_za ✅

- KEY_Armenian_zhe ✅

- KEY_Atilde ✅

- KEY_AudibleBell_Enable ✅

- KEY_AudioCycleTrack ✅

- KEY_AudioForward ✅

- KEY_AudioLowerVolume ✅

- KEY_AudioMedia ✅

- KEY_AudioMicMute ✅

- KEY_AudioMute ✅

- KEY_AudioNext ✅

- KEY_AudioPause ✅

- KEY_AudioPlay ✅

- KEY_AudioPreset ✅

- KEY_AudioPrev ✅

- KEY_AudioRaiseVolume ✅

- KEY_AudioRandomPlay ✅

- KEY_AudioRecord ✅

- KEY_AudioRepeat ✅

- KEY_AudioRewind ✅

- KEY_AudioStop ✅

- KEY_Away ✅

- KEY_B ✅

- KEY_Babovedot ✅

- KEY_Back ✅

- KEY_BackForward ✅

- KEY_BackSpace ✅

- KEY_Battery ✅

- KEY_Begin ✅

- KEY_Blue ✅

- KEY_Bluetooth ✅

- KEY_Book ✅

- KEY_BounceKeys_Enable ✅

- KEY_Break ✅

- KEY_BrightnessAdjust ✅

- KEY_Byelorussian_SHORTU ✅

- KEY_Byelorussian_shortu ✅

- KEY_C ✅

- KEY_CD ✅

- KEY_CH ✅

- KEY_C_H ✅

- KEY_C_h ✅

- KEY_Cabovedot ✅

- KEY_Cacute ✅

- KEY_Calculator ✅

- KEY_Calendar ✅

- KEY_Cancel ✅

- KEY_Caps_Lock ✅

- KEY_Ccaron ✅

- KEY_Ccedilla ✅

- KEY_Ccircumflex ✅

- KEY_Ch ✅

- KEY_Clear ✅

- KEY_ClearGrab ✅

- KEY_Close ✅

- KEY_Codeinput ✅

- KEY_ColonSign ✅

- KEY_Community ✅

- KEY_ContrastAdjust ✅

- KEY_Control_L ✅

- KEY_Control_R ✅

- KEY_Copy ✅

- KEY_CruzeiroSign ✅

- KEY_Cut ✅

- KEY_CycleAngle ✅

- KEY_Cyrillic_A ✅

- KEY_Cyrillic_BE ✅

- KEY_Cyrillic_CHE ✅

- KEY_Cyrillic_CHE_descender ✅

- KEY_Cyrillic_CHE_vertstroke ✅

- KEY_Cyrillic_DE ✅

- KEY_Cyrillic_DZHE ✅

- KEY_Cyrillic_E ✅

- KEY_Cyrillic_EF ✅

- KEY_Cyrillic_EL ✅

- KEY_Cyrillic_EM ✅

- KEY_Cyrillic_EN ✅

- KEY_Cyrillic_EN_descender ✅

- KEY_Cyrillic_ER ✅

- KEY_Cyrillic_ES ✅

- KEY_Cyrillic_GHE ✅

- KEY_Cyrillic_GHE_bar ✅

- KEY_Cyrillic_HA ✅

- KEY_Cyrillic_HARDSIGN ✅

- KEY_Cyrillic_HA_descender ✅

- KEY_Cyrillic_I ✅

- KEY_Cyrillic_IE ✅

- KEY_Cyrillic_IO ✅

- KEY_Cyrillic_I_macron ✅

- KEY_Cyrillic_JE ✅

- KEY_Cyrillic_KA ✅

- KEY_Cyrillic_KA_descender ✅

- KEY_Cyrillic_KA_vertstroke ✅

- KEY_Cyrillic_LJE ✅

- KEY_Cyrillic_NJE ✅

- KEY_Cyrillic_O ✅

- KEY_Cyrillic_O_bar ✅

- KEY_Cyrillic_PE ✅

- KEY_Cyrillic_SCHWA ✅

- KEY_Cyrillic_SHA ✅

- KEY_Cyrillic_SHCHA ✅

- KEY_Cyrillic_SHHA ✅

- KEY_Cyrillic_SHORTI ✅

- KEY_Cyrillic_SOFTSIGN ✅

- KEY_Cyrillic_TE ✅

- KEY_Cyrillic_TSE ✅

- KEY_Cyrillic_U ✅

- KEY_Cyrillic_U_macron ✅

- KEY_Cyrillic_U_straight ✅

- KEY_Cyrillic_U_straight_bar ✅

- KEY_Cyrillic_VE ✅

- KEY_Cyrillic_YA ✅

- KEY_Cyrillic_YERU ✅

- KEY_Cyrillic_YU ✅

- KEY_Cyrillic_ZE ✅

- KEY_Cyrillic_ZHE ✅

- KEY_Cyrillic_ZHE_descender ✅

- KEY_Cyrillic_a ✅

- KEY_Cyrillic_be ✅

- KEY_Cyrillic_che ✅

- KEY_Cyrillic_che_descender ✅

- KEY_Cyrillic_che_vertstroke ✅

- KEY_Cyrillic_de ✅

- KEY_Cyrillic_dzhe ✅

- KEY_Cyrillic_e ✅

- KEY_Cyrillic_ef ✅

- KEY_Cyrillic_el ✅

- KEY_Cyrillic_em ✅

- KEY_Cyrillic_en ✅

- KEY_Cyrillic_en_descender ✅

- KEY_Cyrillic_er ✅

- KEY_Cyrillic_es ✅

- KEY_Cyrillic_ghe ✅

- KEY_Cyrillic_ghe_bar ✅

- KEY_Cyrillic_ha ✅

- KEY_Cyrillic_ha_descender ✅

- KEY_Cyrillic_hardsign ✅

- KEY_Cyrillic_i ✅

- KEY_Cyrillic_i_macron ✅

- KEY_Cyrillic_ie ✅

- KEY_Cyrillic_io ✅

- KEY_Cyrillic_je ✅

- KEY_Cyrillic_ka ✅

- KEY_Cyrillic_ka_descender ✅

- KEY_Cyrillic_ka_vertstroke ✅

- KEY_Cyrillic_lje ✅

- KEY_Cyrillic_nje ✅

- KEY_Cyrillic_o ✅

- KEY_Cyrillic_o_bar ✅

- KEY_Cyrillic_pe ✅

- KEY_Cyrillic_schwa ✅

- KEY_Cyrillic_sha ✅

- KEY_Cyrillic_shcha ✅

- KEY_Cyrillic_shha ✅

- KEY_Cyrillic_shorti ✅

- KEY_Cyrillic_softsign ✅

- KEY_Cyrillic_te ✅

- KEY_Cyrillic_tse ✅

- KEY_Cyrillic_u ✅

- KEY_Cyrillic_u_macron ✅

- KEY_Cyrillic_u_straight ✅

- KEY_Cyrillic_u_straight_bar ✅

- KEY_Cyrillic_ve ✅

- KEY_Cyrillic_ya ✅

- KEY_Cyrillic_yeru ✅

- KEY_Cyrillic_yu ✅

- KEY_Cyrillic_ze ✅

- KEY_Cyrillic_zhe ✅

- KEY_Cyrillic_zhe_descender ✅

- KEY_D ✅

- KEY_DOS ✅

- KEY_Dabovedot ✅

- KEY_Dcaron ✅

- KEY_Delete ✅

- KEY_Display ✅

- KEY_Documents ✅

- KEY_DongSign ✅

- KEY_Down ✅

- KEY_Dstroke ✅

- KEY_E ✅

- KEY_ENG ✅

- KEY_ETH ✅

- KEY_EZH ✅

- KEY_Eabovedot ✅

- KEY_Eacute ✅

- KEY_Ebelowdot ✅

- KEY_Ecaron ✅

- KEY_Ecircumflex ✅

- KEY_Ecircumflexacute ✅

- KEY_Ecircumflexbelowdot ✅

- KEY_Ecircumflexgrave ✅

- KEY_Ecircumflexhook ✅

- KEY_Ecircumflextilde ✅

- KEY_EcuSign ✅

- KEY_Ediaeresis ✅

- KEY_Egrave ✅

- KEY_Ehook ✅

- KEY_Eisu_Shift ✅

- KEY_Eisu_toggle ✅

- KEY_Eject ✅

- KEY_Emacron ✅

- KEY_End ✅

- KEY_Eogonek ✅

- KEY_Escape ✅

- KEY_Eth ✅

- KEY_Etilde ✅

- KEY_EuroSign ✅

- KEY_Excel ✅

- KEY_Execute ✅

- KEY_Explorer ✅

- KEY_F ✅

- KEY_F1 ✅

- KEY_F10 ✅

- KEY_F11 ✅

- KEY_F12 ✅

- KEY_F13 ✅

- KEY_F14 ✅

- KEY_F15 ✅

- KEY_F16 ✅

- KEY_F17 ✅

- KEY_F18 ✅

- KEY_F19 ✅

- KEY_F2 ✅

- KEY_F20 ✅

- KEY_F21 ✅

- KEY_F22 ✅

- KEY_F23 ✅

- KEY_F24 ✅

- KEY_F25 ✅

- KEY_F26 ✅

- KEY_F27 ✅

- KEY_F28 ✅

- KEY_F29 ✅

- KEY_F3 ✅

- KEY_F30 ✅

- KEY_F31 ✅

- KEY_F32 ✅

- KEY_F33 ✅

- KEY_F34 ✅

- KEY_F35 ✅

- KEY_F4 ✅

- KEY_F5 ✅

- KEY_F6 ✅

- KEY_F7 ✅

- KEY_F8 ✅

- KEY_F9 ✅

- KEY_FFrancSign ✅

- KEY_Fabovedot ✅

- KEY_Farsi_0 ✅

- KEY_Farsi_1 ✅

- KEY_Farsi_2 ✅

- KEY_Farsi_3 ✅

- KEY_Farsi_4 ✅

- KEY_Farsi_5 ✅

- KEY_Farsi_6 ✅

- KEY_Farsi_7 ✅

- KEY_Farsi_8 ✅

- KEY_Farsi_9 ✅

- KEY_Farsi_yeh ✅

- KEY_Favorites ✅

- KEY_Finance ✅

- KEY_Find ✅

- KEY_First_Virtual_Screen ✅

- KEY_Forward ✅

- KEY_FrameBack ✅

- KEY_FrameForward ✅

- KEY_G ✅

- KEY_Gabovedot ✅

- KEY_Game ✅

- KEY_Gbreve ✅

- KEY_Gcaron ✅

- KEY_Gcedilla ✅

- KEY_Gcircumflex ✅

- KEY_Georgian_an ✅

- KEY_Georgian_ban ✅

- KEY_Georgian_can ✅

- KEY_Georgian_char ✅

- KEY_Georgian_chin ✅

- KEY_Georgian_cil ✅

- KEY_Georgian_don ✅

- KEY_Georgian_en ✅

- KEY_Georgian_fi ✅

- KEY_Georgian_gan ✅

- KEY_Georgian_ghan ✅

- KEY_Georgian_hae ✅

- KEY_Georgian_har ✅

- KEY_Georgian_he ✅

- KEY_Georgian_hie ✅

- KEY_Georgian_hoe ✅

- KEY_Georgian_in ✅

- KEY_Georgian_jhan ✅

- KEY_Georgian_jil ✅

- KEY_Georgian_kan ✅

- KEY_Georgian_khar ✅

- KEY_Georgian_las ✅

- KEY_Georgian_man ✅

- KEY_Georgian_nar ✅

- KEY_Georgian_on ✅

- KEY_Georgian_par ✅

- KEY_Georgian_phar ✅

- KEY_Georgian_qar ✅

- KEY_Georgian_rae ✅

- KEY_Georgian_san ✅

- KEY_Georgian_shin ✅

- KEY_Georgian_tan ✅

- KEY_Georgian_tar ✅

- KEY_Georgian_un ✅

- KEY_Georgian_vin ✅

- KEY_Georgian_we ✅

- KEY_Georgian_xan ✅

- KEY_Georgian_zen ✅

- KEY_Georgian_zhar ✅

- KEY_Go ✅

- KEY_Greek_ALPHA ✅

- KEY_Greek_ALPHAaccent ✅

- KEY_Greek_BETA ✅

- KEY_Greek_CHI ✅

- KEY_Greek_DELTA ✅

- KEY_Greek_EPSILON ✅

- KEY_Greek_EPSILONaccent ✅

- KEY_Greek_ETA ✅

- KEY_Greek_ETAaccent ✅

- KEY_Greek_GAMMA ✅

- KEY_Greek_IOTA ✅

- KEY_Greek_IOTAaccent ✅

- KEY_Greek_IOTAdiaeresis ✅

- KEY_Greek_IOTAdieresis ✅

- KEY_Greek_KAPPA ✅

- KEY_Greek_LAMBDA ✅

- KEY_Greek_LAMDA ✅

- KEY_Greek_MU ✅

- KEY_Greek_NU ✅

- KEY_Greek_OMEGA ✅

- KEY_Greek_OMEGAaccent ✅

- KEY_Greek_OMICRON ✅

- KEY_Greek_OMICRONaccent ✅

- KEY_Greek_PHI ✅

- KEY_Greek_PI ✅

- KEY_Greek_PSI ✅

- KEY_Greek_RHO ✅

- KEY_Greek_SIGMA ✅

- KEY_Greek_TAU ✅

- KEY_Greek_THETA ✅

- KEY_Greek_UPSILON ✅

- KEY_Greek_UPSILONaccent ✅

- KEY_Greek_UPSILONdieresis ✅

- KEY_Greek_XI ✅

- KEY_Greek_ZETA ✅

- KEY_Greek_accentdieresis ✅

- KEY_Greek_alpha ✅

- KEY_Greek_alphaaccent ✅

- KEY_Greek_beta ✅

- KEY_Greek_chi ✅

- KEY_Greek_delta ✅

- KEY_Greek_epsilon ✅

- KEY_Greek_epsilonaccent ✅

- KEY_Greek_eta ✅

- KEY_Greek_etaaccent ✅

- KEY_Greek_finalsmallsigma ✅

- KEY_Greek_gamma ✅

- KEY_Greek_horizbar ✅

- KEY_Greek_iota ✅

- KEY_Greek_iotaaccent ✅

- KEY_Greek_iotaaccentdieresis ✅

- KEY_Greek_iotadieresis ✅

- KEY_Greek_kappa ✅

- KEY_Greek_lambda ✅

- KEY_Greek_lamda ✅

- KEY_Greek_mu ✅

- KEY_Greek_nu ✅

- KEY_Greek_omega ✅

- KEY_Greek_omegaaccent ✅

- KEY_Greek_omicron ✅

- KEY_Greek_omicronaccent ✅

- KEY_Greek_phi ✅

- KEY_Greek_pi ✅

- KEY_Greek_psi ✅

- KEY_Greek_rho ✅

- KEY_Greek_sigma ✅

- KEY_Greek_switch ✅

- KEY_Greek_tau ✅

- KEY_Greek_theta ✅

- KEY_Greek_upsilon ✅

- KEY_Greek_upsilonaccent ✅

- KEY_Greek_upsilonaccentdieresis ✅

- KEY_Greek_upsilondieresis ✅

- KEY_Greek_xi ✅

- KEY_Greek_zeta ✅

- KEY_Green ✅

- KEY_H ✅

- KEY_Hangul ✅

- KEY_Hangul_A ✅

- KEY_Hangul_AE ✅

- KEY_Hangul_AraeA ✅

- KEY_Hangul_AraeAE ✅

- KEY_Hangul_Banja ✅

- KEY_Hangul_Cieuc ✅

- KEY_Hangul_Codeinput ✅

- KEY_Hangul_Dikeud ✅

- KEY_Hangul_E ✅

- KEY_Hangul_EO ✅

- KEY_Hangul_EU ✅

- KEY_Hangul_End ✅

- KEY_Hangul_Hanja ✅

- KEY_Hangul_Hieuh ✅

- KEY_Hangul_I ✅

- KEY_Hangul_Ieung ✅

- KEY_Hangul_J_Cieuc ✅

- KEY_Hangul_J_Dikeud ✅

- KEY_Hangul_J_Hieuh ✅

- KEY_Hangul_J_Ieung ✅

- KEY_Hangul_J_Jieuj ✅

- KEY_Hangul_J_Khieuq ✅

- KEY_Hangul_J_Kiyeog ✅

- KEY_Hangul_J_KiyeogSios ✅

- KEY_Hangul_J_KkogjiDalrinIeung ✅

- KEY_Hangul_J_Mieum ✅

- KEY_Hangul_J_Nieun ✅

- KEY_Hangul_J_NieunHieuh ✅

- KEY_Hangul_J_NieunJieuj ✅

- KEY_Hangul_J_PanSios ✅

- KEY_Hangul_J_Phieuf ✅

- KEY_Hangul_J_Pieub ✅

- KEY_Hangul_J_PieubSios ✅

- KEY_Hangul_J_Rieul ✅

- KEY_Hangul_J_RieulHieuh ✅

- KEY_Hangul_J_RieulKiyeog ✅

- KEY_Hangul_J_RieulMieum ✅

- KEY_Hangul_J_RieulPhieuf ✅

- KEY_Hangul_J_RieulPieub ✅

- KEY_Hangul_J_RieulSios ✅

- KEY_Hangul_J_RieulTieut ✅

- KEY_Hangul_J_Sios ✅

- KEY_Hangul_J_SsangKiyeog ✅

- KEY_Hangul_J_SsangSios ✅

- KEY_Hangul_J_Tieut ✅

- KEY_Hangul_J_YeorinHieuh ✅

- KEY_Hangul_Jamo ✅

- KEY_Hangul_Jeonja ✅

- KEY_Hangul_Jieuj ✅

- KEY_Hangul_Khieuq ✅

- KEY_Hangul_Kiyeog ✅

- KEY_Hangul_KiyeogSios ✅

- KEY_Hangul_KkogjiDalrinIeung ✅

- KEY_Hangul_Mieum ✅

- KEY_Hangul_MultipleCandidate ✅

- KEY_Hangul_Nieun ✅

- KEY_Hangul_NieunHieuh ✅

- KEY_Hangul_NieunJieuj ✅

- KEY_Hangul_O ✅

- KEY_Hangul_OE ✅

- KEY_Hangul_PanSios ✅

- KEY_Hangul_Phieuf ✅

- KEY_Hangul_Pieub ✅

- KEY_Hangul_PieubSios ✅

- KEY_Hangul_PostHanja ✅

- KEY_Hangul_PreHanja ✅

- KEY_Hangul_PreviousCandidate ✅

- KEY_Hangul_Rieul ✅

- KEY_Hangul_RieulHieuh ✅

- KEY_Hangul_RieulKiyeog ✅

- KEY_Hangul_RieulMieum ✅

- KEY_Hangul_RieulPhieuf ✅

- KEY_Hangul_RieulPieub ✅

- KEY_Hangul_RieulSios ✅

- KEY_Hangul_RieulTieut ✅

- KEY_Hangul_RieulYeorinHieuh ✅

- KEY_Hangul_Romaja ✅

- KEY_Hangul_SingleCandidate ✅

- KEY_Hangul_Sios ✅

- KEY_Hangul_Special ✅

- KEY_Hangul_SsangDikeud ✅

- KEY_Hangul_SsangJieuj ✅

- KEY_Hangul_SsangKiyeog ✅

- KEY_Hangul_SsangPieub ✅

- KEY_Hangul_SsangSios ✅

- KEY_Hangul_Start ✅

- KEY_Hangul_SunkyeongeumMieum ✅

- KEY_Hangul_SunkyeongeumPhieuf ✅

- KEY_Hangul_SunkyeongeumPieub ✅

- KEY_Hangul_Tieut ✅

- KEY_Hangul_U ✅

- KEY_Hangul_WA ✅

- KEY_Hangul_WAE ✅

- KEY_Hangul_WE ✅

- KEY_Hangul_WEO ✅

- KEY_Hangul_WI ✅

- KEY_Hangul_YA ✅

- KEY_Hangul_YAE ✅

- KEY_Hangul_YE ✅

- KEY_Hangul_YEO ✅

- KEY_Hangul_YI ✅

- KEY_Hangul_YO ✅

- KEY_Hangul_YU ✅

- KEY_Hangul_YeorinHieuh ✅

- KEY_Hangul_switch ✅

- KEY_Hankaku ✅

- KEY_Hcircumflex ✅

- KEY_Hebrew_switch ✅

- KEY_Help ✅

- KEY_Henkan ✅

- KEY_Henkan_Mode ✅

- KEY_Hibernate ✅

- KEY_Hiragana ✅

- KEY_Hiragana_Katakana ✅

- KEY_History ✅

- KEY_Home ✅

- KEY_HomePage ✅

- KEY_HotLinks ✅

- KEY_Hstroke ✅

- KEY_Hyper_L ✅

- KEY_Hyper_R ✅

- KEY_I ✅

- KEY_ISO_Center_Object ✅

- KEY_ISO_Continuous_Underline ✅

- KEY_ISO_Discontinuous_Underline ✅

- KEY_ISO_Emphasize ✅

- KEY_ISO_Enter ✅

- KEY_ISO_Fast_Cursor_Down ✅

- KEY_ISO_Fast_Cursor_Left ✅

- KEY_ISO_Fast_Cursor_Right ✅

- KEY_ISO_Fast_Cursor_Up ✅

- KEY_ISO_First_Group ✅

- KEY_ISO_First_Group_Lock ✅

- KEY_ISO_Group_Latch ✅

- KEY_ISO_Group_Lock ✅

- KEY_ISO_Group_Shift ✅

- KEY_ISO_Last_Group ✅

- KEY_ISO_Last_Group_Lock ✅

- KEY_ISO_Left_Tab ✅

- KEY_ISO_Level2_Latch ✅

- KEY_ISO_Level3_Latch ✅

- KEY_ISO_Level3_Lock ✅

- KEY_ISO_Level3_Shift ✅

- KEY_ISO_Level5_Latch ✅

- KEY_ISO_Level5_Lock ✅

- KEY_ISO_Level5_Shift ✅

- KEY_ISO_Lock ✅

- KEY_ISO_Move_Line_Down ✅

- KEY_ISO_Move_Line_Up ✅

- KEY_ISO_Next_Group ✅

- KEY_ISO_Next_Group_Lock ✅

- KEY_ISO_Partial_Line_Down ✅

- KEY_ISO_Partial_Line_Up ✅

- KEY_ISO_Partial_Space_Left ✅

- KEY_ISO_Partial_Space_Right ✅

- KEY_ISO_Prev_Group ✅

- KEY_ISO_Prev_Group_Lock ✅

- KEY_ISO_Release_Both_Margins ✅

- KEY_ISO_Release_Margin_Left ✅

- KEY_ISO_Release_Margin_Right ✅

- KEY_ISO_Set_Margin_Left ✅

- KEY_ISO_Set_Margin_Right ✅

- KEY_Iabovedot ✅

- KEY_Iacute ✅

- KEY_Ibelowdot ✅

- KEY_Ibreve ✅

- KEY_Icircumflex ✅

- KEY_Idiaeresis ✅

- KEY_Igrave ✅

- KEY_Ihook ✅

- KEY_Imacron ✅

- KEY_Insert ✅

- KEY_Iogonek ✅

- KEY_Itilde ✅

- KEY_J ✅

- KEY_Jcircumflex ✅

- KEY_K ✅

- KEY_KP_0 ✅

- KEY_KP_1 ✅

- KEY_KP_2 ✅

- KEY_KP_3 ✅

- KEY_KP_4 ✅

- KEY_KP_5 ✅

- KEY_KP_6 ✅

- KEY_KP_7 ✅

- KEY_KP_8 ✅

- KEY_KP_9 ✅

- KEY_KP_Add ✅

- KEY_KP_Begin ✅

- KEY_KP_Decimal ✅

- KEY_KP_Delete ✅

- KEY_KP_Divide ✅

- KEY_KP_Down ✅

- KEY_KP_End ✅

- KEY_KP_Enter ✅

- KEY_KP_Equal ✅

- KEY_KP_F1 ✅

- KEY_KP_F2 ✅

- KEY_KP_F3 ✅

- KEY_KP_F4 ✅

- KEY_KP_Home ✅

- KEY_KP_Insert ✅

- KEY_KP_Left ✅

- KEY_KP_Multiply ✅

- KEY_KP_Next ✅

- KEY_KP_Page_Down ✅

- KEY_KP_Page_Up ✅

- KEY_KP_Prior ✅

- KEY_KP_Right ✅

- KEY_KP_Separator ✅

- KEY_KP_Space ✅

- KEY_KP_Subtract ✅

- KEY_KP_Tab ✅

- KEY_KP_Up ✅

- KEY_Kana_Lock ✅

- KEY_Kana_Shift ✅

- KEY_Kanji ✅

- KEY_Kanji_Bangou ✅

- KEY_Katakana ✅

- KEY_KbdBrightnessDown ✅

- KEY_KbdBrightnessUp ✅

- KEY_KbdLightOnOff ✅

- KEY_Kcedilla ✅

- KEY_Keyboard ✅

- KEY_Korean_Won ✅

- KEY_L ✅

- KEY_L1 ✅

- KEY_L10 ✅

- KEY_L2 ✅

- KEY_L3 ✅

- KEY_L4 ✅

- KEY_L5 ✅

- KEY_L6 ✅

- KEY_L7 ✅

- KEY_L8 ✅

- KEY_L9 ✅

- KEY_Lacute ✅

- KEY_Last_Virtual_Screen ✅

- KEY_Launch0 ✅

- KEY_Launch1 ✅

- KEY_Launch2 ✅

- KEY_Launch3 ✅

- KEY_Launch4 ✅

- KEY_Launch5 ✅

- KEY_Launch6 ✅

- KEY_Launch7 ✅

- KEY_Launch8 ✅

- KEY_Launch9 ✅

- KEY_LaunchA ✅

- KEY_LaunchB ✅

- KEY_LaunchC ✅

- KEY_LaunchD ✅

- KEY_LaunchE ✅

- KEY_LaunchF ✅

- KEY_Lbelowdot ✅

- KEY_Lcaron ✅

- KEY_Lcedilla ✅

- KEY_Left ✅

- KEY_LightBulb ✅

- KEY_Linefeed ✅

- KEY_LiraSign ✅

- KEY_LogGrabInfo ✅

- KEY_LogOff ✅

- KEY_LogWindowTree ✅

- KEY_Lstroke ✅

- KEY_M ✅

- KEY_Mabovedot ✅

- KEY_Macedonia_DSE ✅

- KEY_Macedonia_GJE ✅

- KEY_Macedonia_KJE ✅

- KEY_Macedonia_dse ✅

- KEY_Macedonia_gje ✅

- KEY_Macedonia_kje ✅

- KEY_Mae_Koho ✅

- KEY_Mail ✅

- KEY_MailForward ✅

- KEY_Market ✅

- KEY_Massyo ✅

- KEY_Meeting ✅

- KEY_Memo ✅

- KEY_Menu ✅

- KEY_MenuKB ✅

- KEY_MenuPB ✅

- KEY_Messenger ✅

- KEY_Meta_L ✅

- KEY_Meta_R ✅

- KEY_MillSign ✅

- KEY_ModeLock ✅

- KEY_Mode_switch ✅

- KEY_MonBrightnessDown ✅

- KEY_MonBrightnessUp ✅

- KEY_MouseKeys_Accel_Enable ✅

- KEY_MouseKeys_Enable ✅

- KEY_Muhenkan ✅

- KEY_Multi_key ✅

- KEY_MultipleCandidate ✅

- KEY_Music ✅

- KEY_MyComputer ✅

- KEY_MySites ✅

- KEY_N ✅

- KEY_Nacute ✅

- KEY_NairaSign ✅

- KEY_Ncaron ✅

- KEY_Ncedilla ✅

- KEY_New ✅

- KEY_NewSheqelSign ✅

- KEY_News ✅

- KEY_Next ✅

- KEY_Next_VMode ✅

- KEY_Next_Virtual_Screen ✅

- KEY_Ntilde ✅

- KEY_Num_Lock ✅

- KEY_O ✅

- KEY_OE ✅

- KEY_Oacute ✅

- KEY_Obarred ✅

- KEY_Obelowdot ✅

- KEY_Ocaron ✅

- KEY_Ocircumflex ✅

- KEY_Ocircumflexacute ✅

- KEY_Ocircumflexbelowdot ✅

- KEY_Ocircumflexgrave ✅

- KEY_Ocircumflexhook ✅

- KEY_Ocircumflextilde ✅

- KEY_Odiaeresis ✅

- KEY_Odoubleacute ✅

- KEY_OfficeHome ✅

- KEY_Ograve ✅

- KEY_Ohook ✅

- KEY_Ohorn ✅

- KEY_Ohornacute ✅

- KEY_Ohornbelowdot ✅

- KEY_Ohorngrave ✅

- KEY_Ohornhook ✅

- KEY_Ohorntilde ✅

- KEY_Omacron ✅

- KEY_Ooblique ✅

- KEY_Open ✅

- KEY_OpenURL ✅

- KEY_Option ✅

- KEY_Oslash ✅

- KEY_Otilde ✅

- KEY_Overlay1_Enable ✅

- KEY_Overlay2_Enable ✅

- KEY_P ✅

- KEY_Pabovedot ✅

- KEY_Page_Down ✅

- KEY_Page_Up ✅

- KEY_Paste ✅

- KEY_Pause ✅

- KEY_PesetaSign ✅

- KEY_Phone ✅

- KEY_Pictures ✅

- KEY_Pointer_Accelerate ✅

- KEY_Pointer_Button1 ✅

- KEY_Pointer_Button2 ✅

- KEY_Pointer_Button3 ✅

- KEY_Pointer_Button4 ✅

- KEY_Pointer_Button5 ✅

- KEY_Pointer_Button_Dflt ✅

- KEY_Pointer_DblClick1 ✅

- KEY_Pointer_DblClick2 ✅

- KEY_Pointer_DblClick3 ✅

- KEY_Pointer_DblClick4 ✅

- KEY_Pointer_DblClick5 ✅

- KEY_Pointer_DblClick_Dflt ✅

- KEY_Pointer_DfltBtnNext ✅

- KEY_Pointer_DfltBtnPrev ✅

- KEY_Pointer_Down ✅

- KEY_Pointer_DownLeft ✅

- KEY_Pointer_DownRight ✅

- KEY_Pointer_Drag1 ✅

- KEY_Pointer_Drag2 ✅

- KEY_Pointer_Drag3 ✅

- KEY_Pointer_Drag4 ✅

- KEY_Pointer_Drag5 ✅

- KEY_Pointer_Drag_Dflt ✅

- KEY_Pointer_EnableKeys ✅

- KEY_Pointer_Left ✅

- KEY_Pointer_Right ✅

- KEY_Pointer_Up ✅

- KEY_Pointer_UpLeft ✅

- KEY_Pointer_UpRight ✅

- KEY_PowerDown ✅

- KEY_PowerOff ✅

- KEY_Prev_VMode ✅

- KEY_Prev_Virtual_Screen ✅

- KEY_PreviousCandidate ✅

- KEY_Print ✅

- KEY_Prior ✅

- KEY_Q ✅

- KEY_R ✅

- KEY_R1 ✅

- KEY_R10 ✅

- KEY_R11 ✅

- KEY_R12 ✅

- KEY_R13 ✅

- KEY_R14 ✅

- KEY_R15 ✅

- KEY_R2 ✅

- KEY_R3 ✅

- KEY_R4 ✅

- KEY_R5 ✅

- KEY_R6 ✅

- KEY_R7 ✅

- KEY_R8 ✅

- KEY_R9 ✅

- KEY_RFKill ✅

- KEY_Racute ✅

- KEY_Rcaron ✅

- KEY_Rcedilla ✅

- KEY_Red ✅

- KEY_Redo ✅

- KEY_Refresh ✅

- KEY_Reload ✅

- KEY_RepeatKeys_Enable ✅

- KEY_Reply ✅

- KEY_Return ✅

- KEY_Right ✅

- KEY_RockerDown ✅

- KEY_RockerEnter ✅

- KEY_RockerUp ✅

- KEY_Romaji ✅

- KEY_RotateWindows ✅

- KEY_RotationKB ✅

- KEY_RotationPB ✅

- KEY_RupeeSign ✅

- KEY_S ✅

- KEY_SCHWA ✅

- KEY_Sabovedot ✅

- KEY_Sacute ✅

- KEY_Save ✅

- KEY_Scaron ✅

- KEY_Scedilla ✅

- KEY_Scircumflex ✅

- KEY_ScreenSaver ✅

- KEY_ScrollClick ✅

- KEY_ScrollDown ✅

- KEY_ScrollUp ✅

- KEY_Scroll_Lock ✅

- KEY_Search ✅

- KEY_Select ✅

- KEY_SelectButton ✅

- KEY_Send ✅

- KEY_Serbian_DJE ✅

- KEY_Serbian_DZE ✅

- KEY_Serbian_JE ✅

- KEY_Serbian_LJE ✅

- KEY_Serbian_NJE ✅

- KEY_Serbian_TSHE ✅

- KEY_Serbian_dje ✅

- KEY_Serbian_dze ✅

- KEY_Serbian_je ✅

- KEY_Serbian_lje ✅

- KEY_Serbian_nje ✅

- KEY_Serbian_tshe ✅

- KEY_Shift_L ✅

- KEY_Shift_Lock ✅

- KEY_Shift_R ✅

- KEY_Shop ✅

- KEY_SingleCandidate ✅

- KEY_Sinh_a ✅

- KEY_Sinh_aa ✅

- KEY_Sinh_aa2 ✅

- KEY_Sinh_ae ✅

- KEY_Sinh_ae2 ✅

- KEY_Sinh_aee ✅

- KEY_Sinh_aee2 ✅

- KEY_Sinh_ai ✅

- KEY_Sinh_ai2 ✅

- KEY_Sinh_al ✅

- KEY_Sinh_au ✅

- KEY_Sinh_au2 ✅

- KEY_Sinh_ba ✅

- KEY_Sinh_bha ✅

- KEY_Sinh_ca ✅

- KEY_Sinh_cha ✅

- KEY_Sinh_dda ✅

- KEY_Sinh_ddha ✅

- KEY_Sinh_dha ✅

- KEY_Sinh_dhha ✅

- KEY_Sinh_e ✅

- KEY_Sinh_e2 ✅

- KEY_Sinh_ee ✅

- KEY_Sinh_ee2 ✅

- KEY_Sinh_fa ✅

- KEY_Sinh_ga ✅

- KEY_Sinh_gha ✅

- KEY_Sinh_h2 ✅

- KEY_Sinh_ha ✅

- KEY_Sinh_i ✅

- KEY_Sinh_i2 ✅

- KEY_Sinh_ii ✅

- KEY_Sinh_ii2 ✅

- KEY_Sinh_ja ✅

- KEY_Sinh_jha ✅

- KEY_Sinh_jnya ✅

- KEY_Sinh_ka ✅

- KEY_Sinh_kha ✅

- KEY_Sinh_kunddaliya ✅

- KEY_Sinh_la ✅

- KEY_Sinh_lla ✅

- KEY_Sinh_lu ✅

- KEY_Sinh_lu2 ✅

- KEY_Sinh_luu ✅

- KEY_Sinh_luu2 ✅

- KEY_Sinh_ma ✅

- KEY_Sinh_mba ✅

- KEY_Sinh_na ✅

- KEY_Sinh_ndda ✅

- KEY_Sinh_ndha ✅

- KEY_Sinh_ng ✅

- KEY_Sinh_ng2 ✅

- KEY_Sinh_nga ✅

- KEY_Sinh_nja ✅

- KEY_Sinh_nna ✅

- KEY_Sinh_nya ✅

- KEY_Sinh_o ✅

- KEY_Sinh_o2 ✅

- KEY_Sinh_oo ✅

- KEY_Sinh_oo2 ✅

- KEY_Sinh_pa ✅

- KEY_Sinh_pha ✅

- KEY_Sinh_ra ✅

- KEY_Sinh_ri ✅

- KEY_Sinh_rii ✅

- KEY_Sinh_ru2 ✅

- KEY_Sinh_ruu2 ✅

- KEY_Sinh_sa ✅

- KEY_Sinh_sha ✅

- KEY_Sinh_ssha ✅

- KEY_Sinh_tha ✅

- KEY_Sinh_thha ✅

- KEY_Sinh_tta ✅

- KEY_Sinh_ttha ✅

- KEY_Sinh_u ✅

- KEY_Sinh_u2 ✅

- KEY_Sinh_uu ✅

- KEY_Sinh_uu2 ✅

- KEY_Sinh_va ✅

- KEY_Sinh_ya ✅

- KEY_Sleep ✅

- KEY_SlowKeys_Enable ✅

- KEY_Spell ✅

- KEY_SplitScreen ✅

- KEY_Standby ✅

- KEY_Start ✅

- KEY_StickyKeys_Enable ✅

- KEY_Stop ✅

- KEY_Subtitle ✅

- KEY_Super_L ✅

- KEY_Super_R ✅

- KEY_Support ✅

- KEY_Suspend ✅

- KEY_Switch_VT_1 ✅

- KEY_Switch_VT_10 ✅

- KEY_Switch_VT_11 ✅

- KEY_Switch_VT_12 ✅

- KEY_Switch_VT_2 ✅

- KEY_Switch_VT_3 ✅

- KEY_Switch_VT_4 ✅

- KEY_Switch_VT_5 ✅

- KEY_Switch_VT_6 ✅

- KEY_Switch_VT_7 ✅

- KEY_Switch_VT_8 ✅

- KEY_Switch_VT_9 ✅

- KEY_Sys_Req ✅

- KEY_T ✅

- KEY_THORN ✅

- KEY_Tab ✅

- KEY_Tabovedot ✅

- KEY_TaskPane ✅

- KEY_Tcaron ✅

- KEY_Tcedilla ✅

- KEY_Terminal ✅

- KEY_Terminate_Server ✅

- KEY_Thai_baht ✅

- KEY_Thai_bobaimai ✅

- KEY_Thai_chochan ✅

- KEY_Thai_chochang ✅

- KEY_Thai_choching ✅

- KEY_Thai_chochoe ✅

- KEY_Thai_dochada ✅

- KEY_Thai_dodek ✅

- KEY_Thai_fofa ✅

- KEY_Thai_fofan ✅

- KEY_Thai_hohip ✅

- KEY_Thai_honokhuk ✅

- KEY_Thai_khokhai ✅

- KEY_Thai_khokhon ✅

- KEY_Thai_khokhuat ✅

- KEY_Thai_khokhwai ✅

- KEY_Thai_khorakhang ✅

- KEY_Thai_kokai ✅

- KEY_Thai_lakkhangyao ✅

- KEY_Thai_lekchet ✅

- KEY_Thai_lekha ✅

- KEY_Thai_lekhok ✅

- KEY_Thai_lekkao ✅

- KEY_Thai_leknung ✅

- KEY_Thai_lekpaet ✅

- KEY_Thai_leksam ✅

- KEY_Thai_leksi ✅

- KEY_Thai_leksong ✅

- KEY_Thai_leksun ✅

- KEY_Thai_lochula ✅

- KEY_Thai_loling ✅

- KEY_Thai_lu ✅

- KEY_Thai_maichattawa ✅

- KEY_Thai_maiek ✅

- KEY_Thai_maihanakat ✅

- KEY_Thai_maihanakat_maitho ✅

- KEY_Thai_maitaikhu ✅

- KEY_Thai_maitho ✅

- KEY_Thai_maitri ✅

- KEY_Thai_maiyamok ✅

- KEY_Thai_moma ✅

- KEY_Thai_ngongu ✅

- KEY_Thai_nikhahit ✅

- KEY_Thai_nonen ✅

- KEY_Thai_nonu ✅

- KEY_Thai_oang ✅

- KEY_Thai_paiyannoi ✅

- KEY_Thai_phinthu ✅

- KEY_Thai_phophan ✅

- KEY_Thai_phophung ✅

- KEY_Thai_phosamphao ✅

- KEY_Thai_popla ✅

- KEY_Thai_rorua ✅

- KEY_Thai_ru ✅

- KEY_Thai_saraa ✅

- KEY_Thai_saraaa ✅

- KEY_Thai_saraae ✅

- KEY_Thai_saraaimaimalai ✅

- KEY_Thai_saraaimaimuan ✅

- KEY_Thai_saraam ✅

- KEY_Thai_sarae ✅

- KEY_Thai_sarai ✅

- KEY_Thai_saraii ✅

- KEY_Thai_sarao ✅

- KEY_Thai_sarau ✅

- KEY_Thai_saraue ✅

- KEY_Thai_sarauee ✅

- KEY_Thai_sarauu ✅

- KEY_Thai_sorusi ✅

- KEY_Thai_sosala ✅

- KEY_Thai_soso ✅

- KEY_Thai_sosua ✅

- KEY_Thai_thanthakhat ✅

- KEY_Thai_thonangmontho ✅

- KEY_Thai_thophuthao ✅

- KEY_Thai_thothahan ✅

- KEY_Thai_thothan ✅

- KEY_Thai_thothong ✅

- KEY_Thai_thothung ✅

- KEY_Thai_topatak ✅

- KEY_Thai_totao ✅

- KEY_Thai_wowaen ✅

- KEY_Thai_yoyak ✅

- KEY_Thai_yoying ✅

- KEY_Thorn ✅

- KEY_Time ✅

- KEY_ToDoList ✅

- KEY_Tools ✅

- KEY_TopMenu ✅

- KEY_TouchpadOff ✅

- KEY_TouchpadOn ✅

- KEY_TouchpadToggle ✅

- KEY_Touroku ✅

- KEY_Travel ✅

- KEY_Tslash ✅

- KEY_U ✅

- KEY_UWB ✅

- KEY_Uacute ✅

- KEY_Ubelowdot ✅

- KEY_Ubreve ✅

- KEY_Ucircumflex ✅

- KEY_Udiaeresis ✅

- KEY_Udoubleacute ✅

- KEY_Ugrave ✅

- KEY_Uhook ✅

- KEY_Uhorn ✅

- KEY_Uhornacute ✅

- KEY_Uhornbelowdot ✅

- KEY_Uhorngrave ✅

- KEY_Uhornhook ✅

- KEY_Uhorntilde ✅

- KEY_Ukrainian_GHE_WITH_UPTURN ✅

- KEY_Ukrainian_I ✅

- KEY_Ukrainian_IE ✅

- KEY_Ukrainian_YI ✅

- KEY_Ukrainian_ghe_with_upturn ✅

- KEY_Ukrainian_i ✅

- KEY_Ukrainian_ie ✅

- KEY_Ukrainian_yi ✅

- KEY_Ukranian_I ✅

- KEY_Ukranian_JE ✅

- KEY_Ukranian_YI ✅

- KEY_Ukranian_i ✅

- KEY_Ukranian_je ✅

- KEY_Ukranian_yi ✅

- KEY_Umacron ✅

- KEY_Undo ✅

- KEY_Ungrab ✅

- KEY_Uogonek ✅

- KEY_Up ✅

- KEY_Uring ✅

- KEY_User1KB ✅

- KEY_User2KB ✅

- KEY_UserPB ✅

- KEY_Utilde ✅

- KEY_V ✅

- KEY_VendorHome ✅

- KEY_Video ✅

- KEY_View ✅

- KEY_VoidSymbol ✅

- KEY_W ✅

- KEY_WLAN ✅

- KEY_WWAN ✅

- KEY_WWW ✅

- KEY_Wacute ✅

- KEY_WakeUp ✅

- KEY_Wcircumflex ✅

- KEY_Wdiaeresis ✅

- KEY_WebCam ✅

- KEY_Wgrave ✅

- KEY_WheelButton ✅

- KEY_WindowClear ✅

- KEY_WonSign ✅

- KEY_Word ✅

- KEY_X ✅

- KEY_Xabovedot ✅

- KEY_Xfer ✅

- KEY_Y ✅

- KEY_Yacute ✅

- KEY_Ybelowdot ✅

- KEY_Ycircumflex ✅

- KEY_Ydiaeresis ✅

- KEY_Yellow ✅

- KEY_Ygrave ✅

- KEY_Yhook ✅

- KEY_Ytilde ✅

- KEY_Z ✅

- KEY_Zabovedot ✅

- KEY_Zacute ✅

- KEY_Zcaron ✅

- KEY_Zen_Koho ✅

- KEY_Zenkaku ✅

- KEY_Zenkaku_Hankaku ✅

- KEY_ZoomIn ✅

- KEY_ZoomOut ✅

- KEY_Zstroke ✅

- KEY_a ✅

- KEY_aacute ✅

- KEY_abelowdot ✅

- KEY_abovedot ✅

- KEY_abreve ✅

- KEY_abreveacute ✅

- KEY_abrevebelowdot ✅

- KEY_abrevegrave ✅

- KEY_abrevehook ✅

- KEY_abrevetilde ✅

- KEY_acircumflex ✅

- KEY_acircumflexacute ✅

- KEY_acircumflexbelowdot ✅

- KEY_acircumflexgrave ✅

- KEY_acircumflexhook ✅

- KEY_acircumflextilde ✅

- KEY_acute ✅

- KEY_adiaeresis ✅

- KEY_ae ✅

- KEY_agrave ✅

- KEY_ahook ✅

- KEY_amacron ✅

- KEY_ampersand ✅

- KEY_aogonek ✅

- KEY_apostrophe ✅

- KEY_approxeq ✅

- KEY_approximate ✅

- KEY_aring ✅

- KEY_asciicircum ✅

- KEY_asciitilde ✅

- KEY_asterisk ✅

- KEY_at ✅

- KEY_atilde ✅

- KEY_b ✅

- KEY_babovedot ✅

- KEY_backslash ✅

- KEY_ballotcross ✅

- KEY_bar ✅

- KEY_because ✅

- KEY_blank ✅

- KEY_botintegral ✅

- KEY_botleftparens ✅

- KEY_botleftsqbracket ✅

- KEY_botleftsummation ✅

- KEY_botrightparens ✅

- KEY_botrightsqbracket ✅

- KEY_botrightsummation ✅

- KEY_bott ✅

- KEY_botvertsummationconnector ✅

- KEY_braceleft ✅

- KEY_braceright ✅

- KEY_bracketleft ✅

- KEY_bracketright ✅

- KEY_braille_blank ✅

- KEY_braille_dot_1 ✅

- KEY_braille_dot_10 ✅

- KEY_braille_dot_2 ✅

- KEY_braille_dot_3 ✅

- KEY_braille_dot_4 ✅

- KEY_braille_dot_5 ✅

- KEY_braille_dot_6 ✅

- KEY_braille_dot_7 ✅

- KEY_braille_dot_8 ✅

- KEY_braille_dot_9 ✅

- KEY_braille_dots_1 ✅

- KEY_braille_dots_12 ✅

- KEY_braille_dots_123 ✅

- KEY_braille_dots_1234 ✅

- KEY_braille_dots_12345 ✅

- KEY_braille_dots_123456 ✅

- KEY_braille_dots_1234567 ✅

- KEY_braille_dots_12345678 ✅

- KEY_braille_dots_1234568 ✅

- KEY_braille_dots_123457 ✅

- KEY_braille_dots_1234578 ✅

- KEY_braille_dots_123458 ✅

- KEY_braille_dots_12346 ✅

- KEY_braille_dots_123467 ✅

- KEY_braille_dots_1234678 ✅

- KEY_braille_dots_123468 ✅

- KEY_braille_dots_12347 ✅

- KEY_braille_dots_123478 ✅

- KEY_braille_dots_12348 ✅

- KEY_braille_dots_1235 ✅

- KEY_braille_dots_12356 ✅

- KEY_braille_dots_123567 ✅

- KEY_braille_dots_1235678 ✅

- KEY_braille_dots_123568 ✅

- KEY_braille_dots_12357 ✅

- KEY_braille_dots_123578 ✅

- KEY_braille_dots_12358 ✅

- KEY_braille_dots_1236 ✅

- KEY_braille_dots_12367 ✅

- KEY_braille_dots_123678 ✅

- KEY_braille_dots_12368 ✅

- KEY_braille_dots_1237 ✅

- KEY_braille_dots_12378 ✅

- KEY_braille_dots_1238 ✅

- KEY_braille_dots_124 ✅

- KEY_braille_dots_1245 ✅

- KEY_braille_dots_12456 ✅

- KEY_braille_dots_124567 ✅

- KEY_braille_dots_1245678 ✅

- KEY_braille_dots_124568 ✅

- KEY_braille_dots_12457 ✅

- KEY_braille_dots_124578 ✅

- KEY_braille_dots_12458 ✅

- KEY_braille_dots_1246 ✅

- KEY_braille_dots_12467 ✅

- KEY_braille_dots_124678 ✅

- KEY_braille_dots_12468 ✅

- KEY_braille_dots_1247 ✅

- KEY_braille_dots_12478 ✅

- KEY_braille_dots_1248 ✅

- KEY_braille_dots_125 ✅

- KEY_braille_dots_1256 ✅

- KEY_braille_dots_12567 ✅

- KEY_braille_dots_125678 ✅

- KEY_braille_dots_12568 ✅

- KEY_braille_dots_1257 ✅

- KEY_braille_dots_12578 ✅

- KEY_braille_dots_1258 ✅

- KEY_braille_dots_126 ✅

- KEY_braille_dots_1267 ✅

- KEY_braille_dots_12678 ✅

- KEY_braille_dots_1268 ✅

- KEY_braille_dots_127 ✅

- KEY_braille_dots_1278 ✅

- KEY_braille_dots_128 ✅

- KEY_braille_dots_13 ✅

- KEY_braille_dots_134 ✅

- KEY_braille_dots_1345 ✅

- KEY_braille_dots_13456 ✅

- KEY_braille_dots_134567 ✅

- KEY_braille_dots_1345678 ✅

- KEY_braille_dots_134568 ✅

- KEY_braille_dots_13457 ✅

- KEY_braille_dots_134578 ✅

- KEY_braille_dots_13458 ✅

- KEY_braille_dots_1346 ✅

- KEY_braille_dots_13467 ✅

- KEY_braille_dots_134678 ✅

- KEY_braille_dots_13468 ✅

- KEY_braille_dots_1347 ✅

- KEY_braille_dots_13478 ✅

- KEY_braille_dots_1348 ✅

- KEY_braille_dots_135 ✅

- KEY_braille_dots_1356 ✅

- KEY_braille_dots_13567 ✅

- KEY_braille_dots_135678 ✅

- KEY_braille_dots_13568 ✅

- KEY_braille_dots_1357 ✅

- KEY_braille_dots_13578 ✅

- KEY_braille_dots_1358 ✅

- KEY_braille_dots_136 ✅

- KEY_braille_dots_1367 ✅

- KEY_braille_dots_13678 ✅

- KEY_braille_dots_1368 ✅

- KEY_braille_dots_137 ✅

- KEY_braille_dots_1378 ✅

- KEY_braille_dots_138 ✅

- KEY_braille_dots_14 ✅

- KEY_braille_dots_145 ✅

- KEY_braille_dots_1456 ✅

- KEY_braille_dots_14567 ✅

- KEY_braille_dots_145678 ✅

- KEY_braille_dots_14568 ✅

- KEY_braille_dots_1457 ✅

- KEY_braille_dots_14578 ✅

- KEY_braille_dots_1458 ✅

- KEY_braille_dots_146 ✅

- KEY_braille_dots_1467 ✅

- KEY_braille_dots_14678 ✅

- KEY_braille_dots_1468 ✅

- KEY_braille_dots_147 ✅

- KEY_braille_dots_1478 ✅

- KEY_braille_dots_148 ✅

- KEY_braille_dots_15 ✅

- KEY_braille_dots_156 ✅

- KEY_braille_dots_1567 ✅

- KEY_braille_dots_15678 ✅

- KEY_braille_dots_1568 ✅

- KEY_braille_dots_157 ✅

- KEY_braille_dots_1578 ✅

- KEY_braille_dots_158 ✅

- KEY_braille_dots_16 ✅

- KEY_braille_dots_167 ✅

- KEY_braille_dots_1678 ✅

- KEY_braille_dots_168 ✅

- KEY_braille_dots_17 ✅

- KEY_braille_dots_178 ✅

- KEY_braille_dots_18 ✅

- KEY_braille_dots_2 ✅

- KEY_braille_dots_23 ✅

- KEY_braille_dots_234 ✅

- KEY_braille_dots_2345 ✅

- KEY_braille_dots_23456 ✅

- KEY_braille_dots_234567 ✅

- KEY_braille_dots_2345678 ✅

- KEY_braille_dots_234568 ✅

- KEY_braille_dots_23457 ✅

- KEY_braille_dots_234578 ✅

- KEY_braille_dots_23458 ✅

- KEY_braille_dots_2346 ✅

- KEY_braille_dots_23467 ✅

- KEY_braille_dots_234678 ✅

- KEY_braille_dots_23468 ✅

- KEY_braille_dots_2347 ✅

- KEY_braille_dots_23478 ✅

- KEY_braille_dots_2348 ✅

- KEY_braille_dots_235 ✅

- KEY_braille_dots_2356 ✅

- KEY_braille_dots_23567 ✅

- KEY_braille_dots_235678 ✅

- KEY_braille_dots_23568 ✅

- KEY_braille_dots_2357 ✅

- KEY_braille_dots_23578 ✅

- KEY_braille_dots_2358 ✅

- KEY_braille_dots_236 ✅

- KEY_braille_dots_2367 ✅

- KEY_braille_dots_23678 ✅

- KEY_braille_dots_2368 ✅

- KEY_braille_dots_237 ✅

- KEY_braille_dots_2378 ✅

- KEY_braille_dots_238 ✅

- KEY_braille_dots_24 ✅

- KEY_braille_dots_245 ✅

- KEY_braille_dots_2456 ✅

- KEY_braille_dots_24567 ✅

- KEY_braille_dots_245678 ✅

- KEY_braille_dots_24568 ✅

- KEY_braille_dots_2457 ✅

- KEY_braille_dots_24578 ✅

- KEY_braille_dots_2458 ✅

- KEY_braille_dots_246 ✅

- KEY_braille_dots_2467 ✅

- KEY_braille_dots_24678 ✅

- KEY_braille_dots_2468 ✅

- KEY_braille_dots_247 ✅

- KEY_braille_dots_2478 ✅

- KEY_braille_dots_248 ✅

- KEY_braille_dots_25 ✅

- KEY_braille_dots_256 ✅

- KEY_braille_dots_2567 ✅

- KEY_braille_dots_25678 ✅

- KEY_braille_dots_2568 ✅

- KEY_braille_dots_257 ✅

- KEY_braille_dots_2578 ✅

- KEY_braille_dots_258 ✅

- KEY_braille_dots_26 ✅

- KEY_braille_dots_267 ✅

- KEY_braille_dots_2678 ✅

- KEY_braille_dots_268 ✅

- KEY_braille_dots_27 ✅

- KEY_braille_dots_278 ✅

- KEY_braille_dots_28 ✅

- KEY_braille_dots_3 ✅

- KEY_braille_dots_34 ✅

- KEY_braille_dots_345 ✅

- KEY_braille_dots_3456 ✅

- KEY_braille_dots_34567 ✅

- KEY_braille_dots_345678 ✅

- KEY_braille_dots_34568 ✅

- KEY_braille_dots_3457 ✅

- KEY_braille_dots_34578 ✅

- KEY_braille_dots_3458 ✅

- KEY_braille_dots_346 ✅

- KEY_braille_dots_3467 ✅

- KEY_braille_dots_34678 ✅

- KEY_braille_dots_3468 ✅

- KEY_braille_dots_347 ✅

- KEY_braille_dots_3478 ✅

- KEY_braille_dots_348 ✅

- KEY_braille_dots_35 ✅

- KEY_braille_dots_356 ✅

- KEY_braille_dots_3567 ✅

- KEY_braille_dots_35678 ✅

- KEY_braille_dots_3568 ✅

- KEY_braille_dots_357 ✅

- KEY_braille_dots_3578 ✅

- KEY_braille_dots_358 ✅

- KEY_braille_dots_36 ✅

- KEY_braille_dots_367 ✅

- KEY_braille_dots_3678 ✅

- KEY_braille_dots_368 ✅

- KEY_braille_dots_37 ✅

- KEY_braille_dots_378 ✅

- KEY_braille_dots_38 ✅

- KEY_braille_dots_4 ✅

- KEY_braille_dots_45 ✅

- KEY_braille_dots_456 ✅

- KEY_braille_dots_4567 ✅

- KEY_braille_dots_45678 ✅

- KEY_braille_dots_4568 ✅

- KEY_braille_dots_457 ✅

- KEY_braille_dots_4578 ✅

- KEY_braille_dots_458 ✅

- KEY_braille_dots_46 ✅

- KEY_braille_dots_467 ✅

- KEY_braille_dots_4678 ✅

- KEY_braille_dots_468 ✅

- KEY_braille_dots_47 ✅

- KEY_braille_dots_478 ✅

- KEY_braille_dots_48 ✅

- KEY_braille_dots_5 ✅

- KEY_braille_dots_56 ✅

- KEY_braille_dots_567 ✅

- KEY_braille_dots_5678 ✅

- KEY_braille_dots_568 ✅

- KEY_braille_dots_57 ✅

- KEY_braille_dots_578 ✅

- KEY_braille_dots_58 ✅

- KEY_braille_dots_6 ✅

- KEY_braille_dots_67 ✅

- KEY_braille_dots_678 ✅

- KEY_braille_dots_68 ✅

- KEY_braille_dots_7 ✅

- KEY_braille_dots_78 ✅

- KEY_braille_dots_8 ✅

- KEY_breve ✅

- KEY_brokenbar ✅

- KEY_c ✅

- KEY_c_h ✅

- KEY_cabovedot ✅

- KEY_cacute ✅

- KEY_careof ✅

- KEY_caret ✅

- KEY_caron ✅

- KEY_ccaron ✅

- KEY_ccedilla ✅

- KEY_ccircumflex ✅

- KEY_cedilla ✅

- KEY_cent ✅

- KEY_ch ✅

- KEY_checkerboard ✅

- KEY_checkmark ✅

- KEY_circle ✅

- KEY_club ✅

- KEY_colon ✅

- KEY_comma ✅

- KEY_containsas ✅

- KEY_copyright ✅

- KEY_cr ✅

- KEY_crossinglines ✅

- KEY_cuberoot ✅

- KEY_currency ✅

- KEY_cursor ✅

- KEY_d ✅

- KEY_dabovedot ✅

- KEY_dagger ✅

- KEY_dcaron ✅

- KEY_dead_A ✅

- KEY_dead_E ✅

- KEY_dead_I ✅

- KEY_dead_O ✅

- KEY_dead_U ✅

- KEY_dead_a ✅

- KEY_dead_abovecomma ✅

- KEY_dead_abovedot ✅

- KEY_dead_abovereversedcomma ✅

- KEY_dead_abovering ✅

- KEY_dead_aboveverticalline ✅

- KEY_dead_acute ✅

- KEY_dead_belowbreve ✅

- KEY_dead_belowcircumflex ✅

- KEY_dead_belowcomma ✅

- KEY_dead_belowdiaeresis ✅

- KEY_dead_belowdot ✅

- KEY_dead_belowmacron ✅

- KEY_dead_belowring ✅

- KEY_dead_belowtilde ✅

- KEY_dead_belowverticalline ✅

- KEY_dead_breve ✅

- KEY_dead_capital_schwa ✅

- KEY_dead_caron ✅

- KEY_dead_cedilla ✅

- KEY_dead_circumflex ✅

- KEY_dead_currency ✅

- KEY_dead_dasia ✅

- KEY_dead_diaeresis ✅

- KEY_dead_doubleacute ✅

- KEY_dead_doublegrave ✅

- KEY_dead_e ✅

- KEY_dead_grave ✅

- KEY_dead_greek ✅

- KEY_dead_hook ✅

- KEY_dead_horn ✅

- KEY_dead_i ✅

- KEY_dead_invertedbreve ✅

- KEY_dead_iota ✅

- KEY_dead_longsolidusoverlay ✅

- KEY_dead_lowline ✅

- KEY_dead_macron ✅

- KEY_dead_o ✅

- KEY_dead_ogonek ✅

- KEY_dead_perispomeni ✅

- KEY_dead_psili ✅

- KEY_dead_semivoiced_sound ✅

- KEY_dead_small_schwa ✅

- KEY_dead_stroke ✅

- KEY_dead_tilde ✅

- KEY_dead_u ✅

- KEY_dead_voiced_sound ✅

- KEY_decimalpoint ✅

- KEY_degree ✅

- KEY_diaeresis ✅

- KEY_diamond ✅

- KEY_digitspace ✅

- KEY_dintegral ✅

- KEY_division ✅

- KEY_dollar ✅

- KEY_doubbaselinedot ✅

- KEY_doubleacute ✅

- KEY_doubledagger ✅

- KEY_doublelowquotemark ✅

- KEY_downarrow ✅

- KEY_downcaret ✅

- KEY_downshoe ✅

- KEY_downstile ✅

- KEY_downtack ✅

- KEY_dstroke ✅

- KEY_e ✅

- KEY_eabovedot ✅

- KEY_eacute ✅

- KEY_ebelowdot ✅

- KEY_ecaron ✅

- KEY_ecircumflex ✅

- KEY_ecircumflexacute ✅

- KEY_ecircumflexbelowdot ✅

- KEY_ecircumflexgrave ✅

- KEY_ecircumflexhook ✅

- KEY_ecircumflextilde ✅

- KEY_ediaeresis ✅

- KEY_egrave ✅

- KEY_ehook ✅

- KEY_eightsubscript ✅

- KEY_eightsuperior ✅

- KEY_elementof ✅

- KEY_ellipsis ✅

- KEY_em3space ✅

- KEY_em4space ✅

- KEY_emacron ✅

- KEY_emdash ✅

- KEY_emfilledcircle ✅

- KEY_emfilledrect ✅

- KEY_emopencircle ✅

- KEY_emopenrectangle ✅

- KEY_emptyset ✅

- KEY_emspace ✅

- KEY_endash ✅

- KEY_enfilledcircbullet ✅

- KEY_enfilledsqbullet ✅

- KEY_eng ✅

- KEY_enopencircbullet ✅

- KEY_enopensquarebullet ✅

- KEY_enspace ✅

- KEY_eogonek ✅

- KEY_equal ✅

- KEY_eth ✅

- KEY_etilde ✅

- KEY_exclam ✅

- KEY_exclamdown ✅

- KEY_ezh ✅

- KEY_f ✅

- KEY_fabovedot ✅

- KEY_femalesymbol ✅

- KEY_ff ✅

- KEY_figdash ✅

- KEY_filledlefttribullet ✅

- KEY_filledrectbullet ✅

- KEY_filledrighttribullet ✅

- KEY_filledtribulletdown ✅

- KEY_filledtribulletup ✅

- KEY_fiveeighths ✅

- KEY_fivesixths ✅

- KEY_fivesubscript ✅

- KEY_fivesuperior ✅

- KEY_fourfifths ✅

- KEY_foursubscript ✅

- KEY_foursuperior ✅

- KEY_fourthroot ✅

- KEY_function ✅

- KEY_g ✅

- KEY_gabovedot ✅

- KEY_gbreve ✅

- KEY_gcaron ✅

- KEY_gcedilla ✅

- KEY_gcircumflex ✅

- KEY_grave ✅

- KEY_greater ✅

- KEY_greaterthanequal ✅

- KEY_guillemotleft ✅

- KEY_guillemotright ✅

- KEY_h ✅

- KEY_hairspace ✅

- KEY_hcircumflex ✅

- KEY_heart ✅

- KEY_hebrew_aleph ✅

- KEY_hebrew_ayin ✅

- KEY_hebrew_bet ✅

- KEY_hebrew_beth ✅

- KEY_hebrew_chet ✅

- KEY_hebrew_dalet ✅

- KEY_hebrew_daleth ✅

- KEY_hebrew_doublelowline ✅

- KEY_hebrew_finalkaph ✅

- KEY_hebrew_finalmem ✅

- KEY_hebrew_finalnun ✅

- KEY_hebrew_finalpe ✅

- KEY_hebrew_finalzade ✅

- KEY_hebrew_finalzadi ✅

- KEY_hebrew_gimel ✅

- KEY_hebrew_gimmel ✅

- KEY_hebrew_he ✅

- KEY_hebrew_het ✅

- KEY_hebrew_kaph ✅

- KEY_hebrew_kuf ✅

- KEY_hebrew_lamed ✅

- KEY_hebrew_mem ✅

- KEY_hebrew_nun ✅

- KEY_hebrew_pe ✅

- KEY_hebrew_qoph ✅

- KEY_hebrew_resh ✅

- KEY_hebrew_samech ✅

- KEY_hebrew_samekh ✅

- KEY_hebrew_shin ✅

- KEY_hebrew_taf ✅

- KEY_hebrew_taw ✅

- KEY_hebrew_tet ✅

- KEY_hebrew_teth ✅

- KEY_hebrew_waw ✅

- KEY_hebrew_yod ✅

- KEY_hebrew_zade ✅

- KEY_hebrew_zadi ✅

- KEY_hebrew_zain ✅

- KEY_hebrew_zayin ✅

- KEY_hexagram ✅

- KEY_horizconnector ✅

- KEY_horizlinescan1 ✅

- KEY_horizlinescan3 ✅

- KEY_horizlinescan5 ✅

- KEY_horizlinescan7 ✅

- KEY_horizlinescan9 ✅

- KEY_hstroke ✅

- KEY_ht ✅

- KEY_hyphen ✅

- KEY_i ✅

- KEY_iTouch ✅

- KEY_iacute ✅

- KEY_ibelowdot ✅

- KEY_ibreve ✅

- KEY_icircumflex ✅

- KEY_identical ✅

- KEY_idiaeresis ✅

- KEY_idotless ✅

- KEY_ifonlyif ✅

- KEY_igrave ✅

- KEY_ihook ✅

- KEY_imacron ✅

- KEY_implies ✅

- KEY_includedin ✅

- KEY_includes ✅

- KEY_infinity ✅

- KEY_integral ✅

- KEY_intersection ✅

- KEY_iogonek ✅

- KEY_itilde ✅

- KEY_j ✅

- KEY_jcircumflex ✅

- KEY_jot ✅

- KEY_k ✅

- KEY_kana_A ✅

- KEY_kana_CHI ✅

- KEY_kana_E ✅

- KEY_kana_FU ✅

- KEY_kana_HA ✅

- KEY_kana_HE ✅

- KEY_kana_HI ✅

- KEY_kana_HO ✅

- KEY_kana_HU ✅

- KEY_kana_I ✅

- KEY_kana_KA ✅

- KEY_kana_KE ✅

- KEY_kana_KI ✅

- KEY_kana_KO ✅

- KEY_kana_KU ✅

- KEY_kana_MA ✅

- KEY_kana_ME ✅

- KEY_kana_MI ✅

- KEY_kana_MO ✅

- KEY_kana_MU ✅

- KEY_kana_N ✅

- KEY_kana_NA ✅

- KEY_kana_NE ✅

- KEY_kana_NI ✅

- KEY_kana_NO ✅

- KEY_kana_NU ✅

- KEY_kana_O ✅

- KEY_kana_RA ✅

- KEY_kana_RE ✅

- KEY_kana_RI ✅

- KEY_kana_RO ✅

- KEY_kana_RU ✅

- KEY_kana_SA ✅

- KEY_kana_SE ✅

- KEY_kana_SHI ✅

- KEY_kana_SO ✅

- KEY_kana_SU ✅

- KEY_kana_TA ✅

- KEY_kana_TE ✅

- KEY_kana_TI ✅

- KEY_kana_TO ✅

- KEY_kana_TSU ✅

- KEY_kana_TU ✅

- KEY_kana_U ✅

- KEY_kana_WA ✅

- KEY_kana_WO ✅

- KEY_kana_YA ✅

- KEY_kana_YO ✅

- KEY_kana_YU ✅

- KEY_kana_a ✅

- KEY_kana_closingbracket ✅

- KEY_kana_comma ✅

- KEY_kana_conjunctive ✅

- KEY_kana_e ✅

- KEY_kana_fullstop ✅

- KEY_kana_i ✅

- KEY_kana_middledot ✅

- KEY_kana_o ✅

- KEY_kana_openingbracket ✅

- KEY_kana_switch ✅

- KEY_kana_tsu ✅

- KEY_kana_tu ✅

- KEY_kana_u ✅

- KEY_kana_ya ✅

- KEY_kana_yo ✅

- KEY_kana_yu ✅

- KEY_kappa ✅

- KEY_kcedilla ✅

- KEY_kra ✅

- KEY_l ✅

- KEY_lacute ✅

- KEY_latincross ✅

- KEY_lbelowdot ✅

- KEY_lcaron ✅

- KEY_lcedilla ✅

- KEY_leftanglebracket ✅

- KEY_leftarrow ✅

- KEY_leftcaret ✅

- KEY_leftdoublequotemark ✅

- KEY_leftmiddlecurlybrace ✅

- KEY_leftopentriangle ✅

- KEY_leftpointer ✅

- KEY_leftradical ✅

- KEY_leftshoe ✅

- KEY_leftsinglequotemark ✅

- KEY_leftt ✅

- KEY_lefttack ✅

- KEY_less ✅

- KEY_lessthanequal ✅

- KEY_lf ✅

- KEY_logicaland ✅

- KEY_logicalor ✅

- KEY_lowleftcorner ✅

- KEY_lowrightcorner ✅

- KEY_lstroke ✅

- KEY_m ✅

- KEY_mabovedot ✅

- KEY_macron ✅

- KEY_malesymbol ✅

- KEY_maltesecross ✅

- KEY_marker ✅

- KEY_masculine ✅

- KEY_minus ✅

- KEY_minutes ✅

- KEY_mu ✅

- KEY_multiply ✅

- KEY_musicalflat ✅

- KEY_musicalsharp ✅

- KEY_n ✅

- KEY_nabla ✅

- KEY_nacute ✅

- KEY_ncaron ✅

- KEY_ncedilla ✅

- KEY_ninesubscript ✅

- KEY_ninesuperior ✅

- KEY_nl ✅

- KEY_nobreakspace ✅

- KEY_notapproxeq ✅

- KEY_notelementof ✅

- KEY_notequal ✅

- KEY_notidentical ✅

- KEY_notsign ✅

- KEY_ntilde ✅

- KEY_numbersign ✅

- KEY_numerosign ✅

- KEY_o ✅

- KEY_oacute ✅

- KEY_obarred ✅

- KEY_obelowdot ✅

- KEY_ocaron ✅

- KEY_ocircumflex ✅

- KEY_ocircumflexacute ✅

- KEY_ocircumflexbelowdot ✅

- KEY_ocircumflexgrave ✅

- KEY_ocircumflexhook ✅

- KEY_ocircumflextilde ✅

- KEY_odiaeresis ✅

- KEY_odoubleacute ✅

- KEY_oe ✅

- KEY_ogonek ✅

- KEY_ograve ✅

- KEY_ohook ✅

- KEY_ohorn ✅

- KEY_ohornacute ✅

- KEY_ohornbelowdot ✅

- KEY_ohorngrave ✅

- KEY_ohornhook ✅

- KEY_ohorntilde ✅

- KEY_omacron ✅

- KEY_oneeighth ✅

- KEY_onefifth ✅

- KEY_onehalf ✅

- KEY_onequarter ✅

- KEY_onesixth ✅

- KEY_onesubscript ✅

- KEY_onesuperior ✅

- KEY_onethird ✅

- KEY_ooblique ✅

- KEY_openrectbullet ✅

- KEY_openstar ✅

- KEY_opentribulletdown ✅

- KEY_opentribulletup ✅

- KEY_ordfeminine ✅

- KEY_oslash ✅

- KEY_otilde ✅

- KEY_overbar ✅

- KEY_overline ✅

- KEY_p ✅

- KEY_pabovedot ✅

- KEY_paragraph ✅

- KEY_parenleft ✅

- KEY_parenright ✅

- KEY_partdifferential ✅

- KEY_partialderivative ✅

- KEY_percent ✅

- KEY_period ✅

- KEY_periodcentered ✅

- KEY_permille ✅

- KEY_phonographcopyright ✅

- KEY_plus ✅

- KEY_plusminus ✅

- KEY_prescription ✅

- KEY_prolongedsound ✅

- KEY_punctspace ✅

- KEY_q ✅

- KEY_quad ✅

- KEY_question ✅

- KEY_questiondown ✅

- KEY_quotedbl ✅

- KEY_quoteleft ✅

- KEY_quoteright ✅

- KEY_r ✅

- KEY_racute ✅

- KEY_radical ✅

- KEY_rcaron ✅

- KEY_rcedilla ✅

- KEY_registered ✅

- KEY_rightanglebracket ✅

- KEY_rightarrow ✅

- KEY_rightcaret ✅

- KEY_rightdoublequotemark ✅

- KEY_rightmiddlecurlybrace ✅

- KEY_rightmiddlesummation ✅

- KEY_rightopentriangle ✅

- KEY_rightpointer ✅

- KEY_rightshoe ✅

- KEY_rightsinglequotemark ✅

- KEY_rightt ✅

- KEY_righttack ✅

- KEY_s ✅

- KEY_sabovedot ✅

- KEY_sacute ✅

- KEY_scaron ✅

- KEY_scedilla ✅

- KEY_schwa ✅

- KEY_scircumflex ✅

- KEY_script_switch ✅

- KEY_seconds ✅

- KEY_section ✅

- KEY_semicolon ✅

- KEY_semivoicedsound ✅

- KEY_seveneighths ✅

- KEY_sevensubscript ✅

- KEY_sevensuperior ✅

- KEY_signaturemark ✅

- KEY_signifblank ✅

- KEY_similarequal ✅

- KEY_singlelowquotemark ✅

- KEY_sixsubscript ✅

- KEY_sixsuperior ✅

- KEY_slash ✅

- KEY_soliddiamond ✅

- KEY_space ✅

- KEY_squareroot ✅

- KEY_ssharp ✅

- KEY_sterling ✅

- KEY_stricteq ✅

- KEY_t ✅

- KEY_tabovedot ✅

- KEY_tcaron ✅

- KEY_tcedilla ✅

- KEY_telephone ✅

- KEY_telephonerecorder ✅

- KEY_therefore ✅

- KEY_thinspace ✅

- KEY_thorn ✅

- KEY_threeeighths ✅

- KEY_threefifths ✅

- KEY_threequarters ✅

- KEY_threesubscript ✅

- KEY_threesuperior ✅

- KEY_tintegral ✅

- KEY_topintegral ✅

- KEY_topleftparens ✅

- KEY_topleftradical ✅

- KEY_topleftsqbracket ✅

- KEY_topleftsummation ✅

- KEY_toprightparens ✅

- KEY_toprightsqbracket ✅

- KEY_toprightsummation ✅

- KEY_topt ✅

- KEY_topvertsummationconnector ✅

- KEY_trademark ✅

- KEY_trademarkincircle ✅

- KEY_tslash ✅

- KEY_twofifths ✅

- KEY_twosubscript ✅

- KEY_twosuperior ✅

- KEY_twothirds ✅

- KEY_u ✅

- KEY_uacute ✅

- KEY_ubelowdot ✅

- KEY_ubreve ✅

- KEY_ucircumflex ✅

- KEY_udiaeresis ✅

- KEY_udoubleacute ✅

- KEY_ugrave ✅

- KEY_uhook ✅

- KEY_uhorn ✅

- KEY_uhornacute ✅

- KEY_uhornbelowdot ✅

- KEY_uhorngrave ✅

- KEY_uhornhook ✅

- KEY_uhorntilde ✅

- KEY_umacron ✅

- KEY_underbar ✅

- KEY_underscore ✅

- KEY_union ✅

- KEY_uogonek ✅

- KEY_uparrow ✅

- KEY_upcaret ✅

- KEY_upleftcorner ✅

- KEY_uprightcorner ✅

- KEY_upshoe ✅

- KEY_upstile ✅

- KEY_uptack ✅

- KEY_uring ✅

- KEY_utilde ✅

- KEY_v ✅

- KEY_variation ✅

- KEY_vertbar ✅

- KEY_vertconnector ✅

- KEY_voicedsound ✅

- KEY_vt ✅

- KEY_w ✅

- KEY_wacute ✅

- KEY_wcircumflex ✅

- KEY_wdiaeresis ✅

- KEY_wgrave ✅

- KEY_x ✅

- KEY_xabovedot ✅

- KEY_y ✅

- KEY_yacute ✅

- KEY_ybelowdot ✅

- KEY_ycircumflex ✅

- KEY_ydiaeresis ✅

- KEY_yen ✅

- KEY_ygrave ✅

- KEY_yhook ✅

- KEY_ytilde ✅

- KEY_z ✅

- KEY_zabovedot ✅

- KEY_zacute ✅

- KEY_zcaron ✅

- KEY_zerosubscript ✅

- KEY_zerosuperior ✅

- KEY_zstroke ✅

- MODIFIER_MASK ✅

- PRIORITY_REDRAW ✅

# GdkPixbuf

## Classes
### Pixbuf


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>10</td><td>0</td><td>3</tr>
<tr><td>functions</td><td>3</td><td>0</td><td>6</tr>
<tr><td>methods</td><td>31</td><td>0</td><td>12</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_bytes
  > ❌ `[constructor new_from_bytes/data]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- new_from_data
  > ❌ `[constructor new_from_data/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const guchar*)))`
- new_from_file ✅

- new_from_file_at_scale ✅

- new_from_file_at_size ✅

- new_from_inline
  > ❌ `[constructor new_from_inline/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const guint8*)))`
- new_from_resource ✅

- new_from_resource_at_scale ✅

- new_from_stream ✅

- new_from_stream_at_scale ✅

- new_from_stream_finish ✅

- new_from_xpm_data ✅

#### Methods
- add_alpha ✅

- apply_embedded_orientation ✅

- composite ✅

- composite_color ✅

- composite_color_simple ✅

- copy ✅

- copy_area ✅

- copy_options ✅

- fill ✅

- flip ✅

- get_bits_per_sample ✅

- get_byte_length ✅

- get_colorspace ✅

- get_has_alpha ✅

- get_height ✅

- get_n_channels ✅

- get_option ✅

- get_options
  > ❌ `[method get_options/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))`
- get_pixels
  > ❌ `[method get_pixels/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(guchar*)))`
- get_pixels_with_length
  > ❌ `[method get_pixels_with_length]: Method get_pixels_with_length contains an OUT parameter, which is not supported yet`
- get_rowstride ✅

- get_width ✅

- new_subpixbuf ✅

- read_pixel_bytes
  > ❌ `[method read_pixel_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- read_pixels ✅

- ref ✅

- remove_option ✅

- rotate_simple ✅

- saturate_and_pixelate ✅

- save
  > ❌ `[method save/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))`
- save_to_buffer
  > ❌ `[method save_to_buffer]: Method save_to_buffer contains an OUT parameter, which is not supported yet`
- save_to_bufferv
  > ❌ `[method save_to_bufferv]: Method save_to_bufferv contains an OUT parameter, which is not supported yet`
- save_to_callback
  > ❌ `[method save_to_callback/<method parameters>/save_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufSaveFunc), @type -> DataRecord(GdkPixbufSaveFunc)))`
- save_to_callbackv
  > ❌ `[method save_to_callbackv/<method parameters>/save_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufSaveFunc), @type -> DataRecord(GdkPixbufSaveFunc)))`
- save_to_stream
  > ❌ `[method save_to_stream/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))`
- save_to_stream_async
  > ❌ `[method save_to_stream_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- save_to_streamv ✅

- save_to_streamv_async
  > ❌ `[method save_to_streamv_async/<method parameters>/option_keys]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- savev ✅

- scale ✅

- scale_simple ✅

- set_option ✅

- unref ✅

#### Functions
- calculate_rowstride ✅

- get_file_info
  > ❌ `[function get_file_info]: Function get_file_info contains an OUT parameter, which is not supported yet`
- get_file_info_async
  > ❌ `[function get_file_info_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- get_file_info_finish
  > ❌ `[function get_file_info_finish]: Function get_file_info_finish contains an OUT parameter, which is not supported yet`
- get_formats
  > ❌ `[function get_formats/<return type>]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PixbufFormat))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))`
- init_modules ✅

- new_from_stream_async
  > ❌ `[function new_from_stream_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- new_from_stream_at_scale_async
  > ❌ `[function new_from_stream_at_scale_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- save_to_stream_finish ✅


### PixbufAnimation


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_file ✅

- new_from_resource ✅

- new_from_stream ✅

- new_from_stream_finish ✅

#### Methods
- get_height ✅

- get_iter
  > ❌ `[method get_iter/<method parameters>/start_time]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.TimeVal), @type -> DataRecord(const GTimeVal*)))`
- get_static_image ✅

- get_width ✅

- is_static_image ✅

- ref ✅

- unref ✅

#### Functions
- new_from_stream_async
  > ❌ `[function new_from_stream_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`

### PixbufAnimationIter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- advance
  > ❌ `[method advance/<method parameters>/current_time]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.TimeVal), @type -> DataRecord(const GTimeVal*)))`
- get_delay_time ✅

- get_pixbuf ✅

- on_currently_loading_frame ✅


### PixbufLoader


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>4</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_mime_type ✅

- new_with_type ✅

#### Methods
- close ✅

- get_animation ✅

- get_format
  > ❌ `[method get_format/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PixbufFormat), @type -> DataRecord(GdkPixbufFormat*)))`
- get_pixbuf ✅

- set_size ✅

- write
  > ❌ `[method write/<method parameters>/buf]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guchar*)))`
- write_bytes
  > ❌ `[method write_bytes/<method parameters>/buffer]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
#### Signals
- area-prepared ✅

- area-updated ✅

- closed ✅

- size-prepared ✅


### PixbufNonAnim

❌ `[PixbufNonAnim]: Class PixbufNonAnim is weird: refers to types not present in raw bindings`


### PixbufSimpleAnim


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_frame ✅

- get_loop ✅

- ref ✅

- set_loop ✅

- unref ✅


### PixbufSimpleAnimIter

❌ `[PixbufSimpleAnimIter]: Class PixbufSimpleAnimIter is weird: refers to types not present in raw bindings`


## Enums
- Colorspace ✅

- InterpType ✅

- PixbufAlphaMode ✅

- PixbufError ✅

- PixbufRotation ✅

## Bitfields
- PixbufFormatFlags
  > ❌ `Bitfield PixbufFormatFlags is weird: `
## Constants
- PIXBUF_MAJOR ✅

- PIXBUF_MICRO ✅

- PIXBUF_MINOR ✅

- PIXBUF_VERSION ✅

# Gio

## Classes
### AppInfoMonitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Functions
- get ✅

#### Signals
- changed ✅


### AppLaunchContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- get_display
  > ❌ `[method get_display/<method parameters>/files]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(File))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_environment ✅

- get_startup_notify_id
  > ❌ `[method get_startup_notify_id/<method parameters>/files]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(File))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- launch_failed ✅

- setenv ✅

- unsetenv ✅

#### Signals
- launch-failed ✅

- launch-started
  > ❌ `[signal launch-started]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(AppInfo)))`
- launched
  > ❌ `[signal launched]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(AppInfo)))`

### Application


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>31</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>5</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- activate ✅

- add_main_option ✅

- add_main_option_entries
  > ❌ `[method add_main_option_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GLib.OptionEntry)))),ListMap(@type -> DataRecord(const GOptionEntry*)))`
- add_option_group
  > ❌ `[method add_option_group/<method parameters>/group]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.OptionGroup), @type -> DataRecord(GOptionGroup*)))`
- bind_busy_property ✅

- get_application_id ✅

- get_dbus_connection ✅

- get_dbus_object_path ✅

- get_flags ✅

- get_inactivity_timeout ✅

- get_is_busy ✅

- get_is_registered ✅

- get_is_remote ✅

- get_resource_base_path ✅

- hold ✅

- mark_busy ✅

- open
  > ❌ `[method open]: Method open is weird: non NULL-terminated arrays require special handling`
- quit ✅

- register ✅

- release ✅

- run ✅

- send_notification ✅

- set_action_group ✅

- set_application_id ✅

- set_default ✅

- set_flags ✅

- set_inactivity_timeout ✅

- set_option_context_description ✅

- set_option_context_parameter_string ✅

- set_option_context_summary ✅

- set_resource_base_path ✅

- unbind_busy_property ✅

- unmark_busy ✅

- withdraw_notification ✅

#### Functions
- get_default ✅

- id_is_valid ✅

#### Signals
- activate ✅

- command-line ✅

- handle-local-options
  > ❌ `[signal handle-local-options]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.VariantDict)))`
- name-lost ✅

- open
  > ❌ `[signal open]: Array signal parameters not supported yet`
- shutdown ✅

- startup ✅


### ApplicationCommandLine


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- create_file_for_arg ✅

- get_arguments
  > ❌ `[method get_arguments]: Method get_arguments contains an OUT parameter, which is not supported yet`
- get_cwd ✅

- get_environ
  > ❌ `[method get_environ/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- get_exit_status ✅

- get_is_remote ✅

- get_options_dict
  > ❌ `[method get_options_dict/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantDict), @type -> DataRecord(GVariantDict*)))`
- get_platform_data
  > ❌ `[method get_platform_data/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_stdin ✅

- getenv ✅

- print
  > ❌ `[method print/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- printerr
  > ❌ `[method printerr/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_exit_status ✅


### BufferedInputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_sized ✅

#### Methods
- fill ✅

- fill_async
  > ❌ `[method fill_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- fill_finish ✅

- get_available ✅

- get_buffer_size ✅

- peek
  > ❌ `[method peek/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(void*)))`
- peek_buffer
  > ❌ `[method peek_buffer]: Method peek_buffer contains an OUT parameter, which is not supported yet`
- read_byte ✅

- set_buffer_size ✅


### BufferedOutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_sized ✅

#### Methods
- get_auto_grow ✅

- get_buffer_size ✅

- set_auto_grow ✅

- set_buffer_size ✅


### BytesIcon


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
#### Methods
- get_bytes
  > ❌ `[method get_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`

### Cancellable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- cancel ✅

- connect
  > ❌ `[method connect/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))`
- disconnect ✅

- get_fd ✅

- is_cancelled ✅

- make_pollfd
  > ❌ `[method make_pollfd/<method parameters>/pollfd]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.PollFD), @type -> DataRecord(GPollFD*)))`
- pop_current ✅

- push_current ✅

- release_fd ✅

- reset ✅

- set_error_if_cancelled ✅

- source_new
  > ❌ `[method source_new/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))`
#### Functions
- get_current ✅

#### Signals
- cancelled ✅


### CharsetConverter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_num_fallbacks ✅

- get_use_fallback ✅

- set_use_fallback ✅


### ConverterInputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_converter ✅


### ConverterOutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_converter ✅


### Credentials


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_native ✅

- get_unix_pid ✅

- get_unix_user ✅

- is_same_user ✅

- set_native ✅

- set_unix_user ✅

- to_string ✅


### DBusActionGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Functions
- get ✅


### DBusAuthObserver


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- allow_mechanism ✅

- authorize_authenticated_peer ✅

#### Signals
- allow-mechanism ✅

- authorize-authenticated-peer ✅


### DBusConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>24</td><td>0</td><td>17</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new_finish ✅

- new_for_address_finish ✅

- new_for_address_sync ✅

- new_sync ✅

#### Methods
- add_filter
  > ❌ `[method add_filter/<method parameters>/filter_function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusMessageFilterFunction), @type -> DataRecord(GDBusMessageFilterFunction)))`
- call
  > ❌ `[method call/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_finish
  > ❌ `[method call_finish/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_sync
  > ❌ `[method call_sync/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_with_unix_fd_list
  > ❌ `[method call_with_unix_fd_list/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_with_unix_fd_list_finish
  > ❌ `[method call_with_unix_fd_list_finish]: Method call_with_unix_fd_list_finish contains an OUT parameter, which is not supported yet`
- call_with_unix_fd_list_sync
  > ❌ `[method call_with_unix_fd_list_sync]: Method call_with_unix_fd_list_sync contains an OUT parameter, which is not supported yet`
- close
  > ❌ `[method close/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- close_finish ✅

- close_sync ✅

- emit_signal
  > ❌ `[method emit_signal/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- export_action_group ✅

- export_menu_model ✅

- flush
  > ❌ `[method flush/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- flush_finish ✅

- flush_sync ✅

- get_capabilities ✅

- get_exit_on_close ✅

- get_flags ✅

- get_guid ✅

- get_last_serial ✅

- get_peer_credentials ✅

- get_stream ✅

- get_unique_name ✅

- is_closed ✅

- register_object
  > ❌ `[method register_object/<method parameters>/interface_info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
- register_object_with_closures
  > ❌ `[method register_object_with_closures/<method parameters>/interface_info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
- register_subtree
  > ❌ `[method register_subtree/<method parameters>/vtable]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusSubtreeVTable), @type -> DataRecord(const GDBusSubtreeVTable*)))`
- remove_filter ✅

- send_message
  > ❌ `[method send_message]: Method send_message contains an OUT parameter, which is not supported yet`
- send_message_with_reply
  > ❌ `[method send_message_with_reply]: Method send_message_with_reply contains an OUT parameter, which is not supported yet`
- send_message_with_reply_finish ✅

- send_message_with_reply_sync
  > ❌ `[method send_message_with_reply_sync]: Method send_message_with_reply_sync contains an OUT parameter, which is not supported yet`
- set_exit_on_close ✅

- signal_subscribe
  > ❌ `[method signal_subscribe/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusSignalCallback), @type -> DataRecord(GDBusSignalCallback)))`
- signal_unsubscribe ✅

- start_message_processing ✅

- unexport_action_group ✅

- unexport_menu_model ✅

- unregister_object ✅

- unregister_subtree ✅

#### Functions
- new
  > ❌ `[function new/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- new_for_address
  > ❌ `[function new_for_address/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
#### Signals
- closed
  > ❌ `[signal closed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Error)))`

### DBusInterfaceSkeleton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- export ✅

- flush ✅

- get_connection ✅

- get_connections
  > ❌ `[method get_connections/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusConnection))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_flags ✅

- get_info
  > ❌ `[method get_info/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
- get_object_path ✅

- get_properties
  > ❌ `[method get_properties/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_vtable
  > ❌ `[method get_vtable/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceVTable), @type -> DataRecord(GDBusInterfaceVTable*)))`
- has_connection ✅

- set_flags ✅

- unexport ✅

- unexport_from_connection ✅

#### Signals
- g-authorize-method ✅


### DBusMenuModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Functions
- get ✅


### DBusMessage


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>37</td><td>0</td><td>7</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_blob
  > ❌ `[constructor new_from_blob/blob]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))`
- new_method_call ✅

- new_signal ✅

#### Methods
- copy ✅

- get_arg0 ✅

- get_body
  > ❌ `[method get_body/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_byte_order ✅

- get_destination ✅

- get_error_name ✅

- get_flags ✅

- get_header
  > ❌ `[method get_header/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_header_fields
  > ❌ `[method get_header_fields/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@type -> DataRecord(guchar*)))`
- get_interface ✅

- get_locked ✅

- get_member ✅

- get_message_type ✅

- get_num_unix_fds ✅

- get_path ✅

- get_reply_serial ✅

- get_sender ✅

- get_serial ✅

- get_signature ✅

- get_unix_fd_list ✅

- lock ✅

- new_method_error
  > ❌ `[method new_method_error/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- new_method_error_literal ✅

- new_method_error_valist ✅

- new_method_reply ✅

- print ✅

- set_body
  > ❌ `[method set_body/<method parameters>/body]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_byte_order ✅

- set_destination ✅

- set_error_name ✅

- set_flags ✅

- set_header
  > ❌ `[method set_header/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_interface ✅

- set_member ✅

- set_message_type ✅

- set_num_unix_fds ✅

- set_path ✅

- set_reply_serial ✅

- set_sender ✅

- set_serial ✅

- set_signature ✅

- set_unix_fd_list ✅

- to_blob
  > ❌ `[method to_blob]: Method to_blob contains an OUT parameter, which is not supported yet`
- to_gerror ✅

#### Functions
- bytes_needed
  > ❌ `[function bytes_needed/<function parameters>/blob]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))`

### DBusMethodInvocation


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>10</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_connection ✅

- get_interface_name ✅

- get_message ✅

- get_method_info
  > ❌ `[method get_method_info/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusMethodInfo), @type -> DataRecord(const GDBusMethodInfo*)))`
- get_method_name ✅

- get_object_path ✅

- get_parameters
  > ❌ `[method get_parameters/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_property_info
  > ❌ `[method get_property_info/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusPropertyInfo), @type -> DataRecord(const GDBusPropertyInfo*)))`
- get_sender ✅

- get_user_data ✅

- return_dbus_error ✅

- return_error
  > ❌ `[method return_error/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- return_error_literal
  > ❌ `[method return_error_literal/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- return_error_valist
  > ❌ `[method return_error_valist/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- return_gerror
  > ❌ `[method return_gerror/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))`
- return_value
  > ❌ `[method return_value/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- return_value_with_unix_fd_list
  > ❌ `[method return_value_with_unix_fd_list/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- take_error
  > ❌ `[method take_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))`

### DBusObjectManagerClient


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>2</tr></table>

#### Constructors
- new_finish ✅

- new_for_bus_finish ✅

- new_for_bus_sync
  > ❌ `[constructor new_for_bus_sync/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))`
- new_sync
  > ❌ `[constructor new_sync/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))`
#### Methods
- get_connection ✅

- get_flags ✅

- get_name ✅

- get_name_owner ✅

#### Functions
- new
  > ❌ `[function new/<function parameters>/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))`
- new_for_bus
  > ❌ `[function new_for_bus/<function parameters>/get_proxy_type_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusProxyTypeFunc), @type -> DataRecord(GDBusProxyTypeFunc)))`
#### Signals
- interface-proxy-properties-changed
  > ❌ `[signal interface-proxy-properties-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))`
- interface-proxy-signal
  > ❌ `[signal interface-proxy-signal]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))`

### DBusObjectManagerServer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- export ✅

- export_uniquely ✅

- get_connection ✅

- is_exported ✅

- set_connection ✅

- unexport ✅


### DBusObjectProxy


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_connection ✅


### DBusObjectSkeleton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_interface ✅

- flush ✅

- remove_interface ✅

- remove_interface_by_name ✅

- set_object_path ✅

#### Signals
- authorize-method ✅


### DBusProxy


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>11</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>2</tr></table>

#### Constructors
- new_finish ✅

- new_for_bus_finish ✅

- new_for_bus_sync
  > ❌ `[constructor new_for_bus_sync/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
- new_sync
  > ❌ `[constructor new_sync/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
#### Methods
- call
  > ❌ `[method call/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_finish
  > ❌ `[method call_finish/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_sync
  > ❌ `[method call_sync/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_with_unix_fd_list
  > ❌ `[method call_with_unix_fd_list/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- call_with_unix_fd_list_finish
  > ❌ `[method call_with_unix_fd_list_finish]: Method call_with_unix_fd_list_finish contains an OUT parameter, which is not supported yet`
- call_with_unix_fd_list_sync
  > ❌ `[method call_with_unix_fd_list_sync]: Method call_with_unix_fd_list_sync contains an OUT parameter, which is not supported yet`
- get_cached_property
  > ❌ `[method get_cached_property/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_cached_property_names
  > ❌ `[method get_cached_property_names/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- get_connection ✅

- get_default_timeout ✅

- get_flags ✅

- get_interface_info
  > ❌ `[method get_interface_info/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
- get_interface_name ✅

- get_name ✅

- get_name_owner ✅

- get_object_path ✅

- set_cached_property
  > ❌ `[method set_cached_property/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_default_timeout ✅

- set_interface_info
  > ❌ `[method set_interface_info/<method parameters>/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
#### Functions
- new
  > ❌ `[function new/<function parameters>/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
- new_for_bus
  > ❌ `[function new_for_bus/<function parameters>/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
#### Signals
- g-properties-changed
  > ❌ `[signal g-properties-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))`
- g-signal
  > ❌ `[signal g-signal]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))`

### DBusServer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new_sync ✅

#### Methods
- get_client_address ✅

- get_flags ✅

- get_guid ✅

- is_active ✅

- start ✅

- stop ✅

#### Signals
- new-connection ✅


### DataInputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>12</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_byte_order ✅

- get_newline_type ✅

- read_byte
  > ❌ `[method read_byte]: Method read_byte is weird: there are conflicting versions of it in DataInputStream and BufferedInputStream`
- read_int16 ✅

- read_int32 ✅

- read_int64 ✅

- read_line
  > ❌ `[method read_line]: Method read_line contains an OUT parameter, which is not supported yet`
- read_line_async
  > ❌ `[method read_line_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_line_finish
  > ❌ `[method read_line_finish]: Method read_line_finish contains an OUT parameter, which is not supported yet`
- read_line_finish_utf8
  > ❌ `[method read_line_finish_utf8]: Method read_line_finish_utf8 contains an OUT parameter, which is not supported yet`
- read_line_utf8
  > ❌ `[method read_line_utf8]: Method read_line_utf8 contains an OUT parameter, which is not supported yet`
- read_uint16 ✅

- read_uint32 ✅

- read_uint64 ✅

- read_until
  > ❌ `[method read_until]: Method read_until contains an OUT parameter, which is not supported yet`
- read_until_async
  > ❌ `[method read_until_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_until_finish
  > ❌ `[method read_until_finish]: Method read_until_finish contains an OUT parameter, which is not supported yet`
- read_upto
  > ❌ `[method read_upto]: Method read_upto contains an OUT parameter, which is not supported yet`
- read_upto_async
  > ❌ `[method read_upto_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_upto_finish
  > ❌ `[method read_upto_finish]: Method read_upto_finish contains an OUT parameter, which is not supported yet`
- set_byte_order ✅

- set_newline_type ✅


### DataOutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_byte_order ✅

- put_byte ✅

- put_int16 ✅

- put_int32 ✅

- put_int64 ✅

- put_string ✅

- put_uint16 ✅

- put_uint32 ✅

- put_uint64 ✅

- set_byte_order ✅


### DebugControllerDBus


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- stop ✅

#### Signals
- authorize ✅


### DesktopAppInfo

❌ `[DesktopAppInfo]: Class DesktopAppInfo is weird: `


### Emblem


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_origin ✅

#### Methods
- get_icon ✅

- get_origin ✅


### EmblemedIcon


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_emblem ✅

- clear_emblems ✅

- get_emblems
  > ❌ `[method get_emblems/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Emblem))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_icon ✅


### FileEnumerator


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- close ✅

- close_async
  > ❌ `[method close_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- close_finish ✅

- get_child ✅

- get_container ✅

- has_pending ✅

- is_closed ✅

- iterate
  > ❌ `[method iterate]: Method iterate contains an OUT parameter, which is not supported yet`
- next_file ✅

- next_files_async
  > ❌ `[method next_files_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- next_files_finish
  > ❌ `[method next_files_finish/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(FileInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- set_pending ✅


### FileIOStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_etag ✅

- query_info ✅

- query_info_async
  > ❌ `[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- query_info_finish ✅


### FileIcon


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_file ✅


### FileInfo


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>59</td><td>0</td><td>11</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- clear_status ✅

- copy_into ✅

- dup ✅

- get_access_date_time
  > ❌ `[method get_access_date_time/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- get_attribute_as_string ✅

- get_attribute_boolean ✅

- get_attribute_byte_string ✅

- get_attribute_data
  > ❌ `[method get_attribute_data]: Method get_attribute_data contains an OUT parameter, which is not supported yet`
- get_attribute_file_path ✅

- get_attribute_int32 ✅

- get_attribute_int64 ✅

- get_attribute_object ✅

- get_attribute_status ✅

- get_attribute_string ✅

- get_attribute_stringv ✅

- get_attribute_type ✅

- get_attribute_uint32 ✅

- get_attribute_uint64 ✅

- get_content_type ✅

- get_creation_date_time
  > ❌ `[method get_creation_date_time/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- get_deletion_date
  > ❌ `[method get_deletion_date/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- get_display_name ✅

- get_edit_name ✅

- get_etag ✅

- get_file_type ✅

- get_icon ✅

- get_is_backup ✅

- get_is_hidden ✅

- get_is_symlink ✅

- get_modification_date_time
  > ❌ `[method get_modification_date_time/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- get_modification_time
  > ❌ `[method get_modification_time]: Method get_modification_time contains an OUT parameter, which is not supported yet`
- get_name ✅

- get_size ✅

- get_sort_order ✅

- get_symbolic_icon ✅

- get_symlink_target ✅

- has_attribute ✅

- has_namespace ✅

- list_attributes ✅

- remove_attribute ✅

- set_access_date_time
  > ❌ `[method set_access_date_time/<method parameters>/atime]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- set_attribute ✅

- set_attribute_boolean ✅

- set_attribute_byte_string ✅

- set_attribute_file_path ✅

- set_attribute_int32 ✅

- set_attribute_int64 ✅

- set_attribute_mask
  > ❌ `[method set_attribute_mask/<method parameters>/mask]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FileAttributeMatcher), @type -> DataRecord(GFileAttributeMatcher*)))`
- set_attribute_object ✅

- set_attribute_status ✅

- set_attribute_string ✅

- set_attribute_stringv ✅

- set_attribute_uint32 ✅

- set_attribute_uint64 ✅

- set_content_type ✅

- set_creation_date_time
  > ❌ `[method set_creation_date_time/<method parameters>/creation_time]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- set_display_name ✅

- set_edit_name ✅

- set_file_type ✅

- set_icon ✅

- set_is_hidden ✅

- set_is_symlink ✅

- set_modification_date_time
  > ❌ `[method set_modification_date_time/<method parameters>/mtime]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- set_modification_time
  > ❌ `[method set_modification_time/<method parameters>/mtime]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.TimeVal), @type -> DataRecord(GTimeVal*)))`
- set_name ✅

- set_size ✅

- set_sort_order ✅

- set_symbolic_icon ✅

- set_symlink_target ✅

- unset_attribute_mask ✅


### FileInputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- query_info ✅

- query_info_async
  > ❌ `[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- query_info_finish ✅


### FileMonitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Methods
- cancel ✅

- emit_event ✅

- is_cancelled ✅

- set_rate_limit ✅

#### Signals
- changed
  > ❌ `[signal changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(File)))`

### FileOutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_etag ✅

- query_info ✅

- query_info_async
  > ❌ `[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- query_info_finish ✅


### FilenameCompleter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_completion_suffix ✅

- get_completions ✅

- set_dirs_only ✅

#### Signals
- got-completion-data ✅


### FilterInputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_base_stream ✅

- get_close_base_stream ✅

- set_close_base_stream ✅


### FilterOutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_base_stream ✅

- get_close_base_stream ✅

- set_close_base_stream ✅


### IOModule


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- load ✅

- unload ✅

- unuse
  > ❌ `[method unuse]: Method unuse is weird: I don't want to deal with this`
- use
  > ❌ `[method use]: Method use is weird: Incompatible override between TypeModule and TypePlugin`
#### Functions
- query ✅


### IOStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- clear_pending ✅

- close ✅

- close_async
  > ❌ `[method close_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- close_finish ✅

- get_input_stream ✅

- get_output_stream ✅

- has_pending ✅

- is_closed ✅

- set_pending ✅

- splice_async
  > ❌ `[method splice_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
#### Functions
- splice_finish ✅


### InetAddress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>15</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_any ✅

- new_from_bytes
  > ❌ `[constructor new_from_bytes/bytes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const guint8*)))`
- new_from_string ✅

- new_loopback ✅

#### Methods
- equal ✅

- get_family ✅

- get_is_any ✅

- get_is_link_local ✅

- get_is_loopback ✅

- get_is_mc_global ✅

- get_is_mc_link_local ✅

- get_is_mc_node_local ✅

- get_is_mc_org_local ✅

- get_is_mc_site_local ✅

- get_is_multicast ✅

- get_is_site_local ✅

- get_native_size ✅

- to_bytes ✅

- to_string ✅


### InetAddressMask


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_string ✅

#### Methods
- equal ✅

- get_address ✅

- get_family ✅

- get_length ✅

- matches ✅

- to_string ✅


### InetSocketAddress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_string ✅

#### Methods
- get_address ✅

- get_flowinfo ✅

- get_port ✅

- get_scope_id ✅


### InputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>10</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- clear_pending ✅

- close ✅

- close_async
  > ❌ `[method close_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- close_finish ✅

- has_pending ✅

- is_closed ✅

- read
  > ❌ `[method read]: Method read contains an OUT parameter, which is not supported yet`
- read_all
  > ❌ `[method read_all]: Method read_all contains an OUT parameter, which is not supported yet`
- read_all_async
  > ❌ `[method read_all_async]: Method read_all_async contains an OUT parameter, which is not supported yet`
- read_all_finish
  > ❌ `[method read_all_finish]: Method read_all_finish contains an OUT parameter, which is not supported yet`
- read_async
  > ❌ `[method read_async]: Method read_async contains an OUT parameter, which is not supported yet`
- read_bytes
  > ❌ `[method read_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- read_bytes_async
  > ❌ `[method read_bytes_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_bytes_finish
  > ❌ `[method read_bytes_finish/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- read_finish ✅

- set_pending ✅

- skip ✅

- skip_async
  > ❌ `[method skip_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- skip_finish ✅


### ListStore


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append ✅

- find
  > ❌ `[method find]: Method find contains an OUT parameter, which is not supported yet`
- find_with_equal_func
  > ❌ `[method find_with_equal_func]: Method find_with_equal_func contains an OUT parameter, which is not supported yet`
- find_with_equal_func_full
  > ❌ `[method find_with_equal_func_full]: Method find_with_equal_func_full contains an OUT parameter, which is not supported yet`
- insert ✅

- insert_sorted
  > ❌ `[method insert_sorted/<method parameters>/compare_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))`
- remove ✅

- remove_all ✅

- sort
  > ❌ `[method sort/<method parameters>/compare_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))`
- splice
  > ❌ `[method splice/<method parameters>/additions]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GObject.Object)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(3), @type -> DataRecord(gpointer*)))`

### MemoryInputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_bytes
  > ❌ `[constructor new_from_bytes/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- new_from_data
  > ❌ `[constructor new_from_data/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))`
#### Methods
- add_bytes
  > ❌ `[method add_bytes/<method parameters>/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- add_data
  > ❌ `[method add_data/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))`

### MemoryOutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/realloc_function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ReallocFunc), @type -> DataRecord(GReallocFunc)))`
- new_resizable ✅

#### Methods
- get_data ✅

- get_data_size ✅

- get_size ✅

- steal_as_bytes
  > ❌ `[method steal_as_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- steal_data ✅


### Menu


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>15</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append ✅

- append_item ✅

- append_section ✅

- append_submenu ✅

- freeze ✅

- insert ✅

- insert_item ✅

- insert_section ✅

- insert_submenu ✅

- prepend ✅

- prepend_item ✅

- prepend_section ✅

- prepend_submenu ✅

- remove ✅

- remove_all ✅


### MenuAttributeIter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_name ✅

- get_next
  > ❌ `[method get_next]: Method get_next contains an OUT parameter, which is not supported yet`
- get_value
  > ❌ `[method get_value/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- next ✅


### MenuItem


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_model ✅

- new_section ✅

- new_submenu ✅

#### Methods
- get_attribute
  > ❌ `[method get_attribute/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_attribute_value
  > ❌ `[method get_attribute_value/<method parameters>/expected_type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
- get_link ✅

- set_action_and_target
  > ❌ `[method set_action_and_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_action_and_target_value
  > ❌ `[method set_action_and_target_value/<method parameters>/target_value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_attribute
  > ❌ `[method set_attribute/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_attribute_value
  > ❌ `[method set_attribute_value/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_detailed_action ✅

- set_icon ✅

- set_label ✅

- set_link ✅

- set_section ✅

- set_submenu ✅


### MenuLinkIter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_name ✅

- get_next
  > ❌ `[method get_next]: Method get_next contains an OUT parameter, which is not supported yet`
- get_value ✅

- next ✅


### MenuModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- get_item_attribute
  > ❌ `[method get_item_attribute/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_item_attribute_value
  > ❌ `[method get_item_attribute_value/<method parameters>/expected_type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
- get_item_link ✅

- get_n_items ✅

- is_mutable ✅

- items_changed ✅

- iterate_item_attributes ✅

- iterate_item_links ✅

#### Signals
- items-changed ✅


### MountOperation


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>19</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>3</tr></table>

#### Constructors
- new ✅

#### Methods
- get_anonymous ✅

- get_choice ✅

- get_domain ✅

- get_is_tcrypt_hidden_volume ✅

- get_is_tcrypt_system_volume ✅

- get_password ✅

- get_password_save ✅

- get_pim ✅

- get_username ✅

- reply ✅

- set_anonymous ✅

- set_choice ✅

- set_domain ✅

- set_is_tcrypt_hidden_volume ✅

- set_is_tcrypt_system_volume ✅

- set_password ✅

- set_password_save ✅

- set_pim ✅

- set_username ✅

#### Signals
- aborted ✅

- ask-password ✅

- ask-question
  > ❌ `[signal ask-question]: Array signal parameters not supported yet`
- reply ✅

- show-processes
  > ❌ `[signal show-processes]: Array signal parameters not supported yet`
- show-unmount-progress
  > ❌ `[signal show-unmount-progress]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64)))`

### NativeSocketAddress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### NativeVolumeMonitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### NetworkAddress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_loopback ✅

#### Methods
- get_hostname ✅

- get_port ✅

- get_scheme ✅

#### Functions
- parse ✅

- parse_uri ✅


### NetworkService


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_domain ✅

- get_protocol ✅

- get_scheme ✅

- get_service ✅

- set_scheme ✅


### Notification


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_button ✅

- add_button_with_target
  > ❌ `[method add_button_with_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- add_button_with_target_value
  > ❌ `[method add_button_with_target_value/<method parameters>/target]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_body ✅

- set_category ✅

- set_default_action ✅

- set_default_action_and_target
  > ❌ `[method set_default_action_and_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_default_action_and_target_value
  > ❌ `[method set_default_action_and_target_value/<method parameters>/target]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_icon ✅

- set_priority ✅

- set_title ✅

- set_urgent ✅


### OutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>18</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- clear_pending ✅

- close ✅

- close_async
  > ❌ `[method close_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- close_finish ✅

- flush ✅

- flush_async
  > ❌ `[method flush_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- flush_finish ✅

- has_pending ✅

- is_closed ✅

- is_closing ✅

- printf
  > ❌ `[method printf]: Method printf contains an OUT parameter, which is not supported yet`
- set_pending ✅

- splice ✅

- splice_async
  > ❌ `[method splice_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- splice_finish ✅

- vprintf
  > ❌ `[method vprintf]: Method vprintf contains an OUT parameter, which is not supported yet`
- write
  > ❌ `[method write/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))`
- write_all
  > ❌ `[method write_all]: Method write_all contains an OUT parameter, which is not supported yet`
- write_all_async
  > ❌ `[method write_all_async/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))`
- write_all_finish
  > ❌ `[method write_all_finish]: Method write_all_finish contains an OUT parameter, which is not supported yet`
- write_async
  > ❌ `[method write_async/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))`
- write_bytes
  > ❌ `[method write_bytes/<method parameters>/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- write_bytes_async
  > ❌ `[method write_bytes_async/<method parameters>/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- write_bytes_finish ✅

- write_finish ✅

- writev
  > ❌ `[method writev]: Method writev contains an OUT parameter, which is not supported yet`
- writev_all
  > ❌ `[method writev_all]: Method writev_all contains an OUT parameter, which is not supported yet`
- writev_all_async
  > ❌ `[method writev_all_async/<method parameters>/vectors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(OutputVector), @type -> DataRecord(GOutputVector)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GOutputVector*)))`
- writev_all_finish
  > ❌ `[method writev_all_finish]: Method writev_all_finish contains an OUT parameter, which is not supported yet`
- writev_async
  > ❌ `[method writev_async/<method parameters>/vectors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(OutputVector), @type -> DataRecord(GOutputVector)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GOutputVector*)))`
- writev_finish
  > ❌ `[method writev_finish]: Method writev_finish contains an OUT parameter, which is not supported yet`

### Permission


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- acquire ✅

- acquire_async
  > ❌ `[method acquire_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- acquire_finish ✅

- get_allowed ✅

- get_can_acquire ✅

- get_can_release ✅

- impl_update ✅

- release ✅

- release_async
  > ❌ `[method release_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- release_finish ✅


### PropertyAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### ProxyAddress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_destination_hostname ✅

- get_destination_port ✅

- get_destination_protocol ✅

- get_password ✅

- get_protocol ✅

- get_uri ✅

- get_username ✅


### ProxyAddressEnumerator


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### Resolver


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>13</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- get_timeout ✅

- lookup_by_address ✅

- lookup_by_address_async
  > ❌ `[method lookup_by_address_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_by_address_finish ✅

- lookup_by_name
  > ❌ `[method lookup_by_name/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- lookup_by_name_async
  > ❌ `[method lookup_by_name_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_by_name_finish
  > ❌ `[method lookup_by_name_finish/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- lookup_by_name_with_flags
  > ❌ `[method lookup_by_name_with_flags/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- lookup_by_name_with_flags_async
  > ❌ `[method lookup_by_name_with_flags_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_by_name_with_flags_finish
  > ❌ `[method lookup_by_name_with_flags_finish/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- lookup_records
  > ❌ `[method lookup_records/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GLib.Variant))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- lookup_records_async
  > ❌ `[method lookup_records_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_records_finish
  > ❌ `[method lookup_records_finish/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GLib.Variant))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- lookup_service
  > ❌ `[method lookup_service/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(SrvTarget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- lookup_service_async
  > ❌ `[method lookup_service_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_service_finish
  > ❌ `[method lookup_service_finish/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(SrvTarget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- set_default ✅

- set_timeout ✅

#### Functions
- free_addresses
  > ❌ `[function free_addresses/<function parameters>/addresses]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- free_targets
  > ❌ `[function free_targets/<function parameters>/targets]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_default ✅

#### Signals
- reload ✅


### Settings


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>28</td><td>0</td><td>14</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

- new_full
  > ❌ `[constructor new_full/schema]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(SettingsSchema), @type -> DataRecord(GSettingsSchema*)))`
- new_with_backend ✅

- new_with_backend_and_path ✅

- new_with_path ✅

#### Methods
- apply ✅

- bind ✅

- bind_with_mapping
  > ❌ `[method bind_with_mapping/<method parameters>/get_mapping]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SettingsBindGetMapping), @type -> DataRecord(GSettingsBindGetMapping)))`
- bind_writable ✅

- create_action ✅

- delay ✅

- get
  > ❌ `[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_boolean ✅

- get_child ✅

- get_default_value
  > ❌ `[method get_default_value/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_double ✅

- get_enum ✅

- get_flags ✅

- get_has_unapplied ✅

- get_int ✅

- get_int64 ✅

- get_mapped
  > ❌ `[method get_mapped/<method parameters>/mapping]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SettingsGetMapping), @type -> DataRecord(GSettingsGetMapping)))`
- get_range
  > ❌ `[method get_range/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_string ✅

- get_strv
  > ❌ `[method get_strv/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- get_uint ✅

- get_uint64 ✅

- get_user_value
  > ❌ `[method get_user_value/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_value
  > ❌ `[method get_value/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- is_writable ✅

- list_children
  > ❌ `[method list_children/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- list_keys
  > ❌ `[method list_keys/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- range_check
  > ❌ `[method range_check/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- reset ✅

- revert ✅

- set
  > ❌ `[method set/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_boolean ✅

- set_double ✅

- set_enum ✅

- set_flags ✅

- set_int ✅

- set_int64 ✅

- set_string ✅

- set_strv
  > ❌ `[method set_strv/<method parameters>/value]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- set_uint ✅

- set_uint64 ✅

- set_value
  > ❌ `[method set_value/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
#### Functions
- list_relocatable_schemas
  > ❌ `[function list_relocatable_schemas/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- list_schemas
  > ❌ `[function list_schemas/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- sync ✅

- unbind ✅

#### Signals
- change-event
  > ❌ `[signal change-event]: Array signal parameters not supported yet`
- changed ✅

- writable-change-event
  > ❌ `[signal writable-change-event]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- writable-changed ✅


### SettingsBackend


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- changed
  > ❌ `[method changed]: GSettingsBackend methods are not rendered`
- changed_tree
  > ❌ `[method changed_tree]: GSettingsBackend methods are not rendered`
- keys_changed
  > ❌ `[method keys_changed]: GSettingsBackend methods are not rendered`
- path_changed
  > ❌ `[method path_changed]: GSettingsBackend methods are not rendered`
- path_writable_changed
  > ❌ `[method path_writable_changed]: GSettingsBackend methods are not rendered`
- writable_changed
  > ❌ `[method writable_changed]: GSettingsBackend methods are not rendered`
#### Functions
- flatten_tree
  > ❌ `[function flatten_tree]: Function flatten_tree contains an OUT parameter, which is not supported yet`
- get_default
  > ❌ `[function get_default]: Method g_settings_backend_get_default has no target types`

### SimpleAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>2</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/parameter_type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
- new_stateful
  > ❌ `[constructor new_stateful/parameter_type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
#### Methods
- set_enabled ✅

- set_state
  > ❌ `[method set_state/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_state_hint
  > ❌ `[method set_state_hint/<method parameters>/state_hint]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
#### Signals
- activate
  > ❌ `[signal activate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))`
- change-state
  > ❌ `[signal change-state]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))`

### SimpleActionGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_entries
  > ❌ `[method add_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ActionEntry), @type -> DataRecord(GActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GActionEntry*)))`
- insert ✅

- lookup ✅

- remove ✅


### SimpleAsyncResult


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>4</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- new_error
  > ❌ `[constructor new_error/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- new_from_error
  > ❌ `[constructor new_from_error/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- new_take_error
  > ❌ `[constructor new_take_error/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
#### Methods
- complete ✅

- complete_in_idle ✅

- get_op_res_gboolean ✅

- get_op_res_gpointer ✅

- get_op_res_gssize ✅

- get_source_tag ✅

- propagate_error ✅

- run_in_thread
  > ❌ `[method run_in_thread/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SimpleAsyncThreadFunc), @type -> DataRecord(GSimpleAsyncThreadFunc)))`
- set_check_cancellable ✅

- set_error
  > ❌ `[method set_error/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- set_error_va
  > ❌ `[method set_error_va/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- set_from_error
  > ❌ `[method set_from_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))`
- set_handle_cancellation ✅

- set_op_res_gboolean ✅

- set_op_res_gpointer
  > ❌ `[method set_op_res_gpointer/<method parameters>/destroy_op_res]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`
- set_op_res_gssize ✅

- take_error
  > ❌ `[method take_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))`
#### Functions
- is_valid ✅


### SimpleIOStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### SimplePermission


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### SimpleProxyResolver


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- set_default_proxy ✅

- set_ignore_hosts
  > ❌ `[method set_ignore_hosts/<method parameters>/ignore_hosts]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(gchar**)))`
- set_uri_proxy ✅

#### Functions
- new
  > ❌ `[function new/<function parameters>/ignore_hosts]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(gchar**)))`

### Socket


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>42</td><td>0</td><td>14</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_fd ✅

#### Methods
- accept ✅

- bind ✅

- check_connect_result ✅

- close ✅

- condition_check ✅

- condition_timed_wait ✅

- condition_wait ✅

- connect
  > ❌ `[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject`
- connection_factory_create_connection ✅

- create_source
  > ❌ `[method create_source/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))`
- get_available_bytes ✅

- get_blocking ✅

- get_broadcast ✅

- get_credentials ✅

- get_family ✅

- get_fd ✅

- get_keepalive ✅

- get_listen_backlog ✅

- get_local_address ✅

- get_multicast_loopback ✅

- get_multicast_ttl ✅

- get_option
  > ❌ `[method get_option]: Method get_option contains an OUT parameter, which is not supported yet`
- get_protocol ✅

- get_remote_address ✅

- get_socket_type ✅

- get_timeout ✅

- get_ttl ✅

- is_closed ✅

- is_connected ✅

- join_multicast_group ✅

- join_multicast_group_ssm ✅

- leave_multicast_group ✅

- leave_multicast_group_ssm ✅

- listen ✅

- receive
  > ❌ `[method receive]: Method receive contains an OUT parameter, which is not supported yet`
- receive_from
  > ❌ `[method receive_from]: Method receive_from contains an OUT parameter, which is not supported yet`
- receive_message
  > ❌ `[method receive_message]: Method receive_message contains an OUT parameter, which is not supported yet`
- receive_messages
  > ❌ `[method receive_messages/<method parameters>/messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InputMessage), @type -> DataRecord(GInputMessage)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GInputMessage*)))`
- receive_with_blocking
  > ❌ `[method receive_with_blocking]: Method receive_with_blocking contains an OUT parameter, which is not supported yet`
- send
  > ❌ `[method send/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))`
- send_message
  > ❌ `[method send_message]: Method send_message is weird: non NULL-terminated arrays require special handling`
- send_message_with_timeout
  > ❌ `[method send_message_with_timeout]: Method send_message_with_timeout contains an OUT parameter, which is not supported yet`
- send_messages
  > ❌ `[method send_messages/<method parameters>/messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(OutputMessage), @type -> DataRecord(GOutputMessage)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GOutputMessage*)))`
- send_to
  > ❌ `[method send_to/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const gchar*)))`
- send_with_blocking
  > ❌ `[method send_with_blocking/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))`
- set_blocking ✅

- set_broadcast ✅

- set_keepalive ✅

- set_listen_backlog ✅

- set_multicast_loopback ✅

- set_multicast_ttl ✅

- set_option ✅

- set_timeout ✅

- set_ttl ✅

- shutdown ✅

- speaks_ipv4 ✅


### SocketAddress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_native ✅

#### Methods
- get_family ✅

- get_native_size ✅

- to_native ✅


### SocketAddressEnumerator


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- next ✅

- next_async
  > ❌ `[method next_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- next_finish ✅


### SocketClient


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>26</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- add_application_proxy ✅

- connect
  > ❌ `[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject`
- connect_async
  > ❌ `[method connect_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- connect_finish ✅

- connect_to_host ✅

- connect_to_host_async
  > ❌ `[method connect_to_host_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- connect_to_host_finish ✅

- connect_to_service ✅

- connect_to_service_async
  > ❌ `[method connect_to_service_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- connect_to_service_finish ✅

- connect_to_uri ✅

- connect_to_uri_async
  > ❌ `[method connect_to_uri_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- connect_to_uri_finish ✅

- get_enable_proxy ✅

- get_family ✅

- get_local_address ✅

- get_protocol ✅

- get_proxy_resolver ✅

- get_socket_type ✅

- get_timeout ✅

- get_tls ✅

- get_tls_validation_flags ✅

- set_enable_proxy ✅

- set_family ✅

- set_local_address ✅

- set_protocol ✅

- set_proxy_resolver ✅

- set_socket_type ✅

- set_timeout ✅

- set_tls ✅

- set_tls_validation_flags ✅

#### Signals
- event
  > ❌ `[signal event]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(SocketConnectable)))`

### SocketConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- connect
  > ❌ `[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject`
- connect_async
  > ❌ `[method connect_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- connect_finish ✅

- get_local_address ✅

- get_remote_address ✅

- get_socket ✅

- is_connected ✅

#### Functions
- factory_lookup_type ✅

- factory_register_type ✅


### SocketControlMessage


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_level ✅

- get_msg_type ✅

- get_size ✅

- serialize ✅

#### Functions
- deserialize
  > ❌ `[function deserialize/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(gpointer)))`

### SocketListener


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>7</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- accept
  > ❌ `[method accept]: Method accept contains an OUT parameter, which is not supported yet`
- accept_async
  > ❌ `[method accept_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- accept_finish
  > ❌ `[method accept_finish]: Method accept_finish contains an OUT parameter, which is not supported yet`
- accept_socket
  > ❌ `[method accept_socket]: Method accept_socket contains an OUT parameter, which is not supported yet`
- accept_socket_async
  > ❌ `[method accept_socket_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- accept_socket_finish
  > ❌ `[method accept_socket_finish]: Method accept_socket_finish contains an OUT parameter, which is not supported yet`
- add_address
  > ❌ `[method add_address]: Method add_address contains an OUT parameter, which is not supported yet`
- add_any_inet_port ✅

- add_inet_port ✅

- add_socket ✅

- close ✅

- set_backlog ✅

#### Signals
- event ✅


### SocketService


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- is_active ✅

- start ✅

- stop ✅

#### Signals
- incoming ✅


### Subprocess


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>16</td><td>0</td><td>8</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))`
- newv
  > ❌ `[constructor newv/argv]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))`
#### Methods
- communicate
  > ❌ `[method communicate]: Method communicate contains an OUT parameter, which is not supported yet`
- communicate_async
  > ❌ `[method communicate_async/<method parameters>/stdin_buf]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- communicate_finish
  > ❌ `[method communicate_finish]: Method communicate_finish contains an OUT parameter, which is not supported yet`
- communicate_utf8
  > ❌ `[method communicate_utf8]: Method communicate_utf8 contains an OUT parameter, which is not supported yet`
- communicate_utf8_async
  > ❌ `[method communicate_utf8_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- communicate_utf8_finish
  > ❌ `[method communicate_utf8_finish]: Method communicate_utf8_finish contains an OUT parameter, which is not supported yet`
- force_exit ✅

- get_exit_status ✅

- get_identifier ✅

- get_if_exited ✅

- get_if_signaled ✅

- get_status ✅

- get_stderr_pipe ✅

- get_stdin_pipe ✅

- get_stdout_pipe ✅

- get_successful ✅

- get_term_sig ✅

- send_signal ✅

- wait ✅

- wait_async
  > ❌ `[method wait_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- wait_check ✅

- wait_check_async
  > ❌ `[method wait_check_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- wait_check_finish ✅

- wait_finish ✅


### SubprocessLauncher


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- close ✅

- getenv ✅

- set_child_setup
  > ❌ `[method set_child_setup/<method parameters>/child_setup]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.SpawnChildSetupFunc), @type -> DataRecord(GSpawnChildSetupFunc)))`
- set_cwd ✅

- set_environ
  > ❌ `[method set_environ/<method parameters>/env]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))`
- set_flags ✅

- set_stderr_file_path ✅

- set_stdin_file_path ✅

- set_stdout_file_path ✅

- setenv ✅

- spawn
  > ❌ `[method spawn/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))`
- spawnv
  > ❌ `[method spawnv/<method parameters>/argv]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- take_fd ✅

- take_stderr_fd ✅

- take_stdin_fd ✅

- take_stdout_fd ✅

- unsetenv ✅


### Task


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>23</td><td>0</td><td>9</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
#### Methods
- attach_source
  > ❌ `[method attach_source/<method parameters>/source]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))`
- get_cancellable ✅

- get_check_cancellable ✅

- get_completed ✅

- get_context
  > ❌ `[method get_context/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.MainContext), @type -> DataRecord(GMainContext*)))`
- get_name ✅

- get_priority ✅

- get_return_on_cancel ✅

- get_source_object ✅

- get_source_tag ✅

- get_task_data ✅

- had_error ✅

- propagate_boolean ✅

- propagate_int ✅

- propagate_pointer ✅

- propagate_value
  > ❌ `[method propagate_value]: Method propagate_value contains an OUT parameter, which is not supported yet`
- return_boolean ✅

- return_error
  > ❌ `[method return_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))`
- return_error_if_cancelled ✅

- return_int ✅

- return_new_error
  > ❌ `[method return_new_error/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- return_pointer
  > ❌ `[method return_pointer/<method parameters>/result_destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`
- return_value ✅

- run_in_thread
  > ❌ `[method run_in_thread/<method parameters>/task_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TaskThreadFunc), @type -> DataRecord(GTaskThreadFunc)))`
- run_in_thread_sync
  > ❌ `[method run_in_thread_sync/<method parameters>/task_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TaskThreadFunc), @type -> DataRecord(GTaskThreadFunc)))`
- set_check_cancellable ✅

- set_name ✅

- set_priority ✅

- set_return_on_cancel ✅

- set_source_tag ✅

- set_static_name ✅

- set_task_data
  > ❌ `[method set_task_data/<method parameters>/task_data_destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`
#### Functions
- is_valid ✅

- report_error
  > ❌ `[function report_error/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- report_new_error
  > ❌ `[function report_new_error/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`

### TcpConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- connect
  > ❌ `[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject`
- get_graceful_disconnect ✅

- set_graceful_disconnect ✅


### TcpWrapperConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- connect
  > ❌ `[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject`
- get_base_io_stream ✅


### TestDBus


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_service_dir ✅

- down ✅

- get_bus_address ✅

- get_flags ✅

- stop ✅

- up ✅

#### Functions
- unset ✅


### ThemedIcon


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_names ✅

- new_with_default_fallbacks ✅

#### Methods
- append_name ✅

- get_names
  > ❌ `[method get_names/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- prepend_name ✅


### ThreadedSocketService


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Signals
- run ✅


### TlsCertificate


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>5</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_file ✅

- new_from_file_with_password ✅

- new_from_files ✅

- new_from_pem ✅

- new_from_pkcs11_uris ✅

- new_from_pkcs12
  > ❌ `[constructor new_from_pkcs12/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guint8*)))`
#### Methods
- get_dns_names
  > ❌ `[method get_dns_names/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GLib.Bytes)))),ListMap(@name -> DataRecord(GLib.PtrArray), @type -> DataRecord(GPtrArray*)))`
- get_ip_addresses
  > ❌ `[method get_ip_addresses/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress)))),ListMap(@name -> DataRecord(GLib.PtrArray), @type -> DataRecord(GPtrArray*)))`
- get_issuer ✅

- get_issuer_name ✅

- get_not_valid_after
  > ❌ `[method get_not_valid_after/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- get_not_valid_before
  > ❌ `[method get_not_valid_before/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- get_subject_name ✅

- is_same ✅

- verify ✅

#### Functions
- list_new_from_file
  > ❌ `[function list_new_from_file/<return type>]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(TlsCertificate))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`

### TlsConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>20</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- emit_accept_certificate ✅

- get_certificate ✅

- get_channel_binding_data
  > ❌ `[method get_channel_binding_data]: Method get_channel_binding_data contains an OUT parameter, which is not supported yet`
- get_ciphersuite_name ✅

- get_database ✅

- get_interaction ✅

- get_negotiated_protocol ✅

- get_peer_certificate ✅

- get_peer_certificate_errors ✅

- get_protocol_version ✅

- get_rehandshake_mode ✅

- get_require_close_notify ✅

- get_use_system_certdb ✅

- handshake ✅

- handshake_async
  > ❌ `[method handshake_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- handshake_finish ✅

- set_advertised_protocols
  > ❌ `[method set_advertised_protocols/<method parameters>/protocols]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- set_certificate ✅

- set_database ✅

- set_interaction ✅

- set_rehandshake_mode ✅

- set_require_close_notify ✅

- set_use_system_certdb ✅

#### Signals
- accept-certificate ✅


### TlsDatabase


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- create_certificate_handle ✅

- lookup_certificate_for_handle ✅

- lookup_certificate_for_handle_async
  > ❌ `[method lookup_certificate_for_handle_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_certificate_for_handle_finish ✅

- lookup_certificate_issuer ✅

- lookup_certificate_issuer_async
  > ❌ `[method lookup_certificate_issuer_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_certificate_issuer_finish ✅

- lookup_certificates_issued_by
  > ❌ `[method lookup_certificates_issued_by/<method parameters>/issuer_raw_dn]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))`
- lookup_certificates_issued_by_async
  > ❌ `[method lookup_certificates_issued_by_async/<method parameters>/issuer_raw_dn]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))`
- lookup_certificates_issued_by_finish
  > ❌ `[method lookup_certificates_issued_by_finish/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(TlsCertificate))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- verify_chain ✅

- verify_chain_async
  > ❌ `[method verify_chain_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- verify_chain_finish ✅


### TlsInteraction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- ask_password ✅

- ask_password_async
  > ❌ `[method ask_password_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- ask_password_finish ✅

- invoke_ask_password ✅

- invoke_request_certificate ✅

- request_certificate ✅

- request_certificate_async
  > ❌ `[method request_certificate_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- request_certificate_finish ✅


### TlsPassword


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_description ✅

- get_flags ✅

- get_value
  > ❌ `[method get_value]: Method get_value contains an OUT parameter, which is not supported yet`
- get_warning ✅

- set_description ✅

- set_flags ✅

- set_value
  > ❌ `[method set_value/<method parameters>/value]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guchar*)))`
- set_value_full
  > ❌ `[method set_value_full/<method parameters>/value]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))`
- set_warning ✅


### UnixConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- connect
  > ❌ `[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject`
- receive_credentials ✅

- receive_credentials_async
  > ❌ `[method receive_credentials_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- receive_credentials_finish ✅

- receive_fd ✅

- send_credentials ✅

- send_credentials_async
  > ❌ `[method send_credentials_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- send_credentials_finish ✅

- send_fd ✅


### UnixCredentialsMessage


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_credentials ✅

#### Methods
- get_credentials ✅

#### Functions
- is_supported ✅


### UnixFDList


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_array
  > ❌ `[constructor new_from_array/fds]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(gint)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gint*)))`
#### Methods
- append ✅

- get ✅

- get_length ✅

- peek_fds
  > ❌ `[method peek_fds]: Method peek_fds contains an OUT parameter, which is not supported yet`
- steal_fds
  > ❌ `[method steal_fds]: Method steal_fds contains an OUT parameter, which is not supported yet`

### UnixFDMessage

❌ `[UnixFDMessage]: Class UnixFDMessage is weird: `


### UnixInputStream

❌ `[UnixInputStream]: Class UnixInputStream is weird: `


### UnixMountMonitor

❌ `[UnixMountMonitor]: Class UnixMountMonitor is weird: `


### UnixOutputStream

❌ `[UnixOutputStream]: Class UnixOutputStream is weird: `


### UnixSocketAddress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_abstract
  > ❌ `[constructor new_abstract/path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))`
- new_with_type
  > ❌ `[constructor new_with_type/path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))`
#### Methods
- get_address_type ✅

- get_is_abstract ✅

- get_path ✅

- get_path_len ✅

#### Functions
- abstract_names_supported ✅


### Vfs


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_file_for_path ✅

- get_file_for_uri ✅

- get_supported_uri_schemes
  > ❌ `[method get_supported_uri_schemes/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- is_active ✅

- parse_name ✅

- register_uri_scheme
  > ❌ `[method register_uri_scheme/<method parameters>/uri_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(VfsFileLookupFunc), @type -> DataRecord(GVfsFileLookupFunc)))`
- unregister_uri_scheme ✅

#### Functions
- get_default ✅

- get_local ✅


### VolumeMonitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>12</tr></table>

#### Methods
- get_connected_drives
  > ❌ `[method get_connected_drives/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Drive))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_mount_for_uuid ✅

- get_mounts
  > ❌ `[method get_mounts/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Mount))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_volume_for_uuid ✅

- get_volumes
  > ❌ `[method get_volumes/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Volume))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
#### Functions
- adopt_orphan_mount ✅

- get ✅

#### Signals
- drive-changed
  > ❌ `[signal drive-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))`
- drive-connected
  > ❌ `[signal drive-connected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))`
- drive-disconnected
  > ❌ `[signal drive-disconnected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))`
- drive-eject-button
  > ❌ `[signal drive-eject-button]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))`
- drive-stop-button
  > ❌ `[signal drive-stop-button]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))`
- mount-added
  > ❌ `[signal mount-added]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))`
- mount-changed
  > ❌ `[signal mount-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))`
- mount-pre-unmount
  > ❌ `[signal mount-pre-unmount]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))`
- mount-removed
  > ❌ `[signal mount-removed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))`
- volume-added
  > ❌ `[signal volume-added]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Volume)))`
- volume-changed
  > ❌ `[signal volume-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Volume)))`
- volume-removed
  > ❌ `[signal volume-removed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Volume)))`

### ZlibCompressor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_file_info ✅

- set_file_info ✅


### ZlibDecompressor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_file_info ✅


## Interfaces
### Action


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>6</tr></table>

#### Methods
- activate
  > ❌ `[method activate/<method parameters>/parameter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- change_state
  > ❌ `[method change_state/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_enabled ✅

- get_name ✅

- get_parameter_type
  > ❌ `[method get_parameter_type/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
- get_state
  > ❌ `[method get_state/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_state_hint
  > ❌ `[method get_state_hint/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_state_type
  > ❌ `[method get_state_type/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
### ActionGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>5</td><td>0</td><td>9</tr></table>

#### Methods
- action_added ✅

- action_enabled_changed ✅

- action_removed ✅

- action_state_changed
  > ❌ `[method action_state_changed/<method parameters>/state]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- activate_action
  > ❌ `[method activate_action/<method parameters>/parameter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- change_action_state
  > ❌ `[method change_action_state/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_action_enabled ✅

- get_action_parameter_type
  > ❌ `[method get_action_parameter_type/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
- get_action_state
  > ❌ `[method get_action_state/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_action_state_hint
  > ❌ `[method get_action_state_hint/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_action_state_type
  > ❌ `[method get_action_state_type/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))`
- has_action ✅

- list_actions
  > ❌ `[method list_actions/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- query_action
  > ❌ `[method query_action]: Method query_action contains an OUT parameter, which is not supported yet`
### ActionMap


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>2</tr></table>

#### Methods
- add_action ✅

- add_action_entries
  > ❌ `[method add_action_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GActionEntry*)))`
- lookup_action ✅

- remove_action ✅

- remove_action_entries
  > ❌ `[method remove_action_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GActionEntry*)))`
### AppInfo


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>22</td><td>0</td><td>3</tr></table>

#### Methods
- add_supports_type ✅

- can_delete ✅

- can_remove_supports_type ✅

- delete ✅

- dup ✅

- equal ✅

- get_commandline ✅

- get_description ✅

- get_display_name ✅

- get_executable ✅

- get_icon ✅

- get_id ✅

- get_name ✅

- get_supported_types ✅

- launch
  > ❌ `[method launch/<method parameters>/files]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(File))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- launch_uris
  > ❌ `[method launch_uris/<method parameters>/uris]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- launch_uris_async
  > ❌ `[method launch_uris_async/<method parameters>/uris]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- launch_uris_finish ✅

- remove_supports_type ✅

- set_as_default_for_extension ✅

- set_as_default_for_type ✅

- set_as_last_used_for_type ✅

- should_show ✅

- supports_files ✅

- supports_uris ✅

### AsyncInitable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>1</tr></table>

#### Methods
- init_async
  > ❌ `[method init_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- init_finish ✅

- new_finish ✅

### AsyncResult


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>4</td><td>0</td><td>0</tr></table>

#### Methods
- get_source_object ✅

- get_user_data ✅

- is_tagged ✅

- legacy_propagate_error ✅

### Converter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>1</td><td>0</td><td>1</tr></table>

#### Methods
- convert
  > ❌ `[method convert]: Method convert contains an OUT parameter, which is not supported yet`
- reset ✅

### DBusInterface


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>1</tr></table>

#### Methods
- dup_object ✅

- get_info
  > ❌ `[method get_info/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))`
- get_object ✅

- set_object ✅

### DBusObject


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>1</tr></table>

#### Methods
- get_interface ✅

- get_interfaces
  > ❌ `[method get_interfaces/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusInterface))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_object_path ✅

### DBusObjectManager


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>1</tr></table>

#### Methods
- get_interface ✅

- get_object ✅

- get_object_path ✅

- get_objects
  > ❌ `[method get_objects/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusObject))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
### DatagramBased


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>3</tr></table>

#### Methods
- condition_check ✅

- condition_wait ✅

- create_source
  > ❌ `[method create_source/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))`
- receive_messages
  > ❌ `[method receive_messages/<method parameters>/messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InputMessage), @type -> DataRecord(GInputMessage)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GInputMessage*)))`
- send_messages
  > ❌ `[method send_messages/<method parameters>/messages]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(OutputMessage), @type -> DataRecord(GOutputMessage)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GOutputMessage*)))`
### DebugController


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>0</tr></table>

#### Methods
- get_debug_enabled ✅

- set_debug_enabled ✅

### DesktopAppInfoLookup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>1</tr></table>

#### Methods
- get_default_for_uri_scheme
  > ❌ `[method get_default_for_uri_scheme]: Method g_desktop_app_info_lookup_get_default_for_uri_scheme has no target types`
### Drive


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>22</td><td>0</td><td>6</tr></table>

#### Methods
- can_eject ✅

- can_poll_for_media ✅

- can_start ✅

- can_start_degraded ✅

- can_stop ✅

- eject
  > ❌ `[method eject/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_finish ✅

- eject_with_operation
  > ❌ `[method eject_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_with_operation_finish ✅

- enumerate_identifiers ✅

- get_icon ✅

- get_identifier ✅

- get_name ✅

- get_sort_key ✅

- get_start_stop_type ✅

- get_symbolic_icon ✅

- get_volumes
  > ❌ `[method get_volumes/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Volume))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- has_media ✅

- has_volumes ✅

- is_media_check_automatic ✅

- is_media_removable ✅

- is_removable ✅

- poll_for_media
  > ❌ `[method poll_for_media/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- poll_for_media_finish ✅

- start
  > ❌ `[method start/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- start_finish ✅

- stop
  > ❌ `[method stop/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- stop_finish ✅

### DtlsClientConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>4</td><td>0</td><td>1</tr></table>

#### Methods
- get_accepted_cas
  > ❌ `[method get_accepted_cas/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}array,ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_server_identity ✅

- get_validation_flags ✅

- set_server_identity ✅

- set_validation_flags ✅

### DtlsConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>22</td><td>0</td><td>5</tr></table>

#### Methods
- close ✅

- close_async
  > ❌ `[method close_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- close_finish ✅

- emit_accept_certificate ✅

- get_certificate ✅

- get_channel_binding_data
  > ❌ `[method get_channel_binding_data]: Method get_channel_binding_data contains an OUT parameter, which is not supported yet`
- get_ciphersuite_name ✅

- get_database ✅

- get_interaction ✅

- get_negotiated_protocol ✅

- get_peer_certificate ✅

- get_peer_certificate_errors ✅

- get_protocol_version ✅

- get_rehandshake_mode ✅

- get_require_close_notify ✅

- handshake ✅

- handshake_async
  > ❌ `[method handshake_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- handshake_finish ✅

- set_advertised_protocols
  > ❌ `[method set_advertised_protocols/<method parameters>/protocols]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(const gchar* const*)))`
- set_certificate ✅

- set_database ✅

- set_interaction ✅

- set_rehandshake_mode ✅

- set_require_close_notify ✅

- shutdown ✅

- shutdown_async
  > ❌ `[method shutdown_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- shutdown_finish ✅

### DtlsServerConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### File


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>80</td><td>0</td><td>49</tr></table>

#### Methods
- append_to ✅

- append_to_async
  > ❌ `[method append_to_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- append_to_finish ✅

- build_attribute_list_for_copy ✅

- copy
  > ❌ `[method copy/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))`
- copy_async
  > ❌ `[method copy_async/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))`
- copy_attributes ✅

- copy_finish ✅

- create ✅

- create_async
  > ❌ `[method create_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- create_finish ✅

- create_readwrite ✅

- create_readwrite_async
  > ❌ `[method create_readwrite_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- create_readwrite_finish ✅

- delete ✅

- delete_async
  > ❌ `[method delete_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- delete_finish ✅

- dup ✅

- eject_mountable
  > ❌ `[method eject_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_mountable_finish ✅

- eject_mountable_with_operation
  > ❌ `[method eject_mountable_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_mountable_with_operation_finish ✅

- enumerate_children ✅

- enumerate_children_async
  > ❌ `[method enumerate_children_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- enumerate_children_finish ✅

- equal ✅

- find_enclosing_mount ✅

- find_enclosing_mount_async
  > ❌ `[method find_enclosing_mount_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- find_enclosing_mount_finish ✅

- get_basename ✅

- get_child ✅

- get_child_for_display_name ✅

- get_parent ✅

- get_parse_name ✅

- get_path ✅

- get_relative_path ✅

- get_uri ✅

- get_uri_scheme ✅

- has_parent ✅

- has_prefix ✅

- has_uri_scheme ✅

- hash ✅

- is_native ✅

- load_bytes
  > ❌ `[method load_bytes]: Method load_bytes contains an OUT parameter, which is not supported yet`
- load_bytes_async
  > ❌ `[method load_bytes_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- load_bytes_finish
  > ❌ `[method load_bytes_finish]: Method load_bytes_finish contains an OUT parameter, which is not supported yet`
- load_contents
  > ❌ `[method load_contents]: Method load_contents contains an OUT parameter, which is not supported yet`
- load_contents_async
  > ❌ `[method load_contents_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- load_contents_finish
  > ❌ `[method load_contents_finish]: Method load_contents_finish contains an OUT parameter, which is not supported yet`
- load_partial_contents_async
  > ❌ `[method load_partial_contents_async/<method parameters>/read_more_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileReadMoreCallback), @type -> DataRecord(GFileReadMoreCallback)))`
- load_partial_contents_finish
  > ❌ `[method load_partial_contents_finish]: Method load_partial_contents_finish contains an OUT parameter, which is not supported yet`
- make_directory ✅

- make_directory_async
  > ❌ `[method make_directory_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- make_directory_finish ✅

- make_directory_with_parents ✅

- make_symbolic_link ✅

- make_symbolic_link_async
  > ❌ `[method make_symbolic_link_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- make_symbolic_link_finish ✅

- measure_disk_usage
  > ❌ `[method measure_disk_usage]: Method measure_disk_usage contains an OUT parameter, which is not supported yet`
- measure_disk_usage_async
  > ❌ `[method measure_disk_usage_async/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileMeasureProgressCallback), @type -> DataRecord(GFileMeasureProgressCallback)))`
- measure_disk_usage_finish
  > ❌ `[method measure_disk_usage_finish]: Method measure_disk_usage_finish contains an OUT parameter, which is not supported yet`
- monitor ✅

- monitor_directory ✅

- monitor_file ✅

- mount_enclosing_volume
  > ❌ `[method mount_enclosing_volume/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- mount_enclosing_volume_finish ✅

- mount_mountable
  > ❌ `[method mount_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- mount_mountable_finish ✅

- move
  > ❌ `[method move/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))`
- move_async
  > ❌ `[method move_async/<method parameters>/progress_callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileProgressCallback), @type -> DataRecord(GFileProgressCallback)))`
- move_finish ✅

- open_readwrite ✅

- open_readwrite_async
  > ❌ `[method open_readwrite_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- open_readwrite_finish ✅

- peek_path ✅

- poll_mountable
  > ❌ `[method poll_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- poll_mountable_finish ✅

- query_default_handler ✅

- query_default_handler_async
  > ❌ `[method query_default_handler_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- query_default_handler_finish ✅

- query_exists ✅

- query_file_type ✅

- query_filesystem_info ✅

- query_filesystem_info_async
  > ❌ `[method query_filesystem_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- query_filesystem_info_finish ✅

- query_info ✅

- query_info_async
  > ❌ `[method query_info_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- query_info_finish ✅

- query_settable_attributes
  > ❌ `[method query_settable_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FileAttributeInfoList), @type -> DataRecord(GFileAttributeInfoList*)))`
- query_writable_namespaces
  > ❌ `[method query_writable_namespaces/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FileAttributeInfoList), @type -> DataRecord(GFileAttributeInfoList*)))`
- read ✅

- read_async
  > ❌ `[method read_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- read_finish ✅

- replace ✅

- replace_async
  > ❌ `[method replace_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- replace_contents
  > ❌ `[method replace_contents]: Method replace_contents contains an OUT parameter, which is not supported yet`
- replace_contents_async
  > ❌ `[method replace_contents_async/<method parameters>/contents]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char*)))`
- replace_contents_bytes_async
  > ❌ `[method replace_contents_bytes_async/<method parameters>/contents]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- replace_contents_finish
  > ❌ `[method replace_contents_finish]: Method replace_contents_finish contains an OUT parameter, which is not supported yet`
- replace_finish ✅

- replace_readwrite ✅

- replace_readwrite_async
  > ❌ `[method replace_readwrite_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- replace_readwrite_finish ✅

- resolve_relative_path ✅

- set_attribute ✅

- set_attribute_byte_string ✅

- set_attribute_int32 ✅

- set_attribute_int64 ✅

- set_attribute_string ✅

- set_attribute_uint32 ✅

- set_attribute_uint64 ✅

- set_attributes_async
  > ❌ `[method set_attributes_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- set_attributes_finish
  > ❌ `[method set_attributes_finish]: Method set_attributes_finish contains an OUT parameter, which is not supported yet`
- set_attributes_from_info ✅

- set_display_name ✅

- set_display_name_async
  > ❌ `[method set_display_name_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- set_display_name_finish ✅

- start_mountable
  > ❌ `[method start_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- start_mountable_finish ✅

- stop_mountable
  > ❌ `[method stop_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- stop_mountable_finish ✅

- supports_thread_contexts ✅

- trash ✅

- trash_async
  > ❌ `[method trash_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- trash_finish ✅

- unmount_mountable
  > ❌ `[method unmount_mountable/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- unmount_mountable_finish ✅

- unmount_mountable_with_operation
  > ❌ `[method unmount_mountable_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- unmount_mountable_with_operation_finish ✅

### FileDescriptorBased


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>1</tr></table>

#### Methods
- get_fd
  > ❌ `[method get_fd]: Method g_file_descriptor_based_get_fd has no target types`
### Icon


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>1</tr></table>

#### Methods
- equal ✅

- hash ✅

- serialize
  > ❌ `[method serialize/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- to_string ✅

### Initable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- init ✅

### ListModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>5</td><td>0</td><td>0</tr></table>

#### Methods
- get_item ✅

- get_item_type ✅

- get_n_items ✅

- get_object ✅

- items_changed ✅

### LoadableIcon


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>3</tr></table>

#### Methods
- load
  > ❌ `[method load]: Method load contains an OUT parameter, which is not supported yet`
- load_async
  > ❌ `[method load_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- load_finish
  > ❌ `[method load_finish]: Method load_finish contains an OUT parameter, which is not supported yet`
### MemoryMonitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### Mount


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>19</td><td>0</td><td>8</tr></table>

#### Methods
- can_eject ✅

- can_unmount ✅

- eject
  > ❌ `[method eject/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_finish ✅

- eject_with_operation
  > ❌ `[method eject_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_with_operation_finish ✅

- get_default_location ✅

- get_drive ✅

- get_icon ✅

- get_name ✅

- get_root ✅

- get_sort_key ✅

- get_symbolic_icon ✅

- get_uuid ✅

- get_volume ✅

- guess_content_type
  > ❌ `[method guess_content_type/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- guess_content_type_finish
  > ❌ `[method guess_content_type_finish/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- guess_content_type_sync
  > ❌ `[method guess_content_type_sync/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- is_shadowed ✅

- remount
  > ❌ `[method remount/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- remount_finish ✅

- shadow ✅

- unmount
  > ❌ `[method unmount/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- unmount_finish ✅

- unmount_with_operation
  > ❌ `[method unmount_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- unmount_with_operation_finish ✅

- unshadow ✅

### NetworkMonitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>5</td><td>0</td><td>1</tr></table>

#### Methods
- can_reach ✅

- can_reach_async
  > ❌ `[method can_reach_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- can_reach_finish ✅

- get_connectivity ✅

- get_network_available ✅

- get_network_metered ✅

### PollableInputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>2</tr></table>

#### Methods
- can_poll ✅

- create_source
  > ❌ `[method create_source/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))`
- is_readable ✅

- read_nonblocking
  > ❌ `[method read_nonblocking]: Method read_nonblocking contains an OUT parameter, which is not supported yet`
### PollableOutputStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>3</tr></table>

#### Methods
- can_poll ✅

- create_source
  > ❌ `[method create_source/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))`
- is_writable ✅

- write_nonblocking
  > ❌ `[method write_nonblocking/<method parameters>/buffer]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(void*)))`
- writev_nonblocking
  > ❌ `[method writev_nonblocking]: Method writev_nonblocking contains an OUT parameter, which is not supported yet`
### PowerProfileMonitor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- get_power_saver_enabled ✅

### Proxy


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>1</tr></table>

#### Methods
- connect ✅

- connect_async
  > ❌ `[method connect_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- connect_finish ✅

- supports_hostname ✅

### ProxyResolver


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>1</td><td>0</td><td>3</tr></table>

#### Methods
- is_supported ✅

- lookup
  > ❌ `[method lookup/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
- lookup_async
  > ❌ `[method lookup_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- lookup_finish
  > ❌ `[method lookup_finish/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))`
### RemoteActionGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>2</tr></table>

#### Methods
- activate_action_full
  > ❌ `[method activate_action_full/<method parameters>/parameter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- change_action_state_full
  > ❌ `[method change_action_state_full/<method parameters>/value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
### Seekable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>5</td><td>0</td><td>0</tr></table>

#### Methods
- can_seek ✅

- can_truncate ✅

- seek ✅

- tell ✅

- truncate ✅

### SocketConnectable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>0</tr></table>

#### Methods
- enumerate ✅

- proxy_enumerate ✅

- to_string ✅

### TlsBackend


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>10</td><td>0</td><td>0</tr></table>

#### Methods
- get_certificate_type ✅

- get_client_connection_type ✅

- get_default_database ✅

- get_dtls_client_connection_type ✅

- get_dtls_server_connection_type ✅

- get_file_database_type ✅

- get_server_connection_type ✅

- set_default_database ✅

- supports_dtls ✅

- supports_tls ✅

### TlsClientConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>7</td><td>0</td><td>1</tr></table>

#### Methods
- copy_session_state ✅

- get_accepted_cas
  > ❌ `[method get_accepted_cas/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}array,ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_server_identity ✅

- get_use_ssl3 ✅

- get_validation_flags ✅

- set_server_identity ✅

- set_use_ssl3 ✅

- set_validation_flags ✅

### TlsFileDatabase


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### TlsServerConnection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### Volume


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>16</td><td>0</td><td>3</tr></table>

#### Methods
- can_eject ✅

- can_mount ✅

- eject
  > ❌ `[method eject/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_finish ✅

- eject_with_operation
  > ❌ `[method eject_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- eject_with_operation_finish ✅

- enumerate_identifiers ✅

- get_activation_root ✅

- get_drive ✅

- get_icon ✅

- get_identifier ✅

- get_mount ✅

- get_name ✅

- get_sort_key ✅

- get_symbolic_icon ✅

- get_uuid ✅

- mount
  > ❌ `[method mount/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- mount_finish ✅

- should_automount ✅

## Enums
- BusType ✅

- ConverterResult ✅

- CredentialsType ✅

- DBusError ✅

- DBusMessageByteOrder ✅

- DBusMessageHeaderField ✅

- DBusMessageType ✅

- DataStreamByteOrder ✅

- DataStreamNewlineType ✅

- DriveStartStopType ✅

- EmblemOrigin ✅

- FileAttributeStatus ✅

- FileAttributeType ✅

- FileMonitorEvent ✅

- FileType ✅

- FilesystemPreviewType ✅

- IOErrorEnum ✅

- IOModuleScopeFlags ✅

- MemoryMonitorWarningLevel ✅

- MountOperationResult ✅

- NetworkConnectivity ✅

- NotificationPriority ✅

- PasswordSave ✅

- PollableReturn ✅

- ResolverError ✅

- ResolverRecordType ✅

- ResourceError ✅

- SocketClientEvent ✅

- SocketFamily ✅

- SocketListenerEvent ✅

- SocketProtocol ✅

- SocketType ✅

- TlsAuthenticationMode ✅

- TlsCertificateRequestFlags ✅

- TlsChannelBindingError ✅

- TlsChannelBindingType ✅

- TlsDatabaseLookupFlags ✅

- TlsError ✅

- TlsInteractionResult ✅

- TlsProtocolVersion ✅

- TlsRehandshakeMode ✅

- UnixSocketAddressType ✅

- ZlibCompressorFormat ✅

## Bitfields
- AppInfoCreateFlags ✅

- ApplicationFlags ✅

- AskPasswordFlags ✅

- BusNameOwnerFlags ✅

- BusNameWatcherFlags ✅

- ConverterFlags ✅

- DBusCallFlags ✅

- DBusCapabilityFlags ✅

- DBusConnectionFlags ✅

- DBusInterfaceSkeletonFlags ✅

- DBusMessageFlags ✅

- DBusObjectManagerClientFlags ✅

- DBusPropertyInfoFlags ✅

- DBusProxyFlags ✅

- DBusSendMessageFlags ✅

- DBusServerFlags ✅

- DBusSignalFlags ✅

- DBusSubtreeFlags ✅

- DriveStartFlags ✅

- FileAttributeInfoFlags ✅

- FileCopyFlags ✅

- FileCreateFlags ✅

- FileMeasureFlags ✅

- FileMonitorFlags ✅

- FileQueryInfoFlags ✅

- IOStreamSpliceFlags ✅

- MountMountFlags ✅

- MountUnmountFlags ✅

- OutputStreamSpliceFlags ✅

- ResolverNameLookupFlags ✅

- ResourceFlags ✅

- ResourceLookupFlags ✅

- SettingsBindFlags ✅

- SocketMsgFlags ✅

- SubprocessFlags ✅

- TestDBusFlags ✅

- TlsCertificateFlags ✅

- TlsDatabaseVerifyFlags ✅

- TlsPasswordFlags ✅

## Constants
- DBUS_METHOD_INVOCATION_HANDLED ✅

- DBUS_METHOD_INVOCATION_UNHANDLED ✅

- DEBUG_CONTROLLER_EXTENSION_POINT_NAME ✅

- DESKTOP_APP_INFO_LOOKUP_EXTENSION_POINT_NAME ✅

- DRIVE_IDENTIFIER_KIND_UNIX_DEVICE ✅

- FILE_ATTRIBUTE_ACCESS_CAN_DELETE ✅

- FILE_ATTRIBUTE_ACCESS_CAN_EXECUTE ✅

- FILE_ATTRIBUTE_ACCESS_CAN_READ ✅

- FILE_ATTRIBUTE_ACCESS_CAN_RENAME ✅

- FILE_ATTRIBUTE_ACCESS_CAN_TRASH ✅

- FILE_ATTRIBUTE_ACCESS_CAN_WRITE ✅

- FILE_ATTRIBUTE_DOS_IS_ARCHIVE ✅

- FILE_ATTRIBUTE_DOS_IS_MOUNTPOINT ✅

- FILE_ATTRIBUTE_DOS_IS_SYSTEM ✅

- FILE_ATTRIBUTE_DOS_REPARSE_POINT_TAG ✅

- FILE_ATTRIBUTE_ETAG_VALUE ✅

- FILE_ATTRIBUTE_FILESYSTEM_FREE ✅

- FILE_ATTRIBUTE_FILESYSTEM_READONLY ✅

- FILE_ATTRIBUTE_FILESYSTEM_REMOTE ✅

- FILE_ATTRIBUTE_FILESYSTEM_SIZE ✅

- FILE_ATTRIBUTE_FILESYSTEM_TYPE ✅

- FILE_ATTRIBUTE_FILESYSTEM_USED ✅

- FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW ✅

- FILE_ATTRIBUTE_GVFS_BACKEND ✅

- FILE_ATTRIBUTE_ID_FILE ✅

- FILE_ATTRIBUTE_ID_FILESYSTEM ✅

- FILE_ATTRIBUTE_MOUNTABLE_CAN_EJECT ✅

- FILE_ATTRIBUTE_MOUNTABLE_CAN_MOUNT ✅

- FILE_ATTRIBUTE_MOUNTABLE_CAN_POLL ✅

- FILE_ATTRIBUTE_MOUNTABLE_CAN_START ✅

- FILE_ATTRIBUTE_MOUNTABLE_CAN_START_DEGRADED ✅

- FILE_ATTRIBUTE_MOUNTABLE_CAN_STOP ✅

- FILE_ATTRIBUTE_MOUNTABLE_CAN_UNMOUNT ✅

- FILE_ATTRIBUTE_MOUNTABLE_HAL_UDI ✅

- FILE_ATTRIBUTE_MOUNTABLE_IS_MEDIA_CHECK_AUTOMATIC ✅

- FILE_ATTRIBUTE_MOUNTABLE_START_STOP_TYPE ✅

- FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE ✅

- FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE_FILE ✅

- FILE_ATTRIBUTE_OWNER_GROUP ✅

- FILE_ATTRIBUTE_OWNER_USER ✅

- FILE_ATTRIBUTE_OWNER_USER_REAL ✅

- FILE_ATTRIBUTE_PREVIEW_ICON ✅

- FILE_ATTRIBUTE_RECENT_MODIFIED ✅

- FILE_ATTRIBUTE_SELINUX_CONTEXT ✅

- FILE_ATTRIBUTE_STANDARD_ALLOCATED_SIZE ✅

- FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE ✅

- FILE_ATTRIBUTE_STANDARD_COPY_NAME ✅

- FILE_ATTRIBUTE_STANDARD_DESCRIPTION ✅

- FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME ✅

- FILE_ATTRIBUTE_STANDARD_EDIT_NAME ✅

- FILE_ATTRIBUTE_STANDARD_FAST_CONTENT_TYPE ✅

- FILE_ATTRIBUTE_STANDARD_ICON ✅

- FILE_ATTRIBUTE_STANDARD_IS_BACKUP ✅

- FILE_ATTRIBUTE_STANDARD_IS_HIDDEN ✅

- FILE_ATTRIBUTE_STANDARD_IS_SYMLINK ✅

- FILE_ATTRIBUTE_STANDARD_IS_VIRTUAL ✅

- FILE_ATTRIBUTE_STANDARD_IS_VOLATILE ✅

- FILE_ATTRIBUTE_STANDARD_NAME ✅

- FILE_ATTRIBUTE_STANDARD_SIZE ✅

- FILE_ATTRIBUTE_STANDARD_SORT_ORDER ✅

- FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON ✅

- FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET ✅

- FILE_ATTRIBUTE_STANDARD_TARGET_URI ✅

- FILE_ATTRIBUTE_STANDARD_TYPE ✅

- FILE_ATTRIBUTE_THUMBNAILING_FAILED ✅

- FILE_ATTRIBUTE_THUMBNAILING_FAILED_LARGE ✅

- FILE_ATTRIBUTE_THUMBNAILING_FAILED_NORMAL ✅

- FILE_ATTRIBUTE_THUMBNAILING_FAILED_XLARGE ✅

- FILE_ATTRIBUTE_THUMBNAILING_FAILED_XXLARGE ✅

- FILE_ATTRIBUTE_THUMBNAIL_IS_VALID ✅

- FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_LARGE ✅

- FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_NORMAL ✅

- FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_XLARGE ✅

- FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_XXLARGE ✅

- FILE_ATTRIBUTE_THUMBNAIL_PATH ✅

- FILE_ATTRIBUTE_THUMBNAIL_PATH_LARGE ✅

- FILE_ATTRIBUTE_THUMBNAIL_PATH_NORMAL ✅

- FILE_ATTRIBUTE_THUMBNAIL_PATH_XLARGE ✅

- FILE_ATTRIBUTE_THUMBNAIL_PATH_XXLARGE ✅

- FILE_ATTRIBUTE_TIME_ACCESS ✅

- FILE_ATTRIBUTE_TIME_ACCESS_NSEC ✅

- FILE_ATTRIBUTE_TIME_ACCESS_USEC ✅

- FILE_ATTRIBUTE_TIME_CHANGED ✅

- FILE_ATTRIBUTE_TIME_CHANGED_NSEC ✅

- FILE_ATTRIBUTE_TIME_CHANGED_USEC ✅

- FILE_ATTRIBUTE_TIME_CREATED ✅

- FILE_ATTRIBUTE_TIME_CREATED_NSEC ✅

- FILE_ATTRIBUTE_TIME_CREATED_USEC ✅

- FILE_ATTRIBUTE_TIME_MODIFIED ✅

- FILE_ATTRIBUTE_TIME_MODIFIED_NSEC ✅

- FILE_ATTRIBUTE_TIME_MODIFIED_USEC ✅

- FILE_ATTRIBUTE_TRASH_DELETION_DATE ✅

- FILE_ATTRIBUTE_TRASH_ITEM_COUNT ✅

- FILE_ATTRIBUTE_TRASH_ORIG_PATH ✅

- FILE_ATTRIBUTE_UNIX_BLOCKS ✅

- FILE_ATTRIBUTE_UNIX_BLOCK_SIZE ✅

- FILE_ATTRIBUTE_UNIX_DEVICE ✅

- FILE_ATTRIBUTE_UNIX_GID ✅

- FILE_ATTRIBUTE_UNIX_INODE ✅

- FILE_ATTRIBUTE_UNIX_IS_MOUNTPOINT ✅

- FILE_ATTRIBUTE_UNIX_MODE ✅

- FILE_ATTRIBUTE_UNIX_NLINK ✅

- FILE_ATTRIBUTE_UNIX_RDEV ✅

- FILE_ATTRIBUTE_UNIX_UID ✅

- MEMORY_MONITOR_EXTENSION_POINT_NAME ✅

- MENU_ATTRIBUTE_ACTION ✅

- MENU_ATTRIBUTE_ACTION_NAMESPACE ✅

- MENU_ATTRIBUTE_ICON ✅

- MENU_ATTRIBUTE_LABEL ✅

- MENU_ATTRIBUTE_TARGET ✅

- MENU_EXPORTER_MAX_SECTION_SIZE ✅

- MENU_LINK_SECTION ✅

- MENU_LINK_SUBMENU ✅

- NATIVE_VOLUME_MONITOR_EXTENSION_POINT_NAME ✅

- NETWORK_MONITOR_EXTENSION_POINT_NAME ✅

- POWER_PROFILE_MONITOR_EXTENSION_POINT_NAME ✅

- PROXY_EXTENSION_POINT_NAME ✅

- PROXY_RESOLVER_EXTENSION_POINT_NAME ✅

- SETTINGS_BACKEND_EXTENSION_POINT_NAME ✅

- TLS_BACKEND_EXTENSION_POINT_NAME ✅

- TLS_DATABASE_PURPOSE_AUTHENTICATE_CLIENT ✅

- TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER ✅

- VFS_EXTENSION_POINT_NAME ✅

- VOLUME_IDENTIFIER_KIND_CLASS ✅

- VOLUME_IDENTIFIER_KIND_HAL_UDI ✅

- VOLUME_IDENTIFIER_KIND_LABEL ✅

- VOLUME_IDENTIFIER_KIND_NFS_MOUNT ✅

- VOLUME_IDENTIFIER_KIND_UNIX_DEVICE ✅

- VOLUME_IDENTIFIER_KIND_UUID ✅

- VOLUME_MONITOR_EXTENSION_POINT_NAME ✅

# GLib

## Enums
- BookmarkFileError ✅

- ChecksumType ✅

- ConvertError ✅

- DateDMY ✅

- DateMonth ✅

- DateWeekday ✅

- ErrorType ✅

- FileError ✅

- IOChannelError ✅

- IOError ✅

- IOStatus ✅

- KeyFileError ✅

- LogWriterOutput ✅

- MarkupError ✅

- NormalizeMode ✅

- NumberParserError ✅

- OnceStatus ✅

- OptionArg ✅

- OptionError ✅

- RegexError ✅

- SeekType ✅

- ShellError ✅

- SliceConfig ✅

- SpawnError ✅

- TestFileType ✅

- TestLogType ✅

- TestResult ✅

- ThreadError ✅

- TimeType ✅

- TokenType ✅

- TraverseType ✅

- UnicodeBreakType ✅

- UnicodeScript ✅

- UnicodeType ✅

- UriError ✅

- UserDirectory ✅

- VariantClass ✅

- VariantParseError ✅

## Bitfields
- AsciiType ✅

- FileSetContentsFlags ✅

- FileTest ✅

- FormatSizeFlags ✅

- HookFlagMask ✅

- IOCondition ✅

- IOFlags ✅

- KeyFileFlags ✅

- LogLevelFlags ✅

- MainContextFlags ✅

- MarkupCollectType ✅

- MarkupParseFlags ✅

- OptionFlags ✅

- RegexCompileFlags ✅

- RegexMatchFlags ✅

- SpawnFlags ✅

- TestSubprocessFlags ✅

- TestTrapFlags ✅

- TraverseFlags ✅

- UriFlags ✅

- UriHideFlags ✅

- UriParamsFlags ✅

## Constants
- ANALYZER_ANALYZING ✅

- ASCII_DTOSTR_BUF_SIZE ✅

- ATOMIC_REF_COUNT_INIT ✅

- BIG_ENDIAN ✅

- CSET_A_2_Z ✅

- CSET_DIGITS ✅

- CSET_a_2_z ✅

- C_STD_VERSION ✅

- DATALIST_FLAGS_MASK ✅

- DATE_BAD_DAY ✅

- DATE_BAD_JULIAN ✅

- DATE_BAD_YEAR ✅

- DIR_SEPARATOR ✅

- DIR_SEPARATOR_S ✅

- E ✅

- GINT16_FORMAT ✅

- GINT16_MODIFIER ✅

- GINT32_FORMAT ✅

- GINT32_MODIFIER ✅

- GINT64_FORMAT ✅

- GINT64_MODIFIER ✅

- GINTPTR_FORMAT ✅

- GINTPTR_MODIFIER ✅

- GNUC_FUNCTION ✅

- GNUC_PRETTY_FUNCTION ✅

- GSIZE_FORMAT ✅

- GSIZE_MODIFIER ✅

- GSSIZE_FORMAT ✅

- GSSIZE_MODIFIER ✅

- GUINT16_FORMAT ✅

- GUINT32_FORMAT ✅

- GUINT64_FORMAT ✅

- GUINTPTR_FORMAT ✅

- HAVE_GINT64 ✅

- HAVE_GNUC_VARARGS ✅

- HAVE_GNUC_VISIBILITY ✅

- HAVE_GROWING_STACK ✅

- HAVE_ISO_VARARGS ✅

- HOOK_FLAG_USER_SHIFT ✅

- IEEE754_DOUBLE_BIAS ✅

- IEEE754_FLOAT_BIAS ✅

- KEY_FILE_DESKTOP_GROUP ✅

- KEY_FILE_DESKTOP_KEY_ACTIONS ✅

- KEY_FILE_DESKTOP_KEY_CATEGORIES ✅

- KEY_FILE_DESKTOP_KEY_COMMENT ✅

- KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE ✅

- KEY_FILE_DESKTOP_KEY_EXEC ✅

- KEY_FILE_DESKTOP_KEY_GENERIC_NAME ✅

- KEY_FILE_DESKTOP_KEY_HIDDEN ✅

- KEY_FILE_DESKTOP_KEY_ICON ✅

- KEY_FILE_DESKTOP_KEY_MIME_TYPE ✅

- KEY_FILE_DESKTOP_KEY_NAME ✅

- KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN ✅

- KEY_FILE_DESKTOP_KEY_NO_DISPLAY ✅

- KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN ✅

- KEY_FILE_DESKTOP_KEY_PATH ✅

- KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY ✅

- KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS ✅

- KEY_FILE_DESKTOP_KEY_TERMINAL ✅

- KEY_FILE_DESKTOP_KEY_TRY_EXEC ✅

- KEY_FILE_DESKTOP_KEY_TYPE ✅

- KEY_FILE_DESKTOP_KEY_URL ✅

- KEY_FILE_DESKTOP_KEY_VERSION ✅

- KEY_FILE_DESKTOP_TYPE_APPLICATION ✅

- KEY_FILE_DESKTOP_TYPE_DIRECTORY ✅

- KEY_FILE_DESKTOP_TYPE_LINK ✅

- LITTLE_ENDIAN ✅

- LN10 ✅

- LN2 ✅

- LOG_2_BASE_10 ✅

- LOG_DOMAIN
  > ❌ `[LOG_DOMAIN:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gchar), @type -> DataRecord(gchar))) with raw value `0``
- LOG_FATAL_MASK ✅

- LOG_LEVEL_USER_SHIFT ✅

- MAJOR_VERSION ✅

- MAXINT16
  > ❌ `[MAXINT16:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint16), @type -> DataRecord(gint16))) with raw value `32767``
- MAXINT32
  > ❌ `[MAXINT32:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint32), @type -> DataRecord(gint32))) with raw value `2147483647``
- MAXINT64
  > ❌ `[MAXINT64:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `9223372036854775807``
- MAXINT8
  > ❌ `[MAXINT8:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8))) with raw value `127``
- MAXUINT16
  > ❌ `[MAXUINT16:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint16), @type -> DataRecord(guint16))) with raw value `65535``
- MAXUINT32
  > ❌ `[MAXUINT32:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint32), @type -> DataRecord(guint32))) with raw value `4294967295``
- MAXUINT64
  > ❌ `[MAXUINT64:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint64), @type -> DataRecord(guint64))) with raw value `18446744073709551615``
- MAXUINT8
  > ❌ `[MAXUINT8:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8))) with raw value `255``
- MICRO_VERSION ✅

- MININT16
  > ❌ `[MININT16:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint16), @type -> DataRecord(gint16))) with raw value `-32768``
- MININT32
  > ❌ `[MININT32:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint32), @type -> DataRecord(gint32))) with raw value `-2147483648``
- MININT64
  > ❌ `[MININT64:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `-9223372036854775808``
- MININT8
  > ❌ `[MININT8:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8))) with raw value `-128``
- MINOR_VERSION ✅

- MODULE_SUFFIX ✅

- OPTION_REMAINING ✅

- PDP_ENDIAN ✅

- PI ✅

- PID_FORMAT ✅

- PI_2 ✅

- PI_4 ✅

- POLLFD_FORMAT ✅

- PRIORITY_DEFAULT ✅

- PRIORITY_DEFAULT_IDLE ✅

- PRIORITY_HIGH ✅

- PRIORITY_HIGH_IDLE ✅

- PRIORITY_LOW ✅

- REF_COUNT_INIT ✅

- SEARCHPATH_SEPARATOR ✅

- SEARCHPATH_SEPARATOR_S ✅

- SIZEOF_LONG ✅

- SIZEOF_SIZE_T ✅

- SIZEOF_SSIZE_T ✅

- SIZEOF_VOID_P ✅

- SOURCE_CONTINUE ✅

- SOURCE_REMOVE ✅

- SQRT2 ✅

- STR_DELIMITERS ✅

- SYSDEF_AF_INET ✅

- SYSDEF_AF_INET6 ✅

- SYSDEF_AF_UNIX ✅

- SYSDEF_MSG_DONTROUTE ✅

- SYSDEF_MSG_OOB ✅

- SYSDEF_MSG_PEEK ✅

- TEST_OPTION_ISOLATE_DIRS ✅

- TIME_SPAN_DAY
  > ❌ `[TIME_SPAN_DAY:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `86400000000``
- TIME_SPAN_HOUR
  > ❌ `[TIME_SPAN_HOUR:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `3600000000``
- TIME_SPAN_MILLISECOND
  > ❌ `[TIME_SPAN_MILLISECOND:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `1000``
- TIME_SPAN_MINUTE
  > ❌ `[TIME_SPAN_MINUTE:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `60000000``
- TIME_SPAN_SECOND
  > ❌ `[TIME_SPAN_SECOND:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `1000000``
- UNICHAR_MAX_DECOMPOSITION_LENGTH ✅

- URI_RESERVED_CHARS_GENERIC_DELIMITERS ✅

- URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS ✅

- USEC_PER_SEC ✅

- VA_COPY_AS_ARRAY ✅

- VERSION_MIN_REQUIRED ✅

- WIN32_MSG_HANDLE ✅

- macro__has_attribute___noreturn__ ✅

# GObject

## Classes
### Binding


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- dup_source ✅

- dup_target ✅

- get_flags ✅

- get_source ✅

- get_source_property ✅

- get_target ✅

- get_target_property ✅

- unbind ✅


### BindingGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- bind ✅

- bind_full
  > ❌ `[method bind_full/<method parameters>/transform_to]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BindingTransformFunc), @type -> DataRecord(GBindingTransformFunc)))`
- bind_with_closures
  > ❌ `[method bind_with_closures/<method parameters>/transform_to]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))`
- dup_source ✅

- set_source ✅


### InitiallyUnowned


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### Object


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>3</tr>
<tr><td>methods</td><td>18</td><td>0</td><td>25</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_valist ✅

- new_with_properties
  > ❌ `[constructor new_with_properties/values]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GValue*)))`
- newv
  > ❌ `[constructor newv/parameters]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Parameter), @type -> DataRecord(GParameter)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GParameter*)))`
#### Methods
- add_toggle_ref
  > ❌ `[method add_toggle_ref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ToggleNotify), @type -> DataRecord(GToggleNotify)))`
- add_weak_pointer
  > ❌ `[method add_weak_pointer]: Method add_weak_pointer contains an INOUT parameter, which is not supported yet`
- bind_property ✅

- bind_property_full
  > ❌ `[method bind_property_full/<method parameters>/transform_to]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BindingTransformFunc), @type -> DataRecord(GBindingTransformFunc)))`
- bind_property_with_closures
  > ❌ `[method bind_property_with_closures/<method parameters>/transform_to]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))`
- connect
  > ❌ `[method connect/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- disconnect
  > ❌ `[method disconnect/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- dup_data
  > ❌ `[method dup_data/<method parameters>/dup_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DuplicateFunc), @type -> DataRecord(GDuplicateFunc)))`
- dup_qdata
  > ❌ `[method dup_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- force_floating ✅

- freeze_notify ✅

- get
  > ❌ `[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_data ✅

- get_property ✅

- get_qdata
  > ❌ `[method get_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- get_valist
  > ❌ `[method get_valist]: Method get_valist is weird: conflicting override`
- getv
  > ❌ `[method getv/<method parameters>/names]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const gchar**)))`
- is_floating ✅

- notify ✅

- notify_by_pspec ✅

- ref ✅

- ref_sink ✅

- remove_toggle_ref
  > ❌ `[method remove_toggle_ref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ToggleNotify), @type -> DataRecord(GToggleNotify)))`
- remove_weak_pointer
  > ❌ `[method remove_weak_pointer]: Method remove_weak_pointer contains an INOUT parameter, which is not supported yet`
- replace_data
  > ❌ `[method replace_data]: Method replace_data contains an OUT parameter, which is not supported yet`
- replace_qdata
  > ❌ `[method replace_qdata]: Method replace_qdata contains an OUT parameter, which is not supported yet`
- run_dispose ✅

- set
  > ❌ `[method set/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_data ✅

- set_data_full
  > ❌ `[method set_data_full/<method parameters>/destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))`
- set_property ✅

- set_qdata
  > ❌ `[method set_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- set_qdata_full
  > ❌ `[method set_qdata_full/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- set_valist ✅

- setv
  > ❌ `[method setv/<method parameters>/names]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const gchar**)))`
- steal_data ✅

- steal_qdata
  > ❌ `[method steal_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- take_ref ✅

- thaw_notify ✅

- unref ✅

- watch_closure
  > ❌ `[method watch_closure/<method parameters>/closure]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))`
- weak_ref
  > ❌ `[method weak_ref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(WeakNotify), @type -> DataRecord(GWeakNotify)))`
- weak_unref
  > ❌ `[method weak_unref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(WeakNotify), @type -> DataRecord(GWeakNotify)))`
#### Functions
- compat_control ✅

- interface_find_property
  > ❌ `[function interface_find_property/<function parameters>/g_iface]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TypeInterface), @type -> DataRecord(gpointer)))`
- interface_install_property
  > ❌ `[function interface_install_property/<function parameters>/g_iface]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TypeInterface), @type -> DataRecord(gpointer)))`
- interface_list_properties
  > ❌ `[function interface_list_properties]: Function interface_list_properties is weird: non NULL-terminated arrays require special handling`
#### Signals
- notify ✅


### ParamSpec


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_blurb ✅

- get_default_value ✅

- get_name ✅

- get_name_quark
  > ❌ `[method get_name_quark/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- get_nick ✅

- get_qdata
  > ❌ `[method get_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- get_redirect_target ✅

- ref ✅

- ref_sink ✅

- set_qdata
  > ❌ `[method set_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- set_qdata_full
  > ❌ `[method set_qdata_full/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- sink ✅

- steal_qdata
  > ❌ `[method steal_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- unref ✅

#### Functions
- internal ✅

- is_valid_name ✅


### ParamSpecBoolean


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecBoxed


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecChar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecDouble


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecEnum


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecFlags


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecFloat


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecGType


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecInt


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecInt64


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecLong


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecObject


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecOverride


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecParam


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecPointer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecString


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecUChar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecUInt


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecUInt64


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecULong


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecUnichar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecValueArray


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ParamSpecVariant


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### SignalGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- block ✅

- connect
  > ❌ `[method connect/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))`
- connect_after
  > ❌ `[method connect_after/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))`
- connect_closure
  > ❌ `[method connect_closure/<method parameters>/closure]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))`
- connect_data
  > ❌ `[method connect_data/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))`
- connect_object
  > ❌ `[method connect_object/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))`
- connect_swapped
  > ❌ `[method connect_swapped/<method parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))`
- dup_target ✅

- set_target ✅

- unblock ✅

#### Signals
- bind ✅

- unbind ✅


### TypeModule


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- add_interface
  > ❌ `[method add_interface/<method parameters>/interface_info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(InterfaceInfo), @type -> DataRecord(const GInterfaceInfo*)))`
- register_enum
  > ❌ `[method register_enum/<method parameters>/const_static_values]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(EnumValue), @type -> DataRecord(const GEnumValue*)))`
- register_flags
  > ❌ `[method register_flags/<method parameters>/const_static_values]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FlagsValue), @type -> DataRecord(const GFlagsValue*)))`
- register_type
  > ❌ `[method register_type/<method parameters>/type_info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TypeInfo), @type -> DataRecord(const GTypeInfo*)))`
- set_name ✅

- unuse
  > ❌ `[method unuse]: Method unuse is weird: I don't want to deal with this`
- use
  > ❌ `[method use]: Method use is weird: Incompatible override between TypeModule and TypePlugin`

## Interfaces
### TypePlugin


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>2</tr></table>

#### Methods
- complete_interface_info
  > ❌ `[method complete_interface_info/<method parameters>/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(InterfaceInfo), @type -> DataRecord(GInterfaceInfo*)))`
- complete_type_info
  > ❌ `[method complete_type_info/<method parameters>/info]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TypeInfo), @type -> DataRecord(GTypeInfo*)))`
- unuse ✅

- use ✅

## Bitfields
- BindingFlags ✅

- ConnectFlags ✅

- ParamFlags ✅

- SignalFlags ✅

- SignalMatchType ✅

- TypeDebugFlags ✅

- TypeFlags ✅

- TypeFundamentalFlags ✅

## Constants
- PARAM_MASK ✅

- PARAM_STATIC_STRINGS ✅

- PARAM_USER_SHIFT ✅

- SIGNAL_FLAGS_MASK ✅

- SIGNAL_MATCH_MASK ✅

- TYPE_FLAG_RESERVED_ID_BIT
  > ❌ `[TYPE_FLAG_RESERVED_ID_BIT:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(GLib.Type), @type -> DataRecord(GType))) with raw value `1``
- TYPE_FUNDAMENTAL_MAX ✅

- TYPE_FUNDAMENTAL_SHIFT ✅

- TYPE_RESERVED_BSE_FIRST ✅

- TYPE_RESERVED_BSE_LAST ✅

- TYPE_RESERVED_GLIB_FIRST ✅

- TYPE_RESERVED_GLIB_LAST ✅

- TYPE_RESERVED_USER_FIRST ✅

- VALUE_INTERNED_STRING ✅

- VALUE_NOCOPY_CONTENTS ✅

# Gsk

## Classes
### BlendNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_blend_mode ✅

- get_bottom_child ✅

- get_top_child ✅


### BlurNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_radius ✅


### BorderNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new]: Constructor new is weird: non NULL-terminated arrays require special handling`
#### Methods
- get_colors
  > ❌ `[method get_colors/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- get_outline
  > ❌ `[method get_outline/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
- get_widths
  > ❌ `[method get_widths/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gfloat), @type -> DataRecord(float)))),ListMap(@zero-terminated -> DataRecord(0), @fixed-size -> DataRecord(4), @type -> DataRecord(const float*)))`

### BroadwayRenderer

❌ `[BroadwayRenderer]: Class BroadwayRenderer is weird: Missing in raw bindings`


### CairoNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_draw_context
  > ❌ `[method get_draw_context/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))`
- get_surface
  > ❌ `[method get_surface/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))`

### CairoRenderer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### ClipNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/clip]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_child ✅

- get_clip
  > ❌ `[method get_clip/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`

### ColorMatrixNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/color_matrix]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))`
#### Methods
- get_child ✅

- get_color_matrix
  > ❌ `[method get_color_matrix/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))`
- get_color_offset
  > ❌ `[method get_color_offset/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Vec4), @type -> DataRecord(const graphene_vec4_t*)))`

### ColorNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/rgba]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
#### Methods
- get_color
  > ❌ `[method get_color/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`

### ConicGradientNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_angle ✅

- get_center
  > ❌ `[method get_center/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))`
- get_color_stops
  > ❌ `[method get_color_stops]: Method get_color_stops contains an OUT parameter, which is not supported yet`
- get_n_color_stops ✅

- get_rotation ✅


### ContainerNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new]: Constructor new is weird: non NULL-terminated arrays require special handling`
#### Methods
- get_child ✅

- get_n_children ✅


### CrossFadeNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_end_child ✅

- get_progress ✅

- get_start_child ✅


### DebugNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_message ✅


### FillNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))`
#### Methods
- get_child ✅

- get_fill_rule ✅

- get_path
  > ❌ `[method get_path/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))`

### GLRenderer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### GLShader


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>10</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_bytes
  > ❌ `[constructor new_from_bytes/sourcecode]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- new_from_resource ✅

#### Methods
- compile ✅

- find_uniform_by_name ✅

- format_args
  > ❌ `[method format_args/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- format_args_va
  > ❌ `[method format_args_va/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_arg_bool
  > ❌ `[method get_arg_bool/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_arg_float
  > ❌ `[method get_arg_float/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_arg_int
  > ❌ `[method get_arg_int/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_arg_uint
  > ❌ `[method get_arg_uint/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_arg_vec2
  > ❌ `[method get_arg_vec2/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_arg_vec3
  > ❌ `[method get_arg_vec3/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_arg_vec4
  > ❌ `[method get_arg_vec4/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_args_size ✅

- get_n_textures ✅

- get_n_uniforms ✅

- get_resource ✅

- get_source
  > ❌ `[method get_source/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_uniform_name ✅

- get_uniform_offset ✅

- get_uniform_type ✅


### GLShaderNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new]: Constructor new is weird: non NULL-terminated arrays require special handling`
#### Methods
- get_args
  > ❌ `[method get_args/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_child ✅

- get_n_children ✅

- get_shader ✅


### InsetShadowNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/outline]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
#### Methods
- get_blur_radius ✅

- get_color
  > ❌ `[method get_color/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- get_dx ✅

- get_dy ✅

- get_outline
  > ❌ `[method get_outline/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
- get_spread ✅


### LinearGradientNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_color_stops
  > ❌ `[method get_color_stops]: Method get_color_stops contains an OUT parameter, which is not supported yet`
- get_end
  > ❌ `[method get_end/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))`
- get_n_color_stops ✅

- get_start
  > ❌ `[method get_start/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))`

### MaskNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_mask ✅

- get_mask_mode ✅

- get_source ✅


### NglRenderer

❌ `[NglRenderer]: Class NglRenderer is weird: refers to types not present in raw bindings`


### OpacityNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_opacity ✅


### OutsetShadowNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/outline]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
#### Methods
- get_blur_radius ✅

- get_color
  > ❌ `[method get_color/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- get_dx ✅

- get_dy ✅

- get_outline
  > ❌ `[method get_outline/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
- get_spread ✅


### RadialGradientNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_center
  > ❌ `[method get_center/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))`
- get_color_stops
  > ❌ `[method get_color_stops]: Method get_color_stops contains an OUT parameter, which is not supported yet`
- get_end ✅

- get_hradius ✅

- get_n_color_stops ✅

- get_start ✅

- get_vradius ✅


### RenderNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- draw
  > ❌ `[method draw/<method parameters>/cr]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))`
- get_bounds
  > ❌ `[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet`
- get_node_type ✅

- ref ✅

- serialize
  > ❌ `[method serialize/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- unref ✅

- write_to_file ✅

#### Functions
- deserialize
  > ❌ `[function deserialize/<function parameters>/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`

### Renderer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_for_surface ✅

#### Methods
- get_surface ✅

- is_realized ✅

- realize ✅

- render
  > ❌ `[method render/<method parameters>/region]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(const cairo_region_t*)))`
- render_texture
  > ❌ `[method render_texture/<method parameters>/viewport]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- unrealize ✅


### RepeatNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_child ✅

- get_child_bounds
  > ❌ `[method get_child_bounds/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`

### RepeatingLinearGradientNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`

### RepeatingRadialGradientNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`

### RoundedClipNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/clip]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
#### Methods
- get_child ✅

- get_clip
  > ❌ `[method get_clip/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`

### ShadowNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/shadows]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(GskShadow)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GskShadow*)))`
#### Methods
- get_child ✅

- get_n_shadows ✅

- get_shadow
  > ❌ `[method get_shadow/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Shadow), @type -> DataRecord(const GskShadow*)))`

### StrokeNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))`
#### Methods
- get_child ✅

- get_path
  > ❌ `[method get_path/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Path), @type -> DataRecord(GskPath*)))`
- get_stroke
  > ❌ `[method get_stroke/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Stroke), @type -> DataRecord(const GskStroke*)))`

### TextNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/glyphs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.GlyphString), @type -> DataRecord(PangoGlyphString*)))`
#### Methods
- get_color
  > ❌ `[method get_color/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- get_font ✅

- get_glyphs
  > ❌ `[method get_glyphs]: Method get_glyphs contains an OUT parameter, which is not supported yet`
- get_num_glyphs ✅

- get_offset
  > ❌ `[method get_offset/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))`
- has_color_glyphs ✅


### TextureNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_texture ✅


### TextureScaleNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
#### Methods
- get_filter ✅

- get_texture ✅


### TransformNode


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/transform]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Transform), @type -> DataRecord(GskTransform*)))`
#### Methods
- get_child ✅

- get_transform
  > ❌ `[method get_transform/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Transform), @type -> DataRecord(GskTransform*)))`

### VulkanRenderer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


## Enums
- BlendMode ✅

- Corner ✅

- FillRule ✅

- GLUniformType ✅

- LineCap ✅

- LineJoin ✅

- MaskMode ✅

- PathDirection ✅

- PathOperation ✅

- RenderNodeType ✅

- ScalingFilter ✅

- SerializationError ✅

- TransformCategory ✅

## Bitfields
- PathForeachFlags ✅

# Gtk

## Classes
### ATContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- create ✅

#### Methods
- get_accessible ✅

- get_accessible_role ✅

#### Signals
- state-change ✅


### AboutDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>35</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_credit_section ✅

- get_artists
  > ❌ `[method get_artists/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))`
- get_authors
  > ❌ `[method get_authors/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))`
- get_comments ✅

- get_copyright ✅

- get_display ✅

- get_documenters
  > ❌ `[method get_documenters/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))`
- get_focus ✅

- get_license ✅

- get_license_type ✅

- get_logo ✅

- get_logo_icon_name ✅

- get_program_name ✅

- get_system_information ✅

- get_translator_credits ✅

- get_version ✅

- get_website ✅

- get_website_label ✅

- get_wrap_license ✅

- realize ✅

- set_artists ✅

- set_authors ✅

- set_comments ✅

- set_copyright ✅

- set_documenters ✅

- set_focus ✅

- set_license ✅

- set_license_type ✅

- set_logo ✅

- set_logo_icon_name ✅

- set_program_name ✅

- set_system_information ✅

- set_translator_credits ✅

- set_version ✅

- set_website ✅

- set_website_label ✅

- set_wrap_license ✅

- unrealize ✅

#### Signals
- activate-link ✅


### ActionBar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_center_widget ✅

- get_revealed ✅

- pack_end ✅

- pack_start ✅

- remove ✅

- set_center_widget ✅

- set_revealed ✅


### ActivateAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Functions
- get ✅


### Adjustment


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>15</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- clamp_page ✅

- configure ✅

- get_lower ✅

- get_minimum_increment ✅

- get_page_increment ✅

- get_page_size ✅

- get_step_increment ✅

- get_upper ✅

- get_value ✅

- set_lower ✅

- set_page_increment ✅

- set_page_size ✅

- set_step_increment ✅

- set_upper ✅

- set_value ✅

#### Signals
- changed ✅

- value-changed ✅


### AlertDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- choose
  > ❌ `[method choose/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- choose_finish ✅

- get_buttons
  > ❌ `[method get_buttons/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))`
- get_cancel_button ✅

- get_default_button ✅

- get_detail ✅

- get_message ✅

- get_modal ✅

- set_buttons
  > ❌ `[method set_buttons/<method parameters>/labels]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))`
- set_cancel_button ✅

- set_default_button ✅

- set_detail ✅

- set_message ✅

- set_modal ✅

- show ✅


### AlternativeTrigger


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_first ✅

- get_second ✅


### AnyFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### AppChooserButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append_custom_item ✅

- append_separator ✅

- get_heading ✅

- get_modal ✅

- get_show_default_item ✅

- get_show_dialog_item ✅

- set_active_custom_item ✅

- set_heading ✅

- set_modal ✅

- set_show_default_item ✅

- set_show_dialog_item ✅

#### Signals
- activate ✅

- changed ✅

- custom-item-activated ✅


### AppChooserDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_content_type ✅

#### Methods
- get_display ✅

- get_focus ✅

- get_heading ✅

- get_widget ✅

- realize ✅

- set_focus ✅

- set_heading ✅

- unrealize ✅


### AppChooserWidget


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- get_default_text ✅

- get_show_all ✅

- get_show_default ✅

- get_show_fallback ✅

- get_show_other ✅

- get_show_recommended ✅

- set_default_text ✅

- set_show_all ✅

- set_show_default ✅

- set_show_fallback ✅

- set_show_other ✅

- set_show_recommended ✅

#### Signals
- application-activated
  > ❌ `[signal application-activated]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gio.AppInfo)))`
- application-selected
  > ❌ `[signal application-selected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gio.AppInfo)))`

### Application


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_window ✅

- get_accels_for_action ✅

- get_actions_for_accel ✅

- get_active_window ✅

- get_menu_by_id ✅

- get_menubar ✅

- get_window_by_id ✅

- get_windows
  > ❌ `[method get_windows/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Window))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- inhibit ✅

- list_action_descriptions ✅

- remove_window ✅

- set_accels_for_action
  > ❌ `[method set_accels_for_action/<method parameters>/accels]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))`
- set_menubar ✅

- uninhibit ✅

#### Signals
- query-end ✅

- window-added ✅

- window-removed ✅


### ApplicationWindow


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_display ✅

- get_focus ✅

- get_help_overlay ✅

- get_id ✅

- get_show_menubar ✅

- realize ✅

- set_focus ✅

- set_help_overlay ✅

- set_show_menubar ✅

- unrealize ✅


### AspectFrame


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_obey_child ✅

- get_ratio ✅

- get_xalign ✅

- get_yalign ✅

- set_child ✅

- set_obey_child ✅

- set_ratio ✅

- set_xalign ✅

- set_yalign ✅


### Assistant


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>27</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>5</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_action_widget ✅

- append_page ✅

- commit ✅

- get_current_page ✅

- get_display ✅

- get_focus ✅

- get_n_pages ✅

- get_nth_page ✅

- get_page ✅

- get_page_complete ✅

- get_page_title ✅

- get_page_type ✅

- get_pages ✅

- insert_page ✅

- next_page ✅

- prepend_page ✅

- previous_page ✅

- realize ✅

- remove_action_widget ✅

- remove_page ✅

- set_current_page ✅

- set_focus ✅

- set_forward_page_func
  > ❌ `[method set_forward_page_func/<method parameters>/page_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AssistantPageFunc), @type -> DataRecord(GtkAssistantPageFunc)))`
- set_page_complete ✅

- set_page_title ✅

- set_page_type ✅

- unrealize ✅

- update_buttons_state ✅

#### Signals
- apply ✅

- cancel ✅

- close ✅

- escape ✅

- prepare ✅


### AssistantPage


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child ✅


### BinLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### BookmarkList


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_attributes ✅

- get_filename ✅

- get_io_priority ✅

- is_loading ✅

- set_attributes ✅

- set_io_priority ✅


### BoolFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_expression ✅

- get_invert ✅

- set_expression ✅

- set_invert ✅


### Box


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append ✅

- get_baseline_child ✅

- get_baseline_position ✅

- get_homogeneous ✅

- get_spacing ✅

- insert_child_after ✅

- prepend ✅

- remove ✅

- reorder_child_after ✅

- set_baseline_child ✅

- set_baseline_position ✅

- set_homogeneous ✅

- set_spacing ✅


### BoxLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_baseline_child ✅

- get_baseline_position ✅

- get_homogeneous ✅

- get_spacing ✅

- set_baseline_child ✅

- set_baseline_position ✅

- set_homogeneous ✅

- set_spacing ✅


### Builder


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>16</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_file ✅

- new_from_resource ✅

- new_from_string ✅

#### Methods
- add_from_file ✅

- add_from_resource ✅

- add_from_string ✅

- add_objects_from_file ✅

- add_objects_from_resource ✅

- add_objects_from_string ✅

- create_closure
  > ❌ `[method create_closure/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GObject.Closure), @type -> DataRecord(GClosure*)))`
- expose_object ✅

- extend_with_template ✅

- get_current_object ✅

- get_object ✅

- get_objects
  > ❌ `[method get_objects/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GObject.Object))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))`
- get_scope ✅

- get_translation_domain ✅

- get_type_from_name ✅

- set_current_object ✅

- set_scope ✅

- set_translation_domain ✅

- value_from_string
  > ❌ `[method value_from_string]: Method value_from_string contains an OUT parameter, which is not supported yet`
- value_from_string_type
  > ❌ `[method value_from_string_type]: Method value_from_string_type contains an OUT parameter, which is not supported yet`

### BuilderCScope


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_callback_symbol
  > ❌ `[method add_callback_symbol/<method parameters>/callback_symbol]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))`
- add_callback_symbols
  > ❌ `[method add_callback_symbols/<method parameters>/first_callback_symbol]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))`
- lookup_callback_symbol
  > ❌ `[method lookup_callback_symbol/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))`

### BuilderListItemFactory


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_bytes
  > ❌ `[constructor new_from_bytes/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- new_from_resource ✅

#### Methods
- get_bytes
  > ❌ `[method get_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- get_resource ✅

- get_scope ✅


### Button


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_icon_name ✅

- new_with_label ✅

- new_with_mnemonic ✅

#### Methods
- get_can_shrink ✅

- get_child ✅

- get_has_frame ✅

- get_icon_name ✅

- get_label ✅

- get_use_underline ✅

- set_can_shrink ✅

- set_child ✅

- set_has_frame ✅

- set_icon_name ✅

- set_label ✅

- set_use_underline ✅

#### Signals
- activate ✅

- clicked ✅


### CClosureExpression


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new]: Constructor new is weird: non NULL-terminated arrays require special handling`

### Calendar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>5</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- clear_marks ✅

- get_date
  > ❌ `[method get_date/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- get_day_is_marked ✅

- get_show_day_names ✅

- get_show_heading ✅

- get_show_week_numbers ✅

- mark_day ✅

- select_day
  > ❌ `[method select_day/<method parameters>/date]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))`
- set_show_day_names ✅

- set_show_heading ✅

- set_show_week_numbers ✅

- unmark_day ✅

#### Signals
- day-selected ✅

- next-month ✅

- next-year ✅

- prev-month ✅

- prev-year ✅


### CallbackAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ShortcutFunc), @type -> DataRecord(GtkShortcutFunc)))`

### CellArea


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>25</td><td>0</td><td>19</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>3</tr></table>

#### Methods
- activate
  > ❌ `[method activate/<method parameters>/cell_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- activate_cell
  > ❌ `[method activate_cell/<method parameters>/cell_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- add ✅

- add_focus_sibling ✅

- add_with_properties
  > ❌ `[method add_with_properties/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- apply_attributes
  > ❌ `[method apply_attributes/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- attribute_connect ✅

- attribute_disconnect ✅

- attribute_get_column ✅

- cell_get
  > ❌ `[method cell_get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- cell_get_property ✅

- cell_get_valist ✅

- cell_set
  > ❌ `[method cell_set/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- cell_set_property ✅

- cell_set_valist ✅

- copy_context ✅

- create_context ✅

- event
  > ❌ `[method event/<method parameters>/cell_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- focus ✅

- foreach
  > ❌ `[method foreach/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CellCallback), @type -> DataRecord(GtkCellCallback)))`
- foreach_alloc
  > ❌ `[method foreach_alloc/<method parameters>/cell_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- get_cell_allocation
  > ❌ `[method get_cell_allocation]: Method get_cell_allocation contains an OUT parameter, which is not supported yet`
- get_cell_at_position
  > ❌ `[method get_cell_at_position]: Method get_cell_at_position contains an OUT parameter, which is not supported yet`
- get_current_path_string ✅

- get_edit_widget ✅

- get_edited_cell ✅

- get_focus_cell ✅

- get_focus_from_sibling ✅

- get_focus_siblings
  > ❌ `[method get_focus_siblings/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(CellRenderer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(const GList*)))`
- get_preferred_height
  > ❌ `[method get_preferred_height]: Method get_preferred_height contains an OUT parameter, which is not supported yet`
- get_preferred_height_for_width
  > ❌ `[method get_preferred_height_for_width]: Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet`
- get_preferred_width
  > ❌ `[method get_preferred_width]: Method get_preferred_width contains an OUT parameter, which is not supported yet`
- get_preferred_width_for_height
  > ❌ `[method get_preferred_width_for_height]: Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet`
- get_request_mode ✅

- has_renderer ✅

- inner_cell_area
  > ❌ `[method inner_cell_area]: Method inner_cell_area contains an OUT parameter, which is not supported yet`
- is_activatable ✅

- is_focus_sibling ✅

- remove ✅

- remove_focus_sibling ✅

- request_renderer
  > ❌ `[method request_renderer]: Method request_renderer contains an OUT parameter, which is not supported yet`
- set_focus_cell ✅

- snapshot
  > ❌ `[method snapshot/<method parameters>/background_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- stop_editing ✅

#### Signals
- add-editable
  > ❌ `[signal add-editable]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(CellEditable)))`
- apply-attributes
  > ❌ `[signal apply-attributes]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeModel)))`
- focus-changed ✅

- remove-editable
  > ❌ `[signal remove-editable]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(CellEditable)))`

### CellAreaBox


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_spacing ✅

- pack_end ✅

- pack_start ✅

- set_spacing ✅


### CellAreaContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- allocate ✅

- get_allocation
  > ❌ `[method get_allocation]: Method get_allocation contains an OUT parameter, which is not supported yet`
- get_area ✅

- get_preferred_height
  > ❌ `[method get_preferred_height]: Method get_preferred_height contains an OUT parameter, which is not supported yet`
- get_preferred_height_for_width
  > ❌ `[method get_preferred_height_for_width]: Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet`
- get_preferred_width
  > ❌ `[method get_preferred_width]: Method get_preferred_width contains an OUT parameter, which is not supported yet`
- get_preferred_width_for_height
  > ❌ `[method get_preferred_width_for_height]: Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet`
- push_preferred_height ✅

- push_preferred_width ✅

- reset ✅


### CellRenderer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>15</td><td>0</td><td>12</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>1</tr></table>

#### Methods
- activate
  > ❌ `[method activate/<method parameters>/background_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- get_aligned_area
  > ❌ `[method get_aligned_area]: Method get_aligned_area contains an OUT parameter, which is not supported yet`
- get_alignment
  > ❌ `[method get_alignment]: Method get_alignment contains an OUT parameter, which is not supported yet`
- get_fixed_size
  > ❌ `[method get_fixed_size]: Method get_fixed_size contains an OUT parameter, which is not supported yet`
- get_is_expanded ✅

- get_is_expander ✅

- get_padding
  > ❌ `[method get_padding]: Method get_padding contains an OUT parameter, which is not supported yet`
- get_preferred_height
  > ❌ `[method get_preferred_height]: Method get_preferred_height contains an OUT parameter, which is not supported yet`
- get_preferred_height_for_width
  > ❌ `[method get_preferred_height_for_width]: Method get_preferred_height_for_width contains an OUT parameter, which is not supported yet`
- get_preferred_size
  > ❌ `[method get_preferred_size]: Method get_preferred_size contains an OUT parameter, which is not supported yet`
- get_preferred_width
  > ❌ `[method get_preferred_width]: Method get_preferred_width contains an OUT parameter, which is not supported yet`
- get_preferred_width_for_height
  > ❌ `[method get_preferred_width_for_height]: Method get_preferred_width_for_height contains an OUT parameter, which is not supported yet`
- get_request_mode ✅

- get_sensitive ✅

- get_state ✅

- get_visible ✅

- is_activatable ✅

- set_alignment ✅

- set_fixed_size ✅

- set_is_expanded ✅

- set_is_expander ✅

- set_padding ✅

- set_sensitive ✅

- set_visible ✅

- snapshot
  > ❌ `[method snapshot/<method parameters>/background_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- start_editing
  > ❌ `[method start_editing/<method parameters>/background_area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- stop_editing ✅

#### Signals
- editing-canceled ✅

- editing-started
  > ❌ `[signal editing-started]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(CellEditable)))`

### CellRendererAccel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Signals
- accel-cleared ✅

- accel-edited
  > ❌ `[signal accel-edited]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`

### CellRendererCombo


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Signals
- changed
  > ❌ `[signal changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))`

### CellRendererPixbuf


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### CellRendererProgress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### CellRendererSpin


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### CellRendererSpinner


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### CellRendererText


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- set_fixed_height_from_font ✅

#### Signals
- edited ✅


### CellRendererToggle


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_activatable ✅

- get_active ✅

- get_radio ✅

- set_activatable ✅

- set_active ✅

- set_radio ✅

#### Signals
- toggled ✅


### CellView


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>5</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_context ✅

- new_with_markup ✅

- new_with_text ✅

- new_with_texture ✅

#### Methods
- get_displayed_row
  > ❌ `[method get_displayed_row/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- get_draw_sensitive ✅

- get_fit_model ✅

- get_model ✅

- set_displayed_row
  > ❌ `[method set_displayed_row/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_draw_sensitive ✅

- set_fit_model ✅

- set_model ✅


### CenterBox


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_baseline_position ✅

- get_center_widget ✅

- get_end_widget ✅

- get_shrink_center_last ✅

- get_start_widget ✅

- set_baseline_position ✅

- set_center_widget ✅

- set_end_widget ✅

- set_shrink_center_last ✅

- set_start_widget ✅


### CenterLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_baseline_position ✅

- get_center_widget ✅

- get_end_widget ✅

- get_orientation ✅

- get_shrink_center_last ✅

- get_start_widget ✅

- set_baseline_position ✅

- set_center_widget ✅

- set_end_widget ✅

- set_orientation ✅

- set_shrink_center_last ✅

- set_start_widget ✅


### CheckButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_label ✅

- new_with_mnemonic ✅

#### Methods
- get_active ✅

- get_child ✅

- get_inconsistent ✅

- get_label ✅

- get_use_underline ✅

- set_active ✅

- set_child ✅

- set_group ✅

- set_inconsistent ✅

- set_label ✅

- set_use_underline ✅

#### Signals
- activate ✅

- toggled ✅


### ClosureExpression


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new]: Constructor new is weird: non NULL-terminated arrays require special handling`

### ColorButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_rgba
  > ❌ `[constructor new_with_rgba/rgba]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
#### Methods
- get_modal ✅

- get_title ✅

- set_modal ✅

- set_title ✅

#### Signals
- activate ✅

- color-set ✅


### ColorChooserDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_display ✅

- get_focus ✅

- realize ✅

- set_focus ✅

- unrealize ✅


### ColorChooserWidget


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### ColorDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- choose_rgba
  > ❌ `[method choose_rgba/<method parameters>/initial_color]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- choose_rgba_finish
  > ❌ `[method choose_rgba_finish/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(GdkRGBA*)))`
- get_modal ✅

- get_title ✅

- get_with_alpha ✅

- set_modal ✅

- set_title ✅

- set_with_alpha ✅


### ColorDialogButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_dialog ✅

- get_rgba
  > ❌ `[method get_rgba/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- set_dialog ✅

- set_rgba
  > ❌ `[method set_rgba/<method parameters>/color]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
#### Signals
- activate ✅


### ColumnView


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>24</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- append_column ✅

- get_columns ✅

- get_enable_rubberband ✅

- get_header_factory ✅

- get_model ✅

- get_reorderable ✅

- get_row_factory ✅

- get_show_column_separators ✅

- get_show_row_separators ✅

- get_single_click_activate ✅

- get_sorter ✅

- get_tab_behavior ✅

- insert_column ✅

- remove_column ✅

- scroll_to
  > ❌ `[method scroll_to/<method parameters>/scroll]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ScrollInfo), @type -> DataRecord(GtkScrollInfo*)))`
- set_enable_rubberband ✅

- set_header_factory ✅

- set_model ✅

- set_reorderable ✅

- set_row_factory ✅

- set_show_column_separators ✅

- set_show_row_separators ✅

- set_single_click_activate ✅

- set_tab_behavior ✅

- sort_by_column ✅

#### Signals
- activate
  > ❌ `[signal activate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`

### ColumnViewCell


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child ✅

- get_focusable ✅

- get_item ✅

- get_position ✅

- get_selected ✅

- set_child ✅

- set_focusable ✅


### ColumnViewColumn


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>19</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_column_view ✅

- get_expand ✅

- get_factory ✅

- get_fixed_width ✅

- get_header_menu ✅

- get_id ✅

- get_resizable ✅

- get_sorter ✅

- get_title ✅

- get_visible ✅

- set_expand ✅

- set_factory ✅

- set_fixed_width ✅

- set_header_menu ✅

- set_id ✅

- set_resizable ✅

- set_sorter ✅

- set_title ✅

- set_visible ✅


### ColumnViewRow


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_accessible_description ✅

- get_accessible_label ✅

- get_activatable ✅

- get_focusable ✅

- get_item ✅

- get_position ✅

- get_selectable ✅

- get_selected ✅

- set_accessible_description ✅

- set_accessible_label ✅

- set_activatable ✅

- set_focusable ✅

- set_selectable ✅


### ColumnViewSorter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_n_sort_columns ✅

- get_nth_sort_column
  > ❌ `[method get_nth_sort_column]: Method get_nth_sort_column contains an OUT parameter, which is not supported yet`
- get_primary_sort_column ✅

- get_primary_sort_order ✅


### ComboBox


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>4</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>20</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>5</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

- new_with_entry ✅

- new_with_model ✅

- new_with_model_and_entry ✅

#### Methods
- get_active ✅

- get_active_id ✅

- get_active_iter
  > ❌ `[method get_active_iter]: Method get_active_iter contains an OUT parameter, which is not supported yet`
- get_button_sensitivity ✅

- get_child ✅

- get_entry_text_column ✅

- get_has_entry ✅

- get_id_column ✅

- get_model ✅

- get_popup_fixed_width ✅

- get_row_separator_func
  > ❌ `[method get_row_separator_func/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))`
- popdown ✅

- popup ✅

- popup_for_device ✅

- set_active ✅

- set_active_id ✅

- set_active_iter
  > ❌ `[method set_active_iter/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set_button_sensitivity ✅

- set_child ✅

- set_entry_text_column ✅

- set_id_column ✅

- set_model ✅

- set_popup_fixed_width ✅

- set_row_separator_func
  > ❌ `[method set_row_separator_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))`
#### Signals
- activate ✅

- changed ✅

- format-entry-text
  > ❌ `[signal format-entry-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))`
- move-active ✅

- popdown ✅

- popup ✅


### ComboBoxText


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_entry ✅

#### Methods
- append ✅

- append_text ✅

- get_active_text ✅

- insert ✅

- insert_text ✅

- prepend ✅

- prepend_text ✅

- remove ✅

- remove_all ✅


### ConstantExpression


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_value ✅

#### Methods
- get_value ✅


### Constraint


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_constant ✅

#### Methods
- get_constant ✅

- get_multiplier ✅

- get_relation ✅

- get_source ✅

- get_source_attribute ✅

- get_strength ✅

- get_target ✅

- get_target_attribute ✅

- is_attached ✅

- is_constant ✅

- is_required ✅


### ConstraintGuide


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_max_size
  > ❌ `[method get_max_size]: Method get_max_size contains an OUT parameter, which is not supported yet`
- get_min_size
  > ❌ `[method get_min_size]: Method get_min_size contains an OUT parameter, which is not supported yet`
- get_name ✅

- get_nat_size
  > ❌ `[method get_nat_size]: Method get_nat_size contains an OUT parameter, which is not supported yet`
- get_strength ✅

- set_max_size ✅

- set_min_size ✅

- set_name ✅

- set_nat_size ✅

- set_strength ✅


### ConstraintLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_constraint ✅

- add_constraints_from_description
  > ❌ `[method add_constraints_from_description/<method parameters>/lines]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char* const*)))`
- add_constraints_from_descriptionv
  > ❌ `[method add_constraints_from_descriptionv/<method parameters>/lines]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char* const*)))`
- add_guide ✅

- observe_constraints ✅

- observe_guides ✅

- remove_all_constraints ✅

- remove_constraint ✅

- remove_guide ✅


### ConstraintLayoutChild


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### CssProvider


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- load_from_bytes
  > ❌ `[method load_from_bytes/<method parameters>/data]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- load_from_data ✅

- load_from_file ✅

- load_from_path ✅

- load_from_resource ✅

- load_from_string ✅

- load_named ✅

- to_string ✅

#### Signals
- parsing-error
  > ❌ `[signal parsing-error]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(CssSection)))`

### CustomFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/match_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomFilterFunc), @type -> DataRecord(GtkCustomFilterFunc)))`
#### Methods
- set_filter_func
  > ❌ `[method set_filter_func/<method parameters>/match_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomFilterFunc), @type -> DataRecord(GtkCustomFilterFunc)))`

### CustomLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/request_mode]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomRequestModeFunc), @type -> DataRecord(GtkCustomRequestModeFunc)))`

### CustomSorter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))`
#### Methods
- set_sort_func
  > ❌ `[method set_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))`

### Dialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>14</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_buttons ✅

#### Methods
- add_action_widget ✅

- add_button ✅

- add_buttons
  > ❌ `[method add_buttons/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_content_area ✅

- get_display ✅

- get_focus ✅

- get_header_bar ✅

- get_response_for_widget ✅

- get_widget_for_response ✅

- realize ✅

- response ✅

- set_default_response ✅

- set_focus ✅

- set_response_sensitive ✅

- unrealize ✅

#### Signals
- close ✅

- response ✅


### DirectoryList


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_attributes ✅

- get_error
  > ❌ `[method get_error/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))`
- get_file ✅

- get_io_priority ✅

- get_monitored ✅

- is_loading ✅

- set_attributes ✅

- set_file ✅

- set_io_priority ✅

- set_monitored ✅


### DragIcon


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>3</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child ✅

- get_display ✅

- realize ✅

- set_child ✅

- unrealize ✅

#### Functions
- create_widget_for_value ✅

- get_for_drag ✅

- set_from_paintable ✅


### DragSource


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- drag_cancel ✅

- get_actions ✅

- get_content ✅

- get_drag ✅

- set_actions ✅

- set_content ✅

- set_icon ✅

#### Signals
- drag-begin ✅

- drag-cancel ✅

- drag-end ✅

- prepare
  > ❌ `[signal prepare]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### DrawingArea


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_content_height ✅

- get_content_width ✅

- set_content_height ✅

- set_content_width ✅

- set_draw_func
  > ❌ `[method set_draw_func/<method parameters>/draw_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DrawingAreaDrawFunc), @type -> DataRecord(GtkDrawingAreaDrawFunc)))`
#### Signals
- resize ✅


### DropControllerMotion


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- contains_pointer ✅

- get_drop ✅

- is_pointer ✅

#### Signals
- enter
  > ❌ `[signal enter]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- leave ✅

- motion
  > ❌ `[signal motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### DropDown


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>19</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_strings
  > ❌ `[constructor new_from_strings/strings]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))`
#### Methods
- get_enable_search ✅

- get_expression ✅

- get_factory ✅

- get_header_factory ✅

- get_list_factory ✅

- get_model ✅

- get_search_match_mode ✅

- get_selected ✅

- get_selected_item ✅

- get_show_arrow ✅

- set_enable_search ✅

- set_expression ✅

- set_factory ✅

- set_header_factory ✅

- set_list_factory ✅

- set_model ✅

- set_search_match_mode ✅

- set_selected ✅

- set_show_arrow ✅

#### Signals
- activate ✅


### DropTarget


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>3</tr></table>

#### Constructors
- new ✅

#### Methods
- get_actions ✅

- get_current_drop ✅

- get_drop ✅

- get_formats
  > ❌ `[method get_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- get_gtypes
  > ❌ `[method get_gtypes]: Method get_gtypes contains an OUT parameter, which is not supported yet`
- get_preload ✅

- get_value ✅

- reject ✅

- set_actions ✅

- set_gtypes
  > ❌ `[method set_gtypes/<method parameters>/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GType*)))`
- set_preload ✅

#### Signals
- accept ✅

- drop
  > ❌ `[signal drop]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GObject.Value)))`
- enter
  > ❌ `[signal enter]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- leave ✅

- motion
  > ❌ `[signal motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### DropTargetAsync


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>3</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/formats]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
#### Methods
- get_actions ✅

- get_formats
  > ❌ `[method get_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- reject_drop ✅

- set_actions ✅

- set_formats
  > ❌ `[method set_formats/<method parameters>/formats]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
#### Signals
- accept ✅

- drag-enter
  > ❌ `[signal drag-enter]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- drag-leave ✅

- drag-motion
  > ❌ `[signal drag-motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- drop
  > ❌ `[signal drop]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### EditableLabel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_editing ✅

- start_editing ✅

- stop_editing ✅


### EmojiChooser


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- realize ✅

- unrealize ✅

#### Signals
- emoji-picked ✅


### Entry


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>53</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_buffer ✅

#### Methods
- get_activates_default ✅

- get_alignment ✅

- get_attributes
  > ❌ `[method get_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- get_buffer ✅

- get_completion ✅

- get_current_icon_drag_source ✅

- get_extra_menu ✅

- get_has_frame ✅

- get_icon_activatable ✅

- get_icon_area
  > ❌ `[method get_icon_area]: Method get_icon_area contains an OUT parameter, which is not supported yet`
- get_icon_at_pos ✅

- get_icon_gicon ✅

- get_icon_name ✅

- get_icon_paintable ✅

- get_icon_sensitive ✅

- get_icon_storage_type ✅

- get_icon_tooltip_markup ✅

- get_icon_tooltip_text ✅

- get_input_hints ✅

- get_input_purpose ✅

- get_invisible_char ✅

- get_max_length ✅

- get_overwrite_mode ✅

- get_placeholder_text ✅

- get_progress_fraction ✅

- get_progress_pulse_step ✅

- get_tabs
  > ❌ `[method get_tabs/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- get_text_length ✅

- get_visibility ✅

- grab_focus_without_selecting ✅

- progress_pulse ✅

- reset_im_context ✅

- set_activates_default ✅

- set_alignment ✅

- set_attributes
  > ❌ `[method set_attributes/<method parameters>/attrs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- set_buffer ✅

- set_completion ✅

- set_extra_menu ✅

- set_has_frame ✅

- set_icon_activatable ✅

- set_icon_drag_source ✅

- set_icon_from_gicon ✅

- set_icon_from_icon_name ✅

- set_icon_from_paintable ✅

- set_icon_sensitive ✅

- set_icon_tooltip_markup ✅

- set_icon_tooltip_text ✅

- set_input_hints ✅

- set_input_purpose ✅

- set_invisible_char ✅

- set_max_length ✅

- set_overwrite_mode ✅

- set_placeholder_text ✅

- set_progress_fraction ✅

- set_progress_pulse_step ✅

- set_tabs
  > ❌ `[method set_tabs/<method parameters>/tabs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- set_visibility ✅

- unset_invisible_char ✅

#### Signals
- activate ✅

- icon-press ✅

- icon-release ✅


### EntryBuffer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- delete_text ✅

- emit_deleted_text ✅

- emit_inserted_text ✅

- get_bytes ✅

- get_length ✅

- get_max_length ✅

- get_text ✅

- insert_text ✅

- set_max_length ✅

- set_text ✅

#### Signals
- deleted-text
  > ❌ `[signal deleted-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- inserted-text
  > ❌ `[signal inserted-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`

### EntryCompletion


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>21</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

- new_with_area ✅

#### Methods
- complete ✅

- compute_prefix ✅

- get_completion_prefix ✅

- get_entry ✅

- get_inline_completion ✅

- get_inline_selection ✅

- get_minimum_key_length ✅

- get_model ✅

- get_popup_completion ✅

- get_popup_set_width ✅

- get_popup_single_match ✅

- get_text_column ✅

- insert_prefix ✅

- set_inline_completion ✅

- set_inline_selection ✅

- set_match_func
  > ❌ `[method set_match_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(EntryCompletionMatchFunc), @type -> DataRecord(GtkEntryCompletionMatchFunc)))`
- set_minimum_key_length ✅

- set_model ✅

- set_popup_completion ✅

- set_popup_set_width ✅

- set_popup_single_match ✅

- set_text_column ✅

#### Signals
- cursor-on-match
  > ❌ `[signal cursor-on-match]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeModel)))`
- insert-prefix ✅

- match-selected
  > ❌ `[signal match-selected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeModel)))`
- no-matches ✅


### EventController


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_current_event ✅

- get_current_event_device ✅

- get_current_event_state ✅

- get_current_event_time ✅

- get_name ✅

- get_propagation_limit ✅

- get_propagation_phase ✅

- get_widget ✅

- reset ✅

- set_name ✅

- set_propagation_limit ✅

- set_propagation_phase ✅

- set_static_name ✅


### EventControllerFocus


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- contains_focus ✅

- is_focus ✅

#### Signals
- enter ✅

- leave ✅


### EventControllerKey


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- forward ✅

- get_group ✅

- get_im_context ✅

- set_im_context ✅

#### Signals
- im-update ✅

- key-pressed
  > ❌ `[signal key-pressed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- key-released
  > ❌ `[signal key-released]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- modifiers ✅


### EventControllerLegacy


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Signals
- event ✅


### EventControllerMotion


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- contains_pointer ✅

- is_pointer ✅

#### Signals
- enter
  > ❌ `[signal enter]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- leave ✅

- motion
  > ❌ `[signal motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### EventControllerScroll


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- get_flags ✅

- get_unit ✅

- set_flags ✅

#### Signals
- decelerate
  > ❌ `[signal decelerate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- scroll
  > ❌ `[signal scroll]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- scroll-begin ✅

- scroll-end ✅


### EveryFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### Expander


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>14</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_mnemonic ✅

#### Methods
- get_child ✅

- get_expanded ✅

- get_label ✅

- get_label_widget ✅

- get_resize_toplevel ✅

- get_use_markup ✅

- get_use_underline ✅

- set_child ✅

- set_expanded ✅

- set_label ✅

- set_label_widget ✅

- set_resize_toplevel ✅

- set_use_markup ✅

- set_use_underline ✅

#### Signals
- activate ✅


### Expression


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- bind
  > ❌ `[method bind/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ExpressionWatch), @type -> DataRecord(GtkExpressionWatch*)))`
- evaluate ✅

- get_value_type ✅

- is_static ✅

- ref ✅

- unref ✅

- watch
  > ❌ `[method watch/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ExpressionNotify), @type -> DataRecord(GtkExpressionNotify)))`

### FileChooserDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_display ✅

- get_focus ✅

- realize ✅

- set_focus ✅

- unrealize ✅


### FileChooserNative


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_accept_label ✅

- get_cancel_label ✅

- set_accept_label ✅

- set_cancel_label ✅


### FileChooserWidget


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>12</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Signals
- desktop-folder ✅

- down-folder ✅

- home-folder ✅

- location-popup ✅

- location-popup-on-paste ✅

- location-toggle-popup ✅

- places-shortcut ✅

- quick-bookmark ✅

- recent-shortcut ✅

- search-shortcut ✅

- show-hidden ✅

- up-folder ✅


### FileDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>21</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_accept_label ✅

- get_default_filter ✅

- get_filters ✅

- get_initial_file ✅

- get_initial_folder ✅

- get_initial_name ✅

- get_modal ✅

- get_title ✅

- open
  > ❌ `[method open/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- open_finish ✅

- open_multiple
  > ❌ `[method open_multiple/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- open_multiple_finish ✅

- save
  > ❌ `[method save/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- save_finish ✅

- select_folder
  > ❌ `[method select_folder/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- select_folder_finish ✅

- select_multiple_folders
  > ❌ `[method select_multiple_folders/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- select_multiple_folders_finish ✅

- set_accept_label ✅

- set_default_filter ✅

- set_filters ✅

- set_initial_file ✅

- set_initial_folder ✅

- set_initial_name ✅

- set_modal ✅

- set_title ✅


### FileFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_gvariant
  > ❌ `[constructor new_from_gvariant/variant]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
#### Methods
- add_mime_type ✅

- add_pattern ✅

- add_pixbuf_formats ✅

- add_suffix ✅

- get_attributes ✅

- get_name ✅

- set_name ✅

- to_gvariant
  > ❌ `[method to_gvariant/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`

### FileLauncher


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_always_ask ✅

- get_file ✅

- launch
  > ❌ `[method launch/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- launch_finish ✅

- open_containing_folder
  > ❌ `[method open_containing_folder/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- open_containing_folder_finish ✅

- set_always_ask ✅

- set_file ✅


### Filter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- changed ✅

- get_strictness ✅

- match ✅

#### Signals
- changed ✅


### FilterListModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_filter ✅

- get_incremental ✅

- get_model ✅

- get_pending ✅

- set_filter ✅

- set_incremental ✅

- set_model ✅


### Fixed


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child_position
  > ❌ `[method get_child_position]: Method get_child_position contains an OUT parameter, which is not supported yet`
- get_child_transform
  > ❌ `[method get_child_transform/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))`
- move ✅

- put ✅

- remove ✅

- set_child_transform
  > ❌ `[method set_child_transform/<method parameters>/transform]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))`

### FixedLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### FixedLayoutChild


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_transform
  > ❌ `[method get_transform/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))`
- set_transform
  > ❌ `[method set_transform/<method parameters>/transform]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))`

### FlattenListModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_model ✅

- get_model_for_item ✅

- set_model ✅


### FlowBox


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>29</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>7</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append ✅

- bind_model
  > ❌ `[method bind_model/<method parameters>/create_widget_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxCreateWidgetFunc), @type -> DataRecord(GtkFlowBoxCreateWidgetFunc)))`
- get_activate_on_single_click ✅

- get_child_at_index ✅

- get_child_at_pos ✅

- get_column_spacing ✅

- get_homogeneous ✅

- get_max_children_per_line ✅

- get_min_children_per_line ✅

- get_row_spacing ✅

- get_selected_children
  > ❌ `[method get_selected_children/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(FlowBoxChild))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_selection_mode ✅

- insert ✅

- invalidate_filter ✅

- invalidate_sort ✅

- prepend ✅

- remove ✅

- remove_all ✅

- select_all ✅

- select_child ✅

- selected_foreach
  > ❌ `[method selected_foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxForeachFunc), @type -> DataRecord(GtkFlowBoxForeachFunc)))`
- set_activate_on_single_click ✅

- set_column_spacing ✅

- set_filter_func
  > ❌ `[method set_filter_func/<method parameters>/filter_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxFilterFunc), @type -> DataRecord(GtkFlowBoxFilterFunc)))`
- set_hadjustment ✅

- set_homogeneous ✅

- set_max_children_per_line ✅

- set_min_children_per_line ✅

- set_row_spacing ✅

- set_selection_mode ✅

- set_sort_func
  > ❌ `[method set_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlowBoxSortFunc), @type -> DataRecord(GtkFlowBoxSortFunc)))`
- set_vadjustment ✅

- unselect_all ✅

- unselect_child ✅

#### Signals
- activate-cursor-child ✅

- child-activated ✅

- move-cursor ✅

- select-all ✅

- selected-children-changed ✅

- toggle-cursor-child ✅

- unselect-all ✅


### FlowBoxChild


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- changed ✅

- get_child ✅

- get_index ✅

- is_selected ✅

- set_child ✅

#### Signals
- activate ✅


### FontButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_font ✅

#### Methods
- get_font_map ✅

- get_modal ✅

- get_title ✅

- get_use_font ✅

- get_use_size ✅

- set_font_map ✅

- set_modal ✅

- set_title ✅

- set_use_font ✅

- set_use_size ✅

#### Signals
- activate ✅

- font-set ✅


### FontChooserDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_display ✅

- get_focus ✅

- get_font_map ✅

- realize ✅

- set_focus ✅

- set_font_map ✅

- unrealize ✅


### FontChooserWidget


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_font_map ✅

- set_font_map ✅


### FontDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>8</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- choose_face
  > ❌ `[method choose_face/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- choose_face_finish ✅

- choose_family
  > ❌ `[method choose_family/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- choose_family_finish ✅

- choose_font
  > ❌ `[method choose_font/<method parameters>/initial_value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- choose_font_and_features
  > ❌ `[method choose_font_and_features/<method parameters>/initial_value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- choose_font_and_features_finish
  > ❌ `[method choose_font_and_features_finish]: Method choose_font_and_features_finish contains an OUT parameter, which is not supported yet`
- choose_font_finish
  > ❌ `[method choose_font_finish/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- get_filter ✅

- get_font_map ✅

- get_language
  > ❌ `[method get_language/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))`
- get_modal ✅

- get_title ✅

- set_filter ✅

- set_font_map ✅

- set_language
  > ❌ `[method set_language/<method parameters>/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))`
- set_modal ✅

- set_title ✅


### FontDialogButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_dialog ✅

- get_font_desc
  > ❌ `[method get_font_desc/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- get_font_features ✅

- get_language
  > ❌ `[method get_language/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))`
- get_level ✅

- get_use_font ✅

- get_use_size ✅

- set_dialog ✅

- set_font_desc
  > ❌ `[method set_font_desc/<method parameters>/font_desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- set_font_features ✅

- set_language
  > ❌ `[method set_language/<method parameters>/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.Language), @type -> DataRecord(PangoLanguage*)))`
- set_level ✅

- set_use_font ✅

- set_use_size ✅

#### Signals
- activate ✅


### Frame


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_label ✅

- get_label_align ✅

- get_label_widget ✅

- set_child ✅

- set_label ✅

- set_label_align ✅

- set_label_widget ✅


### GLArea


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>16</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- attach_buffers ✅

- get_allowed_apis ✅

- get_api ✅

- get_auto_render ✅

- get_context ✅

- get_error
  > ❌ `[method get_error/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))`
- get_has_depth_buffer ✅

- get_has_stencil_buffer ✅

- get_required_version
  > ❌ `[method get_required_version]: Method get_required_version contains an OUT parameter, which is not supported yet`
- get_use_es ✅

- make_current ✅

- queue_render ✅

- set_allowed_apis ✅

- set_auto_render ✅

- set_error
  > ❌ `[method set_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))`
- set_has_depth_buffer ✅

- set_has_stencil_buffer ✅

- set_required_version ✅

- set_use_es ✅

#### Signals
- create-context ✅

- render ✅

- resize ✅


### Gesture


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>10</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>5</tr></table>

#### Methods
- get_bounding_box
  > ❌ `[method get_bounding_box]: Method get_bounding_box contains an OUT parameter, which is not supported yet`
- get_bounding_box_center
  > ❌ `[method get_bounding_box_center]: Method get_bounding_box_center contains an OUT parameter, which is not supported yet`
- get_device ✅

- get_group
  > ❌ `[method get_group/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gesture))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_last_event
  > ❌ `[method get_last_event/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))`
- get_last_updated_sequence
  > ❌ `[method get_last_updated_sequence/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))`
- get_point
  > ❌ `[method get_point]: Method get_point contains an OUT parameter, which is not supported yet`
- get_sequence_state
  > ❌ `[method get_sequence_state/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))`
- get_sequences
  > ❌ `[method get_sequences/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- group ✅

- handles_sequence
  > ❌ `[method handles_sequence/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))`
- is_active ✅

- is_grouped_with ✅

- is_recognized ✅

- set_sequence_state
  > ❌ `[method set_sequence_state/<method parameters>/sequence]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))`
- set_state ✅

- ungroup ✅

#### Signals
- begin
  > ❌ `[signal begin]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))`
- cancel
  > ❌ `[signal cancel]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))`
- end
  > ❌ `[signal end]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))`
- sequence-state-changed
  > ❌ `[signal sequence-state-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))`
- update
  > ❌ `[signal update]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence)))`

### GestureClick


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>3</tr></table>

#### Constructors
- new ✅

#### Signals
- pressed
  > ❌ `[signal pressed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- released
  > ❌ `[signal released]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- stopped ✅

- unpaired-release
  > ❌ `[signal unpaired-release]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### GestureDrag


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>3</tr></table>

#### Constructors
- new ✅

#### Methods
- get_offset
  > ❌ `[method get_offset]: Method get_offset contains an OUT parameter, which is not supported yet`
- get_start_point
  > ❌ `[method get_start_point]: Method get_start_point contains an OUT parameter, which is not supported yet`
#### Signals
- drag-begin
  > ❌ `[signal drag-begin]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- drag-end
  > ❌ `[signal drag-end]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- drag-update
  > ❌ `[signal drag-update]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### GestureLongPress


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_delay_factor ✅

- set_delay_factor ✅

#### Signals
- cancelled ✅

- pressed
  > ❌ `[signal pressed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### GesturePan


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_orientation ✅

- set_orientation ✅

#### Signals
- pan
  > ❌ `[signal pan]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### GestureRotate


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_angle_delta ✅

#### Signals
- angle-changed
  > ❌ `[signal angle-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### GestureSingle


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_button ✅

- get_current_button ✅

- get_current_sequence
  > ❌ `[method get_current_sequence/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))`
- get_exclusive ✅

- get_touch_only ✅

- set_button ✅

- set_exclusive ✅

- set_touch_only ✅


### GestureStylus


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>4</tr></table>

#### Constructors
- new ✅

#### Methods
- get_axes
  > ❌ `[method get_axes]: Method get_axes contains an OUT parameter, which is not supported yet`
- get_axis
  > ❌ `[method get_axis]: Method get_axis contains an OUT parameter, which is not supported yet`
- get_backlog
  > ❌ `[method get_backlog]: Method get_backlog contains an OUT parameter, which is not supported yet`
- get_device_tool ✅

- get_stylus_only ✅

- set_stylus_only ✅

#### Signals
- down
  > ❌ `[signal down]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- motion
  > ❌ `[signal motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- proximity
  > ❌ `[signal proximity]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- up
  > ❌ `[signal up]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### GestureSwipe


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_velocity
  > ❌ `[method get_velocity]: Method get_velocity contains an OUT parameter, which is not supported yet`
#### Signals
- swipe
  > ❌ `[signal swipe]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### GestureZoom


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_scale_delta ✅

#### Signals
- scale-changed
  > ❌ `[signal scale-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### Grid


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>21</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- attach ✅

- attach_next_to ✅

- get_baseline_row ✅

- get_child_at ✅

- get_column_homogeneous ✅

- get_column_spacing ✅

- get_row_baseline_position ✅

- get_row_homogeneous ✅

- get_row_spacing ✅

- insert_column ✅

- insert_next_to ✅

- insert_row ✅

- query_child
  > ❌ `[method query_child]: Method query_child contains an OUT parameter, which is not supported yet`
- remove ✅

- remove_column ✅

- remove_row ✅

- set_baseline_row ✅

- set_column_homogeneous ✅

- set_column_spacing ✅

- set_row_baseline_position ✅

- set_row_homogeneous ✅

- set_row_spacing ✅


### GridLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_baseline_row ✅

- get_column_homogeneous ✅

- get_column_spacing ✅

- get_row_baseline_position ✅

- get_row_homogeneous ✅

- get_row_spacing ✅

- set_baseline_row ✅

- set_column_homogeneous ✅

- set_column_spacing ✅

- set_row_baseline_position ✅

- set_row_homogeneous ✅

- set_row_spacing ✅


### GridLayoutChild


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_column ✅

- get_column_span ✅

- get_row ✅

- get_row_span ✅

- set_column ✅

- set_column_span ✅

- set_row ✅

- set_row_span ✅


### GridView


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>14</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_enable_rubberband ✅

- get_factory ✅

- get_max_columns ✅

- get_min_columns ✅

- get_model ✅

- get_single_click_activate ✅

- get_tab_behavior ✅

- scroll_to
  > ❌ `[method scroll_to/<method parameters>/scroll]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ScrollInfo), @type -> DataRecord(GtkScrollInfo*)))`
- set_enable_rubberband ✅

- set_factory ✅

- set_max_columns ✅

- set_min_columns ✅

- set_model ✅

- set_single_click_activate ✅

- set_tab_behavior ✅

#### Signals
- activate
  > ❌ `[signal activate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`

### HeaderBar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_decoration_layout ✅

- get_show_title_buttons ✅

- get_title_widget ✅

- pack_end ✅

- pack_start ✅

- remove ✅

- set_decoration_layout ✅

- set_show_title_buttons ✅

- set_title_widget ✅


### IMContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>6</td><td>0</td><td>0</tr></table>

#### Methods
- delete_surrounding ✅

- filter_key ✅

- filter_keypress ✅

- focus_in ✅

- focus_out ✅

- get_preedit_string
  > ❌ `[method get_preedit_string]: Method get_preedit_string contains an OUT parameter, which is not supported yet`
- get_surrounding
  > ❌ `[method get_surrounding]: Method get_surrounding contains an OUT parameter, which is not supported yet`
- get_surrounding_with_selection
  > ❌ `[method get_surrounding_with_selection]: Method get_surrounding_with_selection contains an OUT parameter, which is not supported yet`
- reset ✅

- set_client_widget ✅

- set_cursor_location
  > ❌ `[method set_cursor_location/<method parameters>/area]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- set_surrounding ✅

- set_surrounding_with_selection ✅

- set_use_preedit ✅

#### Signals
- commit ✅

- delete-surrounding ✅

- preedit-changed ✅

- preedit-end ✅

- preedit-start ✅

- retrieve-surrounding ✅


### IMContextSimple


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_compose_file ✅

- add_table
  > ❌ `[method add_table]: Method add_table is weird: non NULL-terminated arrays require special handling`

### IMMulticontext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_context_id ✅

- set_context_id ✅


### IconPaintable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_for_file ✅

#### Methods
- get_file ✅

- get_icon_name ✅

- is_symbolic ✅


### IconTheme


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_resource_path ✅

- add_search_path ✅

- get_display ✅

- get_icon_names ✅

- get_icon_sizes
  > ❌ `[method get_icon_sizes/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@type -> DataRecord(int*)))`
- get_resource_path ✅

- get_search_path ✅

- get_theme_name ✅

- has_gicon ✅

- has_icon ✅

- lookup_by_gicon ✅

- lookup_icon ✅

- set_resource_path
  > ❌ `[method set_resource_path/<method parameters>/path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const char* const*)))`
- set_search_path
  > ❌ `[method set_search_path/<method parameters>/path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const char* const*)))`
- set_theme_name ✅

#### Functions
- get_for_display ✅

#### Signals
- changed ✅


### IconView


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>36</td><td>0</td><td>24</tr>
<tr><td>signals</td><td>7</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

- new_with_area ✅

- new_with_model ✅

#### Methods
- create_drag_icon
  > ❌ `[method create_drag_icon/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- enable_model_drag_dest
  > ❌ `[method enable_model_drag_dest/<method parameters>/formats]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- enable_model_drag_source
  > ❌ `[method enable_model_drag_source/<method parameters>/formats]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- get_activate_on_single_click ✅

- get_cell_rect
  > ❌ `[method get_cell_rect]: Method get_cell_rect contains an OUT parameter, which is not supported yet`
- get_column_spacing ✅

- get_columns ✅

- get_cursor
  > ❌ `[method get_cursor]: Method get_cursor contains an OUT parameter, which is not supported yet`
- get_dest_item_at_pos
  > ❌ `[method get_dest_item_at_pos]: Method get_dest_item_at_pos contains an OUT parameter, which is not supported yet`
- get_drag_dest_item
  > ❌ `[method get_drag_dest_item]: Method get_drag_dest_item contains an OUT parameter, which is not supported yet`
- get_item_at_pos
  > ❌ `[method get_item_at_pos]: Method get_item_at_pos contains an OUT parameter, which is not supported yet`
- get_item_column
  > ❌ `[method get_item_column/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- get_item_orientation ✅

- get_item_padding ✅

- get_item_row
  > ❌ `[method get_item_row/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- get_item_width ✅

- get_margin ✅

- get_markup_column ✅

- get_model ✅

- get_path_at_pos
  > ❌ `[method get_path_at_pos/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- get_pixbuf_column ✅

- get_reorderable ✅

- get_row_spacing ✅

- get_selected_items
  > ❌ `[method get_selected_items/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(TreePath))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_selection_mode ✅

- get_spacing ✅

- get_text_column ✅

- get_tooltip_column ✅

- get_tooltip_context
  > ❌ `[method get_tooltip_context]: Method get_tooltip_context contains an OUT parameter, which is not supported yet`
- get_visible_range
  > ❌ `[method get_visible_range]: Method get_visible_range contains an OUT parameter, which is not supported yet`
- item_activated
  > ❌ `[method item_activated/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- path_is_selected
  > ❌ `[method path_is_selected/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- scroll_to_path
  > ❌ `[method scroll_to_path/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- select_all ✅

- select_path
  > ❌ `[method select_path/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- selected_foreach
  > ❌ `[method selected_foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IconViewForeachFunc), @type -> DataRecord(GtkIconViewForeachFunc)))`
- set_activate_on_single_click ✅

- set_column_spacing ✅

- set_columns ✅

- set_cursor
  > ❌ `[method set_cursor/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_drag_dest_item
  > ❌ `[method set_drag_dest_item/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_item_orientation ✅

- set_item_padding ✅

- set_item_width ✅

- set_margin ✅

- set_markup_column ✅

- set_model ✅

- set_pixbuf_column ✅

- set_reorderable ✅

- set_row_spacing ✅

- set_selection_mode ✅

- set_spacing ✅

- set_text_column ✅

- set_tooltip_cell
  > ❌ `[method set_tooltip_cell/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_tooltip_column ✅

- set_tooltip_item
  > ❌ `[method set_tooltip_item/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- unselect_all ✅

- unselect_path
  > ❌ `[method unselect_path/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- unset_model_drag_dest ✅

- unset_model_drag_source ✅

#### Signals
- activate-cursor-item ✅

- item-activated
  > ❌ `[signal item-activated]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreePath)))`
- move-cursor ✅

- select-all ✅

- select-cursor-item ✅

- selection-changed ✅

- toggle-cursor-item ✅

- unselect-all ✅


### Image


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>7</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>15</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_file ✅

- new_from_gicon ✅

- new_from_icon_name ✅

- new_from_paintable ✅

- new_from_pixbuf ✅

- new_from_resource ✅

#### Methods
- clear ✅

- get_gicon ✅

- get_icon_name ✅

- get_icon_size ✅

- get_paintable ✅

- get_pixel_size ✅

- get_storage_type ✅

- set_from_file ✅

- set_from_gicon ✅

- set_from_icon_name ✅

- set_from_paintable ✅

- set_from_pixbuf ✅

- set_from_resource ✅

- set_icon_size ✅

- set_pixel_size ✅


### InfoBar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>14</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_buttons ✅

#### Methods
- add_action_widget ✅

- add_button ✅

- add_buttons
  > ❌ `[method add_buttons/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- add_child ✅

- get_message_type ✅

- get_revealed ✅

- get_show_close_button ✅

- remove_action_widget ✅

- remove_child ✅

- response ✅

- set_default_response ✅

- set_message_type ✅

- set_response_sensitive ✅

- set_revealed ✅

- set_show_close_button ✅

#### Signals
- close ✅

- response ✅


### Inscription


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>19</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_attributes
  > ❌ `[method get_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- get_min_chars ✅

- get_min_lines ✅

- get_nat_chars ✅

- get_nat_lines ✅

- get_text ✅

- get_text_overflow ✅

- get_wrap_mode ✅

- get_xalign ✅

- get_yalign ✅

- set_attributes
  > ❌ `[method set_attributes/<method parameters>/attrs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- set_markup ✅

- set_min_chars ✅

- set_min_lines ✅

- set_nat_chars ✅

- set_nat_lines ✅

- set_text ✅

- set_text_overflow ✅

- set_wrap_mode ✅

- set_xalign ✅

- set_yalign ✅


### KeyvalTrigger


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_keyval ✅

- get_modifiers ✅


### Label


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>43</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>4</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_mnemonic ✅

#### Methods
- get_attributes
  > ❌ `[method get_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- get_current_uri ✅

- get_ellipsize ✅

- get_extra_menu ✅

- get_justify ✅

- get_label ✅

- get_layout ✅

- get_layout_offsets
  > ❌ `[method get_layout_offsets]: Method get_layout_offsets contains an OUT parameter, which is not supported yet`
- get_lines ✅

- get_max_width_chars ✅

- get_mnemonic_keyval ✅

- get_mnemonic_widget ✅

- get_natural_wrap_mode ✅

- get_selectable ✅

- get_selection_bounds
  > ❌ `[method get_selection_bounds]: Method get_selection_bounds contains an OUT parameter, which is not supported yet`
- get_single_line_mode ✅

- get_tabs
  > ❌ `[method get_tabs/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- get_text ✅

- get_use_markup ✅

- get_use_underline ✅

- get_width_chars ✅

- get_wrap ✅

- get_wrap_mode ✅

- get_xalign ✅

- get_yalign ✅

- select_region ✅

- set_attributes
  > ❌ `[method set_attributes/<method parameters>/attrs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- set_ellipsize ✅

- set_extra_menu ✅

- set_justify ✅

- set_label ✅

- set_lines ✅

- set_markup ✅

- set_markup_with_mnemonic ✅

- set_max_width_chars ✅

- set_mnemonic_widget ✅

- set_natural_wrap_mode ✅

- set_selectable ✅

- set_single_line_mode ✅

- set_tabs
  > ❌ `[method set_tabs/<method parameters>/tabs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- set_text ✅

- set_text_with_mnemonic ✅

- set_use_markup ✅

- set_use_underline ✅

- set_width_chars ✅

- set_wrap ✅

- set_wrap_mode ✅

- set_xalign ✅

- set_yalign ✅

#### Signals
- activate-current-link ✅

- activate-link ✅

- copy-clipboard ✅

- move-cursor ✅


### LayoutChild


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child_widget ✅

- get_layout_manager ✅


### LayoutManager


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- allocate ✅

- get_layout_child ✅

- get_request_mode ✅

- get_widget ✅

- layout_changed ✅

- measure
  > ❌ `[method measure]: Method measure contains an OUT parameter, which is not supported yet`

### LevelBar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>12</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_interval ✅

#### Methods
- add_offset_value ✅

- get_inverted ✅

- get_max_value ✅

- get_min_value ✅

- get_mode ✅

- get_offset_value
  > ❌ `[method get_offset_value]: Method get_offset_value contains an OUT parameter, which is not supported yet`
- get_value ✅

- remove_offset_value ✅

- set_inverted ✅

- set_max_value ✅

- set_min_value ✅

- set_mode ✅

- set_value ✅

#### Signals
- offset-changed ✅


### LinkButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_label ✅

#### Methods
- get_uri ✅

- get_visited ✅

- set_uri ✅

- set_visited ✅

#### Signals
- activate-link ✅


### ListBase


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ListBox


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>26</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>8</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append ✅

- bind_model
  > ❌ `[method bind_model/<method parameters>/create_widget_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxCreateWidgetFunc), @type -> DataRecord(GtkListBoxCreateWidgetFunc)))`
- drag_highlight_row ✅

- drag_unhighlight_row ✅

- get_activate_on_single_click ✅

- get_adjustment ✅

- get_row_at_index ✅

- get_row_at_y ✅

- get_selected_row ✅

- get_selected_rows
  > ❌ `[method get_selected_rows/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ListBoxRow))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_selection_mode ✅

- get_show_separators ✅

- insert ✅

- invalidate_filter ✅

- invalidate_headers ✅

- invalidate_sort ✅

- prepend ✅

- remove ✅

- remove_all ✅

- select_all ✅

- select_row ✅

- selected_foreach
  > ❌ `[method selected_foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxForeachFunc), @type -> DataRecord(GtkListBoxForeachFunc)))`
- set_activate_on_single_click ✅

- set_adjustment ✅

- set_filter_func
  > ❌ `[method set_filter_func/<method parameters>/filter_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxFilterFunc), @type -> DataRecord(GtkListBoxFilterFunc)))`
- set_header_func
  > ❌ `[method set_header_func/<method parameters>/update_header]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxUpdateHeaderFunc), @type -> DataRecord(GtkListBoxUpdateHeaderFunc)))`
- set_placeholder ✅

- set_selection_mode ✅

- set_show_separators ✅

- set_sort_func
  > ❌ `[method set_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ListBoxSortFunc), @type -> DataRecord(GtkListBoxSortFunc)))`
- unselect_all ✅

- unselect_row ✅

#### Signals
- activate-cursor-row ✅

- move-cursor ✅

- row-activated ✅

- row-selected ✅

- select-all ✅

- selected-rows-changed ✅

- toggle-cursor-row ✅

- unselect-all ✅


### ListBoxRow


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- changed ✅

- get_activatable ✅

- get_child ✅

- get_header ✅

- get_index ✅

- get_selectable ✅

- is_selected ✅

- set_activatable ✅

- set_child ✅

- set_header ✅

- set_selectable ✅

#### Signals
- activate ✅


### ListHeader


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child ✅

- get_end ✅

- get_item ✅

- get_n_items ✅

- get_start ✅

- set_child ✅


### ListItem


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>15</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_accessible_description ✅

- get_accessible_label ✅

- get_activatable ✅

- get_child ✅

- get_focusable ✅

- get_item ✅

- get_position ✅

- get_selectable ✅

- get_selected ✅

- set_accessible_description ✅

- set_accessible_label ✅

- set_activatable ✅

- set_child ✅

- set_focusable ✅

- set_selectable ✅


### ListItemFactory


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ListStore


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>20</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- newv
  > ❌ `[constructor newv/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GType*)))`
#### Methods
- append
  > ❌ `[method append]: Method append contains an OUT parameter, which is not supported yet`
- clear ✅

- get
  > ❌ `[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_valist
  > ❌ `[method get_valist]: Method get_valist is weird: conflicting override`
- insert
  > ❌ `[method insert]: Method insert contains an OUT parameter, which is not supported yet`
- insert_after
  > ❌ `[method insert_after]: Method insert_after contains an OUT parameter, which is not supported yet`
- insert_before
  > ❌ `[method insert_before]: Method insert_before contains an OUT parameter, which is not supported yet`
- insert_with_values
  > ❌ `[method insert_with_values]: Method insert_with_values contains an OUT parameter, which is not supported yet`
- insert_with_valuesv
  > ❌ `[method insert_with_valuesv]: Method insert_with_valuesv contains an OUT parameter, which is not supported yet`
- iter_is_valid
  > ❌ `[method iter_is_valid/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- move_after
  > ❌ `[method move_after/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- move_before
  > ❌ `[method move_before/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- prepend
  > ❌ `[method prepend]: Method prepend contains an OUT parameter, which is not supported yet`
- remove
  > ❌ `[method remove/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- reorder
  > ❌ `[method reorder/<method parameters>/new_order]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@type -> DataRecord(int*)))`
- set
  > ❌ `[method set/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set_column_types
  > ❌ `[method set_column_types/<method parameters>/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GType*)))`
- set_valist
  > ❌ `[method set_valist/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set_value
  > ❌ `[method set_value/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set_valuesv
  > ❌ `[method set_valuesv/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- swap
  > ❌ `[method swap/<method parameters>/a]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`

### ListView


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>14</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_enable_rubberband ✅

- get_factory ✅

- get_header_factory ✅

- get_model ✅

- get_show_separators ✅

- get_single_click_activate ✅

- get_tab_behavior ✅

- scroll_to
  > ❌ `[method scroll_to/<method parameters>/scroll]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ScrollInfo), @type -> DataRecord(GtkScrollInfo*)))`
- set_enable_rubberband ✅

- set_factory ✅

- set_header_factory ✅

- set_model ✅

- set_show_separators ✅

- set_single_click_activate ✅

- set_tab_behavior ✅

#### Signals
- activate
  > ❌ `[signal activate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`

### LockButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_permission ✅

- set_permission ✅


### MapListModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/map_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MapListModelMapFunc), @type -> DataRecord(GtkMapListModelMapFunc)))`
#### Methods
- get_model ✅

- has_map ✅

- set_map_func
  > ❌ `[method set_map_func/<method parameters>/map_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MapListModelMapFunc), @type -> DataRecord(GtkMapListModelMapFunc)))`
- set_model ✅


### MediaControls


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_media_stream ✅

- set_media_stream ✅


### MediaFile


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>5</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_file ✅

- new_for_filename ✅

- new_for_input_stream ✅

- new_for_resource ✅

#### Methods
- clear ✅

- get_file ✅

- get_input_stream ✅

- set_file ✅

- set_filename ✅

- set_input_stream ✅

- set_resource ✅


### MediaStream


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>30</td><td>0</td><td>4</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- ended ✅

- error
  > ❌ `[method error/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- error_valist
  > ❌ `[method error_valist/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))`
- gerror
  > ❌ `[method gerror/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))`
- get_duration ✅

- get_ended ✅

- get_error
  > ❌ `[method get_error/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))`
- get_loop ✅

- get_muted ✅

- get_playing ✅

- get_timestamp ✅

- get_volume ✅

- has_audio ✅

- has_video ✅

- is_prepared ✅

- is_seekable ✅

- is_seeking ✅

- pause ✅

- play ✅

- prepared ✅

- realize ✅

- seek ✅

- seek_failed ✅

- seek_success ✅

- set_loop ✅

- set_muted ✅

- set_playing ✅

- set_volume ✅

- stream_ended ✅

- stream_prepared ✅

- stream_unprepared ✅

- unprepared ✅

- unrealize ✅

- update ✅


### MenuButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>24</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_active ✅

- get_always_show_arrow ✅

- get_can_shrink ✅

- get_child ✅

- get_direction
  > ❌ `[method get_direction]: Method get_direction is weird: conflicting override`
- get_has_frame ✅

- get_icon_name ✅

- get_label ✅

- get_menu_model ✅

- get_popover ✅

- get_primary ✅

- get_use_underline ✅

- popdown ✅

- popup ✅

- set_active ✅

- set_always_show_arrow ✅

- set_can_shrink ✅

- set_child ✅

- set_create_popup_func
  > ❌ `[method set_create_popup_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MenuButtonCreatePopupFunc), @type -> DataRecord(GtkMenuButtonCreatePopupFunc)))`
- set_direction
  > ❌ `[method set_direction]: Method set_direction is weird: conflicting override`
- set_has_frame ✅

- set_icon_name ✅

- set_label ✅

- set_menu_model ✅

- set_popover ✅

- set_primary ✅

- set_use_underline ✅

#### Signals
- activate ✅


### MessageDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_markup ✅

#### Methods
- format_secondary_markup
  > ❌ `[method format_secondary_markup/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- format_secondary_text
  > ❌ `[method format_secondary_text/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_display ✅

- get_focus ✅

- get_message_area ✅

- realize ✅

- set_focus ✅

- set_markup ✅

- unrealize ✅


### MnemonicAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Functions
- get ✅


### MnemonicTrigger


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_keyval ✅


### MountOperation


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_display ✅

- get_parent ✅

- is_showing ✅

- set_display ✅

- set_parent ✅


### MultiFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- append ✅

- remove ✅


### MultiSelection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_model ✅

- set_model ✅


### MultiSorter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append ✅

- remove ✅


### NamedAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_action_name ✅


### NativeDialog


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- destroy ✅

- get_modal ✅

- get_title ✅

- get_transient_for ✅

- get_visible ✅

- hide ✅

- set_modal ✅

- set_title ✅

- set_transient_for ✅

- show ✅

#### Signals
- response ✅


### NeverTrigger


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Functions
- get ✅


### NoSelection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_model ✅

- set_model ✅


### Notebook


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>44</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>6</td><td>0</td><td>4</tr></table>

#### Constructors
- new ✅

#### Methods
- append_page ✅

- append_page_menu ✅

- detach_tab ✅

- get_action_widget ✅

- get_current_page ✅

- get_group_name ✅

- get_menu_label ✅

- get_menu_label_text ✅

- get_n_pages ✅

- get_nth_page ✅

- get_page ✅

- get_pages ✅

- get_scrollable ✅

- get_show_border ✅

- get_show_tabs ✅

- get_tab_detachable ✅

- get_tab_label ✅

- get_tab_label_text ✅

- get_tab_pos ✅

- get_tab_reorderable ✅

- insert_page ✅

- insert_page_menu ✅

- next_page ✅

- page_num ✅

- popup_disable ✅

- popup_enable ✅

- prepend_page ✅

- prepend_page_menu ✅

- prev_page ✅

- remove_page ✅

- reorder_child ✅

- set_action_widget ✅

- set_current_page ✅

- set_group_name ✅

- set_menu_label ✅

- set_menu_label_text ✅

- set_scrollable ✅

- set_show_border ✅

- set_show_tabs ✅

- set_tab_detachable ✅

- set_tab_label ✅

- set_tab_label_text ✅

- set_tab_pos ✅

- set_tab_reorderable ✅

#### Signals
- change-current-page ✅

- create-window ✅

- focus-tab ✅

- move-focus-out ✅

- page-added
  > ❌ `[signal page-added]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- page-removed
  > ❌ `[signal page-removed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- page-reordered
  > ❌ `[signal page-reordered]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- reorder-tab ✅

- select-page ✅

- switch-page
  > ❌ `[signal switch-page]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`

### NotebookPage


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child ✅


### NothingAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Functions
- get ✅


### NumericSorter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_expression ✅

- get_sort_order ✅

- set_expression ✅

- set_sort_order ✅


### ObjectExpression


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_object ✅


### Overlay


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- add_overlay ✅

- get_child ✅

- get_clip_overlay ✅

- get_measure_overlay ✅

- remove_overlay ✅

- set_child ✅

- set_clip_overlay ✅

- set_measure_overlay ✅

#### Signals
- get-child-position
  > ❌ `[signal get-child-position]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle)))`

### OverlayLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### OverlayLayoutChild


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_clip_overlay ✅

- get_measure ✅

- set_clip_overlay ✅

- set_measure ✅


### PadController


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- set_action ✅

- set_action_entries
  > ❌ `[method set_action_entries/<method parameters>/entries]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PadActionEntry), @type -> DataRecord(GtkPadActionEntry)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GtkPadActionEntry*)))`

### PageSetup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>17</td><td>0</td><td>6</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_file ✅

- new_from_gvariant
  > ❌ `[constructor new_from_gvariant/variant]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- new_from_key_file
  > ❌ `[constructor new_from_key_file/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))`
#### Methods
- copy ✅

- get_bottom_margin ✅

- get_left_margin ✅

- get_orientation ✅

- get_page_height ✅

- get_page_width ✅

- get_paper_height ✅

- get_paper_size
  > ❌ `[method get_paper_size/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))`
- get_paper_width ✅

- get_right_margin ✅

- get_top_margin ✅

- load_file ✅

- load_key_file
  > ❌ `[method load_key_file/<method parameters>/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))`
- set_bottom_margin ✅

- set_left_margin ✅

- set_orientation ✅

- set_paper_size
  > ❌ `[method set_paper_size/<method parameters>/size]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))`
- set_paper_size_and_default_margins
  > ❌ `[method set_paper_size_and_default_margins/<method parameters>/size]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))`
- set_right_margin ✅

- set_top_margin ✅

- to_file ✅

- to_gvariant
  > ❌ `[method to_gvariant/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- to_key_file
  > ❌ `[method to_key_file/<method parameters>/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))`

### PageSetupUnixDialog

❌ `[PageSetupUnixDialog]: Class PageSetupUnixDialog is weird: Missing in raw bindings`


### Paned


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>16</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>6</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_end_child ✅

- get_position ✅

- get_resize_end_child ✅

- get_resize_start_child ✅

- get_shrink_end_child ✅

- get_shrink_start_child ✅

- get_start_child ✅

- get_wide_handle ✅

- set_end_child ✅

- set_position ✅

- set_resize_end_child ✅

- set_resize_start_child ✅

- set_shrink_end_child ✅

- set_shrink_start_child ✅

- set_start_child ✅

- set_wide_handle ✅

#### Signals
- accept-position ✅

- cancel-position ✅

- cycle-child-focus ✅

- cycle-handle-focus ✅

- move-handle ✅

- toggle-handle-focus ✅


### ParamSpecExpression


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### PasswordEntry


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_extra_menu ✅

- get_show_peek_icon ✅

- set_extra_menu ✅

- set_show_peek_icon ✅

#### Signals
- activate ✅


### PasswordEntryBuffer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### Picture


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>6</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>15</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_file ✅

- new_for_filename ✅

- new_for_paintable ✅

- new_for_pixbuf ✅

- new_for_resource ✅

#### Methods
- get_alternative_text ✅

- get_can_shrink ✅

- get_content_fit ✅

- get_file ✅

- get_keep_aspect_ratio ✅

- get_paintable ✅

- set_alternative_text ✅

- set_can_shrink ✅

- set_content_fit ✅

- set_file ✅

- set_filename ✅

- set_keep_aspect_ratio ✅

- set_paintable ✅

- set_pixbuf ✅

- set_resource ✅


### Popover


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>19</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_autohide ✅

- get_cascade_popdown ✅

- get_child ✅

- get_has_arrow ✅

- get_mnemonics_visible ✅

- get_offset
  > ❌ `[method get_offset]: Method get_offset contains an OUT parameter, which is not supported yet`
- get_pointing_to
  > ❌ `[method get_pointing_to]: Method get_pointing_to contains an OUT parameter, which is not supported yet`
- get_position ✅

- popdown ✅

- popup ✅

- present ✅

- realize ✅

- set_autohide ✅

- set_cascade_popdown ✅

- set_child ✅

- set_default_widget ✅

- set_has_arrow ✅

- set_mnemonics_visible ✅

- set_offset ✅

- set_pointing_to
  > ❌ `[method set_pointing_to/<method parameters>/rect]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`
- set_position ✅

- unrealize ✅

#### Signals
- activate-default ✅

- closed ✅


### PopoverMenu


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_model ✅

- new_from_model_full ✅

#### Methods
- add_child ✅

- get_flags ✅

- get_menu_model ✅

- realize ✅

- remove_child ✅

- set_flags ✅

- set_menu_model ✅

- unrealize ✅


### PopoverMenuBar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_from_model ✅

#### Methods
- add_child ✅

- get_menu_model ✅

- remove_child ✅

- set_menu_model ✅


### PrintContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- create_pango_context ✅

- create_pango_layout ✅

- get_cairo_context
  > ❌ `[method get_cairo_context/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))`
- get_dpi_x ✅

- get_dpi_y ✅

- get_hard_margins
  > ❌ `[method get_hard_margins]: Method get_hard_margins contains an OUT parameter, which is not supported yet`
- get_height ✅

- get_page_setup ✅

- get_pango_fontmap ✅

- get_width ✅

- set_cairo_context
  > ❌ `[method set_cairo_context/<method parameters>/cr]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))`

### PrintJob

❌ `[PrintJob]: Class PrintJob is weird: Missing in raw bindings`


### PrintOperation


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>29</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>10</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- cancel ✅

- draw_page_finish ✅

- get_default_page_setup ✅

- get_embed_page_setup ✅

- get_error ✅

- get_has_selection ✅

- get_n_pages_to_print ✅

- get_print_settings ✅

- get_status ✅

- get_status_string ✅

- get_support_selection ✅

- is_finished ✅

- run ✅

- set_allow_async ✅

- set_current_page ✅

- set_custom_tab_label ✅

- set_default_page_setup ✅

- set_defer_drawing ✅

- set_embed_page_setup ✅

- set_export_filename ✅

- set_has_selection ✅

- set_job_name ✅

- set_n_pages ✅

- set_print_settings ✅

- set_show_progress ✅

- set_support_selection ✅

- set_track_print_status ✅

- set_unit ✅

- set_use_full_page ✅

#### Signals
- begin-print ✅

- create-custom-widget ✅

- custom-widget-apply ✅

- done ✅

- draw-page ✅

- end-print ✅

- paginate ✅

- preview
  > ❌ `[signal preview]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(PrintOperationPreview)))`
- request-page-setup ✅

- status-changed ✅

- update-custom-widget ✅


### PrintSettings


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>2</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>63</td><td>0</td><td>9</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_from_file ✅

- new_from_gvariant
  > ❌ `[constructor new_from_gvariant/variant]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- new_from_key_file
  > ❌ `[constructor new_from_key_file/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))`
#### Methods
- copy ✅

- foreach
  > ❌ `[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PrintSettingsFunc), @type -> DataRecord(GtkPrintSettingsFunc)))`
- get ✅

- get_bool ✅

- get_collate ✅

- get_default_source ✅

- get_dither ✅

- get_double ✅

- get_double_with_default ✅

- get_duplex ✅

- get_finishings ✅

- get_int ✅

- get_int_with_default ✅

- get_length ✅

- get_media_type ✅

- get_n_copies ✅

- get_number_up ✅

- get_number_up_layout ✅

- get_orientation ✅

- get_output_bin ✅

- get_page_ranges
  > ❌ `[method get_page_ranges]: Method get_page_ranges contains an OUT parameter, which is not supported yet`
- get_page_set ✅

- get_paper_height ✅

- get_paper_size
  > ❌ `[method get_paper_size/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))`
- get_paper_width ✅

- get_print_pages ✅

- get_printer ✅

- get_printer_lpi ✅

- get_quality ✅

- get_resolution ✅

- get_resolution_x ✅

- get_resolution_y ✅

- get_reverse ✅

- get_scale ✅

- get_use_color ✅

- has_key ✅

- load_file ✅

- load_key_file
  > ❌ `[method load_key_file/<method parameters>/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))`
- set
  > ❌ `[method set]: Method set is weird: override stuff I don't want to deal with`
- set_bool ✅

- set_collate ✅

- set_default_source ✅

- set_dither ✅

- set_double ✅

- set_duplex ✅

- set_finishings ✅

- set_int ✅

- set_length ✅

- set_media_type ✅

- set_n_copies ✅

- set_number_up ✅

- set_number_up_layout ✅

- set_orientation ✅

- set_output_bin ✅

- set_page_ranges
  > ❌ `[method set_page_ranges/<method parameters>/page_ranges]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PageRange), @type -> DataRecord(GtkPageRange)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GtkPageRange*)))`
- set_page_set ✅

- set_paper_height ✅

- set_paper_size
  > ❌ `[method set_paper_size/<method parameters>/paper_size]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(PaperSize), @type -> DataRecord(GtkPaperSize*)))`
- set_paper_width ✅

- set_print_pages ✅

- set_printer ✅

- set_printer_lpi ✅

- set_quality ✅

- set_resolution ✅

- set_resolution_xy ✅

- set_reverse ✅

- set_scale ✅

- set_use_color ✅

- to_file ✅

- to_gvariant
  > ❌ `[method to_gvariant/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- to_key_file
  > ❌ `[method to_key_file/<method parameters>/key_file]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.KeyFile), @type -> DataRecord(GKeyFile*)))`
- unset ✅


### PrintUnixDialog

❌ `[PrintUnixDialog]: Class PrintUnixDialog is weird: Missing in raw bindings`


### Printer

❌ `[Printer]: Class Printer is weird: Missing in raw bindings`


### ProgressBar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_ellipsize ✅

- get_fraction ✅

- get_inverted ✅

- get_pulse_step ✅

- get_show_text ✅

- get_text ✅

- pulse ✅

- set_ellipsize ✅

- set_fraction ✅

- set_inverted ✅

- set_pulse_step ✅

- set_show_text ✅

- set_text ✅


### PropertyExpression


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_pspec ✅

#### Methods
- get_expression ✅

- get_pspec ✅


### Range


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>20</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>2</tr></table>

#### Methods
- get_adjustment ✅

- get_fill_level ✅

- get_flippable ✅

- get_inverted ✅

- get_range_rect
  > ❌ `[method get_range_rect]: Method get_range_rect contains an OUT parameter, which is not supported yet`
- get_restrict_to_fill_level ✅

- get_round_digits ✅

- get_show_fill_level ✅

- get_slider_range
  > ❌ `[method get_slider_range]: Method get_slider_range contains an OUT parameter, which is not supported yet`
- get_slider_size_fixed ✅

- get_value ✅

- set_adjustment ✅

- set_fill_level ✅

- set_flippable ✅

- set_increments ✅

- set_inverted ✅

- set_range ✅

- set_restrict_to_fill_level ✅

- set_round_digits ✅

- set_show_fill_level ✅

- set_slider_size_fixed ✅

- set_value ✅

#### Signals
- adjust-bounds
  > ❌ `[signal adjust-bounds]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- change-value
  > ❌ `[signal change-value]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`
- move-slider ✅

- value-changed ✅


### RecentManager


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>1</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_full
  > ❌ `[method add_full/<method parameters>/recent_data]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RecentData), @type -> DataRecord(const GtkRecentData*)))`
- add_item ✅

- get_items
  > ❌ `[method get_items/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(RecentInfo))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- has_item ✅

- lookup_item
  > ❌ `[method lookup_item/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(RecentInfo), @type -> DataRecord(GtkRecentInfo*)))`
- move_item ✅

- purge_items ✅

- remove_item ✅

#### Functions
- get_default ✅

#### Signals
- changed ✅


### Revealer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_child_revealed ✅

- get_reveal_child ✅

- get_transition_duration ✅

- get_transition_type ✅

- set_child ✅

- set_reveal_child ✅

- set_transition_duration ✅

- set_transition_type ✅


### Scale


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_range ✅

#### Methods
- add_mark ✅

- clear_marks ✅

- get_digits ✅

- get_draw_value ✅

- get_has_origin ✅

- get_layout ✅

- get_layout_offsets
  > ❌ `[method get_layout_offsets]: Method get_layout_offsets contains an OUT parameter, which is not supported yet`
- get_value_pos ✅

- set_digits ✅

- set_draw_value ✅

- set_format_value_func
  > ❌ `[method set_format_value_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ScaleFormatValueFunc), @type -> DataRecord(GtkScaleFormatValueFunc)))`
- set_has_origin ✅

- set_value_pos ✅


### ScaleButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

#### Methods
- get_active ✅

- get_adjustment ✅

- get_minus_button ✅

- get_plus_button ✅

- get_popup ✅

- get_value ✅

- set_adjustment ✅

- set_icons ✅

- set_value ✅

#### Signals
- popdown ✅

- popup ✅

- value-changed
  > ❌ `[signal value-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))`

### Scrollbar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_adjustment ✅

- set_adjustment ✅


### ScrolledWindow


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>30</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>4</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_hadjustment ✅

- get_has_frame ✅

- get_hscrollbar ✅

- get_kinetic_scrolling ✅

- get_max_content_height ✅

- get_max_content_width ✅

- get_min_content_height ✅

- get_min_content_width ✅

- get_overlay_scrolling ✅

- get_placement ✅

- get_policy
  > ❌ `[method get_policy]: Method get_policy contains an OUT parameter, which is not supported yet`
- get_propagate_natural_height ✅

- get_propagate_natural_width ✅

- get_vadjustment ✅

- get_vscrollbar ✅

- set_child ✅

- set_hadjustment ✅

- set_has_frame ✅

- set_kinetic_scrolling ✅

- set_max_content_height ✅

- set_max_content_width ✅

- set_min_content_height ✅

- set_min_content_width ✅

- set_overlay_scrolling ✅

- set_placement ✅

- set_policy ✅

- set_propagate_natural_height ✅

- set_propagate_natural_width ✅

- set_vadjustment ✅

- unset_placement ✅

#### Signals
- edge-overshot ✅

- edge-reached ✅

- move-focus-out ✅

- scroll-child ✅


### SearchBar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- connect_entry ✅

- get_child ✅

- get_key_capture_widget ✅

- get_search_mode ✅

- get_show_close_button ✅

- set_child ✅

- set_key_capture_widget ✅

- set_search_mode ✅

- set_show_close_button ✅


### SearchEntry


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>6</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_key_capture_widget ✅

- get_placeholder_text ✅

- get_search_delay ✅

- set_key_capture_widget ✅

- set_placeholder_text ✅

- set_search_delay ✅

#### Signals
- activate ✅

- next-match ✅

- previous-match ✅

- search-changed ✅

- search-started ✅

- stop-search ✅


### SelectionFilterModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_model ✅

- set_model ✅


### Separator


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### Settings


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- reset_property ✅

#### Functions
- get_default ✅

- get_for_display ✅


### Shortcut


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_arguments ✅

#### Methods
- get_action ✅

- get_arguments
  > ❌ `[method get_arguments/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- get_trigger ✅

- set_action ✅

- set_arguments
  > ❌ `[method set_arguments/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_trigger ✅


### ShortcutAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- parse_string ✅

#### Methods
- activate
  > ❌ `[method activate/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- print
  > ❌ `[method print/<method parameters>/string]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.String), @type -> DataRecord(GString*)))`
- to_string ✅


### ShortcutController


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_model ✅

#### Methods
- add_shortcut ✅

- get_mnemonics_modifiers ✅

- get_scope ✅

- remove_shortcut ✅

- set_mnemonics_modifiers ✅

- set_scope ✅


### ShortcutLabel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_accelerator ✅

- get_disabled_text ✅

- set_accelerator ✅

- set_disabled_text ✅


### ShortcutTrigger


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- parse_string ✅

#### Methods
- compare ✅

- equal ✅

- hash ✅

- print
  > ❌ `[method print/<method parameters>/string]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.String), @type -> DataRecord(GString*)))`
- print_label
  > ❌ `[method print_label/<method parameters>/string]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.String), @type -> DataRecord(GString*)))`
- to_label ✅

- to_string ✅

- trigger ✅


### ShortcutsGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- add_shortcut ✅


### ShortcutsSection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- add_group ✅

#### Signals
- change-current-page ✅


### ShortcutsShortcut


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>


### ShortcutsWindow


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Methods
- add_section ✅

- get_display ✅

- get_focus ✅

- realize ✅

- set_focus ✅

- unrealize ✅

#### Signals
- close ✅

- search ✅


### SignalAction


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_signal_name ✅


### SignalListItemFactory


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>4</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Signals
- bind ✅

- setup ✅

- teardown ✅

- unbind ✅


### SingleSelection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_autoselect ✅

- get_can_unselect ✅

- get_model ✅

- get_selected ✅

- get_selected_item ✅

- set_autoselect ✅

- set_can_unselect ✅

- set_model ✅

- set_selected ✅


### SizeGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_widget ✅

- get_mode ✅

- get_widgets
  > ❌ `[method get_widgets/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Widget))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))`
- remove_widget ✅

- set_mode ✅


### SliceListModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_model ✅

- get_offset ✅

- get_size ✅

- set_model ✅

- set_offset ✅

- set_size ✅


### Snapshot


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>21</td><td>0</td><td>31</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- append_border
  > ❌ `[method append_border]: Method append_border is weird: non NULL-terminated arrays require special handling`
- append_cairo
  > ❌ `[method append_cairo]: Method append_cairo is weird: non NULL-terminated arrays require special handling`
- append_color
  > ❌ `[method append_color/<method parameters>/color]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- append_conic_gradient
  > ❌ `[method append_conic_gradient/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- append_fill
  > ❌ `[method append_fill/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))`
- append_inset_shadow
  > ❌ `[method append_inset_shadow/<method parameters>/outline]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
- append_layout
  > ❌ `[method append_layout/<method parameters>/color]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- append_linear_gradient
  > ❌ `[method append_linear_gradient/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- append_node ✅

- append_outset_shadow
  > ❌ `[method append_outset_shadow/<method parameters>/outline]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
- append_radial_gradient
  > ❌ `[method append_radial_gradient/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- append_repeating_linear_gradient
  > ❌ `[method append_repeating_linear_gradient/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- append_repeating_radial_gradient
  > ❌ `[method append_repeating_radial_gradient/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- append_scaled_texture
  > ❌ `[method append_scaled_texture/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- append_stroke
  > ❌ `[method append_stroke/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))`
- append_texture
  > ❌ `[method append_texture/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- free_to_node ✅

- free_to_paintable
  > ❌ `[method free_to_paintable/<method parameters>/size]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Size), @type -> DataRecord(const graphene_size_t*)))`
- gl_shader_pop_texture ✅

- perspective ✅

- pop ✅

- push_blend ✅

- push_blur ✅

- push_clip
  > ❌ `[method push_clip/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- push_color_matrix
  > ❌ `[method push_color_matrix/<method parameters>/color_matrix]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))`
- push_cross_fade ✅

- push_debug
  > ❌ `[method push_debug/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- push_fill
  > ❌ `[method push_fill/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))`
- push_gl_shader
  > ❌ `[method push_gl_shader/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- push_mask ✅

- push_opacity ✅

- push_repeat
  > ❌ `[method push_repeat/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))`
- push_rounded_clip
  > ❌ `[method push_rounded_clip/<method parameters>/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.RoundedRect), @type -> DataRecord(const GskRoundedRect*)))`
- push_shadow
  > ❌ `[method push_shadow/<method parameters>/shadow]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gsk.Shadow), @type -> DataRecord(GskShadow)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GskShadow*)))`
- push_stroke
  > ❌ `[method push_stroke/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Path), @type -> DataRecord(GskPath*)))`
- render_background ✅

- render_focus ✅

- render_frame ✅

- render_insertion_cursor ✅

- render_layout ✅

- restore ✅

- rotate ✅

- rotate_3d
  > ❌ `[method rotate_3d/<method parameters>/axis]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Vec3), @type -> DataRecord(const graphene_vec3_t*)))`
- save ✅

- scale ✅

- scale_3d ✅

- to_node ✅

- to_paintable
  > ❌ `[method to_paintable/<method parameters>/size]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Size), @type -> DataRecord(const graphene_size_t*)))`
- transform
  > ❌ `[method transform/<method parameters>/transform]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))`
- transform_matrix
  > ❌ `[method transform_matrix/<method parameters>/matrix]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Matrix), @type -> DataRecord(const graphene_matrix_t*)))`
- translate
  > ❌ `[method translate/<method parameters>/point]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))`
- translate_3d
  > ❌ `[method translate_3d/<method parameters>/point]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Point3D), @type -> DataRecord(const graphene_point3d_t*)))`

### SortListModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_incremental ✅

- get_model ✅

- get_pending ✅

- get_section_sorter ✅

- get_sorter ✅

- set_incremental ✅

- set_model ✅

- set_section_sorter ✅

- set_sorter ✅


### Sorter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- changed ✅

- compare ✅

- get_order ✅

#### Signals
- changed ✅


### SpinButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>22</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>4</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

- new_with_range ✅

#### Methods
- configure ✅

- get_adjustment ✅

- get_climb_rate ✅

- get_digits ✅

- get_increments
  > ❌ `[method get_increments]: Method get_increments contains an OUT parameter, which is not supported yet`
- get_numeric ✅

- get_range
  > ❌ `[method get_range]: Method get_range contains an OUT parameter, which is not supported yet`
- get_snap_to_ticks ✅

- get_update_policy ✅

- get_value ✅

- get_value_as_int ✅

- get_wrap ✅

- set_adjustment ✅

- set_climb_rate ✅

- set_digits ✅

- set_increments ✅

- set_numeric ✅

- set_range ✅

- set_snap_to_ticks ✅

- set_update_policy ✅

- set_value ✅

- set_wrap ✅

- spin ✅

- update ✅

#### Signals
- change-value ✅

- input
  > ❌ `[signal input]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gpointer)))`
- output ✅

- value-changed ✅

- wrapped ✅


### Spinner


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_spinning ✅

- set_spinning ✅

- start ✅

- stop ✅


### Stack


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>23</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_child ✅

- add_named ✅

- add_titled ✅

- get_child_by_name ✅

- get_hhomogeneous ✅

- get_interpolate_size ✅

- get_page ✅

- get_pages ✅

- get_transition_duration ✅

- get_transition_running ✅

- get_transition_type ✅

- get_vhomogeneous ✅

- get_visible_child ✅

- get_visible_child_name ✅

- remove ✅

- set_hhomogeneous ✅

- set_interpolate_size ✅

- set_transition_duration ✅

- set_transition_type ✅

- set_vhomogeneous ✅

- set_visible_child ✅

- set_visible_child_full ✅

- set_visible_child_name ✅


### StackPage


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child ✅

- get_icon_name ✅

- get_name ✅

- get_needs_attention ✅

- get_title ✅

- get_use_underline ✅

- get_visible ✅

- set_icon_name ✅

- set_name ✅

- set_needs_attention ✅

- set_title ✅

- set_use_underline ✅

- set_visible ✅


### StackSidebar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_stack ✅

- set_stack ✅


### StackSwitcher


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_stack ✅

- set_stack ✅


### Statusbar


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>2</tr></table>

#### Constructors
- new ✅

#### Methods
- get_context_id ✅

- pop ✅

- push ✅

- remove ✅

- remove_all ✅

#### Signals
- text-popped
  > ❌ `[signal text-popped]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`
- text-pushed
  > ❌ `[signal text-pushed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))`

### StringFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>8</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_expression ✅

- get_ignore_case ✅

- get_match_mode ✅

- get_search ✅

- set_expression ✅

- set_ignore_case ✅

- set_match_mode ✅

- set_search ✅


### StringList


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/strings]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))`
#### Methods
- append ✅

- get_string ✅

- remove ✅

- splice
  > ❌ `[method splice/<method parameters>/additions]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))`
- take ✅


### StringObject


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_string ✅


### StringSorter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_collation ✅

- get_expression ✅

- get_ignore_case ✅

- set_collation ✅

- set_expression ✅

- set_ignore_case ✅


### StyleContext


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>14</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- add_class ✅

- add_provider ✅

- get_border
  > ❌ `[method get_border]: Method get_border contains an OUT parameter, which is not supported yet`
- get_color
  > ❌ `[method get_color]: Method get_color contains an OUT parameter, which is not supported yet`
- get_display ✅

- get_margin
  > ❌ `[method get_margin]: Method get_margin contains an OUT parameter, which is not supported yet`
- get_padding
  > ❌ `[method get_padding]: Method get_padding contains an OUT parameter, which is not supported yet`
- get_scale ✅

- get_state ✅

- has_class ✅

- lookup_color
  > ❌ `[method lookup_color]: Method lookup_color contains an OUT parameter, which is not supported yet`
- remove_class ✅

- remove_provider ✅

- restore ✅

- save ✅

- set_display ✅

- set_scale ✅

- set_state ✅

- to_string ✅

#### Functions
- add_provider_for_display ✅

- remove_provider_for_display ✅


### Switch


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>2</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_active ✅

- get_state ✅

- set_active ✅

- set_state ✅

#### Signals
- activate ✅

- state-set ✅


### Text


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>29</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>11</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_buffer ✅

#### Methods
- compute_cursor_extents
  > ❌ `[method compute_cursor_extents]: Method compute_cursor_extents contains an OUT parameter, which is not supported yet`
- get_activates_default ✅

- get_attributes
  > ❌ `[method get_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- get_buffer ✅

- get_enable_emoji_completion ✅

- get_extra_menu ✅

- get_input_hints ✅

- get_input_purpose ✅

- get_invisible_char ✅

- get_max_length ✅

- get_overwrite_mode ✅

- get_placeholder_text ✅

- get_propagate_text_width ✅

- get_tabs
  > ❌ `[method get_tabs/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- get_text_length ✅

- get_truncate_multiline ✅

- get_visibility ✅

- grab_focus_without_selecting ✅

- set_activates_default ✅

- set_attributes
  > ❌ `[method set_attributes/<method parameters>/attrs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.AttrList), @type -> DataRecord(PangoAttrList*)))`
- set_buffer ✅

- set_enable_emoji_completion ✅

- set_extra_menu ✅

- set_input_hints ✅

- set_input_purpose ✅

- set_invisible_char ✅

- set_max_length ✅

- set_overwrite_mode ✅

- set_placeholder_text ✅

- set_propagate_text_width ✅

- set_tabs
  > ❌ `[method set_tabs/<method parameters>/tabs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- set_truncate_multiline ✅

- set_visibility ✅

- unset_invisible_char ✅

#### Signals
- activate ✅

- backspace ✅

- copy-clipboard ✅

- cut-clipboard ✅

- delete-from-cursor ✅

- insert-at-cursor ✅

- insert-emoji ✅

- move-cursor ✅

- paste-clipboard ✅

- preedit-changed ✅

- toggle-overwrite ✅


### TextBuffer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>32</td><td>0</td><td>38</tr>
<tr><td>signals</td><td>8</td><td>0</td><td>7</tr></table>

#### Constructors
- new ✅

#### Methods
- add_mark
  > ❌ `[method add_mark/<method parameters>/where]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- add_selection_clipboard ✅

- apply_tag
  > ❌ `[method apply_tag/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- apply_tag_by_name
  > ❌ `[method apply_tag_by_name/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- backspace
  > ❌ `[method backspace/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- begin_irreversible_action ✅

- begin_user_action ✅

- copy_clipboard ✅

- create_child_anchor
  > ❌ `[method create_child_anchor/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- create_mark
  > ❌ `[method create_mark/<method parameters>/where]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- create_tag
  > ❌ `[method create_tag/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- cut_clipboard ✅

- delete
  > ❌ `[method delete/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- delete_interactive
  > ❌ `[method delete_interactive/<method parameters>/start_iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- delete_mark ✅

- delete_mark_by_name ✅

- delete_selection ✅

- end_irreversible_action ✅

- end_user_action ✅

- get_bounds
  > ❌ `[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet`
- get_can_redo ✅

- get_can_undo ✅

- get_char_count ✅

- get_enable_undo ✅

- get_end_iter
  > ❌ `[method get_end_iter]: Method get_end_iter contains an OUT parameter, which is not supported yet`
- get_has_selection ✅

- get_insert ✅

- get_iter_at_child_anchor
  > ❌ `[method get_iter_at_child_anchor]: Method get_iter_at_child_anchor contains an OUT parameter, which is not supported yet`
- get_iter_at_line
  > ❌ `[method get_iter_at_line]: Method get_iter_at_line contains an OUT parameter, which is not supported yet`
- get_iter_at_line_index
  > ❌ `[method get_iter_at_line_index]: Method get_iter_at_line_index contains an OUT parameter, which is not supported yet`
- get_iter_at_line_offset
  > ❌ `[method get_iter_at_line_offset]: Method get_iter_at_line_offset contains an OUT parameter, which is not supported yet`
- get_iter_at_mark
  > ❌ `[method get_iter_at_mark]: Method get_iter_at_mark contains an OUT parameter, which is not supported yet`
- get_iter_at_offset
  > ❌ `[method get_iter_at_offset]: Method get_iter_at_offset contains an OUT parameter, which is not supported yet`
- get_line_count ✅

- get_mark ✅

- get_max_undo_levels ✅

- get_modified ✅

- get_selection_bound ✅

- get_selection_bounds
  > ❌ `[method get_selection_bounds]: Method get_selection_bounds contains an OUT parameter, which is not supported yet`
- get_selection_content ✅

- get_slice
  > ❌ `[method get_slice/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- get_start_iter
  > ❌ `[method get_start_iter]: Method get_start_iter contains an OUT parameter, which is not supported yet`
- get_tag_table ✅

- get_text
  > ❌ `[method get_text/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- insert
  > ❌ `[method insert/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_at_cursor ✅

- insert_child_anchor
  > ❌ `[method insert_child_anchor/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_interactive
  > ❌ `[method insert_interactive/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_interactive_at_cursor ✅

- insert_markup
  > ❌ `[method insert_markup/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_paintable
  > ❌ `[method insert_paintable/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_range
  > ❌ `[method insert_range/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_range_interactive
  > ❌ `[method insert_range_interactive/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_with_tags
  > ❌ `[method insert_with_tags/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- insert_with_tags_by_name
  > ❌ `[method insert_with_tags_by_name/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- move_mark
  > ❌ `[method move_mark/<method parameters>/where]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- move_mark_by_name
  > ❌ `[method move_mark_by_name/<method parameters>/where]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- paste_clipboard
  > ❌ `[method paste_clipboard/<method parameters>/override_location]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- place_cursor
  > ❌ `[method place_cursor/<method parameters>/where]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- redo ✅

- remove_all_tags
  > ❌ `[method remove_all_tags/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- remove_selection_clipboard ✅

- remove_tag
  > ❌ `[method remove_tag/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- remove_tag_by_name
  > ❌ `[method remove_tag_by_name/<method parameters>/start]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- select_range
  > ❌ `[method select_range/<method parameters>/ins]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- set_enable_undo ✅

- set_max_undo_levels ✅

- set_modified ✅

- set_text ✅

- undo ✅

#### Signals
- apply-tag
  > ❌ `[signal apply-tag]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- begin-user-action ✅

- changed ✅

- delete-range
  > ❌ `[signal delete-range]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- end-user-action ✅

- insert-child-anchor
  > ❌ `[signal insert-child-anchor]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- insert-paintable
  > ❌ `[signal insert-paintable]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- insert-text
  > ❌ `[signal insert-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- mark-deleted ✅

- mark-set
  > ❌ `[signal mark-set]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- modified-changed ✅

- paste-done ✅

- redo ✅

- remove-tag
  > ❌ `[signal remove-tag]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- undo ✅


### TextChildAnchor


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_replacement ✅

#### Methods
- get_deleted ✅

- get_widgets
  > ❌ `[method get_widgets]: Method get_widgets contains an OUT parameter, which is not supported yet`

### TextMark


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_buffer ✅

- get_deleted ✅

- get_left_gravity ✅

- get_name ✅

- get_visible ✅

- set_visible ✅


### TextTag


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- changed ✅

- get_priority ✅

- set_priority ✅


### TextTagTable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>3</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add ✅

- foreach
  > ❌ `[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TextTagTableForeach), @type -> DataRecord(GtkTextTagTableForeach)))`
- get_size ✅

- lookup ✅

- remove ✅

#### Signals
- tag-added ✅

- tag-changed ✅

- tag-removed ✅


### TextView


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>53</td><td>0</td><td>18</tr>
<tr><td>signals</td><td>14</td><td>0</td><td>1</tr></table>

#### Constructors
- new ✅

- new_with_buffer ✅

#### Methods
- add_child_at_anchor ✅

- add_overlay ✅

- backward_display_line
  > ❌ `[method backward_display_line/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- backward_display_line_start
  > ❌ `[method backward_display_line_start/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- buffer_to_window_coords
  > ❌ `[method buffer_to_window_coords]: Method buffer_to_window_coords contains an OUT parameter, which is not supported yet`
- forward_display_line
  > ❌ `[method forward_display_line/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- forward_display_line_end
  > ❌ `[method forward_display_line_end/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- get_accepts_tab ✅

- get_bottom_margin ✅

- get_buffer ✅

- get_cursor_locations
  > ❌ `[method get_cursor_locations]: Method get_cursor_locations contains an OUT parameter, which is not supported yet`
- get_cursor_visible ✅

- get_editable ✅

- get_extra_menu ✅

- get_gutter ✅

- get_indent ✅

- get_input_hints ✅

- get_input_purpose ✅

- get_iter_at_location
  > ❌ `[method get_iter_at_location]: Method get_iter_at_location contains an OUT parameter, which is not supported yet`
- get_iter_at_position
  > ❌ `[method get_iter_at_position]: Method get_iter_at_position contains an OUT parameter, which is not supported yet`
- get_iter_location
  > ❌ `[method get_iter_location]: Method get_iter_location contains an OUT parameter, which is not supported yet`
- get_justification ✅

- get_left_margin ✅

- get_line_at_y
  > ❌ `[method get_line_at_y]: Method get_line_at_y contains an OUT parameter, which is not supported yet`
- get_line_yrange
  > ❌ `[method get_line_yrange]: Method get_line_yrange contains an OUT parameter, which is not supported yet`
- get_ltr_context ✅

- get_monospace ✅

- get_overwrite ✅

- get_pixels_above_lines ✅

- get_pixels_below_lines ✅

- get_pixels_inside_wrap ✅

- get_right_margin ✅

- get_rtl_context ✅

- get_tabs
  > ❌ `[method get_tabs/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- get_top_margin ✅

- get_visible_rect
  > ❌ `[method get_visible_rect]: Method get_visible_rect contains an OUT parameter, which is not supported yet`
- get_wrap_mode ✅

- im_context_filter_keypress ✅

- move_mark_onscreen ✅

- move_overlay ✅

- move_visually
  > ❌ `[method move_visually/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- place_cursor_onscreen ✅

- remove ✅

- reset_cursor_blink ✅

- reset_im_context ✅

- scroll_mark_onscreen ✅

- scroll_to_iter
  > ❌ `[method scroll_to_iter/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))`
- scroll_to_mark ✅

- set_accepts_tab ✅

- set_bottom_margin ✅

- set_buffer ✅

- set_cursor_visible ✅

- set_editable ✅

- set_extra_menu ✅

- set_gutter ✅

- set_indent ✅

- set_input_hints ✅

- set_input_purpose ✅

- set_justification ✅

- set_left_margin ✅

- set_monospace ✅

- set_overwrite ✅

- set_pixels_above_lines ✅

- set_pixels_below_lines ✅

- set_pixels_inside_wrap ✅

- set_right_margin ✅

- set_tabs
  > ❌ `[method set_tabs/<method parameters>/tabs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))`
- set_top_margin ✅

- set_wrap_mode ✅

- starts_display_line
  > ❌ `[method starts_display_line/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))`
- window_to_buffer_coords
  > ❌ `[method window_to_buffer_coords]: Method window_to_buffer_coords contains an OUT parameter, which is not supported yet`
#### Signals
- backspace ✅

- copy-clipboard ✅

- cut-clipboard ✅

- delete-from-cursor ✅

- extend-selection
  > ❌ `[signal extend-selection]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))`
- insert-at-cursor ✅

- insert-emoji ✅

- move-cursor ✅

- move-viewport ✅

- paste-clipboard ✅

- preedit-changed ✅

- select-all ✅

- set-anchor ✅

- toggle-cursor-visible ✅

- toggle-overwrite ✅


### ToggleButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_label ✅

- new_with_mnemonic ✅

#### Methods
- get_active ✅

- set_active ✅

- set_group ✅

- toggled ✅

#### Signals
- toggled ✅


### Tooltip


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- set_custom ✅

- set_icon ✅

- set_icon_from_gicon ✅

- set_icon_from_icon_name ✅

- set_markup ✅

- set_text ✅

- set_tip_area
  > ❌ `[method set_tip_area/<method parameters>/rect]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle), @type -> DataRecord(const GdkRectangle*)))`

### TreeExpander


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>11</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_hide_expander ✅

- get_indent_for_depth ✅

- get_indent_for_icon ✅

- get_item ✅

- get_list_row ✅

- set_child ✅

- set_hide_expander ✅

- set_indent_for_depth ✅

- set_indent_for_icon ✅

- set_list_row ✅


### TreeListModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>6</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/create_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeListModelCreateModelFunc), @type -> DataRecord(GtkTreeListModelCreateModelFunc)))`
#### Methods
- get_autoexpand ✅

- get_child_row ✅

- get_model ✅

- get_passthrough ✅

- get_row ✅

- set_autoexpand ✅


### TreeListRow


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>9</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_child_row ✅

- get_children ✅

- get_depth ✅

- get_expanded ✅

- get_item ✅

- get_parent ✅

- get_position ✅

- is_expandable ✅

- set_expanded ✅


### TreeListRowSorter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_sorter ✅

- set_sorter ✅


### TreeModelFilter


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>8</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- clear_cache ✅

- convert_child_iter_to_iter
  > ❌ `[method convert_child_iter_to_iter]: Method convert_child_iter_to_iter contains an OUT parameter, which is not supported yet`
- convert_child_path_to_path
  > ❌ `[method convert_child_path_to_path/<method parameters>/child_path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- convert_iter_to_child_iter
  > ❌ `[method convert_iter_to_child_iter]: Method convert_iter_to_child_iter contains an OUT parameter, which is not supported yet`
- convert_path_to_child_path
  > ❌ `[method convert_path_to_child_path/<method parameters>/filter_path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- get
  > ❌ `[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_model ✅

- get_valist
  > ❌ `[method get_valist]: Method get_valist is weird: conflicting override`
- refilter ✅

- set_modify_func
  > ❌ `[method set_modify_func/<method parameters>/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GType*)))`
- set_visible_column ✅

- set_visible_func
  > ❌ `[method set_visible_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeModelFilterVisibleFunc), @type -> DataRecord(GtkTreeModelFilterVisibleFunc)))`

### TreeModelSort


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>7</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new_with_model ✅

#### Methods
- clear_cache ✅

- convert_child_iter_to_iter
  > ❌ `[method convert_child_iter_to_iter]: Method convert_child_iter_to_iter contains an OUT parameter, which is not supported yet`
- convert_child_path_to_path
  > ❌ `[method convert_child_path_to_path/<method parameters>/child_path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- convert_iter_to_child_iter
  > ❌ `[method convert_iter_to_child_iter]: Method convert_iter_to_child_iter contains an OUT parameter, which is not supported yet`
- convert_path_to_child_path
  > ❌ `[method convert_path_to_child_path/<method parameters>/sorted_path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- get
  > ❌ `[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_model ✅

- get_valist
  > ❌ `[method get_valist]: Method get_valist is weird: conflicting override`
- iter_is_valid
  > ❌ `[method iter_is_valid/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- reset_default_sort_func ✅


### TreeSelection


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>7</td><td>0</td><td>13</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- count_selected_rows ✅

- get_mode ✅

- get_select_function
  > ❌ `[method get_select_function/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeSelectionFunc), @type -> DataRecord(GtkTreeSelectionFunc)))`
- get_selected
  > ❌ `[method get_selected]: Method get_selected contains an OUT parameter, which is not supported yet`
- get_selected_rows
  > ❌ `[method get_selected_rows]: Method get_selected_rows contains an OUT parameter, which is not supported yet`
- get_tree_view ✅

- get_user_data ✅

- iter_is_selected
  > ❌ `[method iter_is_selected/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- path_is_selected
  > ❌ `[method path_is_selected/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- select_all ✅

- select_iter
  > ❌ `[method select_iter/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- select_path
  > ❌ `[method select_path/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- select_range
  > ❌ `[method select_range/<method parameters>/start_path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- selected_foreach
  > ❌ `[method selected_foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeSelectionForeachFunc), @type -> DataRecord(GtkTreeSelectionForeachFunc)))`
- set_mode ✅

- set_select_function
  > ❌ `[method set_select_function/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeSelectionFunc), @type -> DataRecord(GtkTreeSelectionFunc)))`
- unselect_all ✅

- unselect_iter
  > ❌ `[method unselect_iter/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- unselect_path
  > ❌ `[method unselect_path/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- unselect_range
  > ❌ `[method unselect_range/<method parameters>/start_path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
#### Signals
- changed ✅


### TreeStore


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>22</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- newv
  > ❌ `[constructor newv/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GType*)))`
#### Methods
- append
  > ❌ `[method append]: Method append contains an OUT parameter, which is not supported yet`
- clear ✅

- get
  > ❌ `[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- get_valist
  > ❌ `[method get_valist]: Method get_valist is weird: conflicting override`
- insert
  > ❌ `[method insert]: Method insert contains an OUT parameter, which is not supported yet`
- insert_after
  > ❌ `[method insert_after]: Method insert_after contains an OUT parameter, which is not supported yet`
- insert_before
  > ❌ `[method insert_before]: Method insert_before contains an OUT parameter, which is not supported yet`
- insert_with_values
  > ❌ `[method insert_with_values]: Method insert_with_values contains an OUT parameter, which is not supported yet`
- insert_with_valuesv
  > ❌ `[method insert_with_valuesv]: Method insert_with_valuesv contains an OUT parameter, which is not supported yet`
- is_ancestor
  > ❌ `[method is_ancestor/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- iter_depth
  > ❌ `[method iter_depth/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- iter_is_valid
  > ❌ `[method iter_is_valid/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- move_after
  > ❌ `[method move_after/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- move_before
  > ❌ `[method move_before/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- prepend
  > ❌ `[method prepend]: Method prepend contains an OUT parameter, which is not supported yet`
- remove
  > ❌ `[method remove/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- reorder
  > ❌ `[method reorder/<method parameters>/parent]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set
  > ❌ `[method set/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set_column_types
  > ❌ `[method set_column_types/<method parameters>/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GType*)))`
- set_valist
  > ❌ `[method set_valist/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set_value
  > ❌ `[method set_value/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- set_valuesv
  > ❌ `[method set_valuesv/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- swap
  > ❌ `[method swap/<method parameters>/a]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`

### TreeView


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>2</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>50</td><td>0</td><td>39</tr>
<tr><td>signals</td><td>10</td><td>0</td><td>5</tr></table>

#### Constructors
- new ✅

- new_with_model ✅

#### Methods
- append_column ✅

- collapse_all ✅

- collapse_row
  > ❌ `[method collapse_row/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- columns_autosize ✅

- convert_bin_window_to_tree_coords
  > ❌ `[method convert_bin_window_to_tree_coords]: Method convert_bin_window_to_tree_coords contains an OUT parameter, which is not supported yet`
- convert_bin_window_to_widget_coords
  > ❌ `[method convert_bin_window_to_widget_coords]: Method convert_bin_window_to_widget_coords contains an OUT parameter, which is not supported yet`
- convert_tree_to_bin_window_coords
  > ❌ `[method convert_tree_to_bin_window_coords]: Method convert_tree_to_bin_window_coords contains an OUT parameter, which is not supported yet`
- convert_tree_to_widget_coords
  > ❌ `[method convert_tree_to_widget_coords]: Method convert_tree_to_widget_coords contains an OUT parameter, which is not supported yet`
- convert_widget_to_bin_window_coords
  > ❌ `[method convert_widget_to_bin_window_coords]: Method convert_widget_to_bin_window_coords contains an OUT parameter, which is not supported yet`
- convert_widget_to_tree_coords
  > ❌ `[method convert_widget_to_tree_coords]: Method convert_widget_to_tree_coords contains an OUT parameter, which is not supported yet`
- create_row_drag_icon
  > ❌ `[method create_row_drag_icon/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- enable_model_drag_dest
  > ❌ `[method enable_model_drag_dest/<method parameters>/formats]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- enable_model_drag_source
  > ❌ `[method enable_model_drag_source/<method parameters>/formats]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))`
- expand_all ✅

- expand_row
  > ❌ `[method expand_row/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- expand_to_path
  > ❌ `[method expand_to_path/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- get_activate_on_single_click ✅

- get_background_area
  > ❌ `[method get_background_area]: Method get_background_area contains an OUT parameter, which is not supported yet`
- get_cell_area
  > ❌ `[method get_cell_area]: Method get_cell_area contains an OUT parameter, which is not supported yet`
- get_column ✅

- get_columns
  > ❌ `[method get_columns/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(TreeViewColumn))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- get_cursor
  > ❌ `[method get_cursor]: Method get_cursor contains an OUT parameter, which is not supported yet`
- get_dest_row_at_pos
  > ❌ `[method get_dest_row_at_pos]: Method get_dest_row_at_pos contains an OUT parameter, which is not supported yet`
- get_drag_dest_row
  > ❌ `[method get_drag_dest_row]: Method get_drag_dest_row contains an OUT parameter, which is not supported yet`
- get_enable_search ✅

- get_enable_tree_lines ✅

- get_expander_column ✅

- get_fixed_height_mode ✅

- get_grid_lines ✅

- get_headers_clickable ✅

- get_headers_visible ✅

- get_hover_expand ✅

- get_hover_selection ✅

- get_level_indentation ✅

- get_model ✅

- get_n_columns ✅

- get_path_at_pos
  > ❌ `[method get_path_at_pos]: Method get_path_at_pos contains an OUT parameter, which is not supported yet`
- get_reorderable ✅

- get_row_separator_func
  > ❌ `[method get_row_separator_func/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))`
- get_rubber_banding ✅

- get_search_column ✅

- get_search_entry ✅

- get_search_equal_func
  > ❌ `[method get_search_equal_func/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewSearchEqualFunc), @type -> DataRecord(GtkTreeViewSearchEqualFunc)))`
- get_selection ✅

- get_show_expanders ✅

- get_tooltip_column ✅

- get_tooltip_context
  > ❌ `[method get_tooltip_context]: Method get_tooltip_context contains an OUT parameter, which is not supported yet`
- get_visible_range
  > ❌ `[method get_visible_range]: Method get_visible_range contains an OUT parameter, which is not supported yet`
- get_visible_rect
  > ❌ `[method get_visible_rect]: Method get_visible_rect contains an OUT parameter, which is not supported yet`
- insert_column ✅

- insert_column_with_attributes
  > ❌ `[method insert_column_with_attributes/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- insert_column_with_data_func
  > ❌ `[method insert_column_with_data_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeCellDataFunc), @type -> DataRecord(GtkTreeCellDataFunc)))`
- is_blank_at_pos
  > ❌ `[method is_blank_at_pos]: Method is_blank_at_pos contains an OUT parameter, which is not supported yet`
- is_rubber_banding_active ✅

- map_expanded_rows
  > ❌ `[method map_expanded_rows/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewMappingFunc), @type -> DataRecord(GtkTreeViewMappingFunc)))`
- move_column_after ✅

- remove_column ✅

- row_activated
  > ❌ `[method row_activated/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- row_expanded
  > ❌ `[method row_expanded/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- scroll_to_cell
  > ❌ `[method scroll_to_cell/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- scroll_to_point ✅

- set_activate_on_single_click ✅

- set_column_drag_function
  > ❌ `[method set_column_drag_function/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewColumnDropFunc), @type -> DataRecord(GtkTreeViewColumnDropFunc)))`
- set_cursor
  > ❌ `[method set_cursor/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_cursor_on_cell
  > ❌ `[method set_cursor_on_cell/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_drag_dest_row
  > ❌ `[method set_drag_dest_row/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_enable_search ✅

- set_enable_tree_lines ✅

- set_expander_column ✅

- set_fixed_height_mode ✅

- set_grid_lines ✅

- set_headers_clickable ✅

- set_headers_visible ✅

- set_hover_expand ✅

- set_hover_selection ✅

- set_level_indentation ✅

- set_model ✅

- set_reorderable ✅

- set_row_separator_func
  > ❌ `[method set_row_separator_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewRowSeparatorFunc), @type -> DataRecord(GtkTreeViewRowSeparatorFunc)))`
- set_rubber_banding ✅

- set_search_column ✅

- set_search_entry ✅

- set_search_equal_func
  > ❌ `[method set_search_equal_func/<method parameters>/search_equal_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeViewSearchEqualFunc), @type -> DataRecord(GtkTreeViewSearchEqualFunc)))`
- set_show_expanders ✅

- set_tooltip_cell
  > ❌ `[method set_tooltip_cell/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- set_tooltip_column ✅

- set_tooltip_row
  > ❌ `[method set_tooltip_row/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- unset_rows_drag_dest ✅

- unset_rows_drag_source ✅

#### Signals
- columns-changed ✅

- cursor-changed ✅

- expand-collapse-cursor-row ✅

- move-cursor ✅

- row-activated
  > ❌ `[signal row-activated]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreePath)))`
- row-collapsed
  > ❌ `[signal row-collapsed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))`
- row-expanded
  > ❌ `[signal row-expanded]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))`
- select-all ✅

- select-cursor-parent ✅

- select-cursor-row ✅

- start-interactive-search ✅

- test-collapse-row
  > ❌ `[signal test-collapse-row]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))`
- test-expand-row
  > ❌ `[signal test-expand-row]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))`
- toggle-cursor-row ✅

- unselect-all ✅


### TreeViewColumn


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>3</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>45</td><td>0</td><td>5</tr>
<tr><td>signals</td><td>1</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_with_area ✅

- new_with_attributes ✅

#### Methods
- add_attribute ✅

- cell_get_position
  > ❌ `[method cell_get_position]: Method cell_get_position contains an OUT parameter, which is not supported yet`
- cell_get_size
  > ❌ `[method cell_get_size]: Method cell_get_size contains an OUT parameter, which is not supported yet`
- cell_is_visible ✅

- cell_set_cell_data
  > ❌ `[method cell_set_cell_data/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- clear ✅

- clear_attributes ✅

- clicked ✅

- focus_cell ✅

- get_alignment ✅

- get_button ✅

- get_clickable ✅

- get_expand ✅

- get_fixed_width ✅

- get_max_width ✅

- get_min_width ✅

- get_reorderable ✅

- get_resizable ✅

- get_sizing ✅

- get_sort_column_id ✅

- get_sort_indicator ✅

- get_sort_order ✅

- get_spacing ✅

- get_title ✅

- get_tree_view ✅

- get_visible ✅

- get_widget ✅

- get_width ✅

- get_x_offset ✅

- pack_end ✅

- pack_start ✅

- queue_resize ✅

- set_alignment ✅

- set_attributes
  > ❌ `[method set_attributes/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_cell_data_func
  > ❌ `[method set_cell_data_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeCellDataFunc), @type -> DataRecord(GtkTreeCellDataFunc)))`
- set_clickable ✅

- set_expand ✅

- set_fixed_width ✅

- set_max_width ✅

- set_min_width ✅

- set_reorderable ✅

- set_resizable ✅

- set_sizing ✅

- set_sort_column_id ✅

- set_sort_indicator ✅

- set_sort_order ✅

- set_spacing ✅

- set_title ✅

- set_visible ✅

- set_widget ✅

#### Signals
- clicked ✅


### UriLauncher


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_uri ✅

- launch
  > ❌ `[method launch/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))`
- launch_finish ✅

- set_uri ✅


### Video


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>5</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

- new_for_file ✅

- new_for_filename ✅

- new_for_media_stream ✅

- new_for_resource ✅

#### Methods
- get_autoplay ✅

- get_file ✅

- get_loop ✅

- get_media_stream ✅

- set_autoplay ✅

- set_file ✅

- set_filename ✅

- set_loop ✅

- set_media_stream ✅

- set_resource ✅


### Viewport


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- get_scroll_to_focus ✅

- scroll_to
  > ❌ `[method scroll_to/<method parameters>/scroll]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(ScrollInfo), @type -> DataRecord(GtkScrollInfo*)))`
- set_child ✅

- set_scroll_to_focus ✅


### VolumeButton


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>0</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅


### Widget


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>2</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>145</td><td>0</td><td>17</tr>
<tr><td>signals</td><td>13</td><td>0</td><td>0</tr></table>

#### Methods
- action_set_enabled ✅

- activate ✅

- activate_action
  > ❌ `[method activate_action/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- activate_action_variant
  > ❌ `[method activate_action_variant/<method parameters>/args]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- activate_default ✅

- add_controller ✅

- add_css_class ✅

- add_mnemonic_label ✅

- add_tick_callback
  > ❌ `[method add_tick_callback/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TickCallback), @type -> DataRecord(GtkTickCallback)))`
- allocate
  > ❌ `[method allocate/<method parameters>/transform]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))`
- child_focus ✅

- compute_bounds
  > ❌ `[method compute_bounds]: Method compute_bounds contains an OUT parameter, which is not supported yet`
- compute_expand ✅

- compute_point
  > ❌ `[method compute_point]: Method compute_point contains an OUT parameter, which is not supported yet`
- compute_transform
  > ❌ `[method compute_transform]: Method compute_transform contains an OUT parameter, which is not supported yet`
- contains ✅

- create_pango_context ✅

- create_pango_layout ✅

- dispose_template ✅

- drag_check_threshold ✅

- error_bell ✅

- get_allocated_baseline ✅

- get_allocated_height ✅

- get_allocated_width ✅

- get_allocation
  > ❌ `[method get_allocation]: Method get_allocation contains an OUT parameter, which is not supported yet`
- get_ancestor ✅

- get_baseline ✅

- get_can_focus ✅

- get_can_target ✅

- get_child_visible ✅

- get_clipboard ✅

- get_color
  > ❌ `[method get_color]: Method get_color contains an OUT parameter, which is not supported yet`
- get_css_classes ✅

- get_css_name ✅

- get_cursor ✅

- get_direction ✅

- get_display ✅

- get_first_child ✅

- get_focus_child ✅

- get_focus_on_click ✅

- get_focusable ✅

- get_font_map ✅

- get_font_options
  > ❌ `[method get_font_options/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.FontOptions), @type -> DataRecord(const cairo_font_options_t*)))`
- get_frame_clock ✅

- get_halign ✅

- get_has_tooltip ✅

- get_height ✅

- get_hexpand ✅

- get_hexpand_set ✅

- get_last_child ✅

- get_layout_manager ✅

- get_mapped ✅

- get_margin_bottom ✅

- get_margin_end ✅

- get_margin_start ✅

- get_margin_top ✅

- get_name ✅

- get_native ✅

- get_next_sibling ✅

- get_opacity ✅

- get_overflow ✅

- get_pango_context ✅

- get_parent ✅

- get_preferred_size
  > ❌ `[method get_preferred_size]: Method get_preferred_size contains an OUT parameter, which is not supported yet`
- get_prev_sibling ✅

- get_primary_clipboard ✅

- get_realized ✅

- get_receives_default ✅

- get_request_mode ✅

- get_root ✅

- get_scale_factor ✅

- get_sensitive ✅

- get_settings ✅

- get_size ✅

- get_size_request
  > ❌ `[method get_size_request]: Method get_size_request contains an OUT parameter, which is not supported yet`
- get_state_flags ✅

- get_style_context ✅

- get_template_child ✅

- get_tooltip_markup ✅

- get_tooltip_text ✅

- get_valign ✅

- get_vexpand ✅

- get_vexpand_set ✅

- get_visible ✅

- get_width ✅

- grab_focus ✅

- has_css_class ✅

- has_default ✅

- has_focus ✅

- has_visible_focus ✅

- hide ✅

- in_destruction ✅

- init_template ✅

- insert_action_group ✅

- insert_after ✅

- insert_before ✅

- is_ancestor ✅

- is_drawable ✅

- is_focus ✅

- is_sensitive ✅

- is_visible ✅

- keynav_failed ✅

- list_mnemonic_labels
  > ❌ `[method list_mnemonic_labels/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Widget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- map ✅

- measure
  > ❌ `[method measure]: Method measure contains an OUT parameter, which is not supported yet`
- mnemonic_activate ✅

- observe_children ✅

- observe_controllers ✅

- pick ✅

- queue_allocate ✅

- queue_draw ✅

- queue_resize ✅

- realize ✅

- remove_controller ✅

- remove_css_class ✅

- remove_mnemonic_label ✅

- remove_tick_callback ✅

- set_can_focus ✅

- set_can_target ✅

- set_child_visible ✅

- set_css_classes ✅

- set_cursor ✅

- set_cursor_from_name ✅

- set_direction ✅

- set_focus_child ✅

- set_focus_on_click ✅

- set_focusable ✅

- set_font_map ✅

- set_font_options
  > ❌ `[method set_font_options/<method parameters>/options]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(cairo.FontOptions), @type -> DataRecord(const cairo_font_options_t*)))`
- set_halign ✅

- set_has_tooltip ✅

- set_hexpand ✅

- set_hexpand_set ✅

- set_layout_manager ✅

- set_margin_bottom ✅

- set_margin_end ✅

- set_margin_start ✅

- set_margin_top ✅

- set_name ✅

- set_opacity ✅

- set_overflow ✅

- set_parent ✅

- set_receives_default ✅

- set_sensitive ✅

- set_size_request ✅

- set_state_flags ✅

- set_tooltip_markup ✅

- set_tooltip_text ✅

- set_valign ✅

- set_vexpand ✅

- set_vexpand_set ✅

- set_visible ✅

- should_layout ✅

- show ✅

- size_allocate
  > ❌ `[method size_allocate/<method parameters>/allocation]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Allocation), @type -> DataRecord(const GtkAllocation*)))`
- snapshot_child ✅

- translate_coordinates
  > ❌ `[method translate_coordinates]: Method translate_coordinates contains an OUT parameter, which is not supported yet`
- trigger_tooltip_query ✅

- unmap ✅

- unparent ✅

- unrealize ✅

- unset_state_flags ✅

#### Functions
- get_default_direction ✅

- set_default_direction ✅

#### Signals
- destroy ✅

- direction-changed ✅

- hide ✅

- keynav-failed ✅

- map ✅

- mnemonic-activate ✅

- move-focus ✅

- query-tooltip ✅

- realize ✅

- show ✅

- state-flags-changed ✅

- unmap ✅

- unrealize ✅


### WidgetPaintable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_widget ✅

- set_widget ✅


### Window


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>5</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>57</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>5</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- close ✅

- destroy ✅

- fullscreen ✅

- fullscreen_on_monitor ✅

- get_application ✅

- get_child ✅

- get_decorated ✅

- get_default_size
  > ❌ `[method get_default_size]: Method get_default_size contains an OUT parameter, which is not supported yet`
- get_default_widget ✅

- get_deletable ✅

- get_destroy_with_parent ✅

- get_display ✅

- get_focus ✅

- get_focus_visible ✅

- get_group ✅

- get_handle_menubar_accel ✅

- get_hide_on_close ✅

- get_icon_name ✅

- get_mnemonics_visible ✅

- get_modal ✅

- get_resizable ✅

- get_title ✅

- get_titlebar ✅

- get_transient_for ✅

- has_group ✅

- is_active ✅

- is_fullscreen ✅

- is_maximized ✅

- is_suspended ✅

- maximize ✅

- minimize ✅

- present ✅

- present_with_time ✅

- realize ✅

- set_application ✅

- set_child ✅

- set_decorated ✅

- set_default_size ✅

- set_default_widget ✅

- set_deletable ✅

- set_destroy_with_parent ✅

- set_display ✅

- set_focus ✅

- set_focus_visible ✅

- set_handle_menubar_accel ✅

- set_hide_on_close ✅

- set_icon_name ✅

- set_mnemonics_visible ✅

- set_modal ✅

- set_resizable ✅

- set_startup_id ✅

- set_title ✅

- set_titlebar ✅

- set_transient_for ✅

- unfullscreen ✅

- unmaximize ✅

- unminimize ✅

- unrealize ✅

#### Functions
- get_default_icon_name ✅

- get_toplevels ✅

- list_toplevels
  > ❌ `[function list_toplevels/<return type>]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Widget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- set_auto_startup_notification ✅

- set_default_icon_name ✅

- set_interactive_debugging ✅

#### Signals
- activate-default ✅

- activate-focus ✅

- close-request ✅

- enable-debugging ✅

- keys-changed ✅


### WindowControls


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_decoration_layout ✅

- get_empty ✅

- get_side ✅

- set_decoration_layout ✅

- set_side ✅


### WindowGroup


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- add_window ✅

- list_windows
  > ❌ `[method list_windows/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Window))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- remove_window ✅


### WindowHandle


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- get_child ✅

- set_child ✅


## Interfaces
### Accessible


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>11</td><td>0</td><td>7</tr></table>

#### Methods
- get_accessible_parent ✅

- get_accessible_role ✅

- get_at_context ✅

- get_bounds
  > ❌ `[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet`
- get_first_accessible_child ✅

- get_next_accessible_sibling ✅

- get_platform_state ✅

- reset_property ✅

- reset_relation ✅

- reset_state ✅

- set_accessible_parent ✅

- update_next_accessible_sibling ✅

- update_property
  > ❌ `[method update_property/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- update_property_value
  > ❌ `[method update_property_value/<method parameters>/properties]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AccessibleProperty), @type -> DataRecord(GtkAccessibleProperty)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GtkAccessibleProperty*)))`
- update_relation
  > ❌ `[method update_relation/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- update_relation_value
  > ❌ `[method update_relation_value/<method parameters>/relations]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AccessibleRelation), @type -> DataRecord(GtkAccessibleRelation)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GtkAccessibleRelation*)))`
- update_state
  > ❌ `[method update_state/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- update_state_value
  > ❌ `[method update_state_value/<method parameters>/states]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AccessibleState), @type -> DataRecord(GtkAccessibleState)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GtkAccessibleState*)))`
### AccessibleRange


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### Actionable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>3</tr></table>

#### Methods
- get_action_name ✅

- get_action_target_value
  > ❌ `[method get_action_target_value/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_action_name ✅

- set_action_target
  > ❌ `[method set_action_target/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_action_target_value
  > ❌ `[method set_action_target_value/<method parameters>/target_value]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))`
- set_detailed_action_name ✅

### AppChooser


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>0</tr></table>

#### Methods
- get_app_info ✅

- get_content_type ✅

- refresh ✅

### Buildable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>1</td><td>0</td><td>0</tr></table>

#### Methods
- get_buildable_id ✅

### BuilderScope


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### CellEditable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>0</tr></table>

#### Methods
- editing_done ✅

- remove_widget ✅

- start_editing ✅

### CellLayout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>7</td><td>0</td><td>3</tr></table>

#### Methods
- add_attribute ✅

- clear ✅

- clear_attributes ✅

- get_area ✅

- get_cells
  > ❌ `[method get_cells/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(CellRenderer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))`
- pack_end ✅

- pack_start ✅

- reorder ✅

- set_attributes
  > ❌ `[method set_attributes/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding`
- set_cell_data_func
  > ❌ `[method set_cell_data_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CellLayoutDataFunc), @type -> DataRecord(GtkCellLayoutDataFunc)))`
### ColorChooser


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>3</tr></table>

#### Methods
- add_palette
  > ❌ `[method add_palette/<method parameters>/colors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(GdkRGBA)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(GdkRGBA*)))`
- get_rgba
  > ❌ `[method get_rgba]: Method get_rgba contains an OUT parameter, which is not supported yet`
- get_use_alpha ✅

- set_rgba
  > ❌ `[method set_rgba/<method parameters>/color]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))`
- set_use_alpha ✅

### ConstraintTarget


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### Editable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>22</td><td>0</td><td>2</tr></table>

#### Methods
- delegate_get_accessible_platform_state ✅

- delete_selection ✅

- delete_text ✅

- finish_delegate ✅

- get_alignment ✅

- get_chars ✅

- get_delegate ✅

- get_editable ✅

- get_enable_undo ✅

- get_max_width_chars ✅

- get_position ✅

- get_selection_bounds
  > ❌ `[method get_selection_bounds]: Method get_selection_bounds contains an OUT parameter, which is not supported yet`
- get_text ✅

- get_width_chars ✅

- init_delegate ✅

- insert_text
  > ❌ `[method insert_text]: Method insert_text contains an INOUT parameter, which is not supported yet`
- select_region ✅

- set_alignment ✅

- set_editable ✅

- set_enable_undo ✅

- set_max_width_chars ✅

- set_position ✅

- set_text ✅

- set_width_chars ✅

### FileChooser


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>25</td><td>0</td><td>0</tr></table>

#### Methods
- add_choice ✅

- add_filter ✅

- add_shortcut_folder ✅

- get_action ✅

- get_choice ✅

- get_create_folders ✅

- get_current_folder ✅

- get_current_name ✅

- get_file ✅

- get_files ✅

- get_filter ✅

- get_filters ✅

- get_select_multiple ✅

- get_shortcut_folders ✅

- remove_choice ✅

- remove_filter ✅

- remove_shortcut_folder ✅

- set_action ✅

- set_choice ✅

- set_create_folders ✅

- set_current_folder ✅

- set_current_name ✅

- set_file ✅

- set_filter ✅

- set_select_multiple ✅

### FontChooser


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>16</td><td>0</td><td>3</tr></table>

#### Methods
- get_font ✅

- get_font_desc
  > ❌ `[method get_font_desc/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- get_font_face ✅

- get_font_family ✅

- get_font_features ✅

- get_font_map ✅

- get_font_size ✅

- get_language ✅

- get_level ✅

- get_preview_text ✅

- get_show_preview_entry ✅

- set_filter_func
  > ❌ `[method set_filter_func/<method parameters>/filter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontFilterFunc), @type -> DataRecord(GtkFontFilterFunc)))`
- set_font ✅

- set_font_desc
  > ❌ `[method set_font_desc/<method parameters>/font_desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- set_font_map ✅

- set_language ✅

- set_level ✅

- set_preview_text ✅

- set_show_preview_entry ✅

### Native


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>4</td><td>0</td><td>1</tr></table>

#### Methods
- get_renderer ✅

- get_surface ✅

- get_surface_transform
  > ❌ `[method get_surface_transform]: Method get_surface_transform contains an OUT parameter, which is not supported yet`
- realize ✅

- unrealize ✅

### Orientable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>2</td><td>0</td><td>0</tr></table>

#### Methods
- get_orientation ✅

- set_orientation ✅

### PrintOperationPreview


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>0</tr></table>

#### Methods
- end_preview ✅

- is_selected ✅

- render_page ✅

### Root


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>0</tr></table>

#### Methods
- get_display ✅

- get_focus ✅

- set_focus ✅

### Scrollable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>8</td><td>0</td><td>1</tr></table>

#### Methods
- get_border
  > ❌ `[method get_border]: Method get_border contains an OUT parameter, which is not supported yet`
- get_hadjustment ✅

- get_hscroll_policy ✅

- get_vadjustment ✅

- get_vscroll_policy ✅

- set_hadjustment ✅

- set_hscroll_policy ✅

- set_vadjustment ✅

- set_vscroll_policy ✅

### SectionModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>1</td><td>0</td><td>1</tr></table>

#### Methods
- get_section
  > ❌ `[method get_section]: Method get_section contains an OUT parameter, which is not supported yet`
- sections_changed ✅

### SelectionModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>8</td><td>0</td><td>3</tr></table>

#### Methods
- get_selection
  > ❌ `[method get_selection/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Bitset), @type -> DataRecord(GtkBitset*)))`
- get_selection_in_range
  > ❌ `[method get_selection_in_range/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Bitset), @type -> DataRecord(GtkBitset*)))`
- is_selected ✅

- select_all ✅

- select_item ✅

- select_range ✅

- selection_changed ✅

- set_selection
  > ❌ `[method set_selection/<method parameters>/selected]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Bitset), @type -> DataRecord(GtkBitset*)))`
- unselect_all ✅

- unselect_item ✅

- unselect_range ✅

### ShortcutManager


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### StyleProvider


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>0</tr></table>

### SymbolicPaintable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>1</tr></table>

#### Methods
- snapshot_symbolic
  > ❌ `[method snapshot_symbolic/<method parameters>/colors]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(GdkRGBA)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(4), @type -> DataRecord(const GdkRGBA*)))`
### TreeDragDest


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>2</tr></table>

#### Methods
- drag_data_received
  > ❌ `[method drag_data_received/<method parameters>/dest]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- row_drop_possible
  > ❌ `[method row_drop_possible/<method parameters>/dest_path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
### TreeDragSource


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>0</td><td>0</td><td>3</tr></table>

#### Methods
- drag_data_delete
  > ❌ `[method drag_data_delete/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- drag_data_get
  > ❌ `[method drag_data_get/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- row_draggable
  > ❌ `[method row_draggable/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
### TreeModel


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>25</tr></table>

#### Methods
- filter_new
  > ❌ `[method filter_new/<method parameters>/root]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- foreach
  > ❌ `[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeModelForeachFunc), @type -> DataRecord(GtkTreeModelForeachFunc)))`
- get
  > ❌ `[method get/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- get_column_type ✅

- get_flags ✅

- get_iter
  > ❌ `[method get_iter]: Method get_iter contains an OUT parameter, which is not supported yet`
- get_iter_first
  > ❌ `[method get_iter_first]: Method get_iter_first contains an OUT parameter, which is not supported yet`
- get_iter_from_string
  > ❌ `[method get_iter_from_string]: Method get_iter_from_string contains an OUT parameter, which is not supported yet`
- get_n_columns ✅

- get_path
  > ❌ `[method get_path/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- get_string_from_iter
  > ❌ `[method get_string_from_iter/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- get_valist
  > ❌ `[method get_valist/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- get_value
  > ❌ `[method get_value]: Method get_value contains an OUT parameter, which is not supported yet`
- iter_children
  > ❌ `[method iter_children]: Method iter_children contains an OUT parameter, which is not supported yet`
- iter_has_child
  > ❌ `[method iter_has_child/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- iter_n_children
  > ❌ `[method iter_n_children/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- iter_next
  > ❌ `[method iter_next/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- iter_nth_child
  > ❌ `[method iter_nth_child]: Method iter_nth_child contains an OUT parameter, which is not supported yet`
- iter_parent
  > ❌ `[method iter_parent]: Method iter_parent contains an OUT parameter, which is not supported yet`
- iter_previous
  > ❌ `[method iter_previous/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- ref_node
  > ❌ `[method ref_node/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
- row_changed
  > ❌ `[method row_changed/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- row_deleted
  > ❌ `[method row_deleted/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- row_has_child_toggled
  > ❌ `[method row_has_child_toggled/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- row_inserted
  > ❌ `[method row_inserted/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- rows_reordered
  > ❌ `[method rows_reordered/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- rows_reordered_with_length
  > ❌ `[method rows_reordered_with_length/<method parameters>/path]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))`
- unref_node
  > ❌ `[method unref_node/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))`
### TreeSortable


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>methods</td><td>3</td><td>0</td><td>3</tr></table>

#### Methods
- get_sort_column_id
  > ❌ `[method get_sort_column_id]: Method get_sort_column_id contains an OUT parameter, which is not supported yet`
- has_default_sort_func ✅

- set_default_sort_func
  > ❌ `[method set_default_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIterCompareFunc), @type -> DataRecord(GtkTreeIterCompareFunc)))`
- set_sort_column_id ✅

- set_sort_func
  > ❌ `[method set_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIterCompareFunc), @type -> DataRecord(GtkTreeIterCompareFunc)))`
- sort_column_changed ✅

## Enums
- AccessibleAutocomplete ✅

- AccessibleInvalidState ✅

- AccessiblePlatformState ✅

- AccessibleProperty ✅

- AccessibleRelation ✅

- AccessibleRole ✅

- AccessibleSort ✅

- AccessibleState ✅

- AccessibleTristate ✅

- Align ✅

- ArrowType ✅

- AssistantPageType ✅

- BaselinePosition ✅

- BorderStyle ✅

- BuilderError ✅

- ButtonsType ✅

- CellRendererAccelMode ✅

- CellRendererMode ✅

- Collation ✅

- ConstraintAttribute ✅

- ConstraintRelation ✅

- ConstraintStrength ✅

- ConstraintVflParserError ✅

- ContentFit ✅

- CornerType ✅

- CssParserError ✅

- CssParserWarning ✅

- DeleteType ✅

- DialogError ✅

- DirectionType ✅

- EditableProperties ✅

- EntryIconPosition ✅

- EventSequenceState ✅

- FileChooserAction ✅

- FileChooserError ✅

- FilterChange ✅

- FilterMatch ✅

- FontLevel ✅

- IconSize ✅

- IconThemeError ✅

- IconViewDropPosition ✅

- ImageType ✅

- InputPurpose ✅

- InscriptionOverflow ✅

- Justification ✅

- LevelBarMode ✅

- License ✅

- ListTabBehavior ✅

- MessageType ✅

- MovementStep ✅

- NaturalWrapMode ✅

- NotebookTab ✅

- NumberUpLayout ✅

- Ordering ✅

- Orientation ✅

- Overflow ✅

- PackType ✅

- PadActionType ✅

- PageOrientation ✅

- PageSet ✅

- PanDirection ✅

- PolicyType ✅

- PositionType ✅

- PrintDuplex ✅

- PrintError ✅

- PrintOperationAction ✅

- PrintOperationResult ✅

- PrintPages ✅

- PrintQuality ✅

- PrintStatus ✅

- PropagationLimit ✅

- PropagationPhase ✅

- RecentManagerError ✅

- ResponseType ✅

- RevealerTransitionType ✅

- ScrollStep ✅

- ScrollType ✅

- ScrollablePolicy ✅

- SelectionMode ✅

- SensitivityType ✅

- ShortcutScope ✅

- ShortcutType ✅

- SizeGroupMode ✅

- SizeRequestMode ✅

- SortType ✅

- SorterChange ✅

- SorterOrder ✅

- SpinButtonUpdatePolicy ✅

- SpinType ✅

- StackTransitionType ✅

- StringFilterMatchMode ✅

- SymbolicColor ✅

- SystemSetting ✅

- TextDirection ✅

- TextExtendSelection ✅

- TextViewLayer ✅

- TextWindowType ✅

- TreeViewColumnSizing ✅

- TreeViewDropPosition ✅

- TreeViewGridLines ✅

- Unit ✅

- WrapMode ✅

## Bitfields
- ApplicationInhibitFlags ✅

- BuilderClosureFlags ✅

- CellRendererState ✅

- DebugFlags ✅

- DialogFlags ✅

- EventControllerScrollFlags ✅

- FontChooserLevel ✅

- IconLookupFlags ✅

- InputHints ✅

- ListScrollFlags ✅

- PickFlags ✅

- PopoverMenuFlags ✅

- PrintCapabilities
  > ❌ `Bitfield PrintCapabilities is weird: `
- ShortcutActionFlags ✅

- StateFlags ✅

- StyleContextPrintFlags ✅

- TextSearchFlags ✅

- TreeModelFlags ✅

## Constants
- ACCESSIBLE_VALUE_UNDEFINED ✅

- BINARY_AGE ✅

- IM_MODULE_EXTENSION_POINT_NAME ✅

- INPUT_ERROR ✅

- INTERFACE_AGE ✅

- INVALID_LIST_POSITION ✅

- LEVEL_BAR_OFFSET_FULL ✅

- LEVEL_BAR_OFFSET_HIGH ✅

- LEVEL_BAR_OFFSET_LOW ✅

- MAJOR_VERSION ✅

- MAX_COMPOSE_LEN ✅

- MEDIA_FILE_EXTENSION_POINT_NAME ✅

- MICRO_VERSION ✅

- MINOR_VERSION ✅

- PAPER_NAME_A3 ✅

- PAPER_NAME_A4 ✅

- PAPER_NAME_A5 ✅

- PAPER_NAME_B5 ✅

- PAPER_NAME_EXECUTIVE ✅

- PAPER_NAME_LEGAL ✅

- PAPER_NAME_LETTER ✅

- PRINT_SETTINGS_COLLATE ✅

- PRINT_SETTINGS_DEFAULT_SOURCE ✅

- PRINT_SETTINGS_DITHER ✅

- PRINT_SETTINGS_DUPLEX ✅

- PRINT_SETTINGS_FINISHINGS ✅

- PRINT_SETTINGS_MEDIA_TYPE ✅

- PRINT_SETTINGS_NUMBER_UP ✅

- PRINT_SETTINGS_NUMBER_UP_LAYOUT ✅

- PRINT_SETTINGS_N_COPIES ✅

- PRINT_SETTINGS_ORIENTATION ✅

- PRINT_SETTINGS_OUTPUT_BASENAME ✅

- PRINT_SETTINGS_OUTPUT_BIN ✅

- PRINT_SETTINGS_OUTPUT_DIR ✅

- PRINT_SETTINGS_OUTPUT_FILE_FORMAT ✅

- PRINT_SETTINGS_OUTPUT_URI ✅

- PRINT_SETTINGS_PAGE_RANGES ✅

- PRINT_SETTINGS_PAGE_SET ✅

- PRINT_SETTINGS_PAPER_FORMAT ✅

- PRINT_SETTINGS_PAPER_HEIGHT ✅

- PRINT_SETTINGS_PAPER_WIDTH ✅

- PRINT_SETTINGS_PRINTER ✅

- PRINT_SETTINGS_PRINTER_LPI ✅

- PRINT_SETTINGS_PRINT_PAGES ✅

- PRINT_SETTINGS_QUALITY ✅

- PRINT_SETTINGS_RESOLUTION ✅

- PRINT_SETTINGS_RESOLUTION_X ✅

- PRINT_SETTINGS_RESOLUTION_Y ✅

- PRINT_SETTINGS_REVERSE ✅

- PRINT_SETTINGS_SCALE ✅

- PRINT_SETTINGS_USE_COLOR ✅

- PRINT_SETTINGS_WIN32_DRIVER_EXTRA ✅

- PRINT_SETTINGS_WIN32_DRIVER_VERSION ✅

- PRIORITY_RESIZE ✅

- STYLE_PROVIDER_PRIORITY_APPLICATION ✅

- STYLE_PROVIDER_PRIORITY_FALLBACK ✅

- STYLE_PROVIDER_PRIORITY_SETTINGS ✅

- STYLE_PROVIDER_PRIORITY_THEME ✅

- STYLE_PROVIDER_PRIORITY_USER ✅

- TEXT_VIEW_PRIORITY_VALIDATE ✅

- TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID ✅

- TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID ✅

# HarfBuzz

## Enums
- aat_layout_feature_selector_t
  > ❌ `Enum aat_layout_feature_selector_t is weird: `
- aat_layout_feature_type_t
  > ❌ `Enum aat_layout_feature_type_t is weird: `
- buffer_cluster_level_t ✅

- buffer_content_type_t ✅

- buffer_serialize_format_t ✅

- direction_t ✅

- memory_mode_t ✅

- ot_layout_baseline_tag_t
  > ❌ `Enum ot_layout_baseline_tag_t is weird: `
- ot_layout_glyph_class_t
  > ❌ `Enum ot_layout_glyph_class_t is weird: `
- ot_math_constant_t
  > ❌ `Enum ot_math_constant_t is weird: `
- ot_math_kern_t
  > ❌ `Enum ot_math_kern_t is weird: `
- ot_meta_tag_t
  > ❌ `Enum ot_meta_tag_t is weird: `
- ot_metrics_tag_t
  > ❌ `Enum ot_metrics_tag_t is weird: `
- ot_name_id_predefined_t
  > ❌ `Enum ot_name_id_predefined_t is weird: `
- paint_composite_mode_t ✅

- paint_extend_t ✅

- script_t ✅

- style_tag_t ✅

- unicode_combining_class_t ✅

- unicode_general_category_t ✅

## Bitfields
- buffer_diff_flags_t ✅

- buffer_flags_t ✅

- buffer_serialize_flags_t ✅

- glyph_flags_t ✅

- ot_color_palette_flags_t
  > ❌ `Bitfield ot_color_palette_flags_t is weird: `
- ot_math_glyph_part_flags_t
  > ❌ `Bitfield ot_math_glyph_part_flags_t is weird: `
- ot_var_axis_flags_t
  > ❌ `Bitfield ot_var_axis_flags_t is weird: `
## Constants
- AAT_LAYOUT_NO_SELECTOR_INDEX ✅

- BUFFER_REPLACEMENT_CODEPOINT_DEFAULT ✅

- CODEPOINT_INVALID
  > ❌ `[CODEPOINT_INVALID:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(codepoint_t), @type -> DataRecord(hb_codepoint_t))) with raw value `4294967295``
- FEATURE_GLOBAL_START ✅

- FONT_NO_VAR_NAMED_INSTANCE ✅

- LANGUAGE_INVALID
  > ❌ `[LANGUAGE_INVALID:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(language_t), @type -> DataRecord(hb_language_t))) with raw value `0``
- OT_LAYOUT_DEFAULT_LANGUAGE_INDEX ✅

- OT_LAYOUT_NO_FEATURE_INDEX ✅

- OT_LAYOUT_NO_SCRIPT_INDEX ✅

- OT_LAYOUT_NO_VARIATIONS_INDEX ✅

- OT_MAX_TAGS_PER_LANGUAGE ✅

- OT_MAX_TAGS_PER_SCRIPT ✅

- OT_VAR_NO_AXIS_INDEX ✅

- UNICODE_COMBINING_CLASS_CCC133 ✅

- UNICODE_MAX ✅

- UNICODE_MAX_DECOMPOSITION_LEN ✅

- VERSION_MAJOR ✅

- VERSION_MICRO ✅

- VERSION_MINOR ✅

- VERSION_STRING ✅

# Pango

## Classes
### Context


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>13</td><td>0</td><td>10</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- changed ✅

- get_base_dir ✅

- get_base_gravity ✅

- get_font_description
  > ❌ `[method get_font_description/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- get_font_map ✅

- get_gravity ✅

- get_gravity_hint ✅

- get_language
  > ❌ `[method get_language/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))`
- get_matrix
  > ❌ `[method get_matrix/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Matrix), @type -> DataRecord(const PangoMatrix*)))`
- get_metrics
  > ❌ `[method get_metrics/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- get_round_glyph_positions ✅

- get_serial ✅

- list_families
  > ❌ `[method list_families]: Method list_families contains an OUT parameter, which is not supported yet`
- load_font
  > ❌ `[method load_font/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- load_fontset
  > ❌ `[method load_fontset/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- set_base_dir ✅

- set_base_gravity ✅

- set_font_description
  > ❌ `[method set_font_description/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- set_font_map ✅

- set_gravity_hint ✅

- set_language
  > ❌ `[method set_language/<method parameters>/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))`
- set_matrix
  > ❌ `[method set_matrix/<method parameters>/matrix]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Matrix), @type -> DataRecord(const PangoMatrix*)))`
- set_round_glyph_positions ✅


### Coverage


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>5</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- copy ✅

- get ✅

- max ✅

- ref ✅

- set
  > ❌ `[method set]: Method set is weird: Incorrectly marked as overriding a set method in GObject`
- to_bytes
  > ❌ `[method to_bytes]: Method to_bytes contains an OUT parameter, which is not supported yet`
- unref ✅

#### Functions
- from_bytes
  > ❌ `[function from_bytes/<function parameters>/bytes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))`

### Font


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>2</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>9</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- describe
  > ❌ `[method describe/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- describe_with_absolute_size
  > ❌ `[method describe_with_absolute_size/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- get_coverage
  > ❌ `[method get_coverage/<method parameters>/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))`
- get_face ✅

- get_features
  > ❌ `[method get_features]: Method get_features contains an OUT parameter, which is not supported yet`
- get_font_map ✅

- get_glyph_extents
  > ❌ `[method get_glyph_extents]: Method get_glyph_extents contains an OUT parameter, which is not supported yet`
- get_hb_font
  > ❌ `[method get_hb_font]: Method get_hb_font is weird: refers to HarfBuzz.font_t as gconstpointer`
- get_languages
  > ❌ `[method get_languages/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Language)))),ListMap(@type -> DataRecord(PangoLanguage**)))`
- get_metrics
  > ❌ `[method get_metrics/<method parameters>/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))`
- has_char ✅

- serialize
  > ❌ `[method serialize/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
#### Functions
- descriptions_free
  > ❌ `[function descriptions_free/<function parameters>/descs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(PangoFontDescription**)))`
- deserialize
  > ❌ `[function deserialize/<function parameters>/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`

### FontFace


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>3</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- describe
  > ❌ `[method describe/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))`
- get_face_name ✅

- get_family ✅

- is_synthesized ✅

- list_sizes
  > ❌ `[method list_sizes]: Method list_sizes contains an OUT parameter, which is not supported yet`

### FontFamily


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>1</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- get_face ✅

- get_name ✅

- is_monospace ✅

- is_variable ✅

- list_faces
  > ❌ `[method list_faces]: Method list_faces contains an OUT parameter, which is not supported yet`

### FontMap


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>4</td><td>0</td><td>3</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- changed ✅

- create_context ✅

- get_family ✅

- get_serial ✅

- list_families
  > ❌ `[method list_families]: Method list_families contains an OUT parameter, which is not supported yet`
- load_font
  > ❌ `[method load_font/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- load_fontset
  > ❌ `[method load_fontset/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`

### Fontset


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>1</td><td>0</td><td>2</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- foreach
  > ❌ `[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontsetForeachFunc), @type -> DataRecord(PangoFontsetForeachFunc)))`
- get_font ✅

- get_metrics
  > ❌ `[method get_metrics/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontMetrics), @type -> DataRecord(PangoFontMetrics*)))`

### FontsetSimple


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>1</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>2</td><td>0</td><td>0</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new
  > ❌ `[constructor new/language]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))`
#### Methods
- append ✅

- size ✅


### Layout


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>1</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>1</tr>
<tr><td>methods</td><td>39</td><td>0</td><td>25</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Constructors
- new ✅

#### Methods
- context_changed ✅

- copy ✅

- get_alignment ✅

- get_attributes
  > ❌ `[method get_attributes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))`
- get_auto_dir ✅

- get_baseline ✅

- get_caret_pos
  > ❌ `[method get_caret_pos]: Method get_caret_pos contains an OUT parameter, which is not supported yet`
- get_character_count ✅

- get_context ✅

- get_cursor_pos
  > ❌ `[method get_cursor_pos]: Method get_cursor_pos contains an OUT parameter, which is not supported yet`
- get_direction ✅

- get_ellipsize ✅

- get_extents
  > ❌ `[method get_extents]: Method get_extents contains an OUT parameter, which is not supported yet`
- get_font_description
  > ❌ `[method get_font_description/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- get_height ✅

- get_indent ✅

- get_iter
  > ❌ `[method get_iter/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(LayoutIter), @type -> DataRecord(PangoLayoutIter*)))`
- get_justify ✅

- get_justify_last_line ✅

- get_line
  > ❌ `[method get_line/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))`
- get_line_count ✅

- get_line_readonly
  > ❌ `[method get_line_readonly/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))`
- get_line_spacing ✅

- get_lines
  > ❌ `[method get_lines/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LayoutLine))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))`
- get_lines_readonly
  > ❌ `[method get_lines_readonly/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LayoutLine))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))`
- get_log_attrs
  > ❌ `[method get_log_attrs]: Method get_log_attrs contains an OUT parameter, which is not supported yet`
- get_log_attrs_readonly
  > ❌ `[method get_log_attrs_readonly]: Method get_log_attrs_readonly contains an OUT parameter, which is not supported yet`
- get_pixel_extents
  > ❌ `[method get_pixel_extents]: Method get_pixel_extents contains an OUT parameter, which is not supported yet`
- get_pixel_size
  > ❌ `[method get_pixel_size]: Method get_pixel_size contains an OUT parameter, which is not supported yet`
- get_serial ✅

- get_single_paragraph_mode ✅

- get_size
  > ❌ `[method get_size]: Method get_size contains an OUT parameter, which is not supported yet`
- get_spacing ✅

- get_tabs
  > ❌ `[method get_tabs/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TabArray), @type -> DataRecord(PangoTabArray*)))`
- get_text ✅

- get_unknown_glyphs_count ✅

- get_width ✅

- get_wrap ✅

- index_to_line_x
  > ❌ `[method index_to_line_x]: Method index_to_line_x contains an OUT parameter, which is not supported yet`
- index_to_pos
  > ❌ `[method index_to_pos]: Method index_to_pos contains an OUT parameter, which is not supported yet`
- is_ellipsized ✅

- is_wrapped ✅

- move_cursor_visually
  > ❌ `[method move_cursor_visually]: Method move_cursor_visually contains an OUT parameter, which is not supported yet`
- serialize
  > ❌ `[method serialize/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`
- set_alignment ✅

- set_attributes
  > ❌ `[method set_attributes/<method parameters>/attrs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))`
- set_auto_dir ✅

- set_ellipsize ✅

- set_font_description
  > ❌ `[method set_font_description/<method parameters>/desc]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))`
- set_height ✅

- set_indent ✅

- set_justify ✅

- set_justify_last_line ✅

- set_line_spacing ✅

- set_markup ✅

- set_markup_with_accel
  > ❌ `[method set_markup_with_accel]: Method set_markup_with_accel contains an OUT parameter, which is not supported yet`
- set_single_paragraph_mode ✅

- set_spacing ✅

- set_tabs
  > ❌ `[method set_tabs/<method parameters>/tabs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TabArray), @type -> DataRecord(PangoTabArray*)))`
- set_text ✅

- set_width ✅

- set_wrap ✅

- write_to_file ✅

- xy_to_index
  > ❌ `[method xy_to_index]: Method xy_to_index contains an OUT parameter, which is not supported yet`
#### Functions
- deserialize
  > ❌ `[function deserialize/<function parameters>/bytes]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))`

### Renderer


<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr><tr><td>constants</td><td>0</td><td>0</td><td>0</tr>
<tr><td>constructors</td><td>0</td><td>0</td><td>0</tr>
<tr><td>functions</td><td>0</td><td>0</td><td>0</tr>
<tr><td>methods</td><td>10</td><td>0</td><td>9</tr>
<tr><td>signals</td><td>0</td><td>0</td><td>0</tr></table>

#### Methods
- activate ✅

- deactivate ✅

- draw_error_underline ✅

- draw_glyph
  > ❌ `[method draw_glyph/<method parameters>/glyph]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph)))`
- draw_glyph_item
  > ❌ `[method draw_glyph_item/<method parameters>/glyph_item]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GlyphItem), @type -> DataRecord(PangoGlyphItem*)))`
- draw_glyphs
  > ❌ `[method draw_glyphs/<method parameters>/glyphs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GlyphString), @type -> DataRecord(PangoGlyphString*)))`
- draw_layout ✅

- draw_layout_line
  > ❌ `[method draw_layout_line/<method parameters>/line]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))`
- draw_rectangle ✅

- draw_trapezoid ✅

- get_alpha ✅

- get_color
  > ❌ `[method get_color/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Color), @type -> DataRecord(PangoColor*)))`
- get_layout ✅

- get_layout_line
  > ❌ `[method get_layout_line/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))`
- get_matrix
  > ❌ `[method get_matrix/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Matrix), @type -> DataRecord(const PangoMatrix*)))`
- part_changed ✅

- set_alpha ✅

- set_color
  > ❌ `[method set_color/<method parameters>/color]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Color), @type -> DataRecord(const PangoColor*)))`
- set_matrix
  > ❌ `[method set_matrix/<method parameters>/matrix]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Matrix), @type -> DataRecord(const PangoMatrix*)))`

## Enums
- Alignment ✅

- AttrType ✅

- BaselineShift ✅

- BidiType ✅

- CoverageLevel ✅

- Direction ✅

- EllipsizeMode ✅

- FontScale ✅

- Gravity ✅

- GravityHint ✅

- LayoutDeserializeError ✅

- Overline ✅

- RenderPart ✅

- Script ✅

- Stretch ✅

- Style ✅

- TabAlign ✅

- TextTransform ✅

- Underline ✅

- Variant ✅

- Weight ✅

- WrapMode ✅

## Bitfields
- FontMask ✅

- LayoutDeserializeFlags ✅

- LayoutSerializeFlags ✅

- ShapeFlags ✅

- ShowFlags ✅

## Constants
- ANALYSIS_FLAG_CENTERED_BASELINE ✅

- ANALYSIS_FLAG_IS_ELLIPSIS ✅

- ANALYSIS_FLAG_NEED_HYPHEN ✅

- ATTR_INDEX_FROM_TEXT_BEGINNING ✅

- ATTR_INDEX_TO_TEXT_END ✅

- GLYPH_EMPTY
  > ❌ `[GLYPH_EMPTY:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph))) with raw value `268435455``
- GLYPH_INVALID_INPUT
  > ❌ `[GLYPH_INVALID_INPUT:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph))) with raw value `4294967295``
- GLYPH_UNKNOWN_FLAG
  > ❌ `[GLYPH_UNKNOWN_FLAG:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph))) with raw value `268435456``
- SCALE ✅

- VERSION_MAJOR ✅

- VERSION_MICRO ✅

- VERSION_MINOR ✅

- VERSION_STRING ✅


package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkWidgetClass: _class: The object class structure needs to be the first element in the widget class structure in order for the class mechanism to work correctly. This allows a GtkWidgetClass pointer to be cast to a GObjectClass pointer. : Signal emitted when widget is shown : Signal emitted when widget is hidden. : Signal emitted when widget is going to be mapped, that is when the widget is visible (which is controlled with gtk_widget_set_visible()) and all its parents up to the toplevel widget are also visible. : Signal emitted when widget is going to be unmapped, which means that either it or any of its parents up to the toplevel widget have been set as hidden. : Signal emitted when widget is associated with a `GdkSurface`, which means that gtk_widget_realize() has been called or the widget has been mapped (that is, it is going to be drawn). : Signal emitted when the GdkSurface associated with widget is destroyed, which means that gtk_widget_unrealize() has been called or the widget has been unmapped (that is, it is going to be hidden). : Called when the widget gets added to a `GtkRoot` widget. Must chain up : Called when the widget is about to be removed from its `GtkRoot` widget. Must chain up _allocate: Called to set the allocation, if the widget does not have a layout manager. _flags_changed: Signal emitted when the widget state changes, see gtk_widget_get_state_flags(). _changed: Signal emitted when the text direction of a widget changes. _request_mode: Called to get the request mode, if the widget does not have a layout manager. This allows a widget to tell its parent container whether it prefers to be allocated in %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH or %GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT mode. %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH means the widget prefers to have `GtkWidgetClass.measure()` called first to get the default width (passing a for_size of -1), then again to get the height for said default width. %GTK_SIZE_REQUEST_CONSTANT_SIZE disables any height-for-width or width-for-height geometry management for said widget and is the default return. It’s important to note that any widget which trades height-for-width or width-for-height must respond properly to a for_size value >= -1 passed to `GtkWidgetClass.measure`, for both possible orientations. : Called to obtain the minimum and natural size of the widget, if the widget does not have a layout manager. Depending on the orientation parameter, the passed for_size can be interpreted as width or height. A widget will never be allocated less than its minimum size. _activate: Activates the if _cycling is %FALSE, and just grabs the focus if _cycling is %TRUE. _focus: Causes to have the keyboard focus for the `GtkWindow` it’s inside. : Vfunc for gtk_widget_child_focus()
*/
opaque type GtkWidgetClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]

object GtkWidgetClass:
  given _tag: Tag[GtkWidgetClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkWidgetClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass]] = value
      inline def show: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def show_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def hide: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def hide_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def map: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def map_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def unmap: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def unmap_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def realize: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def realize_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def unrealize: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def unrealize_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def root: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def root_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def unroot: CFuncPtr1[Ptr[GtkWidget], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]]
      inline def unroot_=(value: CFuncPtr1[Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], Unit]]] = value
      inline def size_allocate: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]]]
      inline def size_allocate_=(value: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]]] = value
      inline def state_flags_changed: CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]]]
      inline def state_flags_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]]] = value
      inline def direction_changed: CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]]]
      inline def direction_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]]] = value
      inline def get_request_mode: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]]]
      inline def get_request_mode_=(value: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]]] = value
      inline def measure: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]]]
      inline def measure_=(value: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]]] = value
      inline def mnemonic_activate: CFuncPtr2[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def mnemonic_activate_=(value: CFuncPtr2[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def grab_focus: CFuncPtr1[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def grab_focus_=(value: CFuncPtr1[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def focus: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def focus_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def set_focus_child: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]]]
      inline def set_focus_child_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]]] = value
      inline def move_focus: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]]]
      inline def move_focus_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]]] = value
      inline def keynav_failed: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def keynav_failed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def query_tooltip: CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean, Ptr[GtkTooltip], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean, Ptr[GtkTooltip], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def query_tooltip_=(value: CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean, Ptr[GtkTooltip], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean, Ptr[GtkTooltip], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def compute_expand: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[_root_.sn.gnome.glib.internal.gboolean], Unit] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[_root_.sn.gnome.glib.internal.gboolean], Unit]]]
      inline def compute_expand_=(value: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[_root_.sn.gnome.glib.internal.gboolean], Unit]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[_root_.sn.gnome.glib.internal.gboolean], Unit]]] = value
      inline def css_changed: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]]]
      inline def css_changed_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]]] = value
      inline def system_setting_changed: CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]]]
      inline def system_setting_changed_=(value: CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]]] = value
      inline def snapshot: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit] = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]]]
      inline def snapshot_=(value: CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]]] = value
      inline def contains: CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def contains_=(value: CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def priv: Ptr[GtkWidgetClassPrivate] = !struct.at(offsets(26)).asInstanceOf[Ptr[Ptr[GtkWidgetClassPrivate]]]
      inline def priv_=(value: Ptr[GtkWidgetClassPrivate]): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[Ptr[GtkWidgetClassPrivate]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(27)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(27)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    end extension
  
  // Allocates GtkWidgetClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkWidgetClass] = scala.scalanative.unsafe.alloc[GtkWidgetClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass, show : CFuncPtr1[Ptr[GtkWidget], Unit], hide : CFuncPtr1[Ptr[GtkWidget], Unit], map : CFuncPtr1[Ptr[GtkWidget], Unit], unmap : CFuncPtr1[Ptr[GtkWidget], Unit], realize : CFuncPtr1[Ptr[GtkWidget], Unit], unrealize : CFuncPtr1[Ptr[GtkWidget], Unit], root : CFuncPtr1[Ptr[GtkWidget], Unit], unroot : CFuncPtr1[Ptr[GtkWidget], Unit], size_allocate : CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit], state_flags_changed : CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit], direction_changed : CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit], get_request_mode : CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode], measure : CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit], mnemonic_activate : CFuncPtr2[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], grab_focus : CFuncPtr1[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean], focus : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean], set_focus_child : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit], move_focus : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit], keynav_failed : CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean], query_tooltip : CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean, Ptr[GtkTooltip], _root_.sn.gnome.glib.internal.gboolean], compute_expand : CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[_root_.sn.gnome.glib.internal.gboolean], Unit], css_changed : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit], system_setting_changed : CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit], snapshot : CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit], contains : CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.sn.gnome.glib.internal.gboolean], priv : Ptr[GtkWidgetClassPrivate], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkWidgetClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).show = show
    (!____ptr).hide = hide
    (!____ptr).map = map
    (!____ptr).unmap = unmap
    (!____ptr).realize = realize
    (!____ptr).unrealize = unrealize
    (!____ptr).root = root
    (!____ptr).unroot = unroot
    (!____ptr).size_allocate = size_allocate
    (!____ptr).state_flags_changed = state_flags_changed
    (!____ptr).direction_changed = direction_changed
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).measure = measure
    (!____ptr).mnemonic_activate = mnemonic_activate
    (!____ptr).grab_focus = grab_focus
    (!____ptr).focus = focus
    (!____ptr).set_focus_child = set_focus_child
    (!____ptr).move_focus = move_focus
    (!____ptr).keynav_failed = keynav_failed
    (!____ptr).query_tooltip = query_tooltip
    (!____ptr).compute_expand = compute_expand
    (!____ptr).css_changed = css_changed
    (!____ptr).system_setting_changed = system_setting_changed
    (!____ptr).snapshot = snapshot
    (!____ptr).contains = contains
    (!____ptr).priv = priv
    (!____ptr).padding = padding
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](28)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr1[Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr2[Ptr[GtkWidget], GtkStateFlags, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr2[Ptr[GtkWidget], GtkTextDirection, Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]].toInt, alignmentof[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr2[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr1[Ptr[GtkWidget], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]].toInt)
    res(18) = align(res(17) + sizeof[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkWidget], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]].toInt)
    res(19) = align(res(18) + sizeof[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(20) = align(res(19) + sizeof[CFuncPtr2[Ptr[GtkWidget], GtkDirectionType, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean, Ptr[GtkTooltip], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(21) = align(res(20) + sizeof[CFuncPtr5[Ptr[GtkWidget], CInt, CInt, _root_.sn.gnome.glib.internal.gboolean, Ptr[GtkTooltip], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[_root_.sn.gnome.glib.internal.gboolean], Unit]].toInt)
    res(22) = align(res(21) + sizeof[CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[_root_.sn.gnome.glib.internal.gboolean], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]].toInt)
    res(23) = align(res(22) + sizeof[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkCssStyleChange], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]].toInt)
    res(24) = align(res(23) + sizeof[CFuncPtr2[Ptr[GtkWidget], GtkSystemSetting, Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]].toInt)
    res(25) = align(res(24) + sizeof[CFuncPtr2[Ptr[GtkWidget], Ptr[GtkSnapshot], Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(26) = align(res(25) + sizeof[CFuncPtr3[Ptr[GtkWidget], Double, Double, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[Ptr[GtkWidgetClassPrivate]].toInt)
    res(27) = align(res(26) + sizeof[Ptr[GtkWidgetClassPrivate]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets
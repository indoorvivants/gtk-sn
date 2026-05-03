package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeModelIface: _changed: Signal emitted when a row in the model has changed. _inserted: Signal emitted when a new row has been inserted in the model. _has_child_toggled: Signal emitted when a row has gotten the first child row or lost its last child row. _deleted: Signal emitted when a row has been deleted. _reordered: Signal emitted when the children of a node in the GtkTreeModel have been reordered. _flags: Get `GtkTreeModelFlags` supported by this interface. _n_columns: Get the number of columns supported by the model. _column_type: Get the type of the column. _iter: Sets iter to a valid iterator pointing to path. _path: Gets a newly-created `GtkTreePath` referenced by iter. _value: Initializes and sets value to that at column. _next: Sets iter to point to the node following it at the current level. _previous: Sets iter to point to the previous node at the current level. _children: Sets iter to point to the first child of parent. _has_child: %TRUE if iter has children, %FALSE otherwise. _n_children: Gets the number of children that iter has. _nth_child: Sets iter to be the child of parent, using the given index. _parent: Sets iter to be the parent of child. _node: Lets the tree ref the node. _node: Lets the tree unref the node.
*/
opaque type _GtkTreeModelIface = CStruct21[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], CFuncPtr1[Ptr[GtkTreeModel], CInt], CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.sn.gnome.gobject.internal.GType], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]]

object _GtkTreeModelIface:
  given _tag: Tag[_GtkTreeModelIface] = Tag.materializeCStruct21Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], CFuncPtr1[Ptr[GtkTreeModel], CInt], CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.sn.gnome.gobject.internal.GType], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTreeModelIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def row_changed : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._2
      inline def row_changed_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = (!struct.at2 = value)
      inline def row_inserted : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._3
      inline def row_inserted_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = (!struct.at3 = value)
      inline def row_has_child_toggled : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit] = struct._4
      inline def row_has_child_toggled_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit]): Unit = (!struct.at4 = value)
      inline def row_deleted : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit] = struct._5
      inline def row_deleted_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit]): Unit = (!struct.at5 = value)
      inline def rows_reordered : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit] = struct._6
      inline def rows_reordered_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit]): Unit = (!struct.at6 = value)
      inline def get_flags : CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags] = struct._7
      inline def get_flags_=(value: CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags]): Unit = (!struct.at7 = value)
      inline def get_n_columns : CFuncPtr1[Ptr[GtkTreeModel], CInt] = struct._8
      inline def get_n_columns_=(value: CFuncPtr1[Ptr[GtkTreeModel], CInt]): Unit = (!struct.at8 = value)
      inline def get_column_type : CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.sn.gnome.gobject.internal.GType] = struct._9
      inline def get_column_type_=(value: CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.sn.gnome.gobject.internal.GType]): Unit = (!struct.at9 = value)
      inline def get_iter : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean] = struct._10
      inline def get_iter_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at10 = value)
      inline def get_path : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]] = struct._11
      inline def get_path_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]]): Unit = (!struct.at11 = value)
      inline def get_value : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit] = struct._12
      inline def get_value_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit]): Unit = (!struct.at12 = value)
      inline def iter_next : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean] = struct._13
      inline def iter_next_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at13 = value)
      inline def iter_previous : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean] = struct._14
      inline def iter_previous_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at14 = value)
      inline def iter_children : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean] = struct._15
      inline def iter_children_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at15 = value)
      inline def iter_has_child : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean] = struct._16
      inline def iter_has_child_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at16 = value)
      inline def iter_n_children : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt] = struct._17
      inline def iter_n_children_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt]): Unit = (!struct.at17 = value)
      inline def iter_nth_child : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.sn.gnome.glib.internal.gboolean] = struct._18
      inline def iter_nth_child_=(value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at18 = value)
      inline def iter_parent : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean] = struct._19
      inline def iter_parent_=(value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at19 = value)
      inline def ref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit] = struct._20
      inline def ref_node_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]): Unit = (!struct.at20 = value)
      inline def unref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit] = struct._21
      inline def unref_node_=(value: CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit]): Unit = (!struct.at21 = value)
    end extension
  
  // Allocates _GtkTreeModelIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTreeModelIface] = scala.scalanative.unsafe.alloc[_GtkTreeModelIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, row_changed : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_inserted : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_has_child_toggled : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Unit], row_deleted : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreePath], Unit], rows_reordered : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], Ptr[CInt], Unit], get_flags : CFuncPtr1[Ptr[GtkTreeModel], GtkTreeModelFlags], get_n_columns : CFuncPtr1[Ptr[GtkTreeModel], CInt], get_column_type : CFuncPtr2[Ptr[GtkTreeModel], CInt, _root_.sn.gnome.gobject.internal.GType], get_iter : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], get_path : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreePath]], get_value : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt, Ptr[_root_.sn.gnome.gobject.internal.GValue], Unit], iter_next : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], iter_previous : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], iter_children : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], iter_has_child : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], iter_n_children : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], CInt], iter_nth_child : CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], CInt, _root_.sn.gnome.glib.internal.gboolean], iter_parent : CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], ref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit], unref_node : CFuncPtr2[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Unit])(using Zone): Ptr[_GtkTreeModelIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).row_changed = row_changed
    (!____ptr).row_inserted = row_inserted
    (!____ptr).row_has_child_toggled = row_has_child_toggled
    (!____ptr).row_deleted = row_deleted
    (!____ptr).rows_reordered = rows_reordered
    (!____ptr).get_flags = get_flags
    (!____ptr).get_n_columns = get_n_columns
    (!____ptr).get_column_type = get_column_type
    (!____ptr).get_iter = get_iter
    (!____ptr).get_path = get_path
    (!____ptr).get_value = get_value
    (!____ptr).iter_next = iter_next
    (!____ptr).iter_previous = iter_previous
    (!____ptr).iter_children = iter_children
    (!____ptr).iter_has_child = iter_has_child
    (!____ptr).iter_n_children = iter_n_children
    (!____ptr).iter_nth_child = iter_nth_child
    (!____ptr).iter_parent = iter_parent
    (!____ptr).ref_node = ref_node
    (!____ptr).unref_node = unref_node
    ____ptr
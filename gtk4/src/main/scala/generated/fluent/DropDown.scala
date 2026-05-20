package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Expression,
  ListItemFactory,
  StringFilterMatchMode,
  Widget
}
import sn.gnome.gtk4.internal.GtkDropDown
import sn.gnome.runtime.*

/** `GtkDropDown` is a widget that allows the user to choose an item from a list
  * of options.
  *
  * ![An example GtkDropDown](drop-down.png)
  *
  * The `GtkDropDown` displays the [selected][property@Gtk.DropDown:selected]
  * choice.
  *
  * The options are given to `GtkDropDown` in the form of `GListModel` and how
  * the individual options are represented is determined by a
  * [class@Gtk.ListItemFactory]. The default factory displays simple strings,
  * and adds a checkmark to the selected item in the popup.
  *
  * To set your own factory, use [method@Gtk.DropDown.set_factory]. It is
  * possible to use a separate factory for the items in the popup, with
  * [method@Gtk.DropDown.set_list_factory].
  *
  * `GtkDropDown` knows how to obtain strings from the items in a
  * [class@Gtk.StringList]; for other models, you have to provide an expression
  * to find the strings via [method@Gtk.DropDown.set_expression].
  *
  * `GtkDropDown` can optionally allow search in the popup, which is useful if
  * the list of options is long. To enable the search entry, use
  * [method@Gtk.DropDown.set_enable_search].
  *
  * Here is a UI definition example for `GtkDropDown` with a simple model:
  *
  * ```xml
  * <object class="GtkDropDown">
  *   <property name="model">
  *     <object class="GtkStringList">
  *       <items>
  *         <item translatable="yes">Factory</item>
  *         <item translatable="yes">Home</item>
  *         <item translatable="yes">Subway</item>
  *       </items>
  *     </object>
  *   </property>
  * </object>
  * ```
  *
  * To learn more about the list widget framework, see the
  * [overview](section-list-widget.html).
  *
  * ## CSS nodes
  *
  * `GtkDropDown` has a single CSS node with name dropdown, with the button and
  * popover nodes as children.
  *
  * ## Accessibility
  *
  * `GtkDropDown` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DropDown private[gnome] (raw: Ptr[GtkDropDown])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether search is enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableSearch(): Boolean /* None */ =
    gtk_drop_down_get_enable_search(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
    ).value.!=(0)
  end getEnableSearch

  /** Gets the expression set that is used to obtain strings from items.
    *
    * See [method@Gtk.DropDown.set_expression].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpression()(using Runtime): sn.gnome.gtk4.Expression /* None */ =
    sn.gnome.gtk4.Expression.applyUnsafe(
      gtk_drop_down_get_expression(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
      ).asInstanceOf
    )
  end getExpression

  /** Gets the factory that's currently used to populate list items.
    *
    * The factory returned by this function is always used for the item in the
    * button. It is also used for items in the popup if
    * [property@Gtk.DropDown:list-factory] is not set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFactory()(using Runtime): sn.gnome.gtk4.ListItemFactory /* None */ =
    sn.gnome.gtk4.ListItemFactory.applyUnsafe(
      gtk_drop_down_get_factory(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
      ).asInstanceOf
    )
  end getFactory

  /** Gets the factory that's currently used to create header widgets for the
    * popup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeaderFactory()(using
      Runtime
  ): sn.gnome.gtk4.ListItemFactory /* None */ =
    sn.gnome.gtk4.ListItemFactory.applyUnsafe(
      gtk_drop_down_get_header_factory(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
      ).asInstanceOf
    )
  end getHeaderFactory

  /** Gets the factory that's currently used to populate list items in the
    * popup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getListFactory()(using
      Runtime
  ): sn.gnome.gtk4.ListItemFactory /* None */ =
    sn.gnome.gtk4.ListItemFactory.applyUnsafe(
      gtk_drop_down_get_list_factory(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
      ).asInstanceOf
    )
  end getListFactory

  /** Gets the model that provides the displayed items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): sn.gnome.gio.ListModel /* None */ =
    new ListModel.Abstract(
      gtk_drop_down_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
      ).asInstanceOf
    )
  end getModel

  /** Returns the match mode that the search filter is using.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearchMatchMode(): sn.gnome.gtk4.StringFilterMatchMode /* None */ =
    sn.gnome.gtk4.StringFilterMatchMode.fromRaw(
      gtk_drop_down_get_search_match_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
      )
    )
  end getSearchMatchMode

  /** Gets the position of the selected item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelected(): UInt /* None */ =
    gtk_drop_down_get_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
    ).value
  end getSelected

  /** Gets the selected item. If no item is selected, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectedItem()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      gtk_drop_down_get_selected_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
      ).asInstanceOf
    )
  end getSelectedItem

  /** Returns whether to show an arrow within the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowArrow(): Boolean /* None */ =
    gtk_drop_down_get_show_arrow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]]
    ).value.!=(0)
  end getShowArrow

  /** Sets whether a search entry will be shown in the popup that allows to
    * search for items in the list.
    *
    * Note that [property@Gtk.DropDown:expression] must be set for search to
    * work.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableSearch(
      enable_search: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_drop_down_set_enable_search(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      gboolean(gint((if enable_search == true then 1 else 0)))
    )
  end setEnableSearch

  /** Sets the expression that gets evaluated to obtain strings from items.
    *
    * This is used for search in the popup. The expression must have a value
    * type of %G_TYPE_STRING.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpression(
      expression: Option[
        sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_drop_down_set_expression(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    )
  end setExpression

  /** Sets the `GtkListItemFactory` to use for populating list items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFactory(
      factory: Option[
        sn.gnome.gtk4.ListItemFactory /* Some(Ptr[GtkListItemFactory]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_drop_down_set_factory(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    )
  end setFactory

  /** Sets the `GtkListItemFactory` to use for creating header widgets for the
    * popup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeaderFactory(
      factory: Option[
        sn.gnome.gtk4.ListItemFactory /* Some(Ptr[GtkListItemFactory]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_drop_down_set_header_factory(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    )
  end setHeaderFactory

  /** Sets the `GtkListItemFactory` to use for populating list items in the
    * popup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setListFactory(
      factory: Option[
        sn.gnome.gtk4.ListItemFactory /* Some(Ptr[GtkListItemFactory]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_drop_down_set_list_factory(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      factory
        .map[Ptr[GtkListItemFactory]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkListItemFactory]])
    )
  end setListFactory

  /** Sets the `GListModel` to use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        sn.gnome.gio.ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_drop_down_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

  /** Sets the match mode for the search filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSearchMatchMode(
      search_match_mode: sn.gnome.gtk4.StringFilterMatchMode /* Some(GtkStringFilterMatchMode) */
  ): Unit /* None */ =
    gtk_drop_down_set_search_match_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      search_match_mode.raw
    )
  end setSearchMatchMode

  /** Selects the item at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelected(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_drop_down_set_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      guint(position)
    )
  end setSelected

  /** Sets whether an arrow will be displayed within the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowArrow(
      show_arrow: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_drop_down_set_show_arrow(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropDown]],
      gboolean(gint((if show_arrow == true then 1 else 0)))
    )
  end setShowArrow

  /** Emitted to when the drop down is activated.
    *
    * The `::activate` signal on `GtkDropDown` is an action signal and emitting
    * it causes the drop down to pop up its dropdown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkDropDown],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivate
end DropDown

object DropDown:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkDropDown])(using Runtime) = summon[Runtime]
    .getOrCreate[DropDown](ptr.asInstanceOf[Ptr[Byte]], p => new DropDown(ptr))

  /** Creates a new `GtkDropDown`.
    *
    * You may want to call [method@Gtk.DropDown.set_factory] to set up a way to
    * map its items to widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[
        sn.gnome.gio.ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ],
      expression: Option[
        sn.gnome.gtk4.Expression /* Some(Ptr[GtkExpression]) */
      ]
  )(using Runtime): DropDown =
    val raw: Ptr[Byte] = gtk_drop_down_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        ),
      expression
        .map[Ptr[GtkExpression]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkExpression]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[DropDown](raw, r => DropDown.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkDropDown` that is populated with the strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_strings/strings]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def fromStrings() = ???

end DropDown

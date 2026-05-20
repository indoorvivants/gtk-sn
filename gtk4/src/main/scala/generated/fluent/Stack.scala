package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  ConstraintTarget,
  SelectionModel,
  StackPage,
  StackTransitionType,
  Widget
}
import sn.gnome.gtk4.internal.GtkStack

/** `GtkStack` is a container which only shows one of its children at a time.
  *
  * In contrast to `GtkNotebook`, `GtkStack` does not provide a means for users
  * to change the visible child. Instead, a separate widget such as
  * [class@Gtk.StackSwitcher] or [class@Gtk.StackSidebar] can be used with
  * `GtkStack` to provide this functionality.
  *
  * Transitions between pages can be animated as slides or fades. This can be
  * controlled with [method@Gtk.Stack.set_transition_type]. These animations
  * respect the [property@Gtk.Settings:gtk-enable-animations] setting.
  *
  * `GtkStack` maintains a [class@Gtk.StackPage] object for each added child,
  * which holds additional per-child properties. You obtain the `GtkStackPage`
  * for a child with [method@Gtk.Stack.get_page] and you can obtain a
  * `GtkSelectionModel` containing all the pages with
  * [method@Gtk.Stack.get_pages].
  *
  * # GtkStack as GtkBuildable
  *
  * To set child-specific properties in a .ui file, create `GtkStackPage`
  * objects explicitly, and set the child widget as a property on it:
  *
  * ```xml
  *   <object class="GtkStack" id="stack">
  *     <child>
  *       <object class="GtkStackPage">
  *         <property name="name">page1</property>
  *         <property name="title">In the beginning…</property>
  *         <property name="child">
  *           <object class="GtkLabel">
  *             <property name="label">It was dark</property>
  *           </object>
  *         </property>
  *       </object>
  *     </child>
  * ```
  *
  * # CSS nodes
  *
  * `GtkStack` has a single CSS node named stack.
  *
  * # Accessibility
  *
  * `GtkStack` uses the %GTK_ACCESSIBLE_ROLE_TAB_PANEL for the stack pages,
  * which are the accessible parent objects of the child widgets.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Stack private[gnome] (raw: Ptr[GtkStack])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a child to @stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addChild(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): sn.gnome.gtk4.StackPage /* None */ =
    sn.gnome.gtk4.StackPage.applyUnsafe(
      gtk_stack_add_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end addChild

  /** Adds a child to @stack.
    *
    * The child is identified by the @name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addNamed(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      name: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): sn.gnome.gtk4.StackPage /* None */ =
    sn.gnome.gtk4.StackPage.applyUnsafe(
      gtk_stack_add_named(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
        child.getUnsafeRawPointer().asInstanceOf,
        name
          .map[CString](o => summon[Runtime].inZone(toCString(o)))
          .getOrElse(null.asInstanceOf[CString])
      ).asInstanceOf
    )
  end addNamed

  /** Adds a child to @stack.
    *
    * The child is identified by the @name. The @title will be used by
    * `GtkStackSwitcher` to represent
    * @child
    *   in a tab bar, so it should be short.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addTitled(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      name: Option[scala.Predef.String /* Some(CString) */ ],
      title: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.gtk4.StackPage /* None */ =
    sn.gnome.gtk4.StackPage.applyUnsafe(
      gtk_stack_add_titled(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
        child.getUnsafeRawPointer().asInstanceOf,
        name
          .map[CString](o => summon[Runtime].inZone(toCString(o)))
          .getOrElse(null.asInstanceOf[CString]),
        summon[Runtime].inZone(toCString(title))
      ).asInstanceOf
    )
  end addTitled

  /** Finds the child with the name given as the argument.
    *
    * Returns %NULL if there is no child with this name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildByName(
      name: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_stack_get_child_by_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
        summon[Runtime].inZone(toCString(name))
      ).asInstanceOf
    )
  end getChildByName

  /** Gets whether @stack is horizontally homogeneous.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHhomogeneous(): Boolean /* None */ =
    gtk_stack_get_hhomogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
    ).value.!=(0)
  end getHhomogeneous

  /** Returns whether the `GtkStack` is set up to interpolate between the sizes
    * of children on page switch.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterpolateSize(): Boolean /* None */ =
    gtk_stack_get_interpolate_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
    ).value.!=(0)
  end getInterpolateSize

  /** Returns the `GtkStackPage` object for @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPage(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): sn.gnome.gtk4.StackPage /* None */ =
    sn.gnome.gtk4.StackPage.applyUnsafe(
      gtk_stack_get_page(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
        child.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getPage

  /** Returns a `GListModel` that contains the pages of the stack.
    *
    * This can be used to keep an up-to-date view. The model also implements
    * [iface@Gtk.SelectionModel] and can be used to track and modify the visible
    * page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPages(): sn.gnome.gtk4.SelectionModel /* None */ =
    new SelectionModel.Abstract(
      gtk_stack_get_pages(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
      ).asInstanceOf
    )
  end getPages

  /** Returns the amount of time (in milliseconds) that transitions between
    * pages in @stack will take.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransitionDuration(): UInt /* None */ =
    gtk_stack_get_transition_duration(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
    ).value
  end getTransitionDuration

  /** Returns whether the @stack is currently in a transition from one page to
    * another.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransitionRunning(): Boolean /* None */ =
    gtk_stack_get_transition_running(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
    ).value.!=(0)
  end getTransitionRunning

  /** Gets the type of animation that will be used for transitions between pages
    * in @stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransitionType(): sn.gnome.gtk4.StackTransitionType /* None */ =
    sn.gnome.gtk4.StackTransitionType.fromRaw(
      gtk_stack_get_transition_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
      )
    )
  end getTransitionType

  /** Gets whether @stack is vertically homogeneous.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVhomogeneous(): Boolean /* None */ =
    gtk_stack_get_vhomogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
    ).value.!=(0)
  end getVhomogeneous

  /** Gets the currently visible child of @stack.
    *
    * Returns %NULL if there are no visible children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibleChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_stack_get_visible_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
      ).asInstanceOf
    )
  end getVisibleChild

  /** Returns the name of the currently visible child of @stack.
    *
    * Returns %NULL if there is no visible child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibleChildName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_stack_get_visible_child_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]]
      ).asInstanceOf
    )
  end getVisibleChildName

  /** Removes a child widget from @stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_stack_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Sets the `GtkStack` to be horizontally homogeneous or not.
    *
    * If it is homogeneous, the `GtkStack` will request the same width for all
    * its children. If it isn't, the stack may change width when a different
    * child becomes visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHhomogeneous(
      hhomogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_stack_set_hhomogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      gboolean(gint((if hhomogeneous == true then 1 else 0)))
    )
  end setHhomogeneous

  /** Sets whether or not @stack will interpolate its size when changing the
    * visible child.
    *
    * If the [property@Gtk.Stack:interpolate-size] property is set to %TRUE, @stack
    * will interpolate its size between the current one and the one it'll take
    * after changing the visible child, according to the set transition
    * duration.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInterpolateSize(
      interpolate_size: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_stack_set_interpolate_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      gboolean(gint((if interpolate_size == true then 1 else 0)))
    )
  end setInterpolateSize

  /** Sets the duration that transitions between pages in @stack will take.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransitionDuration(
      duration: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_stack_set_transition_duration(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      guint(duration)
    )
  end setTransitionDuration

  /** Sets the type of animation that will be used for transitions between pages
    * in @stack.
    *
    * Available types include various kinds of fades and slides.
    *
    * The transition type can be changed without problems at runtime, so it is
    * possible to change the animation based on the page that is about to become
    * current.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransitionType(
      transition: sn.gnome.gtk4.StackTransitionType /* Some(GtkStackTransitionType) */
  ): Unit /* None */ =
    gtk_stack_set_transition_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      transition.raw
    )
  end setTransitionType

  /** Sets the `GtkStack` to be vertically homogeneous or not.
    *
    * If it is homogeneous, the `GtkStack` will request the same height for all
    * its children. If it isn't, the stack may change height when a different
    * child becomes visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVhomogeneous(
      vhomogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_stack_set_vhomogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      gboolean(gint((if vhomogeneous == true then 1 else 0)))
    )
  end setVhomogeneous

  /** Makes @child the visible child of @stack.
    *
    * If @child is different from the currently visible child, the transition
    * between the two will be animated with the current transition type of @stack.
    *
    * Note that the @child widget has to be visible itself (see
    * [method@Gtk.Widget.show]) in order to become the visible child of @stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisibleChild(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_stack_set_visible_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end setVisibleChild

  /** Makes the child with the given name visible.
    *
    * Note that the child widget has to be visible itself (see
    * [method@Gtk.Widget.show]) in order to become the visible child of @stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisibleChildFull(
      name: scala.Predef.String /* Some(CString) */,
      transition: sn.gnome.gtk4.StackTransitionType /* Some(GtkStackTransitionType) */
  )(using Runtime): Unit /* None */ =
    gtk_stack_set_visible_child_full(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      summon[Runtime].inZone(toCString(name)),
      transition.raw
    )
  end setVisibleChildFull

  /** Makes the child with the given name visible.
    *
    * If @child is different from the currently visible child, the transition
    * between the two will be animated with the current transition type of @stack.
    *
    * Note that the child widget has to be visible itself (see
    * [method@Gtk.Widget.show]) in order to become the visible child of @stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisibleChildName(
      name: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_stack_set_visible_child_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStack]],
      summon[Runtime].inZone(toCString(name))
    )
  end setVisibleChildName

end Stack

object Stack:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkStack])(using Runtime) = summon[Runtime]
    .getOrCreate[Stack](ptr.asInstanceOf[Ptr[Byte]], p => new Stack(ptr))

  /** Creates a new `GtkStack`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Stack =
    val raw: Ptr[Byte] = gtk_stack_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Stack](raw, r => Stack.applyUnsafe(r.asInstanceOf))
  end apply
end Stack

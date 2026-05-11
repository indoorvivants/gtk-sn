package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  ATContext,
  Accessible,
  AccessiblePlatformState,
  AccessibleProperty,
  AccessibleRelation,
  AccessibleRole,
  AccessibleState
}

trait Accessible:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Retrieves the accessible parent for an accessible object.
    *
    * This function returns `NULL` for top level widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleParent(): Accessible /* None */ =
    new Accessible.Abstract(
      gtk_accessible_get_accessible_parent(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]]
      ).asInstanceOf
    )
  end getAccessibleParent

  /** Retrieves the accessible role of an accessible object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleRole(): AccessibleRole /* None */ =
    AccessibleRole.fromRaw(
      gtk_accessible_get_accessible_role(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]]
      )
    )
  end getAccessibleRole

  /** Retrieves the accessible implementation for the given `GtkAccessible`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAtContext()(using Runtime): sn.gnome.gtk4.fluent.ATContext /* None */ =
    sn.gnome.gtk4.fluent.ATContext.applyUnsafe(
      gtk_accessible_get_at_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]]
      ).asInstanceOf
    )
  end getAtContext

  /** Queries the coordinates and dimensions of this accessible
    *
    * This functionality can be overridden by `GtkAccessible` implementations,
    * e.g. to get the bounds from an ignored child widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getBounds__ = ???

  /** Retrieves the first accessible child of an accessible object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFirstAccessibleChild(): Accessible /* None */ =
    new Accessible.Abstract(
      gtk_accessible_get_first_accessible_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]]
      ).asInstanceOf
    )
  end getFirstAccessibleChild

  /** Retrieves the next accessible sibling of an accessible object
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNextAccessibleSibling(): Accessible /* None */ =
    new Accessible.Abstract(
      gtk_accessible_get_next_accessible_sibling(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]]
      ).asInstanceOf
    )
  end getNextAccessibleSibling

  /** Query a platform state, such as focus.
    *
    * See gtk_accessible_platform_changed().
    *
    * This functionality can be overridden by `GtkAccessible` implementations,
    * e.g. to get platform state from an ignored child widget, as is the case
    * for `GtkText` wrappers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlatformState(
      state: AccessiblePlatformState /* Some(GtkAccessiblePlatformState) */
  ): Boolean /* None */ =
    gtk_accessible_get_platform_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]],
      state.raw
    ).value.!=(0)
  end getPlatformState

  /** Resets the accessible @property to its default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetProperty(
      property: AccessibleProperty /* Some(GtkAccessibleProperty) */
  ): Unit /* None */ =
    gtk_accessible_reset_property(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]],
      property.raw
    )
  end resetProperty

  /** Resets the accessible @relation to its default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetRelation(
      relation: AccessibleRelation /* Some(GtkAccessibleRelation) */
  ): Unit /* None */ =
    gtk_accessible_reset_relation(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]],
      relation.raw
    )
  end resetRelation

  /** Resets the accessible @state to its default value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetState(
      state: AccessibleState /* Some(GtkAccessibleState) */
  ): Unit /* None */ =
    gtk_accessible_reset_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]],
      state.raw
    )
  end resetState

  /** Sets the parent and sibling of an accessible object.
    *
    * This function is meant to be used by accessible implementations that are
    * not part of the widget hierarchy, and but act as a logical bridge between
    * widgets. For instance, if a widget creates an object that holds metadata
    * for each child, and you want that object to implement the `GtkAccessible`
    * interface, you will use this function to ensure that the parent of each
    * child widget is the metadata object, and the parent of each metadata
    * object is the container widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccessibleParent(
      parent: Option[Accessible /* Some(Ptr[GtkAccessible]) */ ],
      next_sibling: Option[Accessible /* Some(Ptr[GtkAccessible]) */ ]
  ): Unit /* None */ =
    gtk_accessible_set_accessible_parent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]],
      parent
        .map[Ptr[GtkAccessible]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAccessible]]),
      next_sibling
        .map[Ptr[GtkAccessible]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAccessible]])
    )
  end setAccessibleParent

  /** Updates the next accessible sibling of @self.
    *
    * That might be useful when a new child of a custom `GtkAccessible` is
    * created, and it needs to be linked to a previous child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def updateNextAccessibleSibling(
      new_sibling: Option[Accessible /* Some(Ptr[GtkAccessible]) */ ]
  ): Unit /* None */ =
    gtk_accessible_update_next_accessible_sibling(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAccessible]],
      new_sibling
        .map[Ptr[GtkAccessible]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAccessible]])
    )
  end updateNextAccessibleSibling

  /** Updates a list of accessible properties.
    *
    * See the [enum@Gtk.AccessibleProperty] documentation for the value types of
    * accessible properties.
    *
    * This function should be called by `GtkWidget` types whenever an accessible
    * property change must be communicated to assistive technologies.
    *
    * Example:
    * ```c
    * value = gtk_adjustment_get_value (adjustment);
    * gtk_accessible_update_property (GTK_ACCESSIBLE (spin_button),
    *                                    GTK_ACCESSIBLE_PROPERTY_VALUE_NOW, value,
    *                                    -1);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update_property/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def updateProperty__ = ???

  /** Updates an array of accessible properties.
    *
    * This function should be called by `GtkWidget` types whenever an accessible
    * property change must be communicated to assistive technologies.
    *
    * This function is meant to be used by language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update_property_value/<method parameters>/properties]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AccessibleProperty), @type -> DataRecord(GtkAccessibleProperty)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GtkAccessibleProperty*)))"
  )
  private def updatePropertyValue__ = ???

  /** Updates a list of accessible relations.
    *
    * This function should be called by `GtkWidget` types whenever an accessible
    * relation change must be communicated to assistive technologies.
    *
    * If the [enum@Gtk.AccessibleRelation] requires a list of references, you
    * should pass each reference individually, followed by %NULL, e.g.
    *
    * ```c
    * gtk_accessible_update_relation (accessible,
    *                                 GTK_ACCESSIBLE_RELATION_CONTROLS,
    *                                   ref1, NULL,
    *                                 GTK_ACCESSIBLE_RELATION_LABELLED_BY,
    *                                   ref1, ref2, ref3, NULL,
    *                                 -1);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update_relation/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def updateRelation__ = ???

  /** Updates an array of accessible relations.
    *
    * This function should be called by `GtkWidget` types whenever an accessible
    * relation change must be communicated to assistive technologies.
    *
    * This function is meant to be used by language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update_relation_value/<method parameters>/relations]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AccessibleRelation), @type -> DataRecord(GtkAccessibleRelation)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GtkAccessibleRelation*)))"
  )
  private def updateRelationValue__ = ???

  /** Updates a list of accessible states. See the [enum@Gtk.AccessibleState]
    * documentation for the value types of accessible states.
    *
    * This function should be called by `GtkWidget` types whenever an accessible
    * state change must be communicated to assistive technologies.
    *
    * Example:
    *
    * ```c
    * value = GTK_ACCESSIBLE_TRISTATE_MIXED;
    * gtk_accessible_update_state (GTK_ACCESSIBLE (check_button),
    *                              GTK_ACCESSIBLE_STATE_CHECKED, value,
    *                              -1);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update_state/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def updateState__ = ???

  /** Updates an array of accessible states.
    *
    * This function should be called by `GtkWidget` types whenever an accessible
    * state change must be communicated to assistive technologies.
    *
    * This function is meant to be used by language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update_state_value/<method parameters>/states]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(AccessibleState), @type -> DataRecord(GtkAccessibleState)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GtkAccessibleState*)))"
  )
  private def updateStateValue__ = ???

end Accessible

object Accessible:
  class Abstract(raw: Ptr[Byte]) extends Accessible:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Accessible

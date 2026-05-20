package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{AccessiblePlatformState, Editable}

trait Editable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Retrieves the accessible platform state from the editable delegate.
    *
    * This is an helper function to retrieve the accessible state for
    * `GtkEditable` interface implementations using a delegate pattern.
    *
    * You should call this function in your editable widget implementation of
    * the [vfunc@Gtk.Accessible.get_platform_state] virtual function, for
    * instance:
    *
    * ```c
    * static void
    * accessible_interface_init (GtkAccessibleInterface *iface)
    * {
    *   iface->get_platform_state = your_editable_get_accessible_platform_state;
    * }
    *
    * static gboolean
    * your_editable_get_accessible_platform_state (GtkAccessible *accessible,
    *                                              GtkAccessiblePlatformState state)
    * {
    *   return gtk_editable_delegate_get_accessible_platform_state (GTK_EDITABLE (accessible), state);
    * }
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def delegateGetAccessiblePlatformState(
      state: sn.gnome.gtk4.AccessiblePlatformState /* Some(GtkAccessiblePlatformState) */
  ): Boolean /* None */ =
    gtk_editable_delegate_get_accessible_platform_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      state.raw
    ).value.!=(0)
  end delegateGetAccessiblePlatformState

  /** Deletes the currently selected text of the editable.
    *
    * This call doesn’t do anything if there is no selected text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteSelection(): Unit /* None */ =
    gtk_editable_delete_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    )
  end deleteSelection

  /** Deletes a sequence of characters.
    *
    * The characters that are deleted are those characters at positions from @start_pos
    * up to, but not including @end_pos. If @end_pos is negative, then the
    * characters deleted are those from @start_pos to the end of the text.
    *
    * Note that the positions are specified in characters, not bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteText(
      start_pos: Int /* Some(CInt) */,
      end_pos: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_editable_delete_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      start_pos,
      end_pos
    )
  end deleteText

  /** Undoes the setup done by [method@Gtk.Editable.init_delegate].
    *
    * This is a helper function that should be called from dispose, before
    * removing the delegate object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def finishDelegate(): Unit /* None */ =
    gtk_editable_finish_delegate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    )
  end finishDelegate

  /** Gets the alignment of the editable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAlignment(): Float /* None */ =
    gtk_editable_get_alignment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    )
  end getAlignment

  /** Retrieves a sequence of characters.
    *
    * The characters that are retrieved are those characters at positions from @start_pos
    * up to, but not including @end_pos. If @end_pos is negative, then the
    * characters retrieved are those characters from @start_pos to the end of
    * the text.
    *
    * Note that positions are specified in characters, not bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChars(
      start_pos: Int /* Some(CInt) */,
      end_pos: Int /* Some(CInt) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_editable_get_chars(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
        start_pos,
        end_pos
      ).asInstanceOf
    )
  end getChars

  /** Gets the `GtkEditable` that @editable is delegating its implementation to.
    *
    * Typically, the delegate is a [class@Gtk.Text] widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDelegate(): sn.gnome.gtk4.Editable /* None */ =
    new Editable.Abstract(
      gtk_editable_get_delegate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
      ).asInstanceOf
    )
  end getDelegate

  /** Retrieves whether @editable is editable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEditable(): Boolean /* None */ =
    gtk_editable_get_editable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    ).value.!=(0)
  end getEditable

  /** Gets if undo/redo actions are enabled for @editable
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableUndo(): Boolean /* None */ =
    gtk_editable_get_enable_undo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    ).value.!=(0)
  end getEnableUndo

  /** Retrieves the desired maximum width of @editable, in characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxWidthChars(): Int /* None */ =
    gtk_editable_get_max_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    )
  end getMaxWidthChars

  /** Retrieves the current position of the cursor relative to the start of the
    * content of the editable.
    *
    * Note that this position is in characters, not in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPosition(): Int /* None */ =
    gtk_editable_get_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    )
  end getPosition

  /** Retrieves the selection bound of the editable.
    *
    * @start_pos
    *   will be filled with the start of the selection and
    * @end_pos
    *   with end. If no text was selected both will be identical and %FALSE will
    *   be returned.
    *
    * Note that positions are specified in characters, not bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_selection_bounds]: Method get_selection_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getSelectionBounds__ = ???

  /** Retrieves the contents of @editable.
    *
    * The returned string is owned by GTK and must not be modified or freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText(): scala.Predef.String /* None */ =
    fromCString(
      gtk_editable_get_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
      ).asInstanceOf
    )
  end getText

  /** Gets the number of characters of space reserved for the contents of the
    * editable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidthChars(): Int /* None */ =
    gtk_editable_get_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    )
  end getWidthChars

  /** Sets up a delegate for `GtkEditable`.
    *
    * This is assuming that the get_delegate vfunc in the `GtkEditable`
    * interface has been set up for the @editable's type.
    *
    * This is a helper function that should be called in instance init, after
    * creating the delegate object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initDelegate(): Unit /* None */ =
    gtk_editable_init_delegate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]]
    )
  end initDelegate

  /** Inserts @length bytes of @text into the contents of the widget, at
    * position @position.
    *
    * Note that the position is in characters, not in bytes. The function
    * updates @position to point after the newly inserted text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_text]: Method insert_text contains an INOUT parameter, which is not supported yet"
  )
  private def insertText__ = ???

  /** Selects a region of text.
    *
    * The characters that are selected are those characters at positions from @start_pos
    * up to, but not including @end_pos. If @end_pos is negative, then the
    * characters selected are those characters from
    * @start_pos
    *   to the end of the text.
    *
    * Note that positions are specified in characters, not bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectRegion(
      start_pos: Int /* Some(CInt) */,
      end_pos: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_editable_select_region(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      start_pos,
      end_pos
    )
  end selectRegion

  /** Sets the alignment for the contents of the editable.
    *
    * This controls the horizontal positioning of the contents when the
    * displayed text is shorter than the width of the editable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAlignment(xalign: Float /* Some(Float) */ ): Unit /* None */ =
    gtk_editable_set_alignment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      xalign.asInstanceOf
    )
  end setAlignment

  /** Determines if the user can edit the text in the editable widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEditable(
      is_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_editable_set_editable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      gboolean(gint((if is_editable == true then 1 else 0)))
    )
  end setEditable

  /** If enabled, changes to @editable will be saved for undo/redo actions.
    *
    * This results in an additional copy of text changes and are not stored in
    * secure memory. As such, undo is forcefully disabled when
    * [property@Gtk.Text:visibility] is set to %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableUndo(
      enable_undo: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_editable_set_enable_undo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      gboolean(gint((if enable_undo == true then 1 else 0)))
    )
  end setEnableUndo

  /** Sets the desired maximum width in characters of @editable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxWidthChars(n_chars: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_editable_set_max_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      n_chars
    )
  end setMaxWidthChars

  /** Sets the cursor position in the editable to the given value.
    *
    * The cursor is displayed before the character with the given (base 0) index
    * in the contents of the editable. The value must be less than or equal to
    * the number of characters in the editable. A value of -1 indicates that the
    * position should be set after the last character of the editable. Note that @position
    * is in characters, not in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPosition(position: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_editable_set_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      position
    )
  end setPosition

  /** Sets the text in the editable to the given value.
    *
    * This is replacing the current contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(
      text: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_editable_set_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      summon[Runtime].inZone(toCString(text))
    )
  end setText

  /** Changes the size request of the editable to be about the right size for @n_chars
    * characters.
    *
    * Note that it changes the size request, the size can still be affected by
    * how you pack the widget into containers. If @n_chars is -1, the size
    * reverts to the default size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWidthChars(n_chars: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_editable_set_width_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEditable]],
      n_chars
    )
  end setWidthChars

end Editable

object Editable:
  class Abstract(raw: Ptr[Byte]) extends Editable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Editable

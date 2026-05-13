package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleRange,
  Buildable,
  ConstraintTarget,
  Orientable,
  Widget
}
import sn.gnome.gtk4.internal.GtkProgressBar
import sn.gnome.pango.fluent.EllipsizeMode

/** `GtkProgressBar` is typically used to display the progress of a long running
  * operation.
  *
  * It provides a visual clue that processing is underway. `GtkProgressBar` can
  * be used in two different modes: percentage mode and activity mode.
  *
  * ![An example GtkProgressBar](progressbar.png)
  *
  * When an application can determine how much work needs to take place (e.g.
  * read a fixed number of bytes from a file) and can monitor its progress, it
  * can use the `GtkProgressBar` in percentage mode and the user sees a growing
  * bar indicating the percentage of the work that has been completed. In this
  * mode, the application is required to call
  * [method@Gtk.ProgressBar.set_fraction] periodically to update the progress
  * bar.
  *
  * When an application has no accurate way of knowing the amount of work to do,
  * it can use the `GtkProgressBar` in activity mode, which shows activity by a
  * block moving back and forth within the progress area. In this mode, the
  * application is required to call [method@Gtk.ProgressBar.pulse] periodically
  * to update the progress bar.
  *
  * There is quite a bit of flexibility provided to control the appearance of
  * the `GtkProgressBar`. Functions are provided to control the orientation of
  * the bar, optional text can be displayed along with the bar, and the step
  * size used in activity mode can be set.
  *
  * # CSS nodes
  *
  * ```
  * progressbar[.osd]
  * ├── [text]
  * ╰── trough[.empty][.full]
  *     ╰── progress[.pulse]
  * ```
  *
  * `GtkProgressBar` has a main CSS node with name progressbar and subnodes with
  * names text and trough, of which the latter has a subnode named progress. The
  * text subnode is only present if text is shown. The progress subnode has the
  * style class .pulse when in activity mode. It gets the style classes .left,
  * .right, .top or .bottom added when the progress 'touches' the corresponding
  * end of the GtkProgressBar. The .osd class on the progressbar node is for use
  * in overlays like the one Epiphany has for page loading progress.
  *
  * # Accessibility
  *
  * `GtkProgressBar` uses the %GTK_ACCESSIBLE_ROLE_PROGRESS_BAR role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProgressBar private[gnome] (raw: Ptr[GtkProgressBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the ellipsizing position of the progress bar.
    *
    * See [method@Gtk.ProgressBar.set_ellipsize].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEllipsize(): EllipsizeMode /* None */ =
    EllipsizeMode.fromRaw(
      gtk_progress_bar_get_ellipsize(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]]
      )
    )
  end getEllipsize

  /** Returns the current fraction of the task that’s been completed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFraction(): Double /* None */ =
    gtk_progress_bar_get_fraction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]]
    )
  end getFraction

  /** Returns whether the progress bar is inverted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInverted(): Boolean /* None */ =
    gtk_progress_bar_get_inverted(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]]
    ).value.!=(0)
  end getInverted

  /** Retrieves the pulse step.
    *
    * See [method@Gtk.ProgressBar.set_pulse_step].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPulseStep(): Double /* None */ =
    gtk_progress_bar_get_pulse_step(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]]
    )
  end getPulseStep

  /** Returns whether the `GtkProgressBar` shows text.
    *
    * See [method@Gtk.ProgressBar.set_show_text].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowText(): Boolean /* None */ =
    gtk_progress_bar_get_show_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]]
    ).value.!=(0)
  end getShowText

  /** Retrieves the text that is displayed with the progress bar.
    *
    * The return value is a reference to the text, not a copy of it, so will
    * become invalid if you change the text in the progress bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText()(using Zone): String /* None */ =
    fromCString(
      gtk_progress_bar_get_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]]
      ).asInstanceOf
    )
  end getText

  /** Indicates that some progress has been made, but you don’t know how much.
    *
    * Causes the progress bar to enter “activity mode,” where a block bounces
    * back and forth. Each call to [method@Gtk.ProgressBar.pulse] causes the
    * block to move by a little bit (the amount of movement per pulse is
    * determined by [method@Gtk.ProgressBar.set_pulse_step]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pulse(): Unit /* None */ =
    gtk_progress_bar_pulse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]]
    )
  end pulse

  /** Sets the mode used to ellipsize the text.
    *
    * The text is ellipsized if there is not enough space to render the entire
    * string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEllipsize(
      mode: EllipsizeMode /* Some(_root_.sn.gnome.pango.internal.PangoEllipsizeMode) */
  ): Unit /* None */ =
    gtk_progress_bar_set_ellipsize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]],
      mode.raw
    )
  end setEllipsize

  /** Causes the progress bar to “fill in” the given fraction of the bar.
    *
    * The fraction should be between 0.0 and 1.0, inclusive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFraction(fraction: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_progress_bar_set_fraction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]],
      fraction
    )
  end setFraction

  /** Sets whether the progress bar is inverted.
    *
    * Progress bars normally grow from top to bottom or left to right. Inverted
    * progress bars grow in the opposite direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInverted(
      inverted: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_progress_bar_set_inverted(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]],
      gboolean(gint((if inverted == true then 1 else 0)))
    )
  end setInverted

  /** Sets the fraction of total progress bar length to move the bouncing block.
    *
    * The bouncing block is moved when [method@Gtk.ProgressBar.pulse] is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPulseStep(fraction: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_progress_bar_set_pulse_step(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]],
      fraction
    )
  end setPulseStep

  /** Sets whether the progress bar will show text next to the bar.
    *
    * The shown text is either the value of the [property@Gtk.ProgressBar:text]
    * property or, if that is %NULL, the [property@Gtk.ProgressBar:fraction]
    * value, as a percentage.
    *
    * To make a progress bar that is styled and sized suitably for containing
    * text (even if the actual text is blank), set
    * [property@Gtk.ProgressBar:show-text] to %TRUE and
    * [property@Gtk.ProgressBar:text] to the empty string (not %NULL).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowText(
      show_text: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_progress_bar_set_show_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]],
      gboolean(gint((if show_text == true then 1 else 0)))
    )
  end setShowText

  /** Causes the given @text to appear next to the progress bar.
    *
    * If @text is %NULL and [property@Gtk.ProgressBar:show-text] is %TRUE, the
    * current value of [property@Gtk.ProgressBar:fraction] will be displayed as
    * a percentage.
    *
    * If @text is non-%NULL and [property@Gtk.ProgressBar:show-text] is %TRUE,
    * the text will be displayed. In this case, it will not display the progress
    * percentage. If @text is the empty string, the progress bar will still be
    * styled and sized suitably for containing text, as long as
    * [property@Gtk.ProgressBar:show-text] is %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(
      text: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_progress_bar_set_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkProgressBar]],
      text.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setText

end ProgressBar

object ProgressBar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkProgressBar])(using Runtime) =
    summon[Runtime].getOrCreate[ProgressBar](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ProgressBar(ptr)
    )

  /** Creates a new `GtkProgressBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ProgressBar =
    val raw: Ptr[Byte] = gtk_progress_bar_new().asInstanceOf
    summon[Runtime].getOrCreate[ProgressBar](
      raw,
      r => ProgressBar.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ProgressBar

package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  RevealerTransitionType,
  Widget
}
import sn.gnome.gtk4.internal.GtkRevealer

/** A `GtkRevealer` animates the transition of its child from invisible to
  * visible.
  *
  * The style of transition can be controlled with
  * [method@Gtk.Revealer.set_transition_type].
  *
  * These animations respect the [property@Gtk.Settings:gtk-enable-animations]
  * setting.
  *
  * # CSS nodes
  *
  * `GtkRevealer` has a single CSS node with name revealer. When styling
  * `GtkRevealer` using CSS, remember that it only hides its contents, not
  * itself. That means applied margin, padding and borders will be visible even
  * when the [property@Gtk.Revealer:reveal-child] property is set to %FALSE.
  *
  * # Accessibility
  *
  * `GtkRevealer` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
  *
  * The child of `GtkRevealer`, if set, is always available in the accessibility
  * tree, regardless of the state of the revealer widget.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Revealer(raw: Ptr[GtkRevealer])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget of @revealer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_revealer_get_child(this.raw.asInstanceOf[Ptr[GtkRevealer]]).asInstanceOf
  )

  /** Returns whether the child is fully revealed.
    *
    * In other words, this returns whether the transition to the revealed state
    * is completed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildRevealed(): Boolean /* None */ = gtk_revealer_get_child_revealed(
    this.raw.asInstanceOf[Ptr[GtkRevealer]]
  ).value.!=(0)

  /** Returns whether the child is currently revealed.
    *
    * This function returns %TRUE as soon as the transition is to the revealed
    * state is started. To learn whether the child is fully revealed (ie the
    * transition is completed), use [method@Gtk.Revealer.get_child_revealed].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRevealChild(): Boolean /* None */ = gtk_revealer_get_reveal_child(
    this.raw.asInstanceOf[Ptr[GtkRevealer]]
  ).value.!=(0)

  /** Returns the amount of time (in milliseconds) that transitions will take.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransitionDuration(): UInt /* None */ =
    gtk_revealer_get_transition_duration(
      this.raw.asInstanceOf[Ptr[GtkRevealer]]
    ).value

  /** Gets the type of animation that will be used for transitions in @revealer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransitionType(): RevealerTransitionType /* None */ =
    RevealerTransitionType.fromRaw(
      gtk_revealer_get_transition_type(this.raw.asInstanceOf[Ptr[GtkRevealer]])
    )

  /** Sets the child widget of @revealer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_revealer_set_child(
    this.raw.asInstanceOf[Ptr[GtkRevealer]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Tells the `GtkRevealer` to reveal or conceal its child.
    *
    * The transition will be animated with the current transition type of @revealer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRevealChild(
      reveal_child: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_revealer_set_reveal_child(
    this.raw.asInstanceOf[Ptr[GtkRevealer]],
    gboolean(gint((if reveal_child == true then 1 else 0)))
  )

  /** Sets the duration that transitions will take.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransitionDuration(
      duration: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_revealer_set_transition_duration(
    this.raw.asInstanceOf[Ptr[GtkRevealer]],
    guint(duration)
  )

  /** Sets the type of animation that will be used for transitions in @revealer.
    *
    * Available types include various kinds of fades and slides.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransitionType(
      transition: RevealerTransitionType /* Some(GtkRevealerTransitionType) */
  ): Unit /* None */ = gtk_revealer_set_transition_type(
    this.raw.asInstanceOf[Ptr[GtkRevealer]],
    transition.raw
  )

end Revealer

object Revealer:
  /** Creates a new `GtkRevealer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Revealer =
    val raw: Ptr[Byte] = gtk_revealer_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Revealer](raw, r => new Revealer(r.asInstanceOf))
  end apply
end Revealer

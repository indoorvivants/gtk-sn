package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkExpander
import sn.gnome.runtime.*

/** `GtkExpander` allows the user to reveal its child by clicking on an expander
  * triangle.
  *
  * ![An example GtkExpander](expander.png)
  *
  * This is similar to the triangles used in a `GtkTreeView`.
  *
  * Normally you use an expander as you would use a frame; you create the child
  * widget and use [method@Gtk.Expander.set_child] to add it to the expander.
  * When the expander is toggled, it will take care of showing and hiding the
  * child automatically.
  *
  * # Special Usage
  *
  * There are situations in which you may prefer to show and hide the expanded
  * widget yourself, such as when you want to actually create the widget at
  * expansion time. In this case, create a `GtkExpander` but do not add a child
  * to it. The expander widget has an [property@Gtk.Expander:expanded] property
  * which can be used to monitor its expansion state. You should watch this
  * property with a signal connection as follows:
  *
  * ```c
  * static void
  * expander_callback (GObject    *object,
  *                    GParamSpec *param_spec,
  *                    gpointer    user_data)
  * {
  *   GtkExpander *expander;
  *
  *   expander = GTK_EXPANDER (object);
  *
  *   if (gtk_expander_get_expanded (expander))
  *     {
  *       // Show or create widgets
  *     }
  *   else
  *     {
  *       // Hide or destroy widgets
  *     }
  * }
  *
  * static void
  * create_expander (void)
  * {
  *   GtkWidget *expander = gtk_expander_new_with_mnemonic ("_More Options");
  *   g_signal_connect (expander, "notify::expanded",
  *                     G_CALLBACK (expander_callback), NULL);
  *
  *   // ...
  * }
  * ```
  *
  * # GtkExpander as GtkBuildable
  *
  * The `GtkExpander` implementation of the `GtkBuildable` interface supports
  * placing a child in the label position by specifying “label” as the “type”
  * attribute of a `<child>` element. A normal content child can be specified
  * without specifying a `<child>` type attribute.
  *
  * An example of a UI definition fragment with GtkExpander:
  *
  * ```xml
  * <object class="GtkExpander">
  *   <child type="label">
  *     <object class="GtkLabel" id="expander-label"/>
  *   </child>
  *   <child>
  *     <object class="GtkEntry" id="expander-content"/>
  *   </child>
  * </object>
  * ```
  *
  * # CSS nodes
  *
  * ```
  * expander-widget
  * ╰── box
  *     ├── title
  *     │   ├── expander
  *     │   ╰── <label widget>
  *     ╰── <child>
  * ```
  *
  * `GtkExpander` has a main node `expander-widget`, and subnode `box`
  * containing the title and child widget. The box subnode `title` contains node
  * `expander`, i.e. the expand/collapse arrow; then the label widget if any.
  * The arrow of an expander that is showing its child gets the `:checked`
  * pseudoclass set on it.
  *
  * # Accessibility
  *
  * `GtkExpander` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Expander(raw: Ptr[GtkExpander])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget of @expander.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_expander_get_child(this.raw.asInstanceOf[Ptr[GtkExpander]]).asInstanceOf
  )

  /** Queries a `GtkExpander` and returns its current state.
    *
    * Returns %TRUE if the child widget is revealed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpanded(): Boolean /* None */ = gtk_expander_get_expanded(
    this.raw.asInstanceOf[Ptr[GtkExpander]]
  ).value.!=(0)

  /** Fetches the text from a label widget.
    *
    * This is including any embedded underlines indicating mnemonics and Pango
    * markup, as set by [method@Gtk.Expander.set_label]. If the label text has
    * not been set the return value will be %NULL. This will be the case if you
    * create an empty button with gtk_button_new() to use as a container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_expander_get_label(this.raw.asInstanceOf[Ptr[GtkExpander]]).asInstanceOf
  )

  /** Retrieves the label widget for the frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabelWidget(): Widget /* None */ = new Widget(
    gtk_expander_get_label_widget(
      this.raw.asInstanceOf[Ptr[GtkExpander]]
    ).asInstanceOf
  )

  /** Returns whether the expander will resize the toplevel widget containing
    * the expander upon resizing and collapsing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResizeToplevel(): Boolean /* None */ =
    gtk_expander_get_resize_toplevel(
      this.raw.asInstanceOf[Ptr[GtkExpander]]
    ).value.!=(0)

  /** Returns whether the label’s text is interpreted as Pango markup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseMarkup(): Boolean /* None */ = gtk_expander_get_use_markup(
    this.raw.asInstanceOf[Ptr[GtkExpander]]
  ).value.!=(0)

  /** Returns whether an underline in the text indicates a mnemonic.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseUnderline(): Boolean /* None */ = gtk_expander_get_use_underline(
    this.raw.asInstanceOf[Ptr[GtkExpander]]
  ).value.!=(0)

  /** Sets the child widget of @expander.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_expander_set_child(
    this.raw.asInstanceOf[Ptr[GtkExpander]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets the state of the expander.
    *
    * Set to %TRUE, if you want the child widget to be revealed, and %FALSE if
    * you want the child widget to be hidden.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpanded(
      expanded: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_expander_set_expanded(
    this.raw.asInstanceOf[Ptr[GtkExpander]],
    gboolean(gint((if expanded == true then 1 else 0)))
  )

  /** Sets the text of the label of the expander to @label.
    *
    * This will also clear any previously set labels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_expander_set_label(
    this.raw.asInstanceOf[Ptr[GtkExpander]],
    label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Set the label widget for the expander.
    *
    * This is the widget that will appear embedded alongside the expander arrow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabelWidget(
      label_widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_expander_set_label_widget(
    this.raw.asInstanceOf[Ptr[GtkExpander]],
    label_widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether the expander will resize the toplevel widget containing the
    * expander upon resizing and collapsing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResizeToplevel(
      resize_toplevel: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_expander_set_resize_toplevel(
    this.raw.asInstanceOf[Ptr[GtkExpander]],
    gboolean(gint((if resize_toplevel == true then 1 else 0)))
  )

  /** Sets whether the text of the label contains Pango markup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseMarkup(
      use_markup: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_expander_set_use_markup(
    this.raw.asInstanceOf[Ptr[GtkExpander]],
    gboolean(gint((if use_markup == true then 1 else 0)))
  )

  /** If true, an underline in the text indicates a mnemonic.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseUnderline(
      use_underline: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_expander_set_use_underline(
    this.raw.asInstanceOf[Ptr[GtkExpander]],
    gboolean(gint((if use_underline == true then 1 else 0)))
  )

  /** Activates the `GtkExpander`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkExpander],
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

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Expander

object Expander:
  /** Creates a new expander using @label as the text of the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Expander = new Expander(
    gtk_expander_new(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** Creates a new expander using @label as the text of the label.
    *
    * If characters in @label are preceded by an underscore, they are
    * underlined. If you need a literal underscore character in a label, use
    * “__” (two underscores). The first underlined character represents a
    * keyboard accelerator called a mnemonic.
    *
    * Pressing Alt and that key activates the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withMnemonic(
      label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Expander = new Expander(
    gtk_expander_new_with_mnemonic(
      label
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Expander

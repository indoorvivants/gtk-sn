package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkDebugFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags to use with gtk_set_debug_flags().
  *
  * Settings these flags causes GTK to print out different types of debugging
  * information. Some of these flags are only available when GTK has been
  * configured with `-Ddebug=true`.
  */
class DebugFlags private (val raw: GtkDebugFlags):
  def is(kv: DebugFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DebugFlags.KnownValue]
    DebugFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DebugFlags(${sb.result().mkString(", ")})"
end DebugFlags

object DebugFlags:
  export KnownValue.*

  def fromRaw(raw: GtkDebugFlags) = new DebugFlags(raw)

  extension (af: DebugFlags)
    def &(other: DebugFlags) =
      DebugFlags(af.raw & other.raw)
    def |(other: DebugFlags) =
      DebugFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags to use with gtk_set_debug_flags().
    *
    * Settings these flags causes GTK to print out different types of debugging
    * information. Some of these flags are only available when GTK has been
    * configured with `-Ddebug=true`.
    */
  enum KnownValue(override val raw: GtkDebugFlags, name: String)
      extends DebugFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about GtkTextView
      */
    case TEXT extends KnownValue(GtkDebugFlags.GTK_DEBUG_TEXT, "TEXT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about GtkTreeView
      */
    case TREE extends KnownValue(GtkDebugFlags.GTK_DEBUG_TREE, "TREE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about keyboard shortcuts
      */
    case KEYBINDINGS
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_KEYBINDINGS, "KEYBINDINGS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about modules and extensions
      */
    case MODULES extends KnownValue(GtkDebugFlags.GTK_DEBUG_MODULES, "MODULES")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about size allocation
      */
    case GEOMETRY
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_GEOMETRY, "GEOMETRY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about icon themes
      */
    case ICONTHEME
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_ICONTHEME, "ICONTHEME")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about printing
      */
    case PRINTING
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_PRINTING, "PRINTING")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Trace GtkBuilder operation
      */
    case BUILDER extends KnownValue(GtkDebugFlags.GTK_DEBUG_BUILDER, "BUILDER")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about size requests
      */
    case SIZE_REQUEST
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_SIZE_REQUEST, "SIZE_REQUEST")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Disable the style property cache
      */
    case NO_CSS_CACHE
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_NO_CSS_CACHE, "NO_CSS_CACHE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Open the GTK inspector
      */
    case INTERACTIVE
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_INTERACTIVE, "INTERACTIVE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about actions and menu models
      */
    case ACTIONS extends KnownValue(GtkDebugFlags.GTK_DEBUG_ACTIONS, "ACTIONS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information from layout managers
      */
    case LAYOUT extends KnownValue(GtkDebugFlags.GTK_DEBUG_LAYOUT, "LAYOUT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Include debug render nodes in the generated snapshots
      */
    case SNAPSHOT
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_SNAPSHOT, "SNAPSHOT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information from the constraints solver
      */
    case CONSTRAINTS
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_CONSTRAINTS, "CONSTRAINTS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Log unused GtkBuilder objects
      */
    case BUILDER_OBJECTS
        extends KnownValue(
          GtkDebugFlags.GTK_DEBUG_BUILDER_OBJECTS,
          "BUILDER_OBJECTS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about accessibility state changes
      */
    case A11Y extends KnownValue(GtkDebugFlags.GTK_DEBUG_A11Y, "A11Y")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Information about icon fallback. Since: 4.2
      */
    case ICONFALLBACK
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_ICONFALLBACK, "ICONFALLBACK")
    case INVERT_TEXT_DIR
        extends KnownValue(
          GtkDebugFlags.GTK_DEBUG_INVERT_TEXT_DIR,
          "INVERT_TEXT_DIR"
        )
  end KnownValue
end DebugFlags

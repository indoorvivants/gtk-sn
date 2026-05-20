package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkDebugFlags

/** Flags to use with gtk_set_debug_flags().
  *
  * Settings these flags causes GTK to print out different types of debugging
  * information. Some of these flags are only available when GTK has been
  * configured with `-Ddebug=true`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DebugFlags private (val raw: GtkDebugFlags):
  def is(kv: DebugFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DebugFlags.KnownValue]
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

  /** Flags to use with gtk_set_debug_flags().
    *
    * Settings these flags causes GTK to print out different types of debugging
    * information. Some of these flags are only available when GTK has been
    * configured with `-Ddebug=true`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkDebugFlags, name: scala.Predef.String)
      extends DebugFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** Information about GtkTextView
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TEXT extends KnownValue(GtkDebugFlags.GTK_DEBUG_TEXT, "TEXT")

    /** Information about GtkTreeView
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TREE extends KnownValue(GtkDebugFlags.GTK_DEBUG_TREE, "TREE")

    /** Information about keyboard shortcuts
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case KEYBINDINGS
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_KEYBINDINGS, "KEYBINDINGS")

    /** Information about modules and extensions
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MODULES extends KnownValue(GtkDebugFlags.GTK_DEBUG_MODULES, "MODULES")

    /** Information about size allocation
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case GEOMETRY
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_GEOMETRY, "GEOMETRY")

    /** Information about icon themes
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ICONTHEME
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_ICONTHEME, "ICONTHEME")

    /** Information about printing
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRINTING
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_PRINTING, "PRINTING")

    /** Trace GtkBuilder operation
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BUILDER extends KnownValue(GtkDebugFlags.GTK_DEBUG_BUILDER, "BUILDER")

    /** Information about size requests
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SIZE_REQUEST
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_SIZE_REQUEST, "SIZE_REQUEST")

    /** Disable the style property cache
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_CSS_CACHE
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_NO_CSS_CACHE, "NO_CSS_CACHE")

    /** Open the GTK inspector
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INTERACTIVE
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_INTERACTIVE, "INTERACTIVE")

    /** Information about actions and menu models
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ACTIONS extends KnownValue(GtkDebugFlags.GTK_DEBUG_ACTIONS, "ACTIONS")

    /** Information from layout managers
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LAYOUT extends KnownValue(GtkDebugFlags.GTK_DEBUG_LAYOUT, "LAYOUT")

    /** Include debug render nodes in the generated snapshots
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SNAPSHOT
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_SNAPSHOT, "SNAPSHOT")

    /** Information from the constraints solver
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONSTRAINTS
        extends KnownValue(GtkDebugFlags.GTK_DEBUG_CONSTRAINTS, "CONSTRAINTS")

    /** Log unused GtkBuilder objects
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BUILDER_OBJECTS
        extends KnownValue(
          GtkDebugFlags.GTK_DEBUG_BUILDER_OBJECTS,
          "BUILDER_OBJECTS"
        )

    /** Information about accessibility state changes
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case A11Y extends KnownValue(GtkDebugFlags.GTK_DEBUG_A11Y, "A11Y")

    /** Information about icon fallback. Since: 4.2
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
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

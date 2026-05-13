import sn.gnome.gio.internal.*
import sn.gnome.glib.internal.*
import sn.gnome.gtk4.internal.*
import scalanative.unsafe.*

class RawGtk:
  def run() =
    gtk_init()

    import Extensions.*

    val callback = CFuncPtr2.fromScalaFunction {
      (application: Ptr[GtkApplication], data: gpointer) =>
        val window = gtk_application_window_new(application)

        gtk_window_set_title(
          window.asInstanceOf[Ptr[GtkWindow]],
          c"Hello from Scala Native 0.5"
        )
        gtk_window_set_default_size(
          window.asInstanceOf[Ptr[GtkWindow]],
          200,
          200
        )

        val box = gtk_box_new(GtkOrientation.GTK_ORIENTATION_VERTICAL, 0)
        gtk_widget_set_halign(box, GtkAlign.GTK_ALIGN_CENTER)
        gtk_widget_set_valign(box, GtkAlign.GTK_ALIGN_CENTER)

        gtk_window_set_child(window.asInstanceOf[Ptr[GtkWindow]], box)

        val button = gtk_button_new_with_label(c"Press me")

        val printHello = CFuncPtr2.fromScalaFunction {
          (widget: Ptr[GtkWidget], data: gpointer) =>
            g_print(
              c"Click! I come from the 0.5 version of Gtk examples\n".asGString
            )
        }

        g_signal_connect(button, c"clicked", printHello)

        gtk_box_append(box.asInstanceOf[Ptr[GtkBox]], button)

        gtk_widget_show(window)
    }

    val app = gtk_application_new(
      c"org.gtk.example",
      GApplicationFlags.G_APPLICATION_FLAGS_NONE
    )

    g_signal_connect(
      app,
      c"activate",
      callback
    )

    g_application_run(app.asPtr[GApplication], 0, null)
  end run
end RawGtk

private object Extensions:
  import scalanative.unsafe.*
  import sn.gnome.gobject.internal.*
  import sn.gnome.glib.internal.*
  import sn.gnome.gobject.internal.GConnectFlags
  import sn.gnome.gobject.internal.g_signal_connect_data

  extension [T <: CFuncPtr](inline ptr: T)
    inline def asGCallback: GCallback =
      GCallback(
        CFuncPtr.fromPtr[CFuncPtr0[Unit]](CFuncPtr.toPtr(ptr))
      )

  extension (cstr: CString)
    inline def asGString: Ptr[gchar] = cstr.asInstanceOf[Ptr[gchar]]

  extension [T](ptr: Ptr[T])
    inline def asGpointer: gpointer = gpointer(ptr.asInstanceOf[Ptr[Byte]])
    inline def asPtr[T1]: Ptr[T1] = ptr.asInstanceOf[Ptr[T1]]

  inline def g_signal_connect[A: Tag, T <: CFuncPtr](
      instance: Ptr[A],
      detailed_signal: CString,
      c_handler: T,
      data: Ptr[Byte] = null,
      flags: GConnectFlags = GConnectFlags.define(0L)
  ): gulong =
    g_signal_connect_data(
      instance.asGpointer,
      detailed_signal.asGString,
      c_handler.asGCallback,
      data.asGpointer,
      null.asInstanceOf[GClosureNotify],
      flags
    )
end Extensions

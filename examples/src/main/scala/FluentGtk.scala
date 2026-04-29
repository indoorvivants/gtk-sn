import sn.gnome.gtk4.fluent.*
import sn.gnome.gtk4.internal.*
import sn.gnome.gio.internal.*
import sn.gnome.gio.fluent.Application as GioApplication
import sn.gnome.glib.internal.*
import sn.gnome.gobject.internal.*

import scalanative.unsafe.*

class FluentGtk:
  def run() =
    gtk_init()
    Zone:
      val app = Application(
        "hello.scala.native",
        GApplicationFlags.G_APPLICATION_FLAGS_NONE
      )

      app.connectSignal("activate"): app =>
        val window = ApplicationWindow(app)
        window.setTitle("Hello from Scala Native")
        window.setDefaultSize(640, 480)

        val box = Box(GtkOrientation.GTK_ORIENTATION_VERTICAL, 10)
        box.setHalign(GtkAlign.GTK_ALIGN_CENTER)
        box.setValign(GtkAlign.GTK_ALIGN_CENTER)

        window.setChild(box)

        val button = Button.withLabel("Press me ya coward")
        button.connectSignal("clicked"): button =>
          println("Clicked!")
        box.append(button)

        window.show()

      app.run(0, Array.empty)
  end run
end FluentGtk

@main def hello =
  val gtk = FluentGtk()
  gtk.run()

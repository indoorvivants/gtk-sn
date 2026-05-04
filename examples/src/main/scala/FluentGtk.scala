import sn.gnome.gtk4.fluent.*
import sn.gnome.gobject.runtime.*

import scalanative.unsafe.*
import scalanative.unsigned.*
import sn.gnome.gio.fluent.ApplicationFlags

class FluentGtk(using Runtime, Zone):
  def run() =
    Gtk.init()
    val app = Application(
      Some("hello.scala.native"),
      ApplicationFlags.FLAGS_NONE
    )

    app.onSignal("activate"):
      val window = ApplicationWindow(app)
      window.setTitle(Some("Hello from Scala Native"))
      window.setDefaultSize(640, 480)
      val styleContext = window.getStyleContext()

      styleContext.addClass("my-window")

      val provider = CssProvider()
      provider.loadFromString(".my-window { background-color: maroon; }")
      styleContext.addProvider(
        provider,
        600.toUInt
      )

      val box = Box(Orientation.VERTICAL, 10)
      box.setHalign(Align.CENTER)
      box.setValign(Align.CENTER)

      window.setChild(Some(box))

      val button = Button.withLabel("Press me ya coward")
      button.onSignal("clicked"):
        println("Clicked!")
      box.append(button)

      val textView = TextView()
      val buffer = textView.getBuffer()
      buffer.setText("Hello from Scala Native", -1)

      val scroll = ScrolledWindow()
      scroll.setVexpand(true)
      scroll.setChild(Some(textView))
      box.append(scroll)

      window.show()

    app.run(0, None)
  end run
end FluentGtk

@main def hello =
  Zone:
    Runtime.use:
      val gtk = FluentGtk()
      gtk.run()

import sn.gnome.gtk4.*
import sn.gnome.gobject.runtime.*

import scalanative.unsafe.*
import scalanative.unsigned.*
import sn.gnome.gio.ApplicationFlags

object FluentGtk extends Runtime.App:
  def run(args: List[String])(using Runtime, Zone) =
    Gtk.init()
    val app = Application(
      Some("hello.scala.native"),
      ApplicationFlags.FLAGS_NONE
    )

    app.onActivate:
      val window = ApplicationWindow(app)
      window.setTitle(Some("Hello from Scala Native"))
      window.setDefaultSize(640, 480)
      val styleContext = window.getStyleContext()

      styleContext.addClass("my-window")

      val provider = CssProvider()
      provider.loadFromString(".my-window { background-color: lightgray; }")
      styleContext.addProvider(
        provider,
        600.toUInt
      )

      val box = Box(Orientation.VERTICAL, 10)
      box.setHalign(Align.CENTER)
      box.setValign(Align.CENTER)

      window.setChild(Some(box))

      val button = Button.withLabel("Press me ya coward")
      box.append(button)

      val textView = TextView()
      val buffer = textView.getBuffer()
      buffer.setText("Hello from Scala Native", -1)

      val scroll = ScrolledWindow()
      scroll.setVexpand(true)
      scroll.setChild(Some(textView))
      box.append(scroll)

      val spinner = Spinner()
      spinner.start()
      box.append(spinner)

      var progress = 0.0

      val progressBar = ProgressBar()
      progressBar.setText(Some("Loading awesomeness..."))
      progressBar.setShowText(true)
      progressBar.setFraction(progress)
      box.append(progressBar)

      button.onClicked:
        println("Clicked!")
        progress += 0.05
        progress = math.min(1.0, progress)
        progressBar.setFraction(progress)

      window.show()
      window.present()

    app.run(0, None)
  end run
end FluentGtk

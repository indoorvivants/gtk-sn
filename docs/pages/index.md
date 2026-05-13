---
title: Home
index: true
---

Welcome to the website of the *Gtk for Scala 3 Native* project.

We build and publish bindings for the [Gtk](https://www.gtk.org/) library to Scala 3 Native.

Both the raw bindings to C code are published, and the high-level object-oriented bindings.

This is a sample of a Gtk application using our toolkit:

```scala mdoc:compile-only
//> using platform native 
//> using scala 3.8
//> using dep com.indoorvivants.gnome::gtk4::latest.stable
 
import sn.gnome.gtk4.fluent.*
import sn.gnome.gobject.runtime.*
import sn.gnome.gio.fluent.ApplicationFlags

import scalanative.unsafe.*
import scalanative.unsigned.*

object FluentGtk extends Runtime.App:
  def run(args: List[String])(using Runtime, Zone) =
    // Initialize Gtk
    Gtk.init()
    // Create application
    val app = Application(Some("hello.scala.native"), ApplicationFlags.FLAGS_NONE)
    // When the application is launched...
    app.onActivate:
      // ... add a new window
      val window = ApplicationWindow(app)
      window.setTitle(Some("Hello from Scala Native"))
      window.setDefaultSize(640, 480)
      // add a button to the window
      val button = Button.withLabel("Press me!")
      window.setChild(Some(button))
      // do something when button is clicked
      button.onClicked:
        println("Clicked!")
      //show the window
      window.present()
    // run the application
    app.run(0, None)
```

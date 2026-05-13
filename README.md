# Gtk4 for Scala 3 Native

<!--toc:start-->
- [Gtk4 for Scala 3 Native](#gtk4-for-scala-3-native)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Contributing](#contributing)
<!--toc:end-->

## Installation

Make sure you have Gtk4 installed:

1. On MacOS, do `brew install gtk4`
2. On Debian-based Linux systems, you can do `sudo apt install libgtk-4-dev`

You can check the installation by running `pkg-config --cflags gtk4` - it should succeed.

The bindings are published to Maven central, with gtk4 specifically being available at the following coordinates:

[![Maven Central](https://img.shields.io/maven-central/v/com.indoorvivants.gnome/gtk4_native0.5_3.svg?label=Maven%20Central)](https://search.maven.org/artifact/com.indoorvivants.gnome/gtk4_native0.5_3/)

```
com.indoorvivants.gnome::gtk4::<version> // Scala CLI/Mill format
"com.indoorvivants.gnome" %%% "gtk4" % "<version>" // SBT format
```

## Usage

This repository contains a very small app you can run.

```bash
$ pkg-config --cflags gtk4 | xargs -n1 > compilationFlags
$ pkg-config --libs gtk4 | xargs -n1 > linkingFlags

$ scala-cli run ./examples/src/main/scala/example.scala --native --native-compile @$PWD/compilationFlags --native-linking @$PWD/linkingFlags --dep com.indoorvivants.gnome::gtk4::0.0.4 # or change the version to latest
```

Bindings generated using [sn-bindgen](https://sn-bindgen.indoorvivants.com/)

![GtkBindingsDemo](https://user-images.githubusercontent.com/1052965/217792578-a4faa191-053b-48a7-aa2a-207709690fa1.gif)


## Contributing

This section is under construction

- Regenerate raw bindings: `sbt generateRawBindings`
- Regenerate XSD schema for RNC: `sbt generateIntrospectionSchema`
  
  This will automatically re-download the [RNC specification from GNOME](https://gitlab.gnome.org/GNOME/gobject-introspection/-/blob/main/docs/gir-1.2.rnc)

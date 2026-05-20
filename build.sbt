import bindgen.interface.Binding
import bindgen.plugin.BindgenMode

inThisBuild(
  List(
    homepage := Some(
      url("https://github.com/indoorvivants/scala-native-gtk-bindings")
    ),
    startYear := Some(2023),
    licenses := List(
      "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")
    ),
    developers := List(
      Developer(
        "indoorvivants",
        "Anton Sviridov",
        "contact@indoorvivants.com",
        url("https://blog.indoorvivants.com")
      )
    ),
    crossScalaVersions := Nil
  )
)

organization := "com.indoorvivants.gnome"

val publishing = Seq(
  organization := "com.indoorvivants.gnome"
)

val noPublishing = Seq(
  publish / skip := true,
  publishLocal / skip := true
)

val Versions = new {
  val Scala3 = "3.8.3"
}

lazy val root = project
  .in(file("."))
  .aggregate(
    adwaita,
    gio,
    glib,
    gobject,
    cairo,
    examples,
    gdkpixbuf,
    graphene,
    gtk4,
    gdk4,
    gsk4,
    harfbuzz,
    pango,
    `gir-schema`,
    girepository,
    codegenTests,
    runtime
  )
  .enablePlugins(sbtdocker.DockerPlugin)
  .enablePlugins(ScalaUnidocPlugin)
  .settings(
    name := "scala-native-gtk",
    scalaVersion := Versions.Scala3,
    publish / skip := true,
    publishLocal / skip := true,
    ScalaUnidoc / unidoc / unidocProjectFilter := inAnyProject -- inProjects(
      `fluent-generator`,
      girepository,
      `gir-schema`,
      examples
    ),
    pushRemoteCacheTo := Some(
      MavenCache(
        "local-cache",
        (ThisBuild / baseDirectory).value / ".remote-cache"
      )
    ),
    docker / dockerfile := NativeDockerfile(
      (ThisBuild / baseDirectory).value / "Dockerfile"
    ),
    docker / imageNames := Seq(ImageName("scala-native-gtk/generator:latest")),
    generateTargetTypes := Def.inputTaskDyn {
      val out =
        (`fluent-generator` / Compile / resourceDirectory).value / "target-types.json"

      import sys.process.*
      import complete.DefaultParsers.*
      val args: Set[String] = spaceDelimited("<arg>").parsed.toSet

      val filter = (s: String) => if (args.isEmpty) true else args.contains(s)

      val modules = Seq(
        (adwaita / Compile / sourceDirectory).value -> "adwaita",
        (gtk4 / Compile / sourceDirectory).value -> "gtk4",
        (gdk4 / Compile / sourceDirectory).value -> "gdk4",
        (gsk4 / Compile / sourceDirectory).value -> "gsk4",
        (gobject / Compile / sourceDirectory).value -> "gobject",
        (gio / Compile / sourceDirectory).value -> "gio",
        (glib / Compile / sourceDirectory).value -> "glib",
        (cairo / Compile / sourceDirectory).value -> "cairo",
        (pango / Compile / sourceDirectory).value -> "pango",
        (harfbuzz / Compile / sourceDirectory).value -> "harfbuzz",
        (gdkpixbuf / Compile / sourceDirectory).value -> "gdkpixbuf"
      ).filter { case (_, name) => filter(name) }
        .flatMap { case (path, pkg) =>
          val funcsPath =
            path / "scala" / "generated" / s"sn.gnome.$pkg.internal" / "functions.scala"
          val structsPath =
            path / "scala" / "generated" / s"sn.gnome.$pkg.internal" / "structs"

          Seq(
            "--functions",
            funcsPath.toString,
            "--structs",
            structsPath.toString
          )
        }

      Def.sequential(Def.taskDyn {
        (`fluent-generator` / Compile / run)
          .toTask(
            s" target-types --out $out ${modules.mkString(" ")}"
          )
      })
    }.evaluated,
    generateRawBindings := Def.inputTask {
      import sys.process.*
      import complete.DefaultParsers.*
      val args: Seq[String] = spaceDelimited("<arg>").parsed
      val env =
        args.headOption.map(r => s"-e PROJECT_TO_GENERATE=${r} ").getOrElse(" ")

      val imageId = docker.value
      val cwd = (ThisBuild / baseDirectory).value
      val cmd =
        s"""docker run $env --rm -v $cwd:/source/tmp $imageId""".!!
    }.evaluated,
    generateIntrospectionSchema := {
      val rncURL =
        "https://gitlab.gnome.org/GNOME/gobject-introspection/-/raw/main/docs/gir-1.2.rnc"

      val destination =
        (`gir-schema` / baseDirectory).value / "src/main/relaxng" / "gir.rnc"

      sLog.value.info(s"Downloading ${rncURL} into $destination")

      import sbt.io.*
      Using.urlInputStream(new java.net.URI(rncURL).toURL) { inputStream =>
        IO.transfer(inputStream, destination)
      }

      (`gir-schema` / Compile / generateXsd).value
    },
    generateReport := {
      val allTargets =
        target.all(ScopeFilter(inAnyProject, inConfigurations(Compile))).value
      val filesToMerge = allTargets.flatMap { path =>
        val f = path / "fluent-generator" / "report.md"

        val t = (ThisBuild / baseDirectory).value.toPath.relativize(f.toPath)

        if (f.exists()) {
          Some(t -> f)
        } else None
      }

      val destination =
        (docs / baseDirectory).value / "pages" / "generated-report.md"

      IO.delete(destination)

      IO.append(
        destination,
        """
      |---
      |title: Generator report
      |index: 10
      |---
      |
      |This report is generated automatically from all the supported namespaces.
      |It shows the current state of supported definitions.
      |
      """.trim.stripMargin
      )

      filesToMerge.sortBy(_._1).map(_._2).foreach { f =>
        IO.append(destination, IO.readBytes(f))
      }
    }
  )

lazy val examples = project
  .in(file("examples"))
  .dependsOn(gtk4)
  .configure(pkgConfigured("gtk4"))
  .settings(publish / skip := true, publishLocal / skip := true)

lazy val adwaita = project
  .in(file("adwaita"))
  .dependsOn(gtk4)
  .configure(pkgConfigured("libadwaita-1"))
  .settings(
    bindgenBindings +=
      buildWithDependencies(
        "gdkpixbuf",
        "gio",
        "glib",
        "gobject",
        "graphene",
        "gtk4",
        "gdk4",
        "cairo",
        "harfbuzz",
        "pango"
      ) {
        val headerPath = findHeader("libadwaita-1", _ / "adwaita.h")
        Binding(headerPath, bindingPackage("adwaita"))
          .withClangFlags(
            pkgConfig("libadwaita-1", "cflags") :+ "-fsigned-char"
          )
          .addCImport("adwaita.h")
          .withMultiFile(true)
          // .withOpaqueStructs(Set("AdwDialogClass"))
          .addExcludedSystemPath(headerPath.toPath().getParent())
      }
      // girModuleName := "adw-1",
      // withFluentBindings
  )

lazy val gio = project
  .in(file("gio"))
  .dependsOn(glib, gobject)
  .configure(pkgConfigured("gio-2.0"))
  .settings(
    bindgenBindings +=
      buildWithDependencies("glib", "gobject") {
        val headerPath = findHeader("gio-2.0", _ / "gio" / "gio.h")
        Binding(
          headerPath,
          bindingPackage("gio")
        )
          .withClangFlags(pkgConfig("gio-2.0", "cflags") :+ "-fsigned-char")
          .addCImport("gio.h")
          .withOpaqueStructs(Set("G*"))
          // .withNoLocation(true)
          .addExcludedSystemPath(headerPath.toPath.getParent())
          .withMultiFile(true)

      },
    girModuleName := "gio-2.0",
    withFluentBindings
  )

lazy val glib = project
  .in(file("glib"))
  .dependsOn(runtime)
  .configure(pkgConfigured("glib-2.0"))
  .settings(
    bindgenBindings += {
      val headerPath = findHeader("glib-2.0", _ / "glib.h")
      Binding(headerPath, bindingPackage("glib"))
        .withClangFlags(pkgConfig("glib-2.0", "cflags") :+ "-fsigned-char")
        .addCImport("glib.h")
        // .withNoLocation(true)
        .withMultiFile(true)
        .addExcludedSystemPath(headerPath.toPath().getParent())
    },
    girModuleName := "glib-2.0",
    withFluentBindings
  )

lazy val runtime = project
  .in(file("runtime"))
  .configure(pkgConfiguredSimple)

lazy val compilationFlags =
  taskKey[Unit]("Generate compilation flags at the root of the project")

lazy val codegenTests = project
  .in(file("codegen-tests"))
  .dependsOn(gobject)
  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
  .settings(
    noPublishing,
    libraryDependencies += "org.scalameta" %%% "munit" % "1.3.0",
    scalaVersion := Versions.Scala3,
    bindgenMode := BindgenMode.Manual(
      scalaDir = sourceDirectory.value / "main" / "scala" / "generated",
      cDir = (Compile / resourceDirectory).value / "scala-native" / "generated"
    ),
    nativeConfig ~= { (_).withCOptions(_ :+ "-std=c11") },
    nativeConfig ~= { config =>
      config
        .withCompileOptions(_ ++ pkgConfig("gobject-2.0", "cflags"))
        .withLinkingOptions(_ ++ pkgConfig("gobject-2.0", "libs"))
    }
  )
  .settings(
    compilationFlags := {
      val flags = (Compile / nativeConfig).value.compileOptions

      val destination = (baseDirectory).value

      IO.write(destination / "compile_flags.txt", flags.mkString("\n"))
    }
  )
  .settings(
    bindgenBindings += {
      val headerPath =
        (Compile / resourceDirectory).value / "scala-native" / "lib.h"
      buildWithDependencies("glib") {
        Binding(headerPath, "sn.gnome.codegentests.internal")
          .withClangFlags(pkgConfig("glib-2.0", "cflags") :+ "-fsigned-char")
          .withMultiFile(true)
          .withNoLocation(true)
          .addExcludedSystemPath(headerPath.toPath().getParent())
      }
    },
    generateTestTargetTypes := Def.inputTaskDyn {
      val out =
        (Compile / resourceDirectory).value / "target-types.json"

      val modules = Seq(
        (Compile / sourceDirectory).value -> "codegentests"
      ).flatMap { case (path, pkg) =>
        Seq(
          "--functions",
          (path / "scala" / "generated" / s"sn.gnome.$pkg.internal" / "functions.scala").toString
        )
      }

      Def.sequential(Def.taskDyn {
        (`fluent-generator` / Compile / run)
          .toTask(
            s" target-types --out $out ${modules.mkString(" ")}"
          )
      })
    }.evaluated,
    generateFluentBindings / fileInputs += ((Compile / resourceDirectory).value / "gir").toGlob / "*.gir",
    generateFluentBindings / fileInputs += ((Compile / resourceDirectory).value / "scala-native").toGlob / "*.c",
    generateFluentBindings / fileInputs += ((Compile / resourceDirectory).value / "scala-native").toGlob / "*.h",
    generateFluentBindings :=
      Def.inputTaskDyn {

        (Compile / generateFluentBindings / changedInputFiles).value

        (Compile / generateTestTargetTypes).toTask("").value

        val girModule = "Test-1.0"
        val girFiles = (Compile / resourceDirectory).value / "gir"
        val out =
          (Compile / sourceDirectory).value / "scala" / "generated" / "fluent"

        val generatedFiles =
          (Compile / target).value / "fluent-generator" / "files.txt"

        val targetTypes =
          (Compile / resourceDirectory).value / "target-types.json"

        val task = InputKey[Unit]("scalafmtOnly")

        Def.sequential(
          Def
            .taskDyn {
              (`fluent-generator` / Compile / run)
                .toTask(
                  s" fluent --module $girModule --gir-files $girFiles --out $out --dump-files-list $generatedFiles --target-types $targetTypes"
                )
            },
          Def.taskDyn {
            val files = IO.readLines(generatedFiles)
            (Compile / task).toTask(s" ${files.mkString(" ")}")
          }
        )

      }.evaluated
  )

lazy val gtk4 = project
  .in(file("gtk4"))
  .dependsOn(
    gdk4,
    gsk4,
    glib,
    gio,
    gobject,
    cairo,
    harfbuzz,
    graphene,
    pango,
    gdkpixbuf
  )
  .configure(pkgConfigured("gtk4"))
  .settings(
    bindgenBindings +=
      buildWithDependencies(
        "gdkpixbuf",
        "gio",
        "glib",
        "gobject",
        "cairo",
        "harfbuzz",
        "gdkpixbuf",
        "graphene",
        "pango",
        "gdk4",
        "gsk4"
      ) {
        val headerPath = findHeader("gtk4", _ / "gtk" / "gtk.h")
        Binding(
          headerPath,
          bindingPackage("gtk4")
        )
          .withClangFlags(pkgConfig("gtk4", "cflags") :+ "-fsigned-char")
          .addCImport("graphene.h")
          .withNoLocation(true)
          .withMultiFile(true)
          .addExcludedSystemPath(headerPath.toPath.getParent())
      },
    girModuleName := "gtk-4.0",
    withFluentBindings
  )

lazy val gdk4 = project
  .in(file("gdk4"))
  .dependsOn(glib, gio, gobject, cairo, harfbuzz, graphene, pango, gdkpixbuf)
  .configure(pkgConfigured("gtk4"))
  .settings(
    bindgenBindings +=
      buildWithDependencies(
        "gdkpixbuf",
        "gio",
        "glib",
        "gobject",
        "cairo",
        "harfbuzz",
        "gdkpixbuf",
        "graphene",
        "pango"
      ) {
        val headerPath = findHeader("gtk4", _ / "gdk" / "gdk.h")
        Binding(
          headerPath,
          bindingPackage("gdk4")
        )
          .withClangFlags(pkgConfig("gtk4", "cflags") :+ "-fsigned-char")
          // .addCImport("graphene.h")
          .withNoLocation(true)
          .withMultiFile(true)
          .addExcludedSystemPath(headerPath.toPath.getParent())
      },
    girModuleName := "gdk-4.0",
    withFluentBindings
  )

lazy val gsk4 = project
  .in(file("gsk4"))
  .dependsOn(gdk4, graphene)
  .configure(pkgConfigured("gtk4"))
  .settings(
    bindgenBindings +=
      buildWithDependencies(
        "gdk4",
        "gdkpixbuf",
        "gio",
        "glib",
        "gobject",
        "cairo",
        "harfbuzz",
        "gdkpixbuf",
        "graphene",
        "pango"
      ) {
        val headerPath = findHeader("gtk4", _ / "gsk" / "gsk.h")
        Binding(
          headerPath,
          bindingPackage("gsk4")
        )
          .withClangFlags(pkgConfig("gtk4", "cflags") :+ "-fsigned-char")
          // .addCImport("graphene.h")
          .withNoLocation(true)
          .withMultiFile(true)
          .addExcludedSystemPath(headerPath.toPath.getParent())
      },
    girModuleName := "gsk-4.0",
    withFluentBindings
  )

lazy val gobject =
  project
    .in(file("gobject"))
    .dependsOn(glib)
    .configure(pkgConfigured("gobject-2.0"))
    .settings(
      libraryDependencies += "org.scalameta" %%% "munit" % "1.3.0",
      bindgenBindings +=
        buildWithDependencies("glib", "gio") {
          val headerPath = findHeader("gobject-2.0", _ / "glib-object.h")
          Binding(
            headerPath,
            bindingPackage("gobject")
          )
            .withClangFlags(
              pkgConfig("gobject-2.0", "cflags") :+ "-fsigned-char"
            )
            .addCImport("glib-object.h")
            .withNoLocation(true)
            .withMultiFile(true)
            .addExcludedSystemPath(headerPath.toPath.getParent())
        },
      girModuleName := "gobject-2.0",
      withFluentBindings
    )
    .settings(
      compilationFlags := {
        val flags = (Compile / nativeConfig).value.compileOptions

        val destination = (baseDirectory).value

        IO.write(destination / "compile_flags.txt", flags.mkString("\n"))
      }
    )

lazy val pango =
  project
    .in(file("pango"))
    .dependsOn(glib, cairo, gobject, harfbuzz, gio)
    .configure(pkgConfigured("pango"))
    .settings(
      bindgenBindings +=
        buildWithDependencies("gio", "glib", "cairo", "gobject", "harfbuzz") {
          val headerPath = findHeader("pango", _ / "pango" / "pango.h")
          Binding(
            headerPath,
            bindingPackage("pango")
          )
            .withClangFlags(pkgConfig("pango", "cflags") :+ "-fsigned-char")
            .addCImport("pango.h")
            .withNoLocation(true)
            .withMultiFile(true)
            .addExcludedSystemPath(headerPath.toPath.getParent())
        },
      girModuleName := "pango-1.0",
      withFluentBindings
    )

lazy val gdkpixbuf =
  project
    .in(file("gdkpixbuf"))
    .dependsOn(glib, cairo, gobject, gio)
    .configure(pkgConfigured("gdk-pixbuf-2.0"))
    .settings(
      bindgenBindings +=
        buildWithDependencies("glib", "gobject", "gio", "cairo") {
          val headerPath =
            findHeader("gdk-pixbuf-2.0", _ / "gdk-pixbuf" / "gdk-pixbuf.h")
          Binding(
            headerPath,
            bindingPackage("gdkpixbuf")
          )
            .withClangFlags(
              pkgConfig("gdk-pixbuf-2.0", "cflags") :+ "-fsigned-char"
            )
            // .withNoLocation(true)
            .withMultiFile(true)
            .addExcludedSystemPath(headerPath.toPath.getParent())
        },
      girModuleName := "gdkpixbuf-2.0",
      withFluentBindings
    )

lazy val cairo =
  project
    .in(file("cairo"))
    .dependsOn(glib)
    .configure(pkgConfigured("cairo"))
    .settings(
      bindgenBindings += {
        val headerPath = findHeader("cairo", _ / "cairo.h")
        Binding(headerPath, bindingPackage("cairo"))
          .withClangFlags(pkgConfig("cairo", "cflags") :+ "-fsigned-char")
          .addCImport("cairo.h")
          // .withNoLocation(true)
          .withMultiFile(true)
          .addExcludedSystemPath(headerPath.toPath.getParent())
      },
      girModuleName := "cairo-1.0",
      withFluentBindings
    )

lazy val graphene =
  project
    .in(file("graphene"))
    .dependsOn(glib)
    .configure(pkgConfigured("graphene-1.0"))
    .settings(
      bindgenBindings += {
        val headerPath = findHeader("graphene-1.0", _ / "graphene.h")

        Binding(
          headerPath,
          bindingPackage("graphene")
        ).withClangFlags(pkgConfig("graphene-1.0", "cflags") :+ "-fsigned-char")
          .addCImport("graphene.h")
          .addClangFlag(
            List("-Dsse2=false", "-Darm_neon=false", "-Dgcc_vector=false")
          )
          .addExternalName("graphene_simd4f_get", "<nopackage>")
          // .withNoLocation(true)
          .withMultiFile(true)
          .addExcludedSystemPath(headerPath.toPath.getParent())
      }
    )

lazy val girepository =
  project
    .in(file("girepository"))
    .dependsOn(gobject)
    .configure(pkgConfigured("gobject-introspection-1.0"))
    .settings(
      bindgenBindings +=
        buildWithDependencies("glib", "gobject") {
          Binding(
            findHeader("gobject-introspection-1.0", _ / "girepository.h"),
            "girepository"
          )
            .withClangFlags(
              pkgConfig(
                "gobject-introspection-1.0",
                "cflags"
              ) :+ "-fsigned-char"
            )
            .addCImport("girepository.h")
            .withNoLocation(true)
            .withMultiFile(true)
        }
    )

lazy val harfbuzz =
  project
    .in(file("harfbuzz"))
    .dependsOn(glib)
    .configure(pkgConfigured("harfbuzz"))
    .settings(
      bindgenBindings += {
        val headerPath = findHeader("harfbuzz", _ / "hb.h")
        Binding(
          headerPath,
          bindingPackage("harfbuzz")
        )
          .withClangFlags(pkgConfig("harfbuzz", "cflags") :+ "-fsigned-char")
          .addCImport("hb.h")
          .withNoLocation(true)
          .withMultiFile(true)
          .addExcludedSystemPath(headerPath.toPath.getParent())
      },
      girModuleName := "harfbuzz-0.0",
      withFluentBindings
    )

def generateXsd(
    fileName: String,
    sourceDirectoryValue: File,
    targetDirectoryValue: File
): Unit = {
  import com.thaiopensource.relaxng.input.parse.compact.CompactParseInputFormat
  import com.thaiopensource.relaxng.output.LocalOutputDirectory
  import com.thaiopensource.relaxng.output.xsd.XsdOutputFormat
  import com.thaiopensource.util.UriOrFile
  import com.thaiopensource.xml.sax.ErrorHandlerImpl

  val inputFormat = new CompactParseInputFormat()
  val outputFormat = new XsdOutputFormat()
  val inputFile = sourceDirectoryValue / "relaxng" / s"$fileName.rnc"
  val eh = new ErrorHandlerImpl()
  val params = Array[String]()
  val sc = inputFormat.load(
    UriOrFile.toUri(inputFile.toString),
    params,
    "xsd",
    eh,
    null
  )
  val resultDir = targetDirectoryValue / "xsd"
  resultDir.mkdirs()
  val result = resultDir / s"$fileName.xsd"
  val od = new LocalOutputDirectory(
    sc.getMainUri,
    result,
    ".xsd",
    "UTF-8",
    72,
    2
  )
  outputFormat.output(sc, od, params, "rnc", eh)
}

lazy val generateXsd = TaskKey[Unit]("generateXsd")

lazy val `gir-schema` = project
  .in(file("gir-schema"))
  .configure(pkgConfiguredSimple)
  .settings(noPublishing)
  .enablePlugins(ScalaxbPlugin)
  .settings(
    Compile / generateXsd := {
      generateXsd(
        "gir",
        (Compile / sourceDirectory).value,
        (Compile / sourceDirectory).value
      )
    },
    Compile / scalaxb / scalaxbPackageName := "com.indoorvivants.gnome.gir_schema",
    libraryDependencies ++= List(
      "javax.xml.bind" % "jaxb-api" % "2.3.1",
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
      "org.scala-lang.modules" %% "scala-xml" % "2.3.0"
    )
  )

lazy val docs =
  project
    .in(file("docs"))
    .dependsOn(gtk4)
    .enablePlugins(SubatomicPlugin)
    .settings(
      scalaVersion := Versions.Scala3,
      fork := true,
      publish / skip := true,
      subatomicMdocVariables ++= {
        if (!isSnapshot.value && isVersionStable.value) Some(version.value)
        else previousStableVersion.value
      }
        .map("STABLE_VERSION" -> _)
        .toMap
    )

lazy val buildWebsite = taskKey[Unit]("Build website in _site folder")

buildWebsite / fileInputs += ((docs / baseDirectory).value / "pages").toGlob / "*.md"
buildWebsite / fileInputs += ((docs / baseDirectory).value / "assets").toGlob / "*"

buildWebsite := Def.taskDyn {
  val root = (ThisBuild / baseDirectory).value / "_site"

  (buildWebsite / changedInputFiles).value

  (docs / Compile / run).toTask(
    s" build --destination ${root.toString} --force"
  )
}.value

lazy val copyAPIDocs = taskKey[Unit]("")
copyAPIDocs := {

  val root = (ThisBuild / baseDirectory).value / "_site"

  val destination = root / "api"

  val log = sLog.value

  List(
    "gtk4" -> (gtk4 / Compile / doc).value,
    "gdk4" -> (gdk4 / Compile / doc).value,
    "gsk4" -> (gsk4 / Compile / doc).value,
    "gobject" -> (gobject / Compile / doc).value,
    "harfbuzz" -> (harfbuzz / Compile / doc).value,
    "cairo" -> (cairo / Compile / doc).value,
    "gdkpixbuf" -> (gdkpixbuf / Compile / doc).value,
    "glib" -> (glib / Compile / doc).value,
    "gio" -> (gio / Compile / doc).value,
    "pango" -> (pango / Compile / doc).value
  ).foreach { case (name, docs) =>
    log.info(
      s"Copying API docs for $name (from $docs to ${destination / name})"
    )
    IO.createDirectory(destination / name)
    IO.copyDirectory(docs, destination / name)
  }
}

def pkgConfig(pkg: String, arg: String) = {
  import sys.process.*
  s"pkg-config --$arg $pkg".!!.trim.split(" ").toList
}

def findHeader(pkgName: String, file: java.io.File => java.io.File) = {
  val cFlags = pkgConfig(pkgName, "cflags")
    .filter(_.startsWith("-I"))
    .map(_.stripPrefix("-I"))
    .map(new File(_))

  cFlags
    .map(file)
    .filter(_.exists())
    .headOption
    .getOrElse(
      throw new sbt.internal.util.MessageOnlyException(
        s"Failed to find header in folders received from pkg-config: $cFlags"
      )
    )
}

def pkgConfiguredSimple: Project => Project = { proj =>
  proj
    .enablePlugins(ScalaNativePlugin)
    .settings(publishing)
    .settings(
      // Compile / doc / sources := Seq.empty,
      pushRemoteCacheTo := Some(
        MavenCache(
          "local-cache",
          (ThisBuild / baseDirectory).value / ".remote-cache"
        )
      ),
      // resolvers ++= Resolver.sonatypeOssRepos("snapshots"),
      scalaVersion := Versions.Scala3
    )
}

def pkgConfigured(name: String): Project => Project = { proj =>
  pkgConfiguredSimple(proj)
    .enablePlugins(BindgenPlugin)
    .settings(publishing)
    .settings(
      nativeConfig ~= { config =>
        config
          .withCompileOptions(_ ++ pkgConfig(name, "cflags"))
          .withLinkingOptions(_ ++ pkgConfig(name, "libs"))
      },
      bindgenMode := BindgenMode.Manual(
        scalaDir = sourceDirectory.value / "main" / "scala" / "generated",
        cDir =
          (Compile / resourceDirectory).value / "scala-native" / "generated"
      )
    )
}

def buildWithDependencies(deps: String*)(bb: Binding) = {
  def extPaths(dep: String) = dep match {
    case "glib" =>
      List(
        "*/glib-2.0/glib/*",
        "*/glib-2.0/glib.h",
        "*/glibconfig.h",
        "*/glib-2.0/gmodule.h"
      )
    case "gio" =>
      List(
        "*/glib-2.0/gio/*"
      )
    case "gobject" =>
      List(
        "*/glib-2.0/gobject/*",
        "*/glib-2.0/gobject.h"
      )
    case "cairo" =>
      List("*/cairo/*")
    case "harfbuzz" => List("*/harfbuzz/*")
    case "gdk4"     =>
      List(
        "*/gtk-4.0/gdk/*"
      )
    case "gsk4" =>
      List(
        "*/gtk-4.0/gsk/*"
      )
    case "gtk4" =>
      List(
        "*/gtk-4.0/gtk/*"
      )
    case "graphene"  => List("*/graphene-1.0/*")
    case "pango"     => List("*/pango-1.0/*")
    case "gdkpixbuf" => List("*/gdk-pixbuf-2.0/*")
  }

  val externals =
    deps.flatMap { dep =>
      extPaths(dep).map(_ -> bindingPackage(dep)).toMap
    }.toMap

  bb.addExternalPaths(externals)
}

def bindingPackage(name: String) = s"sn.gnome.$name.internal"

lazy val `fluent-generator` = project
  .in(file("fluent-generator"))
  .dependsOn(`gir-schema`)
  .settings(scalaVersion := Versions.Scala3)
  .settings(
    libraryDependencies += "com.outr" %%% "scribe" % "3.17.0",
    libraryDependencies += "com.indoorvivants" %%% "rendition" % "0.0.4",
    libraryDependencies += "com.indoorvivants" %%% "decline-derive" % "0.3.6",
    libraryDependencies += "com.lihaoyi" %%% "os-lib" % "0.9.1",
    libraryDependencies += "com.lihaoyi" %%% "upickle" % "4.2.1",
    libraryDependencies += ("org.scalameta" %% "scalameta" % "4.16.1")
      .cross(CrossVersion.for3Use2_13)
      .exclude("com.lihaoyi", "sourcecode_2.13"),
    fork := true,
    run / baseDirectory := (ThisBuild / baseDirectory).value
  )

lazy val girModuleName = settingKey[String]("")

lazy val generateRawBindings = inputKey[Unit]("")
lazy val generateFluentBindings = inputKey[Unit]("")
lazy val generateIntrospectionSchema = inputKey[Unit]("")
lazy val generateTargetTypes = inputKey[Unit]("")
lazy val generateTestTargetTypes = inputKey[Unit]("")
lazy val generateReport = taskKey[Unit]("")

val withFluentBindings = Seq(
  generateFluentBindings := Def.inputTaskDyn {

    import complete.DefaultParsers.*
    val args: Seq[String] = spaceDelimited("<arg>").parsed

    val girModule = girModuleName.value
    val girFiles = (ThisBuild / baseDirectory).value / "gir-files"
    val out =
      (Compile / sourceDirectory).value / "scala" / "generated" / "fluent"

    val generatedFiles =
      (Compile / target).value / "fluent-generator" / "files.txt"

    val reportOut = (Compile / target).value / "fluent-generator" / "report.md"

    val task = InputKey[Unit]("scalafmtOnly")

    Def.sequential(
      Def
        .taskDyn {
          (`fluent-generator` / Compile / run)
            .toTask(
              s" fluent --module $girModule --gir-files $girFiles --out $out --dump-report ${reportOut} --dump-files-list $generatedFiles ${args.mkString(" ")}"
            )
        },
      Def.taskDyn {
        val files = IO.readLines(generatedFiles)
        (Compile / task).toTask(s" ${files.mkString(" ")}")
      }
    )

  }.evaluated
)

Global / onChangedBuildSource := ReloadOnSourceChanges

pushRemoteCacheTo := Some(
  MavenCache(
    "local-cache",
    (ThisBuild / baseDirectory).value / "target" / "remote-cache"
  )
)

addCommandAlias(
  "codegenCheck",
  "codegenTests/bindgenGenerateAll; codegenTests/generateFluentBindings; codegenTests/test"
)

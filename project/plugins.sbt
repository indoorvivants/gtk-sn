resolvers ++= Resolver.sonatypeOssRepos("snapshots")

addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.11")

addSbtPlugin("com.indoorvivants" % "sbt-commandmatrix" % "0.0.5")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.11.2")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")

addSbtPlugin(
  "com.indoorvivants" % "subatomic-plugin" % "0.0.11"
)

val BindgenVersion =
  sys.env.getOrElse(
    "SN_BINDGEN_VERSION",
    "0.4.4"
  )

addSbtPlugin(
  "com.indoorvivants" % "bindgen-sbt-plugin" % BindgenVersion
)

addSbtPlugin("com.github.sbt" % "sbt-unidoc" % "0.6.1")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.11.0")

addSbtPlugin("org.jmotor.sbt" % "sbt-dependency-updates" % "1.2.7")

addSbtPlugin("org.scalaxb" % "sbt-scalaxb" % "1.12.1")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.11.0")

libraryDependencies ++= List(
  "com.indoorvivants.detective" %% "platform" % "0.0.2",
  "org.relaxng" % "trang" % "20220510"
)

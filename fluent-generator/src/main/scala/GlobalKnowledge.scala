import cats.syntax.all.*
import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scalaxb.fromXML
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import scala.jdk.CollectionConverters.*
import scala.util.boundary
import scala.xml.XML
import boundary.break
import scala.annotation.tailrec

case class GlobalName(
    fluent: String,
    namespace: String,
    short: String,
    effects: List[Effect],
    tpe: NameType
)

object GlobalName:
  def internal(fluent: String, short: String, namespace: String, tpe: NameType)(
      using NamingPolicy
  ) =
    GlobalName(
      fluent,
      namespace,
      short,
      List(
        Effect.RequiresImport(
          summon[NamingPolicy].namespaceToInternalPackage(namespace),
          short
        )
      ),
      tpe
    )
  def fluent(short: String, namespace: String, tpe: NameType)(using
      NamingPolicy
  ) =
    GlobalName(
      short,
      namespace,
      short,
      List(
        Effect.RequiresImport(
          summon[NamingPolicy].namespaceToFluentPackage(namespace),
          short
        )
      ),
      tpe
    )
end GlobalName

case class GlobalKnowledge(
    reader: Reader,
    repository: AugmentedRepository,
    policy: NamingPolicy,
    targetTypes: TargetTypes
):

  given NamingPolicy = policy

  lazy val classMethods =
    val b = Map.newBuilder[GlobalName, Map[String, Method]]

    @tailrec
    def go(repos: Seq[AugmentedRepository], visited: Set[String]): Unit =
      repos match
        case Nil                => ()
        case repository :: rest =>
          repository.namespace.foreach: ns =>
            ns.classes.foreach: cls =>
              val cl = Map.newBuilder[String, Method]
              cls.methods.foreach: m =>
                cl += (m.name -> m)
              val name = names(
                ns.name
                  .map(_ + ".")
                  .getOrElse("") + cls.name
              )

              b += name -> cl.result()
          val deps =
            repository.dependencies.filterNot(visited.contains).map(reader(_))

          go(rest ++ deps, visited + repository.id)
    end go

    go(Seq(repository), Set.empty)

    b.result()
  end classMethods

  lazy val names =
    @tailrec
    def go(
        repos: Seq[AugmentedRepository],
        res: Map[String, GlobalName],
        visited: Set[String]
    ): Map[String, GlobalName] =
      boundary:
        if repos.isEmpty then boundary.break(res)

        scribe.debug(s"Traversing ${repos.map(_.id)}")
        val names = Map.newBuilder[String, GlobalName]
        val deps = Set.newBuilder[String]

        repos.foreach: repo =>
          if !visited.contains(repo.id) then
            val namespace = repo.namespace.get

            val namespaceName = namespace.name.get
            scribe.debug(s"Processing $namespaceName")
            deps.addAll(repo.dependencies)

            val fluentPackage =
              policy.namespaceToPackage(namespaceName) + ".fluent"

            val internalPackage =
              policy.namespaceToPackage(namespaceName) + ".internal"

            val variants: Seq[String => String] =
              if repo.id == repository.id then
                Seq(c => namespaceName + "." + c, identity)
              else Seq(namespaceName + "." + _)

            val allVariants: Seq[String => String] =
              Seq(c => namespaceName + "." + c, identity)

            import GlobalName.*

            namespace.classes
              .foreach: cls =>
                names ++= variants.map(v =>
                  v(
                    cls.name
                  ) -> fluent(
                    cls.name,
                    namespaceName,
                    NameType.Class
                  )
                )

            namespace.interfaces
              .foreach: iface =>
                names ++= variants.map(v =>
                  v(
                    iface.name
                  ) -> fluent(
                    iface.name,
                    namespaceName,
                    NameType.Interface
                  )
                )

            namespace.enumerations
              .foreach: enumeration =>
                names ++= variants.map(v =>
                  v(
                    enumeration.name
                  ) -> fluent(
                    enumeration.name.capitalize,
                    namespaceName,
                    NameType.Enumeration(enumeration.typeValue)
                  )
                )

            namespace.bitfields
              .foreach: bitfield =>
                names ++= variants.map(v =>
                  v(
                    bitfield.name
                  ) -> fluent(
                    bitfield.name,
                    namespaceName,
                    NameType.Bitfield(bitfield.typeValue)
                  )
                )
            namespace.callbacks
              .foreach: callback =>
                names ++= allVariants.map(v =>
                  v(
                    callback.name
                  ) -> internal(
                    callback.name,
                    callback.typeValue,
                    namespaceName,
                    NameType.Callback
                  )
                )

                names ++= allVariants.map(v =>
                  v(
                    callback.typeValue
                  ) -> internal(
                    callback.name,
                    callback.typeValue,
                    namespaceName,
                    NameType.Callback
                  )
                )
            namespace.aliases
              .foreach: alias =>
                names ++= allVariants.map(v =>
                  v(
                    alias.typeValue
                  ) -> internal(
                    alias.name,
                    alias.typeValue,
                    namespaceName,
                    NameType.Alias
                  )
                )

            namespace.records
              .foreach: record =>
                names ++= allVariants.map(v =>
                  v(
                    record.typeValue
                  ) -> internal(
                    record.name,
                    record.typeValue,
                    namespaceName,
                    NameType.Record
                  )
                )

        go(
          deps.result().filterNot(visited.contains).map(reader(_)).toSeq,
          names.result() ++ res,
          visited ++ repos.map(_.id)
        )
    end go

    go(Seq(repository), Map.empty, Set.empty)
  end names
end GlobalKnowledge

inline def globalKnowledge(using gk: GlobalKnowledge) = gk

object GlobalKnowledge:
  inline def apply()(using gk: GlobalKnowledge) = gk

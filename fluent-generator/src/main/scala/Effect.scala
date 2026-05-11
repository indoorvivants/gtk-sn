import cats.syntax.all.*
import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scalaxb.fromXML
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import scala.jdk.CollectionConverters.*
import scala.util.boundary, boundary.*
import scala.xml.XML
import scala.annotation.tailrec
import scribe.LogFeature
import scribe.LogRecord

enum Effect:
  case RequiresZone
  case RequiresRuntime
  case RequiresImport(namespace: String, definition: String)
  case RequiresRenamedImport(
      namespace: String,
      definition: String,
      alias: String
  )
  case RequiresDefinition(f: () => RenderingContext ?=> Unit)
end Effect

object Effect:
  def requiresImports(namespace: String, defs: String*) =
    defs.map(d => Effect.RequiresImport(namespace, d))

  def internalNamespaceImport(namespace: String, raw: String)(using
      NamingPolicy
  ) =
    Effect.RequiresImport(
      summon[NamingPolicy].namespaceToInternalPackage(namespace),
      raw
    )

  def needsRuntime(using np: NamingPolicy) =
    Effect.RequiresImport(np.namespaceToPackage("runtime"), "*")
  def needsGobjectRuntime(using np: NamingPolicy) =
    Effect.RequiresImport(np.namespaceToPackage("gobject") + ".runtime", "*")
end Effect

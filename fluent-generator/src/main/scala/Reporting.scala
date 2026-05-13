import rendition.LineBuilder
class Reporter:
  private val namespaceReports = List.newBuilder[NamespaceReport]

  def inNamespace(name: String)(f: NamespaceReporter ?=> Unit) =
    val reporter = NamespaceReporter(name)
    f(using reporter)
    namespaceReports += reporter.report

  def report = Report(namespaceReports.result())

class NamespaceReporter(name: String):
  private val classReports = List.newBuilder[ClassReport]
  private val enums = List.newBuilder[NameReport]
  private val bitfields = List.newBuilder[NameReport]
  private val functions = List.newBuilder[NameReport]
  private val interfaces = List.newBuilder[InterfaceReport]
  private val constants = List.newBuilder[NameReport]

  def inClass(name: String)(f: ClassReporter ?=> Unit) =
    val reporter = ClassReporter(name)
    f(using reporter)
    classReports += reporter.report

  def inInterface(name: String)(f: InterfaceReporter ?=> Unit) =
    val reporter = InterfaceReporter(name)
    f(using reporter)
    interfaces += reporter.report

  def recordConstant(name: String, result: ReportResult) =
    constants += NameReport(name, result)

  def recordEnum(name: String, result: ReportResult) =
    enums += NameReport(name, result)

  def recordBitfield(name: String, result: ReportResult) =
    bitfields += NameReport(name, result)

  def recordFunction(name: String, result: ReportResult) =
    functions += NameReport(name, result)

  def recordClass(name: String, result: ReportResult) =
    classReports += ClassReport(name, result)

  def recordInterface(name: String, result: ReportResult) =
    interfaces += InterfaceReport(name, result)

  def report =
    val classesResult = classReports.result()
    val enumsResult = enums.result()
    val bitfieldsResult = bitfields.result()
    val interfacesResult = interfaces.result()
    val functionsResult = functions.result()
    NamespaceReport(
      name = name,
      classes = classesResult,
      enums = enumsResult,
      bitfields = bitfieldsResult,
      interfaces = interfacesResult,
      functions = functionsResult,
      constants = constants.result()
    )
  end report
end NamespaceReporter

case class SignalReport(name: String, result: ReportResult)

class InterfaceReporter(name: String):
  private val methods = List.newBuilder[NameReport]

  def recordMethod(name: String, result: ReportResult) =
    methods += NameReport(name, result)

  def report =
    val methodsResult = methods.result()
    InterfaceReport(
      name = name,
      methods = methodsResult,
      result = AggResults()
        .add("methods", methodsResult.map(_.result))
    )
end InterfaceReporter

class ClassReporter(name: String):
  private val methods = List.newBuilder[NameReport]
  private val constructors = List.newBuilder[NameReport]
  private val functions = List.newBuilder[NameReport]
  private val signals = List.newBuilder[NameReport]
  private val constants = List.newBuilder[NameReport]

  def recordMethod(name: String, result: ReportResult) =
    methods += NameReport(name, result)
  def recordFunction(name: String, result: ReportResult) =
    functions += NameReport(name, result)

  def recordConstant(name: String, result: ReportResult) =
    constants += NameReport(name, result)
  def recordConstructor(name: String, result: ReportResult) =
    constructors += NameReport(name, result)

  def recordSignal(name: String, result: ReportResult) =
    signals += NameReport(name, result)

  def report =
    val methodsResult = methods.result()
    val constructorsResult = constructors.result()
    val functionsResult = functions.result()
    val signalsResult = signals.result()
    val constantsResult = constants.result()
    ClassReport(
      name = name,
      result = AggResults()
        .add("methods", methodsResult.map(_.result))
        .add("constructors", constructorsResult.map(_.result))
        .add("functions", functionsResult.map(_.result))
        .add("signals", signalsResult.map(_.result))
        .add("constants", constantsResult.map(_.result)),
      methods = methodsResult,
      constructors = constructorsResult,
      functions = functionsResult,
      signals = signalsResult,
      constants = constantsResult
    )
  end report
end ClassReporter

case class Report(
    namespaces: Seq[NamespaceReport]
)

class MarkdownRenderer(sb: LineBuilder = LineBuilder()):
  def render(report: Report): String =
    report.namespaces.foreach(renderNamespace)
    sb.result

  private def resultSummary(r: AggResult | AggResults | ReportResult): String =
    r match
      case AggResult(f, w, s)        => s"✅ ${s}, ⚠️ ${w}, ❌ ${f}"
      case ReportResult.Success      => "✅"
      case ReportResult.Warning(msg) => s"⚠️ `$msg`"
      case ReportResult.Failure(mgs) => s"❌ `$mgs`"
      case AggResults(mapping)       =>
        val header =
          "<table><tr><th>type</th><th>✅</th><th>⚠️</th><th>❌</th></tr>"
        mapping.toList
          .sortBy(_._1)
          .map { case (label, result) =>
            s"<tr><td>$label</td><td>${result.successes}</td><td>${result.warnings}</td><td>${result.failures}</tr>"
          }
          .mkString(s"\n$header", "\n", "</table>")

  private def renderNamespace(namespace: NamespaceReport): Unit =
    sb.appendLine(s"# ${namespace.name}")
    sb.emptyLine()

    if namespace.classes.nonEmpty then
      sb.appendLine("## Classes")
      namespace.classes.foreach(renderClass)

    if namespace.interfaces.nonEmpty then
      sb.appendLine("## Interfaces")
      namespace.interfaces.foreach(renderInterface)

    if namespace.enums.nonEmpty then
      sb.appendLine("## Enums")
      namespace.enums.foreach(renderNamed)

    if namespace.bitfields.nonEmpty then
      sb.appendLine("## Bitfields")
      namespace.bitfields.foreach(renderNamed)

    if namespace.constants.nonEmpty then
      sb.appendLine("## Constants")
      namespace.constants.foreach(renderNamed)
  end renderNamespace

  private def renderClass(classReport: ClassReport): Unit =
    sb.appendLine(s"### ${classReport.name}")
    sb.emptyLine()
    sb.appendLine(resultSummary(classReport.result))
    sb.emptyLine()

    if classReport.constructors.nonEmpty then
      sb.appendLine("#### Constructors")
      classReport.constructors.foreach(renderNamed)

    if classReport.methods.nonEmpty then
      sb.appendLine("#### Methods")
      classReport.methods.foreach(renderNamed)

    if classReport.functions.nonEmpty then
      sb.appendLine("#### Functions")
      classReport.functions.foreach(renderNamed)

    if classReport.signals.nonEmpty then
      sb.appendLine("#### Signals")
      classReport.signals.foreach(renderNamed)

    if classReport.constants.nonEmpty then
      sb.appendLine("#### Constants")
      classReport.constants.foreach(renderNamed)

    sb.appendLine("")
  end renderClass

  private def renderNamed(nr: NameReport) =
    if nr.result == ReportResult.Success then
      sb.appendLine(s"- ${nr.name} ${resultSummary(nr.result)}")
      sb.emptyLine()
    else
      sb.appendLine(s"- ${nr.name}")
      sb.append(s"  > ${resultSummary(nr.result)}")
      sb.emptyLine()

  private def renderInterface(interfaceReport: InterfaceReport): Unit =
    sb.appendLine(s"### ${interfaceReport.name}")
    sb.emptyLine()
    sb.appendLine(resultSummary(interfaceReport.result))
    sb.emptyLine()

    if interfaceReport.methods.nonEmpty then
      sb.appendLine("#### Methods")
      interfaceReport.methods.foreach(renderNamed)

end MarkdownRenderer

case class NamespaceReport(
    name: String,
    classes: Seq[ClassReport] = Seq.empty,
    interfaces: Seq[InterfaceReport] = Seq.empty,
    enums: Seq[NameReport] = Seq.empty,
    bitfields: Seq[NameReport] = Seq.empty,
    functions: Seq[NameReport] = Seq.empty,
    constants: Seq[NameReport] = Seq.empty
)

case class InterfaceReport(
    name: String,
    result: ReportResult | AggResults,
    methods: Seq[NameReport] = Seq.empty
)

case class ClassReport(
    name: String,
    result: ReportResult | AggResults,
    methods: Seq[NameReport] = Seq.empty,
    constructors: Seq[NameReport] = Seq.empty,
    functions: Seq[NameReport] = Seq.empty,
    signals: Seq[NameReport] = Seq.empty,
    constants: Seq[NameReport] = Seq.empty
)

case class NameReport(
    name: String,
    result: ReportResult
)

case class AggResult(
    failures: Int,
    warnings: Int,
    successes: Int
)

case class AggResults(mapping: Map[String, AggResult] = Map.empty):

  def add(label: String, sq: AggResult) =
    copy(mapping = mapping.updated(label, sq))

  def add(label: String, sq: Seq[ReportResult]) =
    val failures = sq.count(_.isInstanceOf[ReportResult.Failure])
    val warnings = sq.count(_.isInstanceOf[ReportResult.Warning])
    val successes = sq.count(_ == ReportResult.Success)
    copy(mapping =
      mapping.updated(label, AggResult(failures, warnings, successes))
    )
end AggResults

enum ReportResult:
  case Success
  case Warning(msg: String)
  case Failure(mgs: String)

object ReportResult:
  def apply(err: FluentErr) = Failure(err.getMessage)

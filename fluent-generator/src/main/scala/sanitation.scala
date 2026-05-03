enum Sanitation:
  case Renamed(value: String)
  case Escaped
  case Good

val scalaKeyWords =
  Set(
    "abstract",
    "case",
    "catch",
    "class",
    "def",
    "do",
    "else",
    "export",
    "extends",
    "false",
    "final",
    "finally",
    "for",
    "forSome",
    "if",
    "implicit",
    "import",
    "lazy",
    "match",
    "new",
    "null",
    "object",
    "override",
    "package",
    "private",
    "protected",
    "return",
    "sealed",
    "super",
    "this",
    "throw",
    "trait",
    "try",
    "true",
    "type",
    "val",
    "var",
    "while",
    "with",
    "yield"
  )

def sanitation(name: String) =
  val reserved = Set("notify", "wait", "eq", "ne")
  if name == "_" then Sanitation.Renamed("$underscore")
  else if reserved(name) then Sanitation.Renamed(s"_$name")
  else if scalaKeyWords.contains(name) || name.endsWith("_") then
    Sanitation.Escaped
  else if name.takeWhile(_.isDigit).nonEmpty then Sanitation.Escaped
  else Sanitation.Good

def escape(name: String) =
  sanitation(name) match
    case Sanitation.Renamed(value) => value
    case Sanitation.Escaped        => s"`$name`"
    case Sanitation.Good           => name

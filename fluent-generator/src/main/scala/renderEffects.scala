import rendition.*

def renderEffects(effects: List[Effect])(using RenderingContext) =
  effects.distinct
    .collect:
      case a @ Effect.RequiresImport(namespace, what) =>
        a
    .groupBy(_.namespace)
    .toList
    .sortBy(_._1)
    .foreach: (ns, values) =>
      val imports =
        values.map(_.definition).sorted.distinct.mkString("{", ", ", "}")
      line(s"import ${ns}.$imports")

  effects.distinct
    .collect:
      case a: Effect.RequiresRenamedImport =>
        a
    .sortBy(i => i.namespace -> i.definition)
    .foreach: i =>
      line(s"import ${i.namespace}.${i.definition} as ${i.alias}")
end renderEffects

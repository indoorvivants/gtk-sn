import rendition.*

def renderEffects(effects: List[Effect])(using RenderingContext) =
  effects.distinct
    .collect:
      case a @ Effect.RequiresImport(namespace, what) =>
        a
    .sortBy(i => i.namespace -> i.definition)
    .foreach: i =>
      line(s"import ${i.namespace}.${i.definition}")
  effects.distinct
    .collect:
      case a: Effect.RequiresRenamedImport =>
        a
    .sortBy(i => i.namespace -> i.definition)
    .foreach: i =>
      line(s"import ${i.namespace}.${i.definition} as ${i.alias}")

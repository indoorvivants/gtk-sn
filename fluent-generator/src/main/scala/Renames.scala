import com.indoorvivants.gnome.gir_schema.*

def Renames(e: Enumeration) =
  if e.name == "Unit" then
    e.copy(attributes =
      e.attributes.updated("@name", scalaxb.DataRecord("GTKUnit"))
    )
  else e

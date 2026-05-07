package sn.gnome.runtime

import scalanative.unsafe.*

object MemoryWrite:
  def nullTerminatedStringArray(ar: Array[String])(using Zone): Ptr[CString] =
    val length = ar.length
    val result = alloc[CString]((length + 1))
    // TODO: may be allocate one big arena and write all strings contiguously
    for i <- 0 until length do result(i) = toCString(ar(i))
    result(length) = null
    result
end MemoryWrite

object MemoryRead:
  def nullTerminatedPointerArray[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(using ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end nullTerminatedPointerArray
end MemoryRead

object GCRoots:
  private val references = new java.util.IdentityHashMap[Object, Unit]
  def addRoot(o: Object): Unit = references.put(o, ())
  def removeRoot(o: Object): Unit = references.remove(o)

object Captured:
  def unsafe[D <: AnyRef: Tag](value: D): (Ptr[D], Memory) =
    import scalanative.runtime.*, ffi.*

    val rawptr = malloc(sizeof[D])
    val mem = fromRawPtr[D](rawptr)
    val deallocate: Memory =
      () =>
        GCRoots.removeRoot(value.asInstanceOf[Object])
        free(toRawPtr[D](mem))

    val originalAddress = Intrinsics.castObjectToRawPtr(value)

    Intrinsics.storeObject(rawptr, value)

    GCRoots.addRoot(value)

    (mem, deallocate)
  end unsafe

  opaque type Memory = () => Unit
  object Memory:
    extension (f: Memory)
      def deallocate() =
        f()

end Captured

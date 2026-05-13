package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GMemoryMonitorWarningLevel

/**  Memory availability warning levels.
  *
  *  Note that because new values might be added, it is recommended that applications check
  *  #GMemoryMonitorWarningLevel as ranges, for example:
  *  |[<!-- language="C" -->
  *  if (warning_level > G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
  *    drop_caches ();
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
enum MemoryMonitorWarningLevel(val raw: GMemoryMonitorWarningLevel):
  /** Memory on the device is low, processes should free up unneeded resources
    * (for example, in-memory caches) so they can be used elsewhere.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOW
      extends MemoryMonitorWarningLevel(
        GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_LOW
      )

  /** Same as @G_MEMORY_MONITOR_WARNING_LEVEL_LOW but the device has even less
    * free memory, so processes should try harder to free up unneeded resources.
    * If your process does not need to stay running, it is a good time for it to
    * quit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEDIUM
      extends MemoryMonitorWarningLevel(
        GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM
      )

  /** The system will soon start terminating processes to reclaim memory,
    * including background processes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CRITICAL
      extends MemoryMonitorWarningLevel(
        GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL
      )
end MemoryMonitorWarningLevel

object MemoryMonitorWarningLevel:
  def fromRaw(raw: GMemoryMonitorWarningLevel): MemoryMonitorWarningLevel =
    raw match
      case GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_LOW =>
        MemoryMonitorWarningLevel.LOW
      case GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM =>
        MemoryMonitorWarningLevel.MEDIUM
      case GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL =>
        MemoryMonitorWarningLevel.CRITICAL
  end fromRaw
end MemoryMonitorWarningLevel

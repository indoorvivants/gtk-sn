package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GTestLogType

enum TestLogType(val raw: GTestLogType):
  case NONE extends TestLogType(GTestLogType.G_TEST_LOG_NONE)
  case ERROR extends TestLogType(GTestLogType.G_TEST_LOG_ERROR)
  case START_BINARY extends TestLogType(GTestLogType.G_TEST_LOG_START_BINARY)
  case LIST_CASE extends TestLogType(GTestLogType.G_TEST_LOG_LIST_CASE)
  case SKIP_CASE extends TestLogType(GTestLogType.G_TEST_LOG_SKIP_CASE)
  case START_CASE extends TestLogType(GTestLogType.G_TEST_LOG_START_CASE)
  case STOP_CASE extends TestLogType(GTestLogType.G_TEST_LOG_STOP_CASE)
  case MIN_RESULT extends TestLogType(GTestLogType.G_TEST_LOG_MIN_RESULT)
  case MAX_RESULT extends TestLogType(GTestLogType.G_TEST_LOG_MAX_RESULT)
  case MESSAGE extends TestLogType(GTestLogType.G_TEST_LOG_MESSAGE)
  case START_SUITE extends TestLogType(GTestLogType.G_TEST_LOG_START_SUITE)
  case STOP_SUITE extends TestLogType(GTestLogType.G_TEST_LOG_STOP_SUITE)
end TestLogType

object TestLogType:
  def fromRaw(raw: GTestLogType): TestLogType =
    raw match
      case GTestLogType.G_TEST_LOG_NONE         => TestLogType.NONE
      case GTestLogType.G_TEST_LOG_ERROR        => TestLogType.ERROR
      case GTestLogType.G_TEST_LOG_START_BINARY => TestLogType.START_BINARY
      case GTestLogType.G_TEST_LOG_LIST_CASE    => TestLogType.LIST_CASE
      case GTestLogType.G_TEST_LOG_SKIP_CASE    => TestLogType.SKIP_CASE
      case GTestLogType.G_TEST_LOG_START_CASE   => TestLogType.START_CASE
      case GTestLogType.G_TEST_LOG_STOP_CASE    => TestLogType.STOP_CASE
      case GTestLogType.G_TEST_LOG_MIN_RESULT   => TestLogType.MIN_RESULT
      case GTestLogType.G_TEST_LOG_MAX_RESULT   => TestLogType.MAX_RESULT
      case GTestLogType.G_TEST_LOG_MESSAGE      => TestLogType.MESSAGE
      case GTestLogType.G_TEST_LOG_START_SUITE  => TestLogType.START_SUITE
      case GTestLogType.G_TEST_LOG_STOP_SUITE   => TestLogType.STOP_SUITE
  end fromRaw
end TestLogType

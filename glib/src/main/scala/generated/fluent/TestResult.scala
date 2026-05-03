package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTestResult

enum TestResult(val raw: GTestResult):
  case SUCCESS extends TestResult(GTestResult.G_TEST_RUN_SUCCESS)
  case SKIPPED extends TestResult(GTestResult.G_TEST_RUN_SKIPPED)
  case FAILURE extends TestResult(GTestResult.G_TEST_RUN_FAILURE)
  case INCOMPLETE extends TestResult(GTestResult.G_TEST_RUN_INCOMPLETE)
end TestResult

object TestResult:
  def fromRaw(raw: GTestResult): TestResult =
    raw match
      case GTestResult.G_TEST_RUN_SUCCESS    => TestResult.SUCCESS
      case GTestResult.G_TEST_RUN_SKIPPED    => TestResult.SKIPPED
      case GTestResult.G_TEST_RUN_FAILURE    => TestResult.FAILURE
      case GTestResult.G_TEST_RUN_INCOMPLETE => TestResult.INCOMPLETE
  end fromRaw
end TestResult

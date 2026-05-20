package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GSourceFuncs

/** The `GSourceFuncs` struct contains a table of functions used to handle event
  * sources in a generic manner.
  *
  * For idle sources, the prepare and check functions always return %TRUE to
  * indicate that the source is always ready to be processed. The prepare
  * function also returns a timeout value of 0 to ensure that the poll() call
  * doesn't block (since that would be time wasted which could have been spent
  * running the idle function).
  *
  * For timeout sources, the prepare and check functions both return %TRUE if
  * the timeout interval has expired. The prepare function also returns a
  * timeout value to ensure that the poll() call doesn't block too long and miss
  * the next timeout.
  *
  * For file descriptor sources, the prepare function typically returns %FALSE,
  * since it must wait until poll() has been called before it knows whether any
  * events need to be processed. It sets the returned timeout to -1 to indicate
  * that it doesn't mind how long the poll() call blocks. In the check function,
  * it tests the results of the poll() call to see if the required condition has
  * been met, and returns %TRUE if so.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SourceFuncs private[gnome] (raw: Ptr[GSourceFuncs]):

  def getUnsafeRawPointer(): Ptr[GSourceFuncs] = this.raw
  @annotation.compileTimeOnly("[field prepare]: Field is missing <type>")
  private def prepare__ = ???
  @annotation.compileTimeOnly("[field check]: Field is missing <type>")
  private def check__ = ???
  @annotation.compileTimeOnly("[field dispatch]: Field is missing <type>")
  private def dispatch__ = ???
  @annotation.compileTimeOnly("[field finalize]: Field is missing <type>")
  private def finalize__ = ???

end SourceFuncs

object SourceFuncs:
  def fromRaw(ptr: Ptr[GSourceFuncs]): SourceFuncs = new SourceFuncs(ptr)
end SourceFuncs

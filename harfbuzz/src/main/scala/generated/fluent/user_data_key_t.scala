package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_user_data_key_t

/** Data structure for holding user-data keys.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class user_data_key_t private[gnome] (raw: Ptr[hb_user_data_key_t]):

  def getUnsafeRawPointer(): Ptr[hb_user_data_key_t] = this.raw

end user_data_key_t

object user_data_key_t:
  def fromRaw(ptr: Ptr[hb_user_data_key_t]): user_data_key_t =
    new user_data_key_t(ptr)
end user_data_key_t

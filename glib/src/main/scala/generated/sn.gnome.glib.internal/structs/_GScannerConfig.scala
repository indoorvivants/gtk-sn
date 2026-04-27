package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GScannerConfig = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object _GScannerConfig:
  given _tag: Tag[_GScannerConfig] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GScannerConfig)
      inline def cset_skip_characters: Ptr[gchar] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[gchar]]]
      inline def cset_skip_characters_=(value: Ptr[gchar]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[gchar]]] = value
      inline def cset_identifier_first: Ptr[gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[gchar]]]
      inline def cset_identifier_first_=(value: Ptr[gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[gchar]]] = value
      inline def cset_identifier_nth: Ptr[gchar] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[gchar]]]
      inline def cset_identifier_nth_=(value: Ptr[gchar]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[gchar]]] = value
      inline def cpair_comment_single: Ptr[gchar] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[gchar]]]
      inline def cpair_comment_single_=(value: Ptr[gchar]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[gchar]]] = value
      inline def case_sensitive: guint = !struct.at(offsets(4)).asInstanceOf[Ptr[guint]]
      inline def case_sensitive_=(value: guint): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[guint]] = value
      inline def skip_comment_multi: guint = !struct.at(offsets(5)).asInstanceOf[Ptr[guint]]
      inline def skip_comment_multi_=(value: guint): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[guint]] = value
      inline def skip_comment_single: guint = !struct.at(offsets(6)).asInstanceOf[Ptr[guint]]
      inline def skip_comment_single_=(value: guint): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[guint]] = value
      inline def scan_comment_multi: guint = !struct.at(offsets(7)).asInstanceOf[Ptr[guint]]
      inline def scan_comment_multi_=(value: guint): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[guint]] = value
      inline def scan_identifier: guint = !struct.at(offsets(8)).asInstanceOf[Ptr[guint]]
      inline def scan_identifier_=(value: guint): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[guint]] = value
      inline def scan_identifier_1char: guint = !struct.at(offsets(9)).asInstanceOf[Ptr[guint]]
      inline def scan_identifier_1char_=(value: guint): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[guint]] = value
      inline def scan_identifier_NULL: guint = !struct.at(offsets(10)).asInstanceOf[Ptr[guint]]
      inline def scan_identifier_NULL_=(value: guint): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[guint]] = value
      inline def scan_symbols: guint = !struct.at(offsets(11)).asInstanceOf[Ptr[guint]]
      inline def scan_symbols_=(value: guint): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[guint]] = value
      inline def scan_binary: guint = !struct.at(offsets(12)).asInstanceOf[Ptr[guint]]
      inline def scan_binary_=(value: guint): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[guint]] = value
      inline def scan_octal: guint = !struct.at(offsets(13)).asInstanceOf[Ptr[guint]]
      inline def scan_octal_=(value: guint): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[guint]] = value
      inline def scan_float: guint = !struct.at(offsets(14)).asInstanceOf[Ptr[guint]]
      inline def scan_float_=(value: guint): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[guint]] = value
      inline def scan_hex: guint = !struct.at(offsets(15)).asInstanceOf[Ptr[guint]]
      inline def scan_hex_=(value: guint): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[guint]] = value
      inline def scan_hex_dollar: guint = !struct.at(offsets(16)).asInstanceOf[Ptr[guint]]
      inline def scan_hex_dollar_=(value: guint): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[guint]] = value
      inline def scan_string_sq: guint = !struct.at(offsets(17)).asInstanceOf[Ptr[guint]]
      inline def scan_string_sq_=(value: guint): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[guint]] = value
      inline def scan_string_dq: guint = !struct.at(offsets(18)).asInstanceOf[Ptr[guint]]
      inline def scan_string_dq_=(value: guint): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[guint]] = value
      inline def numbers_2_int: guint = !struct.at(offsets(19)).asInstanceOf[Ptr[guint]]
      inline def numbers_2_int_=(value: guint): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[guint]] = value
      inline def int_2_float: guint = !struct.at(offsets(20)).asInstanceOf[Ptr[guint]]
      inline def int_2_float_=(value: guint): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[guint]] = value
      inline def identifier_2_string: guint = !struct.at(offsets(21)).asInstanceOf[Ptr[guint]]
      inline def identifier_2_string_=(value: guint): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[guint]] = value
      inline def char_2_token: guint = !struct.at(offsets(22)).asInstanceOf[Ptr[guint]]
      inline def char_2_token_=(value: guint): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[guint]] = value
      inline def symbol_2_token: guint = !struct.at(offsets(23)).asInstanceOf[Ptr[guint]]
      inline def symbol_2_token_=(value: guint): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[guint]] = value
      inline def scope_0_fallback: guint = !struct.at(offsets(24)).asInstanceOf[Ptr[guint]]
      inline def scope_0_fallback_=(value: guint): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[guint]] = value
      inline def store_int64: guint = !struct.at(offsets(25)).asInstanceOf[Ptr[guint]]
      inline def store_int64_=(value: guint): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[guint]] = value
      inline def padding_dummy: guint = !struct.at(offsets(26)).asInstanceOf[Ptr[guint]]
      inline def padding_dummy_=(value: guint): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[guint]] = value
    end extension
  
  // Allocates _GScannerConfig on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GScannerConfig] = scala.scalanative.unsafe.alloc[_GScannerConfig](1)
  def apply(cset_skip_characters : Ptr[gchar], cset_identifier_first : Ptr[gchar], cset_identifier_nth : Ptr[gchar], cpair_comment_single : Ptr[gchar], case_sensitive : guint, skip_comment_multi : guint, skip_comment_single : guint, scan_comment_multi : guint, scan_identifier : guint, scan_identifier_1char : guint, scan_identifier_NULL : guint, scan_symbols : guint, scan_binary : guint, scan_octal : guint, scan_float : guint, scan_hex : guint, scan_hex_dollar : guint, scan_string_sq : guint, scan_string_dq : guint, numbers_2_int : guint, int_2_float : guint, identifier_2_string : guint, char_2_token : guint, symbol_2_token : guint, scope_0_fallback : guint, store_int64 : guint, padding_dummy : guint)(using Zone): Ptr[_GScannerConfig] =
    val ____ptr = apply()
    (!____ptr).cset_skip_characters = cset_skip_characters
    (!____ptr).cset_identifier_first = cset_identifier_first
    (!____ptr).cset_identifier_nth = cset_identifier_nth
    (!____ptr).cpair_comment_single = cpair_comment_single
    (!____ptr).case_sensitive = case_sensitive
    (!____ptr).skip_comment_multi = skip_comment_multi
    (!____ptr).skip_comment_single = skip_comment_single
    (!____ptr).scan_comment_multi = scan_comment_multi
    (!____ptr).scan_identifier = scan_identifier
    (!____ptr).scan_identifier_1char = scan_identifier_1char
    (!____ptr).scan_identifier_NULL = scan_identifier_NULL
    (!____ptr).scan_symbols = scan_symbols
    (!____ptr).scan_binary = scan_binary
    (!____ptr).scan_octal = scan_octal
    (!____ptr).scan_float = scan_float
    (!____ptr).scan_hex = scan_hex
    (!____ptr).scan_hex_dollar = scan_hex_dollar
    (!____ptr).scan_string_sq = scan_string_sq
    (!____ptr).scan_string_dq = scan_string_dq
    (!____ptr).numbers_2_int = numbers_2_int
    (!____ptr).int_2_float = int_2_float
    (!____ptr).identifier_2_string = identifier_2_string
    (!____ptr).char_2_token = char_2_token
    (!____ptr).symbol_2_token = symbol_2_token
    (!____ptr).scope_0_fallback = scope_0_fallback
    (!____ptr).store_int64 = store_int64
    (!____ptr).padding_dummy = padding_dummy
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](27)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[Ptr[gchar]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(2) = align(res(1) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[gchar]].toInt, alignmentof[Ptr[gchar]].toInt)
    res(4) = align(res(3) + sizeof[Ptr[gchar]].toInt, alignmentof[guint].toInt)
    res(5) = align(res(4) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(6) = align(res(5) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(7) = align(res(6) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(8) = align(res(7) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(9) = align(res(8) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(10) = align(res(9) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(11) = align(res(10) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(12) = align(res(11) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(13) = align(res(12) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(14) = align(res(13) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(15) = align(res(14) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(16) = align(res(15) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(17) = align(res(16) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(18) = align(res(17) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(19) = align(res(18) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(20) = align(res(19) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(21) = align(res(20) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(22) = align(res(21) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(23) = align(res(22) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(24) = align(res(23) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(25) = align(res(24) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res(26) = align(res(25) + sizeof[guint].toInt, alignmentof[guint].toInt)
    res
  end offsets
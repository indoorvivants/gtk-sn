package sn.gnome.codegentests.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def test_get_count(self : Ptr[GImpl]): CInt = extern

@extern def test_get_flags(self : Ptr[GImpl]): Ptr[CString] = extern

@extern def test_get_title(self : Ptr[GImpl]): CString = extern

@extern def test_new(): Ptr[GImpl] = extern

@extern def test_new_from_string(title : CString): Ptr[GImpl] = extern

@extern def test_set_options(self : Ptr[GImpl], a : CInt, title : CString, flags : Ptr[CString]): Unit = extern
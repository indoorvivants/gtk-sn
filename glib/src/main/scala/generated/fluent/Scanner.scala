package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{Data, ScannerConfig, TokenType}
import sn.gnome.glib.internal.{GScanner, gboolean, gchar, gint, gpointer, guint}

/** The data structure representing a lexical scanner.
  *
  * You should set @input_name after creating the scanner, since it is used by
  * the default message handler when displaying warnings and errors. If you are
  * scanning a file, the filename would be a good choice.
  *
  * The @user_data and @max_parse_errors fields are not used. If you need to
  * associate extra data with the scanner you can place them here.
  *
  * If you want to use your own message handler you can set the
  * @msg_handler
  *   field. The type of the message handler function is declared by
  *   #GScannerMsgFunc.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Scanner private[gnome] (raw: Ptr[GScanner]):

  def getUnsafeRawPointer(): Ptr[GScanner] = this.raw

  /** unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData: Ptr[Byte] /* None */ = (!raw).user_data.asInstanceOf[gpointer]

  /** unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).user_data_=(gpointer(value).asInstanceOf[gpointer])

  /** unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maxParseErrors: UInt /* None */ =
    (!raw).max_parse_errors.asInstanceOf[guint]

  /** unused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maxParseErrors_=(value: UInt /* None */ ): Unit =
    (!raw).max_parse_errors_=(guint(value).asInstanceOf[guint])

  /** g_scanner_error() increments this field
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parseErrors: UInt /* None */ = (!raw).parse_errors.asInstanceOf[guint]

  /** g_scanner_error() increments this field
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parseErrors_=(value: UInt /* None */ ): Unit =
    (!raw).parse_errors_=(guint(value).asInstanceOf[guint])

  /** name of input stream, featured by the default message handler
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inputName: scala.Predef.String /* None */ =
    (!raw).input_name.asInstanceOf[Ptr[gchar]]

  /** name of input stream, featured by the default message handler
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inputName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).input_name_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** quarked data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def qdata: sn.gnome.glib.Data /* None */ =
    (!raw).qdata.asInstanceOf[Ptr[GData]]

  /** quarked data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def qdata_=(value: sn.gnome.glib.Data /* None */ ): Unit = (!raw).qdata_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GData]]
  )

  /** link into the scanner configuration
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def config: sn.gnome.glib.ScannerConfig /* None */ =
    (!raw).config.asInstanceOf[Ptr[GScannerConfig]]

  /** link into the scanner configuration
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def config_=(value: sn.gnome.glib.ScannerConfig /* None */ ): Unit =
    (!raw).config_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GScannerConfig]]
    )

  /** token parsed by the last g_scanner_get_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def token: sn.gnome.glib.TokenType /* None */ =
    (!raw).token.asInstanceOf[GTokenType]

  /** token parsed by the last g_scanner_get_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def token_=(value: sn.gnome.glib.TokenType /* None */ ): Unit =
    (!raw).token_=(value.raw.asInstanceOf[GTokenType])

  /** value of the last token from g_scanner_get_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TokenValue), @type -> DataRecord(GTokenValue)))"
  )
  private def value__ = ???

  /** line number of the last token from g_scanner_get_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def line: UInt /* None */ = (!raw).line.asInstanceOf[guint]

  /** line number of the last token from g_scanner_get_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def line_=(value: UInt /* None */ ): Unit =
    (!raw).line_=(guint(value).asInstanceOf[guint])

  /** char number of the last token from g_scanner_get_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def position: UInt /* None */ = (!raw).position.asInstanceOf[guint]

  /** char number of the last token from g_scanner_get_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def position_=(value: UInt /* None */ ): Unit =
    (!raw).position_=(guint(value).asInstanceOf[guint])

  /** token parsed by the last g_scanner_peek_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextToken: sn.gnome.glib.TokenType /* None */ =
    (!raw).next_token.asInstanceOf[GTokenType]

  /** token parsed by the last g_scanner_peek_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextToken_=(value: sn.gnome.glib.TokenType /* None */ ): Unit =
    (!raw).next_token_=(value.raw.asInstanceOf[GTokenType])

  /** value of the last token from g_scanner_peek_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field next_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TokenValue), @type -> DataRecord(GTokenValue)))"
  )
  private def nextValue__ = ???

  /** line number of the last token from g_scanner_peek_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextLine: UInt /* None */ = (!raw).next_line.asInstanceOf[guint]

  /** line number of the last token from g_scanner_peek_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextLine_=(value: UInt /* None */ ): Unit =
    (!raw).next_line_=(guint(value).asInstanceOf[guint])

  /** char number of the last token from g_scanner_peek_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextPosition: UInt /* None */ = (!raw).next_position.asInstanceOf[guint]

  /** char number of the last token from g_scanner_peek_next_token()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextPosition_=(value: UInt /* None */ ): Unit =
    (!raw).next_position_=(guint(value).asInstanceOf[guint])

  /** handler function for _warn and _error
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field msg_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ScannerMsgFunc), @type -> DataRecord(GScannerMsgFunc)))"
  )
  private def msgHandler__ = ???

  /** Returns the current line in the input stream (counting from 1). This is
    * the line of the last token parsed via g_scanner_get_next_token().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def curLine(): UInt /* None */ =
    g_scanner_cur_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]]
    ).value
  end curLine

  /** Returns the current position in the current line (counting from 0). This
    * is the position of the last token parsed via g_scanner_get_next_token().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def curPosition(): UInt /* None */ =
    g_scanner_cur_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]]
    ).value
  end curPosition

  /** Gets the current token type. This is simply the @token field in the
    * #GScanner structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def curToken(): sn.gnome.glib.TokenType /* None */ =
    sn.gnome.glib.TokenType.fromRaw(
      g_scanner_cur_token(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]]
      )
    )
  end curToken

  /** Gets the current token value. This is simply the @value field in the
    * #GScanner structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method cur_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TokenValue), @type -> DataRecord(GTokenValue)))"
  )
  private def curValue__ = ???

  /** Frees all memory used by the #GScanner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    g_scanner_destroy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]])
  end destroy

  /** Returns %TRUE if the scanner has reached the end of the file or text
    * buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def eof(): Boolean /* None */ =
    g_scanner_eof(this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]]).value
      .!=(0)
  end eof

  /** Outputs an error message, via the #GScanner message handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method error/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def error__ = ???

  /** Parses the next token just like g_scanner_peek_next_token() and also
    * removes it from the input stream. The token data is placed in the @token, @value, @line,
    * and @position fields of the #GScanner structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNextToken(): sn.gnome.glib.TokenType /* None */ =
    sn.gnome.glib.TokenType.fromRaw(
      g_scanner_get_next_token(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]]
      )
    )
  end getNextToken

  /** Prepares to scan a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inputFile(input_fd: Int /* Some(gint) */ ): Unit /* None */ =
    g_scanner_input_file(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      gint(input_fd)
    )
  end inputFile

  /** Prepares to scan a text buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inputText(
      text: scala.Predef.String /* Some(Ptr[gchar]) */,
      text_len: UInt /* Some(guint) */
  )(using Zone): Unit /* None */ =
    g_scanner_input_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      toCString(text).asInstanceOf[Ptr[gchar]],
      guint(text_len)
    )
  end inputText

  /** Looks up a symbol in the current scope and return its value. If the symbol
    * is not bound in the current scope, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupSymbol(
      symbol: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Ptr[Byte] /* None */ =
    g_scanner_lookup_symbol(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      toCString(symbol).asInstanceOf[Ptr[gchar]]
    ).value
  end lookupSymbol

  /** Parses the next token, without removing it from the input stream. The
    * token data is placed in the @next_token, @next_value, @next_line, and @next_position
    * fields of the #GScanner structure.
    *
    * Note that, while the token is not removed from the input stream (i.e. the
    * next call to g_scanner_get_next_token() will return the same token), it
    * will not be reevaluated. This can lead to surprising results when changing
    * scope or the scanner configuration after peeking the next token. Getting
    * the next token after switching the scope or configuration will return
    * whatever was peeked before, regardless of any symbols that may have been
    * added or removed in the new scope.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekNextToken(): sn.gnome.glib.TokenType /* None */ =
    sn.gnome.glib.TokenType.fromRaw(
      g_scanner_peek_next_token(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]]
      )
    )
  end peekNextToken

  /** Adds a symbol to the given scope.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scopeAddSymbol(
      scope_id: UInt /* Some(guint) */,
      symbol: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: Option[Ptr[Byte] /* Some(gpointer) */ ]
  )(using Zone): Unit /* None */ =
    g_scanner_scope_add_symbol(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      guint(scope_id),
      toCString(symbol).asInstanceOf[Ptr[gchar]],
      value
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end scopeAddSymbol

  /** Calls the given function for each of the symbol/value pairs in the given
    * scope of the #GScanner. The function is passed the symbol and value of
    * each pair, and the given @user_data parameter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method scope_foreach_symbol/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HFunc), @type -> DataRecord(GHFunc)))"
  )
  private def scopeForeachSymbol__ = ???

  /** Looks up a symbol in a scope and return its value. If the symbol is not
    * bound in the scope, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scopeLookupSymbol(
      scope_id: UInt /* Some(guint) */,
      symbol: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Ptr[Byte] /* None */ =
    g_scanner_scope_lookup_symbol(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      guint(scope_id),
      toCString(symbol).asInstanceOf[Ptr[gchar]]
    ).value
  end scopeLookupSymbol

  /** Removes a symbol from a scope.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scopeRemoveSymbol(
      scope_id: UInt /* Some(guint) */,
      symbol: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_scanner_scope_remove_symbol(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      guint(scope_id),
      toCString(symbol).asInstanceOf[Ptr[gchar]]
    )
  end scopeRemoveSymbol

  /** Sets the current scope.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setScope(scope_id: UInt /* Some(guint) */ ): UInt /* None */ =
    g_scanner_set_scope(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      guint(scope_id)
    ).value
  end setScope

  /** Rewinds the filedescriptor to the current buffer position and blows the
    * file read ahead buffer. This is useful for third party uses of the
    * scanners filedescriptor, which hooks onto the current scanning position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def syncFileOffset(): Unit /* None */ =
    g_scanner_sync_file_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]]
    )
  end syncFileOffset

  /** Outputs a message through the scanner's msg_handler, resulting from an
    * unexpected token in the input stream. Note that you should not call
    * g_scanner_peek_next_token() followed by g_scanner_unexp_token() without an
    * intermediate call to g_scanner_get_next_token(), as
    * g_scanner_unexp_token() evaluates the scanner's current token (not the
    * peeked token) to construct part of the message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unexpToken(
      expected_token: sn.gnome.glib.TokenType /* Some(GTokenType) */,
      identifier_spec: scala.Predef.String /* Some(Ptr[gchar]) */,
      symbol_spec: scala.Predef.String /* Some(Ptr[gchar]) */,
      symbol_name: scala.Predef.String /* Some(Ptr[gchar]) */,
      message: scala.Predef.String /* Some(Ptr[gchar]) */,
      is_error: Int /* Some(gint) */
  )(using Zone): Unit /* None */ =
    g_scanner_unexp_token(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GScanner]],
      expected_token.raw,
      toCString(identifier_spec).asInstanceOf[Ptr[gchar]],
      toCString(symbol_spec).asInstanceOf[Ptr[gchar]],
      toCString(symbol_name).asInstanceOf[Ptr[gchar]],
      toCString(message).asInstanceOf[Ptr[gchar]],
      gint(is_error)
    )
  end unexpToken

  /** Outputs a warning message, via the #GScanner message handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method warn/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def warn__ = ???

end Scanner

object Scanner:
  def fromRaw(ptr: Ptr[GScanner]): Scanner = new Scanner(ptr)
end Scanner

// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirKeywordPair extends QuotableKeywordPair {

  @Nullable
  ElixirEmptyParentheses getEmptyParentheses();

  @NotNull
  ElixirKeywordKey getKeywordKey();

  @Nullable
  ElixirUnmatchedExpression getUnmatchedExpression();

  //WARNING: getKeywordKey(...) is skipped
  //matching getKeywordKey(ElixirKeywordPair, ...)
  //methods are not found in ElixirPsiImplUtil

  Quotable getKeywordValue();

  @NotNull
  OtpErlangObject quote();

}

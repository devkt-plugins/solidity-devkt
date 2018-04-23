// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface SolNumberLiteral extends PsiElement {

  @Nullable
  SolNumberUnit getNumberUnit();

  @Nullable
  PsiElement getDecimalNumber();

  @Nullable
  PsiElement getFixedNumber();

  @Nullable
  PsiElement getHexNumber();

  @Nullable
  PsiElement getScientificNumber();

}

// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static me.serce.devkt.solidity.lang.core.SolidityTokenTypes.*;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.serce.devkt.solidity.lang.psi.*;

public class SolNumberTypeImpl extends ASTWrapperPsiElement implements SolNumberType {

  public SolNumberTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitNumberType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getByteNumType() {
    return findChildByType(BYTENUMTYPE);
  }

  @Override
  @Nullable
  public PsiElement getFixedNumType() {
    return findChildByType(FIXEDNUMTYPE);
  }

  @Override
  @Nullable
  public PsiElement getIntNumType() {
    return findChildByType(INTNUMTYPE);
  }

  @Override
  @Nullable
  public PsiElement getUFixedNumType() {
    return findChildByType(UFIXEDNUMTYPE);
  }

  @Override
  @Nullable
  public PsiElement getUIntNumType() {
    return findChildByType(UINTNUMTYPE);
  }

}

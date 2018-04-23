// This is a generated file. Not intended for manual editing.
package me.serce.devkt.solidity.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static me.serce.devkt.solidity.lang.core.SolidityTokenTypes.*;
import me.serce.devkt.solidity.lang.psi.*;

public class SolUserDefinedLocationTypeNameImpl extends SolTypeNameImpl implements SolUserDefinedLocationTypeName {

  public SolUserDefinedLocationTypeNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitUserDefinedLocationTypeName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SolStorageLocation getStorageLocation() {
    return findChildByClass(SolStorageLocation.class);
  }

  @Override
  @Nullable
  public SolUserDefinedTypeName getUserDefinedTypeName() {
    return findChildByClass(SolUserDefinedTypeName.class);
  }

}

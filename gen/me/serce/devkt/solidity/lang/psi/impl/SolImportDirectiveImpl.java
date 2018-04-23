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

public class SolImportDirectiveImpl extends ASTWrapperPsiElement implements SolImportDirective {

  public SolImportDirectiveImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SolVisitor visitor) {
    visitor.visitImportDirective(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SolVisitor) accept((SolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SolImportAlias> getImportAliasList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SolImportAlias.class);
  }

  @Override
  @Nullable
  public SolImportPath getImportPath() {
    return findChildByClass(SolImportPath.class);
  }

  @Override
  @Nullable
  public SolUserDefinedTypeName getUserDefinedTypeName() {
    return findChildByClass(SolUserDefinedTypeName.class);
  }

}

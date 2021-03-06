package com.gshakhn.idea.idea.fitnesse.lang.reference

import com.intellij.psi.{PsiElement, PsiMethod, PsiReferenceBase}
import com.gshakhn.idea.idea.fitnesse.lang.psi.DecisionInput

class DecisionInputReference(psiMethod: PsiMethod, element: DecisionInput) extends PsiReferenceBase[DecisionInput](element) {
  def resolve() = psiMethod

  def getVariants = Array()

  override def handleElementRename(newElementName: String): PsiElement = {
    if (newElementName.startsWith("set")) {
      super.handleElementRename(newElementName.substring(3))
    } else {
      super.handleElementRename(newElementName)
    }
  }
}

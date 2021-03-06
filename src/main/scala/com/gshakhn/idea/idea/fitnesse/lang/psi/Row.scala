package com.gshakhn.idea.idea.fitnesse.lang.psi

import com.intellij.lang.ASTNode
import com.intellij.extapi.psi.ASTWrapperPsiElement

class Row(node: ASTNode) extends ASTWrapperPsiElement(node) {
  def getFixtureClass = findChildByClass(classOf[FixtureClass])

  def getTable = getParent.asInstanceOf[Table]

  def getCells = findChildrenByClass(classOf[Cell])
}

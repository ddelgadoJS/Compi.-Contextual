// Added for the Proyect Number 1.
// Syntax analyzer.
// 04/25/2018

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ProcFuncs extends Declaration {

  public ProcFuncs (Declaration declarationAST, Declaration dAST2, SourcePosition thePosition) {
    super (thePosition);
    D1 = declarationAST;
    D2 = dAST2;
  }

  public Declaration D1, D2;

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitProcFuncs(this,o);
    }

}

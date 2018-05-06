// Added for the Proyect Number 1.
// Syntax analyzer.
// 04/25/2018

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RecDeclaration extends Declaration {

  public RecDeclaration (Declaration dAST,
                    SourcePosition thePosition) {
    super (thePosition);
    D = dAST;
  }

  public Declaration D;

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitRecDeclaration(this,o);
    }
}
// Added for the Proyect Number 1.
// Syntax analyzer.
// 04/25/2018

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public abstract class ProcFunc extends Declaration {

  public ProcFunc (SourcePosition thePosition) {
    super (thePosition);
  }

  public abstract boolean equals(Object fpsAST);
}

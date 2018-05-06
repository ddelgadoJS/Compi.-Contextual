// Added for the Proyect Number 1.
// Syntax analyzer.
// 04/25/2018

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class DoUntilCommand extends Command{
    
    public DoUntilCommand (Command cAST, Expression eAST, SourcePosition thePosition) {
    super (thePosition);
    C = cAST;
    E = eAST;
  }
    
    public Command C;
    public Expression E;

    public Object visit(Visitor v, Object o) {
        return v.visitDoUntilCommand(this, o);
    }
}


// Added for the Proyect Number 1.
// Syntax analyzer.
// 04/25/2018

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Usuario
 */
public class ForCommand extends Command{
    
    public ForCommand (Identifier iAST, Expression eAST1, Expression eAST2, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E1 = eAST1;
    E2 = eAST2;
    C = cAST;
  }
    
    public Identifier I;
    public Expression E1;
    public Expression E2;
    public Command C;

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitForCommand(this, o);
    }
    
}

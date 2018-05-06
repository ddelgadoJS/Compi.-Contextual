// Added for the Proyect Number 1.
// Syntax analyzer.
// 04/25/2018

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author melissavillalobos
 */
public class ElsIfCommand extends Command {
    public ElsIfCommand (Expression eAST1,Command cAST,Command cAST2, SourcePosition thePosition) {
    super (thePosition);
    E1 = eAST1;
    C = cAST;
    C2= cAST2;
  }
    
    public Expression E1;
    public Command C;
    public Command C2;

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitElsIfCommand(this, o);
    }
}

// Added for the Proyect Number 1.
// Syntax analyzer.
// 04/25/2018

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class UntilCommand extends Command {

    
    public UntilCommand(Expression eAST, Command cAST, SourcePosition thePosition) {
        super(thePosition);
        E = eAST;
        C = cAST;
    }

    @Override
    public Object visit(Visitor v, Object o) {
        return v.visitUntilCommand(this, o);
    }
    
    public Expression E;
    public Command C;
}

/* Generated By:JJTree: Do not edit this line. ASTCatchStatement.java */

public class ASTCatchStatement extends SimpleNode {
	ASTFormalParameters formalParameters ;
	ASTBlock block;
	
	ASTTryStatement parentTryStatement;
	String catchExceptionType;
	
	String catchExceptionVarName;
  public ASTCatchStatement(int id) {
    super(id);
  }

  public ASTCatchStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
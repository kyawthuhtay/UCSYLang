/* Generated By:JJTree: Do not edit this line. ASTThrowStatement.java */

public class ASTThrowStatement extends ParentStatement {
	String typeName;
	ASTExpression expression;
	
  public ASTThrowStatement(int id) {
    super(id);
  }

  public ASTThrowStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}

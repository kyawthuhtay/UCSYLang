/* Generated By:JJTree: Do not edit this line. ASTVariableDeclarator.java */

public class ASTVariableDeclarator extends ParentExpression {
	Token t;
	
	ASTVariableDeclaratorId variableDeclaratorId;
	ASTVariableInitializer variableInitializer;
	
	String variableName;
  public ASTVariableDeclarator(int id) {
    super(id);
  }

  public ASTVariableDeclarator(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
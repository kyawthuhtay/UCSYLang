/* Generated By:JJTree: Do not edit this line. ASTForStatement.java */

public class ASTForStatement extends ParentStatement {
	Token t;
	
	ASTForInitializer forInitializer;
	ASTForExpression forExpression;
	ASTForUpdator  forUpdator;
	ASTStatement statement;
  public ASTForStatement(int id) {
    super(id);
  }

  public ASTForStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* Generated By:JJTree: Do not edit this line. ASTStringLiteral.java */

public class ASTStringLiteral extends ParentExpression {
	Token t;
	String value;
  public ASTStringLiteral(int id) {
    super(id);
  }

  public ASTStringLiteral(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* Generated By:JJTree: Do not edit this line. ASTVariableDeclaratorId.java */

public class ASTVariableDeclaratorId extends SimpleNode {
	Token t ;
	String variableName;
  public ASTVariableDeclaratorId(int id) {
    super(id);
  }

  public ASTVariableDeclaratorId(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
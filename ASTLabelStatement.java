/* Generated By:JJTree: Do not edit this line. ASTLabelStatement.java */

public class ASTLabelStatement extends ParentStatement {
	ASTBlock block;
  public ASTLabelStatement(int id) {
    super(id);
  }

  public ASTLabelStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
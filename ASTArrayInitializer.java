/* Generated By:JJTree: Do not edit this line. ASTArrayInitializer.java */

public class ASTArrayInitializer extends ParentExpression {
  public ASTArrayInitializer(int id) {
    super(id);
  }

  public ASTArrayInitializer(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
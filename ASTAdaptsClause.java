/* Generated By:JJTree: Do not edit this line. ASTAdaptsClause.java */

import java.util.*;

public class ASTAdaptsClause extends SimpleNode {
	
	ASTIdentifier identifierInterface ;
	ASTIdentifier identifierClass;
	
	String adaptsClass ;
	String adaptsInterface;
	
	ArrayList<ASTSignatureToCall> signatureToCall = new ArrayList<ASTSignatureToCall>();
	
  public ASTAdaptsClause(int id) {
    super(id);
  }

  public ASTAdaptsClause(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
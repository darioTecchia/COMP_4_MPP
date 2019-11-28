package syntax.expr;


import syntax.AstNode;

public abstract class BinaryOp extends AstNode {

  public BinaryOp(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

}
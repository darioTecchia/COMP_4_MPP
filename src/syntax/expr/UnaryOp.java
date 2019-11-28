package syntax.expr;


import syntax.AstNode;

public abstract class UnaryOp extends AstNode {

  public UnaryOp(int leftLocation, int rightLocation) {
    super(leftLocation, rightLocation);
  }

}
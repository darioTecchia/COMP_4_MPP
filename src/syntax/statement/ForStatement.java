package syntax.statement;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.expr.Id;
import visitor.Visitor;
import syntax.*;

public class ForStatement extends Statement {

  private Id id;
  private Expr initExpr;
  private Expr postConditionExpr; 

  public ForStatement(int leftLocation, int rightLocation, Id id, Expr initExpr, Expr postConditionExpr) {
    super(leftLocation, rightLocation);
    this.id = id;
    this.initExpr = initExpr;
    this.postConditionExpr = postConditionExpr;
  }

  /**
   * @return the id
   */
  public Id getId() {
    return id;
  }

  /**
   * @return the initExpr
   */
  public Expr getInitExpr() {
    return initExpr;
  }

  /**
   * @return the postConditionExpr
   */
  public Expr getPostConditionExpr() {
    return postConditionExpr;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }


  
}
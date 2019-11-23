package syntax;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class FunctionCallStatement extends Statement {

  private Id id;
  private ArrayList<Expr> functionParams;

  public FunctionCallStatement(Location leftLocation, Location rightLocation, Id id, ArrayList<Expr> functionParams) {
    super(leftLocation, rightLocation);
    this.id = id;
    this.functionParams = functionParams;
  }

  /**
   * @return the functionParams
   */
  public ArrayList<Expr> getFunctionParams() {
    return functionParams;
  }

  /**
   * @return the id
   */
  public Id getId() {
    return id;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }


}
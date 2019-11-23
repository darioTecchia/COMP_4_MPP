package syntax;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class Program extends AstNode {

  private Global global;
  private ArrayList<Function> functions;

  public Program(Location leftLocation, Location rightLocation, Global global, ArrayList<Function> functions) {
    super(leftLocation, rightLocation);
    this.global = global;
    this.functions = functions;
  }

  /**
   * @return the global
   */
  public Global getGlobal() {
    return this.global;
  }

  /**
   * @return the functions
   */
  public ArrayList<Function> getFunctions() {
    return this.functions;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}
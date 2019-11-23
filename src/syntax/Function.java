package syntax;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class Function extends AstNode {

  private ArrayList<DefFun> defFuns;

  public Function(Location leftLocation, Location rightLocation, ArrayList<DefFun> defFuns) {
    super(leftLocation, rightLocation);
    this.defFuns = defFuns;
  }

  /**
   * @return the defFuns
   */
  public ArrayList<DefFun> getDefFuns() {
    return defFuns;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}

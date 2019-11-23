package syntax;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class Global extends AstNode {

  private ArrayList<VarDecl> varDecls;

  public Global(Location leftLocation, Location rightLocation, ArrayList<VarDecl> varDecls) {
    super(leftLocation, rightLocation);
    this.varDecls = varDecls;
  }

  /**
   * @return the varDecls
   */
  public ArrayList<VarDecl> getVarDecls() {
    return varDecls;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}

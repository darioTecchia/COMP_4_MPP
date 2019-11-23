package syntax;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class LocalStatement extends Statement {

  private ArrayList<VarDecl> varDecls;
  private ArrayList<Statement> statements;

  public LocalStatement(Location leftLocation, Location rightLocation, ArrayList<VarDecl> varDecls, ArrayList<Statement> statements) {
    super(leftLocation, rightLocation);
    this.varDecls = varDecls;
    this.statements = statements;
  }

  /**
   * @return the statements
   */
  public ArrayList<Statement> getStatements() {
    return statements;
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
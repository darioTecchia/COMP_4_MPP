package syntax;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import syntax.statement.Statement;
import visitor.Visitor;

public class Function extends AstNode {

  private Id id;
  private ArrayList<ParDecl> parDecls;
  private Type type;
  private ArrayList<Statement> statements;

  /**
   * Function definition with params
   */
  public Function(Location leftLocation, Location rightLocation, ArrayList<ParDecl> parDecls, Type type, ArrayList<Statement> statements) {
    super(leftLocation, rightLocation);
    this.parDecls = parDecls;
    this.type = type;
    this.statements = statements;
  }

  /**
   * Function definition without params
   */
  public Function(Location leftLocation, Location rightLocation, Type type, ArrayList<Statement> statements) {
    super(leftLocation, rightLocation);
    this.parDecls = new ArrayList<>();
    this.type = type;
    this.statements = statements;
  }

  /**
   * @return the id
   */
  public Id getId() {
    return id;
  }

  /**
   * @return the parDecls
   */
  public ArrayList<ParDecl> getParDecls() {
    return parDecls;
  }

  /**
   * @return the statements
   */
  public ArrayList<Statement> getStatements() {
    return statements;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return visitor.visit(this, arg);
  }

}

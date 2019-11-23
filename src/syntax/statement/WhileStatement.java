package syntax.statement;

import java.util.ArrayList;

import java_cup.runtime.ComplexSymbolFactory.Location;
import visitor.Visitor;

public class WhileStatement extends Statement {

  private ArrayList<Statement> statements;

  public WhileStatement(Location leftLocation, Location rightLocation, ArrayList<Statement> statements) {
    super(leftLocation, rightLocation);
    this.statements = statements;
  }

  /**
   * @return the statements
   */
  public ArrayList<Statement> getStatements() {
    return statements;
  }

  @Override
  public <T, P> T accept(Visitor<T, P> visitor, P arg) {
    return null;
  }

}
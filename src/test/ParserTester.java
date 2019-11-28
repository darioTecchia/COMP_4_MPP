package test;

import dist.*;

public class ParserTester {

  static Lexer lexer;
  static Parser parser;

  public static void main(String[] args) throws Exception {

    lexer = new Lexer();

    if(lexer.initialize(args[0])) {
      parser = new Parser(lexer);
      System.out.println(parser.debug_parse().value);
    } else {
      System.out.println("File not found!");
    }
  }
}

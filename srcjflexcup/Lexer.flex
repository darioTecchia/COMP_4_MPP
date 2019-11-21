/* JFlex example: part of Java language lexer specification */

import java_cup.runtime.Symbol;
/**
* This class is a simple example lexer.
*/


%%

%class Lexer
%cupsym TokenSym

%cup

%unicode

%line
%column

%{
  StringBuffer string = new StringBuffer();

  private Symbol generateTokenSym(int type) {
    return new Symbol(type);
  }
  private Symbol generateTokenSym(int type, Object value) {
    return new Symbol(type, value);
  }

  // prepara file input per lettura e controlla errori
  public boolean initialize(String filePath) {
    try {
      this.zzReader = new java.io.FileReader(filePath);
      return true;
    } catch (java.io.FileNotFoundException e) {
      return false;
    }
  }

  Lexer() { }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent = ( [^*] | \*+ [^/*] )*

Identifier = [:jletter:] [:jletterdigit:]*

IntegerLiteral = 0 | [1-9][0-9]*

FloatLiteral = (0|[1-9][0-9]*)(\.[0-9]*)?([eE][+\-]?[0-9]+)?

GlobalKeyword = [gG][lL][oO][bB][aA][lL]

%state STRING


%%


<YYINITIAL> {

  /* keywords */
  "function" { return generateTokenSym(TokenSym.FUNCTION) }
  "main" { return generateTokenSym(TokenSym.MAIN) }
  "end" { return generateTokenSym(TokenSym.END) }
  "if" { return generateTokenSym(TokenSym.IF); }
  "then" { return generateTokenSym(TokenSym.THEN); }
  "else" { return generateTokenSym(TokenSym.ELSE); }
  "while" { return generateTokenSym(TokenSym.WHILE); }
  "do" { return generateTokenSym(TokenSym.DO); }
  "for" { return generateTokenSym(TokenSym.FOR); }
  "local" { return generateTokenSym(TokenSym.LOCAL); }
  {GlobalKeyword} { return generateTokenSym(TokenSym.GLOBAL) }
  "<==" { return generateTokenSym(TokenSym.READ); }
  "==>" { return generateTokenSym(TokenSym.WRITE); }
  "return" { return generateTokenSym(TokenSym.RETURN); }
  "true" { return generateTokenSym(TokenSym.TRUE); }
  "false" { return generateTokenSym(TokenSym.FALSE); }
  "not" { return generateTokenSym(TokenSym.NOT); }
  "#" { return generateTokenSym(TokenSym.SHARP); }


  /* Types Keywords */
  "nil" { return generateTokenSym(TokenSym.NIL); }
  "int" { return generateTokenSym(TokenSym.INT); }
  "bool" { return generateTokenSym(TokenSym.BOOL); }
  "float" { return generateTokenSym(TokenSym.FLOAT); }
  "string" { return generateTokenSym(TokenSym.STRING); }

  /* separators */
  "(" { return generateTokenSym(TokenSym.LPAR); }
  ")" { return generateTokenSym(TokenSym.RPAR); }
  "{" { return generateTokenSym(TokenSym.BLPAR); }
  "}" { return generateTokenSym(TokenSym.BRPAR); }
  "[" { return generateTokenSym(TokenSym.SLPAR); }
  "]" { return generateTokenSym(TokenSym.SRPAR); }
  "," { return generateTokenSym(TokenSym.COMMA); }
  ";" { return generateTokenSym(TokenSym.SEMI); }
  ":" { return generateTokenSym(TokenSym.COLON); }

  /* relop */
  "and" { return generateTokenSym(TokenSym.AND); }
  "or" { return generateTokenSym(TokenSym.OR); }
  "<" { return generateTokenSym(TokenSym.LT); }
  "<=" { return generateTokenSym(TokenSym.LE); }
  "=" { return generateTokenSym(TokenSym.EQ); }
  "<>" { return generateTokenSym(TokenSym.NE); }
  ">" { return generateTokenSym(TokenSym.GT); }
  ">=" { return generateTokenSym(TokenSym.GE); }
  "->" { return generateTokenSym(TokenSym.ARROW); }
  "=" { return generateTokenSym(TokenSym.ASSIGN); }
  "==" { return generateTokenSym(TokenSym.EQ); }
  "nop" { return generateTokenSym(TokenSym.NOP); }

  /* arop */
  "+" { return generateTokenSym(TokenSym.PLUS); }
  "-" { return generateTokenSym(TokenSym.MINUS); }
  "*" { return generateTokenSym(TokenSym.TIMES); }
  "/" { return generateTokenSym(TokenSym.DIV); }


  /* identifiers */
  {Identifier} { return generateTokenSym(TokenSym.ID, yytext()); }

  /* literals */
  {IntegerLiteral} { return generateTokenSym(TokenSym.INT_CONST, Integer.parseInt(yytext())); }
  {FloatLiteral} { return generateTokenSym(TokenSym.FLOAT_CONST, Double.parseDouble(yytext())); }
  \" { string.setLength(0); yybegin(STRING); }

  /* comments */
  {Comment} {/* ignore */}

  /* whitespace */
  {WhiteSpace} { /* ignore */ }
}

<STRING> {
  \" {
    yybegin(YYINITIAL); 
    return generateTokenSym(TokenSym.STRING_CONST, 
    string.toString()); 
  }
  [^\n\r\"\\]+ { string.append( yytext() ); }
  \\t { string.append('\t'); }
  \\n { string.append('\n'); }
  \\r { string.append('\r'); }
  \\\" { string.append('\"'); }
  \\  { string.append('\\'); }
}

<<EOF>> { return generateTokenSym(TokenSym.EOF); }

/* error fallback */
[^] { 
  throw new RuntimeException("Error:(" + yyline + ":" + yycolumn + ") Cannot resolve symbol '"+yytext()+"'"); 
}
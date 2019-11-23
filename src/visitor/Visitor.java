package visitor;

import syntax.*;

public interface Visitor<T, P> {

   T visit(Program program, P arg);

   T visit(Global global, P arg);

   T visit(Function function, P arg);

   T visit(DefFun defFun, P arg);

   T visit(ParDecl parDecl, P arg);

   T visit(VarDecl varDecl, P arg);

   T visit(VarInitValue varInitValue, P arg);

   T visit(PrimitiveType primitiveType, P arg);

   T visit(ArrayType arrayType, P arg);

   T visit(FunctionType functionType, P arg);

   T visit(IfThenStatement ifThenStatement, P arg);

   T visit(IfThenElseStatement ifThenElseStatement, P arg);

   T visit(ForStatement forStatement, P arg);

   T visit(AssignStatement assignStatement, P arg);

   T visit(ArrayElemAssignStatement arrayElemAssignStatement, P arg);

   T accept(FunctionCallStatement functionCallStatement, P arg);

   T visit(ReadStatement readStatement, P arg);

   T visit(WriteStatements writeStatements, P arg);

   T accept(ReturnStatement returnStatement, P arg);

   T visit(LocalStatement localStatement, P arg);

}

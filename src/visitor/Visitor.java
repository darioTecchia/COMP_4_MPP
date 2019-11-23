package visitor;

import syntax.*;
import syntax.expr.*;
import syntax.statement.*;
import syntax.type.*;

public interface Visitor<T, P> {

   T visit(Program program, P arg);

   T visit(Global global, P arg);

   T visit(Function function, P arg);

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

   T visit(FunctionCallStatement functionCallStatement, P arg);

   T visit(ReadStatement readStatement, P arg);

   T visit(WriteStatements writeStatements, P arg);

   T visit(ReturnStatement returnStatement, P arg);

   T visit(LocalStatement localStatement, P arg);

   T visit(NilConst nilConst, P arg);

   T visit(BooleanConst booleanConst, P arg);

   T visit(IntegerConst integerConst, P arg);

   T visit(FloatConst floatConst, P arg);

   T visit(StringConst stringConst, P arg);

   T visit(ArrayElemAssignStatement arrayElemAssignStatement, P arg);

   T visit(ArrayRead arrayRead, P arg);

   T visit(FunctionCall functionCall, P arg);

}

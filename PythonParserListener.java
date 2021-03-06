// Generated from PythonParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PythonParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PythonParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(PythonParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(PythonParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(PythonParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(PythonParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code with_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code with_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(PythonParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_or_func_def_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClass_or_func_def_stmt(PythonParser.Class_or_func_def_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_or_func_def_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClass_or_func_def_stmt(PythonParser.Class_or_func_def_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rev_func_def_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRev_func_def_stmt(PythonParser.Rev_func_def_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rev_func_def_stmt}
	 * labeled alternative in {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRev_func_def_stmt(PythonParser.Rev_func_def_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#rev_func}.
	 * @param ctx the parse tree
	 */
	void enterRev_func(PythonParser.Rev_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#rev_func}.
	 * @param ctx the parse tree
	 */
	void exitRev_func(PythonParser.Rev_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rev_expr}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRev_expr(PythonParser.Rev_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rev_expr}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRev_expr(PythonParser.Rev_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rev_alloc}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRev_alloc(PythonParser.Rev_allocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rev_alloc}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRev_alloc(PythonParser.Rev_allocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rev_dealloc}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRev_dealloc(PythonParser.Rev_deallocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rev_dealloc}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRev_dealloc(PythonParser.Rev_deallocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rev_if}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRev_if(PythonParser.Rev_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rev_if}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRev_if(PythonParser.Rev_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rev_for}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRev_for(PythonParser.Rev_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rev_for}
	 * labeled alternative in {@link PythonParser#rev_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRev_for(PythonParser.Rev_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#rev_block}.
	 * @param ctx the parse tree
	 */
	void enterRev_block(PythonParser.Rev_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#rev_block}.
	 * @param ctx the parse tree
	 */
	void exitRev_block(PythonParser.Rev_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#rev_suite}.
	 * @param ctx the parse tree
	 */
	void enterRev_suite(PythonParser.Rev_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#rev_suite}.
	 * @param ctx the parse tree
	 */
	void exitRev_suite(PythonParser.Rev_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#rev_return}.
	 * @param ctx the parse tree
	 */
	void enterRev_return(PythonParser.Rev_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#rev_return}.
	 * @param ctx the parse tree
	 */
	void exitRev_return(PythonParser.Rev_returnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suite_in_line}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite_in_line(PythonParser.Suite_in_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suite_in_line}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite_in_line(PythonParser.Suite_in_lineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suite_new_line}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite_new_line(PythonParser.Suite_new_lineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suite_new_line}
	 * labeled alternative in {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite_new_line(PythonParser.Suite_new_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(PythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void enterElif_clause(PythonParser.Elif_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elif_clause}.
	 * @param ctx the parse tree
	 */
	void exitElif_clause(PythonParser.Elif_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(PythonParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(PythonParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#rev_else}.
	 * @param ctx the parse tree
	 */
	void enterRev_else(PythonParser.Rev_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#rev_else}.
	 * @param ctx the parse tree
	 */
	void exitRev_else(PythonParser.Rev_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(PythonParser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(PythonParser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(PythonParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(PythonParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(PythonParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(PythonParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(PythonParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(PythonParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(PythonParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(PythonParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PythonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PythonParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void enterKwargs(PythonParser.KwargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void exitKwargs(PythonParser.KwargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#def_parameters}.
	 * @param ctx the parse tree
	 */
	void enterDef_parameters(PythonParser.Def_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#def_parameters}.
	 * @param ctx the parse tree
	 */
	void exitDef_parameters(PythonParser.Def_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#def_parameter}.
	 * @param ctx the parse tree
	 */
	void enterDef_parameter(PythonParser.Def_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#def_parameter}.
	 * @param ctx the parse tree
	 */
	void exitDef_parameter(PythonParser.Def_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#named_parameter}.
	 * @param ctx the parse tree
	 */
	void enterNamed_parameter(PythonParser.Named_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#named_parameter}.
	 * @param ctx the parse tree
	 */
	void exitNamed_parameter(PythonParser.Named_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(PythonParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(PythonParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code del_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code del_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pass_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(PythonParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pass_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(PythonParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code raise_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(PythonParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code raise_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(PythonParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code yield_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(PythonParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code yield_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(PythonParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code import_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(PythonParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code import_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(PythonParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code from_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFrom_stmt(PythonParser.From_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code from_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFrom_stmt(PythonParser.From_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code global_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code global_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exec_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(PythonParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exec_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(PythonParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assert_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(PythonParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assert_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(PythonParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonlocal_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonlocal_stmt}
	 * labeled alternative in {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(PythonParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(PythonParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assign_part}.
	 * @param ctx the parse tree
	 */
	void enterAssign_part(PythonParser.Assign_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assign_part}.
	 * @param ctx the parse tree
	 */
	void exitAssign_part(PythonParser.Assign_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(PythonParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(PythonParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(PythonParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(PythonParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(PythonParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(PythonParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(PythonParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(PythonParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#vardef_parameters}.
	 * @param ctx the parse tree
	 */
	void enterVardef_parameters(PythonParser.Vardef_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#vardef_parameters}.
	 * @param ctx the parse tree
	 */
	void exitVardef_parameters(PythonParser.Vardef_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#vardef_parameter}.
	 * @param ctx the parse tree
	 */
	void enterVardef_parameter(PythonParser.Vardef_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#vardef_parameter}.
	 * @param ctx the parse tree
	 */
	void exitVardef_parameter(PythonParser.Vardef_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#varargs}.
	 * @param ctx the parse tree
	 */
	void enterVarargs(PythonParser.VarargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#varargs}.
	 * @param ctx the parse tree
	 */
	void exitVarargs(PythonParser.VarargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#varkwargs}.
	 * @param ctx the parse tree
	 */
	void enterVarkwargs(PythonParser.VarkwargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#varkwargs}.
	 * @param ctx the parse tree
	 */
	void exitVarkwargs(PythonParser.VarkwargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#logical_test}.
	 * @param ctx the parse tree
	 */
	void enterLogical_test(PythonParser.Logical_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#logical_test}.
	 * @param ctx the parse tree
	 */
	void exitLogical_test(PythonParser.Logical_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr9}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr9(PythonParser.Expr9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr9}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr9(PythonParser.Expr9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr8}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr8(PythonParser.Expr8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr8}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr8(PythonParser.Expr8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr7}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr7(PythonParser.Expr7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr7}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr7(PythonParser.Expr7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr6}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr6(PythonParser.Expr6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr6}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr6(PythonParser.Expr6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr5}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr5(PythonParser.Expr5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr5}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr5(PythonParser.Expr5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr4}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr4(PythonParser.Expr4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr4}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr4(PythonParser.Expr4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr3}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(PythonParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr3}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(PythonParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr2}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(PythonParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr2}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(PythonParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr1}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(PythonParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr1}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(PythonParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(PythonParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(PythonParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(PythonParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(PythonParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(PythonParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(PythonParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PythonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PythonParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PythonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PythonParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(PythonParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(PythonParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(PythonParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(PythonParser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(PythonParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(PythonParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PythonParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PythonParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(PythonParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(PythonParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(PythonParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(PythonParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(PythonParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(PythonParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(PythonParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(PythonParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(PythonParser.Comp_iterContext ctx);
}
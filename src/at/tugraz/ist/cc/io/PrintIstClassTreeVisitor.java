package at.tugraz.ist.cc.io;

import at.tugraz.ist.cc.antlr.gen.JovaBaseVisitor;
import at.tugraz.ist.cc.antlr.gen.JovaParser.*;

import java.util.List;

/**
 * Created by riger2311 on 20.03.16.
 */
public class PrintIstClassTreeVisitor extends JovaBaseVisitor {

    private StringBuilder sb = new StringBuilder();

    public String getParseTreeAsString()
    {
        return sb.toString().substring(0, sb.length()-1);
    }

    @Override
    public Object visitClass_decl(Class_declContext ctx)
    {
        sb.append("CLASS "  + ctx.class_head().CLASS_TYPE().getText()
                + " (line:" + ctx.class_head().CLASS_TYPE().getSymbol().getLine() + ")\n");

        visit(ctx.class_body());

        sb.append("ENDCLASS (line:" + ctx.class_body().getStop().getLine() + ")\n");
        return sb;
    }

    public Object visitClass_body(Class_bodyContext ctx) {

        if(ctx.member_decls().getChildCount() >0) {
            sb.append("  MEMBERS:\n");
            visit(ctx.member_decls());
        }

        if(ctx.method_decls().getChildCount() >0) {
            sb.append("  METHODS:\n");
            visit(ctx.method_decls());
        }
        return null;
    }

    public Object visitMember_decl(Member_declContext ctx) {
        sb.append("    "    + ctx.AMOD().getText()
                + " "       + ctx.declaration().type().getText()
                + " "       + ctx.declaration().id_list().getText().replace(",",", ") // todo:
                + " (line:" + ctx.getStart().getLine() + ")\n");
        return null;
    }

    public Object visitMethod_head(Method_headContext ctx) {
        sb.append("    ");
        sb.append(ctx.AMOD().getText() + " " + ctx.type().getText() + " " + ctx.ID().getText());
        visit(ctx.method_params());
        sb.append(" (line:" +ctx.getStart().getLine()+")"+"\n");
        return null;
    }

    public Object visitMethod_params(Method_paramsContext ctx) {
        sb.append("(");
        if (ctx.param_list() != null)
            visit(ctx.param_list());
        sb.append(")");
        return null;
    }

    public Object visitParam_list_element(Param_list_elementContext ctx) {
        visit(ctx.param_list());
        sb.append(", ");
        visit(ctx.param());
        return null;
    }
    public Object visitParam(ParamContext ctx) {
        sb.append(ctx.type().getText());
        sb.append(" ");
        sb.append(ctx.ID().getText());
        return null;
    }
}

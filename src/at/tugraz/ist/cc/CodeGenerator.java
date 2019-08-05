package at.tugraz.ist.cc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by riger2311 on 11.05.16.
 */
public class CodeGenerator extends FileWriter {

    public CodeGenerator(String fileName) throws IOException {
        super(fileName);
    }

    public CodeGenerator(File file) throws IOException {
        super(file);
    }

    public void generateClass(String sourceFile, String className){

        try {
            write(".source noSource \n.class public " + className + "\n.super java/lang/Object\n\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void generateField(String access, String type, String fieldName, Object initValue){
        try {
            write(".field " + access + " " + fieldName + " " + jovaTypeToJasminTypeHeader(type) + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void generateMainConstructor(){
        try {
            write(".method public <init>()V\n" +
                    "aload 0\n" +
                    "invokespecial java/lang/Object/<init>()V return\n" +
                    ".end method\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    //constructor
    public void generateConstructor(String className){

        try {
            write(".method public <init>()V\n.limit stack 1\n.limit locals 1\naload_0\ninvokespecial java/lang/Object/<init>()V\nreturn\n.end method\n\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


//    //method
//    public void generateMethod(String access, String methodName, String returnType){
//        //TODO Parameter?
//        try {
//            if(methodName.equals("main")){
//              write(".method " + access + " static " + methodName + "([Ljava/lang/String;)V\n");
//            }
//            else {
//              write(".method " + access + " " + methodName + "()" + jovaTypeToJasminTypeHeader(returnType) + "\n");
//            }
//          write(".limit stack 50\n.limit locals 50\n");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

    //method end
    public void generateMethodEnd(String methodName, String returnType){
        try {
          write(".end method\n\n");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }



  //assignments =

    //arithmetic +
    // -
    // *
    // /
    // %

    //logic and
    // or
    // not

    //relation ==
    // !=
    // <=
    // <
    // >=
    // >
    // &&
    // ||

    //print

    public String jovaArglistToJasminArgList(String arglist) {
        if (arglist == null)
            return "";

        String[] al = arglist.split(" ");
        String result = "";
        for(String a : al)
        {
            result += jovaTypeToJasminTypeHeader(a);
        }
        result.substring(0,result.length()-1);
        return result;
    }

    public String jovaTypeToJasminTypeReturn(String returnType) {
      switch (returnType){
        case "void": break;
        case "int": return "i";
        case "bool": return "z";
        default: return "a";
      }
        return "a";
    }

    public static String jovaTypeToJasminTypeHeader(String type){
        switch (type.toLowerCase()){
            case "int": return "I";
            case "bool": return "Z";
            case "string": return "Ljava/lang/String;";
            default: return " " + type + ";"; //objects in format: "package/Classname" or arrays in format "[package/Classname"
        }
    }


    //method
    public void writeWithoutExcept(String s){
        try {
            write(s);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

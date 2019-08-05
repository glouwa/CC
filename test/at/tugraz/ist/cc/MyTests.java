package at.tugraz.ist.cc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by riger2311 on 11.05.16.
 */
public class MyTests {
/*
    @Test
    public void testMain() {
        String result = CodeGenerator.generateMain(null, "public", "Test", null);
        String ref = ".source noSource\n" +
                ".class public Test\n.super java/lang/Object\n";
        assertEquals(ref, result);
    }

    @Test
    public void testIntField() {
        String result = CodeGenerator.generateMain(null, "public", "Test", null) +
                CodeGenerator.generateField("public", "INT", "IntField", null);
        String main = ".source noSource\n" +
                ".class public Test\n.super java/lang/Object\n";
        String field = ".field public IntField I\n";
        assertEquals(main + field, result);
    }

    @Test
    public void testBoolField() {
        String result = CodeGenerator.generateMain(null, "public", "Test", null) +
                CodeGenerator.generateField("public", "BOOL", "BoolField", null);
        String main = ".source noSource\n" +
                ".class public Test\n.super java/lang/Object\n";
        String field = ".field public BoolField Z\n";
        assertEquals(main+field, result);
    }

    @Test
    public void testStringField() {
        String result = CodeGenerator.generateMain(null, "public", "Test", null) +
                CodeGenerator.generateField("public", "String", "StringField", null);
        String main = ".source noSource\n" +
                ".class public Test\n.super java/lang/Object\n";
        String field = ".field public StringField Ljava/lang/String;\n";
        assertEquals(main+field, result);
    }

    @Test
    public void testObjectField() {
        String result = CodeGenerator.generateMain(null, "public", "Test", null) +
                CodeGenerator.generateField("public", "com.Npluseins/Test", "ObjectField", null);
        String main = ".source noSource\n" +
                ".class public Test\n.super java/lang/Object\n";
        String field = ".field public ObjectField com.Npluseins/Test;\n";
        assertEquals(main + field, result);
    }

    @Test
    public void testObjectArrayField() {
        String result = CodeGenerator.generateMain(null, "public", "Test", null) +
                CodeGenerator.generateField("public", "[com.Npluseins/Test", "ObjectField", null);
        String main = ".source noSource\n" +
                ".class public Test\n.super java/lang/Object\n";
        String field = ".field public ObjectField [com.Npluseins/Test;\n";
        assertEquals(main + field, result);
    }

    @Test
    public void testConstructor(){
        String result = CodeGenerator.generateMain(null, "public", "Test", null) +
                CodeGenerator.generateConstructor("Test");
        String main = ".source noSource\n" +
                ".class public Test\n.super java/lang/Object\n";
        String constructor = "new Test\ndup\ninvokespecial Test/<init>()V\n";
        assertEquals(main + constructor, result);
    }
*/

}

.source noSource 
.class public Main
.super java/lang/Object

.method public <init>()V
.limit stack 1
.limit locals 1
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 50
.limit locals 50
new Nested
dup
invokespecial Nested/<init>()V

astore 1
aload 1
invokevirtual Nested/nestedIsland()I

return
.end method

np
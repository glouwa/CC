.source noSource
.class public Simple
.super java/lang/Object

.method public <init>()V
aload_0
invokespecial java/lang/Object/<init>()V
return
.end method

.method public simple()I
.limit stack 5
.limit locals 2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Ultra hard simplified\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
ldc 0
ireturn
.end method
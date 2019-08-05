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
new Evaluation
dup
invokespecial Evaluation/<init>()V
astore 1

aload 1
invokevirtual Evaluation/init()I
istore 2

aload 1
ldc "This course was so cool, I want to do it again next year!\n"
ldc 716077
invokevirtual Evaluation/setEvalMsg(Ljava/lang/String;I)I
istore 2

aload 1
ldc "jk. Im glad its over..."
ldc 716077
invokevirtual Evaluation/setEvalMsg(Ljava/lang/String;I)I
istore 2

ldc 0
return

.end method


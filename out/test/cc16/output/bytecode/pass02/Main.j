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
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Set it to W for WUMBO!\n"

invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
ldc 0

istore 1
ldc true

zstore 2
zload 2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "MAGNIFY!\n"

invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
ldc 0

istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "EEEVIL!\n"

invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
ldc 0

istore 1
ldc 0

return
.end method


.source noSource
.class public Main
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 2
.limit locals 4
  new JonSnow
  dup
  invokespecial JonSnow/<init>()V
  astore 3
  aload 3
  invokevirtual JonSnow/getKnowledge()LKnowledge;
  astore 2
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "So... what does Jon Snow know?\n"
  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  ldc 0
  istore 1
  aload 2
  aconst_null
  if_acmpeq L_0
  ldc 0
  goto L_1
  L_0:
  ldc 1
  L_1:
  ifeq L_2
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "He knows nix.\n"
  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  ldc 0
  istore 1
  goto L_3
  L_2:
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "He knows somethin... wait, what?!\n"
  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  ldc 0
  istore 1
  L_3:
  return
.end method

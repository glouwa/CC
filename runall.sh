#!/bin/bash
echo "Clean and compile"
ant clean
ant compile

CLASS_PATH=".:../lib/antlr-4.5-complete.jar"
MAIN="at.tugraz.ist.cc.Main"

cd bin

TYPE="lexer"
for f in ../test/input/lexer/*.jova; do
        echo "$TYPE $f *********************************************************************************"
        java -cp $CLASS_PATH $MAIN $TYPE $f true
done

TYPE="parser"
for f in ../test/input/parser/*.jova; do
        echo "$TYPE $f *********************************************************************************"
        java -cp $CLASS_PATH $MAIN $TYPE $f true
done

TYPE="typeChecking"
for f in ../test/input/typeChecking/*.jova; do
        echo "$TYPE $f *********************************************************************************"
        java -cp $CLASS_PATH $MAIN $TYPE $f true
done

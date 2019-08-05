#!/bin/bash

if [ $# -ne 2 ]; then
    echo "=================================="
    echo "Two arguments needed, for example:"
    echo "run.sh lexer fail01"
    echo "run.sh parser pass03"
    echo "=================================="
    exit 1
fi

TYPE=$1
FILE=`basename $2 .jova`
DEBUG="true"

CLASS_PATH=".:../lib/antlr-4.5-complete.jar"
MAIN="at.tugraz.ist.cc.Main"

JOVA_FILE="../test/input/${TYPE}/${FILE}.jova"
REF_FILE="../test/ref/${TYPE}/${FILE}.out"
OUT_FILE="../test/output/${TYPE}/${FILE}.out"

cd bin

# Work around wrong reference output files.
TEMP_FILE="mktemp"
SANITIZED=`cat ${REF_FILE} | sed "s/\bTYPE\b/PRIMITIVE_TYPE/g" | sed "s/ASSIGNOP/ASSIGN/g" > ${TEMP_FILE}`
REF_FILE=$TEMP_FILE

java -cp $CLASS_PATH $MAIN $TYPE $JOVA_FILE true > $OUT_FILE
DIFF=`diff -b -B $REF_FILE $OUT_FILE`

if [ -n "${DIFF}" ]; then
    echo "******* FAILED ${JOVA_FILE} *******"
    echo "${DIFF}"
    echo "***********************************"

    if [ -n "${DIFF_TOOL}" ]; then
        ${DIFF_TOOL} $REF_FILE $OUT_FILE &> /dev/null
    fi

    rm $TEMP_FILE
    exit 1
else
    rm $TEMP_FILE
    exit 0
fi

#!/bin/bash
echo "Clean and compile"
ant clean
ant compile

echo "LEXER TESTS..."
for filename_lexer in test/input/lexer/*.jova; do
        ./run.sh lexer $filename_lexer
done

echo "PARSER TESTS..."
#for filename_parser in test/input/parser/*.jova; do
#        if ![$filename_parser == "fail04.jova" || $filename_parser == "fail06.jova"]; then
#            echo "$filename_parser begin"
#            ./run.sh parser $filename_parser
#        fi
#done
./run.sh parser "test/input/parser/fail01.jova"
./run.sh parser "test/input/parser/fail02.jova"
./run.sh parser "test/input/parser/fail03.jova"
#./run.sh parser "test/input/parser/fail04.jova"
./run.sh parser "test/input/parser/fail05.jova"
#./run.sh parser "test/input/parser/fail06.jova"
./run.sh parser "test/input/parser/pass01.jova"
./run.sh parser "test/input/parser/pass02.jova"
./run.sh parser "test/input/parser/pass03.jova"
./run.sh parser "test/input/parser/pass04.jova"
./run.sh parser "test/input/parser/pass05.jova"


echo "TYPECHECKER TESTS..."
./run.sh typeChecking "test/input/typeChecking/fail01.jova"
./run.sh typeChecking "test/input/typeChecking/fail02.jova"
./run.sh typeChecking "test/input/typeChecking/fail03.jova"
./run.sh typeChecking "test/input/typeChecking/fail04.jova"
./run.sh typeChecking "test/input/typeChecking/fail05.jova"
./run.sh typeChecking "test/input/typeChecking/fail06.jova"
./run.sh typeChecking "test/input/typeChecking/ownFail07.jova"
./run.sh typeChecking "test/input/typeChecking/ownFail08.jova"
#./run.sh typeChecking "test/input/typeChecking/ownFail09.jova"
#./run.sh typeChecking "test/input/typeChecking/ownFail10.jova"
#./run.sh typeChecking "test/input/typeChecking/ownFail11.jova"

./run.sh typeChecking "test/input/typeChecking/pass01.jova"
./run.sh typeChecking "test/input/typeChecking/pass02.jova"
./run.sh typeChecking "test/input/typeChecking/pass03.jova"
./run.sh typeChecking "test/input/typeChecking/pass04.jova"
./run.sh typeChecking "test/input/typeChecking/pass05.jova"
./run.sh typeChecking "test/input/typeChecking/ownPass06.jova"
./run.sh typeChecking "test/input/typeChecking/ownPass07.jova"
./run.sh typeChecking "test/input/typeChecking/ownPass08.jova"

#for filename_parser in test/input/typeChecking/*.jova; do
#        ./run.sh typeChecking $filename_parser
#done
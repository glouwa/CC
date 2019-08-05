#!/bin/bash

ant run -Dtask=bytecode -Dfile="test/input/bytecode/pass01/pass01.jova" -Ddebug=false
ant run -Dtask=bytecode -Dfile="test/input/bytecode/pass02/pass02.jova" -Ddebug=false
ant run -Dtask=bytecode -Dfile="test/input/bytecode/pass05/pass05.jova" -Ddebug=false
ant jasmin-all

ant run-jova -Dpath="test/output/bytecode/pass01" -Dclass="Main"
ant run-jova -Dpath="test/output/bytecode/pass02" -Dclass="Main"
ant run-jova -Dpath="test/output/bytecode/pass05" -Dclass="Main"

##java -cp test/input/bytecode/pass01 Main
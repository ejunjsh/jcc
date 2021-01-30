# jcc

a java compiler and interpreter

## compile

    mvn compile

## compile java

    mvn exec:java -Dexec.mainClass=com.sky.jcc.compiler.CodeGenerationMain -Dexec.args=RecursiveSum.java

## interprete run 

    mvn exec:java -Dexec.mainClass=com.sky.jcc.interpreter.JccInterpreter -Dexec.args=RecursiveSum.jcc

:) enjoy
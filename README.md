# jcc

a java compiler and interpreter

## compile jcc

    mvn compile

## compile RecursiveSum.java

    mvn exec:java -Dexec.mainClass=com.sky.jcc.compiler.CodeGenerationMain -Dexec.args=RecursiveSum.java

output:

    The following program does: 
	 ->Syntax Tree build 
	 ->Symbol Table construction 
	 ->Type checking 
	 ->Code Generation 

    Processing file: RecursiveSum.java
    
        Symbol Table:
    
    +-------------------------------------------------------------------------------------------+
    ID                           RECORD                            SCOPE
    +-------------------------------------------------------------------------------------------+
    RecursiveSum             RecursiveSum - class                    prog [ program ]
    Test                     Test - class                    prog [ program ]
    main                    main - public              RecursiveSum [ class ]
    sum                        sum - int                      Test [ class ]
    num                        num - int                      sum [ method ]
    sum                        sum - int                      sum [ method ]
    +-------------------------------------------------------------------------------------------+
    
    Generated code
    ==============
    
    Method: RecursiveSum.main
    0  ICONST            10
    1  INVOKEVIRTUAL     Test.sum
    2  PRINT             
    3  STOP
    
    Method: Test.sum
    #0 = num  #1 = sum
    0  ISTORE            #0
    1  ILOAD             #0
    2  ICONST            2  
    3  ILT               
    4  IF_FALSE          8  
    5  ICONST            1  
    6  ISTORE            #1
    7  GOTO              15
    8  ILOAD             #0
    9  ILOAD             #0
    10 ICONST            1  
    11 ISUB              
    12 INVOKEVIRTUAL     Test.sum
    13 IADD              
    14 ISTORE            #1
    15 ILOAD             #1
    16 IRETURN
    
    Program compiled into: RecursiveSum.jcc

## interprete run RecursiveSum.jcc

    mvn exec:java -Dexec.mainClass=com.sky.jcc.interpreter.JccInterpreter -Dexec.args=RecursiveSum.jcc

output:

    The following program does: 
	 ->Code interpretation 

    Interpreting file: RecursiveSum.jcc

    55
    
:) enjoy

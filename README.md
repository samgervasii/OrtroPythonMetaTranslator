# OrtroPythonMetaTranslator opy -> py

Source of the g4 python files: https://github.com/antlr/grammars-v4

I'd like to say a special thank you to all his creators and contributors

To regenate classes from grammar (considering antlr4 as command)
```
antlr4 *.g4 -visitor
```

Compile all with 
```
javac *.java
```
then run with
```
java OrtroPythonTranslator {1} {2}
```
where {1} = input path and {2} = outputh path

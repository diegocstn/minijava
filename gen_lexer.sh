rm -rf javacc_output
mkdir javacc_output
#java -cp javacc-6.0/bin/lib/javacc.jar jjtree minijava.jjt
java -cp javacc-6.0/bin/lib/javacc.jar javacc -STATIC=false minijava.jj
mv ./*.java ./MiniJavaCompiler/src/main/java/com/diegocostantino/minijava/lexer

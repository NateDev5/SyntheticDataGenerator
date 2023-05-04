antlr4 -Dlanguage=TypeScript ./src/grammar/DataStructureGrammarLexer.g4 -o ./src/grammar/
antlr4 -Dlanguage=TypeScript -no-listener -visitor ./src/grammar/DataStructureGrammarParser.g4 -o ./src/grammar/
tsc
parser grammar DataStructureGrammarParser;
options { tokenVocab=DataStructureGrammarLexer; }

program: syntax+ EOF;

syntax: declaration;

declaration: (variables | statements) SEMICOLON;

statements: functions;

functions: createInterface 
| requirePlugin 
| createMutator 
| createWeightedMutator 
| generate 
| generateWithMutators;

array: LSQRBRAKET (any (',' any)*)? RSQRBRAKET;

any: (STRING | FLOAT | INT | ID | BOOL);

//Declerations
variables:
	STRING_TYPE ID SET STRING //String
	| INT_TYPE ID SET INT //Integer
	| BOOL_TYPE ID SET BOOL // Boolean
	| PATH_TYPE ID SET STRING // File Path
	| JSONFILE_TYPE ID SET STRING // Json File
	| FLOAT_TYPE ID SET FLOAT // Float
	| MUTATOR_TYPE ID SET (createMutator | createWeightedMutator) // Mutator
	| INTERFACE_TYPE ID SET (createInterface) // Interface
	| ARRAY_TYPE ID SET array // Array
;
// Statements
createInterface:
	CREATE_INTERFACE LPAREN STRING COMMA (STRING | ID) RPAREN;

createMutator:
	CREATE_MUTATOR LPAREN STRING COMMA (FLOAT | ID) RPAREN;

createWeightedMutator:
	CREATE_WEIGHTED_MUTATOR LPAREN STRING COMMA (FLOAT | ID) RPAREN;

generate:
	GENERATE LPAREN (STRING | ID) COMMA INT RPAREN;

generateWithMutators:
	GENERATE_WITH_MUTATORS LPAREN (STRING | ID) COMMA array COMMA INT RPAREN;

requirePlugin:
	REQUIRE_PLUGIN LPAREN STRING RPAREN;
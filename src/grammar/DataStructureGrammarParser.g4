parser grammar DataStructureGrammarParser;
options {
	tokenVocab = DataStructureGrammarLexer;
}

program: syntax+ EOF;

syntax: declaration;

declaration: (variables | statements) SEMICOLON;

statements: functions;

functions:
	createInterface
	| requirePlugin
	| createMutator
	| createWeightedMutator
	| generate
	| generateWithMutators
	| setDefault
	| createRangeMutator
	;

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
	| MUTATOR_TYPE ID SET (
		createMutator
		| createWeightedMutator
		| createRangeMutator
	) // Mutator
	| INTERFACE_TYPE ID SET (createInterface) // Interface
	| ARRAY_TYPE ID SET array ; // Array

// Statements
// CREATE_INTERFACE (STRING, STRING)
// CREATE_INTERFACE (STRING, ID)
createInterface:
	CREATE_INTERFACE LPAREN STRING COMMA (STRING | ID) RPAREN;

// CREATE_MUTATOR (STRING)
// CREATE_MUTATOR (STRING)
createMutator:
	CREATE_MUTATOR LPAREN STRING RPAREN;

// CREATE_RANGE_MUTATOR (STRING)
createRangeMutator:
	CREATE_RANGE_MUTATOR LPAREN STRING RPAREN;

// CREATE_WEIGHTED_MUTATOR (STRING, FLOAT)
// CREATE_WEIGHTED_MUTATOR (STRING, ID)
createWeightedMutator:
	CREATE_WEIGHTED_MUTATOR LPAREN STRING COMMA (FLOAT | ID) RPAREN;

// GENERATE (STRING, INT)
// GENERATE (ID, INT)
generate: GENERATE LPAREN (STRING | ID) COMMA INT RPAREN;

// GENERATE_WITH_MUTATORS (STRING, ARRAY, INT)
// GENERATE_WITH_MUTATORS (ID, ARRAY, INT)
generateWithMutators:
	GENERATE_WITH_MUTATORS LPAREN (STRING | ID) COMMA array COMMA INT COMMA INT COMMA INT RPAREN;

// REQUIRE_PLUGIN (STRING)
requirePlugin: REQUIRE_PLUGIN LPAREN STRING RPAREN;

// SET_DEFAULT (STRING, ANY)
// SET_DEFAULT (STRING, FLOAT, FLOAT)
setDefault: SET_DEFAULT LPAREN STRING COMMA array RPAREN;
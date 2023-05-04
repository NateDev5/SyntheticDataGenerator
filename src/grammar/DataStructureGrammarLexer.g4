lexer grammar DataStructureGrammarLexer;

fragment NOT: '!';
fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];
fragment LETTERS: [a-zA-Z];
fragment DIGITS: [0-9];
fragment JSON: '.json';

// KEEP IN THAT ORDER
// Types
BOOL_TYPE: 'bool';
INT_TYPE: 'int';
STRING_TYPE: 'string';
JSONFILE_TYPE: 'jsonfile';
PATH_TYPE: 'path';
MUTATOR_TYPE: 'mutator';
INTERFACE_TYPE: 'interface';
FLOAT_TYPE: 'float';
ARRAY_TYPE: 'array';

// KEEP IN THAT ORDER
// Keywords
IF: 'if';
ELSE: 'else';
WHILE: 'while';
PRINT: 'print';
FUNCTION: 'func';
BOOL: TRUE | FALSE;
TRUE: 'true' | '0';
FALSE: 'false' | '1';

// KEEP IN THAT ORDER
// Functions
CREATE_INTERFACE: 'CREATE_INTERFACE';
REQUIRE_PLUGIN: 'REQUIRE_PLUGIN';
CREATE_MUTATOR: 'CREATE_MUTATOR';
CREATE_WEIGHTED_MUTATOR: 'CREATE_WEIGHTED_MUTATOR';
GENERATE: 'GENERATE';
GENERATE_WITH_MUTATORS: 'GENERATE_WITH_MUTATORS';


ID: [a-zA-Z] [a-zA-Z0-9_]*; // Identifiers
INT: '-'? DIGITS+; // Integer
FLOAT: '-'? DIGITS* '.' DIGITS+; // Float
STRING:
	DOUBLEQUOTE (~["\r\n] | '\\\\' .)* DOUBLEQUOTE; // String (Old: DOUBLEQUOTE (~["\\\r\n] | '\\\\' .)* DOUBLEQUOTE)

/*FILE_PATH:
	DOUBLEQUOTE FILE_PATH_SEGMENT DOUBLEQUOTE; // File path
FILE_PATH_JSON:
	DOUBLEQUOTE FILE_PATH_SEGMENT* JSON DOUBLEQUOTE; // Json file path
FILE_PATH_SEGMENT : ~["\\\r\n] ~["\\\r\n]* '\\';*/


// Symbols
SET: '->';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
EQ: '==';
COMMA: ',';
NE: '!=';
ASSIGN: '=';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LSQRBRAKET: '[';
RSQRBRAKET: ']';
SEMICOLON: ';';
COLON: ':';
DOUBLEQUOTE: '"';

COMMENT
   : '#' ~ [\r\n]* -> skip
   ;

WS: [ \t\n\r\f]+ -> skip;
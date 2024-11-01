STRING: '"' (~["\\\r\n] | '\\\\' .)* '"';
FILE_PATH: 'PATH' [a-zA-Z0-9_\\]+;
BOOL: 'true' | 'false';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
SET: '->';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
EQ: '==';
NE: '!=';
ASSIGN: '=';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
PRINT: 'print';
FUNCTION: 'func';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
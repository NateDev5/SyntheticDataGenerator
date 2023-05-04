%%lex
%{
  let x: string = "";
%}

digit       [0-9]
letter      [a-zA-Z]
id          {letter}({letter}|{digit})*
int         {digit}+
bool        true|false
ws          [ \t\n\r]+

%%

{id}           { x = yytext; return 'ID'; }
{int}          { x = yytext; return 'INT'; }
{bool}         { x = yytext; return 'BOOL'; }
"+"            { return 'PLUS'; }
"-"            { return 'MINUS'; }
"*"            { return 'TIMES'; }
"/"            { return 'DIVIDE'; }
">"            { return 'GT'; }
">="           { return 'GE'; }
"<"            { return 'LT'; }
"<="           { return 'LE'; }
"=="           { return 'EQ'; }
"!="           { return 'NE'; }
"="            { return 'ASSIGN'; }
"if"           { return 'IF'; }
"else"         { return 'ELSE'; }
"while"        { return 'WHILE'; }
"print"        { return 'PRINT'; }
"("            { return 'LPAREN'; }
")"            { return 'RPAREN'; }
"{"            { return 'LBRACE'; }
"}"            { return 'RBRACE'; }
";"            { return 'SEMICOLON'; }
{ws}           { /* ignore whitespace */ }
.              { /* ignore everything else */ }

%%

function yylex() {
  let token = yylexer.lex();
  if (token) {
    return [token, x];
  } else {
    return ['EOF', ''];
  }
}

export function setInput(input: string) {
  yylexer.setInput(input);
}

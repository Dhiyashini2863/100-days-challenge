%{
#include<stdio.h>
%}
num [0-9]
letter [a-zA-Z]
scmt [/]{1}[/]{1}({num}|{letter})*
mcmt [/]{1}[*]{1}({num}|{letter})*[*]{1}[/]{1}
%%
{scmt} {printf("\n Single Line Comment");}
{mcmt} {printf("\n Multi Line Comment");}
%%
void main()
{
 yylex();
}
int yywrap()
{
 return 1;
}

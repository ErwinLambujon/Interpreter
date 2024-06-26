package Analysis.TokenDataTypes;



public enum TokenType {
    // Keyword
    BEGIN, END, CODE, IF, ELSE, WHILE, DISPLAY, SCAN, AND, OR, NOT,

    // Data Type
    INT, FLOAT, CHAR, BOOL,

    // Identifier
    IDENTIFIER,

    // Literal
    INTLITERAL, FLOATLITERAL, CHARLITERAL, BOOLLITERAL, STRINGLITERAL,

    // Symbol
    COMMA, EQUAL, COLON, QUOTE, APOSTROPHE, POUND, DOLLAR, AMPERSAND,

    // Arithmetic Operators
    OPENPARENTHESIS, CLOSEPARENTHESIS, STAR, SLASH, MODULO, PLUS, MINUS,

    // Comparison Operators
    GREATERTHAN, LESSTHAN, GREATEREQUAL, LESSEQUAL, EQUALTO, NOTEQUAL,

    // Other
    NEWLINE, ESCAPE, ERROR, ENDOFFILE
}

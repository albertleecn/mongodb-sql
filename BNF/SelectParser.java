// Output created by jacc on Mon May 15 10:14:13 CST 2017

package xxx.xxx.xxx;

class SelectParser implements SelectTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    switch (yytok) {
                        case SELECT:
                            yyn = 4;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 208;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    switch (yytok) {
                        case FROM:
                            yyn = 6;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 12;
                            continue;
                        case NUMBER:
                            yyn = 13;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                        case '*':
                            yyn = 15;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    switch (yytok) {
                        case WHERE:
                            yyn = 17;
                            continue;
                        case ENDINPUT:
                        case ')':
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 19;
                            continue;
                        case '(':
                            yyn = 20;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    switch (yytok) {
                        case ',':
                            yyn = 21;
                            continue;
                        case FROM:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case AS:
                            yyn = 23;
                            continue;
                        case ',':
                        case FROM:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case AS:
                            yyn = 23;
                            continue;
                        case ',':
                        case FROM:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    switch (yytok) {
                        case AS:
                            yyn = 23;
                            continue;
                        case ',':
                        case FROM:
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 26;
                            continue;
                        case NUMBER:
                            yyn = 27;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    switch (yytok) {
                        case FROM:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 122:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 54;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                        case WHERE:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    switch (yytok) {
                        case SELECT:
                            yyn = 4;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 12;
                            continue;
                        case NUMBER:
                            yyn = 13;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 58;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    switch (yytok) {
                        case SINGLEQUOTE:
                            yyn = 59;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    switch (yytok) {
                        case SINGLEQUOTE:
                            yyn = 60;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    switch (yytok) {
                        case IS:
                            yyn = 61;
                            continue;
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr24();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    switch (yytok) {
                        case AND:
                            yyn = 62;
                            continue;
                        case ENDINPUT:
                        case OR:
                        case ')':
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr22();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr32();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr37();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr34();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr36();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    switch (yytok) {
                        case OR:
                            yyn = 70;
                            continue;
                        case ENDINPUT:
                        case ')':
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case '(':
                            yyn = 20;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    switch (yytok) {
                        case '(':
                            yyn = 73;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                        case WHERE:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                        case WHERE:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    switch (yytok) {
                        case ')':
                            yyn = 79;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case FALSE:
                            yyn = 81;
                            continue;
                        case NOT:
                            yyn = 82;
                            continue;
                        case TRUE:
                            yyn = 83;
                            continue;
                        case UNKNOWN:
                            yyn = 84;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 12;
                            continue;
                        case NUMBER:
                            yyn = 13;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                        case NULL:
                            yyn = 51;
                            continue;
                        case '(':
                            yyn = 87;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 12;
                            continue;
                        case NUMBER:
                            yyn = 13;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                        case NULL:
                            yyn = 51;
                            continue;
                        case '(':
                            yyn = 87;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case NULL:
                            yyn = 89;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case '=':
                            yyn = 90;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr56();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr44();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr43();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    switch (yytok) {
                        case ')':
                            yyn = 95;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr41();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr23();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case ')':
                            yyn = 96;
                            continue;
                        case ',':
                            yyn = 97;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case OR:
                            yyn = 70;
                            continue;
                        case ')':
                            yyn = 98;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr25();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr28();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case FALSE:
                            yyn = 81;
                            continue;
                        case TRUE:
                            yyn = 83;
                            continue;
                        case UNKNOWN:
                            yyn = 84;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr27();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr29();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    switch (yytok) {
                        case SELECT:
                            yyn = 4;
                            continue;
                        case IDENTIFIER:
                            yyn = 12;
                            continue;
                        case NUMBER:
                            yyn = 13;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                        case NULL:
                            yyn = 51;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case AND:
                            yyn = 101;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr42();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr57();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr60();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr58();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr62();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    switch (yytok) {
                        case AND:
                            yyn = 62;
                            continue;
                        case ENDINPUT:
                        case OR:
                        case ')':
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 12;
                            continue;
                        case NUMBER:
                            yyn = 13;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                        case NULL:
                            yyn = 51;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr31();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr50();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 12;
                            continue;
                        case NUMBER:
                            yyn = 13;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 14;
                            continue;
                        case NULL:
                            yyn = 51;
                            continue;
                        case '(':
                            yyn = 87;
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr51();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 211;
                    continue;

                case 208:
                    return true;
                case 209:
                    yyerror("stack overflow");
                case 210:
                    return false;
                case 211:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys12() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case FROM:
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case '=':
            case AS:
            case ENDINPUT:
            case AND:
                return yyr63();
        }
        return 211;
    }

    private int yys13() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case FROM:
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case '=':
            case AS:
            case ENDINPUT:
            case AND:
                return yyr64();
        }
        return 211;
    }

    private int yys17() {
        switch (yytok) {
            case IDENTIFIER:
                return 12;
            case NUMBER:
                return 13;
            case SINGLEQUOTE:
                return 14;
            case EXISTS:
                return 47;
            case IN:
                return 48;
            case LIKE:
                return 49;
            case NOT:
                return 50;
            case NULL:
                return 51;
            case '(':
                return 52;
        }
        return 211;
    }

    private int yys35() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case BETWEEN:
            case ')':
            case '!':
            case '=':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr54();
        }
        return 211;
    }

    private int yys39() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case BETWEEN:
            case ')':
            case '!':
            case '=':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr53();
        }
        return 211;
    }

    private int yys41() {
        switch (yytok) {
            case '>':
            case OR:
            case '=':
            case '<':
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr47();
        }
        return 211;
    }

    private int yys42() {
        switch (yytok) {
            case BETWEEN:
                return 64;
            case IS:
                return 65;
            case '!':
                return 66;
            case '<':
                return 67;
            case '=':
                return 68;
            case '>':
                return 69;
        }
        return 211;
    }

    private int yys43() {
        switch (yytok) {
            case '>':
            case OR:
            case '=':
            case '<':
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr45();
        }
        return 211;
    }

    private int yys45() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case BETWEEN:
            case ')':
            case '!':
            case '=':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr52();
        }
        return 211;
    }

    private int yys46() {
        switch (yytok) {
            case '>':
            case OR:
            case '=':
            case '<':
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr48();
        }
        return 211;
    }

    private int yys50() {
        switch (yytok) {
            case IDENTIFIER:
                return 12;
            case NUMBER:
                return 13;
            case SINGLEQUOTE:
                return 14;
            case EXISTS:
                return 47;
            case IN:
                return 48;
            case LIKE:
                return 49;
            case NULL:
                return 51;
            case '(':
                return 52;
        }
        return 211;
    }

    private int yys51() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case BETWEEN:
            case ')':
            case '!':
            case '=':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr55();
        }
        return 211;
    }

    private int yys52() {
        switch (yytok) {
            case SELECT:
                return 4;
            case IDENTIFIER:
                return 12;
            case NUMBER:
                return 13;
            case SINGLEQUOTE:
                return 14;
            case EXISTS:
                return 47;
            case IN:
                return 48;
            case LIKE:
                return 49;
            case NOT:
                return 50;
            case NULL:
                return 51;
            case '(':
                return 52;
        }
        return 211;
    }

    private int yys59() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case FROM:
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case '=':
            case AS:
            case ENDINPUT:
            case AND:
                return yyr65();
        }
        return 211;
    }

    private int yys60() {
        switch (yytok) {
            case '>':
            case OR:
            case '<':
            case ',':
            case FROM:
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case '=':
            case AS:
            case ENDINPUT:
            case AND:
                return yyr66();
        }
        return 211;
    }

    private int yys62() {
        switch (yytok) {
            case IDENTIFIER:
                return 12;
            case NUMBER:
                return 13;
            case SINGLEQUOTE:
                return 14;
            case EXISTS:
                return 47;
            case IN:
                return 48;
            case LIKE:
                return 49;
            case NOT:
                return 50;
            case NULL:
                return 51;
            case '(':
                return 52;
        }
        return 211;
    }

    private int yys67() {
        switch (yytok) {
            case '=':
                return 91;
            case '>':
                return 92;
            case IDENTIFIER:
            case NUMBER:
            case NULL:
            case '(':
            case SINGLEQUOTE:
                return yyr59();
        }
        return 211;
    }

    private int yys69() {
        switch (yytok) {
            case '=':
                return 93;
            case IDENTIFIER:
            case NUMBER:
            case NULL:
            case '(':
            case SINGLEQUOTE:
                return yyr61();
        }
        return 211;
    }

    private int yys70() {
        switch (yytok) {
            case IDENTIFIER:
                return 12;
            case NUMBER:
                return 13;
            case SINGLEQUOTE:
                return 14;
            case EXISTS:
                return 47;
            case IN:
                return 48;
            case LIKE:
                return 49;
            case NOT:
                return 50;
            case NULL:
                return 51;
            case '(':
                return 52;
        }
        return 211;
    }

    private int yys76() {
        switch (yytok) {
            case '>':
            case '=':
            case '<':
            case BETWEEN:
            case '!':
            case IS:
                return yyr45();
            case ',':
            case ')':
                return yyr50();
        }
        return 211;
    }

    private int yys79() {
        switch (yytok) {
            case OR:
            case IDENTIFIER:
            case '=':
            case '<':
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case '>':
            case ENDINPUT:
            case AND:
                return yyr49();
        }
        return 211;
    }

    private int yys96() {
        switch (yytok) {
            case '>':
            case OR:
            case '=':
            case '<':
            case BETWEEN:
            case ')':
            case '!':
            case IS:
            case ENDINPUT:
            case AND:
                return yyr46();
        }
        return 211;
    }

    private int yyr1() { // prog : sql
        { yyrv = new FinalSqlClause(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr39() { // betweenPredicate : rowValueConstructor BETWEEN rowValueConstructor AND rowValueConstructor
        yysp -= 5;
        return 28;
    }

    private int yyr22() { // booleanFactor : booleanTest
        yysp -= 1;
        return yypbooleanFactor();
    }

    private int yyr23() { // booleanFactor : NOT booleanTest
        yysp -= 2;
        return yypbooleanFactor();
    }

    private int yypbooleanFactor() {
        switch (yyst[yysp-1]) {
            case 62: return 85;
            default: return 29;
        }
    }

    private int yyr30() { // booleanPrimary : predicate
        yysp -= 1;
        return 30;
    }

    private int yyr31() { // booleanPrimary : '(' searchCondition ')'
        yysp -= 3;
        return 30;
    }

    private int yyr20() { // booleanTerm : booleanFactor
        yysp -= 1;
        return yypbooleanTerm();
    }

    private int yyr21() { // booleanTerm : booleanTerm AND booleanFactor
        yysp -= 3;
        return yypbooleanTerm();
    }

    private int yypbooleanTerm() {
        switch (yyst[yysp-1]) {
            case 70: return 94;
            default: return 31;
        }
    }

    private int yyr24() { // booleanTest : booleanPrimary
        yysp -= 1;
        return yypbooleanTest();
    }

    private int yyr25() { // booleanTest : booleanPrimary IS truthValue
        yysp -= 3;
        return yypbooleanTest();
    }

    private int yyr26() { // booleanTest : booleanPrimary IS NOT truthValue
        yysp -= 4;
        return yypbooleanTest();
    }

    private int yypbooleanTest() {
        switch (yyst[yysp-1]) {
            case 50: return 75;
            default: return 32;
        }
    }

    private int yyr10() { // column : field asclause
        yysp -= 2;
        return yypcolumn();
    }

    private int yyr11() { // column : num asclause
        yysp -= 2;
        return yypcolumn();
    }

    private int yyr12() { // column : string asclause
        yysp -= 2;
        return yypcolumn();
    }

    private int yypcolumn() {
        switch (yyst[yysp-1]) {
            case 4: return 7;
            default: return 56;
        }
    }

    private int yyr15() { // columnalias : IDENTIFIER
        yysp -= 1;
        return 57;
    }

    private int yyr8() { // columns : columns ',' column
        yysp -= 3;
        return 8;
    }

    private int yyr9() { // columns : column
        yysp -= 1;
        return 8;
    }

    private int yyr56() { // compOp : '='
        yysp -= 1;
        return 63;
    }

    private int yyr57() { // compOp : '!' '='
        yysp -= 2;
        return 63;
    }

    private int yyr58() { // compOp : '<' '>'
        yysp -= 2;
        return 63;
    }

    private int yyr59() { // compOp : '<'
        yysp -= 1;
        return 63;
    }

    private int yyr60() { // compOp : '<' '='
        yysp -= 2;
        return 63;
    }

    private int yyr61() { // compOp : '>'
        yysp -= 1;
        return 63;
    }

    private int yyr62() { // compOp : '>' '='
        yysp -= 2;
        return 63;
    }

    private int yyr38() { // comparisonPredicate : rowValueConstructor compOp rowValueConstructor
        yysp -= 3;
        return 33;
    }

    private int yyr43() { // existsPredicate : EXISTS tableSubquery
        yysp -= 2;
        return 34;
    }

    private int yyr63() { // field : IDENTIFIER
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 21: return 9;
            case 4: return 9;
            default: return 35;
        }
    }

    private int yyr5() { // fromclause : FROM IDENTIFIER
        yysp -= 2;
        return 5;
    }

    private int yyr6() { // fromclause : FROM subquery tablealias
        yysp -= 3;
        return 5;
    }

    private int yyr40() { // inPredicate : IN '(' ')'
        yysp -= 3;
        return 36;
    }

    private int yyr41() { // likePredicate : LIKE string
        yysp -= 2;
        return 37;
    }

    private int yyr42() { // nullPredicate : rowValueConstructor IS NULL
        yysp -= 3;
        return 38;
    }

    private int yyr64() { // num : NUMBER
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 21: return 10;
            case 4: return 10;
            default: return 39;
        }
    }

    private int yyr32() { // predicate : comparisonPredicate
        yysp -= 1;
        return 40;
    }

    private int yyr33() { // predicate : betweenPredicate
        yysp -= 1;
        return 40;
    }

    private int yyr34() { // predicate : inPredicate
        yysp -= 1;
        return 40;
    }

    private int yyr35() { // predicate : likePredicate
        yysp -= 1;
        return 40;
    }

    private int yyr36() { // predicate : nullPredicate
        yysp -= 1;
        return 40;
    }

    private int yyr37() { // predicate : existsPredicate
        yysp -= 1;
        return 40;
    }

    private int yyr13() { // asclause : AS columnalias
        yysp -= 2;
        return yypasclause();
    }

    private int yyr14() { // asclause : /* empty */
        return yypasclause();
    }

    private int yypasclause() {
        switch (yyst[yysp-1]) {
            case 10: return 24;
            case 9: return 22;
            default: return 25;
        }
    }

    private int yyr48() { // rowSubquery : subquery
        yysp -= 1;
        return 41;
    }

    private int yyr45() { // rowValueConstructor : rowValueConstructorElement
        yysp -= 1;
        return yyprowValueConstructor();
    }

    private int yyr46() { // rowValueConstructor : '(' rowValueConstructorList ')'
        yysp -= 3;
        return yyprowValueConstructor();
    }

    private int yyr47() { // rowValueConstructor : rowSubquery
        yysp -= 1;
        return yyprowValueConstructor();
    }

    private int yyprowValueConstructor() {
        switch (yyst[yysp-1]) {
            case 101: return 103;
            case 64: return 88;
            case 63: return 86;
            default: return 42;
        }
    }

    private int yyr52() { // rowValueConstructorElement : string
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyr53() { // rowValueConstructorElement : num
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyr54() { // rowValueConstructorElement : field
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyr55() { // rowValueConstructorElement : NULL
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyprowValueConstructorElement() {
        switch (yyst[yysp-1]) {
            case 97: return 102;
            case 87: return 100;
            case 52: return 76;
            default: return 43;
        }
    }

    private int yyr50() { // rowValueConstructorList : rowValueConstructorElement
        yysp -= 1;
        return 77;
    }

    private int yyr51() { // rowValueConstructorList : rowValueConstructorList ',' rowValueConstructorElement
        yysp -= 3;
        return 77;
    }

    private int yyr18() { // searchCondition : booleanTerm
        yysp -= 1;
        return yypsearchCondition();
    }

    private int yyr19() { // searchCondition : searchCondition OR booleanTerm
        yysp -= 3;
        return yypsearchCondition();
    }

    private int yypsearchCondition() {
        switch (yyst[yysp-1]) {
            case 17: return 44;
            default: return 78;
        }
    }

    private int yyr3() { // selectclause : SELECT '*'
        { yyrv = new DirectSelectClause(yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr4() { // selectclause : SELECT columns
        { yyrv = new DirectSelectClause(yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr2() { // sql : selectclause fromclause whereclause
        { yyrv = new Query(yysv[yysp-3],yysv[yysp-2],yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 0: return 3;
            default: return 55;
        }
    }

    private int yyr65() { // string : SINGLEQUOTE IDENTIFIER SINGLEQUOTE
        yysp -= 3;
        return yypstring();
    }

    private int yyr66() { // string : SINGLEQUOTE NUMBER SINGLEQUOTE
        yysp -= 3;
        return yypstring();
    }

    private int yypstring() {
        switch (yyst[yysp-1]) {
            case 49: return 74;
            case 21: return 11;
            case 4: return 11;
            default: return 45;
        }
    }

    private int yyr49() { // subquery : '(' sql ')'
        yysp -= 3;
        switch (yyst[yysp-1]) {
            case 47: return 71;
            case 6: return 18;
            default: return 46;
        }
    }

    private int yyr44() { // tableSubquery : subquery
        yysp -= 1;
        return 72;
    }

    private int yyr7() { // tablealias : IDENTIFIER
        yysp -= 1;
        return 53;
    }

    private int yyr27() { // truthValue : TRUE
        yysp -= 1;
        return yyptruthValue();
    }

    private int yyr28() { // truthValue : FALSE
        yysp -= 1;
        return yyptruthValue();
    }

    private int yyr29() { // truthValue : UNKNOWN
        yysp -= 1;
        return yyptruthValue();
    }

    private int yyptruthValue() {
        switch (yyst[yysp-1]) {
            case 61: return 80;
            default: return 99;
        }
    }

    private int yyr16() { // whereclause : WHERE searchCondition
        yysp -= 2;
        return 16;
    }

    private int yyr17() { // whereclause : /* empty */
        return 16;
    }

    protected String[] yyerrmsgs = {
    };


  private SelectLexer lexer;

  SelectParser(SelectLexer lexer) { this.lexer = lexer; }

  private void yyerror(String msg) {
    Main.error(yyerrno<0 ? msg : yyerrmsgs[yyerrno]);
  }

}

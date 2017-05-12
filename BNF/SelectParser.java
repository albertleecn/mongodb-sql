// Output created by jacc on Fri May 12 16:42:11 CST 2017

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
                case 107:
                    switch (yytok) {
                        case SELECT:
                            yyn = 2;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 108:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 214;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 109:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 8;
                            continue;
                        case NUMBER:
                            yyn = 9;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                        case '*':
                            yyn = 11;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 111:
                    switch (yytok) {
                        case FROM:
                            yyn = 12;
                            continue;
                        case ',':
                            yyn = 13;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    switch (yytok) {
                        case AS:
                            yyn = 15;
                            continue;
                        case ',':
                        case FROM:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    switch (yytok) {
                        case AS:
                            yyn = 15;
                            continue;
                        case ',':
                        case FROM:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    switch (yytok) {
                        case AS:
                            yyn = 15;
                            continue;
                        case ',':
                        case FROM:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 18;
                            continue;
                        case NUMBER:
                            yyn = 19;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    switch (yytok) {
                        case FROM:
                            yyn = 20;
                            continue;
                    }
                    yyn = 217;
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
                case 119:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 22;
                            continue;
                        case '(':
                            yyn = 23;
                            continue;
                    }
                    yyn = 217;
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
                case 120:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 8;
                            continue;
                        case NUMBER:
                            yyn = 9;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 217;
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
                case 122:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 26;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 123:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case SINGLEQUOTE:
                            yyn = 27;
                            continue;
                    }
                    yyn = 217;
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
                case 126:
                    switch (yytok) {
                        case SINGLEQUOTE:
                            yyn = 28;
                            continue;
                    }
                    yyn = 217;
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
                case 127:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 22;
                            continue;
                        case '(':
                            yyn = 23;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    switch (yytok) {
                        case WHERE:
                            yyn = 31;
                            continue;
                        case ENDINPUT:
                        case ')':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                        case WHERE:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 217;
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
                case 130:
                    switch (yytok) {
                        case SELECT:
                            yyn = 2;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 217;
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
                case 133:
                    switch (yytok) {
                        case ',':
                        case FROM:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 217;
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
                case 134:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    switch (yytok) {
                        case WHERE:
                            yyn = 31;
                            continue;
                        case ENDINPUT:
                        case ')':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    switch (yytok) {
                        case ')':
                            yyn = 59;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 34:
                    yyst[yysp] = 34;
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
                            yyn = yyr31();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    switch (yytok) {
                        case IS:
                            yyn = 60;
                            continue;
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr22();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    switch (yytok) {
                        case AND:
                            yyn = 61;
                            continue;
                        case ENDINPUT:
                        case OR:
                        case ')':
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr20();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr32();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr34();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 152:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 153:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr28();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 154:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 155:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 156:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case OR:
                            yyn = 69;
                            continue;
                        case ENDINPUT:
                        case ')':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case '(':
                            yyn = 72;
                            continue;
                    }
                    yyn = 217;
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
                case 161:
                    switch (yytok) {
                        case '(':
                            yyn = 73;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    yyn = yys57();
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
                case 165:
                    yyn = yys58();
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
                case 166:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 81;
                            continue;
                    }
                    yyn = 217;
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
                case 167:
                    switch (yytok) {
                        case FALSE:
                            yyn = 83;
                            continue;
                        case NOT:
                            yyn = 84;
                            continue;
                        case TRUE:
                            yyn = 85;
                            continue;
                        case UNKNOWN:
                            yyn = 86;
                            continue;
                    }
                    yyn = 217;
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
                case 168:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 8;
                            continue;
                        case NUMBER:
                            yyn = 9;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                        case NULL:
                            yyn = 57;
                            continue;
                        case '(':
                            yyn = 89;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 8;
                            continue;
                        case NUMBER:
                            yyn = 9;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                        case NULL:
                            yyn = 57;
                            continue;
                        case '(':
                            yyn = 89;
                            continue;
                    }
                    yyn = 217;
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
                case 171:
                    switch (yytok) {
                        case NULL:
                            yyn = 91;
                            continue;
                    }
                    yyn = 217;
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
                case 172:
                    switch (yytok) {
                        case '=':
                            yyn = 92;
                            continue;
                    }
                    yyn = 217;
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
                case 173:
                    yyn = yys66();
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
                case 174:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr54();
                            continue;
                    }
                    yyn = 217;
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
                case 175:
                    yyn = yys68();
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
                case 176:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr42();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 71:
                    yyst[yysp] = 71;
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
                    yyn = 217;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case SELECT:
                            yyn = 2;
                            continue;
                    }
                    yyn = 217;
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
                case 180:
                    switch (yytok) {
                        case ')':
                            yyn = 97;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr21();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case ')':
                            yyn = 98;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case ')':
                            yyn = 99;
                            continue;
                        case ',':
                            yyn = 100;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case OR:
                            yyn = 69;
                            continue;
                        case ')':
                            yyn = 101;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                        case WHERE:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 217;
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
                case 188:
                    switch (yytok) {
                        case ENDINPUT:
                        case ')':
                        case WHERE:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr23();
                            continue;
                    }
                    yyn = 217;
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
                case 190:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 217;
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
                case 191:
                    switch (yytok) {
                        case FALSE:
                            yyn = 83;
                            continue;
                        case TRUE:
                            yyn = 85;
                            continue;
                        case UNKNOWN:
                            yyn = 86;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr25();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 86:
                    yyst[yysp] = 86;
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
                        case AND:
                            yyn = yyr27();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr36();
                            continue;
                    }
                    yyn = 217;
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
                case 196:
                    switch (yytok) {
                        case SELECT:
                            yyn = 2;
                            continue;
                        case IDENTIFIER:
                            yyn = 8;
                            continue;
                        case NUMBER:
                            yyn = 9;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                        case NULL:
                            yyn = 57;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case AND:
                            yyn = 104;
                            continue;
                    }
                    yyn = 217;
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
                case 198:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 217;
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
                case 199:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr55();
                            continue;
                    }
                    yyn = 217;
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
                case 200:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr58();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 94:
                    yyst[yysp] = 94;
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
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr56();
                            continue;
                    }
                    yyn = 217;
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
                case 202:
                    switch (yytok) {
                        case IDENTIFIER:
                        case NUMBER:
                        case NULL:
                        case '(':
                        case SINGLEQUOTE:
                            yyn = yyr60();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    switch (yytok) {
                        case AND:
                            yyn = 61;
                            continue;
                        case ENDINPUT:
                        case OR:
                        case ')':
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 217;
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
                case 204:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 217;
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
                case 205:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 8;
                            continue;
                        case NUMBER:
                            yyn = 9;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                        case NULL:
                            yyn = 57;
                            continue;
                    }
                    yyn = 217;
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
                case 208:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr29();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case AND:
                            yyn = yyr24();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr48();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 8;
                            continue;
                        case NUMBER:
                            yyn = 9;
                            continue;
                        case SINGLEQUOTE:
                            yyn = 10;
                            continue;
                        case NULL:
                            yyn = 57;
                            continue;
                        case '(':
                            yyn = 89;
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case ',':
                        case ')':
                            yyn = yyr49();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    switch (yytok) {
                        case ENDINPUT:
                        case OR:
                        case ')':
                        case IS:
                        case AND:
                            yyn = yyr37();
                            continue;
                    }
                    yyn = 217;
                    continue;

                case 214:
                    return true;
                case 215:
                    yyerror("stack overflow");
                case 216:
                    return false;
                case 217:
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

    private int yys8() {
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
                return yyr61();
        }
        return 217;
    }

    private int yys9() {
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
                return yyr62();
        }
        return 217;
    }

    private int yys27() {
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
        return 217;
    }

    private int yys28() {
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
        return 217;
    }

    private int yys31() {
        switch (yytok) {
            case IDENTIFIER:
                return 8;
            case NUMBER:
                return 9;
            case SINGLEQUOTE:
                return 10;
            case EXISTS:
                return 53;
            case IN:
                return 54;
            case LIKE:
                return 55;
            case NOT:
                return 56;
            case NULL:
                return 57;
            case '(':
                return 58;
        }
        return 217;
    }

    private int yys41() {
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
        return 217;
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
                return yyr51();
        }
        return 217;
    }

    private int yys47() {
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
        return 217;
    }

    private int yys48() {
        switch (yytok) {
            case BETWEEN:
                return 63;
            case IS:
                return 64;
            case '!':
                return 65;
            case '<':
                return 66;
            case '=':
                return 67;
            case '>':
                return 68;
        }
        return 217;
    }

    private int yys49() {
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
                return yyr43();
        }
        return 217;
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
                return yyr50();
        }
        return 217;
    }

    private int yys52() {
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
        return 217;
    }

    private int yys56() {
        switch (yytok) {
            case IDENTIFIER:
                return 8;
            case NUMBER:
                return 9;
            case SINGLEQUOTE:
                return 10;
            case EXISTS:
                return 53;
            case IN:
                return 54;
            case LIKE:
                return 55;
            case NULL:
                return 57;
            case '(':
                return 58;
        }
        return 217;
    }

    private int yys57() {
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
        return 217;
    }

    private int yys58() {
        switch (yytok) {
            case SELECT:
                return 2;
            case IDENTIFIER:
                return 8;
            case NUMBER:
                return 9;
            case SINGLEQUOTE:
                return 10;
            case EXISTS:
                return 53;
            case IN:
                return 54;
            case LIKE:
                return 55;
            case NOT:
                return 56;
            case NULL:
                return 57;
            case '(':
                return 58;
        }
        return 217;
    }

    private int yys61() {
        switch (yytok) {
            case IDENTIFIER:
                return 8;
            case NUMBER:
                return 9;
            case SINGLEQUOTE:
                return 10;
            case EXISTS:
                return 53;
            case IN:
                return 54;
            case LIKE:
                return 55;
            case NOT:
                return 56;
            case NULL:
                return 57;
            case '(':
                return 58;
        }
        return 217;
    }

    private int yys66() {
        switch (yytok) {
            case '=':
                return 93;
            case '>':
                return 94;
            case IDENTIFIER:
            case NUMBER:
            case NULL:
            case '(':
            case SINGLEQUOTE:
                return yyr57();
        }
        return 217;
    }

    private int yys68() {
        switch (yytok) {
            case '=':
                return 95;
            case IDENTIFIER:
            case NUMBER:
            case NULL:
            case '(':
            case SINGLEQUOTE:
                return yyr59();
        }
        return 217;
    }

    private int yys69() {
        switch (yytok) {
            case IDENTIFIER:
                return 8;
            case NUMBER:
                return 9;
            case SINGLEQUOTE:
                return 10;
            case EXISTS:
                return 53;
            case IN:
                return 54;
            case LIKE:
                return 55;
            case NOT:
                return 56;
            case NULL:
                return 57;
            case '(':
                return 58;
        }
        return 217;
    }

    private int yys77() {
        switch (yytok) {
            case '>':
            case '=':
            case '<':
            case BETWEEN:
            case '!':
            case IS:
                return yyr43();
            case ',':
            case ')':
                return yyr48();
        }
        return 217;
    }

    private int yys98() {
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
        return 217;
    }

    private int yys99() {
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
                return yyr44();
        }
        return 217;
    }

    private int yyr1() { // prog : SELECT '*' FROM table whereclause
        yysp -= 5;
        return yypprog();
    }

    private int yyr2() { // prog : SELECT columns FROM table whereclause
        yysp -= 5;
        return yypprog();
    }

    private int yypprog() {
        switch (yyst[yysp-1]) {
            case 23: return 32;
            case 0: return 1;
            default: return 76;
        }
    }

    private int yyr37() { // betweenPredicate : rowValueConstructor BETWEEN rowValueConstructor AND rowValueConstructor
        yysp -= 5;
        return 34;
    }

    private int yyr20() { // booleanFactor : booleanTest
        yysp -= 1;
        return yypbooleanFactor();
    }

    private int yyr21() { // booleanFactor : NOT booleanTest
        yysp -= 2;
        return yypbooleanFactor();
    }

    private int yypbooleanFactor() {
        switch (yyst[yysp-1]) {
            case 61: return 87;
            default: return 35;
        }
    }

    private int yyr28() { // booleanPrimary : predicate
        yysp -= 1;
        return 36;
    }

    private int yyr29() { // booleanPrimary : '(' searchCondition ')'
        yysp -= 3;
        return 36;
    }

    private int yyr18() { // booleanTerm : booleanFactor
        yysp -= 1;
        return yypbooleanTerm();
    }

    private int yyr19() { // booleanTerm : booleanTerm AND booleanFactor
        yysp -= 3;
        return yypbooleanTerm();
    }

    private int yypbooleanTerm() {
        switch (yyst[yysp-1]) {
            case 69: return 96;
            default: return 37;
        }
    }

    private int yyr22() { // booleanTest : booleanPrimary
        yysp -= 1;
        return yypbooleanTest();
    }

    private int yyr23() { // booleanTest : booleanPrimary IS truthValue
        yysp -= 3;
        return yypbooleanTest();
    }

    private int yyr24() { // booleanTest : booleanPrimary IS NOT truthValue
        yysp -= 4;
        return yypbooleanTest();
    }

    private int yypbooleanTest() {
        switch (yyst[yysp-1]) {
            case 56: return 75;
            default: return 38;
        }
    }

    private int yyr8() { // column : field asclause
        yysp -= 2;
        return yypcolumn();
    }

    private int yyr9() { // column : num asclause
        yysp -= 2;
        return yypcolumn();
    }

    private int yyr10() { // column : string asclause
        yysp -= 2;
        return yypcolumn();
    }

    private int yypcolumn() {
        switch (yyst[yysp-1]) {
            case 2: return 3;
            default: return 24;
        }
    }

    private int yyr13() { // columnalias : IDENTIFIER
        yysp -= 1;
        return 25;
    }

    private int yyr6() { // columns : columns ',' column
        yysp -= 3;
        return 4;
    }

    private int yyr7() { // columns : column
        yysp -= 1;
        return 4;
    }

    private int yyr54() { // compOp : '='
        yysp -= 1;
        return 62;
    }

    private int yyr55() { // compOp : '!' '='
        yysp -= 2;
        return 62;
    }

    private int yyr56() { // compOp : '<' '>'
        yysp -= 2;
        return 62;
    }

    private int yyr57() { // compOp : '<'
        yysp -= 1;
        return 62;
    }

    private int yyr58() { // compOp : '<' '='
        yysp -= 2;
        return 62;
    }

    private int yyr59() { // compOp : '>'
        yysp -= 1;
        return 62;
    }

    private int yyr60() { // compOp : '>' '='
        yysp -= 2;
        return 62;
    }

    private int yyr36() { // comparisonPredicate : rowValueConstructor compOp rowValueConstructor
        yysp -= 3;
        return 39;
    }

    private int yyr41() { // existsPredicate : EXISTS tableSubquery
        yysp -= 2;
        return 40;
    }

    private int yyr61() { // field : IDENTIFIER
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 13: return 5;
            case 2: return 5;
            default: return 41;
        }
    }

    private int yyr38() { // inPredicate : IN '(' ')'
        yysp -= 3;
        return 42;
    }

    private int yyr39() { // likePredicate : LIKE string
        yysp -= 2;
        return 43;
    }

    private int yyr40() { // nullPredicate : rowValueConstructor IS NULL
        yysp -= 3;
        return 44;
    }

    private int yyr62() { // num : NUMBER
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 13: return 6;
            case 2: return 6;
            default: return 45;
        }
    }

    private int yyr30() { // predicate : comparisonPredicate
        yysp -= 1;
        return 46;
    }

    private int yyr31() { // predicate : betweenPredicate
        yysp -= 1;
        return 46;
    }

    private int yyr32() { // predicate : inPredicate
        yysp -= 1;
        return 46;
    }

    private int yyr33() { // predicate : likePredicate
        yysp -= 1;
        return 46;
    }

    private int yyr34() { // predicate : nullPredicate
        yysp -= 1;
        return 46;
    }

    private int yyr35() { // predicate : existsPredicate
        yysp -= 1;
        return 46;
    }

    private int yyr11() { // asclause : AS columnalias
        yysp -= 2;
        return yypasclause();
    }

    private int yyr12() { // asclause : /* empty */
        return yypasclause();
    }

    private int yypasclause() {
        switch (yyst[yysp-1]) {
            case 6: return 16;
            case 5: return 14;
            default: return 17;
        }
    }

    private int yyr46() { // rowSubquery : subquery
        yysp -= 1;
        return 47;
    }

    private int yyr43() { // rowValueConstructor : rowValueConstructorElement
        yysp -= 1;
        return yyprowValueConstructor();
    }

    private int yyr44() { // rowValueConstructor : '(' rowValueConstructorList ')'
        yysp -= 3;
        return yyprowValueConstructor();
    }

    private int yyr45() { // rowValueConstructor : rowSubquery
        yysp -= 1;
        return yyprowValueConstructor();
    }

    private int yyprowValueConstructor() {
        switch (yyst[yysp-1]) {
            case 104: return 106;
            case 63: return 90;
            case 62: return 88;
            default: return 48;
        }
    }

    private int yyr50() { // rowValueConstructorElement : string
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyr51() { // rowValueConstructorElement : num
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyr52() { // rowValueConstructorElement : field
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyr53() { // rowValueConstructorElement : NULL
        yysp -= 1;
        return yyprowValueConstructorElement();
    }

    private int yyprowValueConstructorElement() {
        switch (yyst[yysp-1]) {
            case 100: return 105;
            case 89: return 103;
            case 58: return 77;
            default: return 49;
        }
    }

    private int yyr48() { // rowValueConstructorList : rowValueConstructorElement
        yysp -= 1;
        return 78;
    }

    private int yyr49() { // rowValueConstructorList : rowValueConstructorList ',' rowValueConstructorElement
        yysp -= 3;
        return 78;
    }

    private int yyr16() { // searchCondition : booleanTerm
        yysp -= 1;
        return yypsearchCondition();
    }

    private int yyr17() { // searchCondition : searchCondition OR booleanTerm
        yysp -= 3;
        return yypsearchCondition();
    }

    private int yypsearchCondition() {
        switch (yyst[yysp-1]) {
            case 31: return 50;
            default: return 79;
        }
    }

    private int yyr63() { // string : SINGLEQUOTE IDENTIFIER SINGLEQUOTE
        yysp -= 3;
        return yypstring();
    }

    private int yyr64() { // string : SINGLEQUOTE NUMBER SINGLEQUOTE
        yysp -= 3;
        return yypstring();
    }

    private int yypstring() {
        switch (yyst[yysp-1]) {
            case 55: return 74;
            case 13: return 7;
            case 2: return 7;
            default: return 51;
        }
    }

    private int yyr47() { // subquery : '(' prog ')'
        yysp -= 3;
        switch (yyst[yysp-1]) {
            case 53: return 70;
            default: return 52;
        }
    }

    private int yyr3() { // table : IDENTIFIER
        yysp -= 1;
        return yyptable();
    }

    private int yyr4() { // table : '(' prog ')' tablealias
        yysp -= 4;
        return yyptable();
    }

    private int yyptable() {
        switch (yyst[yysp-1]) {
            case 12: return 21;
            default: return 29;
        }
    }

    private int yyr42() { // tableSubquery : subquery
        yysp -= 1;
        return 71;
    }

    private int yyr5() { // tablealias : IDENTIFIER
        yysp -= 1;
        return 80;
    }

    private int yyr25() { // truthValue : TRUE
        yysp -= 1;
        return yyptruthValue();
    }

    private int yyr26() { // truthValue : FALSE
        yysp -= 1;
        return yyptruthValue();
    }

    private int yyr27() { // truthValue : UNKNOWN
        yysp -= 1;
        return yyptruthValue();
    }

    private int yyptruthValue() {
        switch (yyst[yysp-1]) {
            case 60: return 82;
            default: return 102;
        }
    }

    private int yyr14() { // whereclause : WHERE searchCondition
        yysp -= 2;
        return yypwhereclause();
    }

    private int yyr15() { // whereclause : /* empty */
        return yypwhereclause();
    }

    private int yypwhereclause() {
        switch (yyst[yysp-1]) {
            case 21: return 30;
            default: return 33;
        }
    }

    protected String[] yyerrmsgs = {
    };


  private SelectLexer lexer;

  SelectParser(SelectLexer lexer) { this.lexer = lexer; }

  private void yyerror(String msg) {
    Main.error(yyerrno<0 ? msg : yyerrmsgs[yyerrno]);
  }

}

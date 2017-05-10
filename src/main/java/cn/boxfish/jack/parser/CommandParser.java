// Output created by jacc on Wed May 10 15:39:24 CST 2017

package cn.boxfish.jack.parser;

class CommandParser implements CommandTokens {
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
                case 30:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 3;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 60;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 4;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 63;
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
                case 34:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 35:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case '(':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
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
                case 36:
                    switch (yytok) {
                        case WHITESPACE:
                        case '(':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case '(':
                            yyn = 10;
                            continue;
                    }
                    yyn = 63;
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
                case 38:
                    switch (yytok) {
                        case ':':
                        case ')':
                        case NUM:
                        case error:
                            yyn = 63;
                            continue;
                    }
                    yyn = yyr5();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case IDENTIFIER:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
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
                case 40:
                    switch (yytok) {
                        case NUM:
                            yyn = 14;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ';':
                            yyn = 17;
                            continue;
                        case ENDINPUT:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 19;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case ')':
                            yyn = 20;
                            continue;
                        case ':':
                            yyn = 21;
                            continue;
                    }
                    yyn = 63;
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
                case 44:
                    switch (yytok) {
                        case ':':
                        case ')':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case ';':
                            yyn = 22;
                            continue;
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 63;
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
                case 47:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                        case IDENTIFIER:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                        case ';':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
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
                case 49:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 63;
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
                case 50:
                    switch (yytok) {
                        case WHITESPACE:
                        case IDENTIFIER:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 63;
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
                case 51:
                    switch (yytok) {
                        case NUM:
                            yyn = 26;
                            continue;
                    }
                    yyn = 63;
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
                case 52:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 19;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case NUM:
                            yyn = 28;
                            continue;
                    }
                    yyn = 63;
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
                case 56:
                    switch (yytok) {
                        case ':':
                        case ')':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                        case ';':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
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
                case 58:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 60:
                    return true;
                case 61:
                    yyerror("stack overflow");
                case 62:
                    return false;
                case 63:
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

    private int yyr1() { // prog : command WHITESPACE rulename white matchCondition awardflow end
        { yyrv = new Rule(yysv[yysp-7],yysv[yysp-5],yysv[yysp-3],yysv[yysp-2]); }
        yysv[yysp-=7] = yyrv;
        return 1;
    }

    private int yyr12() { // awardflow : awardflow ';' white award white
        { yyrv = new AwardFlow(yysv[yysp-5],yysv[yysp-2]); }
        yysv[yysp-=5] = yyrv;
        return 11;
    }

    private int yyr13() { // awardflow : white award white
        { yyrv = new AwardFlow(yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 11;
    }

    private int yyr7() { // command : IDENTIFIER
        yysp -= 1;
        return 2;
    }

    private int yyr2() { // end : white
        yysp -= 1;
        return 15;
    }

    private int yyr3() { // end : ';'
        yysp -= 1;
        return 15;
    }

    private int yyr4() { // end : white ';'
        yysp -= 2;
        return 15;
    }

    private int yyr9() { // matchCondition : '(' userIds ')'
        { yyrv = new MatchCondition(yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 9;
    }

    private int yyr14() { // award : IDENTIFIER WHITESPACE NUM
        { yyrv = new Award(yysv[yysp-3],yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 12: return 18;
            default: return 27;
        }
    }

    private int yyr8() { // rulename : IDENTIFIER
        yysp -= 1;
        return 5;
    }

    private int yyr10() { // userIds : userIds ':' NUM
        { yyrv = new UserIds(yysv[yysp-3],yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 13;
    }

    private int yyr11() { // userIds : NUM
        { yyrv = new UserIds(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 13;
    }

    private int yyr5() { // white : WHITESPACE
        yysp -= 1;
        return yypwhite();
    }

    private int yyr6() { // white : /* empty */
        return yypwhite();
    }

    private int yypwhite() {
        switch (yyst[yysp-1]) {
            case 18: return 24;
            case 17: return 23;
            case 11: return 16;
            case 9: return 12;
            case 5: return 7;
            default: return 29;
        }
    }

    protected String[] yyerrmsgs = {
    };


  private CommandLexer lexer;

  CommandParser(CommandLexer lexer) { this.lexer = lexer; }

  private void yyerror(String msg) {
    Main.error(yyerrno<0 ? msg : yyerrmsgs[yyerrno]);
  }

}

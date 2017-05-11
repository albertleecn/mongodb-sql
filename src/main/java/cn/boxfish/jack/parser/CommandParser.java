// Output created by jacc on Thu May 11 17:40:45 CST 2017

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
        yyerrno = (-1);
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
                case 31:
                    switch (yytok) {
                        case '(':
                            yyn = yyerr(0, 65);
                            continue;
                        case IDENTIFIER:
                            yyn = 3;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 62;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 4;
                            continue;
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 65;
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
                case 34:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 65;
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
                case 35:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 7;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 36:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case ';':
                            yyn = yyerr(1, 65);
                            continue;
                        case WHITESPACE:
                            yyn = 9;
                            continue;
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                        case '(':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    switch (yytok) {
                        case WHITESPACE:
                        case '(':
                        case ENDINPUT:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case ';':
                            yyn = yyerr(1, 65);
                            continue;
                        case '(':
                            yyn = 11;
                            continue;
                    }
                    yyn = 65;
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
                case 40:
                    switch (yytok) {
                        case ':':
                        case ')':
                        case NUM:
                        case error:
                            yyn = 65;
                            continue;
                    }
                    yyn = yyr8();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case ';':
                            yyn = yyerr(2, 65);
                            continue;
                        case WHITESPACE:
                            yyn = 9;
                            continue;
                        case IDENTIFIER:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 65;
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
                case 42:
                    switch (yytok) {
                        case NUM:
                            yyn = 15;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 9;
                            continue;
                        case ';':
                            yyn = 18;
                            continue;
                        case ENDINPUT:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 20;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case ')':
                            yyn = 21;
                            continue;
                        case ':':
                            yyn = 22;
                            continue;
                    }
                    yyn = 65;
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
                case 46:
                    switch (yytok) {
                        case ':':
                        case ')':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case ';':
                            yyn = 23;
                            continue;
                        case ENDINPUT:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 65;
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
                case 49:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 9;
                            continue;
                        case ENDINPUT:
                            yyn = yyr6();
                            continue;
                        case IDENTIFIER:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 9;
                            continue;
                        case ENDINPUT:
                        case ';':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 65;
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
                case 51:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 26;
                            continue;
                    }
                    yyn = 65;
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
                case 52:
                    switch (yytok) {
                        case WHITESPACE:
                        case IDENTIFIER:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 65;
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
                case 53:
                    switch (yytok) {
                        case NUM:
                            yyn = 27;
                            continue;
                    }
                    yyn = 65;
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
                case 54:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 20;
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 65;
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
                case 57:
                    switch (yytok) {
                        case NUM:
                            yyn = 29;
                            continue;
                    }
                    yyn = 65;
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
                case 58:
                    switch (yytok) {
                        case ':':
                        case ')':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 9;
                            continue;
                        case ENDINPUT:
                        case ';':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 65;
                    continue;

                case 62:
                    return true;
                case 63:
                    yyerror("stack overflow");
                case 64:
                    return false;
                case 65:
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

    private int yyr1() { // prog : command WHITESPACE arguments
        {yyrv = new Command(yysv[yysp-3],yysv[yysp-1]);}
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr2() { // prog : command
        {yyrv = new Command(yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr17() { // award : IDENTIFIER WHITESPACE NUM
        { yyrv = new Award(yysv[yysp-3],yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 13: return 19;
            default: return 28;
        }
    }

    private int yyr15() { // awardflow : awardflow ';' white award white
        { yyrv = new AwardFlow(yysv[yysp-5],yysv[yysp-2]); }
        yysv[yysp-=5] = yyrv;
        return 12;
    }

    private int yyr16() { // awardflow : white award white
        { yyrv = new AwardFlow(yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 12;
    }

    private int yyr10() { // command : IDENTIFIER
        yysp -= 1;
        return 2;
    }

    private int yyr5() { // end : white
        yysp -= 1;
        return 16;
    }

    private int yyr6() { // end : ';'
        yysp -= 1;
        return 16;
    }

    private int yyr7() { // end : white ';'
        yysp -= 2;
        return 16;
    }

    private int yyr12() { // matchCondition : '(' userIds ')'
        { yyrv = new MatchCondition(yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 10;
    }

    private int yyr3() { // arguments : rulename white matchCondition awardflow end
        {yyrv = new MultiArguments(yysv[yysp-5],yysv[yysp-3],yysv[yysp-2]);}
        yysv[yysp-=5] = yyrv;
        return 5;
    }

    private int yyr4() { // arguments : rulename
        {yyrv = new SingleArguments(yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return 5;
    }

    private int yyr11() { // rulename : IDENTIFIER
        yysp -= 1;
        return 6;
    }

    private int yyr13() { // userIds : userIds ':' NUM
        { yyrv = new UserIds(yysv[yysp-3],yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 14;
    }

    private int yyr14() { // userIds : NUM
        { yyrv = new UserIds(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr8() { // white : WHITESPACE
        yysp -= 1;
        return yypwhite();
    }

    private int yyr9() { // white : /* empty */
        return yypwhite();
    }

    private int yypwhite() {
        switch (yyst[yysp-1]) {
            case 19: return 25;
            case 18: return 24;
            case 12: return 17;
            case 10: return 13;
            case 6: return 8;
            default: return 30;
        }
    }

    private int yyerr(int e, int n) {
        yyerrno = e;
        return n;
    }
    protected String[] yyerrmsgs = {
        "userIds followed ';'",
        "no matchCondition",
        "no awardflow"
    };


  private CommandLexer lexer;

  CommandParser(CommandLexer lexer) { this.lexer = lexer; }

  private void yyerror(String msg) {
    Main.error(yyerrno<0 ? msg : yyerrmsgs[yyerrno]);
  }

}

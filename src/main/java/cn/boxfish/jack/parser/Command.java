package cn.boxfish.jack.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lvtu on 2017/5/11.
 */
class Command{
    private final static Logger logger = LoggerFactory.getLogger(Command.class);

    private String commandName;
    private Arguments arguments;

    Command(Object comandName,Object arguments){
        this.commandName = (String)comandName;
        this.arguments = (Arguments)arguments;
        execute();
    }

    Command(Object comandName){
        this.commandName = (String)comandName;
        execute();
    }

    void execute(){
        logger.debug("execute: {} - {}", commandName, arguments);
        if(commandName.equals("config")){
            MultiArguments multiArguments = (MultiArguments)arguments;
            Rule rule = new Rule(multiArguments.getRuleName(), multiArguments.getMatchCondition(), multiArguments.getAwardFlow());
            rule.createRule();
        }
        if(commandName.equals("delete")){
            SingleArguments singleArguments = (SingleArguments)arguments;
            Rule rule = new Rule(singleArguments.getRuleName(), null, null);
            rule.deleteRule();
        }
    }

}
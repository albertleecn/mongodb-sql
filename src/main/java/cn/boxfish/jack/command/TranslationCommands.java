package cn.boxfish.jack.command;

import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;

import java.util.Locale;

/**
 * Created by lvtu on 2017/5/9.
 */
//@CommandMarker
public class TranslationCommands {

//    private final TranslationService service;

//    @Autowired
//    public TranslationCommands(TranslationService service) {
//        this.service = service;
//    }

    @CliCommand(value = "translate", help = "translate text from one language to another")
    public String translate(@CliOption(key = {"", "text"}) String text,
                            @CliOption(key = "from", unspecifiedDefaultValue = "en_US") Locale from,
                            @CliOption(key = "to") Locale to
    ) {
        // Check args, etc.

        // invoke service
//        return service.translate(text, from, to);
        return null;
    }
}
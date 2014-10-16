package edu.ndhu.regexpDemo; /**
 * Created by tedc on 10/15/14.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpLocSrv {

    private Pattern pattern;
    private Matcher matcher;

    private static final String Location_Service_PATTERN =
            "^\\{\\s*id\\s*:\\s*(?<id>\\w+)\\s*,?|<\\s*((?<location>\\w+)\\s*,\\s*(?<service>\\w+))\\s*>,?|ts\\s*:\\s*(?<timestamp>\\w+)\\s*\\}$";
    /* {id:0000 <locationXX, serviceXX>... ts:XXX } ==> locationXX, srviceXX, locationXX,serviceXX*/

    private RegExpLocSrv() {
        pattern = Pattern.compile(Location_Service_PATTERN);
    }

    public static RegExpLocSrv createregExpressDemo() {
        return new RegExpLocSrv();
    }

    public Matcher match(String str) {
        return pattern.matcher(str);
    }
}

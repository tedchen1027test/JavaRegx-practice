package edu.ndhu.regexpDemo

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by tedc on 10/16/14.
 */
class regExpLocSrvTest extends Specification {
    @Unroll
    def "test match one location service pair #name and #location #service"() {
        given:
        def regexp = RegExpLocSrv.createregExpressDemo()

        when:
        // TODO implement stimulus
        def matcher = regexp.match(name);

        then:
        if (matcher.find())
            id == matcher.group("id")
        if (matcher.find()) {
            location == matcher.group("location")
            service == matcher.group("service")
        }
        if (matcher.find())
            ts == matcher.group("timestamp")

        where:
        // TODO implement assertions
        name                    || id | location | service | ts
        "{id:0 <L1,S2> ts:001}" || "0" | "L1" | "S2" | "001"
    }
}

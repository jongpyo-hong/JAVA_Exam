package org.koreait.commons.libs;

import org.springframework.stereotype.Component;

@Component
public class JavaScript {
    public static String alertBack(String message) {
        return String.format("alert('%s'); history.back()", message);
    }
}

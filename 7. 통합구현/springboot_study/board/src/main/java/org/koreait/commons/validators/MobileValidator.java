package org.koreait.commons.validators;

public interface MobileValidator {
    default boolean mobileCheck(String mobile) {
        /** 1. 숫자만 남기기
         *  2. 패턴
         */
        mobile = mobile.replaceAll("\\D", ""); // 숫자만 남긴다

        String pattern = "^01[016]\\d{3,4}\\d{4}$";

        boolean matched = mobile.matches(pattern);

        return matched;
    }
}

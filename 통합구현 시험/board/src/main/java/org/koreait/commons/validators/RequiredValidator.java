package org.koreait.commons.validators;

/**
 * 필수항목 체크
 */
public interface RequiredValidator {
    default void requiredCheck(String str, RuntimeException e) {
        if (str == null || str.isBlank()) {
            throw e;
        }
    }

    default void nullCheck(Object obj, RuntimeException e) {
        if (obj == null) {
            throw e;
        }
    }
}

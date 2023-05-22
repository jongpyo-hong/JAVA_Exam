package org.koreait.validators;

public interface Validator<T> extends RequiredValidator {
    void Check(T t);
}

package exam02.validators;

public interface Validator<T> extends LengthCheckValidator, RequiredValidator{
    void check(T t);
}

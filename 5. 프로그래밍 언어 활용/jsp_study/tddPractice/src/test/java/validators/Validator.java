package validators;

public interface Validator<T> extends RequiredCheckValidator{
    void check(T t);
}

package validators;

public interface RequiredCheckValidator {
    default void requiredCheck(String str, RuntimeException e) {
        if (str == null || str.isBlank()) {
            throw e;
        }
    }
}

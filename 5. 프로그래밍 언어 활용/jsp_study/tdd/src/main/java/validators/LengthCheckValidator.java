package validators;

public interface LengthCheckValidator {
    default void lengthCheck(String str, int min, RuntimeException e) {
        lengthCheck(str, min, 0, e);
    }

    default void lengthCheck(String str, int min, int max, RuntimeException e) {
        if (min > 0 && (str == null || str.length() < min)) {
            throw e;
        }

        if (max > 0 && (str == null || str.length() > max)) {
            throw e;
        }
    }
}

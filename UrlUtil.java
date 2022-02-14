// package ru.netology;

public class UrlUtil {

    public static void validate(String value) throws NotValidUrlException {
        boolean isValidSchema = value.startsWith("http://") || value.startsWith("https://");
        if (!isValidSchema) {
            throw new UnsupportedSchemaException(value);
        }
        if (value.contains(" ")) {
            throw new NotValidUrlException("Url содержит пробелы: " + value);
        }
    }
}

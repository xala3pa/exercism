import java.util.Optional;

public class PhoneNumber {
    public static final String DEFAULT_NUMBER = "0000000000";
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = Optional.of(phoneNumber)
                .map(this::onlyNumbers)
                .map(this::trim1)
                .map(this::validate)
                .get();
    }

    public String getNumber() {
        return phoneNumber;
    }

    public String getAreaCode() {
        return phoneNumber.substring(0, 3);
    }

    public String pretty() {
        return String.format("(%s) %s-%s", getAreaCode(), phoneNumber.substring(3, 6), phoneNumber.substring(6));
    }

    private String onlyNumbers(String phoneNumber) {
        return phoneNumber.replaceAll("\\D", "");
    }

    private String trim1(String phoneNumber) {
        if (phoneNumber.length() == 11 && phoneNumber.startsWith("1")) {
            return phoneNumber.substring(1);
        }

        return phoneNumber;
    }

    private String validate(String number) {
        return number.length() == 10 ? number : DEFAULT_NUMBER;
    }
}

package maskingService;

public class MaskingService {

    public String mask(String str) {
        return str.replaceAll("[a-zA-Z0-9]", "*");
    }
}

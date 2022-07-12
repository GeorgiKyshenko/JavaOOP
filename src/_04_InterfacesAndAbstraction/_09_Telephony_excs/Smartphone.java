package _04_InterfacesAndAbstraction._09_Telephony_excs;

import java.util.List;
import java.util.stream.Collectors;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
//        StringBuilder sb = new StringBuilder();
//        for (String url : urls) {
//            if (hasNumber(url)) {
//                sb.append("Invalid URL!").append(System.lineSeparator());
//            } else {
//                sb.append(String.format("Browsing: %s!",url)).append(System.lineSeparator());
//
//            }
//        }
//        return sb.toString().trim();
        return urls.stream()
                .map(url-> url.matches(".*\\d[0-9]+.*") ? "Invalid URL!" : "Browsing: " + url + "!")
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public String call() {
//        StringBuilder sb = new StringBuilder();
//        for (String number : numbers) {
//            if (!hasOnlyNumber(number)) {
//                sb.append("Invalid number!").append(System.lineSeparator());
//            } else {
//                sb.append(String.format("Calling... %s",number)).append(System.lineSeparator());  ако апенднем lineSeparator тук, може да премахнем trim()
//
//            }
//        }
//        return sb.toString().trim();
        return numbers.stream()
                .map(number -> number.matches(".*\\D+.*") ? "Invalid number!" : "Calling..." + number)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    private boolean hasNumber(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean hasOnlyNumber(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

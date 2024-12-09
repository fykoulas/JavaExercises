package gr.aueb.cf.ch9;

public class UpperLowerCaseApp {
    public static void main(String[] args) {
        String msg = "ALEJIOY ALEJIOS";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < msg.length(); i++)
            sb.append(i % 2 == 0 ? Character.toUpperCase(msg.charAt(i)) : Character.toLowerCase(msg.charAt(i)));
        System.out.println(sb);
    }

    static {
        String msg = "ATHENS";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < msg.length(); i++)
            sb.append(i % 2 == 0 ? msg.substring(i, i+1).toUpperCase() : msg.substring(i, i+1).toLowerCase());
        System.out.println(sb);
    }
}
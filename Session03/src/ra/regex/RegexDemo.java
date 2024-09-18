package ra.regex;

import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        System.out.println("So khop chuoi dau vao Java voi chuoi mau la Java: " + Pattern.matches("Java", "Java"));
        System.out.println(" . đại diện cho ký tự bất kỳ: " + Pattern.matches("J..a", "Jxaa"));
        System.out.println("ab | cd hoặc là ab hoặc là cd: " + Pattern.matches("J(av||bb)a", "Jbba"));
        System.out.println("[abc] là 1 trong 3 ký tự a hoặc b hoặc c: " + Pattern.matches("J[abc]va", "Jbva"));
    }
}

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        boolean running = true;
        do {
            System.out.printf("%d-Code \n%d-DeCode \n%d-Exit", 1, 2, 3);
            int option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    methodToCode();

                    break;
                case 2:
                    methodToDecode();
                    break;
                case 3:
                    exitCoder();
                    running = false;
                    break;
                default:
                    exitCoder();
                    running = false;
                    break;

            }
        } while (running);
    }

    private static void exitCoder() {
        System.out.println("Closing Program");
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            try {
                Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.exit(0);
        }


    }

    private static void methodToDecode() {
        System.out.println("Enter Text to be deCoded");
        try {
            String text = scan.nextLine().toLowerCase();
            String deCodedText = "";


            for (int i = 0; i < text.length(); i += 2) {
                String codePart = text.substring(i, i + 2);


                switch (codePart) {
                    case "09" -> deCodedText = "0".concat(deCodedText);
                    case "06" -> deCodedText = "1".concat(deCodedText);
                    case "03" -> deCodedText = "2".concat(deCodedText);
                    case "07" -> deCodedText = "3".concat(deCodedText);
                    case "05" -> deCodedText = "4".concat(deCodedText);
                    case "02" -> deCodedText = "5".concat(deCodedText);
                    case "04" -> deCodedText = "6".concat(deCodedText);
                    case "08" -> deCodedText = "7".concat(deCodedText);
                    case "01" -> deCodedText = "8".concat(deCodedText);
                    case "00" -> deCodedText = "9".concat(deCodedText);
                    case "10" -> deCodedText = "a".concat(deCodedText);
                    case "11" -> deCodedText = "b".concat(deCodedText);
                    case "12" -> deCodedText = "c".concat(deCodedText);
                    case "13" -> deCodedText = "d".concat(deCodedText);
                    case "14" -> deCodedText = "e".concat(deCodedText);
                    case "15" -> deCodedText = "f".concat(deCodedText);
                    case "16" -> deCodedText = "g".concat(deCodedText);
                    case "17" -> deCodedText = "h".concat(deCodedText);
                    case "18" -> deCodedText = "i".concat(deCodedText);
                    case "19" -> deCodedText = "j".concat(deCodedText);
                    case "20" -> deCodedText = "k".concat(deCodedText);
                    case "21" -> deCodedText = "l".concat(deCodedText);
                    case "22" -> deCodedText = "m".concat(deCodedText);
                    case "23" -> deCodedText = "n".concat(deCodedText);
                    case "24" -> deCodedText = "o".concat(deCodedText);
                    case "25" -> deCodedText = "p".concat(deCodedText);
                    case "26" -> deCodedText = "q".concat(deCodedText);
                    case "27" -> deCodedText = "r".concat(deCodedText);
                    case "28" -> deCodedText = "s".concat(deCodedText);
                    case "29" -> deCodedText = "t".concat(deCodedText);
                    case "30" -> deCodedText = "u".concat(deCodedText);
                    case "31" -> deCodedText = "v".concat(deCodedText);
                    case "32" -> deCodedText = "w".concat(deCodedText);
                    case "33" -> deCodedText = "x".concat(deCodedText);
                    case "34" -> deCodedText = "y".concat(deCodedText);
                    case "35" -> deCodedText = "z".concat(deCodedText);
                    case "36" -> deCodedText = "+".concat(deCodedText);
                    case "37" -> deCodedText = "-".concat(deCodedText);
                    case "38" -> deCodedText = "/".concat(deCodedText);
                    case "39" -> deCodedText = "*".concat(deCodedText);
                    case "40" -> deCodedText = "\"".concat(deCodedText);
                    case "41" -> deCodedText = "'".concat(deCodedText);
                    case "42" -> deCodedText = ";".concat(deCodedText);
                    case "43" -> deCodedText = ":".concat(deCodedText);
                    case "44" -> deCodedText = ".".concat(deCodedText);
                    case "45" -> deCodedText = ",".concat(deCodedText);
                    case "46" -> deCodedText = "=".concat(deCodedText);
                    case "47" -> deCodedText = "<".concat(deCodedText);
                    case "48" -> deCodedText = ">".concat(deCodedText);
                    case "49" -> deCodedText = "{".concat(deCodedText);
                    case "50" -> deCodedText = "}".concat(deCodedText);
                    case "51" -> deCodedText = "]".concat(deCodedText);
                    case "52" -> deCodedText = "[".concat(deCodedText);
                    case "53" -> deCodedText = "@".concat(deCodedText);
                    case "54" -> deCodedText = "#".concat(deCodedText);
                    case "55" -> deCodedText = "$".concat(deCodedText);
                    case "56" -> deCodedText = "%".concat(deCodedText);
                    case "57" -> deCodedText = "^".concat(deCodedText);
                    case "58" -> deCodedText = "&".concat(deCodedText);
                    case "59" -> deCodedText = "(".concat(deCodedText);
                    case "60" -> deCodedText = ")".concat(deCodedText);
                    case "61" -> deCodedText = "!".concat(deCodedText);
                    case "62" -> deCodedText = "?".concat(deCodedText);
                    case "63" -> deCodedText = "\\".concat(deCodedText);
                    case "64" -> deCodedText = "|".concat(deCodedText);
                    case "65" -> deCodedText = " ".concat(deCodedText);
                }


            }


            System.out.println("Decoded text: " + deCodedText);
        } catch (Exception e) {
            System.out.println("Nothing to decode");

        }
    }

    private static void methodToCode() {

        System.out.println("Enter Text to be coded");
        String text = scan.nextLine().toLowerCase();
        String codedText = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case '0' -> codedText = "09".concat(codedText);
                case '1' -> codedText = "06".concat(codedText);
                case '2' -> codedText = "03".concat(codedText);
                case '3' -> codedText = "07".concat(codedText);
                case '4' -> codedText = "05".concat(codedText);
                case '5' -> codedText = "02".concat(codedText);
                case '6' -> codedText = "04".concat(codedText);
                case '7' -> codedText = "08".concat(codedText);
                case '8' -> codedText = "01".concat(codedText);
                case '9' -> codedText = "00".concat(codedText);
                case 'a' -> codedText = "10".concat(codedText);
                case 'b' -> codedText = "11".concat(codedText);
                case 'c' -> codedText = "12".concat(codedText);
                case 'd' -> codedText = "13".concat(codedText);
                case 'e' -> codedText = "14".concat(codedText);
                case 'f' -> codedText = "15".concat(codedText);
                case 'g' -> codedText = "16".concat(codedText);
                case 'h' -> codedText = "17".concat(codedText);
                case 'i' -> codedText = "18".concat(codedText);
                case 'j' -> codedText = "19".concat(codedText);
                case 'k' -> codedText = "20".concat(codedText);
                case 'l' -> codedText = "21".concat(codedText);
                case 'm' -> codedText = "22".concat(codedText);
                case 'n' -> codedText = "23".concat(codedText);
                case 'o' -> codedText = "24".concat(codedText);
                case 'p' -> codedText = "25".concat(codedText);
                case 'q' -> codedText = "26".concat(codedText);
                case 'r' -> codedText = "27".concat(codedText);
                case 's' -> codedText = "28".concat(codedText);
                case 't' -> codedText = "29".concat(codedText);
                case 'u' -> codedText = "30".concat(codedText);
                case 'v' -> codedText = "31".concat(codedText);
                case 'w' -> codedText = "32".concat(codedText);
                case 'x' -> codedText = "33".concat(codedText);
                case 'y' -> codedText = "34".concat(codedText);
                case 'z' -> codedText = "35".concat(codedText);
                case '+' -> codedText = "36".concat(codedText);
                case '-' -> codedText = "37".concat(codedText);
                case '/' -> codedText = "38".concat(codedText);
                case '*' -> codedText = "39".concat(codedText);
                case '"' -> codedText = "40".concat(codedText);
                case '\'' -> codedText = "41".concat(codedText);
                case ';' -> codedText = "42".concat(codedText);
                case ':' -> codedText = "43".concat(codedText);
                case '.' -> codedText = "44".concat(codedText);
                case ',' -> codedText = "45".concat(codedText);
                case '=' -> codedText = "46".concat(codedText);
                case '<' -> codedText = "47".concat(codedText);
                case '>' -> codedText = "48".concat(codedText);
                case '{' -> codedText = "49".concat(codedText);
                case '}' -> codedText = "50".concat(codedText);
                case ']' -> codedText = "51".concat(codedText);
                case '[' -> codedText = "52".concat(codedText);
                case '@' -> codedText = "53".concat(codedText);
                case '#' -> codedText = "54".concat(codedText);
                case '$' -> codedText = "55".concat(codedText);
                case '%' -> codedText = "56".concat(codedText);
                case '^' -> codedText = "57".concat(codedText);
                case '&' -> codedText = "58".concat(codedText);
                case '(' -> codedText = "59".concat(codedText);
                case ')' -> codedText = "60".concat(codedText);
                case '!' -> codedText = "61".concat(codedText);
                case '?' -> codedText = "62".concat(codedText);
                case '\\' -> codedText = "63".concat(codedText);
                case '|' -> codedText = "64".concat(codedText);
                case ' ' -> codedText = "65".concat(codedText);
            }
        }
        System.out.println("Your coded text: " + codedText);

    }
}
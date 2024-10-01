import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {
    public enum Season {WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the month");
        String month = br.readLine();

        switch (month.toUpperCase()) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                System.out.println(Season.WINTER);
                break;
            case "MARCH":
            case "APRIL":
            case "MAY":
                System.out.println(Season.SPRING);
                break;
            case "JUNE":
            case "JULY":
            case "AUGUST":
                System.out.println(Season.SUMMER);
                break;
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                System.out.println(Season.AUTUMN);
                break;
            default:
                System.out.println("Incorrect month name");
        }
        br.close();
    }
}


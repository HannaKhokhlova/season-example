import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {
    public enum Season {WINTER, SPRING, SUMMER, AUTUMN
    }

    static void printSeason(String month) {
        Season season;
        switch (month.toUpperCase()) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "MARCH":
            case "APRIL":
            case "MAY":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "JUNE":
            case "JULY":
            case "AUGUST":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("Incorrect month name");
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the month name:");
            String month = br.readLine();
            printSeason(month);
        } catch (IOException e) {
            throw new RuntimeException("Invalid input: ", e);
        }
    }
}


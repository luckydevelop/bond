import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args)
    {
       System.out.println(getCurrentDate("yearFirst"));
    }

    public static String getCurrentDate(String dateFormat){
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf;

        switch (dateFormat){
            case "yearLast":
                dtf = DateTimeFormatter.ofPattern("MM/dd/y");
                break;
            case "yearFirst":
                dtf = DateTimeFormatter.ofPattern("yMMdd");
                break;
            default:
                throw new IllegalArgumentException("dateFormat argument is illegal");
        }
        return dtf.format(date);
    }
}

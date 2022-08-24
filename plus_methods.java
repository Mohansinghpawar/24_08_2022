import java.time.LocalDate;
public class plusmonths {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // create a LocalDate object
		        LocalDate date = LocalDate.parse("2021-11-13");
		        System.out.println("LocalDate before"+ " adding months: " + date);
		        LocalDate returnValueinMonths = date.plusMonths(5);
		        LocalDate returnValueinDays = date.plusDays(12);
		        LocalDate returnValueinYears = date.plusYears(12);
		        System.out.println("LocalDate after "+ " adding months: " + returnValueinMonths);
		        System.out.println("LocalDate after "+ " adding days: " + returnValueinDays);
		        System.out.println("LocalDate after "+ " adding years: " + returnValueinYears);
		}
	}

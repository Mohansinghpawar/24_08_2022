import java.time.*;
import java.time.temporal.ChronoUnit;
public class InstantClass {
	public static void main(String[] args)
	{
		Instant instant = Instant.parse("2016-05-23T09:24:54.63Z");
		System.out.println(instant);
		Instant returnvalue = instant.truncatedTo(ChronoUnit.HOURS);
		System.out.println(returnvalue);
	}
}

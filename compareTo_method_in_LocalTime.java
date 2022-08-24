import java.time.LocalTime;

public class LocalTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time1=LocalTime.parse("02:11:39");
		LocalTime time2=LocalTime.parse("02:11:39");
		int res=time1.compareTo(time2);
		System.out.println("on comparing both values are equals"+" "+res);
		
		LocalTime time3=LocalTime.parse("03:41:34");
		LocalTime time4=LocalTime.parse("02:11:39");
		int res1=time3.compareTo(time4);
		System.out.println(res1);
		
		LocalTime time5=LocalTime.parse("01:24:08");
		LocalTime time6=LocalTime.parse("02:11:16");
		int res2=time5.compareTo(time6);
		System.out.println(res2);
	}

}

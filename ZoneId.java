import java.time.*;
public class GetId {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ZoneId zoneid=ZoneId.of("Asia/Calcutta");
       System.out.println(zoneid.getId());
	}
}

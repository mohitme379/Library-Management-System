import java.time.LocalDate;

public class test {

	public static LocalDate getLocalDate() {
	    return LocalDate.now();
	}
	
	public static void main(String asdf[]) {
		String date = getLocalDate().toString();
		String date1 = getLocalDate().plusDays(15).toString();
		System.out.println(date);
		System.out.println(date1);
	}

}

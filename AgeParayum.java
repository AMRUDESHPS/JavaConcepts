import java.time.LocalDate;
import java.time.Period;

public class AgeParayum {

	public static void main(String[] args) {
		LocalDate curr = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2004, 02, 06);
		int years = Period.between(birthDate, today).getYears();
    
		System.out.println(curr);
		System.out.println(birthDate);
		System.out.println(years);
    
	}
}

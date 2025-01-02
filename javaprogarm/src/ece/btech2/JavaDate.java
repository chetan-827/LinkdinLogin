package ece.btech2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDateTime d1=LocalDateTime.now();
		System.out.println(d1);
		DateTimeFormatter myformat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatteddate=myformat.format(date);
		System.out.println(formatteddate);
	}

}

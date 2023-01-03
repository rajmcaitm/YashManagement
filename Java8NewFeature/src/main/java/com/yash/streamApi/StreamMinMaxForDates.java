package com.yash.streamApi;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxForDates {

	public static void main(String[] args) {

		
		List<LocalDate> localDates = Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(5),
				LocalDate.now().minusDays(5), LocalDate.now().plusMonths(1), LocalDate.now().minusMonths(1));

		
		Optional<LocalDate> minLocalDate = localDates.stream().min(Comparator.comparing(LocalDate::toEpochDay));

		
		minLocalDate.ifPresent(date -> System.out.println("Minimum LocalDate is = " + date));

		
		Optional<LocalDate> maxLocalDate = localDates.stream().max(Comparator.comparing(LocalDate::toEpochDay));

		
		maxLocalDate.ifPresent(date -> System.out.println("Maximum LoclaDate is = " + date));
	}
}
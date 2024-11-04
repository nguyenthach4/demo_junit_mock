package com.udacity.timezones.service;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.udacity.timezones.client.WorldTimeApiHttpClient;

@ExtendWith(MockitoExtension.class)
public class TimeZoneServiceTest {

	private TimeZoneService timeZoneService;

	@Mock
	private WorldTimeApiHttpClient worldTimeApiClient;

	@BeforeEach
	void init() {
		// worldTimeApiClient = new WorldTimeApiHttpClient();
		timeZoneService = new TimeZoneService(worldTimeApiClient);
	}

	@Test
	void getAvailableTimezoneText_timeApiReturnsStringList_returnsCountriesAsString() {
		List<String> validTimeZones = List.of("Amsterdam", "Andorra", "Astrakhan", "Athens");
		Mockito.when(worldTimeApiClient.getValidTimeZones(Mockito.anyString())).thenReturn(validTimeZones);

		String expectedReturn = "Amsterdam, Andorra, Astrakhan, Athens";

		String availableTimezoneText = timeZoneService.getAvailableTimezoneText("Europe");

		Assertions.assertTrue(availableTimezoneText.contains(expectedReturn));
	}
}

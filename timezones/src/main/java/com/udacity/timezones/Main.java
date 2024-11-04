package com.udacity.timezones;

import com.udacity.timezones.client.WorldTimeApiHttpClient;
import com.udacity.timezones.service.TimeZoneServiceTest;

public class Main {
	public static void main(String[] args) {
		TimeZoneServiceTest timeZoneService = new TimeZoneServiceTest(new WorldTimeApiHttpClient());
		System.out.println(timeZoneService.getAvailableTimezoneText("Europe"));
	}
}

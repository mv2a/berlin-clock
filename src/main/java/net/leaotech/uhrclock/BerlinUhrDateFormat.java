package net.leaotech.uhrclock;

import java.time.LocalDateTime;

public class BerlinUhrDateFormat {

	public String format() {
		LocalDateTime now = LocalDateTime.now();
		return format(now.getHour(), now.getMinute(), now.getSecond());
	}

	public String format(int hour, int minute, int second) throws NumberFormatException {
		StringBuilder row = new StringBuilder();
		row.append(String.format("  %c\n", (second % 2 == 0 ? IBerlinUhrClock.YELLOW_LIGHT : IBerlinUhrClock.UNLIT)));

		IBerlinUhrClock hours = new BerlinUhrClock.Hours(hour);
		row.append(String.format("%s\n%s\n", hours.getTopRow(), hours.getBottomRow()));
		IBerlinUhrClock minutes = new BerlinUhrClock.Minutes(minute);
		row.append(String.format("%s\n%s", minutes.getTopRow(), minutes.getBottomRow()));

		return row.toString();
	}
}

package net.leaotech.uhrclock;

public interface IBerlinUhrClock {
	char UNLIT = '.';
	char RED_LIGHT = 'R';
	char YELLOW_LIGHT = 'Y';

	String getTopRow() throws NumberFormatException;

	String getBottomRow() throws NumberFormatException;

    void setCurrentHourUnit(int currentHourUnit);
}

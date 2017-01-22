package net.leaotech.uhrclock;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.text.ParseException;

@RunWith(MockitoJUnitRunner.class)
public class BerlinUhrClockUserInputTest {
//	@Rule
//	public final ExpectedException thrown = ExpectedException.none();

	@Mock
	private BerlinUhrDateFormat setTheoryClock;

	@Test
	public void shouldProcessValidInput() {
		BerlinUhrClockMain.main(new String[] { "now" });
		BerlinUhrClockMain.main(new String[] { "14:52:16" });
	}

	@Test(expected=ParseException.class)
	public void shouldOnlyParseValidTimeRange() throws ParseException {
		BerlinUhrClockMain.parse(new String[] { "45:67:16" }, setTheoryClock);
		//thrown.expect(ParseException.class);
	}

	@Test(expected=ParseException.class)
	public void shouldCatchInvalidInput() throws ParseException {
		BerlinUhrClockMain.parse(new String[] { "random input" }, setTheoryClock);
		//thrown.expect(ParseException.class);
	}

	@Test
	public void shouldShowUsageByDefault() throws ParseException { //when no argument is given
		Assert.assertThat(BerlinUhrClockMain.parse(new String[]{}, setTheoryClock),
				CoreMatchers.containsString("Usage:"));
	}
}

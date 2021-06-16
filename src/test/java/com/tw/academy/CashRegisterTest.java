package com.tw.academy;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

class CashRegisterTest {
	@Test
	void should_print_when_call_process() {
		//given
		Printer spyPrinter = mock(Printer.class);
		CashRegister cashRegister = new CashRegister(spyPrinter);
		//when
		cashRegister.process(new Purchase());
		//then
		//verify that cashRegister.process will trigger print
		verify(spyPrinter, times(1)).print(anyString());
	}

}

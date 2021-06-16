package com.tw.academy;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
	
	@Test
	void should_print_with_purchase_when_call_process() {
		//given
		Printer spyPrinter = mock(Printer.class);
		CashRegister cashRegister = new CashRegister(spyPrinter);
		Purchase stubPurchase = mock(Purchase.class);
		String expected = "Buy an apply";
		when(stubPurchase.asString()).thenReturn(expected);
		//when
		cashRegister.process(stubPurchase);
		//then
		//verify that cashRegister.process will trigger print with purchase
		verify(spyPrinter, times(1)).print(expected);
	}

}

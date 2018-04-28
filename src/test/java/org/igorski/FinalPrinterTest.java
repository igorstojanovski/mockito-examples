package org.igorski;

import org.igorski.finalexample.FinalPrinter;
import org.igorski.finalexample.SampleFinalClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FinalPrinterTest {

    @Mock
    SampleFinalClass sampleFinalClass;

    @Test
    public void shouldPrintFinalString() {
        FinalPrinter finalPrinter = new FinalPrinter(sampleFinalClass);
        finalPrinter.printFinalString();
    }
}
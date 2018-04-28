package org.igorski.finalexample;

public class FinalPrinter {

    private final SampleFinalClass sampleFinalClass;

    public FinalPrinter(SampleFinalClass sampleFinalClass) {
        this.sampleFinalClass = sampleFinalClass;
    }

    public void printFinalString() {
        System.out.println(sampleFinalClass);
    }
}

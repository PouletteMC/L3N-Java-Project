package org.example;

import org.example.Instrument.Strings.Pianos.DigitalPiano;

public class Main {
    public static void main(String[] args) {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, 100, 50, true, 3);
        System.out.println(digitalPiano.getSamplingRate());
    }
}
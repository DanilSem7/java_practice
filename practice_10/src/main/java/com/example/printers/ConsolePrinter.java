package com.example.printers;

import org.springframework.stereotype.Component;

@Component
public class ConsolePrinter implements Printer {

    public String doPrint() {
        return "Printed in console";
    }


}

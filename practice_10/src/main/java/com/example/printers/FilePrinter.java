package com.example.printers;

import org.springframework.stereotype.Component;

@Component
public class FilePrinter implements Printer {

    public String doPrint() {
        return "Printed in file";
    }


}

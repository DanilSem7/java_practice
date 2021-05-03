package com.example.printers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PrinterApplication {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Printers.xml");
        Printer p = (Printer) ac.getBean("consolePrinter");
        System.out.println(p.doPrint());
    }

}

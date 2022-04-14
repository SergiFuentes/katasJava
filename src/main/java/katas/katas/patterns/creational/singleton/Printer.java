package katas.katas.patterns.creational.singleton;

public class Printer {

    private static Printer instancePrinter;
    private int pagesPrintedCounter=0;

    private Printer() {
    }

    public static Printer getInstance() {
        if(instancePrinter ==null){ instancePrinter= new Printer();}
        return instancePrinter;
    }

    public int countPrintedPages(){
        return pagesPrintedCounter;
    };


    public void print(String texto1) {
        pagesPrintedCounter++;
    }
}

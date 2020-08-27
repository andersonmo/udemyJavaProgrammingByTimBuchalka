package Section07.Class93_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(80, true);

        System.out.println("Toner level: "+printer.getTonerLevel());
        System.out.println("Pages printed: "+printer.getNumberOfPagesPrinted());

        printer.printing(11);
        System.out.println("Pages printed: "+printer.getNumberOfPagesPrinted());

        printer.printing(6);
        System.out.println("Pages printed: "+printer.getNumberOfPagesPrinted());

        printer.fillUpToner(12);

    }
}

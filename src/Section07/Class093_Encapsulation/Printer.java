package Section07.Class093_Encapsulation;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer( int tonerLevel, boolean isDuplex) {
        if (tonerLevel<0 || tonerLevel>100){
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int addTonerLevel) {
        System.out.println("Printer -> setTonerLevel");
        if ((this.tonerLevel + addTonerLevel)>100){
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += addTonerLevel;
        }
        System.out.println("Current toner level: "+getTonerLevel());
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public void printing(int numberOfPages){
        System.out.println("Printer -> printing");
        if(!isDuplex){
            numberOfPagesPrinted += numberOfPages;
        } else {
            if((numberOfPages%2)==0){
                numberOfPagesPrinted += numberOfPages/2;
            } else {
                numberOfPagesPrinted += ((numberOfPages/2)+1);
            }
        }
    }

    public void fillUpToner(int volume){
        System.out.println("Printer -> fillUpToner");
        setTonerLevel(volume);
    }

}

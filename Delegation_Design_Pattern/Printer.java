public class Printer{
    private InkjetPrinter inkjetPrinter;

    public Printer(){
        this.inkjetPrinter = new InkjetPrinter();
    }

    public void print(String document){
        inkjetPrinter.print(document);
    }

}
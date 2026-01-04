package AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        OldLegacyPrinter legacyPrinter = new OldLegacyPrinter();
        IModernPrinter adapter = new PrinterAdapter(legacyPrinter);

        adapter.printDocument("Hello, Design Patterns!");
    }
    
}

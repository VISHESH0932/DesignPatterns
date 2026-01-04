package AdapterPattern;

public class PrinterAdapter implements IModernPrinter {
    private OldLegacyPrinter legacyPrinter;

    public PrinterAdapter(OldLegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printDocument(String text) {
        // Adapting the modern printDocument method to the legacy outputLegacyText method
        char[] legacyFormat = text.toCharArray();
        legacyPrinter.outputLegacyText(text);
    }
}

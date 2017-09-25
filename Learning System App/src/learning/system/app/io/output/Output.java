package learning.system.app.io.output;

public interface Output {
    
    public void print(String text);
    public void printLine(String text);
    public void printFormatted(String text, String formatArgs);
    public void printError(String errorMessage);
}

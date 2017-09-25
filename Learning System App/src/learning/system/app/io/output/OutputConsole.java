package learning.system.app.io.output;


public class OutputConsole implements Output {
    
    public static final OutputConsole outputInstance = new OutputConsole();
    
    private OutputConsole(){
        
    }
    
    public static OutputConsole getOutputInstance(){
        return outputInstance;
    }
    
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void printLine(String text) {
        System.out.println(text);    
    }

    @Override
    public void printFormatted(String text, String formatArgs) {
        System.out.printf(text, formatArgs);
    }
           
}

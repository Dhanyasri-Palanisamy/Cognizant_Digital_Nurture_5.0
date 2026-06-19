

public class logger { 
    public static logger instance= new logger();

    private logger(){
        System.out.println("Logger instance is created");
    }

    public static logger getInstance(){
        return instance;
    }

    public void log(String msg){
        System.out.println("LOG: "+msg);
    }
}

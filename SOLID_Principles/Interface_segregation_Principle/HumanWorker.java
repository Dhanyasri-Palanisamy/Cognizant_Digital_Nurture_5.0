

public class HumanWorker implements workable,Sleepable,eatable {
    @Override
    public void work(){
        System.out.println("Working...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
    @Override
    public void eat(){
        System.out.println("eating...");
    }

}

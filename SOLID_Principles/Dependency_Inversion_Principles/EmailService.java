//package SOLID_Principles.Dependency_Inversion_Principles;

public class EmailService implements MessageService {
    @Override
    public  void sentMessage(){
       System.out.println("Sent Message via Email...");
     }
}

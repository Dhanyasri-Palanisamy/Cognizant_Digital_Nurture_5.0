//package SOLID_Principles.Dependency_Inversion_Principles;

public class Main {
    public static void main(String args[]){
        MessageService service= new EmailService();
        Notification notify= new Notification(service);
        notify.notifyUser();
    }
}

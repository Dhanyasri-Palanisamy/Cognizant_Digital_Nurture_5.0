//package SOLID_Principles.Dependency_Inversion_Principles;

public class Notification {
    MessageService service;
    
    Notification(MessageService service){
        this.service = service;
    }
    public void notifyUser(){
        service.sentMessage();
    }
}

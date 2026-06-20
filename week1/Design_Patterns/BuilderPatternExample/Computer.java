//package week1.Design_Patterns.BuilderPatternExample;

public class Computer {
    private String cpu;
    private String storage;
    private String ram;
    private boolean bluetooth;
    private boolean wifi;

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage= builder.storage;
        this.wifi= builder.wifi;
        this.bluetooth= builder.bluetooth;
    }
     @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage + 
               ", Bluetooth=" + bluetooth + ", Wifi=" + wifi + "]";
    }

    public static class Builder{
        //as we want Computer.Builder builder= new Computer.Builder();
         private String cpu;
    private String storage;
    private String ram;
    private boolean bluetooth;
    private boolean wifi;

    public Builder setstorage(String storage){
           this.storage= storage;
           return this;
    }
    public Builder setcpu(String cpu) {

    this.cpu = cpu;

    return this;

     }  
     public Builder setram(String ram){
        this.ram=ram;
        return this;
     }
      public Builder setBluetooth(boolean bluetooth){

    this.bluetooth = bluetooth;

    return this;

}


      public Builder setWifi(boolean wifi){

    this.wifi = wifi;

    return this;

        }

        public Computer build(){

           return new Computer(this);

             }
      


    }
}

public class Main {

    public static void main(String[] args) {

        Computer computer =
                new Computer.Builder()
                        .setcpu("Intel i7")
                        .setram("16GB")
                        .setstorage("1TB SSD")
                        .setBluetooth(true)
                        .setWifi(true)
                        .build();

        System.out.println(computer);

    }

}
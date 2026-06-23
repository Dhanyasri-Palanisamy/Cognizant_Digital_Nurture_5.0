public class LinearSearchDemo {

    static Products linearSearch(Products[] products, String key) {

        for(Products p : products) {
            if(p.productName.equalsIgnoreCase(key)) {
                return p;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Products products[] = {

                new Products(101,"Laptop","Electronics"),
                new Products(102,"Mouse","Electronics"),
                new Products(103,"Shoes","Fashion"),
                new Products(104,"Phone","Electronics")
        };

        Products result = linearSearch(products,"Shoes");

        if(result!=null)
            result.display();
        else
            System.out.println("Product Not Found");

    }

}
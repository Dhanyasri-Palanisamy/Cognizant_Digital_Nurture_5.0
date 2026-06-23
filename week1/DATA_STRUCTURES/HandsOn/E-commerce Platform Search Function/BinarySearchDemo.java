public class BinarySearchDemo {

    static Products binarySearch(Products[] products,String key){

        int low=0;
        int high=products.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            int compare=products[mid].productName.compareToIgnoreCase(key);

            if(compare==0)
                return products[mid];

            else if(compare<0)
                low=mid+1;

            else
                high=mid-1;

        }

        return null;
    }

    public static void main(String[] args){

        Products products[]={
                new Products(101,"Laptop","Electronics"),
                new Products(102,"Mouse","Electronics"),
                new Products(104,"Phone","Electronics"),
                new Products(103,"Shoes","Fashion")
        };

        Products result=binarySearch(products,"Phone");

        if(result!=null)
            result.display();
        else
            System.out.println("Product Not Found");

    }
}
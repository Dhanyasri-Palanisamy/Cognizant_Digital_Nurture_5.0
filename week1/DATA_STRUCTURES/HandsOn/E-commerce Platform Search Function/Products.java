class Products {

    int productId;
    String productName;
    String category;

    Products(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println(productId + " " + productName + " " + category);
    }
}
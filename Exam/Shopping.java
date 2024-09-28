public class Shopping {
    class Product{
        private int productid;
        private String productName;
        private Double price;

        Product(int productid,String productName,Double price){
            this.productid=productid;
            this.productName=productName;
            this.price=price;
        }

        public void displayProductDetails(){
            System.out.println("Product id :"+productid);
            System.out.println("Prouctname : "+productName);
            System.out.println("Price : "+price);
        }
    }
    class Electronics extends Product{
        private String brand;
        private int warranty;

        Electronics(int productid,String productName,Double price,String brand,int warranty){
            super(productid,productName,price);
            this.brand=brand;
            this.warranty=warranty;
        }

        @Override
        public void displayProductDetails(){
            super.displayProductDetails();
            System.out.println("Brand : "+brand);
            System.out.println("Warranty : "+warranty);
        }
    }
    class clothing extends Product{
        private String size;
        private String material;

        clothing(int productid,String productName,Double price,String size,String material){
            super(productid, productName, price);
            this.size=size;
            this.material=material;
        }

        @Override
        public void displayProductDetails(){
            super.displayProductDetails();
            System.out.println("Size : "+size);
            System.out.println("material : "+material);
        }
    }
    
    public static void main(String[] args) {
        
    }
}

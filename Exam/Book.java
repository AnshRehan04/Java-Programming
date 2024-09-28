public class Book {
    class OrderBook{
        private String Title;
        private String Author;
        private Double Price;

        OrderBook(String  Title,String Author,Double Price){
            this.Title=Title;
            this.Author=Author;
            this.Price=Price;
        }

        public String getTitle(){
            return Title;
        }
        public String getAuthor(){
            return Author;
        }
        public Double getPrice(){
            return Price;
        }

        public void displayBook(){
            System.out.println("Title : "+Title);
            System.out.println("Author : "+Author);
            System.out.println("Price : "+Price);
        }
    }
    public static void main(String[] args) {
        Book bookInstance = new Book();

        // Now create an instance of the inner class OrderBook using the outer instance
        Book.OrderBook b1 = bookInstance.new OrderBook("3 Idiots", "Chetan Bhagat", 400.00);
        b1.displayBook();
    }
}
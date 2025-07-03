class Book {


    static int totalbooks = 0;
    String title;
    String author;
    String isbn;
    Boolean isBorroweed = false;

    static {
        totalbooks = 0;
    }
    {
        totalbooks++;
    }
    Book(String isbn, String title, String author ){
        this.isbn = isbn;
        this.title = title;
        this.author  = author;
    }
    Book(String isbn){
        this(isbn, "Unkown","Unkonwn");
    }

    static int getTotalNoOfBooks(){
        return totalbooks;
    }

    public void borrowBook(){
        if(isBorroweed){
            System.out.println("Book is Already Borrowed.");
        }else{
            this.isBorroweed = true;
            System.out.println("Enjoy The Book.");
        }
    }
    public void returnBook(){
        if(isBorroweed){
            this.isBorroweed = false;
            System.out.println("Hope you Enjoy The Book.");
        }else{
            System.out.println("Book is already in The Library.");
        }
    }
    public static void main(String[] args) {
        Book Design = new Book("01","Design","ChatGPT");
        Book Math = new Book("02");
        System.out.println(getTotalNoOfBooks());
        Design.borrowBook();
        Math.borrowBook();
        Design.borrowBook();
        Design.returnBook();
        Design.returnBook();


    }
}

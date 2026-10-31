class Book {
    int book_id;
    String author;
    String title;
    float price;
    static int totalBook=0;
    Book(int id, String t, String a, float p)
    {
        book_id=id;
        title=t;
        author=a;
        price=p;
        totalBook++;
    }

    void display()
    {
        System.out.println("Book ID : "+book_id);
        System.out.println("Book Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    void search(int bid)
    {
        if(bid == book_id) 
            System.out.println("Book found");
        else
            System.out.println("Book not found");
    }

    void search(int bid, String t)
    {
        if(bid == book_id && title.equalsIgnoreCase(t)) 
            System.out.println("Book found");
        else
            System.out.println("Book not found");
    }

    Book findCostlier(Book b)
    {
        if(this.price > b.price)
            return this;
        else
            return b;
    }

    public static void main(String args[])
    {
        Book b1=new Book(101,"Java","James",500);
        Book b2=new Book(192,"Python","Brooke",1550);
        Book b3=new Book(103,"MySQL","Charlie",700);
        b1.search(502);
        b1.search(101,"Java");
        b1.findCostlier(b2).display();
        System.out.println("Total number of book : "+Book.totalBook);
        System.out.println("Name : Brunda S    USN : 1WN25CS053");
    }
}
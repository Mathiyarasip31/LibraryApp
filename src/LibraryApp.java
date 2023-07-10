class LibraryItem {
    private int id;
    String title;
    int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Book extends LibraryItem
{

     void authorDetail(String author)
    {
        System.out.println("Suppandi");
    }
}
class Magazine extends LibraryItem
{
    int issues;
}
class LibraryApp {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.title="Tinkle";
        String author="bookauthor";
        book1.authorDetail(author);
        book1.year=2010;
        Magazine magz=new Magazine();
        magz.issues=2022;
        magz.setId(100);
        System.out.println("Book Author :"+ magz.getId());
        System.out.println("Tittle :"+book1.title);
        System.out.println("Year :"+book1.year);
        System.out.println("Issue :"+magz.issues);
    }
}

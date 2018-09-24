/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private int borrow;
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    //satisfies 2.83
    public String getAuthor()
    {
        return author;
    }
    //satisfies 2.83
    public String getTitle()
    {
        return title;
    }
    
    
    //satisfies 2.85
    public int getPages()
    {
        return pages;
    }
    
    
    //satisfies 2.84
    public void printAuthor()
    {
        System.out.println(author);
    }

    public void printTitle()
    {
        System.out.println(title);
    }
    
    
    
    //satisfies 2.91
    public void setBorrowed()
    {
        borrow++;
        borrowed = borrow;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    
    
    //satisfies 2.87, 2.89, 2.91
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Number of times borrowed: " + borrowed);
        
        if (refNumber.length() == 0)
            System.out.println("Ref Number: " + "ZZZ" );
        else
            System.out.println("Ref Number: " + refNumber);
    }
    
    
    //satisfies 2.88
    public String getRefNumber()
    {
        return refNumber;
    }
    
    
    //satisfies 2.88, 2.90
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3){
            refNumber = ref;
        }
        else if (ref.length() < 3){
            System.out.println("Ref Number must have at least 3 characters");
        }
    }
}

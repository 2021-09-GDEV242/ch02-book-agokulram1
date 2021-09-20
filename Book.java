/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Gokul Ram
 * @version 9_20_21
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    // Add the methods here ...
    /**
     * 83 - create accessors for String fields
     * accesor method for author
     */
    public String getAuthor()
    {
        return author;
    }
    /**
     * 83 - create accessors for String fields
     * accesor method for title
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * 84 - create print utility methods for private fields
     * This method will print the author
     */
    public void printAuthor()
    {
        System.out.println("Author:"+author);    
    }
    /**
    * 84 - create print utility methods for private fields
    * This method will print the title
    */
    public void printTitle()
   {
       System.out.println("Title:"+title);
    }
}



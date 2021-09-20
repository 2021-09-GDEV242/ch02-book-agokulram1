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
    private int pages;
    private String refNumber;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookpages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookpages;
        refNumber = "";
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
     * 85 - modify object add a new private field with appropriate accessors
     * accesor method for pages
     */
    public int getPages()
    {
        return pages;
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
    /**
     * 87 - add a printDetails method that displays formatted output for all private fields
     * This method will print author
     */
    public void printDetails()
    {
        System.out.println("Title: "+ title+", Author: "+author+ ", Pages: "+ pages);
    }
    /**
     * 88 - modify object add a new private field with appropriate accessors
     * This method is a mutator for setting refnumber
     */
    public void setRefNumber(String ref)
    {
     refNumber = ref;  
    }
    
     /**
     * 88 - modify object add a new private field with appropriate accessors
     * accesor method for refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
}



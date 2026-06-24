public class LibrarySearch 
{
    public static Book linearSearchByTitle(Book[] books, String title) 
    {
        System.out.println("\n[Linear Search] Looking for title: \"" + title + "\"");
        for(int i=0;i<books.length;i++) 
        {
            if(books[i].getTitle().equalsIgnoreCase(title)) 
            {
                System.out.println("FOUND!");
                return books[i];
            }
        }
        System.out.println("Book not found.");
        return null;
    }
    public static Book binarySearchByTitle(Book[] sortedBooks,String title) 
    {
        System.out.println("\n[Binary Search] Looking for title: \"" + title + "\"");
        int left=0;
        int right=sortedBooks.length - 1;
        while(left<=right) 
        {
            int mid=left+(right-left)/2;
            int comparison=sortedBooks[mid].getTitle().compareToIgnoreCase(title);
            if(comparison==0) 
            {
                System.out.println("FOUND!");
                return sortedBooks[mid];
            } 
            else if(comparison<0) 
            {
                left=mid+1;
            } 
            else 
            {
                right=mid-1; 
            }
        }
        System.out.println("Book not found.");
        return null;
    }
    public static void sortByTitle(Book[] books) 
    {
        int n=books.length;
        for(int i=0;i<n-1;i++) 
        {
            for(int j=0;j<n-i-1;j++) 
            {
                if(books[j].getTitle().compareToIgnoreCase(books[j + 1].getTitle())>0) 
                {
                    Book temp=books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                }
            }
        }
    }
}
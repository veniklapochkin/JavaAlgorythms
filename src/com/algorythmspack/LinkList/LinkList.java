


package com.algorythmspack.LinkList;

/**

 * Created on 23.10.2018, 15:50:58
 * @author Vladislav_Borisov
 */
class Link{
    public int iData; // Data(key)
    public double dData; // Data
    public Link next; //next elem in List
    
    public Link(int id, double dd){
        iData = id;
        dData = dd;
        //** next automaticly assigned null*/
    }
    
    public void displayLink(){
        System.out.println("{" + iData +" , " + + dData +"}");
    }
}
public class LinkList {
    private Link first; // link on the fitst elem in List
    
    public LinkList(){
        first = null;   // empty List
    }
    
    public boolean isEmpty(){
        return(first == null);
    }
    
    public void insertFirst(int id, double dd){
        Link newLink = new Link(id,dd);
        newLink.next = first;   // newLink --> old value first
        first = newLink;    //first --> newLink
    }
    
    public Link find(int key){
        Link current = first;
        while(current.iData != key){    // no match found
            if(current.next == null)
               return null;
            else
                current = current.next;
        }
        return current;
    }
    
    
    public Link deleteFirst(){ // Deletion of the fitst elem(assumed that List is'r null)
        Link temp = first;  // save link
        first = first.next; // deletion: first --> link on the second elem
        return temp; // return link on the removed elem
    }
    
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while(current.iData !=key)
        {
            if(current.next == null)
                return null;
            else
            {
                previous = current;
                current = current.next;
            }
        }
        if(current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }
    public void displayList(){
        System.out.println("List (first-->last): ");
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
class LinkListApp{
    public static void main(String[] args) {
        LinkList tList = new LinkList();
        tList.insertFirst(22, 1.99);
        tList.insertFirst(32, 2.99);
        tList.insertFirst(42, 3.99);
        tList.insertFirst(52, 4.99);
        
        tList.displayList();
        
        Link f = tList.find(32);
        if(f != null)
            System.out.println("Found " + f.iData);
        else
            System.out.println("Can't find link: ");
        
        Link d = tList.delete(52);
        if(d != null)
            System.out.println("Deleted " + d.iData);
        else
            System.out.println("Can't find link: ");
        tList.displayList();
        while(!tList.isEmpty())
        {
            Link aLink = tList.deleteFirst();
            System.out.println("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
        tList.displayList();
    }
}

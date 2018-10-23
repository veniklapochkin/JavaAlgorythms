package com.algorythmspack.LinkList;

/**
 *
 * Created on 23.10.2018, 16:51:48
 *
 * @author Vladislav_Borisov
 */
class LinkTSL {

    public int dData;
    public LinkTSL next;

    public LinkTSL(int d) {
        dData = d;
    }

    public void displayLinkTSL() {
        System.out.print(dData + " ");
    }
}

public class TwoSidedList {

    private LinkTSL first;
    private LinkTSL last;

    public TwoSidedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int dd) {
        LinkTSL newLink = new LinkTSL(dd);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int dd) {
        LinkTSL newLink = new LinkTSL(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
    
    public int deleteFirst()
    {
        int temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;
    }
    
    public void displayList(){
        System.out.println("first->last: ");
        LinkTSL current = first;
        while(current!=null)
        {
            current.displayLinkTSL();
            current = current.next;
        }
        System.out.println("");
    }
}

class TwoSidedListApp{
    public static void main(String[] args) {
        TwoSidedList tsl = new TwoSidedList();
        tsl.insertFirst(11);
        tsl.insertFirst(22);
        tsl.insertFirst(33);
        
        
        tsl.insertLast(44);
        tsl.insertLast(55);
        tsl.insertLast(66);
        
        tsl.displayList();
        
        tsl.deleteFirst();
        tsl.deleteFirst();
        tsl.displayList();
    }
}

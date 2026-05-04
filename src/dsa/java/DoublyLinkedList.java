/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.java;

/**
 *
 * @author MSI
 *
 */
@SuppressWarnings("unchecked")
public class DoublyLinkedList <T> implements Iterable <T> {
    private int size = 0;
    private Node  head = null;
    private Node  tail = null;
    
    public class Node  {
        T data;
        private Node  prev,next;
        public Node(T data , Node   prev, Node  next){
            this.data = data;
            this.setPrev(prev);
            this.setNext(next);
        }
        public Node  getPrev (){
            return this.prev;
    }
        public Node   getNext(){
            return this.next;
        }
        
       public void setPrev( Node  prev){
            this.prev = prev;
       }
       public void setNext(Node  next){
           this.next = next;
       }
        @Override 
        public String toString(){
            return data.toString();
        }
    }
    
    public void clear(){
        Node trav = head;
        while(trav != null ){
            Node  next = trav.getNext();
          trav.setNext(null);
          trav.setPrev(null);
          trav.data = null;
          trav = next;
        }
        head = tail = null;
        size = 0;
    }
    public void addFirst(T data){
        if(tail == null){
            tail = head = new Node( data,null,null);
        }else {
            head.setPrev(new Node(data,null,head));
            head = head.getPrev();
        }
        size ++;
    }
    public void addLast(T data){
        if(tail == null){
            head = tail = new Node(data,null,null);
        } else {
            tail.setNext(new Node(data,tail,null));
            tail = tail.getNext();
           
        }
         size++;
    }
    public T removeData(T data){
        for(Node trav = head; trav  != null;trav =trav.getNext()){
    if(trav.data.equals(data)){
        if(trav.getNext() != null) {
              trav.getNext().setPrev(trav.getPrev());
        } else{
            tail = tail.getPrev();
        }
        if(trav.getPrev() != null){
            trav.getPrev().setNext(trav.getNext());
        } else { 
            head = head.getNext();
        }
        size -- ;
    return data;
    }   }
        return null;
        }
    public T removeFirst(){
        if(head == null) return null;
        if(head == tail){
            T data = head.data;
            this.clear();
           return data;
        } else if (head!= null){
            T data = head.data;
            head = head.getNext();
            head.setPrev(null) ;
            size --;
            return data;
        }
        
        return null;
    }
    public T removeLast(){
        if(head == null) return null;
        if(head == tail){
            T data = head.data;
            this.clear();
            return data;
        } else {
            T data = tail.data;
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
            return data;
        }        
    }
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
    Node index = head;
    public boolean hasNext(){
        return index != null;
    }
    public T next (){
        T data = index.data;
         index = index.getNext();
         return data;
    }
};
}
}


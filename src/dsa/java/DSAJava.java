/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.java;

/**
 *
 * @author MSI
 */
public class DSAJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Array<Integer> test = new Array<>();
            test.add(2);
            test.add(3);
            test.add(4);

//        for(int i=0;i< test.size(); i++){
//            System.out.println(test.get(i));
//            
//        }
//        System.out.println(  test.get(0) );
//                      for(int val : test){
//            System.out.println(val);
//        }
            DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();
            dl.addFirst(1);
            dl.addFirst(2);
            dl.addLast(4);
           
            System.out.println(dl.removeFirst());
            for (int data : dl) {
                System.out.println(data);
            }
        } catch(NullPointerException e){
            System.out.println("Pointer reference is null: "+ e);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } 

    }
}

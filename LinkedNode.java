/**
 * Creates a node of generic type for a linked list
 * @author Sophia
 *
 * @param <T> generic data type
 */
public class LinkedNode <T> {

 private T data; // data stored in this linked node
 private LinkedNode<T> next; // next linked node
 
 /**
  * Constructs a node with generic type data and points next to null
  * @param data contents of the node
  */
 public LinkedNode() {
   this.data = null;
   this.next = null;
 }
 
 /**
  * Argument constructor
  * @param data the data stored in the linked node
  * @param next the next linked node
  */
 public LinkedNode(T data, LinkedNode<T> next) {
   this.data = data;
   this.next = next;
 }
 
 /**
  * Accessor for linked node's data
  * @return data
  * @throws NullPointerException if data is null
  */
 public T getData() {
   if (data == null) {
     throw new NullPointerException("Cannot access null data");
   }
   return this.data;
 }
 
 /**
  * Accessor for next linked node
  * @return next node
  * @throws NullPointerException if current node is null
  */
 public LinkedNode<T> getNext() {
   if (data == null) {
     throw new NullPointerException("Cannot access next if data is null");
   }
   return this.next;
 }
 
 /**
  * Mutator for next linked node
  * @param next
  */
 public void setNext(LinkedNode<T> next) {
   this.next = next;
 }
 
 
 /**
  * String representation of linked node's data
  */
 public String toString() {
   return this.data + "";
 }
  
}

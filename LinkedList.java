
/**
 * Unsorted Linked List with Integers
 * @author sophia
 *
 */
public class LinkedList {
  
  private LinkedNode<Integer> head; // front of linked list
  private LinkedNode<Integer> tail; // back of linked list
  private int size;
  
  /**
   * Constructs empty linked list
   */
  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  
  /**
   * Get size of linked list
   * @return size
   */
  public int getSize() {
    return this.size;
  }
  
  /**
   * Determines if list is empty
   * @return true if list is empty
   */
  public boolean isEmpty() {
    return this.size == 0;
  }
  
  /**
   * Clear linked list through garbage collection
   */
  public void clear() {
    this.head = null;
  }
  
  /**
   * Get first node in the list
   * @return LinkedNode<Integer>
   */
  public LinkedNode<Integer> getHead() {
    return this.head;
  }
  
  /**
   * Get last node in list
   * @return LinkedNode<Integer>
   */
  public LinkedNode<Integer> getTail() {
    return this.tail;
  }
  
  /**
   * Get element at certain index of linked list
   * @param index 
   * @return integer at index of linked list
   */
  public int get(int index) {
    
    if (index > size - 1 || index < 0) {
      throw new IndexOutOfBoundsException(index + " out of bounds for size " +size);
    }
    if (index == size - 1) {
      return this.tail.getData();
    }
    
    LinkedNode<Integer> current = head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    return current.getData();
  }
  
  /**
   * Add to front of linked list
   * @param data integer to be added to linked list
   */
  public void prepend(int data) {
    
    LinkedNode<Integer> toAdd = new LinkedNode<Integer>(data, null);
    
    if (isEmpty()) {           // empty linked list
      this.head = toAdd;
      this.tail = toAdd;
    }
    else {                    // non empty linked list
      LinkedNode<Integer> oldHead = this.head;  // assign head to old head
      this.head = toAdd;      // set head to new node
      head.setNext(oldHead);  // set head-->next to old head
    }
    this.size++;
  }
  
  /**
   * Add to back of linked list
   * @param data to be added to linked list
   */
  public void append(int data) {
    
    LinkedNode<Integer> toAdd = new LinkedNode<Integer>(data, null);
    
    if (isEmpty()) {        // empty linked list
      this.head = toAdd;
      this.tail = toAdd;
    }
    else {                  // non empty linked list
      tail.setNext(toAdd);  // set tail-->next to new node
      tail = toAdd;         // set tail to new node
    }
    this.size++;
  }
  
  /**
   * Add to certain index of linked list
   * @param index
   * @param data to be added to linked list
   */
  public void add(int index, int data) {
    
    LinkedNode<Integer> toAdd = new LinkedNode<Integer>(data, null);
    
    if (isEmpty()) {        // empty linked list
      this.head = toAdd;
      this.tail = toAdd;
    }
    else {
      LinkedNode<Integer> current = head;
      for (int i = 0; i < index - 1; i++) {
        current = current.getNext();
      }
      LinkedNode<Integer> next = current.getNext();
      current.setNext(toAdd);
      current.getNext().setNext(next);
    }
    size++;
  }
  
  /**
   * Remove data from certain index in linked list
   * @param index
   */
  public void remove(int index) {
    if (index > size - 1) {
      throw new IndexOutOfBoundsException("index is out of bounds for linked list size");
    }
    
    LinkedNode<Integer> current = head;
    if (index == 0) {
      this.head = current.getNext();
    }
    else {
      for (int i = 0; i < index - 1; i++) {
        current = current.getNext();
      }
      current.setNext(current.getNext().getNext());
    }
    size--;
  }
  
  /**
   * String representation of elements in the linked list
   */
  public String toString() {
    LinkedNode<Integer> current = head;
    String output = "";
    for (int i = 0; i < size; i++) {
      output += current.getData() + " --> ";
      current = current.getNext();
    }
    output += "null";
    return output;
  }
 
}

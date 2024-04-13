// IntList Class to Complete
public class IntList {
  private IntNode head;
  private IntNode current_node;  // for iterator
                                 //methods only
  public IntList() {
  // Inits as empty list
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  // ** TO COMPLETE **
  public void append(int new_value) {
    // Check if list empty

    
    // if not empty, search for last node and append


  // Iterator Methods
  public void reset() {
    current_node = head;
  }

  public boolean hasNext() {
    // (to complete)
  }

  public int next() {
    // (to complete)
  }
    
  // Display Method
  public void displayList() {
    if(head == null) 
      System.out.println("* empty list * ");
    else {
      IntNode tempPtr = head;
      while(tempPtr != null) {
        System.out.println(tempPtr.getValue());
        tempPtr = tempPtr.getNext();
      }
    }
  }
}
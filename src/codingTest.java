/**
 * Created by dhruvdevsalwan on 9/26/16.
 */
public class codingTest {

    public static void main(String[] xyz){

        operationOnList operation=new operationOnList();
        listElement head=operation.createList(100);

        //adding first element in the list
        operation.insertFirstElement(200, head);

        System.out.println("List before insertion at end");
        //Traversing the list
        operation.printList(head);

        //Inserting element at end of list
        operation.insertElementAtEnd(300,head);

        System.out.println("List after insertion at end");
        operation.printList(head);

        //Inserting element at the beginning
        head=operation.insertElementAtBeginning(50, head);
        System.out.println("List after insertion at the beginning");
        operation.printList(head);

        //Inserting element in the middle
        System.out.println("List after insertion in the middle");
        operation.insertElementInMiddle(250,2,head);
        operation.printList(head);




    }
}

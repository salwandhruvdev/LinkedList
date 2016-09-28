/**
 * Created by dhruvdevsalwan on 9/26/16.
 */
public class codingTest {

    public static void main(String[] xyz){

        operationOnList operation=new operationOnList();
        listElement head=operation.createList(100);

        //adding first element in the list
        operation.insertElement(200,head);

        //Traversing the list
        operation.traverseList(head);


    }
}

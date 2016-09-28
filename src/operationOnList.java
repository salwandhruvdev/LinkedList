/**
 * Created by dhruvdevsalwan on 9/27/16.
 */
public class operationOnList {
    //create a list function
    public listElement createList(int data){
        listElement element=new listElement(data);
        return element;
    }

    //insert an element in the list
    public void insertElement(int data, listElement head){
        listElement newElement=new listElement(data);
        head.setNext(newElement);
    }

    //traversing the list
    public void traverseList(listElement element){
        while(element.getNext()!= null){
            System.out.println("Value is " + element.getData());
            element=element.getNext();
        }
        System.out.println("Last element is " + element.getData());
    }
}

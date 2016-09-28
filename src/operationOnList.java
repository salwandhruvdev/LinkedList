/**
 * Created by dhruvdevsalwan on 9/27/16.
 */
public class operationOnList {
    //create a list function
    public listElement createList(int data){
        listElement element=new listElement(data);
        return element;
    }

    //insert first element after head in the list
    public void insertFirstElement(int data, listElement head){
        listElement newElement=new listElement(data);
        head.setNext(newElement);
    }

    //insert element at the end
    public void insertElementAtEnd(int data, listElement head){
        listElement element=traverseList(head);
        listElement newElement=new listElement(data);
        element.setNext(newElement);
    }

    //insert element at the beginning
    public listElement insertElementAtBeginning(int data, listElement head){
        listElement newElement=new listElement(data);
        newElement.setNext(head);
        return newElement;
    }


    //traversing the list
    public listElement traverseList(listElement element){
        while(element.getNext()!= null){
            element=element.getNext();
        }
        return element;
    }

    //printing the list
    public void printList(listElement element){
        while(element.getNext()!= null){
            System.out.println("Value is " + element.getData());
            element=element.getNext();
        }
        System.out.println("Last element is " + element.getData());
    }
}


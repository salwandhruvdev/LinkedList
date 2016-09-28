/**
 * Created by dhruvdevsalwan on 9/27/16.
 */
public class listElement {
    //This is linkedlist class

    private int data;
    private listElement next;

    //Constructor for a new elememt in the listElement

    public listElement(int value){
        data=value;
    }
    //Now setters and getters for Value and next
    //We don't need a setter and getter for data because we can use object reference for that
    //Wrong we need setters and getter as class variables are private

    public int getData(){
        return data;
    }

    public void setNext(listElement newNext){
        next=newNext;
    }
    public listElement getNext(){
        return next;
    }
}

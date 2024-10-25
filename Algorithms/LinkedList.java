import java.util.*;

public class LinkedList
{   
    public class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public Node head=null;
    public Node tail=null;
    
    public void create(){
        Scanner scan=new Scanner(System.in);
        int data=scan.nextInt();
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=null;
        }
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("\n");
    }
    
    public void insert(){
        Scanner scan=new Scanner(System.in);
        System.out.print("1. At begin\n2. At end\n3. At specific Position\nEnter your option: ");
        int opt=scan.nextInt();
        int data;
        switch(opt){
            case 1:
                System.out.print("\nEnter the value:");
                data=scan.nextInt();
                Node newNode=new Node(data);
                Node temp=head;
                head=newNode;
                head.next=temp;
                break;
            case 2:
                create();
                break;
            case 3:
                System.out.print("\nEnter the position:");
                int pos=scan.nextInt();
                System.out.print("\nEnter the data:");
                data=scan.nextInt();
                int count=1;
                newNode=new Node(data);
                Node prev=head;
                while(count<pos-1&&prev!=null){
                    prev=prev.next;
                    count++;
                }
                temp=newNode;
                temp.next=prev.next;
                prev.next=temp;
                break;
        }
    }
    
    public void delete(){
        Scanner scan=new Scanner(System.in);
        System.out.print("1. At begin\n2. At end\n3. At specific Position\nEnter your option: ");
        int opt=scan.nextInt();
        switch(opt){
            case 1:
                Node temp=head;
                head=head.next;
                break;
            case 2:
                Node current=head;
                while(current.next.next!=null){
                    current=current.next;
                }
                current.next=null;
                break;
            case 3:
                System.out.print("\nEnter the position:");
                int pos=scan.nextInt();
                int count=1;
                Node prev=head;
                while(count<pos-1&&prev!=null){
                    count++;
                    prev=prev.next;
                }
                prev.next=prev.next.next;
        }
    }
    
    public void search(int target){
        Node temp=head;
        int count=0,flag=0;
        while(temp!=null){
            if(temp.data==target){
                System.out.println(target+" is present in "+count+"th index");
                flag=1;
                break;
            }
            count++;
            temp=temp.next;
        }
        System.out.println(flag==0?"Not found!":"");
    }
    
    public void length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("the size is "+count);
    }
    
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    LinkedList list=new LinkedList();
		int opt;
		do{
		    System.out.print("Linked List\n-----------\n1. Create\n2. Insertion\n3. Deletion\n4. Search\n5. Length\n6. Display\n0. Exit\n\nEnter your option: ");
            opt=scan.nextInt();
		    switch(opt){
		    case 1:
		        System.out.print("Enter the Length: ");
		        int len=scan.nextInt();
		        System.out.println("Enter the values: ");
		        for(int i=0;i<len;i++){
		            list.create();
		        }
		        break;
		    case 2:
		        list.insert();
		        break;
		    case 3:
		        list.delete();
		        break;
		    case 4:
		        System.out.print("Enter the target: ");
		        int target=scan.nextInt();
		        list.search(target);
		        break;
		    case 5:
		        list.length();
		        break;
		    case 6:
		        list.display();
		        break;
		    case 0:
		        break;
	    }
		}while(opt!=0);
	}
}
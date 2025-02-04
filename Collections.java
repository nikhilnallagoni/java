import java.util.*;
import java.lang.*;
class collections {
    public static void printList(ArrayList<Integer>arr) {

        //using for each loop
        // for(Integer num:arr){
        //     System.out.print(num+" ");
        // }

        //using for each loop with lambda expression
        arr.forEach(num->System.out.print(num + " "));
        System.out.println();
    }

    public static void arrayList() {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(0, 0); //inserts 0 at index 0
        printList(arr);
        arr.remove(2);//removes element at index 2
        printList(arr);


        //to remove an element from the list based upon the value use
        // arr.remove(Integer.valueOf(x));//where x is the value to be removed

        //to remove all occurences from the list
        // arr.removeAll(Collections.singleton(value));//where x is the value to be removed

        boolean contains3 = arr.contains(3); //returns true if 3 is present in the list

        int index = arr.indexOf(3); //returns the index of the first occurence of 3 in the list
        //
        int lastIndex = arr.lastIndexOf(3); //returns the index of the last occurence of 3 in the list

        boolean empty = arr.isEmpty(); //returns true if the list is empty

        ListIterator<Integer>itr = arr.listIterator(); //returns a list iterator over the elements in the list   **we we mention any value inside the itr it gives a list iterator starting from that index
        //printing using iterator;
        System.out.println("Printing using iterator");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        arr.removeIf(num -> num % 2 == 0); //removes all even numbers from the list
        printList(arr);

        arr.set(/*index*/0,/*value*/10);//sets the value at index 0 to 10

        Object[]arr2 = arr.toArray(); //converts the list to an array


        //if you want to delclare Integer[] arr2 then
        Integer[]arr3 = arr.toArray(new Integer[0]); //optimized way since using zero

        // time complexities
        // inserting 0(1)
        //deleting 0(N)
        //replcing o(1) for both time and space complexities
        //searching 0(N)

        //ArrayList is not synchronized
        //ArrayList is not thread safe


        //the major difference array and vector is that vector is synchronized and array is not
        //Vector is thread safe

    }

    public static void stack() {
        //java.util.stack
        Stack<Integer>st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        // st.pop();//removes the last top element and returns
        System.out.println(st.pop());
        st.isEmpty();//returns true is stack is empty otherwise false
        System.out.println(st.peek());
        System.out.println(st.search(4));//if element is found returns the position else retunrs -1

        //And also we can use the methods which can be used for vector since stack inherits from vector
        // System.out.println(st);
    }

    public static void linkedList() {
        LinkedList<Integer> l = new LinkedList<>();
        // add(index,element);
        // add(element); //appends at the end of the list
        // addFirst(element);
        //addLast(element);
        //offer(element) //adds the element at the end of the list
        //offerFirst(element) // adds element at the front of the list
        //offerLast(element) // adds element at the end of the list
        //   Difference between peek and poll
        // peeks just returns the top element whereas poll returns ans removes the element

    }
    public static void queue() {


        // add(element): Adds an element to the rear of the queue. If the queue is full, it throws an exception.
        // *offer(element): Adds an element to the rear of the queue. If the queue is full, it returns false.

        // remove(): Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.
        // *poll(): Removes and returns the element at the front of the queue. If the queue is empty, it returns null.

        // element(): Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.
        //* peek(): Returns the element at the front of the queue without removing it. If the queue is empty, it returns null

        //1. Linkedlist class implementing queue interface
        // Queue<String>q=new LinkedList<>();
        // q.offer("extex1"); //adds at the end of the queue
        // q.offer("edtex2");
        // q.offer("edtex3");
        // q.offer("edtex4");
        // q.offer("edtex5");


        // System.out.println(q.poll()); //removes and returns the front element of the queue
        // System.out.println("top of queue " + q.peek() );//only returns the front of the queue without returning it
        // System.out.println(q);//prints the entire queue

        //2.Priority_queue class implementing queue interface
        // Queue<String>pq=new PriorityQueue<>(Collections.reverseOrder());
        // pq.offer("edtex2");
        // pq.offer("edtex1");
        // pq.offer("edtex3");
        // pq.offer("edtex4");
        // pq.offer("apple");
        // pq.offer("zebra");


        // System.out.println(pq);

        //priority blocking queue is the alternate implementation if thread safe implementation is needed
        //ArrayDeque is not a thread safe  alternatives for thread safe is  ConcurrentLinkedDeque and LinkedBlockingDeque
        Deque<Integer>dq=new ArrayDeque<>();
        dq.add(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.offerFirst(0);
        dq.offerLast(4);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        dq.push(0);//adds in the front
        dq.offer(4);//adds at the end
        System.out.println("removed first element : "+dq.removeFirst());
        System.out.println(dq);


    }
    public static void maps(){
      //map map data structure in java is implemented using 2 interfaces 1.Map Interface 2.SortedMap Interface
      //implementing classes : 1.HashMap 2.TreeMap 3.LinkedHashMap
      //Thread safe : ConcurrentHashMap    
	Map<Integer,Integer>mp=new HashMap<>();
      mp.put(1,2);
      mp.put(2,2);
      mp.put(3,1);
      mp.put(4,7);
      mp.put(5,9);
      System.out.println(mp.containsValue(8));
      System.out.println(mp.containsKey(1));
      
      //traversing through the map using entrySet() in java
     for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
          System.out.println(entry.getKey()+" " +entry.getValue());
     }
      //putAll(Map) is used to put all the content of a map to another map
      
     System.out.println("keySet: "+mp.keySet());
     mp.getOrDefault(1,0);//getOrDefault(key,defaultValue);
     mp.putIfAbsent(6,9);//puts into the map if not present
     System.out.println(mp);
     

     //finding the frequency of elements using hashmap
     System.out.println("finding the frequency");
     Map<Integer,Integer>mpp=new TreeMap<>();
     ArrayList<Integer>nums=new ArrayList<>();
     nums.add(1);
     nums.add(1);
     nums.add(2);
     nums.add(2);
     nums.add(3);
     
     nums.add(3);
     nums.add(3);
     nums.add(3);
     nums.add(3);
     for(int i=0;i<nums.size();i++){
	     mpp.put(nums.get(i),mpp.getOrDefault(nums.get(i),0)+1);
     }
     System.out.println(mpp);



     
    }
    public static void set(){
	//set interface 
	//implementing classes : HashSet , LinkedHashSet , TreeSet
	Set<Integer>st = new HashSet<>();
	st.add(1);
	st.add(2);
	st.add(3);
	st.add(4);
	st.add(5);
	st.add(5);
	st.add(1);
	ArrayList<Integer>arr=new ArrayList<>();
	arr.add(6);
	arr.add(7);
	st.addAll(arr);//adds all elements of the give collection into the set
	
	System.out.println(st);

	System.out.println(st.remove(2));

	//converting a set into a array using toArray() property.
	Object[] arr1=st.toArray();// or Integer[]arr1 = st.toArray(new Integer[0]);
				   //   // Adding all elements to List  a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
	for(int i=0;i < arr1.length ; i++ ){
		System.out.println("arr "+arr1[i]);
	}

	//learn more about enumSets 
	

	//TreeSet uses a tree data structure for storage
    }
    public static void main(String[] args) {
        // stack();
        // linkedList();
        // queue();
     //maps();
     //set();

    }

}

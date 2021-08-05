package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.handler.BoardList2.Node;

public class LinkedList {
	static class Node {
		Object item;
		Node next;
		
	    public Node(Object item) {
	        this.item = item;
	      }
	}
	
	  Node head;
	  Node tail;
	  int size = 0;

	  public void add(Object item) {
	    // 새 노드를 만든다. 생성자를 호출할 때, 노드에 담을 Board 객체 주소를 넘긴다. 
	    Node node = new Node(item);

	    if (head == null) {
	      tail = head = node;
	    } else {
	      // 기존에 tail이 가리키는 마지막 노드의 next 변수에 새 노드 주소를 저장한다.
	      tail.next = node;

	      // 새로 만든 노드를 마지막 노드로 설정한다. 
	      tail = node;
	    }

	    size++;
	  }
	  
	  public Object[] toArray() {
		    // 배열에 저장된 값을 담을 정도의 크기를 가진 새 배열을 만든다.
		  Object[] arr = new Object[this.size]; 

		    Node node = head;

		    for (int i = 0; i < this.size; i++) {
		      arr[i] = node.item;
		      node = node.next;
		    }

		    return arr; // 새 배열을 리턴한다.
		  }


}

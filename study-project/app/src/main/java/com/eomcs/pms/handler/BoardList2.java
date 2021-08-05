package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.handler.LinkedList.Node;

public class BoardList2 extends LinkedList {
	Object[] list = toArray();
	
	  public Object findByNo(int no) {
		    Node node = head;
		    while (node != null) {
		      if (node.item.no == no) {
		        return node.item;
		      }
		      node = node.next;
		    }
		    return null;
		  }
  }






  public boolean remove(Board board) {
    Node node = head;
    Node prev = null;

    while (node != null) {
      if (node.board == board) { // 노드에 들어 있는 객체와 같다면
        if (node == head) { // 삭제할 노드가 하필이면 첫 번째 노드라면, 
          head = node.next; // head가 두 번째 노드를 가리키게 한다.
        } else { // 삭제할 노드가 첫 번째 노드가 아니라면
          prev.next = node.next; // 이전 노드를 다음 노드와 연결한다.
        }

        node.next = null; // 삭제할 노드가 더이상 다음 노드를 가리키지 않게 한다.

        if (node == tail) { // 삭제할 노드가 마지막 노드라면
          tail = prev; // tail이 이전 노드를 가리키게 한다.
        }
        size--;
        return true;
      }

      // 현재 노드가 아니라면,
      prev = node; // 현재 노드를 prev 에 저장하고,
      node = node.next; // node 는 다음 노드를 가리킨다.
    }

    return false;
  }
}









/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author RavitejaSomisetty
 */
public class SingleLinkedList {

    /**
     * @param args the command line arguments
     */
    SingleNode first;

    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        for (int i = 10; i <= 20; i++) {
            sl.insert(i);
        }
        //sl.printAll(sl.first);
        sl.deleteFirst();
        SingleLinkedList.recursiveSearch(sl.first, 20);
        sl.swapNodes(13, 15);
        sl.first=sl.reverseLinkedList(sl.first);
        sl.printAll(sl.first);

    }

    private SingleNode reverseLinkedList(SingleNode head) {
        if (head == null || head.next==null) {
            return head;
        }
        SingleNode f = head;
        SingleNode r = head.next;
        SingleNode rest=this.reverseLinkedList(r);
        f.next.next=f;
        f.next=null;
        return rest;
        
    }

    private void swapNodes(Object a, Object b) {
        SingleNode p = this.first;
        SingleNode qprev = null, q = null, rprev = null, r = null;
        while (p.next != null) {
            if (p.next.data.equals(a)) {
                qprev = p;
                q = p.next;
            } else if (p.next.data.equals(b)) {
                rprev = p;
                r = p.next;
            }
            p = p.next;
        }
        qprev.next = r;
        rprev.next = q;

        p = r.next;
        r.next = q.next;
        q.next = p;
    }

    private void deleteFirst() {
        SingleNode temp = this.first;
        this.first = this.first.next;
        temp = null;
    }

    private static void recursiveSearch(SingleNode node, Object d) {
        if (node == null) {
            System.out.print("NO\n");
            return;
        }
        if (node.data.equals(d)) {
            System.out.print("YES\n");
            return;
        }
        SingleLinkedList.recursiveSearch(node.next, d);
    }

    private void printAll(SingleNode reader) {
        while (reader != null) {
            System.out.println(reader.data);
            reader = reader.next;
        }
    }

    protected void insert(Object data) {
        SingleNode sn = new SingleNode(data);
        sn.next = null;
        if (first == null) {
            first = sn;
        } else {
            SingleNode access = first;
            while (access.next != null) {
                access = access.next;
            }
            access.next = sn;
        }

    }

}

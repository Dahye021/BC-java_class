package javabasic_02.day17.treeEx;
//노트 클래스 만들기
public class NodeMgmt {

    Node head = null;

    public class Node{
        Node left,right;
        int value;
        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}

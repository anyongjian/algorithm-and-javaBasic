package algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*����������ڵ�*/
class Node {
	public int value;
	Node leftChild;
	Node rightChild;
	public Node(int value){
		this.value = value;
	}
}
public class TraverseTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node root = initTree(new Node(0), sc);
		layerTravel(root);

	}
	
	/*��ʼ��tree*/
	public static Node initTree(Node node,Scanner sc){
		//Node root = node;  //��Ǹ��ڵ�
		int temp = -1;
		if(sc.hasNextInt()){
			temp = sc.nextInt();
			node = new Node(temp);
			node.leftChild = initTree(node.leftChild, sc);
			node.rightChild = initTree(node.rightChild, sc);
			return node;
		} 
		else{
			return null;
		}
	}
	/*�������tree*/
	public static void layerTravel(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node node = queue.poll();//�Ӷ���ȡ��һ��Ԫ��
			System.out.print(node.value+" ");
			if(node.leftChild!=null){
				queue.add(node.leftChild);
			}
			if(node.rightChild!=null){
				queue.add(node.rightChild);
			}
		}
	}

}

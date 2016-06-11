package com.learn.tree;

public class BinaryTree {
	public Tree root = null;
	
	public Tree getRoot()
	{
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		bt.insert(100);
		bt.insert(23);
		bt.insert(12);
		bt.insert(34);
		bt.insert(15);
		bt.insert(3);
		bt.insert(8);
		bt.insert(56);
		bt.insert(70);
		bt.inorder(bt.getRoot());

		bt.findandDelete(8);
		System.out.println("New List : ");
		bt.inorder(bt.getRoot());

		bt.findandDelete(100);
		System.out.println("New List : ");
		bt.inorder(bt.getRoot());
		
		bt.findandDelete(100);
		System.out.println("New List : ");
		bt.inorder(bt.getRoot());
	}
	
	public Tree createTree()
	{
		BinaryTree bt = new BinaryTree();
		bt.insert(100);
		bt.insert(23);
		bt.insert(12);
		bt.insert(34);
		bt.insert(15);
		bt.insert(3);
		bt.insert(8);
		bt.insert(56);
		bt.insert(70);
		return this.root;
		
	}

	public void insert(int x) {
		Tree newnode = new Tree(x);
		newnode.left = null;
		newnode.right = null;
		if (this.root == null) {
			this.root = newnode;
		} else {
			Tree temp = this.root;
			Tree parent = temp;
			while (temp != null) {
				parent = temp;
				if (x < temp.value)
					temp = temp.left;
				else
					temp = temp.right;
			}
			if (x < parent.value) {
				parent.left = newnode;
			} else {
				parent.right = newnode;
			}
		}

	}

	public void findandDelete(int x) {
		Tree temp = root;
		Tree parent = null;
		if (x == root.value)
			delete(root, null);
		else {
			while (temp != null && temp.value != x) {
				parent = temp;
				if (x > temp.value)
					temp = temp.right;
				else if (x < temp.value)
					temp = temp.left;
			}
			if (temp == null) {
				System.out.println("Item not found");
			} else {
				delete(temp, parent);
			}
		}

	}

	public Tree findSucessor(Tree node) {
		Tree temp = node;
		temp = temp.right;
		while (temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}

	public void delete(Tree node, Tree parent) {
		// Case 1 : node is leaf node
		if (node.right == null && node.left == null) {
			if (parent == null) {
				root = null;
			} else {
				if (parent.right == node) {
					parent.right = null;
				} else {
					parent.left = null;
				}
			}
		} else
		// Case 2 : node has left child
		if (node.right == null) {
			if (parent == null) {
				root = root.left;
			} else {
				if (parent.right == node) {
					parent.right = node.left;
				} else {
					parent.left = node.left;
				}
			}
		} else
		// Case 4 : node has right subchild
		if (node.left == null) {
			if (parent == null) {
				root = root.right;
			} else {
				if (parent.right == node) {
					parent.right = node.right;
				} else {
					parent.left = node.right;
				}
			}
		}
		// Case 5 : node has right and lef subchild
		else {
			Tree successor = findSucessor(node);
			Tree successorParent = findParent(node);
			node.value = successor.value;
			delete(successor, successorParent);
		}
	}

	public Tree findParent(Tree node) {
		Tree temp = root;
		Tree parent = null;
		if (temp.value == node.value) {
			return null;
		} else {
			while (node.value != temp.value) {
				parent = temp;
				if (node.value > temp.value) {
					temp = temp.right;
				} else if (node.value < temp.value) {
					temp = temp.left;
				}
			}
			return parent;
		}
	}

	public void inorder(Tree node) {
		if (node == null) {
			return;
		} else {
			inorder(node.left);
			System.out.println(node.value);
			inorder(node.right);
		}
	}

}

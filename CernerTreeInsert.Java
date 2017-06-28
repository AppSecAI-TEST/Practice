//Insert function for the BST

void insert(Node tree, char value){
		if(tree == null){
			tree = new Node(value);
			return tree;
		}
			return;
		
		if(value < tree.data)
			tree.left = insert(tree.left,value);
		else
			tree.right = insert(tree.right,value);
	}

package arboles_binarios;

import java.util.Optional;

public class nodo_sh2 {

	private Integer value;
	 private nodo_sh2 left;
	 private nodo_sh2 right;
	 public nodo_sh2(Integer value) {
	 this.value = value;
	 }
	 public Integer getValue() {
	 return value;
	 }
	 public void setValue(Integer value) {
	 this.value = value;
	 }
	 public nodo_sh2 getLeft() {
	 return left;
	 }
	 public void setLeft(nodo_sh2 left) {
	 this.left = left;
	 }
	 public nodo_sh2 getRight() {
	 return right;
	 }
	
	 public void setRight(nodo_sh2 right) {
	 this.right = right;
	 }
	 public void add(Integer value) {
	 if (value < this.value) {
	 if (left != null) {
	 left.add(value);
	 } else {
	 left = new nodo_sh2(value);
	 }
	 } else {
	 if (right != null) {
	 right.add(value);
	 } else {
	 right = new nodo_sh2(value);
	 }
	 }
	 }
	 public Optional<nodo_sh2> find(Integer value) {
	 if (value == this.value) {
	 return Optional.of(this);
	 } else if (value < this.value) {
	 if (this.left != null) {
	 return this.left.find(value);
	 } else {
	 return Optional.empty();
	 }
	

	} else
	{
	 if
	(this
	.right != null
	)
	{
	 return this
	.right
	.find
	(value
	)
	;

	} else
	{
	 return Optional
	.empty()
	;

	}

	}

	}
	 public void printInOrder()
	{
	 if
	(left != null
	)
	{
	 left
	.printInOrder()
	;

	}
	 System
	.out
	.println
	(value
	)
	;
	 if
	(right != null
	)
	{
	 right
	.printInOrder()
	;

	}

	}
	 public void printPreOrder()
	{
	 System
	.out
	.println
	(value
	)
	;
	 if
	(left != null
	)
	{
	 left
	.printPreOrder()
	;

	}
	 if
	(right != null
	)
	{
	 right
	.printPreOrder()
	;

	}

	}
	
	 public void printPosOrder() {
	 if (left != null) {
	 left.printPreOrder();
	 }
	 if (right != null) {
	 right.printPreOrder();
	 }
	 System.out.println(value);
	 }
	 public nodo_sh2 findPredecessor() {
	 if (this.getRight() == null) {
	 return this;
	 } else {
	 return this.getRight().findPredecessor();
	 }
	 }
	 public nodo_sh2 findSuccessor() {
	 if (this.getLeft() == null) {
	 return this;
	 } else {
	 return this.getLeft().findSuccessor();
	 }
	 }
	 public nodo_sh2 delete(Integer value) {
		 nodo_sh2 response = this;
	 if (value < this.value) { this.left = this.left.delete(value); } else if (value > this.value) {
	
	 this.right = this.right.delete(value);
	 } else {
	 if (this.left != null && this.right != null) {
		 nodo_sh2 temp = this;
	 nodo_sh2 maxOfTheLeft = this.left.findPredecessor();
	 this.value = maxOfTheLeft.getValue();
	 temp.left = temp.left.delete(maxOfTheLeft.getValue());
	 } else if (this.left != null) {
	 response = this.left;
	 } else if (this.right != null) {
	 response = this.right;
	 } else {
	 response = null;
	 }
	 }
	 return response;
	 }
	 public String toString() {
	 return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	 }
	}



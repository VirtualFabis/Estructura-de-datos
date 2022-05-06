package arboles_binarios;

import java.util.Optional;

public class nodo_sh3 {
	private Integer value;
	 private nodo_sh3 left;
	 private nodo_sh3 right;
	 public nodo_sh3(Integer value) {
	 this.value = value;
	 }
	 public Integer getValue() {
	 return value;
	 }
	 public void setValue(Integer value) {
	 this.value = value;
	 }
	 public nodo_sh3 getLeft() {
	 return left;
	 }
	
	 public void setLeft(nodo_sh3 left) {
	 this.left = left;
	 }
	 public nodo_sh3 getRight() {
	 return right;
	 }
	 public void setRight(nodo_sh3 right) {
	 this.right = right;
	 }
	 public void add(Integer value) {
	 if (value < this.value) {
	 if (left != null) {
	 left.add(value);
	 } else {
	 left = new nodo_sh3(value);
	 }
	 } else {
	 if (right != null) {
	 right.add(value);
	 } else {
	 right = new nodo_sh3(value);
	 }
	 }
	 }
	 public Optional<nodo_sh3> find(Integer value) {
	
	 if
	(value == this
	.value
	)
	{
	 return Optional
	.of(this
	)
	;

	} else if
	(value
	< this
	.value
	)
	{
	 if
	(this
	.left != null
	)
	{
	 return this
	.left
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
	
	 if (left != null) {
	 left.printPreOrder();
	 }
	 if (right != null) {
	 right.printPreOrder();
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
	 public String toString() {
	 return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	 }
	}
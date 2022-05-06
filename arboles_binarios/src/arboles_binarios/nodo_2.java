package arboles_binarios;

import java.util.Optional;

public class nodo_2 {

	 private Integer value;
	 private nodo_2 left;
	 private nodo_2 right;
	 public nodo_2(Integer value) {
	 this.value = value;
	 }
	 public Integer getValue() {
	 return value;
	 }
	 public void setValue(Integer value) {
	 this.value = value;
	 }
	 public nodo_2 getLeft() {
	 return left;
	 }
	 public void setLeft(nodo_2 left) {
	 this.left = left;
	 }
	 public nodo_2 getRight() {
	 return right;
	 }
	 public void setRight(nodo_2 right) {
	
	 this.right = right;
	 }
	 public void add(Integer value) {
	 if (value < this.value) {
	 if (left != null) {
	 left.add(value);
	 } else {
	 left = new nodo_2(value);
	 }
	 } else {
	 if (right != null) {
	 right.add(value);
	 } else {
	 right = new nodo_2(value);
	 }
	 }
	 }
	 public Optional<nodo_2> find(Integer value) {
	 if (value == this.value) {
	 return Optional.of(this);
	 } else if (value < this.value) {
	 if (this.left != null) {
	 return this.left.find(value);
	 } else {
	 return Optional.empty();
	 }
	 } else {
	 if (this.right != null) {
	 return this.right.find(value);
	
	 } else {
	 return Optional.empty();
	 }
	 }
	 }
	 public void printInOrder() {
	 if (left != null) {
	 left.printInOrder();
	 }
	 System.out.println(value);
	 if (right != null) {
	 right.printInOrder();
	 }
	 }
	 public String toString() {
	 return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	 }
	}


package com.bilgeadam.boost.java.course01.lesson17;

public class Node {
	int data; // veri kısmı. herçeşit veri olabilir
	Node next; // bir sonraki düzğüm (node)
	
	void setData(int data) {
		this.data = data;
	}
	
	int getDat() {
		return this.data;
	}
	
	void setNext(Node next) {
		this.next = next;
	}
	
	Node getNext() {
		return this.next;
	}
	
	public String content() {
		return " Düğümün İçeriği Node [data=" + data + ",next=" + next + "]";
	}
}

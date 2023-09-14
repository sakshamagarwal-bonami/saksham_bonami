package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Node{
	Integer data;
	Node next;
	Node(){
		this.data=-1;
		this.next=null;
	}
	Node(Integer x){
		this.data=x;
		this.next=null;
	}
}

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> ts=new TreeSet<Integer>();
		ts.add(5);
		ts.add(3);
		ts.add(7);
		ts.add(1);
		ts.add(8);
		ts.add(73);
		ts.add(4);
		ts.add(90);
		System.out.println(ts);
		
		Set<Integer> tsc=new TreeSet<Integer>(new MyComparator());
		tsc.add(5);
		tsc.add(3);
		tsc.add(7);
		tsc.add(1);
		tsc.add(8);
		tsc.add(73);
		tsc.add(4);
		tsc.add(90);
		System.out.println(tsc);
		
		List<Integer> arr=Arrays.asList(3,4,2,5,53,2,5,2,2,324,55);
		arr.stream().sorted().forEach(a->System.out.print(a+" "));
		System.out.println();
		arr.stream().sorted(new MyComparator()).forEach(a->System.out.print(a+" "));
		System.out.println();
		
		List<Integer> al=new ArrayList<Integer>();
		al= Arrays.asList(2,3,2,21,24,46,40);
		Collections.sort(al);
		
		System.out.print(al+" ");
		System.out.println();
		
		Collections.sort(al,(i1,i2)->i2.compareTo(i1));
		
		System.out.print(al+" ");
		System.out.println();
		
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(2);
		ll.add(4);
		ll.add(5);
		ll.add(1);
		System.out.println(ll);
		System.out.println("Enter Linked List");
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		Node headNode=new Node(x);
		Node prev=new Node(-1);
		prev=headNode;
		x=scn.nextInt();
		while(x!=-1) {
			Node tempNode=new Node(x);
			prev.next=tempNode;
			prev=tempNode;
			x=scn.nextInt();
		}
		
		Node temp=new Node(-1);
		temp=headNode;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		
		
		
		
		
		
		
		
	}

}

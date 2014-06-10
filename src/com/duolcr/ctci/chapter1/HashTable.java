package com.duolcr.ctci.chapter1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

public class HashTable<K, V> {
	private TreeMap<Integer, LinkedList<Node>> tree = new TreeMap<Integer, LinkedList<Node>>();
	 
	
	private class Node{
		private K key;
		private V value;
		
		public Node(K k, V v){
			this.key = k;
			this.value = v;
		}
		
		public K getKey(){
			return key;
		}
		
		public V getValue(){
			return value;
		}

		public void setValue(V v) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public V put(K k, V v){
		isNull(k);
		LinkedList<Node> list = tree.get(k.hashCode());
		if(list != null){
			Iterator<Node> i = list.iterator();
			while(i.hasNext()){
				Node node = i.next();
				if(node.getKey().equals(k)){
					V prevValue = node.getValue();
					node.setValue(v);
					return prevValue;
				}
			}
			list.add(new Node(k, v));
		}
		else{
			list = new LinkedList<Node>();
			list.add(new Node(k, v));
			tree.put(k.hashCode(), list);
		}
		return null;
	}
	
	public V get(K k){
		isNull(k);
		LinkedList<Node> list = tree.get(k.hashCode());
		Iterator<Node> i = list.iterator();
		while(i.hasNext()){
			Node node = i.next();
			if(node.getKey().equals(k)){
				return node.getValue();
			}
		}
		return null;
	}
	
	public V remove(K k){
		isNull(k);
		LinkedList<Node> list = tree.get(k.hashCode());
		Iterator<Node> i = list.iterator();
		while(i.hasNext()){
			Node node = i.next();
			if(node.getKey().equals(k)){
				list.remove(node);
				if(list.isEmpty()){
					tree.remove(k.hashCode());
				}
			}
		}
		return null;
	}
	
	private void isNull(K k){
		throw(new NullPointerException());
	}
}

package com.careercupYahoo.Hashing;




public class Table<K,V>{
	
	K key;
	V value;
	
	public Table(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public boolean setValue(V value)
	{
		this.value = value;
		return true;
	}
}



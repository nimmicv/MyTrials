package com.careercupYahoo.Hashing;

import java.util.LinkedList;


public class Hashing<K, V> {

	private LinkedList<Table<K,V>> HashTableNew[];
	private int minsize =20;
	private int curSize=20;
	private int sizeCount=0;
	private final static long BIG_PRIME = 23;
	private double loadfactor = 0.75;
	
	public Hashing()
	{
		HashTableNew = new LinkedList[minsize];
	}
	
	public Hashing(int size)
	{
		this.minsize = size;
		HashTableNew = new LinkedList[minsize];
	
	}
	
	public int hashSize()
	{
		return sizeCount;
	}
	
	public void ReHash()
	{
		curSize = curSize *2;
		LinkedList<Table<K,V>> HashTableNew2[] = new LinkedList[curSize];
		for(int i=0;i<HashTableNew.length;i++)
		{
			if(HashTableNew[i]!=null)
			{
				for(Table tbl : HashTableNew[i])
				{
					int hashCode = this.hash((K) tbl.key);
					if(HashTableNew2[hashCode] == null)
					{
						HashTableNew2[hashCode] = new LinkedList<Table<K,V>>();
					}
					HashTableNew2[hashCode].add(tbl);
				}
			}
		}
		HashTableNew = HashTableNew2;
		
	}
	public boolean delete(K key)
	{
		int hashCode = this.hash(key);
		if(HashTableNew[hashCode] == null)
		{
			return false;
		}
		for(Table tbl : HashTableNew[hashCode])
		{
			if(tbl.key == key)
			{
				HashTableNew[hashCode].remove(tbl);
				return true;
			}
		}
		return false;
	}
	
	public boolean put(K key, V value)
	{
		
		if(sizeCount>=(curSize * loadfactor))
		{
			ReHash();
		}
		int hashCode = this.hash(key);
		Table table = new Table(key,value);
		if(HashTableNew[hashCode] == null)
		{
			HashTableNew[hashCode] = new LinkedList<Table<K,V>>();
			sizeCount++;
		}
		else
		{
			for(Table tbl : HashTableNew[hashCode])
			{
				if(tbl.key == key)
				{
					tbl.value = value;
					return true;
				}
			}
			
		}
		HashTableNew[hashCode].add(table);
		return true;
	}
	
	public V get(K key)
	{
		int hashCode = this.hash(key);
		if(HashTableNew[hashCode] == null)
		{
			return null;
		}
		V value = null;
		for(Table tbl : HashTableNew[hashCode])
		{
			if(tbl.key == key)
			{
				value = (V) tbl.value;
				break;
			}
		}
		return value;
	}
	
	public int hash(K h)
	{
		return Math.abs(h.hashCode()) % curSize;
		/*if(h.getClass() == Integer.class)
		{
			
		    String s = h.toString();
		    int x = Integer.parseInt(s);
			if( x >= 0) // 0 always at index 0.
			{
				int value = (int)(x*BIG_PRIME) % curSize;
		        return value;
			}
		    else
		        return (int)((Integer.MAX_VALUE+x)*BIG_PRIME) % curSize;
		}
		if(h.getClass() == String.class)
		{
				
			char[] value = h.toString().toCharArray();
			int hashVal = 0;
			for(int i=0;i<value.length;i++)
			{
				hashVal =hashVal+  value[i]*31^(value.length-1-i);
			}
			return hashVal;
		}
		return -1;*/

	}

}

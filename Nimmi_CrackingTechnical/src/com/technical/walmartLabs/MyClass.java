package com.technical.walmartLabs;

public class MyClass { 

public static int num=1; 
public static boolean flag=false; 

public static void main(String[] args) { 
Thread t =new Thread(new MyThread()); 
t.start(); 
MyClass.flag=true; 
MyClass.num=20; 
} 

} 


class MyThread implements Runnable{ 

public void run() { 

while(!MyClass.flag){ 
Thread.yield(); 
} 

System.out.println(MyClass.num); 


} 

}

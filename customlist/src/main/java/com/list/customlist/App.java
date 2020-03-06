package com.list.customlist;


;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customlist l = new Customlist();
        l.add(1.99);
        l.add(2.99);
        l.add(3.99);
        l.add(4.99);
        l.add(5.99);
        for(int i=0;i<l.size();i++)
        {
          System.out.println(l.get(i)+" ");
        }
        l.add(6.99);
        l.add(7.99);
        l.add(8.99);
        l.add(10.99);
        l.add(11.99);
        l.add(12.99);
        System.out.println("Element at Index 5:"+l.get(5));
        System.out.println("List size: "+l.size());
        l.remove(2);
        for(int i=0;i<l.size();i++)
        {
          System.out.print(l.get(i)+" ");
        }
    }
}

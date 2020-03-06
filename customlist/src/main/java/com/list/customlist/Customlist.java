package com.list.customlist;

import java.util.Arrays;
public class Customlist<T>
{
  private Object [] arr;
  private int arrsize = 0;
  Customlist() 
  {
    arr=new Object[10];
  }
  @SuppressWarnings("unchecked")
public T get(int index)
  {
    if(index < arrsize)
    {
      return (T)arr[index];
    }
    else
    {
      throw new ArrayIndexOutOfBoundsException();
    }
  }
  public T set(int index, T element)
  {
    @SuppressWarnings("unchecked")
	T oldValue = (T)arr[index];
    arr[index] = element;
    return (T)oldValue;
  }
  public int size()
  {
    return arrsize;
  }
  public void add(T value)
  {
    if(arr.length-arrsize<=3)
    {
      increaselistsize();
    }
    arr[arrsize++]=value;
	}
  private void increaselistsize()
  {
    arr=Arrays.copyOf(arr, arr.length*2);
  }
  public void remove(int index)
  {
    if(index < arrsize)
    {
      @SuppressWarnings("unchecked")
	T removedvalue= (T)arr[index];
      arr[index] = null;
      int tmp = index;
      while(tmp < arrsize)
      {
        arr[tmp] = arr[tmp+1];
        arr[tmp+1] = null;
        tmp++;
      }
      arrsize--;
    } 
    else
    {
      throw new ArrayIndexOutOfBoundsException();
    }     
  }
} 
package com.mycompany.app;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Hello world!
 *
 */
public class App 
{
    public static String method(ArrayList<Integer> arr1, ArrayList<Integer> arr2, String str, int num){
    	if(arr1 == null || arr2 == null || str == null)
    		return "not true";
    	if(num >= arr1.size() || num >= arr2.size())
    		return "not true";
    	int index = arr1.get(num) + arr2.get(num);
    	if(index >= str.length())
    		return "not true";
    	return str.substring(index,str.length()) + str.substring(0,index);
    }
 }

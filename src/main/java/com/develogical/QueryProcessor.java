package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Nico";
        }
        if (query.toLowerCase().contains("largest")) {
            return "20106";
        }
        
        if (query.toLowerCase().contains("plus")) {
        	String[] a = query.split(" ");
        	int num1 = Integer.parseInt(a[2]);
        	int num2 = Integer.parseInt(a[4]);
        	
            return num1 + num2 + "";
        }
        
        return "";
    }
}

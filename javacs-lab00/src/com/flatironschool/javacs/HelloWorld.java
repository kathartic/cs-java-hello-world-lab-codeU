package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        String javaver;
        Double java_num;
        javaver = System.getProperty("java.specification.version");
        java_num = Double.parseDouble(javaver);
        return java_num;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
      System.out.println(getVersion());
    }
}

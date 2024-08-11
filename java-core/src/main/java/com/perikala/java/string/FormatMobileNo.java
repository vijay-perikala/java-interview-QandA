package com.perikala.java.string;

public class FormatMobileNo {

    public static  void main(String[] args){
        FormatMobileNo formatMobileNo = new FormatMobileNo();
     //   System.out.println(formatMobileNo.validateFormatMobileNo("9423432432232432432"));
        System.out.println(formatMobileNo.validateFormatMobile());


    }

    public String validateFormatMobileNo(String mobile){
        String a = null;
        StringBuffer sb = new StringBuffer();
        sb.append("+");
        sb.append(mobile);
        a= sb.toString();
        return a;
    }

    public String validateFormatMobile(){

        return "+6011434335448879".replaceAll(".(?=.{4})", "*");
    }

}

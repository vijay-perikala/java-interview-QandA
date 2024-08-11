package com.perikala.java.string;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.byStringBuilder("VIJAY"));
    }

    public String byCharArray(String str){
        String reverseString = "";
        char []ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--)
            reverseString=reverseString+ch[i];
        return reverseString;
    }

    public  String byByteArray(String str){
        byte[] byteArray = str.getBytes();
        byte[] tempByteArray = new byte[byteArray.length];
        for (int i =0; i<byteArray.length; i++ ){
            tempByteArray[i]= byteArray[byteArray.length-i-1];
        }
        return new String(tempByteArray);
    }

    public  String byStringBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return new String(stringBuilder.reverse());
    }

    public  String byStringBuffer(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        return new String(stringBuffer.reverse());
    }

    public String bySwapIndex(String str){
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length-1;

        for (left =0 ; left <right; left++, right--){
            char leftChar=charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = leftChar;
        }
        return new String(charArray);
    }
}

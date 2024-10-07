package yash.core_java.assign_5;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

    public static void main(String[] args){
        List<String> str = new ArrayList<>();
        str.add("tom");
        str.add("Shon");
        str.add("ron");
        str.add("Thomas");

//        System.out.println(countCharacters(str));

//        2
        String str2= "My name is Thomas Shibu";
        List<String> result = split(str2);
//        display(result);

//        3
        List<String> result3 = uppercased(str);

//        display(result3);

//        4
//        System.out.println(allCapitalizedWords(result3));

//        5
        List<String> result5= filterContaining(result,'a');
        display(result5);
    }



    public static int countCharacters(List<String> list){
        int count=0;
        for (int i=0;i<list.size();i++){

            count = count+list.get(i).length();
        }

        return count;
    }

//    2.
    static void display(List<String> strings){
        for (int i=0;i<strings.size();i++){
            System.out.println("["+strings.get(i)+"]");
        }
    }
    public static List<String> split(String string) {
        List<String> result = new ArrayList<>();

        if (string.length()==0){
            result.add(" ");
            return result;
        }
        int start=0;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)==' '){
                result.add(string.substring(start,i));
                start=i+1;
            }
        }
        result.add(string.substring(start,string.length()));
        return result;
    }

    public static List<String> uppercased(List<String> list) {
        List<String> result=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            result.add(list.get(i).toUpperCase());
        }

        return result;
    }

    public static boolean allCapitalizedWords(List<String> list) {
        for (int i=0;i<list.size();i++){
            if (!helper(list.get(i))){
                return false;
            }
        }
        return true;
    }

    static boolean helper(String str){
        if (str.charAt(0)==str.toUpperCase().charAt(0)){
            return true;
        }
        return false;
    }

    public static List<String> filterContaining(List<String> list,char c) {
        List<String> result = new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (helper2(list.get(i),c)){
                result.add(list.get(i));
            }
        }
        return result;
    }

    static boolean helper2(String str, char c){
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==c){
                return true;
            }
        }
        return false;
    }


    public static void insertInOrder(String string, List<String> list) {

    }


}

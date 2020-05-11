/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author Forge-15 1650
 */
public class Sentence {

    private String s;

    public Sentence(String s) {
        this.s = s;
    }

    public int length() {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            l++;
        }
        return l;
    }

//    public int vowel() {
//        int v = 0;
//        for (int i = 0; i < s.length(); i++) {
//            String vowel = Character.toString(s.charAt(i));
//            if (vowel.equalsIgnoreCase("a")) {
//                v++;
//            } else if (vowel.equalsIgnoreCase("e")) {
//                v++;
//            } else if (vowel.equalsIgnoreCase("i")) {
//                v++;
//            } else if (vowel.equalsIgnoreCase("o")) {
//                v++;
//            } else if (vowel.equalsIgnoreCase("u")) {
//                v++;
//            }
//        }
//        return v;
//    }
    
//    DR ADELEH ANSWER
        public int vowel(){
        int count = 0;
        for(int i=0;i<s.length();i++){
        char c = Character.toLowerCase(s.charAt(i));
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            count++;
            }
        }
        return count;
        }
    
    
    public int word(){
        String[] word = s.split(" ");
        int w = 0;
        for(int i=0;i<word.length;i++){
            w++;
        }
        return w;
    }
}

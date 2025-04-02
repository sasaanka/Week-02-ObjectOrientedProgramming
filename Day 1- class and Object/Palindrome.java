class Palindrome{
    String text;
    Palindrome(String text){
        this.text=text;
    }
    static boolean isPalindrome(String text){
        int start=0,end=text.length()-1;
        while (start<end){
        if (text.charAt(start)!=text.charAt(end)){
            return false;
        }
        start++;
        end--;
        }
        return true;
    }
    void Displayresults(){
        System.out.println("The text is "+text);
        System.out.println("Is the text palindrome? "+isPalindrome(text));
    }
    public static void main(String[] args) {
        Palindrome text1=new Palindrome("racecar");
        Palindrome text2=new Palindrome("madam");
        text1.Displayresults();
        text2.Displayresults();
    }
}
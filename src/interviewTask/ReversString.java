package interviewTask;

public class ReversString {
	public static void main(String[] args) {
        // Write a java program to reverse String?
        // Reverse a string word by word?
        
        String str = "Greatest Of All Time";
        
        //reverse whole string:
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        
        //reverse words:
        System.out.println();
        
        String[] f = str.split(" ");
        for(int i=0; i<f.length; i++) {
            for(int j=f[i].length()-1; j>=0; j--) {
                System.out.print(f[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}



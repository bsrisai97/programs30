package heelo;

public class Ternary
{
	public static void main(String[] args) {
		String str="myhomeisjewel";
		char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for(int i=8;i<str.length();i++){
            System.out.print(ch[i]);
        }
        for(int i=6;i<=7;i++){
            System.out.print(ch[i]);
        }
        for(int i=0;i<=1;i++){
            System.out.print(ch[i]);
        }
        for(int i=2;i<=5;i++){
            System.out.print(ch[i]);
        }
        
    
	}
}
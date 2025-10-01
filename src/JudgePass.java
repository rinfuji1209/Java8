
public class JudgePass {
 public static void main(String args) {
	
	 String CorrectPass = "123";
	 Scanner scanner = new Scanner(System.in);
 
	 Warning warning = new Warning(); 

	 

     while (true) {  
warning.showPassCaution(); 



         System.out.print("パスワードを入力してください：");  
         String input = scanner.nextLine(); 



         if (input.equals(CorrectPass)) { 
             System.out.println("ログインに成功しました");  
             break;   
         } else { 
             warning.showFailPass(); 
         } 
 } 



     scanner.close();  
} 
}
 }
}
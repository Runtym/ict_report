package testpackage;

public class Test {
   static int cnt = 0;
   public static String[] split(String str, String search) {
      String[] arr = new String[str.length()];
      String temp= "";
      for(int i=0; i<str.length(); i++) {
         Character c = str.charAt(i);
         temp += c.toString();
         if (c.toString().equals(search)) {
            temp = temp.substring(0, temp.length()-1);
            arr[cnt] = temp;
            cnt++;
            temp = "";
         }   
      }
      arr[cnt] = temp;
      return arr;
   }
   public static void main(String[] args) {
      String str = ",dasag,asdafwqr,q,gsdrwer,gsdfrwe,sad";

      String[] b = split(str, ",");
      for(int i=0; i<cnt+1; i++) {
         System.out.println("arr["+i+"] : "+ b[i]); 
      }

      String[] c = str.split(",");
      for(int i=0; i<cnt+1; i++) {
         System.out.println("arr1["+i+"] : "+ c[i]); 
      }
   }
}
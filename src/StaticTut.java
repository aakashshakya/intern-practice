public class StaticTut {
 public  String name="hello dude";

 public void hello(){
      String name="hello dear";
      System.out.println(name);

 }

 public static void main(String args[]){

     StaticTut s1=new StaticTut();
     StaticTut s2= new StaticTut();
     StaticTut s3=new StaticTut();

     System.out.println(s1.name);
     System.out.println(s2.name);
     System.out.println(s3.name);

     s1.name="fake dude";

     System.out.println(s1.name);
     System.out.println(s2.name);
     System.out.println(s3.name);
     s1.hello();
     s2.hello();
     s3.hello();


 }
}

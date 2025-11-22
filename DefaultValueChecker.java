
/**
 * Write a description of class DefaultValueChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValueChecker
{
    byte b1 = 1;
   short s = 10;
   int a = 11;
   long b = 12;
   float f = 22.1f;
   double d1 = 32.1;
   boolean one = true;
   char gender = 'M';
    public static void main(String[] args){
        DefaultValueChecker dvc = new DefaultValueChecker();
        System.out.println(dvc.b1);
        System.out.println(dvc.s);
        System.out.println(dvc.a);
        System.out.println(dvc.b);
        System.out.println(dvc.f);
        System.out.println(dvc.d1);
        System.out.println(dvc.one);
        System.out.println(dvc.gender);
    }
    
}
// Initializing Test Code.
class test
{
    int a;
    test(int i) {a= i;}
    test () {a=0;}
}
class Swapp
{
    public static void main(String[]args) {
    
        test t = new test(60);
        System.out.println("Value Stored Earlier = " + t.x);
        change (t);
        System.out.println("Value stored after Swapping = " + t.x);
    }
    public static void change (test t)
    {
        t.x=23;
    }
}

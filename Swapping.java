class test
{
    int x;
    test(int i) {x = i;}
    test () {x=0;}
}
class Swapp
{
    public static void main(String[]args)
    {
        test t = new test(60);
        System.out.println("Value Stored Before = " + t.x);
        change (t);
        System.out.println("Value after Swapping = " + t.x);
    }
    public static void change (test t)
    {
        t.x=44;
    }
}
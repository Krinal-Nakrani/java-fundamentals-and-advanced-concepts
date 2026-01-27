class A
{
    int aa;
    void run(int x)
    {
        aa=x;
        System.out.println("we r in first method "+aa);
    }
}

class b extends A
{
    int bb;
    void run(int y)
    {
        bb=y;
        System.out.println("we r in 2nd method "+bb);
    }
}

class overr
{
    public static void main (String args[])
    {
        b obj = new b();
        obj.run(2);
    }
}
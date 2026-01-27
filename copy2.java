class A
{
    int id;
    String name;

    A(int i , String n)
    {
        id=i;
        name=n;

        // System.out.println(id + " "+name);
    }

    A(A s)
    {
        id = s.id;
        name = s.name;
    }
    void disp()
    {
        System.out.println(id+" "+name);
    }
}

class copy2
{
    public static void main(String args[])
    {
        A obj = new A(12154,"KRINAL");
        A obj2 = new A(obj);

        obj.disp();
        obj2.disp();
    }
}
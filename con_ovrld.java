class con_ovrld
{
    String n;
    int rn, m;

    con_ovrld(String n1, int rn1)
    {
        n = n1;
        this.rn = rn1;
        System.out.println("Name : "+ n + "\nRoll no = "+ rn + "\n");
    }
    con_ovrld(String n1, int rn1, int m1)
    {
        n = n1;
        this.rn = rn1;
        m = m1;
        System.out.println("Name : "+ n + "\nRoll no = "+ rn+ "\nMarks = "+ m + "\n");
    }

    public static void main(String args[])
    {
        con_ovrld obj = new con_ovrld("krinal" , 13053);
        con_ovrld obj3 = new con_ovrld("visha" , 13056);
        con_ovrld obj1 = new con_ovrld("nidhi" , 13054 , 300);
        con_ovrld obj2 = new con_ovrld("meena" , 13055 , 324);
    }
}
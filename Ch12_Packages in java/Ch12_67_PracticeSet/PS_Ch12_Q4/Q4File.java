class sample{
    int a;
    protected int b;

    // sample(int a, int b){
    //     this.a = a;
    //     this.b = b;
    // }
}

class subClass extends sample{
    int c;
    protected int d;

    // subClass(int a, int b, int c, int d){
    //     super(a, b);
    //     this.c= c;
    //     this.d = d;
    // }
}

class Q4File{
    public static void main(String args[]){
        subClass obj = new subClass();
        obj.a = 1;
        obj.b = 4;
        obj.c = 8;
        obj.d = 12;

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
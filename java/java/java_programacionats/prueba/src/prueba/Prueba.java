Class helloworld{
    int a = 10;
    
    public helloworld(){
        a=(int)(Math.random()*10);
    }
    
    public static void main(String[] args){
        helloworld h1 =new helloworld();
        h1.print(8);
    }
    
    public void print(int a){
        System.out.print(this.a+ " ");
        a=12;
    }
}
class IfTest{
    public static void main(String[] args){
        int x = 0;
        if(x){ // This doesn't compile as if statement expects boolean value as parameter.
            System.out.println("Hello Mercury");
        }else{
            System.out.println("Hello Venus");
        }
    }
}
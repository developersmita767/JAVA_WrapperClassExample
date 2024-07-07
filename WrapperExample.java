public class WrapperExample{
    public static void main(String ar[]){
        int i=19;
        Integer b=i;//autoboxing
        int c=b;//unboxing
        System.out.println(b);
        System.out.println(c);

        String p="26";
        Integer p1=Integer.parseInt(p);
        System.out.println(p1+i);

    }
}
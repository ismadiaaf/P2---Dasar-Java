import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class B_OperatorB {
    public static void main(String[] args) {
        float total = 14000;
        System.out.println("Original Investment:$" +total);
        // Increases by 40 percent the forst year
        total = total + (total*4F);
        System.out.println("After one year:$" +total);
        //Loses $1,500 the second year
        total=total-1500F;
        System.out.println("After two years:$" +total);
        //Increases by 12 percent the third year
        total=total+(total*.12F);
        System.out.println("After three years:$" +total);
    }
}

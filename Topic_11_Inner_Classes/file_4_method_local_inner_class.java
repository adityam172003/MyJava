import java.lang.reflect.Method;

class OuterClass{

   private int x=20;
    public void checkAvailability()
    {

        int a =20;

        class MethodLocalInnerClass{

            public void setOuter()
            {
               System.out.println(OuterClass.this.hashCode());
               // a=100 ; the local variables of the methods are final for the 
               // methodlocalinner class 
               System.out.println(OuterClass.this.x);
               OuterClass.this.x=30;
               
               // we cant change it 
                System.out.println("Inner class ");
               
            }


        }

        MethodLocalInnerClass  mlc = new MethodLocalInnerClass();
        mlc.setOuter();
        System.out.println("Outer class a = "+a);

    }

}


public class file_4_method_local_inner_class {
        public static void main(String[] args) {
            OuterClass oc = new OuterClass();

            oc.checkAvailability();
            System.out.println(oc.hashCode());
        }    
}


/*
 * 
 * Break statement should be in the switch or a look 
 * 
 * it breaks the immediate loop if nested loops are there then it will break the just immediate 
 * loop and not all 
 * 
 * we have concept like block with label we can break the block execution using it we can break whole nested loop 
 * 
 */




public class BreakStatement {

    public static void main(String[] args) {

        // this is a block with label first
        first : {

            for(int i =0;i<10;i++)
            {
                for(int j=0;j<10;j++)
                {
                    System.out.println(i+" "+j);
                 //   break; // this statement break the current block only and not outer loop 

                    break first; //  this will break the whole block and execution will stop here for the block 
                     // it will go out of the block directly 
                }
            }
        }

    }
}

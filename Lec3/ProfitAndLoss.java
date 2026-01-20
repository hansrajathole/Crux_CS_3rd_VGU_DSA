public class ProfitAndLoss {


    public static void main(String[] args) {
        int cp = 500;
        int sp = 400;
        
        if(sp > cp){
            System.out.println("Profit :"+ (sp-cp));
        }else if(sp < cp){
            System.out.println("Loss :"+ (cp-sp));
        }else {
            System.out.println("not profit no loss");
        }
    }
}
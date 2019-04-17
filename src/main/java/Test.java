import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        String string = "DYCZ8888 ZLCD8888 ZLDL8888 DYDG8888 DYFS8888 DYFZ8888 DYGZ8888 ZLHZ8888 DYHF8888 ZLJN8888 ZLNJ8888 DYNB8888 ZLQD8888 DYXM8888 DYSZ8888 ZLSZ8888 ZLTJ8888 ZLTJ0003 DYWX8888 ZLWH8888 DYXA8888 DYCS8888 ZLCQ8888";
        String strategy = "DYGS";
        String[] companyCodeArr = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String companyCode : companyCodeArr){
            stringBuilder.append(companyCode).append(" ").append(strategy).append(",");
        }
        System.out.println(stringBuilder.toString());
    }

}

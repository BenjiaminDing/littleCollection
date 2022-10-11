package 字符串API;

/**
 * created at 2021/9/15 16:37  littleCollection
 */
public class Stringapi01 {


    public static void main(String[] args) {
        String str = "从北京到南京的你是小从";
//        String strr = "";
//        System.out.println(str.indexOf("从"));
//        System.out.println(str.indexOf("从"));
//        System.out.println(strr.indexOf("从"));

        System.out.println(">>>::"+str.substring(1));


        String instation = "";
        String outStation = "";
        if (str.indexOf("从") != -1) {
            String ss = str.replace("从", "");
            System.out.println(ss);
              String[]   tt=ss.split("到");
            System.out.println(tt[0]);
            System.out.println(tt[1]);

        } else {
            System.out.println("");
        }
    }
}

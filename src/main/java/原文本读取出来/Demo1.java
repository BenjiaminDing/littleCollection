//package 原文本读取出来;
//
//import org.junit.jupiter.api.Test;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//
///**
// * created     by benjiamin at 2022/8/5 / 21:02 /02
// */
//public class Demo1 {
//
//
//    @Test
//    public void nam() {
//        Demo1  demo1=new Demo1();
//        demo1.getTxtContent2();
////        demo1.getTxtContent("myFile/save/","5_jpg.txt");
//    }
//
//    /**
//     * 测试将base64String 字符串 原样读取出来
//     * @param localPath
//     * @param fileName
//     */
//    public void getTxtContent(String  localPath,String  fileName) {
//        String  baseString="";
//        FileInputStream   inputStream=null;
//        try{
//            File  file=new File(localPath+fileName);
//            Long   longva=file.length();
//            byte[]   data=new byte[longva.intValue()];
//            inputStream=new FileInputStream(file);
//            inputStream.read(data);
//            baseString=new String(data);
////            System.out.println(baseString.length());
//            System.out.println(baseString);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if (inputStream==null){
//
//            }
//        }
//    }
//
//    /**
//     * 同上  方法二
//     */
//    public void getTxtContent2() {
//
//        String  primary="myFile/save/5_jpg.txt";
//        File file=new File(primary);
//        try{
//
//            Long  longvo=       file.length();
//            BufferedReader br=new BufferedReader(new InputStreamReader(
//                    new FileInputStream(primary),"UTF-8"),longvo.intValue());
////        BufferedReader  br=new BufferedReader(new InputStreamReader( new FileInputStream(primary),"UTF-8"),1024*10);
//
//            String  linex= br.readLine();
////            System.out.println(linex.length());
//            System.out.println(linex);
//        }catch (Exception e){
//
//        }
//
//
//    }
//}

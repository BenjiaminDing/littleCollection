package 文件保存;


import java.io.*;
import java.util.Base64;

/**
 * created at 2021/9/15 16:37  littleCollection
 */
public class SaveBase64ToTXT2 {






    public void    base64StringCharToFile2(String   base64String,String  localPath,String  pictureName) {

        try(   OutputStreamWriter    osw=new OutputStreamWriter(new FileOutputStream(localPath+pictureName),"utf-8")){

            osw.write(base64String);

        }catch (Exception e){

        }
    }



    public static void main(String[] args) {
        SaveBase64ToTXT2 saveFile = new SaveBase64ToTXT2();
        String filePath = "myFile/5.jpg";
// 将字节数组转化为base64字符串

        String base64str = new String(Base64.getEncoder().encode(ImgToBase64(filePath)));
        System.out.println(base64str.length());
       saveFile.base64StringCharToFile2(base64str, "myFile/save/", "2002-10-10.txt");

    }








    /**
     * 将图片转换成Base64编码
     *
     * @param imgFile 待处理图片
     * @return
     */
    public static byte[] ImgToBase64(String filePath) {
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try {
            in = new FileInputStream(filePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}

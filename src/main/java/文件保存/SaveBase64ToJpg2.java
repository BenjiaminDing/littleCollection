package 文件保存;

//import sun.misc.BASE64Decoder;

import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.Base64;

/**
 * 将base64保存未图片到当前服务器
 */

public class SaveBase64ToJpg2 {

    public static void main(String[] args) {



        String filePath = "myFile/5.jpg";
//// 将字节数组转化为base64字符串
        String base64str = new String(ImgToBase64(filePath));

        saveBase64ToJpg(base64str, "myFile/save", "7_copy.jpg");


    }


    /**
     * 将图片转换成Base64编码
     *
     * @param  待处理图片
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


        return   Base64.getEncoder().encode(data);
    }

    public static boolean  saveBase64ToJpg(String base64str, String realPath, String fileName) {
        byte[] imgByte = base64ToByte(base64str);

        try {
            // 接口实现
            InputStream in = new ByteArrayInputStream(imgByte);
            FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);
            byte[] b = new byte[1024];
            int nRead = 0;
            while ((nRead = in.read(b)) != -1) {
//                fos.write(b, 0, in.available());
                fos.write(b, 0, nRead);

            }
            fos.flush();
            fos.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public static byte[] base64ToByte(String str) {
        if (str == null) {
            return null;
        }
        byte[] ss = Base64.getDecoder().decode(str);
        return ss;
    }



    public static boolean  saveImgAllLength(String base64str, String realPath, String fileName) {
        byte[] imgByte = Base64.getDecoder().decode(base64str);

        try {
            // 接口实现
            InputStream in = new ByteArrayInputStream(imgByte);
            FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);
            byte[] b = new byte[in.available()];
            int nRead = 0;
            while ((nRead = in.read(b)) != -1) {
                fos.write(b);

            }
            fos.flush();
            fos.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }





}

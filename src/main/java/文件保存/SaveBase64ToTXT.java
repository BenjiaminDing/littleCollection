package 文件保存;



import java.io.*;
import java.util.Base64;

/**
 * 保存到jpg到当前服务器到当前服务器格式  txt文件
 */
// 使用情况 FileOutputStream用于写入原始字节流，例如图像数据。要编写字符流(FileWriter处理的连个字节一个单位，请考虑使用FileWriter。
public class SaveBase64ToTXT {
    public static void main(String[] args) {
        SaveBase64ToTXT saveFile = new SaveBase64ToTXT();
        String filePath = "myFile/5.jpg";
// 将字节数组转化为base64字符串

        String base64str = new String(Base64.getEncoder().encode(ImgToBase64(filePath)));
        System.out.println(base64str.length());
   boolean  ss=     saveFile.baseToFile(base64str, "myFile/save/", "2002-10-09.txt");
        System.out.println(ss);
    }


    /**
     * 将base64写入txt文件
     * @param base
     * @param path
     * @param fileName
     * @return
     */
    public boolean baseToFile(String base64str, String path, String fileName) {
        File checkFile = new File(path + fileName);
        FileWriter writer = null;
        try {
            if (!checkFile.exists()) {
                checkFile.createNewFile();
            }
            // file：要写入数据的 File 对象。
            //append：如果 append 参数为 true，则将字节写入文件末尾处，相当于追加信息。如果 append 参数为 false, 则写入文件开始处。
            writer = new FileWriter(checkFile, true);
            writer.write(base64str);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        return  true;
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

//    public static boolean saveImg(String base64str, String realPath, String fileName) {
//        byte[] imgByte = hex2byte(base64str);
//
//        try {
//            // 接口实现
//            InputStream in = new ByteArrayInputStream(imgByte);
//            FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);
//            byte[] b = new byte[1024];
//            int nRead = 0;
//            while ((nRead = in.read(b)) != -1) {
//                fos.write(b, 0, nRead);
//
//            }
//            fos.flush();
//            fos.close();
//            in.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }

//    /**
//     * 将base64str字符串 转换成字节数组
//     *
//     * @param str
//     * @return
//     */
//    public static byte[] hex2byte(String str) {
//        if (str == null) {
//            return null;
//        }
//        BASE64Decoder decoder = new BASE64Decoder();
//        try {
//            byte[] b = decoder.decodeBuffer(str);
//
//            return b;
//
//
//        } catch (Exception e) {
//            throw new RuntimeException("文件转换失败");
//        }
//    }

}

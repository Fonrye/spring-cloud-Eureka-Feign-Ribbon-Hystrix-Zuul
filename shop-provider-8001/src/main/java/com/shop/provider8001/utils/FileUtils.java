package com.shop.provider8001.utils;


import org.springframework.web.multipart.MultipartFile;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLEncoder;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileUtils {

    /**
     * 上传文件工具
     *
     * @param UPLOAD_FILES_PATH 上传路径
     * @param fileName          文件名称
     * @param file              文件
     */
    public static Boolean upLoadUtil(String UPLOAD_FILES_PATH, String fileName, MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return false;
        } else {
            File dest = new File(UPLOAD_FILES_PATH + "/" + fileName);
            //判断文件父目录是否存在
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            file.transferTo(dest);
        }
        return true;
    }


    /**
     * 下载文件工具
     *
     * @param response response对象
     * @param realPath 文件路径
     * @param fileName 文件名称
     */
    public static void downloadUtil(final HttpServletResponse response, String realPath, String fileName) throws IOException {
        File file = new File(realPath);
        if (file.exists()) {
            response.setHeader("content-type", "application/octet-stream");
            response.setContentType("application/octet-stream");
            // 下载文件能正常显示中文
            try {
                response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            // 实现文件下载
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                assert bis != null;
                bis.close();
                fis.close();
            }
        }
    }

    /**
     * 删除文件夹
     *
     * @param sPath 文件夹路径
     */
    public static boolean DeleteFolder(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 判断目录或文件是否存在
        if (!file.exists()) {  // 不存在返回 false
            return flag;
        } else {
            // 判断是否为文件
            if (file.isFile()) {  // 为文件时调用删除文件方法
                return deleteFile(sPath);
            } else {  // 为目录时调用删除目录方法
                return deleteDirectory(sPath);
            }
        }
    }

    /**
     * 删除单个文件
     *
     * @param sPath 被删除文件的文件名
     * @return 单个文件删除成功返回true，否则返回false
     */
    public static boolean deleteFile(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }

    /**
     * 删除目录（文件夹）以及目录下的文件
     *
     * @param sPath 被删除目录的文件路径
     * @return 目录删除成功返回true，否则返回false
     */
    public static boolean deleteDirectory(String sPath) {
        //如果sPath不以文件分隔符结尾，自动添加文件分隔符
        if (!sPath.endsWith(File.separator)) {
            sPath = sPath + File.separator;
        }
        File dirFile = new File(sPath);
        //如果dir对应的文件不存在，或者不是一个目录，则退出
        if (!dirFile.exists() || !dirFile.isDirectory()) {
            return false;
        }
        boolean flag = true;
        //删除文件夹下的所有文件(包括子目录)
        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            //删除子文件
            if (files[i].isFile()) {
                flag = deleteFile(files[i].getAbsolutePath());
                if (!flag) {
                    break;
                }
            } //删除子目录
            else {
                flag = deleteDirectory(files[i].getAbsolutePath());
                if (!flag) {
                    break;
                }
            }
        }
        if (!flag) {
            return false;
        }
        //删除当前目录
        if (dirFile.delete()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 转文件格式
     *
     * @param img 照片文件
     */
    public static byte[] fileToByte(File img) throws Exception {
        byte[] bytes = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            BufferedImage bi;
            bi = ImageIO.read(img);
            ImageIO.write(bi, "jpg", baos);
            bytes = baos.toByteArray();
        } catch (Exception e) {
              e.printStackTrace();
        } finally {
            // 关闭输出流
            baos.close();
        }
        return bytes;
    }

    /**
     * PDF文件预览
     *
     * @param pdfPath PDF文件路径
     */
    public static void pdfPreview(HttpServletResponse response, String pdfPath) {

        OutputStream out = null;
        FileInputStream in = null;
        try {
            File file = new File(pdfPath);
            if (file != null && file.exists()) {
                response.setContentType("application/pdf");
                in = new FileInputStream(file);
                out = response.getOutputStream();
                byte[] b = new byte[1024];
                while (in.read(b) != -1) {
                    out.write(b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 文件打成压缩包
     * @param inputFile
     * @param ouputStream
     */
    public static void zipFile(File inputFile, String fileName, ZipOutputStream ouputStream) {
        try {
            if (inputFile.exists()) {
                if (inputFile.isFile()) {
                    FileInputStream IN = new FileInputStream(inputFile);
                    BufferedInputStream bins = new BufferedInputStream(IN, 512);
                    ZipEntry entry = new ZipEntry(fileName);
                    ouputStream.putNextEntry(entry);

                    int nNumber;
                    byte[] buffer = new byte[512];
                    while ((nNumber = bins.read(buffer)) != -1) {
                        ouputStream.write(buffer, 0, nNumber);
                    }

                    bins.close();
                    IN.close();
                } else {
                    try {
                        File[] files = inputFile.listFiles();
                        for (int i = 0; i < files.length; i++) {
                            zipFile(files[i], fileName, ouputStream);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HttpServletResponse downloadZip(File file, HttpServletResponse response) {
        if (!file.exists()) {
            System.out.println("待压缩的文件目录：" + file + "不存在.");
        } else {
            try {
                // 以流的形式下载文件。
                InputStream fis = new BufferedInputStream(new FileInputStream(file.getPath()));
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                fis.close();
                // 清空response
                response.reset();
                OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
                response.setContentType("application/octet-stream");
                // 如果输出的是中文名的文件，在此处就要用URLEncoder.encode方法进行处理
                response.setHeader("Content-Disposition",
                        "attachment;filename=" + new String(file.getName().getBytes("GB2312"), "ISO8859-1"));
                toClient.write(buffer);
                toClient.flush();
                toClient.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    File f = new File(file.getPath());
                    f.delete();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return response;
    }
}

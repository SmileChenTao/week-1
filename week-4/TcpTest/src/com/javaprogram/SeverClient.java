package com.javaprogram;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/*
  服务器端
 */

//服务器端的 输入类
class Inputs implements Runnable{
    private Socket socket;
    private ServerSocket ss;
    Inputs(ServerSocket ss,Socket socket){
        this.ss = ss;
        this.socket = socket;
    }
    public void run () {
        try {
            InputStream i = socket.getInputStream();//获取客户端对象的读取流来读取数据
            DataInputStream is =new DataInputStream(i);//将客户端对象的输入流转换成数据输入流
            String s;
            s = is.readUTF();//输入流中读取字符
            while(socket.isClosed()==false){
                if("886".equals(s))
                {
                    break;
                }
                else{
                    System.out.println(s);
                    s=is.readUTF();
                }
            } //输入886,或者关闭客户端结束循环
            System.out.println(s);
            System.out.println();
            is.close();//关闭输入流对象
            i.close();
            socket.close();//关闭客户端
        }
        catch(Exception e){
            throw new RuntimeException("接受异常");
        }
    }
}

/*服务器端 输出类*/
class Outputs implements Runnable {
    private ServerSocket ss;
    private Socket socket;
    Outputs(ServerSocket ss,Socket socket){
        this.ss = ss;
        this.socket = socket;
    }
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();//获取客户端对象的输出流
            DataOutputStream dos = new DataOutputStream(os);//将客户端对象的输出流转换成数据输出流
            String IP = socket.getInetAddress().getHostAddress()+"...Connected";
            dos.writeUTF(IP);
            Scanner cc = new Scanner(System.in);
            String c = cc.next();
            while(socket.isClosed()==false)
            {
                if("886".equals(c))
                {
                    break;
                }else{
                    dos.writeUTF(c);//将字符串写入输出流
                    c=cc.next();//阻塞式，读取下一个从键盘录入的字符串
                }
            }
            dos.writeUTF(c);
            dos.close();
            os.close();
            socket.close();
        } catch (Exception e) {
            throw new RuntimeException("发送异常");
        }
    }
}
public class SeverClient {
    public static void main(String[]args) throws Exception{
        ServerSocket serverSocket =new ServerSocket(50020);//建立服务端socket服务
        Socket socket= serverSocket.accept();//获取连接过来的客户端对象
        Outputs out = new Outputs(serverSocket,socket); //创建服务器输出对象
        Inputs  inputs = new Inputs(serverSocket,socket);//创建服务器输入对象
        new Thread(out).start();  //开启线程
        new Thread(inputs).start();
    }
}

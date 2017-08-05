package com.javatest;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/*
Create 2017.8.5
客户端

 */
//客户端输入类
class Inputs implements Runnable{
    private Socket s;
    Inputs(Socket s){
        this.s = s;
    }
    public void run () {
        try {
            InputStream inputStream = s.getInputStream();
            DataInputStream dataInputStream =new DataInputStream(inputStream);
            String sb;
            sb = dataInputStream.readUTF();
            while(s.isClosed()==false){
                if("886".equals(sb))
                {
                    break;
                }else{
                   System.out.println(sb);
                    sb=dataInputStream.readUTF();
                }
            }
            System.out.println(sb);
            System.out.println();
            dataInputStream.close();
            dataInputStream.close();
            s.close();
        }
            catch(Exception E){
               throw new RuntimeException("接受异常");
            }
        }
}
//客户端输出类
class Outputs implements Runnable {
    private Socket s;
    Outputs(Socket s) {
        this.s = s;
    }
    public void run() {
        try {
            OutputStream os = s.getOutputStream();  //客户端输出流
            DataOutputStream dos = new DataOutputStream(os);
            Scanner cc = new Scanner(System.in);  //从键盘录入信息
            String c = cc.next();
            while(s.isClosed()==false)
            {
                if("886".equals(c))
                {
                    break;
                }else{
                    dos.writeUTF(c);
                    c=cc.next();
                }
            }
            dos.writeUTF(c);  //发送最后一次信息，将信息写入输出流
            dos.flush();
            dos.close();
            os.close();
            s.close();
        } catch (Exception e) {
            throw new RuntimeException("发送异常");
        }
    }
}
public class TcpClient {
    public static void main(String[]args) throws Exception{
        System.out.println("请输入你要连接的IP地址：");
        Scanner scanner = new Scanner(System.in);
        String cin = scanner.next();
        System.out.println("请输入你要连接的端口号(50020)：");
        Scanner scanner1 = new Scanner(System.in);
        int cin1 = scanner1.nextInt();
        Socket socket = new Socket(cin,cin1);//创建socket服务
        Outputs out = new Outputs(socket);//创建输出类
        Inputs  inputs = new Inputs(socket);//创建输入类
       new Thread(out).start();  //开启线程
       new Thread(inputs).start();
    }
}


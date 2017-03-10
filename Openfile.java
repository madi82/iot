import java.net.*;
import java.io.*;
import java.util.*;
public class Openfile 
{
public static void main(String[] args) throws Exception
{

try 
{

URL url = new URL("http://iotmini.net23.net/index.txt");
//URL url = new URL("http://projects.sindrelindstad.com/demo/ardled/LEDstate.txt");
Scanner sc = new Scanner(url.openStream());
int name=sc.nextInt();
System.out.println("success:"+name);

if(name==1)
{
Runtime.getRuntime().exec("cmd /c start C:\\Users\\Madiwale\\Desktop\\firstfile.bat");//address of batch file
}  
if(name==0)
{
Runtime.getRuntime().exec("cmd /c start C:\\Users\\Madiwale\\Desktop\\secondfile.bat");
}
if(name==2)
{
Runtime.getRuntime().exec("cmd /c start C:\\Users\\Madiwale\\Desktop\\thirdfile.bat");
}

}

catch(IOException ex) 
{
ex.printStackTrace();
}
}
}


/*
Imp note-

create batch file to trigger code:-
START C:\"Program Files"\Google\Chrome\Application\chrome.exe //for firstfile.bat

START C:\"Program Files"\Arduino\arduino.exe //for secondfile.bat


code for kickstart:-This will execute Openfile.java and Openfile.class file
//and imp this file must be in same folder where Openfile.java n Openfile.class present
@echo off
javac Openfile.java
java Openfile
http://iotmini.net23.net/index.txt
To make Kickstart.bat as a startup file
http://www.computerhope.com/issues/ch000322.htm
*/
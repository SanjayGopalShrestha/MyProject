/*

Note: 
====
Port should be after the "www.wikipedia.org"

getPath() method only includes:
The file/resource location on the server, in below case i.e. "/index.html" only.

If it is: 
https://www.wikipedia.org:8080/folder/index.html, then 
getPath() would be "/folder/index.html"

*/


import java.lang.*;
import java.net.URL;
import java.net.*;

public class TestURL1
{
public static void main(String[] arg) throws Exception
{
URL url = new URL("https://www.wikipedia.org:8080/index.html");
System.out.println(url.getProtocol());
System.out.println(url.getHost());
System.out.println(url.getPath());
System.out.println(url.getPort());
}
}



//hey you
import java.net.*;
import java.io.*;
import java.util.*;
//commment in client
class clnt{
public static void main(String arg[])throws Exception{
Socket s=new Socket("localhost",9999);
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
int random1=Integer.parseInt(br.readLine());
System.out.println("server sent you "+random1);
int random=random1+1;

// Decode
         byte[] random2 = Base64.getDecoder().decode(random);
		
        // System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
OutputStreamWriter os;
PrintWriter out;

os=new OutputStreamWriter(s.getOutputStream());
out=new PrintWriter(os);
os.flush();
out.println(random1);
os.flush();

Scanner sc=new Scanner(System.in);
//BufferedReader br;

while(true){
String str=sc.nextLine();

out.println(str);
os.flush();

String str1=br.readLine();
System.out.println(str1);
}
}
}

import java.net.*;
import java.io.*;
import java.util.*;
//new comment
class srvr{
public static void main(String arg[])throws Exception{
ServerSocket ss=new ServerSocket(9999);
OutputStreamWriter os;
PrintWriter out;
BufferedReader br;
Scanner sc;
Socket s=ss.accept();
System.out.println("client connnected");
Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
      int random_copy = rand_int1;

 // Encode using basic encoder
         String base64encodedString = Base64.getEncoder().encodeToString(
           rand_int1.getBytes("utf-8"));
         //System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
os=new OutputStreamWriter(s.getOutputStream());
out=new PrintWriter(os);
out.println(rand_int1);
os.flush();
br=new BufferedReader(new InputStreamReader(s.getInputStream()));


//os.flush();
int max=50,min=1;


int rc=Integer.parseInt(br.readLine());
rc=rc-1;
if(rc==random_copy+1){

System.out.println("Authentication succesfull");
}
else System.exit(0);
while(true){



String str1=br.readLine();
System.out.println(str1);

String str=sc.nextLine();
os=new OutputStreamWriter(s.getOutputStream());
out=new PrintWriter(os);
os.flush();
out.println(str);
os.flush();
}
}
}

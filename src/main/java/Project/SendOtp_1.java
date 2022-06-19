
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aishwarya
 */
public class SendOtp_1 {
    
	public static void SendOTP(String message , String number , String apiKey)
	{
		try
		{
		String sendId="TXTIND";
		String language="english";
		
		
		message=URLEncoder.encode(message,"UTF-8");    //Important Step
		
		
                String myUrl = "https://www.fast2sms.com/dev/bulkV2?authorization="+apiKey+"&sender_id=TXTIND&message="+message+"&route=v3&numbers="+number;
		URL url=new URL(myUrl);
		HttpsURLConnection con= (HttpsURLConnection)url.openConnection();
		
		con.setRequestMethod("GET");
		
		con.setRequestProperty("User-Agent","Mozilla/5.0");
		con.setRequestProperty("cache-control", "no-cache");
		
		int responseCode=  con.getResponseCode();
		
		StringBuffer response=new StringBuffer();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		while(true)
		{
			String line=br.readLine();
			
			if(line==null)
			{
				break;
			}
			
			response.append(line);
		}
		
		JOptionPane.showMessageDialog(null,"OTP sent successfully");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}       



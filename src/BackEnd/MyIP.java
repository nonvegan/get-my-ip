package BackEnd;

import FrontEnd.mainWindow;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class MyIP {
    public static void main(String[] args) {
        new mainWindow().setVisible(true);
    }
    public String getLocalIP() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }
    public String getPublicIP() throws MalformedURLException, IOException {
        URL url_name = new URL("http://bot.whatismyipaddress.com");
        BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
        return sc.readLine().trim();
    }
}

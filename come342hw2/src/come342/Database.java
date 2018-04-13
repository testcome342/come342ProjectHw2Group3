
package come342;

import java.util.ArrayList;
import java.util.List;
import Entity.Campaign;
import Entity.Client;


public class Database {
    
    public static List<Client> clientList = new ArrayList<Client>();
    public static List<Campaign> campaignList = new ArrayList<Campaign>();
    //public static List<AdminStaff> adminStaffList = new ArrayList<AdminStaff>();

    public static void init() {
    	//Dosyadan okuyacak burada
        
    	Client nestle = new Client("NESTLE", "�stanbul/�i�li", "info@nestle.com.tr", "Murat Bey", "murat@nestle.com.tr");
        Campaign nestle15 = new Campaign("NESTLE 15. YIL", "20/06/2017", "20/08/2017",1500000.00);
        nestle.addNewClientCampaign(nestle15);
        clientList.add(nestle);
        
        Client tekno = new Client("TEKNOSA", "�stanbul/Mecidiyekoy", "info@teknosa.com", "Ilg�n Han�m", "ilgin@teknosa.com");
        Campaign tekno5 = new Campaign("TEKNOSA 5. YIL", "10/06/2017", "30/08/2017",1100000.00);
        Campaign tekno10 = new Campaign("TEKNOSA YEN� YIL", "10/11/2017", "30/11/2017",3100000.00);
        tekno.addNewClientCampaign(tekno5);
        tekno.addNewClientCampaign(tekno10);
        clientList.add(tekno);
       
     
    }
}


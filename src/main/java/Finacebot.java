

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Finacebot extends TimerTask{
	final String botID= "6a1350e1f939425d6a3edb817d";
	static DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static Date date;
	
	public static void main(String[] args) {
		Date date;
		try {
			date = dateFormatter.parse("2016-09-21 07:07:00");
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			date = new Date();
		}
		Timer timer = new Timer();
		timer.schedule(new Finacebot(), date);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	    Bot bot = new Bot(botID);
	    System.out.println("sending message to group chat");
		bot.sendTextMessage(" Republican: Donald Trump used his charity to fund his legal disputes"
				+ "https://www.washingtonpost.com/politics/trump-used-258000-from-his-charity-to-settle-legal-problems/2016/09/20/adc88f9c-7d11-11e6-ac8e-cf8e0dd91dc7_story.html");
		
	}

}


public class TelcomAccountSystem {

	public static void main(String[] args) {
		
		TelcomUser telcomUser = new TelcomUser("13800138000");//实例化一个电信用户类TelcomUser
		telcomUser.generateCommunicateRecord();//生成通话记录
	
	    telcomUser.printDetails();//打印通话详单
	}

}

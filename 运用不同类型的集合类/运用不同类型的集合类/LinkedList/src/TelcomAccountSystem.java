
public class TelcomAccountSystem {

	public static void main(String[] args) {
		
		TelcomUser telcomUser = new TelcomUser("13800138000");//ʵ����һ�������û���TelcomUser
		telcomUser.generateCommunicateRecord();//����ͨ����¼
	
	    telcomUser.printDetails();//��ӡͨ���굥
	}

}

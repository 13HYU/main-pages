package ledger;

import javax.swing.JFrame;
 
public class MainProcess{
    LoginView loginView;
    MemoCalendar memoCalendar;
    Nextpage nextpage;
   
    public static void main(String[] args) {
       
        // ����Ŭ���� ����
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // �α���â ���̱�
        main.loginView.setMain(main); // �α���â���� ���� Ŭ����������
    }
   
    // �׽�Ʈ������â
    public void showFrameTest(){
        loginView.dispose(); // �α���â�ݱ�
        this.memoCalendar = new MemoCalendar(); // �׽�Ʈ������ ����
    }
    
}
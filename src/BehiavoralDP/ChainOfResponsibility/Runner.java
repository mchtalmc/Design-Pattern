package BehiavoralDP.ChainOfResponsibility;

public class Runner {
    public static void main(String[] args) {

        //Islem siniri doldugu zaman diger objeye yonlendirme imkani sagliyor.


        Approver approver= new GenelMudur();
        Approver mudur= new Mudur(approver);
        Approver memur = new Memur(mudur);


        System.out.println("500TL Kredi isteniyor");
        memur.approveLoan(500);

        System.out.println("5000 TL Kredi isteniyor");
        memur.approveLoan(5000);

        System.out.println("50000TL Kredi isteniyor");
        memur.approveLoan(50000);
    }
}

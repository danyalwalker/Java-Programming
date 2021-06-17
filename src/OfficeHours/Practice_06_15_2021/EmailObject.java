package OfficeHours.Practice_06_15_2021;

public class EmailObject {
    public static void main(String[] args) {
        Email email = new Email("hsas@kaiedon.com", 23);
        // email.ADDRESS "email"; -- won't work since it is final.
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();

        Gmail gmail = new Gmail("skdh@gmail.com",12);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("Jackychan@gmail.com", 43);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Email email2 = new Email("hayda@fkj.com",23);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Yahoo.domain = "generic";
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);

        Email.sendEmail();
        Gmail.sendEmail();
        Yahoo.sendEmail();

    }


}

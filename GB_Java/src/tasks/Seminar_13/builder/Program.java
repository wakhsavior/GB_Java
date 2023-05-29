package tasks.Seminar_13.builder;

public class Program {

    public static void main(String[] args) {
        MailMessage mailMessage = new MailMessage();
        mailMessage.setTo("aaaa");
        mailMessage.setFrom("asdasd");
        mailMessage.setSubject("adasdsad");
        MailMessage mailMessage1 = new MailMessageBuilder()
                .setBody("body")
                .setFrom("from")
                .setSubject("subject")
//                .setTo("To")
                .build();
    }
}

package tasks.Seminar_12.isp;

/**
 * Старый сервис, не используется
 */

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);
}

package src;

import src.exceprions.WrongAccountException;
import src.exceprions.WrongCurrencyException;
import src.exceprions.WrongOperationException;
public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException | WrongOperationException | WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз!");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException | WrongOperationException | WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз!");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException | WrongOperationException | WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз!");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException | WrongOperationException | WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз!");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException | WrongOperationException | WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка при процесінгу, спробуйте ще раз!");
        } finally {
            System.out.println("Дякуємо, що скористалися нашим сервісом");
        }
    }
}

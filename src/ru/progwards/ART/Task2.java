
package ru.progwards.ART;

public class Task2 {

        public static void printJava() {
                String str1="Хорошо идут дела";
                String str2="Изучаю Java я!";
                String str3=" ";

                System.out.println(str1);
                System.out.println(str2);
                System.out.println(str1+str3+str2);
                System.out.println(str2+str3+str1);
        }
        public static int subtraction(int x, int y){

                System.out.print("Вызвана функция subtraction() с параметрами x = "+x);
                System.out.println(", y = "+y);
                return x-y;
        }
        public static int addition(int x, int y){

                System.out.print("Вызвана функция addition() с параметрами x = "+x);
                System.out.println(", y = "+y);
                return x+y;
        }
        public static int multiplication(int x, int y){

                System.out.print("Вызвана функция multiplication() с параметрами x = "+x);
                System.out.println(", y = "+y);
                return x*y;
        }
        public static void calculation(){
                int a=34;
                int b=55;
                int c;

                System.out.println("a = " + a);
                System.out.println("b = " + b);
                int summ = addition(a,b);
                System.out.println("a + b = "+summ);

                int raz = subtraction (a, b);
                System.out.println("a - b = "+raz);

                int prz = multiplication(a,b);
                System.out.println("a * b = "+prz);
        }
        public static void main(String[] args) {

                Task2.printJava();

                Task2.subtraction(45,12);
                Task2.subtraction(23,55);

                Task2.addition(128,787);
                Task2.addition(528,387);

                Task2.multiplication(124,87);
                Task2.multiplication(1528,3);

                Task2.calculation();}}
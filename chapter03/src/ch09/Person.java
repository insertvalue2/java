package ch09;

//사람 스래드
public class Person extends Thread {

   @Override
   public void run() {
        for (int i=0; i< 10; i++){
             System.out.println("Sub Thread 일 시작: "+ i);
        }
   }
}


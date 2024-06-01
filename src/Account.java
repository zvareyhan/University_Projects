  public class Account {
        // Fields
        private String owner;      // Owner's name
        private int balance;       // Account balance
        private String accountNumber;  // Account number

        // Constructor
        public Account(String owner, int balance, String accountNumber) {
            this.owner = owner;
            this.balance = balance;
             this.accountNumber = accountNumber;
        }

        // Getters and setters
        public string getOwner() {
            return owner ;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
        public. void
        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }
    }

}






        package pl.vistula.multithreads;

  public class Priority implements Runnable {
      int count;
      Thread thread;
      static boolean stop = false;
      static String currentName;

      Priority(String name) {
          thread = new Thread(this, name);
          count = 0;
          currentName = name;
      }

      public void run() {
          System.out.println(thread.getName() + " starts to operate");
          do {
              count++;
              if (currentName.compareTo(thread.getName()) != 0) {
                  currentName = thread.getName();
                  System.out.println(currentName + " is executed");
              }
          } while (!stop && count < 10_000_000);
          stop = true;
          System.out.println("\n" + thread.getName() + " finishes running");
      }

      public static void main(String[] args) {
          for (int i = 0; i < 10; i++) {
              Priority mt1 = new Priority("High priority thread");
              Priority mt2 = new Priority("Thread with low priority");

              mt1.thread.setPriority(Thread.MAX_PRIORITY);
              mt2.thread.setPriority(Thread.MIN_PRIORITY);

              mt1.thread.start();
              mt2.thread.start();

              try {
                  mt1.thread.join();
                  mt2.thread.join();
              } catch (InterruptedException e) {
                  System.out.println("The main thread starts running");
              }

              System.out.println("\nIteration " + (i + 1));
              System.out.println("High priority thread counted to " + mt1.count);
              System.out.println("Low priority thread counted to " + mt2.count);
              System.out.println("==================================================");
          }
      }
  }


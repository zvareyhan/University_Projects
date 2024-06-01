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
            ytyuj person = new ytyuj();
            person.initialize();
            System.out.println("Details Entered:");
            person.print();
        }
    }




